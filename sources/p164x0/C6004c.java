package p164x0;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;
import p158w0.C5873c;

/* renamed from: x0.c */
/* compiled from: ApiHelperForN */
public class C6004c {
    /* renamed from: a */
    public static boolean m35354a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    /* renamed from: b */
    public static boolean m35355b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    /* renamed from: c */
    public static boolean m35356c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    /* renamed from: d */
    public static int m35357d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    /* renamed from: e */
    public static File m35358e(Context context) {
        return context.getDataDir();
    }

    /* renamed from: f */
    public static int m35359f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    /* renamed from: g */
    public static ServiceWorkerController m35360g() {
        return ServiceWorkerController.getInstance();
    }

    /* renamed from: h */
    public static ServiceWorkerWebSettings m35361h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    /* renamed from: i */
    public static C6018o m35362i(ServiceWorkerController serviceWorkerController) {
        return new C6018o(m35361h(serviceWorkerController));
    }

    /* renamed from: j */
    public static boolean m35363j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    /* renamed from: k */
    public static void m35364k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    /* renamed from: l */
    public static void m35365l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    /* renamed from: m */
    public static void m35366m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    /* renamed from: n */
    public static void m35367n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    /* renamed from: o */
    public static void m35368o(WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    /* renamed from: p */
    public static void m35369p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    /* renamed from: q */
    public static void m35370q(ServiceWorkerController serviceWorkerController, C5873c cVar) {
        serviceWorkerController.setServiceWorkerClient(new C6011i(cVar));
    }
}
