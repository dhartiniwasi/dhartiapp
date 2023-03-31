package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final c24 zzb;
    private int zze;
    private b24 zzf;
    private by3 zzg = sx3.m20713x();
    private jw3 zzh;
    private jw3 zzi;
    private int zzj;
    private byte zzk = 2;

    static {
        c24 c24 = new c24();
        zzb = c24;
        sx3.m20701B(c24.class, c24);
    }

    private c24() {
        jw3 jw3 = jw3.f11808b;
        this.zzh = jw3;
        this.zzi = jw3;
    }

    /* renamed from: G */
    public static z14 m10687G() {
        return (z14) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m10689I(c24 c24, y14 y14) {
        y14.getClass();
        by3 by3 = c24.zzg;
        if (!by3.mo8988e()) {
            c24.zzg = sx3.m20714y(by3);
        }
        c24.zzg.add(y14);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", y14.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new c24();
        } else {
            if (i2 == 4) {
                return new z14((g14) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
