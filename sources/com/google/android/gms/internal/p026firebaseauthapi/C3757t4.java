package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3757t4 {

    /* renamed from: f */
    private static final C3757t4 f22725f = new C3757t4(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f22726a;

    /* renamed from: b */
    private int[] f22727b;

    /* renamed from: c */
    private Object[] f22728c;

    /* renamed from: d */
    private int f22729d;

    /* renamed from: e */
    private boolean f22730e;

    private C3757t4() {
        this(0, new int[8], new Object[8], true);
    }

    private C3757t4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f22729d = -1;
        this.f22726a = i;
        this.f22727b = iArr;
        this.f22728c = objArr;
        this.f22730e = z;
    }

    /* renamed from: c */
    public static C3757t4 m26978c() {
        return f22725f;
    }

    /* renamed from: e */
    static C3757t4 m26979e(C3757t4 t4Var, C3757t4 t4Var2) {
        int i = t4Var.f22726a + t4Var2.f22726a;
        int[] copyOf = Arrays.copyOf(t4Var.f22727b, i);
        System.arraycopy(t4Var2.f22727b, 0, copyOf, t4Var.f22726a, t4Var2.f22726a);
        Object[] copyOf2 = Arrays.copyOf(t4Var.f22728c, i);
        System.arraycopy(t4Var2.f22728c, 0, copyOf2, t4Var.f22726a, t4Var2.f22726a);
        return new C3757t4(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    static C3757t4 m26980f() {
        return new C3757t4(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m26981l(int i) {
        int[] iArr = this.f22727b;
        if (i > iArr.length) {
            int i2 = this.f22726a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f22727b = Arrays.copyOf(iArr, i);
            this.f22728c = Arrays.copyOf(this.f22728c, i);
        }
    }

    /* renamed from: a */
    public final int mo16796a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f22729d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f22726a; i6++) {
            int i7 = this.f22727b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f22728c[i6]).longValue();
                    i = C3688r1.m26670f(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int f = C3688r1.m26670f(i8 << 3);
                    int f2 = ((C3325g1) this.f22728c[i6]).mo15875f();
                    i5 += f + C3688r1.m26670f(f2) + f2;
                } else if (i9 == 3) {
                    int e = C3688r1.m26669e(i8);
                    i3 = e + e;
                    i2 = ((C3757t4) this.f22728c[i6]).mo16796a();
                } else if (i9 == 5) {
                    ((Integer) this.f22728c[i6]).intValue();
                    i = C3688r1.m26670f(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(C3689r2.m26696a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f22728c[i6]).longValue();
                i3 = C3688r1.m26670f(i8 << 3);
                i2 = C3688r1.m26671g(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f22729d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo16797b() {
        int i = this.f22729d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22726a; i3++) {
            int i4 = this.f22727b[i3];
            int f = C3688r1.m26670f(8);
            int f2 = ((C3325g1) this.f22728c[i3]).mo15875f();
            i2 += f + f + C3688r1.m26670f(16) + C3688r1.m26670f(i4 >>> 3) + C3688r1.m26670f(24) + C3688r1.m26670f(f2) + f2;
        }
        this.f22729d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C3757t4 mo16798d(C3757t4 t4Var) {
        if (t4Var.equals(f22725f)) {
            return this;
        }
        mo16800g();
        int i = this.f22726a + t4Var.f22726a;
        m26981l(i);
        System.arraycopy(t4Var.f22727b, 0, this.f22727b, this.f22726a, t4Var.f22726a);
        System.arraycopy(t4Var.f22728c, 0, this.f22728c, this.f22726a, t4Var.f22726a);
        this.f22726a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3757t4)) {
            return false;
        }
        C3757t4 t4Var = (C3757t4) obj;
        int i = this.f22726a;
        if (i == t4Var.f22726a) {
            int[] iArr = this.f22727b;
            int[] iArr2 = t4Var.f22727b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f22728c;
                    Object[] objArr2 = t4Var.f22728c;
                    int i3 = this.f22726a;
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

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo16800g() {
        if (!this.f22730e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo16801h() {
        this.f22730e = false;
    }

    public final int hashCode() {
        int i = this.f22726a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f22727b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f22728c;
        int i7 = this.f22726a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo16803i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f22726a; i2++) {
            C3657q3.m26539b(sb, i, String.valueOf(this.f22727b[i2] >>> 3), this.f22728c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo16804j(int i, Object obj) {
        mo16800g();
        m26981l(this.f22726a + 1);
        int[] iArr = this.f22727b;
        int i2 = this.f22726a;
        iArr[i2] = i;
        this.f22728c[i2] = obj;
        this.f22726a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo16805k(C3721s1 s1Var) throws IOException {
        if (this.f22726a != 0) {
            for (int i = 0; i < this.f22726a; i++) {
                int i2 = this.f22727b[i];
                Object obj = this.f22728c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    s1Var.mo16698E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    s1Var.mo16727x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    s1Var.mo16718o(i3, (C3325g1) obj);
                } else if (i4 == 3) {
                    s1Var.mo16709e(i3);
                    ((C3757t4) obj).mo16805k(s1Var);
                    s1Var.mo16722s(i3);
                } else if (i4 == 5) {
                    s1Var.mo16725v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C3689r2.m26696a());
                }
            }
        }
    }
}
