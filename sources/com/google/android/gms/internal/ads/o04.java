package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o04 {

    /* renamed from: f */
    private static final o04 f14785f = new o04(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f14786a;

    /* renamed from: b */
    private int[] f14787b;

    /* renamed from: c */
    private Object[] f14788c;

    /* renamed from: d */
    private int f14789d;

    /* renamed from: e */
    private boolean f14790e;

    private o04() {
        this(0, new int[8], new Object[8], true);
    }

    private o04(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14789d = -1;
        this.f14786a = i;
        this.f14787b = iArr;
        this.f14788c = objArr;
        this.f14790e = z;
    }

    /* renamed from: c */
    public static o04 m17404c() {
        return f14785f;
    }

    /* renamed from: d */
    static o04 m17405d(o04 o04, o04 o042) {
        int i = o04.f14786a + o042.f14786a;
        int[] copyOf = Arrays.copyOf(o04.f14787b, i);
        System.arraycopy(o042.f14787b, 0, copyOf, o04.f14786a, o042.f14786a);
        Object[] copyOf2 = Arrays.copyOf(o04.f14788c, i);
        System.arraycopy(o042.f14788c, 0, copyOf2, o04.f14786a, o042.f14786a);
        return new o04(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static o04 m17406e() {
        return new o04(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo12780a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f14789d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f14786a; i6++) {
            int i7 = this.f14787b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f14788c[i6]).longValue();
                    i = zw3.m24869f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = zw3.m24869f(i8 << 3);
                    int q = ((jw3) this.f14788c[i6]).mo9361q();
                    i5 += f + zw3.m24869f(q) + q;
                } else if (i9 == 3) {
                    int e = zw3.m24868e(i8);
                    i3 = e + e;
                    i2 = ((o04) this.f14788c[i6]).mo12780a();
                } else if (i9 == 5) {
                    ((Integer) this.f14788c[i6]).intValue();
                    i = zw3.m24869f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(ey3.m12337a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f14788c[i6]).longValue();
                i3 = zw3.m24869f(i8 << 3);
                i2 = zw3.m24870g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f14789d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo12781b() {
        int i = this.f14789d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14786a; i3++) {
            int i4 = this.f14787b[i3];
            int f = zw3.m24869f(8);
            int q = ((jw3) this.f14788c[i3]).mo9361q();
            i2 += f + f + zw3.m24869f(16) + zw3.m24869f(i4 >>> 3) + zw3.m24869f(24) + zw3.m24869f(q) + q;
        }
        this.f14789d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o04)) {
            return false;
        }
        o04 o04 = (o04) obj;
        int i = this.f14786a;
        if (i == o04.f14786a) {
            int[] iArr = this.f14787b;
            int[] iArr2 = o04.f14787b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f14788c;
                    Object[] objArr2 = o04.f14788c;
                    int i3 = this.f14786a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo12783f() {
        this.f14790e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12784g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f14786a; i2++) {
            ez3.m12373b(sb, i, String.valueOf(this.f14787b[i2] >>> 3), this.f14788c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12785h(int i, Object obj) {
        if (this.f14790e) {
            int i2 = this.f14786a;
            int[] iArr = this.f14787b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f14787b = Arrays.copyOf(iArr, i3);
                this.f14788c = Arrays.copyOf(this.f14788c, i3);
            }
            int[] iArr2 = this.f14787b;
            int i4 = this.f14786a;
            iArr2[i4] = i;
            this.f14788c[i4] = obj;
            this.f14786a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f14786a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f14787b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f14788c;
        int i7 = this.f14786a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo12787i(ax3 ax3) throws IOException {
        if (this.f14786a != 0) {
            for (int i = 0; i < this.f14786a; i++) {
                int i2 = this.f14787b[i];
                Object obj = this.f14788c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ax3.mo8590E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ax3.mo8619x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ax3.mo8610o(i3, (jw3) obj);
                } else if (i4 == 3) {
                    ax3.mo8601e(i3);
                    ((o04) obj).mo12787i(ax3);
                    ax3.mo8614s(i3);
                } else if (i4 == 5) {
                    ax3.mo8617v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(ey3.m12337a());
                }
            }
        }
    }
}
