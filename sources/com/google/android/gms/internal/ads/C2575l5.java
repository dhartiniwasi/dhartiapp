package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.l5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2575l5 extends C2946v5 {

    /* renamed from: n */
    private do4 f12655n;

    /* renamed from: o */
    private C2538k5 f12656o;

    C2575l5() {
    }

    /* renamed from: j */
    private static boolean m15821j(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo11899a(y22 y22) {
        if (!m15821j(y22.mo15295h())) {
            return -1;
        }
        int i = (y22.mo15295h()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = zn4.m24715a(y22, i);
            y22.mo15293f(0);
            return (long) a;
        }
        y22.mo15294g(4);
        y22.mo15282C();
        int a2 = zn4.m24715a(y22, i);
        y22.mo15293f(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11900b(boolean z) {
        super.mo11900b(z);
        if (z) {
            this.f12655n = null;
            this.f12656o = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo11901c(y22 y22, long j, C2835s5 s5Var) {
        byte[] h = y22.mo15295h();
        do4 do4 = this.f12655n;
        if (do4 == null) {
            do4 do42 = new do4(h, 17);
            this.f12655n = do42;
            s5Var.f17261a = do42.mo9638c(Arrays.copyOfRange(h, 9, y22.mo15299l()), (k60) null);
            return true;
        } else if ((h[0] & Byte.MAX_VALUE) == 3) {
            co4 b = ao4.m9871b(y22);
            do4 f = do4.mo9641f(b);
            this.f12655n = f;
            this.f12656o = new C2538k5(f, b);
            return true;
        } else if (!m15821j(h)) {
            return true;
        } else {
            C2538k5 k5Var = this.f12656o;
            if (k5Var != null) {
                k5Var.mo11567c(j);
                s5Var.f17262b = this.f12656o;
            }
            Objects.requireNonNull(s5Var.f17261a);
            return false;
        }
    }
}
