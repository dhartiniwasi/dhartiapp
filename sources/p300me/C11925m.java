package p300me;

import java.util.Arrays;

/* renamed from: me.m */
/* compiled from: Settings */
public final class C11925m {

    /* renamed from: a */
    private int f44808a;

    /* renamed from: b */
    private final int[] f44809b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36236a() {
        this.f44808a = 0;
        Arrays.fill(this.f44809b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo36237b(int i) {
        return this.f44809b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo36238c() {
        if ((this.f44808a & 2) != 0) {
            return this.f44809b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo36239d() {
        if ((this.f44808a & 128) != 0) {
            return this.f44809b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo36240e(int i) {
        return (this.f44808a & 16) != 0 ? this.f44809b[4] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo36241f(int i) {
        return (this.f44808a & 32) != 0 ? this.f44809b[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo36242g(int i) {
        return ((1 << i) & this.f44808a) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo36243h(C11925m mVar) {
        for (int i = 0; i < 10; i++) {
            if (mVar.mo36242g(i)) {
                mo36244i(i, mVar.mo36237b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C11925m mo36244i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f44809b;
            if (i < iArr.length) {
                this.f44808a = (1 << i) | this.f44808a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo36245j() {
        return Integer.bitCount(this.f44808a);
    }
}
