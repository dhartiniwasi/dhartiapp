package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.SearchView;
import androidx.appcompat.app.C0275a;
import androidx.appcompat.app.C0282d;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewOptions;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshOptions;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6556k;
import p360tb.C12590c;

public class InAppBrowserActivity extends C0282d implements InAppBrowserDelegate {
    static final String LOG_TAG = "InAppBrowserActivity";
    public C0275a actionBar;
    private List<ActivityResultListener> activityResultListeners = new ArrayList();
    public C6556k channel;
    public String fromActivity;

    /* renamed from: id */
    public String f36275id;
    public boolean isHidden = false;
    public InAppBrowserManager manager;
    public Menu menu;
    public InAppWebViewMethodHandler methodCallDelegate;
    public InAppBrowserOptions options = new InAppBrowserOptions();
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;

    private void prepareView() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.prepare();
        }
        if (this.options.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        this.progressBar = (ProgressBar) findViewById(C8710R.C8712id.progressBar);
        if (this.options.hideProgressBar.booleanValue()) {
            this.progressBar.setMax(0);
        } else {
            this.progressBar.setMax(100);
        }
        C0275a aVar = this.actionBar;
        if (aVar != null) {
            aVar.mo856u(!this.options.hideTitleBar.booleanValue());
            if (this.options.hideToolbarTop.booleanValue()) {
                this.actionBar.mo846k();
            }
            String str = this.options.toolbarTopBackgroundColor;
            if (str != null && !str.isEmpty()) {
                this.actionBar.mo854s(new ColorDrawable(Color.parseColor(this.options.toolbarTopBackgroundColor)));
            }
            String str2 = this.options.toolbarTopFixedTitle;
            if (str2 != null && !str2.isEmpty()) {
                this.actionBar.mo858w(this.options.toolbarTopFixedTitle);
            }
        }
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void close(C6556k.C6561d dVar) {
        HashMap hashMap = new HashMap();
        C6556k kVar = this.channel;
        if (kVar != null) {
            kVar.mo22159c("onExit", hashMap);
        }
        dispose();
        if (dVar != null) {
            dVar.success(Boolean.TRUE);
        }
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close((C6556k.C6561d) null);
    }

    public void didChangeProgress(int i) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.progressBar.setProgress(i, true);
            } else {
                this.progressBar.setProgress(i);
            }
            if (i == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    public void didChangeTitle(String str) {
        if (this.actionBar != null) {
            String str2 = this.options.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                this.actionBar.mo858w(str);
            }
        }
    }

    public void didFailNavigation(String str, int i, String str2) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didFinishNavigation(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didStartNavigation(String str) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void didUpdateVisitedHistory(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        C12590c cVar;
        C6556k kVar = this.channel;
        if (kVar != null) {
            kVar.mo22161e((C6556k.C6560c) null);
            this.channel = null;
        }
        this.activityResultListeners.clear();
        InAppWebViewMethodHandler inAppWebViewMethodHandler = this.methodCallDelegate;
        if (inAppWebViewMethodHandler != null) {
            inAppWebViewMethodHandler.dispose();
            this.methodCallDelegate = null;
        }
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            InAppBrowserManager inAppBrowserManager = this.manager;
            if (!(inAppBrowserManager == null || (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) == null || (cVar = inAppWebViewFlutterPlugin.activityPluginBinding) == null)) {
                cVar.mo34116f(inAppWebView.inAppWebViewChromeClient);
            }
            ViewGroup viewGroup = (ViewGroup) this.webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.webView);
            }
            this.webView.setWebChromeClient(new WebChromeClient());
            this.webView.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    InAppBrowserActivity.this.webView.dispose();
                    InAppBrowserActivity.this.webView.destroy();
                    InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                    inAppBrowserActivity.webView = null;
                    inAppBrowserActivity.manager = null;
                }
            });
            this.webView.loadUrl("about:blank");
            finish();
        }
    }

    public Activity getActivity() {
        return this;
    }

    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public Map<String, Object> getOptions() {
        InAppWebView inAppWebView = this.webView;
        Map<String, Object> options2 = inAppWebView != null ? inAppWebView.getOptions() : null;
        InAppBrowserOptions inAppBrowserOptions = this.options;
        if (inAppBrowserOptions == null || options2 == null) {
            return null;
        }
        Map<String, Object> realOptions = inAppBrowserOptions.getRealOptions(this);
        realOptions.putAll(options2);
        return realOptions;
    }

    public void goBack() {
        if (this.webView != null && canGoBack()) {
            this.webView.goBack();
        }
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForward() {
        if (this.webView != null && canGoForward()) {
            this.webView.goForward();
        }
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void hide() {
        if (this.fromActivity != null) {
            try {
                this.isHidden = true;
                Intent intent = new Intent(this, Class.forName(this.fromActivity));
                intent.setFlags(131072);
                startActivityIfNeeded(intent, 0);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                Log.d(LOG_TAG, e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        for (ActivityResultListener onActivityResult : this.activityResultListeners) {
            if (onActivityResult.onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBrowserCreated() {
        HashMap hashMap = new HashMap();
        C6556k kVar = this.channel;
        if (kVar != null) {
            kVar.mo22159c("onBrowserCreated", hashMap);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f36275id = extras.getString("id");
            InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = inAppBrowserManager;
            if (inAppBrowserManager != null && (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) != null && inAppWebViewFlutterPlugin.messenger != null) {
                Map map = (Map) extras.getSerializable("options");
                this.options.parse(map);
                this.windowId = Integer.valueOf(extras.getInt("windowId"));
                C6539c cVar = this.manager.plugin.messenger;
                this.channel = new C6556k(cVar, "com.pichillilorenzo/flutter_inappbrowser_" + this.f36275id);
                setContentView(C8710R.C8713layout.activity_web_view);
                C6539c cVar2 = this.manager.plugin.messenger;
                C6556k kVar = new C6556k(cVar2, "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_" + this.f36275id);
                PullToRefreshOptions pullToRefreshOptions = new PullToRefreshOptions();
                pullToRefreshOptions.parse((Map) extras.getSerializable("pullToRefreshInitialOptions"));
                PullToRefreshLayout pullToRefreshLayout2 = (PullToRefreshLayout) findViewById(C8710R.C8712id.pullToRefresh);
                this.pullToRefreshLayout = pullToRefreshLayout2;
                pullToRefreshLayout2.channel = kVar;
                pullToRefreshLayout2.options = pullToRefreshOptions;
                pullToRefreshLayout2.prepare();
                InAppWebView inAppWebView = (InAppWebView) findViewById(C8710R.C8712id.webView);
                this.webView = inAppWebView;
                inAppWebView.windowId = this.windowId;
                inAppWebView.inAppBrowserDelegate = this;
                inAppWebView.channel = this.channel;
                inAppWebView.plugin = this.manager.plugin;
                InAppWebViewMethodHandler inAppWebViewMethodHandler = new InAppWebViewMethodHandler(inAppWebView);
                this.methodCallDelegate = inAppWebViewMethodHandler;
                this.channel.mo22161e(inAppWebViewMethodHandler);
                this.fromActivity = extras.getString("fromActivity");
                List<Map> list = (List) extras.getSerializable("initialUserScripts");
                InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
                inAppWebViewOptions.parse(map);
                InAppWebView inAppWebView2 = this.webView;
                inAppWebView2.options = inAppWebViewOptions;
                inAppWebView2.contextMenu = (Map) extras.getSerializable("contextMenu");
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Map fromMap : list) {
                        arrayList.add(UserScript.fromMap(fromMap));
                    }
                }
                this.webView.userContentController.addUserOnlyScripts(arrayList);
                this.actionBar = getSupportActionBar();
                prepareView();
                if (this.windowId.intValue() != -1) {
                    Message message = InAppWebViewChromeClient.windowWebViewMessages.get(this.windowId);
                    if (message != null) {
                        ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                        message.sendToTarget();
                    }
                } else {
                    String string = extras.getString("initialFile");
                    Map map2 = (Map) extras.getSerializable("initialUrlRequest");
                    String string2 = extras.getString("initialData");
                    if (string != null) {
                        try {
                            this.webView.loadFile(string);
                        } catch (IOException e) {
                            e.printStackTrace();
                            Log.e(LOG_TAG, string + " asset file cannot be found!", e);
                            return;
                        }
                    } else if (string2 != null) {
                        String string3 = extras.getString("initialMimeType");
                        String string4 = extras.getString("initialEncoding");
                        this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, string3, string4, extras.getString("initialHistoryUrl"));
                    } else if (map2 != null) {
                        this.webView.loadUrl(URLRequest.fromMap(map2));
                    }
                }
                onBrowserCreated();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        String str;
        this.menu = menu2;
        String str2 = "";
        if (this.actionBar != null && ((str = this.options.toolbarTopFixedTitle) == null || str.isEmpty())) {
            C0275a aVar = this.actionBar;
            InAppWebView inAppWebView = this.webView;
            aVar.mo858w(inAppWebView != null ? inAppWebView.getTitle() : str2);
        }
        if (this.menu == null) {
            return super.onCreateOptionsMenu(menu2);
        }
        getMenuInflater().inflate(C8710R.C8714menu.menu_main, this.menu);
        MenuItem findItem = this.menu.findItem(C8710R.C8712id.menu_search);
        if (findItem != null) {
            if (this.options.hideUrlBar.booleanValue()) {
                findItem.setVisible(false);
            }
            SearchView searchView2 = (SearchView) findItem.getActionView();
            this.searchView = searchView2;
            if (searchView2 != null) {
                searchView2.setFocusable(true);
                SearchView searchView3 = this.searchView;
                InAppWebView inAppWebView2 = this.webView;
                if (inAppWebView2 != null) {
                    str2 = inAppWebView2.getUrl();
                }
                searchView3.setQuery(str2, false);
                this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    public boolean onQueryTextChange(String str) {
                        return false;
                    }

                    public boolean onQueryTextSubmit(String str) {
                        if (str.isEmpty()) {
                            return false;
                        }
                        InAppWebView inAppWebView = InAppBrowserActivity.this.webView;
                        if (inAppWebView != null) {
                            inAppWebView.loadUrl(str);
                        }
                        SearchView searchView = InAppBrowserActivity.this.searchView;
                        if (searchView != null) {
                            searchView.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                        return true;
                    }
                });
                this.searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                    public boolean onClose() {
                        SearchView searchView = InAppBrowserActivity.this.searchView;
                        if (searchView != null && searchView.getQuery().toString().isEmpty()) {
                            InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                            SearchView searchView2 = inAppBrowserActivity.searchView;
                            InAppWebView inAppWebView = inAppBrowserActivity.webView;
                            searchView2.setQuery(inAppWebView != null ? inAppWebView.getUrl() : "", false);
                        }
                        return false;
                    }
                });
                this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
                    public void onFocusChange(View view, boolean z) {
                        SearchView searchView;
                        if (!z && (searchView = InAppBrowserActivity.this.searchView) != null) {
                            searchView.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                    }
                });
            }
        }
        return true;
    }

    public void onDestroy() {
        dispose();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                close((C6556k.C6561d) null);
                return true;
            } else if (this.options.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.options.closeOnCannotGoBack.booleanValue()) {
                    close((C6556k.C6561d) null);
                }
                return true;
            } else if (!this.options.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void setOptions(InAppBrowserOptions inAppBrowserOptions, HashMap<String, Object> hashMap) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse((Map) hashMap);
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.setOptions(inAppWebViewOptions, hashMap);
        }
        if (!(hashMap.get("hidden") == null || this.options.hidden == (bool5 = inAppBrowserOptions.hidden))) {
            if (bool5.booleanValue()) {
                hide();
            } else {
                show();
            }
        }
        if (!(hashMap.get("hideProgressBar") == null || this.options.hideProgressBar == (bool4 = inAppBrowserOptions.hideProgressBar) || this.progressBar == null)) {
            if (bool4.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        if (!(this.actionBar == null || hashMap.get("hideTitleBar") == null || this.options.hideTitleBar == (bool3 = inAppBrowserOptions.hideTitleBar))) {
            this.actionBar.mo856u(!bool3.booleanValue());
        }
        if (!(this.actionBar == null || hashMap.get("hideToolbarTop") == null || this.options.hideToolbarTop == (bool2 = inAppBrowserOptions.hideToolbarTop))) {
            if (bool2.booleanValue()) {
                this.actionBar.mo846k();
            } else {
                this.actionBar.mo860y();
            }
        }
        if (this.actionBar != null && hashMap.get("toolbarTopBackgroundColor") != null && !Util.objEquals(this.options.toolbarTopBackgroundColor, inAppBrowserOptions.toolbarTopBackgroundColor) && !inAppBrowserOptions.toolbarTopBackgroundColor.isEmpty()) {
            this.actionBar.mo854s(new ColorDrawable(Color.parseColor(inAppBrowserOptions.toolbarTopBackgroundColor)));
        }
        if (this.actionBar != null && hashMap.get("toolbarTopFixedTitle") != null && !Util.objEquals(this.options.toolbarTopFixedTitle, inAppBrowserOptions.toolbarTopFixedTitle) && !inAppBrowserOptions.toolbarTopFixedTitle.isEmpty()) {
            this.actionBar.mo858w(inAppBrowserOptions.toolbarTopFixedTitle);
        }
        if (!(this.menu == null || hashMap.get("hideUrlBar") == null || this.options.hideUrlBar == (bool = inAppBrowserOptions.hideUrlBar))) {
            if (bool.booleanValue()) {
                this.menu.findItem(C8710R.C8712id.menu_search).setVisible(false);
            } else {
                this.menu.findItem(C8710R.C8712id.menu_search).setVisible(true);
            }
        }
        this.options = inAppBrowserOptions;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        InAppWebView inAppWebView = this.webView;
        intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : "");
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }
}
