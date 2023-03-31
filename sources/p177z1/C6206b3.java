package p177z1;

import android.os.Bundle;
import p177z1.C6224h;

/* renamed from: z1.b3 */
/* compiled from: Rating */
public abstract class C6206b3 implements C6224h {

    /* renamed from: a */
    public static final C6224h.C6225a<C6206b3> f29842a = C13376a3.f47706a;

    C6206b3() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6206b3 m36297b(Bundle bundle) {
        int i = bundle.getInt(m36298c(0), -1);
        if (i == 0) {
            return C6281u1.f30334d.mo6454a(bundle);
        }
        if (i == 1) {
            return C6261o2.f30164c.mo6454a(bundle);
        }
        if (i == 2) {
            return C6236k3.f30032d.mo6454a(bundle);
        }
        if (i == 3) {
            return C6262o3.f30166d.mo6454a(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i);
    }

    /* renamed from: c */
    private static String m36298c(int i) {
        return Integer.toString(i, 36);
    }
}
