package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final j24 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private jw3 zzh;
    private jw3 zzi;

    static {
        j24 j24 = new j24();
        zzb = j24;
        sx3.m20701B(j24.class, j24);
    }

    private j24() {
        jw3 jw3 = jw3.f11808b;
        this.zzh = jw3;
        this.zzi = jw3;
    }

    /* renamed from: G */
    public static h24 m14653G() {
        return (h24) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m14655I(j24 j24, String str) {
        j24.zze |= 2;
        j24.zzg = "image/png";
    }

    /* renamed from: J */
    static /* synthetic */ void m14656J(j24 j24, jw3 jw3) {
        jw3.getClass();
        j24.zze |= 4;
        j24.zzh = jw3;
    }

    /* renamed from: K */
    static /* synthetic */ void m14657K(j24 j24, int i) {
        j24.zzf = 1;
        j24.zze = 1 | j24.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", i24.f10600a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new j24();
        } else {
            if (i2 == 4) {
                return new h24((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
