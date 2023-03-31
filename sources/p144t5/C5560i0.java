package p144t5;

import android.os.Handler;
import android.webkit.WebView;

/* renamed from: t5.i0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5560i0 extends WebView {

    /* renamed from: a */
    private final Handler f28117a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5581o0 f28118b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f28119c = false;

    public C5560i0(C5568k0 k0Var, Handler handler, C5581o0 o0Var) {
        super(k0Var);
        this.f28117a = handler;
        this.f28118b = o0Var;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m33620c(C5560i0 i0Var, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* renamed from: b */
    public final void mo19866b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        this.f28117a.post(new C5548f0(this, sb.toString()));
    }
}
