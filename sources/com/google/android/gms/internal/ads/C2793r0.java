package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.r0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2793r0 implements qn4 {

    /* renamed from: n */
    public static final xn4 f16755n = C2756q0.f16105b;

    /* renamed from: a */
    private final byte[] f16756a = new byte[42];

    /* renamed from: b */
    private final y22 f16757b = new y22(new byte[32768], 0);

    /* renamed from: c */
    private final yn4 f16758c = new yn4();

    /* renamed from: d */
    private tn4 f16759d;

    /* renamed from: e */
    private C2792r f16760e;

    /* renamed from: f */
    private int f16761f = 0;

    /* renamed from: g */
    private k60 f16762g;

    /* renamed from: h */
    private do4 f16763h;

    /* renamed from: i */
    private int f16764i;

    /* renamed from: j */
    private int f16765j;

    /* renamed from: k */
    private C2718p0 f16766k;

    /* renamed from: l */
    private int f16767l;

    /* renamed from: m */
    private long f16768m;

    public C2793r0(int i) {
    }

    /* renamed from: a */
    private final long m19505a(y22 y22, boolean z) {
        boolean z2;
        Objects.requireNonNull(this.f16763h);
        int k = y22.mo15298k();
        while (k <= y22.mo15299l() - 16) {
            y22.mo15293f(k);
            if (zn4.m24717c(y22, this.f16763h, this.f16765j, this.f16758c)) {
                y22.mo15293f(k);
                return this.f16758c.f20723a;
            }
            k++;
        }
        if (z) {
            while (k <= y22.mo15299l() - this.f16764i) {
                y22.mo15293f(k);
                try {
                    z2 = zn4.m24717c(y22, this.f16763h, this.f16765j, this.f16758c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (y22.mo15298k() <= y22.mo15299l() && z2) {
                    y22.mo15293f(k);
                    return this.f16758c.f20723a;
                }
                k++;
            }
            y22.mo15293f(y22.mo15299l());
            return -1;
        }
        y22.mo15293f(k);
        return -1;
    }

    /* renamed from: d */
    private final void m19506d() {
        long j = this.f16768m;
        do4 do4 = this.f16763h;
        int i = gb2.f9812a;
        this.f16760e.mo8824f((j * 1000000) / ((long) do4.f8347e), 1, this.f16767l, 0, (C2755q) null);
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        ao4.m9870a(rn4, false);
        y22 y22 = new y22(4);
        ((fn4) rn4).mo9986i(y22.mo15295h(), 0, 4, false);
        if (y22.mo15280A() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f16759d = tn4;
        this.f16760e = tn4.mo10060n(0, 1);
        tn4.mo10058C();
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        boolean l;
        C2643n nVar;
        rn4 rn42 = rn4;
        int i = this.f16761f;
        boolean z = true;
        if (i == 0) {
            rn4.mo9981W();
            long a = rn4.mo9004a();
            k60 a2 = ao4.m9870a(rn42, true);
            ((fn4) rn42).mo10218n((int) (rn4.mo9004a() - a), false);
            this.f16762g = a2;
            this.f16761f = 1;
            return 0;
        } else if (i == 1) {
            ((fn4) rn42).mo9986i(this.f16756a, 0, 42, false);
            rn4.mo9981W();
            this.f16761f = 2;
            return 0;
        } else if (i == 2) {
            y22 y22 = new y22(4);
            ((fn4) rn42).mo9984g(y22.mo15295h(), 0, 4, false);
            if (y22.mo15280A() == 1716281667) {
                this.f16761f = 3;
                return 0;
            }
            throw ea0.m11990a("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            do4 do4 = this.f16763h;
            do {
                rn4.mo9981W();
                x12 x12 = new x12(new byte[4], 4);
                fn4 fn4 = (fn4) rn42;
                fn4.mo9986i(x12.f19942a, 0, 4, false);
                l = x12.mo15043l();
                int c = x12.mo15034c(7);
                int c2 = x12.mo15034c(24) + 4;
                if (c == 0) {
                    byte[] bArr = new byte[38];
                    fn4.mo9984g(bArr, 0, 38, false);
                    do4 = new do4(bArr, 4);
                } else if (do4 == null) {
                    throw new IllegalArgumentException();
                } else if (c == 3) {
                    y22 y222 = new y22(c2);
                    fn4.mo9984g(y222.mo15295h(), 0, c2, false);
                    do4 = do4.mo9641f(ao4.m9871b(y222));
                } else if (c == 4) {
                    y22 y223 = new y22(c2);
                    fn4.mo9984g(y223.mo15295h(), 0, c2, false);
                    y223.mo15294g(4);
                    do4 = do4.mo9642g(Arrays.asList(C3014x.m22985c(y223, false, false).f18304b));
                } else if (c == 6) {
                    y22 y224 = new y22(c2);
                    fn4.mo9984g(y224.mo15295h(), 0, c2, false);
                    y224.mo15294g(4);
                    do4 = do4.mo9640e(ua3.m21509x(C2608m1.m16352a(y224)));
                } else {
                    fn4.mo10218n(c2, false);
                }
                int i2 = gb2.f9812a;
                this.f16763h = do4;
            } while (!l);
            Objects.requireNonNull(do4);
            this.f16764i = Math.max(do4.f8345c, 6);
            this.f16760e.mo8823e(this.f16763h.mo9638c(this.f16756a, this.f16762g));
            this.f16761f = 4;
            return 0;
        } else if (i != 4) {
            Objects.requireNonNull(this.f16760e);
            do4 do42 = this.f16763h;
            Objects.requireNonNull(do42);
            C2718p0 p0Var = this.f16766k;
            if (p0Var != null && p0Var.mo8897e()) {
                return p0Var.mo8893a(rn42, kVar);
            }
            if (this.f16768m == -1) {
                this.f16768m = zn4.m24716b(rn42, do42);
                return 0;
            }
            y22 y225 = this.f16757b;
            int l2 = y225.mo15299l();
            if (l2 < 32768) {
                int c3 = rn42.mo8792c(y225.mo15295h(), l2, 32768 - l2);
                if (c3 != -1) {
                    z = false;
                }
                if (!z) {
                    this.f16757b.mo15292e(l2 + c3);
                } else if (this.f16757b.mo15296i() == 0) {
                    m19506d();
                    return -1;
                }
            } else {
                z = false;
            }
            y22 y226 = this.f16757b;
            int k = y226.mo15298k();
            int i3 = this.f16767l;
            int i4 = this.f16764i;
            if (i3 < i4) {
                y226.mo15294g(Math.min(i4 - i3, y226.mo15296i()));
            }
            long a3 = m19505a(this.f16757b, z);
            y22 y227 = this.f16757b;
            int k2 = y227.mo15298k() - k;
            y227.mo15293f(k);
            C2717p.m18261b(this.f16760e, this.f16757b, k2);
            this.f16767l += k2;
            if (a3 != -1) {
                m19506d();
                this.f16767l = 0;
                this.f16768m = a3;
            }
            y22 y228 = this.f16757b;
            if (y228.mo15296i() >= 16) {
                return 0;
            }
            int i5 = y228.mo15296i();
            System.arraycopy(y228.mo15295h(), y228.mo15298k(), y228.mo15295h(), 0, i5);
            this.f16757b.mo15293f(0);
            this.f16757b.mo15292e(i5);
            return 0;
        } else {
            rn4.mo9981W();
            y22 y229 = new y22(2);
            ((fn4) rn42).mo9986i(y229.mo15295h(), 0, 2, false);
            int w = y229.mo15310w();
            if ((w >> 2) == 16382) {
                rn4.mo9981W();
                this.f16765j = w;
                tn4 tn4 = this.f16759d;
                int i6 = gb2.f9812a;
                long T = rn4.mo9003T();
                long b = rn4.mo9005b();
                do4 do43 = this.f16763h;
                Objects.requireNonNull(do43);
                if (do43.f8353k != null) {
                    nVar = new bo4(do43, T);
                } else if (b == -1 || do43.f8352j <= 0) {
                    nVar = new C2606m(do43.mo9636a(), 0);
                } else {
                    C2718p0 p0Var2 = new C2718p0(do43, this.f16765j, T, b);
                    this.f16766k = p0Var2;
                    nVar = p0Var2.mo8894b();
                }
                tn4.mo10059j(nVar);
                this.f16761f = 5;
                return 0;
            }
            rn4.mo9981W();
            throw ea0.m11990a("First frame does not start with sync code.", (Throwable) null);
        }
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f16761f = 0;
        } else {
            C2718p0 p0Var = this.f16766k;
            if (p0Var != null) {
                p0Var.mo8896d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f16768m = j3;
        this.f16767l = 0;
        this.f16757b.mo15290c(0);
    }
}
