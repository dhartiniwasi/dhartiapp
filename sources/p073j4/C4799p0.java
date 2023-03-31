package p073j4;

import com.google.android.gms.internal.ads.C2542k9;
import com.google.android.gms.internal.ads.C2654na;
import com.google.android.gms.internal.ads.C2727p9;
import com.google.android.gms.internal.ads.C2950v9;
import com.google.android.gms.internal.ads.in0;
import com.google.android.gms.internal.ads.om0;
import java.util.Map;

/* renamed from: j4.p0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4799p0 extends C2727p9 {

    /* renamed from: u */
    private final in0 f25477u;

    /* renamed from: v */
    private final om0 f25478v;

    public C4799p0(String str, Map map, in0 in0) {
        super(0, str, new C4796o0(in0));
        this.f25477u = in0;
        om0 om0 = new om0((String) null);
        this.f25478v = om0;
        om0.mo12978d(str, "GET", (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C2950v9 mo13182o(C2542k9 k9Var) {
        return C2950v9.m22044b(k9Var, C2654na.m16988b(k9Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ void mo13189v(Object obj) {
        C2542k9 k9Var = (C2542k9) obj;
        this.f25478v.mo12980f(k9Var.f11967c, k9Var.f11965a);
        om0 om0 = this.f25478v;
        byte[] bArr = k9Var.f11966b;
        if (om0.m17944l() && bArr != null) {
            om0.mo12982h(bArr);
        }
        this.f25477u.mo11172d(k9Var);
    }
}
