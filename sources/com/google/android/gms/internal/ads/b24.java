package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final b24 zzb;
    private int zze;
    private jw3 zzf;
    private jw3 zzg;
    private jw3 zzh;

    static {
        b24 b24 = new b24();
        zzb = b24;
        sx3.m20701B(b24.class, b24);
    }

    private b24() {
        jw3 jw3 = jw3.f11808b;
        this.zzf = jw3;
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
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new b24();
        } else {
            if (i2 == 4) {
                return new a24((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
