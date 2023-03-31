package p264io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugins.webviewflutter.C10904e;
import p264io.flutter.plugins.webviewflutter.C10940k;
import p264io.flutter.plugins.webviewflutter.C11026s2;
import p264io.flutter.plugins.webviewflutter.C11055y2;

/* renamed from: io.flutter.plugins.webviewflutter.q3 */
/* compiled from: WebViewHostApiImpl */
public class C11014q3 implements C10940k.C10946c0 {

    /* renamed from: a */
    private final C10932i2 f42594a;

    /* renamed from: b */
    private final C11018d f42595b;

    /* renamed from: c */
    private final View f42596c;

    /* renamed from: d */
    private Context f42597d;

    /* renamed from: io.flutter.plugins.webviewflutter.q3$a */
    /* compiled from: WebViewHostApiImpl */
    public static class C11015a extends C10920g2 implements C10731f, C11008p2 {

        /* renamed from: d */
        private final C11016b<C11055y2.C11056a> f42598d = new C11016b<>();

        /* renamed from: e */
        private final C11016b<C10904e.C10906b> f42599e = new C11016b<>();

        /* renamed from: f */
        private final C11016b<C11026s2.C11028b> f42600f = new C11016b<>();

        /* renamed from: g */
        private final Map<String, C11016b<C10991m2>> f42601g = new HashMap();

        public C11015a(Context context, View view) {
            super(context, view);
        }

        /* renamed from: a */
        public void mo34648a() {
            this.f42598d.mo34785b();
            this.f42599e.mo34785b();
            this.f42600f.mo34785b();
            for (C11016b<C10991m2> b : this.f42601g.values()) {
                b.mo34785b();
            }
            this.f42601g.clear();
        }

        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof C10991m2) {
                C11016b bVar = this.f42601g.get(str);
                if (!(bVar == null || bVar.mo34784a() == obj)) {
                    bVar.mo34785b();
                }
                this.f42601g.put(str, new C11016b((C10991m2) obj));
            }
        }

        public /* bridge */ /* synthetic */ boolean checkInputConnectionProxy(View view) {
            return super.checkInputConnectionProxy(view);
        }

        public /* bridge */ /* synthetic */ void clearFocus() {
            super.clearFocus();
        }

        public void dispose() {
            super.dispose();
            destroy();
        }

        public View getView() {
            return this;
        }

        public void onFlutterViewAttached(View view) {
            setContainerView(view);
        }

        public void onFlutterViewDetached() {
            setContainerView((View) null);
        }

        public void onInputConnectionLocked() {
            mo34655d();
        }

        public void onInputConnectionUnlocked() {
            mo34657f();
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f42601g.get(str).mo34785b();
            this.f42601g.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f42599e.mo34786c((C10904e.C10906b) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f42600f.mo34786c((C11026s2.C11028b) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f42598d.mo34786c((C11055y2.C11056a) webViewClient);
            C11026s2.C11028b a = this.f42600f.mo34784a();
            if (a != null) {
                a.mo34799h(webViewClient);
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.q3$b */
    /* compiled from: WebViewHostApiImpl */
    private static class C11016b<T extends C11008p2> {

        /* renamed from: a */
        private T f42602a;

        C11016b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public T mo34784a() {
            return this.f42602a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo34785b() {
            T t = this.f42602a;
            if (t != null) {
                t.mo34648a();
            }
            this.f42602a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo34786c(T t) {
            mo34785b();
            this.f42602a = t;
        }

        C11016b(T t) {
            this.f42602a = t;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.q3$c */
    /* compiled from: WebViewHostApiImpl */
    public static class C11017c extends WebView implements C10731f, C11008p2 {

        /* renamed from: a */
        private final C11016b<C11055y2.C11056a> f42603a = new C11016b<>();

        /* renamed from: b */
        private final C11016b<C10904e.C10906b> f42604b = new C11016b<>();

        /* renamed from: c */
        private final C11016b<C11026s2.C11028b> f42605c = new C11016b<>();

        /* renamed from: d */
        private final Map<String, C11016b<C10991m2>> f42606d = new HashMap();

        public C11017c(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo34648a() {
            this.f42603a.mo34785b();
            this.f42604b.mo34785b();
            this.f42605c.mo34785b();
            for (C11016b<C10991m2> b : this.f42606d.values()) {
                b.mo34785b();
            }
            this.f42606d.clear();
        }

        public void addJavascriptInterface(Object obj, String str) {
            super.addJavascriptInterface(obj, str);
            if (obj instanceof C10991m2) {
                C11016b bVar = this.f42606d.get(str);
                if (!(bVar == null || bVar.mo34784a() == obj)) {
                    bVar.mo34785b();
                }
                this.f42606d.put(str, new C11016b((C10991m2) obj));
            }
        }

        public void dispose() {
            destroy();
        }

        public View getView() {
            return this;
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            C10730e.m53693a(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            C10730e.m53694b(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            C10730e.m53695c(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            C10730e.m53696d(this);
        }

        public void removeJavascriptInterface(String str) {
            super.removeJavascriptInterface(str);
            this.f42606d.get(str).mo34785b();
            this.f42606d.remove(str);
        }

        public void setDownloadListener(DownloadListener downloadListener) {
            super.setDownloadListener(downloadListener);
            this.f42604b.mo34786c((C10904e.C10906b) downloadListener);
        }

        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            this.f42605c.mo34786c((C11026s2.C11028b) webChromeClient);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f42603a.mo34786c((C11055y2.C11056a) webViewClient);
            C11026s2.C11028b a = this.f42605c.mo34784a();
            if (a != null) {
                a.mo34799h(webViewClient);
            }
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.q3$d */
    /* compiled from: WebViewHostApiImpl */
    public static class C11018d {
        /* renamed from: a */
        public C11015a mo34792a(Context context, View view) {
            return new C11015a(context, view);
        }

        /* renamed from: b */
        public C11017c mo34793b(Context context) {
            return new C11017c(context);
        }

        /* renamed from: c */
        public void mo34794c(boolean z) {
            WebView.setWebContentsDebuggingEnabled(z);
        }
    }

    public C11014q3(C10932i2 i2Var, C11018d dVar, Context context, View view) {
        this.f42594a = i2Var;
        this.f42595b = dVar;
        this.f42597d = context;
        this.f42596c = view;
    }

    /* renamed from: A */
    public void mo34676A(Long l, Long l2) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).setWebViewClient((WebViewClient) this.f42594a.mo34671h(l2.longValue()));
    }

    /* renamed from: B */
    public void mo34778B(Context context) {
        this.f42597d = context;
    }

    /* renamed from: a */
    public void mo34677a(Long l) {
        WebView webView = (WebView) this.f42594a.mo34671h(l.longValue());
        if (webView != null) {
            ((C11008p2) webView).mo34648a();
            this.f42594a.mo34672k(l.longValue());
        }
    }

    /* renamed from: b */
    public void mo34678b(Long l, Boolean bool) {
        Object obj;
        C10893c cVar = new C10893c();
        DisplayManager displayManager = (DisplayManager) this.f42597d.getSystemService("display");
        cVar.mo34640b(displayManager);
        if (bool.booleanValue()) {
            obj = this.f42595b.mo34793b(this.f42597d);
        } else {
            obj = this.f42595b.mo34792a(this.f42597d, this.f42596c);
        }
        cVar.mo34639a(displayManager);
        this.f42594a.mo34667b(obj, l.longValue());
    }

    /* renamed from: c */
    public Long mo34679c(Long l) {
        return Long.valueOf((long) ((WebView) this.f42594a.mo34671h(l.longValue())).getScrollX());
    }

    /* renamed from: d */
    public void mo34680d(Long l, String str, String str2, String str3) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).loadData(str, str2, str3);
    }

    /* renamed from: e */
    public void mo34681e(Long l, Long l2) {
        C10991m2 m2Var = (C10991m2) this.f42594a.mo34671h(l2.longValue());
        ((WebView) this.f42594a.mo34671h(l.longValue())).addJavascriptInterface(m2Var, m2Var.f42559b);
    }

    /* renamed from: f */
    public void mo34682f(Boolean bool) {
        this.f42595b.mo34794c(bool.booleanValue());
    }

    /* renamed from: g */
    public void mo34683g(Long l, Long l2) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).setWebChromeClient((WebChromeClient) this.f42594a.mo34671h(l2.longValue()));
    }

    /* renamed from: h */
    public void mo34684h(Long l) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).goForward();
    }

    /* renamed from: i */
    public void mo34685i(Long l, String str, Map<String, String> map) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).loadUrl(str, map);
    }

    /* renamed from: j */
    public void mo34686j(Long l, Boolean bool) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).clearCache(bool.booleanValue());
    }

    /* renamed from: k */
    public void mo34687k(Long l, String str, C10940k.C10962n<String> nVar) {
        Objects.requireNonNull(nVar);
        ((WebView) this.f42594a.mo34671h(l.longValue())).evaluateJavascript(str, new C11009p3(nVar));
    }

    /* renamed from: l */
    public void mo34688l(Long l, Long l2, Long l3) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).scrollTo(l2.intValue(), l3.intValue());
    }

    /* renamed from: m */
    public void mo34689m(Long l, Long l2) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).removeJavascriptInterface(((C10991m2) this.f42594a.mo34671h(l2.longValue())).f42559b);
    }

    /* renamed from: n */
    public Long mo34690n(Long l) {
        return Long.valueOf((long) ((WebView) this.f42594a.mo34671h(l.longValue())).getScrollY());
    }

    /* renamed from: o */
    public C10940k.C10951e0 mo34691o(Long l) {
        WebView webView = (WebView) this.f42594a.mo34671h(l.longValue());
        Objects.requireNonNull(webView);
        WebView webView2 = webView;
        return new C10940k.C10951e0.C10952a().mo34709b(Long.valueOf((long) webView.getScrollX())).mo34710c(Long.valueOf((long) webView.getScrollY())).mo34708a();
    }

    /* renamed from: p */
    public String mo34692p(Long l) {
        return ((WebView) this.f42594a.mo34671h(l.longValue())).getTitle();
    }

    /* renamed from: q */
    public void mo34693q(Long l) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).reload();
    }

    /* renamed from: r */
    public Boolean mo34694r(Long l) {
        return Boolean.valueOf(((WebView) this.f42594a.mo34671h(l.longValue())).canGoForward());
    }

    /* renamed from: s */
    public void mo34695s(Long l, String str, String str2, String str3, String str4, String str5) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    /* renamed from: t */
    public void mo34696t(Long l) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).goBack();
    }

    /* renamed from: u */
    public void mo34697u(Long l, Long l2) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).setBackgroundColor(l2.intValue());
    }

    /* renamed from: v */
    public void mo34698v(Long l, Long l2) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).setDownloadListener((DownloadListener) this.f42594a.mo34671h(l2.longValue()));
    }

    /* renamed from: w */
    public Boolean mo34699w(Long l) {
        return Boolean.valueOf(((WebView) this.f42594a.mo34671h(l.longValue())).canGoBack());
    }

    /* renamed from: x */
    public String mo34700x(Long l) {
        return ((WebView) this.f42594a.mo34671h(l.longValue())).getUrl();
    }

    /* renamed from: y */
    public void mo34701y(Long l, String str, byte[] bArr) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).postUrl(str, bArr);
    }

    /* renamed from: z */
    public void mo34702z(Long l, Long l2, Long l3) {
        ((WebView) this.f42594a.mo34671h(l.longValue())).scrollBy(l2.intValue(), l3.intValue());
    }
}
