package p177z1;

import android.os.Bundle;
import p161w3.C5917a;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: z1.o2 */
/* compiled from: PercentageRating */
public final class C6261o2 extends C6206b3 {

    /* renamed from: c */
    public static final C6224h.C6225a<C6261o2> f30164c = C13410n2.f47748a;

    /* renamed from: b */
    private final float f30165b;

    public C6261o2() {
        this.f30165b = -1.0f;
    }

    /* renamed from: c */
    private static String m36804c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C6261o2 m36806e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m36804c(0), -1) == 1) {
            z = true;
        }
        C5917a.m34868a(z);
        float f = bundle.getFloat(m36804c(1), -1.0f);
        return f == -1.0f ? new C6261o2() : new C6261o2(f);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C6261o2) && this.f30165b == ((C6261o2) obj).f30165b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Float.valueOf(this.f30165b));
    }

    public C6261o2(float f) {
        C5917a.m34869b(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f30165b = f;
    }
}
