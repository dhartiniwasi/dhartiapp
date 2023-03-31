package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vo3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final vo3 zzb;
    private yo3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        vo3 vo3 = new vo3();
        zzb = vo3;
        sx3.m20701B(vo3.class, vo3);
    }

    private vo3() {
    }

    /* renamed from: H */
    public static uo3 m22326H() {
        return (uo3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static vo3 m22328J() {
        return zzb;
    }

    /* renamed from: K */
    public static vo3 m22329K(jw3 jw3, ex3 ex3) throws ey3 {
        return (vo3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: M */
    static /* synthetic */ void m22330M(vo3 vo3, yo3 yo3) {
        yo3.getClass();
        vo3.zze = yo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new vo3();
        } else {
            if (i2 == 4) {
                return new uo3((to3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14800G() {
        return this.zzf;
    }

    /* renamed from: L */
    public final yo3 mo14801L() {
        yo3 yo3 = this.zze;
        return yo3 == null ? yo3.m24125J() : yo3;
    }
}
