package p073j4;

import com.google.android.gms.internal.ads.C2876t9;
import com.google.android.gms.internal.ads.C3061y9;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: j4.j0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4781j0 implements C2876t9 {

    /* renamed from: a */
    final /* synthetic */ String f25446a;

    /* renamed from: b */
    final /* synthetic */ C4793n0 f25447b;

    C4781j0(C4802q0 q0Var, String str, C4793n0 n0Var) {
        this.f25446a = str;
        this.f25447b = n0Var;
    }

    /* renamed from: a */
    public final void mo14250a(C3061y9 y9Var) {
        String str = this.f25446a;
        String exc = y9Var.toString();
        pm0.m18667g("Failed to load URL: " + str + "\n" + exc);
        this.f25447b.mo14465b((Object) null);
    }
}
