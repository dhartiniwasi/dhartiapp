package p158w0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p164x0.C5988a;
import p164x0.C5998b;
import p164x0.C6006d;
import p164x0.C6007e;
import p164x0.C6009g;
import p164x0.C6022s;
import p164x0.C6024u;
import p164x0.C6025v;
import p164x0.C6028w;
import p164x0.C6029x;

/* renamed from: w0.j */
/* compiled from: WebViewCompat */
public class C5882j {

    /* renamed from: a */
    private static final Uri f29002a = Uri.parse("*");

    /* renamed from: b */
    private static final Uri f29003b = Uri.parse("");

    /* renamed from: w0.j$a */
    /* compiled from: WebViewCompat */
    public interface C5883a {
        void onComplete(long j);
    }

    /* renamed from: w0.j$b */
    /* compiled from: WebViewCompat */
    public interface C5884b {
        void onPostMessage(WebView webView, C5878g gVar, Uri uri, boolean z, C5871a aVar);
    }

    /* renamed from: a */
    public static void m34791a(WebView webView, String str, Set<String> set, C5884b bVar) {
        if (C6024u.f29260S.mo20709d()) {
            m34798h(webView).mo20737a(str, (String[]) set.toArray(new String[0]), bVar);
            return;
        }
        throw C6024u.m35442a();
    }

    /* renamed from: b */
    private static WebViewProviderBoundaryInterface m34792b(WebView webView) {
        return m34795e().createWebView(webView);
    }

    /* renamed from: c */
    public static C5879h[] m34793c(WebView webView) {
        C5988a.C5990b bVar = C6024u.f29245D;
        if (bVar.mo20708c()) {
            return C6022s.m35432k(C5998b.m35340c(webView));
        }
        if (bVar.mo20709d()) {
            return m34798h(webView).mo20738b();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: d */
    public static PackageInfo m34794d(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return null;
        }
        if (i >= 26) {
            return C6006d.m35379a();
        }
        try {
            PackageInfo f = m34796f();
            if (f != null) {
                return f;
            }
            return m34797g(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static C6029x m34795e() {
        return C6025v.m35448d();
    }

    /* renamed from: f */
    private static PackageInfo m34796f() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.pm.PackageInfo m34797g(android.content.Context r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            r2 = 21
            r3 = 0
            if (r1 < r2) goto L_0x0023
            r2 = 23
            if (r1 > r2) goto L_0x0023
            java.lang.String r1 = "android.webkit.WebViewFactory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r2 = "getWebViewPackageName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            goto L_0x0039
        L_0x0023:
            java.lang.String r1 = "android.webkit.WebViewUpdateService"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r2 = "getCurrentWebViewPackageName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0045 }
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r3)     // Catch:{  }
            return r5
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p158w0.C5882j.m34797g(android.content.Context):android.content.pm.PackageInfo");
    }

    /* renamed from: h */
    private static C6028w m34798h(WebView webView) {
        return new C6028w(m34792b(webView));
    }

    /* renamed from: i */
    public static Uri m34799i() {
        C5988a.C5994f fVar = C6024u.f29275j;
        if (fVar.mo20708c()) {
            return C6007e.m35385b();
        }
        if (fVar.mo20709d()) {
            return m34795e().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: j */
    public static void m34800j(WebView webView, C5878g gVar, Uri uri) {
        if (f29002a.equals(uri)) {
            uri = f29003b;
        }
        C5988a.C5990b bVar = C6024u.f29246E;
        if (bVar.mo20708c()) {
            C5998b.m35347j(webView, C6022s.m35427f(gVar), uri);
        } else if (bVar.mo20709d()) {
            m34798h(webView).mo20739c(gVar, uri);
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: k */
    public static void m34801k(Set<String> set, ValueCallback<Boolean> valueCallback) {
        C5988a.C5994f fVar = C6024u.f29274i;
        C5988a.C5994f fVar2 = C6024u.f29273h;
        if (fVar.mo20709d()) {
            m34795e().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        if (fVar2.mo20708c()) {
            C6007e.m35387d(arrayList, valueCallback);
        } else if (fVar2.mo20709d()) {
            m34795e().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            throw C6024u.m35442a();
        }
    }

    @Deprecated
    /* renamed from: l */
    public static void m34802l(List<String> list, ValueCallback<Boolean> valueCallback) {
        m34801k(new HashSet(list), valueCallback);
    }

    /* renamed from: m */
    public static void m34803m(WebView webView, C5887m mVar) {
        C5988a.C5996h hVar = C6024u.f29253L;
        if (hVar.mo20708c()) {
            C6009g.m35401f(webView, mVar);
        } else if (hVar.mo20709d()) {
            m34798h(webView).mo20740d((Executor) null, mVar);
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: n */
    public static void m34804n(Context context, ValueCallback<Boolean> valueCallback) {
        C5988a.C5994f fVar = C6024u.f29270e;
        if (fVar.mo20708c()) {
            C6007e.m35389f(context, valueCallback);
        } else if (fVar.mo20709d()) {
            m34795e().getStatics().initSafeBrowsing(context, valueCallback);
        } else {
            throw C6024u.m35442a();
        }
    }
}
