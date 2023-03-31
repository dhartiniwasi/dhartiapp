package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class as3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final as3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ds3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        as3 as3 = new as3();
        zzb = as3;
        sx3.m20701B(as3.class, as3);
    }

    private as3() {
    }

    /* renamed from: H */
    public static zr3 m9961H() {
        return (zr3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static as3 m9963J(jw3 jw3, ex3 ex3) throws ey3 {
        return (as3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: N */
    static /* synthetic */ void m9965N(as3 as3, ds3 ds3) {
        ds3.getClass();
        as3.zzf = ds3;
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
            return new as3();
        } else {
            if (i2 == 4) {
                return new zr3((yr3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo8524G() {
        return this.zze;
    }

    /* renamed from: K */
    public final ds3 mo8525K() {
        ds3 ds3 = this.zzf;
        return ds3 == null ? ds3.m11653K() : ds3;
    }

    /* renamed from: L */
    public final jw3 mo8526L() {
        return this.zzg;
    }

    /* renamed from: P */
    public final boolean mo8527P() {
        return this.zzf != null;
    }
}
