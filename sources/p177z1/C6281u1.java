package p177z1;

import android.os.Bundle;
import p161w3.C5917a;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: z1.u1 */
/* compiled from: HeartRating */
public final class C6281u1 extends C6206b3 {

    /* renamed from: d */
    public static final C6224h.C6225a<C6281u1> f30334d = C13426t1.f47764a;

    /* renamed from: b */
    private final boolean f30335b;

    /* renamed from: c */
    private final boolean f30336c;

    public C6281u1() {
        this.f30335b = false;
        this.f30336c = false;
    }

    /* renamed from: c */
    private static String m37010c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C6281u1 m37012e(Bundle bundle) {
        C5917a.m34868a(bundle.getInt(m37010c(0), -1) == 0);
        if (bundle.getBoolean(m37010c(1), false)) {
            return new C6281u1(bundle.getBoolean(m37010c(2), false));
        }
        return new C6281u1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6281u1)) {
            return false;
        }
        C6281u1 u1Var = (C6281u1) obj;
        if (this.f30336c == u1Var.f30336c && this.f30335b == u1Var.f30335b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Boolean.valueOf(this.f30335b), Boolean.valueOf(this.f30336c));
    }

    public C6281u1(boolean z) {
        this.f30335b = true;
        this.f30336c = z;
    }
}
