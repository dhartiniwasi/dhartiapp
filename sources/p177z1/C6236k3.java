package p177z1;

import android.os.Bundle;
import p161w3.C5917a;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: z1.k3 */
/* compiled from: StarRating */
public final class C6236k3 extends C6206b3 {

    /* renamed from: d */
    public static final C6224h.C6225a<C6236k3> f30032d = C13399j3.f47734a;

    /* renamed from: b */
    private final int f30033b;

    /* renamed from: c */
    private final float f30034c;

    public C6236k3(int i) {
        C5917a.m34869b(i > 0, "maxStars must be a positive integer");
        this.f30033b = i;
        this.f30034c = -1.0f;
    }

    /* renamed from: c */
    private static String m36575c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C6236k3 m36577e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m36575c(0), -1) == 2) {
            z = true;
        }
        C5917a.m34868a(z);
        int i = bundle.getInt(m36575c(1), 5);
        float f = bundle.getFloat(m36575c(2), -1.0f);
        if (f == -1.0f) {
            return new C6236k3(i);
        }
        return new C6236k3(i, f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6236k3)) {
            return false;
        }
        C6236k3 k3Var = (C6236k3) obj;
        if (this.f30033b == k3Var.f30033b && this.f30034c == k3Var.f30034c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Integer.valueOf(this.f30033b), Float.valueOf(this.f30034c));
    }

    public C6236k3(int i, float f) {
        boolean z = true;
        C5917a.m34869b(i > 0, "maxStars must be a positive integer");
        C5917a.m34869b((f < 0.0f || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.f30033b = i;
        this.f30034c = f;
    }
}
