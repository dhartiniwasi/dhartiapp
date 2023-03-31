package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.fo */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2371fo implements C2259co, C2222bo {

    /* renamed from: a */
    public final C2259co[] f9364a;

    /* renamed from: b */
    private final IdentityHashMap f9365b = new IdentityHashMap();

    /* renamed from: c */
    private C2222bo f9366c;

    /* renamed from: d */
    private int f9367d;

    /* renamed from: e */
    private C2891to f9368e;

    /* renamed from: f */
    private C2259co[] f9369f;

    /* renamed from: g */
    private C2780qo f9370g;

    public C2371fo(C2259co... coVarArr) {
        this.f9364a = coVarArr;
    }

    /* renamed from: U */
    public final long mo9232U() {
        long U = this.f9364a[0].mo9232U();
        int i = 1;
        while (true) {
            C2259co[] coVarArr = this.f9364a;
            if (i >= coVarArr.length) {
                if (U != -9223372036854775807L) {
                    C2259co[] coVarArr2 = this.f9369f;
                    int length = coVarArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C2259co coVar = coVarArr2[i2];
                        if (coVar == this.f9364a[0] || coVar.mo9240i0(U) == U) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return U;
            } else if (coVarArr[i].mo9232U() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    /* renamed from: a */
    public final void mo8898a(C2259co coVar) {
        int i = this.f9367d - 1;
        this.f9367d = i;
        if (i <= 0) {
            int i2 = 0;
            for (C2259co a0 : this.f9364a) {
                i2 += a0.mo9233a0().f18176a;
            }
            C2854so[] soVarArr = new C2854so[i2];
            int i3 = 0;
            for (C2259co a02 : this.f9364a) {
                C2891to a03 = a02.mo9233a0();
                int i4 = a03.f18176a;
                int i5 = 0;
                while (i5 < i4) {
                    soVarArr[i3] = a03.mo14333b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f9368e = new C2891to(soVarArr);
            this.f9366c.mo8898a(this);
        }
    }

    /* renamed from: a0 */
    public final C2891to mo9233a0() {
        return this.f9368e;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo10219b(C2780qo qoVar) {
        C2259co coVar = (C2259co) qoVar;
        if (this.f9368e != null) {
            this.f9366c.mo10219b(this);
        }
    }

    /* renamed from: c */
    public final long mo9234c() {
        long j = Long.MAX_VALUE;
        for (C2259co c : this.f9369f) {
            long c2 = c.mo9234c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d0 */
    public final void mo9235d0() throws IOException {
        for (C2259co d0 : this.f9364a) {
            d0.mo9235d0();
        }
    }

    /* renamed from: e0 */
    public final boolean mo9236e0(long j) {
        return this.f9370g.mo9236e0(j);
    }

    /* renamed from: f0 */
    public final long mo9237f0(C3039xo[] xoVarArr, boolean[] zArr, C2705oo[] ooVarArr, boolean[] zArr2, long j) {
        int length;
        int i;
        C3039xo[] xoVarArr2 = xoVarArr;
        C2705oo[] ooVarArr2 = ooVarArr;
        int length2 = xoVarArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = xoVarArr2.length;
            if (i2 >= length) {
                break;
            }
            C2705oo ooVar = ooVarArr2[i2];
            if (ooVar == null) {
                i = -1;
            } else {
                i = ((Integer) this.f9365b.get(ooVar)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            C3039xo xoVar = xoVarArr2[i2];
            if (xoVar != null) {
                C2854so d = xoVar.mo15199d();
                int i3 = 0;
                while (true) {
                    C2259co[] coVarArr = this.f9364a;
                    if (i3 >= coVarArr.length) {
                        break;
                    } else if (coVarArr[i3].mo9233a0().mo14332a(d) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.f9365b.clear();
        C2705oo[] ooVarArr3 = new C2705oo[length];
        C2705oo[] ooVarArr4 = new C2705oo[length];
        C3039xo[] xoVarArr3 = new C3039xo[length];
        ArrayList arrayList = new ArrayList(this.f9364a.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.f9364a.length) {
            for (int i5 = 0; i5 < xoVarArr2.length; i5++) {
                C3039xo xoVar2 = null;
                ooVarArr4[i5] = iArr[i5] == i4 ? ooVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    xoVar2 = xoVarArr2[i5];
                }
                xoVarArr3[i5] = xoVar2;
            }
            int i6 = i4;
            C3039xo[] xoVarArr4 = xoVarArr3;
            ArrayList arrayList2 = arrayList;
            long f0 = this.f9364a[i4].mo9237f0(xoVarArr3, zArr, ooVarArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = f0;
            } else if (f0 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < xoVarArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    C2335eq.m12245e(ooVarArr4[i7] != null);
                    C2705oo ooVar2 = ooVarArr4[i7];
                    ooVarArr3[i7] = ooVar2;
                    this.f9365b.put(ooVar2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (ooVarArr4[i7] != null) {
                        z2 = false;
                    }
                    C2335eq.m12245e(z2);
                }
            }
            if (z) {
                arrayList2.add(this.f9364a[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            xoVarArr3 = xoVarArr4;
            ooVarArr2 = ooVarArr;
        }
        C2705oo[] ooVarArr5 = ooVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ooVarArr3, 0, ooVarArr5, 0, length);
        C2259co[] coVarArr2 = new C2259co[arrayList3.size()];
        this.f9369f = coVarArr2;
        arrayList3.toArray(coVarArr2);
        this.f9370g = new C2742pn(this.f9369f);
        return j2;
    }

    /* renamed from: g0 */
    public final void mo9238g0(C2222bo boVar, long j) {
        this.f9366c = boVar;
        this.f9367d = r0;
        for (C2259co g0 : this.f9364a) {
            g0.mo9238g0(this, j);
        }
    }

    /* renamed from: h0 */
    public final void mo9239h0(long j) {
        for (C2259co h0 : this.f9369f) {
            h0.mo9239h0(j);
        }
    }

    /* renamed from: i0 */
    public final long mo9240i0(long j) {
        long i0 = this.f9369f[0].mo9240i0(j);
        int i = 1;
        while (true) {
            C2259co[] coVarArr = this.f9369f;
            if (i >= coVarArr.length) {
                return i0;
            }
            if (coVarArr[i].mo9240i0(i0) == i0) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final long zza() {
        return this.f9370g.zza();
    }
}
