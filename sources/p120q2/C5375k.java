package p120q2;

import java.util.NoSuchElementException;

/* renamed from: q2.k */
/* compiled from: IntArrayQueue */
final class C5375k {

    /* renamed from: a */
    private int f27502a = 0;

    /* renamed from: b */
    private int f27503b = -1;

    /* renamed from: c */
    private int f27504c = 0;

    /* renamed from: d */
    private int[] f27505d;

    /* renamed from: e */
    private int f27506e;

    public C5375k() {
        int[] iArr = new int[16];
        this.f27505d = iArr;
        this.f27506e = iArr.length - 1;
    }

    /* renamed from: c */
    private void m32906c() {
        int[] iArr = this.f27505d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f27502a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f27505d, 0, iArr2, i2, i);
            this.f27502a = 0;
            this.f27503b = this.f27504c - 1;
            this.f27505d = iArr2;
            this.f27506e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo19475a(int i) {
        if (this.f27504c == this.f27505d.length) {
            m32906c();
        }
        int i2 = (this.f27503b + 1) & this.f27506e;
        this.f27503b = i2;
        this.f27505d[i2] = i;
        this.f27504c++;
    }

    /* renamed from: b */
    public void mo19476b() {
        this.f27502a = 0;
        this.f27503b = -1;
        this.f27504c = 0;
    }

    /* renamed from: d */
    public boolean mo19477d() {
        return this.f27504c == 0;
    }

    /* renamed from: e */
    public int mo19478e() {
        int i = this.f27504c;
        if (i != 0) {
            int[] iArr = this.f27505d;
            int i2 = this.f27502a;
            int i3 = iArr[i2];
            this.f27502a = (i2 + 1) & this.f27506e;
            this.f27504c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
