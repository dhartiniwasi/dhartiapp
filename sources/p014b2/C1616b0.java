package p014b2;

import p014b2.C1673z;
import p161w3.C5953m0;
import p219e7.C9998d;

/* renamed from: b2.b0 */
/* compiled from: DefaultAudioTrackBufferSizeProvider */
public class C1616b0 implements C1673z.C1677d {

    /* renamed from: b */
    protected final int f4630b;

    /* renamed from: c */
    protected final int f4631c;

    /* renamed from: d */
    protected final int f4632d;

    /* renamed from: e */
    protected final int f4633e;

    /* renamed from: f */
    protected final int f4634f;

    /* renamed from: g */
    public final int f4635g;

    /* renamed from: b2.b0$a */
    /* compiled from: DefaultAudioTrackBufferSizeProvider */
    public static class C1617a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f4636a = 250000;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f4637b = 750000;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f4638c = 4;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f4639d = 250000;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f4640e = 50000000;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f4641f = 2;

        /* renamed from: g */
        public C1616b0 mo6453g() {
            return new C1616b0(this);
        }
    }

    protected C1616b0(C1617a aVar) {
        this.f4630b = aVar.f4636a;
        this.f4631c = aVar.f4637b;
        this.f4632d = aVar.f4638c;
        this.f4633e = aVar.f4639d;
        this.f4634f = aVar.f4640e;
        this.f4635g = aVar.f4641f;
    }

    /* renamed from: b */
    protected static int m7417b(int i, int i2, int i3) {
        return C9998d.m51069d(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* renamed from: d */
    protected static int m7418d(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public int mo6448a(int i, int i2, int i3, int i4, int i5, double d) {
        return (((Math.max(i, (int) (((double) mo6449c(i, i2, i3, i4, i5)) * d)) + i4) - 1) / i4) * i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo6449c(int i, int i2, int i3, int i4, int i5) {
        if (i3 == 0) {
            return mo6452g(i, i5, i4);
        }
        if (i3 == 1) {
            return mo6450e(i2);
        }
        if (i3 == 2) {
            return mo6451f(i2);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo6450e(int i) {
        return C9998d.m51069d((((long) this.f4634f) * ((long) m7418d(i))) / 1000000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo6451f(int i) {
        int i2 = this.f4633e;
        if (i == 5) {
            i2 *= this.f4635g;
        }
        return C9998d.m51069d((((long) i2) * ((long) m7418d(i))) / 1000000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo6452g(int i, int i2, int i3) {
        return C5953m0.m35152q(i * this.f4632d, m7417b(this.f4630b, i2, i3), m7417b(this.f4631c, i2, i3));
    }
}
