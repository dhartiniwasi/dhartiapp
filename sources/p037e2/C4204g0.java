package p037e2;

/* renamed from: e2.g0 */
/* compiled from: VorbisBitArray */
public final class C4204g0 {

    /* renamed from: a */
    private final byte[] f23518a;

    /* renamed from: b */
    private final int f23519b;

    /* renamed from: c */
    private int f23520c;

    /* renamed from: d */
    private int f23521d;

    public C4204g0(byte[] bArr) {
        this.f23518a = bArr;
        this.f23519b = bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f23519b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28419a() {
        /*
            r2 = this;
            int r0 = r2.f23520c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f23519b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f23521d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p161w3.C5917a.m34873f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p037e2.C4204g0.m28419a():void");
    }

    /* renamed from: b */
    public int mo17570b() {
        return (this.f23520c * 8) + this.f23521d;
    }

    /* renamed from: c */
    public boolean mo17571c() {
        boolean z = (((this.f23518a[this.f23520c] & 255) >> this.f23521d) & 1) == 1;
        mo17573e(1);
        return z;
    }

    /* renamed from: d */
    public int mo17572d(int i) {
        int i2 = this.f23520c;
        int min = Math.min(i, 8 - this.f23521d);
        int i3 = i2 + 1;
        int i4 = ((this.f23518a[i2] & 255) >> this.f23521d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f23518a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo17573e(i);
        return i5;
    }

    /* renamed from: e */
    public void mo17573e(int i) {
        int i2 = i / 8;
        int i3 = this.f23520c + i2;
        this.f23520c = i3;
        int i4 = this.f23521d + (i - (i2 * 8));
        this.f23521d = i4;
        if (i4 > 7) {
            this.f23520c = i3 + 1;
            this.f23521d = i4 - 8;
        }
        m28419a();
    }
}
