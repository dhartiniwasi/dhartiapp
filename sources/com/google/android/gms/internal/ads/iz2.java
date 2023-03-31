package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class iz2 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final iz2 zzb;
    private dz2 zze;

    static {
        iz2 iz2 = new iz2();
        zzb = iz2;
        sx3.m20701B(iz2.class, iz2);
    }

    private iz2() {
    }

    /* renamed from: G */
    public static hz2 m14599G() {
        return (hz2) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m14601I(iz2 iz2, dz2 dz2) {
        dz2.getClass();
        iz2.zze = dz2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new iz2();
        } else {
            if (i2 == 4) {
                return new hz2((fz2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
