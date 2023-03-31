package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ds3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ds3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private xr3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        ds3 ds3 = new ds3();
        zzb = ds3;
        sx3.m20701B(ds3.class, ds3);
    }

    private ds3() {
    }

    /* renamed from: I */
    public static cs3 m11651I() {
        return (cs3) zzb.mo14160D();
    }

    /* renamed from: K */
    public static ds3 m11653K() {
        return zzb;
    }

    /* renamed from: L */
    public static ds3 m11654L(jw3 jw3, ex3 ex3) throws ey3 {
        return (ds3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: O */
    static /* synthetic */ void m11656O(ds3 ds3, xr3 xr3) {
        xr3.getClass();
        ds3.zzf = xr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new ds3();
        } else {
            if (i2 == 4) {
                return new cs3((bs3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo9685G() {
        return this.zze;
    }

    /* renamed from: H */
    public final xr3 mo9686H() {
        xr3 xr3 = this.zzf;
        return xr3 == null ? xr3.m23517I() : xr3;
    }

    /* renamed from: M */
    public final jw3 mo9687M() {
        return this.zzg;
    }

    /* renamed from: Q */
    public final boolean mo9688Q() {
        return this.zzf != null;
    }
}
