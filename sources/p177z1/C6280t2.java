package p177z1;

import android.os.Bundle;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6224h;

/* renamed from: z1.t2 */
/* compiled from: PlaybackParameters */
public final class C6280t2 implements C6224h {

    /* renamed from: d */
    public static final C6280t2 f30329d = new C6280t2(1.0f);

    /* renamed from: e */
    public static final C6224h.C6225a<C6280t2> f30330e = C13422s2.f47760a;

    /* renamed from: a */
    public final float f30331a;

    /* renamed from: b */
    public final float f30332b;

    /* renamed from: c */
    private final int f30333c;

    public C6280t2(float f) {
        this(f, 1.0f);
    }

    /* renamed from: c */
    private static String m37006c(int i) {
        return Integer.toString(i, 36);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C6280t2 m37007d(Bundle bundle) {
        return new C6280t2(bundle.getFloat(m37006c(0), 1.0f), bundle.getFloat(m37006c(1), 1.0f));
    }

    /* renamed from: b */
    public long mo21537b(long j) {
        return j * ((long) this.f30333c);
    }

    /* renamed from: e */
    public C6280t2 mo21538e(float f) {
        return new C6280t2(f, this.f30332b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6280t2.class != obj.getClass()) {
            return false;
        }
        C6280t2 t2Var = (C6280t2) obj;
        if (this.f30331a == t2Var.f30331a && this.f30332b == t2Var.f30332b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f30331a)) * 31) + Float.floatToRawIntBits(this.f30332b);
    }

    public String toString() {
        return C5953m0.m35072C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f30331a), Float.valueOf(this.f30332b));
    }

    public C6280t2(float f, float f2) {
        boolean z = true;
        C5917a.m34868a(f > 0.0f);
        C5917a.m34868a(f2 <= 0.0f ? false : z);
        this.f30331a = f;
        this.f30332b = f2;
        this.f30333c = Math.round(f * 1000.0f);
    }
}
