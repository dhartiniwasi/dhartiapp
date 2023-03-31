package p164x0;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import p158w0.C5877f;

/* renamed from: x0.f */
/* compiled from: ApiHelperForP */
public class C6008f {
    /* renamed from: a */
    public static TracingController m35390a() {
        return TracingController.getInstance();
    }

    /* renamed from: b */
    public static ClassLoader m35391b() {
        return WebView.getWebViewClassLoader();
    }

    /* renamed from: c */
    public static Looper m35392c(WebView webView) {
        return webView.getWebViewLooper();
    }

    /* renamed from: d */
    public static boolean m35393d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    /* renamed from: e */
    public static void m35394e(TracingController tracingController, C5877f fVar) {
        new TracingConfig.Builder();
        throw null;
    }

    /* renamed from: f */
    public static boolean m35395f(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
