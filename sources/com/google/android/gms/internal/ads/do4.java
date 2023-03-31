package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class do4 {

    /* renamed from: a */
    public final int f8343a;

    /* renamed from: b */
    public final int f8344b;

    /* renamed from: c */
    public final int f8345c;

    /* renamed from: d */
    public final int f8346d;

    /* renamed from: e */
    public final int f8347e;

    /* renamed from: f */
    public final int f8348f;

    /* renamed from: g */
    public final int f8349g;

    /* renamed from: h */
    public final int f8350h;

    /* renamed from: i */
    public final int f8351i;

    /* renamed from: j */
    public final long f8352j;

    /* renamed from: k */
    public final co4 f8353k;

    /* renamed from: l */
    private final k60 f8354l;

    private do4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, co4 co4, k60 k60) {
        this.f8343a = i;
        this.f8344b = i2;
        this.f8345c = i3;
        this.f8346d = i4;
        this.f8347e = i5;
        this.f8348f = m11580i(i5);
        this.f8349g = i6;
        this.f8350h = i7;
        this.f8351i = m11579h(i7);
        this.f8352j = j;
        this.f8353k = co4;
        this.f8354l = k60;
    }

    public do4(byte[] bArr, int i) {
        x12 x12 = new x12(bArr, bArr.length);
        x12.mo15039h(i * 8);
        this.f8343a = x12.mo15034c(16);
        this.f8344b = x12.mo15034c(16);
        this.f8345c = x12.mo15034c(24);
        this.f8346d = x12.mo15034c(24);
        int c = x12.mo15034c(20);
        this.f8347e = c;
        this.f8348f = m11580i(c);
        this.f8349g = x12.mo15034c(3) + 1;
        int c2 = x12.mo15034c(5) + 1;
        this.f8350h = c2;
        this.f8351i = m11579h(c2);
        this.f8352j = gb2.m13174i0(x12.mo15034c(4), x12.mo15034c(32));
        this.f8353k = null;
        this.f8354l = null;
    }

    /* renamed from: h */
    private static int m11579h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: i */
    private static int m11580i(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final long mo9636a() {
        long j = this.f8352j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f8347e);
    }

    /* renamed from: b */
    public final long mo9637b(long j) {
        return gb2.m13160b0((j * ((long) this.f8347e)) / 1000000, 0, this.f8352j - 1);
    }

    /* renamed from: c */
    public final C2388g4 mo9638c(byte[] bArr, k60 k60) {
        bArr[4] = C8843b4.f36445d;
        int i = this.f8346d;
        if (i <= 0) {
            i = -1;
        }
        k60 d = mo9639d(k60);
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9776s("audio/flac");
        e2Var.mo9769l(i);
        e2Var.mo9759e0(this.f8349g);
        e2Var.mo9777t(this.f8347e);
        e2Var.mo9766i(Collections.singletonList(bArr));
        e2Var.mo9770m(d);
        return e2Var.mo9782y();
    }

    /* renamed from: d */
    public final k60 mo9639d(k60 k60) {
        k60 k602 = this.f8354l;
        return k602 == null ? k60 : k602.mo11571d(k60);
    }

    /* renamed from: e */
    public final do4 mo9640e(List list) {
        return new do4(this.f8343a, this.f8344b, this.f8345c, this.f8346d, this.f8347e, this.f8349g, this.f8350h, this.f8352j, this.f8353k, mo9639d(new k60(list)));
    }

    /* renamed from: f */
    public final do4 mo9641f(co4 co4) {
        return new do4(this.f8343a, this.f8344b, this.f8345c, this.f8346d, this.f8347e, this.f8349g, this.f8350h, this.f8352j, co4, this.f8354l);
    }

    /* renamed from: g */
    public final do4 mo9642g(List list) {
        return new do4(this.f8343a, this.f8344b, this.f8345c, this.f8346d, this.f8347e, this.f8349g, this.f8350h, this.f8352j, this.f8353k, mo9639d(C3014x.m22984b(list)));
    }
}
