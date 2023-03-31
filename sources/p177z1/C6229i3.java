package p177z1;

import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: z1.i3 */
/* compiled from: SeekParameters */
public final class C6229i3 {

    /* renamed from: c */
    public static final C6229i3 f29978c;

    /* renamed from: d */
    public static final C6229i3 f29979d = new C6229i3(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final C6229i3 f29980e = new C6229i3(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final C6229i3 f29981f = new C6229i3(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final C6229i3 f29982g;

    /* renamed from: a */
    public final long f29983a;

    /* renamed from: b */
    public final long f29984b;

    static {
        C6229i3 i3Var = new C6229i3(0, 0);
        f29978c = i3Var;
        f29982g = i3Var;
    }

    public C6229i3(long j, long j2) {
        boolean z = true;
        C5917a.m34868a(j >= 0);
        C5917a.m34868a(j2 < 0 ? false : z);
        this.f29983a = j;
        this.f29984b = j2;
    }

    /* renamed from: a */
    public long mo21342a(long j, long j2, long j3) {
        long j4 = this.f29983a;
        if (j4 == 0 && this.f29984b == 0) {
            return j;
        }
        long T0 = C5953m0.m35107T0(j, j4, Long.MIN_VALUE);
        long b = C5953m0.m35122b(j, this.f29984b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = T0 <= j2 && j2 <= b;
        if (T0 > j3 || j3 > b) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : T0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6229i3.class != obj.getClass()) {
            return false;
        }
        C6229i3 i3Var = (C6229i3) obj;
        if (this.f29983a == i3Var.f29983a && this.f29984b == i3Var.f29984b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f29983a) * 31) + ((int) this.f29984b);
    }
}
