package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.C0574a;
import androidx.browser.customtabs.C0576b;
import androidx.browser.customtabs.C0584d;
import androidx.browser.customtabs.C0588f;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview.types.CustomTabsMenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

public class ChromeCustomTabsActivity extends Activity implements C6556k.C6560c {
    protected static final String LOG_TAG = "CustomTabsActivity";
    protected final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    public CustomTabsActionButton actionButton;
    public C0584d.C0585a builder;
    public C6556k channel;
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    public C0588f customTabsSession;

    /* renamed from: id */
    public String f36270id;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();
    protected boolean onChromeSafariBrowserCompletedInitialLoad = false;
    protected boolean onChromeSafariBrowserOpened = false;
    public ChromeCustomTabsOptions options;

    private PendingIntent createPendingIntent(int i) {
        if (this.manager == null) {
            return null;
        }
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f36270id);
        bundle.putString(ActionBroadcastReceiver.CHROME_MANAGER_ID, this.manager.f36271id);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast(this, i, intent, 167772160);
        }
        return PendingIntent.getBroadcast(this, i, intent, 134217728);
    }

    private void prepareCustomTabs() {
        ChromeCustomTabsOptions chromeCustomTabsOptions = this.options;
        Boolean bool = chromeCustomTabsOptions.addDefaultShareMenuItem;
        if (bool != null) {
            this.builder.mo2693h(bool.booleanValue() ? 1 : 2);
        } else {
            this.builder.mo2693h(chromeCustomTabsOptions.shareState.intValue());
        }
        String str = this.options.toolbarBackgroundColor;
        if (str != null && !str.isEmpty()) {
            this.builder.mo2690d(new C0574a.C0575a().mo2666b(Color.parseColor(this.options.toolbarBackgroundColor)).mo2665a());
        }
        this.builder.mo2694i(this.options.showTitle.booleanValue());
        this.builder.mo2695j(this.options.enableUrlBarHiding.booleanValue());
        this.builder.mo2691e(this.options.instantAppsEnabled.booleanValue());
        for (CustomTabsMenuItem next : this.menuItems) {
            PendingIntent createPendingIntent = createPendingIntent(next.getId());
            if (createPendingIntent != null) {
                this.builder.mo2687a(next.getLabel(), createPendingIntent);
            }
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inMutable = true;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options2);
            PendingIntent createPendingIntent2 = createPendingIntent(this.actionButton.getId());
            if (createPendingIntent2 != null) {
                this.builder.mo2689c(decodeByteArray, this.actionButton.getDescription(), createPendingIntent2, this.actionButton.isShouldTint());
            }
        }
    }

    private void prepareCustomTabsIntent(C0584d dVar) {
        String str = this.options.packageName;
        if (str != null) {
            dVar.f1914a.setPackage(str);
        } else {
            dVar.f1914a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.options.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, dVar.f1914a);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        this.channel.mo22159c("onChromeSafariBrowserClosed", new HashMap());
    }

    public void customTabsConnected() {
        this.customTabsSession = this.customTabActivityHelper.getSession();
        Uri parse = Uri.parse(this.initialUrl);
        this.customTabActivityHelper.mayLaunchUrl(parse, (Bundle) null, (List<Bundle>) null);
        this.builder = new C0584d.C0585a(this.customTabsSession);
        prepareCustomTabs();
        C0584d b = this.builder.mo2688b();
        prepareCustomTabsIntent(b);
        CustomTabActivityHelper.openCustomTab((Activity) this, b, parse, 100);
    }

    public void dispose() {
        onStop();
        onDestroy();
        this.channel.mo22161e((C6556k.C6560c) null);
        this.manager = null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            close();
            dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        C6539c cVar;
        super.onCreate(bundle);
        setContentView(C8710R.C8713layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f36270id = extras.getString("id");
            ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = chromeSafariBrowserManager;
            if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (cVar = inAppWebViewFlutterPlugin.messenger) != null) {
                C6556k kVar = new C6556k(cVar, "com.pichillilorenzo/flutter_chromesafaribrowser_" + this.f36270id);
                this.channel = kVar;
                kVar.mo22161e(this);
                this.initialUrl = extras.getString("url");
                ChromeCustomTabsOptions chromeCustomTabsOptions = new ChromeCustomTabsOptions();
                this.options = chromeCustomTabsOptions;
                chromeCustomTabsOptions.parse((Map) extras.getSerializable("options"));
                this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
                for (Map fromMap : (List) extras.getSerializable("menuItemList")) {
                    this.menuItems.add(CustomTabsMenuItem.fromMap(fromMap));
                }
                this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() {
                    public void onCustomTabsConnected() {
                        ChromeCustomTabsActivity.this.customTabsConnected();
                    }

                    public void onCustomTabsDisconnected() {
                        this.close();
                        ChromeCustomTabsActivity.this.dispose();
                    }
                });
                this.customTabActivityHelper.setCustomTabsCallback(new C0576b() {
                    public void extraCallback(String str, Bundle bundle) {
                    }

                    public void onMessageChannelReady(Bundle bundle) {
                    }

                    public void onNavigationEvent(int i, Bundle bundle) {
                        if (i == 5) {
                            ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                            if (!chromeCustomTabsActivity.onChromeSafariBrowserOpened) {
                                chromeCustomTabsActivity.onChromeSafariBrowserOpened = true;
                                ChromeCustomTabsActivity.this.channel.mo22159c("onChromeSafariBrowserOpened", new HashMap());
                            }
                        }
                        if (i == 2) {
                            ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                            if (!chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad) {
                                chromeCustomTabsActivity2.onChromeSafariBrowserCompletedInitialLoad = true;
                                ChromeCustomTabsActivity.this.channel.mo22159c("onChromeSafariBrowserCompletedInitialLoad", new HashMap());
                            }
                        }
                    }

                    public void onPostMessage(String str, Bundle bundle) {
                    }

                    public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                    }
                });
            }
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        String str = jVar.f30999a;
        str.hashCode();
        if (!str.equals("close")) {
            dVar.notImplemented();
            return;
        }
        onStop();
        onDestroy();
        close();
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (!(chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.activity == null)) {
            Activity activity = this.manager.plugin.activity;
            Intent intent = new Intent(activity, activity.getClass());
            intent.addFlags(67108864);
            intent.addFlags(536870912);
            this.manager.plugin.activity.startActivity(intent);
        }
        dispose();
        dVar.success(Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.customTabActivityHelper.bindCustomTabsService(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
    }
}
