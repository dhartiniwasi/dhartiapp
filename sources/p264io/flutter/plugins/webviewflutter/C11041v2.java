package p264io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;
import android.webkit.WebView;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.v2 */
/* compiled from: WebSettingsHostApiImpl */
public class C11041v2 implements C10940k.C10972u {

    /* renamed from: a */
    private final C10932i2 f42628a;

    /* renamed from: b */
    private final C11042a f42629b;

    /* renamed from: io.flutter.plugins.webviewflutter.v2$a */
    /* compiled from: WebSettingsHostApiImpl */
    public static class C11042a {
        /* renamed from: a */
        public WebSettings mo34804a(WebView webView) {
            return webView.getSettings();
        }
    }

    public C11041v2(C10932i2 i2Var, C11042a aVar) {
        this.f42628a = i2Var;
        this.f42629b = aVar;
    }

    /* renamed from: a */
    public void mo34738a(Long l) {
        this.f42628a.mo34672k(l.longValue());
    }

    /* renamed from: b */
    public void mo34739b(Long l, Long l2) {
        this.f42628a.mo34667b(this.f42629b.mo34804a((WebView) this.f42628a.mo34671h(l2.longValue())), l.longValue());
    }

    /* renamed from: c */
    public void mo34740c(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setDomStorageEnabled(bool.booleanValue());
    }

    /* renamed from: d */
    public void mo34741d(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setDisplayZoomControls(bool.booleanValue());
    }

    /* renamed from: e */
    public void mo34742e(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setSupportMultipleWindows(bool.booleanValue());
    }

    /* renamed from: f */
    public void mo34743f(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setAllowFileAccess(bool.booleanValue());
    }

    /* renamed from: g */
    public void mo34744g(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setLoadWithOverviewMode(bool.booleanValue());
    }

    /* renamed from: h */
    public void mo34745h(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setUseWideViewPort(bool.booleanValue());
    }

    /* renamed from: i */
    public void mo34746i(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setJavaScriptEnabled(bool.booleanValue());
    }

    /* renamed from: j */
    public void mo34747j(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setMediaPlaybackRequiresUserGesture(bool.booleanValue());
    }

    /* renamed from: k */
    public void mo34748k(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setSupportZoom(bool.booleanValue());
    }

    /* renamed from: l */
    public void mo34749l(Long l, String str) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setUserAgentString(str);
    }

    /* renamed from: m */
    public void mo34750m(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setJavaScriptCanOpenWindowsAutomatically(bool.booleanValue());
    }

    /* renamed from: n */
    public void mo34751n(Long l, Boolean bool) {
        ((WebSettings) this.f42628a.mo34671h(l.longValue())).setBuiltInZoomControls(bool.booleanValue());
    }
}
