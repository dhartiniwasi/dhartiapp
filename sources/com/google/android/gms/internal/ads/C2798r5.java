package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r5 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2798r5 extends C2946v5 {

    /* renamed from: o */
    private static final byte[] f16833o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f16834p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f16835n;

    C2798r5() {
    }

    /* renamed from: j */
    public static boolean m19582j(y22 y22) {
        return m19583k(y22, f16833o);
    }

    /* renamed from: k */
    private static boolean m19583k(y22 y22, byte[] bArr) {
        if (y22.mo15296i() < 8) {
            return false;
        }
        int k = y22.mo15298k();
        byte[] bArr2 = new byte[8];
        y22.mo15289b(bArr2, 0, 8);
        y22.mo15293f(k);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo11899a(y22 y22) {
        byte[] h = y22.mo15295h();
        byte b = h[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = h[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo14675f(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11900b(boolean z) {
        super.mo11900b(z);
        if (z) {
            this.f16835n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo11901c(y22 y22, long j, C2835s5 s5Var) throws ea0 {
        if (m19583k(y22, f16833o)) {
            byte[] copyOf = Arrays.copyOf(y22.mo15295h(), y22.mo15299l());
            byte b = copyOf[9] & 255;
            List a = C2457i.m14087a(copyOf);
            if (s5Var.f17261a != null) {
                return true;
            }
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9776s("audio/opus");
            e2Var.mo9759e0(b);
            e2Var.mo9777t(48000);
            e2Var.mo9766i(a);
            s5Var.f17261a = e2Var.mo9782y();
            return true;
        } else if (m19583k(y22, f16834p)) {
            v91.m22048b(s5Var.f17261a);
            if (this.f16835n) {
                return true;
            }
            this.f16835n = true;
            y22.mo15294g(8);
            k60 b2 = C3014x.m22984b(ua3.m21507v(C3014x.m22985c(y22, false, false).f18304b));
            if (b2 == null) {
                return true;
            }
            C2311e2 b3 = s5Var.f17261a.mo10384b();
            b3.mo9770m(b2.mo11571d(s5Var.f17261a.f9671j));
            s5Var.f17261a = b3.mo9782y();
            return true;
        } else {
            v91.m22048b(s5Var.f17261a);
            return false;
        }
    }
}
