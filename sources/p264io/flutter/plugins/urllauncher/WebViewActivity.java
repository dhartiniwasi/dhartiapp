package p264io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.flutter.plugins.urllauncher.WebViewActivity */
public class WebViewActivity extends Activity {

    /* renamed from: e */
    public static String f42429e = "close action";

    /* renamed from: f */
    private static String f42430f = "url";

    /* renamed from: g */
    private static String f42431g = "enableJavaScript";

    /* renamed from: h */
    private static String f42432h = "enableDomStorage";

    /* renamed from: a */
    private final BroadcastReceiver f42433a = new C10879a();

    /* renamed from: b */
    private final WebViewClient f42434b = new C10880b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f42435c;

    /* renamed from: d */
    private IntentFilter f42436d = new IntentFilter(f42429e);

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$a */
    class C10879a extends BroadcastReceiver {
        C10879a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f42429e.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c */
    private class C10881c extends WebChromeClient {

        /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$c$a */
        class C10882a extends WebViewClient {
            C10882a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f42435c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f42435c.loadUrl(str);
                return true;
            }
        }

        private C10881c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            C10882a aVar = new C10882a();
            WebView webView2 = new WebView(WebViewActivity.this.f42435c.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        /* synthetic */ C10881c(WebViewActivity webViewActivity, C10879a aVar) {
            this();
        }
    }

    /* renamed from: b */
    public static Intent m54285b(Context context, String str, boolean z, boolean z2, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra(f42430f, str).putExtra(f42431g, z).putExtra(f42432h, z2).putExtra("com.android.browser.headers", bundle);
    }

    /* renamed from: c */
    public static Map<String, String> m54286c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f42435c = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f42430f);
        boolean booleanExtra = intent.getBooleanExtra(f42431g, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f42432h, false);
        this.f42435c.loadUrl(stringExtra, m54286c(intent.getBundleExtra("com.android.browser.headers")));
        this.f42435c.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f42435c.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f42435c.setWebViewClient(this.f42434b);
        this.f42435c.getSettings().setSupportMultipleWindows(true);
        this.f42435c.setWebChromeClient(new C10881c(this, (C10879a) null));
        registerReceiver(this.f42433a, this.f42436d);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f42433a);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f42435c.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f42435c.goBack();
        return true;
    }

    /* renamed from: io.flutter.plugins.urllauncher.WebViewActivity$b */
    class C10880b extends WebViewClient {
        C10880b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }
}
