package p030d2;

import android.net.Uri;
import java.util.Map;
import p030d2.C4021h;
import p155v3.C5828l;
import p155v3.C5849u;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6300z1;
import p190b7.C6695s0;
import p219e7.C9998d;

/* renamed from: d2.l */
/* compiled from: DefaultDrmSessionManagerProvider */
public final class C4033l implements C4001b0 {

    /* renamed from: a */
    private final Object f23103a = new Object();

    /* renamed from: b */
    private C6300z1.C6307f f23104b;

    /* renamed from: c */
    private C4052y f23105c;

    /* renamed from: d */
    private C5828l.C5829a f23106d;

    /* renamed from: e */
    private String f23107e;

    /* renamed from: b */
    private C4052y m27817b(C6300z1.C6307f fVar) {
        C5828l.C5829a aVar = this.f23106d;
        if (aVar == null) {
            aVar = new C5849u.C5851b().mo20395e(this.f23107e);
        }
        Uri uri = fVar.f30426c;
        C4034l0 l0Var = new C4034l0(uri == null ? null : uri.toString(), fVar.f30431h, aVar);
        C6695s0<Map.Entry<String, String>> l = fVar.f30428e.entrySet().iterator();
        while (l.hasNext()) {
            Map.Entry next = l.next();
            l0Var.mo17226e((String) next.getKey(), (String) next.getValue());
        }
        C4021h a = new C4021h.C4023b().mo17217e(fVar.f30424a, C4031k0.f23099d).mo17214b(fVar.f30429f).mo17215c(fVar.f30430g).mo17216d(C9998d.m51076k(fVar.f30433j)).mo17213a(l0Var);
        a.mo17206F(0, fVar.mo21604c());
        return a;
    }

    /* renamed from: a */
    public C4052y mo17162a(C6300z1 z1Var) {
        C4052y yVar;
        C5917a.m34872e(z1Var.f30391b);
        C6300z1.C6307f fVar = z1Var.f30391b.f30457c;
        if (fVar == null || C5953m0.f29110a < 18) {
            return C4052y.f23132a;
        }
        synchronized (this.f23103a) {
            if (!C5953m0.m35124c(fVar, this.f23104b)) {
                this.f23104b = fVar;
                this.f23105c = m27817b(fVar);
            }
            yVar = (C4052y) C5917a.m34872e(this.f23105c);
        }
        return yVar;
    }
}
