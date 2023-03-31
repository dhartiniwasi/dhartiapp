package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.rb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7157rb {

    /* renamed from: f */
    private static final C7157rb f32028f = new C7157rb(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f32029a;

    /* renamed from: b */
    private int[] f32030b;

    /* renamed from: c */
    private Object[] f32031c;

    /* renamed from: d */
    private int f32032d;

    /* renamed from: e */
    private boolean f32033e;

    private C7157rb() {
        this(0, new int[8], new Object[8], true);
    }

    private C7157rb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f32032d = -1;
        this.f32029a = i;
        this.f32030b = iArr;
        this.f32031c = objArr;
        this.f32033e = z;
    }

    /* renamed from: c */
    public static C7157rb m40813c() {
        return f32028f;
    }

    /* renamed from: e */
    static C7157rb m40814e(C7157rb rbVar, C7157rb rbVar2) {
        int i = rbVar.f32029a + rbVar2.f32029a;
        int[] copyOf = Arrays.copyOf(rbVar.f32030b, i);
        System.arraycopy(rbVar2.f32030b, 0, copyOf, rbVar.f32029a, rbVar2.f32029a);
        Object[] copyOf2 = Arrays.copyOf(rbVar.f32031c, i);
        System.arraycopy(rbVar2.f32031c, 0, copyOf2, rbVar.f32029a, rbVar2.f32029a);
        return new C7157rb(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    static C7157rb m40815f() {
        return new C7157rb(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m40816l(int i) {
        int[] iArr = this.f32030b;
        if (i > iArr.length) {
            int i2 = this.f32029a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f32030b = Arrays.copyOf(iArr, i);
            this.f32031c = Arrays.copyOf(this.f32031c, i);
        }
    }

    /* renamed from: a */
    public final int mo23819a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f32032d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f32029a; i6++) {
            int i7 = this.f32030b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f32031c[i6]).longValue();
                    i = C7106o8.m40502a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C7106o8.m40502a(i8 << 3);
                    int f = ((C6977g8) this.f32031c[i6]).mo23326f();
                    i5 += a + C7106o8.m40502a(f) + f;
                } else if (i9 == 3) {
                    int D = C7106o8.m40501D(i8);
                    i3 = D + D;
                    i2 = ((C7157rb) this.f32031c[i6]).mo23819a();
                } else if (i9 == 5) {
                    ((Integer) this.f32031c[i6]).intValue();
                    i = C7106o8.m40502a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(C7139q9.m40662a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f32031c[i6]).longValue();
                i3 = C7106o8.m40502a(i8 << 3);
                i2 = C7106o8.m40503b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f32032d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo23820b() {
        int i = this.f32032d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32029a; i3++) {
            int i4 = this.f32030b[i3];
            int a = C7106o8.m40502a(8);
            int f = ((C6977g8) this.f32031c[i3]).mo23326f();
            i2 += a + a + C7106o8.m40502a(16) + C7106o8.m40502a(i4 >>> 3) + C7106o8.m40502a(24) + C7106o8.m40502a(f) + f;
        }
        this.f32032d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C7157rb mo23821d(C7157rb rbVar) {
        if (rbVar.equals(f32028f)) {
            return this;
        }
        mo23823g();
        int i = this.f32029a + rbVar.f32029a;
        m40816l(i);
        System.arraycopy(rbVar.f32030b, 0, this.f32030b, this.f32029a, rbVar.f32029a);
        System.arraycopy(rbVar.f32031c, 0, this.f32031c, this.f32029a, rbVar.f32029a);
        this.f32029a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7157rb)) {
            return false;
        }
        C7157rb rbVar = (C7157rb) obj;
        int i = this.f32029a;
        if (i == rbVar.f32029a) {
            int[] iArr = this.f32030b;
            int[] iArr2 = rbVar.f32030b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f32031c;
                    Object[] objArr2 = rbVar.f32031c;
                    int i3 = this.f32029a;
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
    public final void mo23823g() {
        if (!this.f32033e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo23824h() {
        this.f32033e = false;
    }

    public final int hashCode() {
        int i = this.f32029a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f32030b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f32031c;
        int i7 = this.f32029a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo23826i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f32029a; i2++) {
            C7124pa.m40600b(sb, i, String.valueOf(this.f32030b[i2] >>> 3), this.f32031c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo23827j(int i, Object obj) {
        mo23823g();
        m40816l(this.f32029a + 1);
        int[] iArr = this.f32030b;
        int i2 = this.f32029a;
        iArr[i2] = i;
        this.f32031c[i2] = obj;
        this.f32029a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo23828k(C7030jc jcVar) throws IOException {
        if (this.f32029a != 0) {
            for (int i = 0; i < this.f32029a; i++) {
                int i2 = this.f32030b[i];
                Object obj = this.f32031c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    jcVar.mo23581n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    jcVar.mo23572a(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    jcVar.mo23587t(i3, (C6977g8) obj);
                } else if (i4 == 3) {
                    jcVar.mo23573g(i3);
                    ((C7157rb) obj).mo23828k(jcVar);
                    jcVar.mo23576i0(i3);
                } else if (i4 == 5) {
                    jcVar.mo23578k(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C7139q9.m40662a());
                }
            }
        }
    }
}
