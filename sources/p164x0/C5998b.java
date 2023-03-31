package p164x0;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p158w0.C5878g;
import p158w0.C5879h;
import p158w0.C5882j;

/* renamed from: x0.b */
/* compiled from: ApiHelperForM */
public class C5998b {

    /* renamed from: x0.b$a */
    /* compiled from: ApiHelperForM */
    class C5999a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ C5879h.C5880a f29215a;

        C5999a(C5879h.C5880a aVar) {
            this.f29215a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f29215a.onMessage(new C6022s(webMessagePort), C6022s.m35429h(webMessage));
        }
    }

    /* renamed from: x0.b$b */
    /* compiled from: ApiHelperForM */
    class C6000b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        final /* synthetic */ C5879h.C5880a f29216a;

        C6000b(C5879h.C5880a aVar) {
            this.f29216a = aVar;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f29216a.onMessage(new C6022s(webMessagePort), C6022s.m35429h(webMessage));
        }
    }

    /* renamed from: x0.b$c */
    /* compiled from: ApiHelperForM */
    class C6001c extends WebView.VisualStateCallback {

        /* renamed from: a */
        final /* synthetic */ C5882j.C5883a f29217a;

        C6001c(C5882j.C5883a aVar) {
            this.f29217a = aVar;
        }

        public void onComplete(long j) {
            this.f29217a.onComplete(j);
        }
    }

    /* renamed from: a */
    public static void m35338a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    /* renamed from: b */
    public static WebMessage m35339b(C5878g gVar) {
        return new WebMessage(gVar.mo20435a(), C6022s.m35428g(gVar.mo20436b()));
    }

    /* renamed from: c */
    public static WebMessagePort[] m35340c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    /* renamed from: d */
    public static C5878g m35341d(WebMessage webMessage) {
        return new C5878g(webMessage.getData(), C6022s.m35432k(webMessage.getPorts()));
    }

    /* renamed from: e */
    public static CharSequence m35342e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    /* renamed from: f */
    public static int m35343f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    /* renamed from: g */
    public static boolean m35344g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    /* renamed from: h */
    public static void m35345h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    /* renamed from: i */
    public static void m35346i(WebView webView, long j, C5882j.C5883a aVar) {
        webView.postVisualStateCallback(j, new C6001c(aVar));
    }

    /* renamed from: j */
    public static void m35347j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    /* renamed from: k */
    public static void m35348k(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    /* renamed from: l */
    public static void m35349l(WebMessagePort webMessagePort, C5879h.C5880a aVar) {
        webMessagePort.setWebMessageCallback(new C5999a(aVar));
    }

    /* renamed from: m */
    public static void m35350m(WebMessagePort webMessagePort, C5879h.C5880a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new C6000b(aVar), handler);
    }
}
