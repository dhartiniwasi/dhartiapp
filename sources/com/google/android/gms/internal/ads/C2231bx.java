package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2231bx extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2231bx zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2231bx bxVar = new C2231bx();
        zzb = bxVar;
        sx3.m20701B(C2231bx.class, bxVar);
    }

    private C2231bx() {
    }

    /* renamed from: G */
    public static C2936uw m10612G() {
        return (C2936uw) zzb.mo14160D();
    }

    /* renamed from: I */
    public static C2231bx m10614I() {
        return zzb;
    }

    /* renamed from: N */
    static /* synthetic */ void m10615N(C2231bx bxVar, int i) {
        bxVar.zzf = i - 1;
        bxVar.zze |= 1;
    }

    /* renamed from: O */
    static /* synthetic */ void m10616O(C2231bx bxVar, int i) {
        bxVar.zzg = i - 1;
        bxVar.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", C3121zw.f21500a, "zzg", C3010ww.f19792a});
        } else if (i2 == 3) {
            return new C2231bx();
        } else {
            if (i2 == 4) {
                return new C2936uw((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final boolean mo8960J() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo8961K() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: L */
    public final int mo8962L() {
        int a = C3047xw.m23562a(this.zzg);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: M */
    public final int mo8963M() {
        int a = C2194ax.m10026a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
