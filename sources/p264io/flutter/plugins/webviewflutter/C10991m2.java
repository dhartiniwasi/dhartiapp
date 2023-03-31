package p264io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* renamed from: io.flutter.plugins.webviewflutter.m2 */
/* compiled from: JavaScriptChannel */
public class C10991m2 implements C11008p2 {

    /* renamed from: a */
    private final Handler f42558a;

    /* renamed from: b */
    final String f42559b;

    /* renamed from: c */
    private C10997n2 f42560c;

    public C10991m2(C10997n2 n2Var, String str, Handler handler) {
        this.f42560c = n2Var;
        this.f42559b = str;
        this.f42558a = handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m54572e(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m54573f(String str) {
        C10997n2 n2Var = this.f42560c;
        if (n2Var != null) {
            n2Var.mo34765j(this, str, C10938j2.f42506a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m54574g(Void voidR) {
    }

    /* renamed from: a */
    public void mo34648a() {
        C10997n2 n2Var = this.f42560c;
        if (n2Var != null) {
            n2Var.mo34764h(this, C10981k2.f42547a);
        }
        this.f42560c = null;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C10986l2 l2Var = new C10986l2(this, str);
        if (this.f42558a.getLooper() == Looper.myLooper()) {
            l2Var.run();
        } else {
            this.f42558a.post(l2Var);
        }
    }
}
