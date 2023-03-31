package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final f24 zzb;
    private int zze;
    private int zzf;
    private jw3 zzg;
    private jw3 zzh;

    static {
        f24 f24 = new f24();
        zzb = f24;
        sx3.m20701B(f24.class, f24);
    }

    private f24() {
        jw3 jw3 = jw3.f11808b;
        this.zzg = jw3;
        this.zzh = jw3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new f24();
        } else {
            if (i2 == 4) {
                return new e24((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
