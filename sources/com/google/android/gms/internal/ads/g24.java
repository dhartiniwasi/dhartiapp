package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final g24 zzb;
    private int zze;
    private f24 zzf;
    private by3 zzg = sx3.m20713x();
    private jw3 zzh;
    private jw3 zzi;
    private int zzj;
    private jw3 zzk;
    private byte zzl = 2;

    static {
        g24 g24 = new g24();
        zzb = g24;
        sx3.m20701B(g24.class, g24);
    }

    private g24() {
        jw3 jw3 = jw3.f11808b;
        this.zzh = jw3;
        this.zzi = jw3;
        this.zzk = jw3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", y14.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new g24();
        } else {
            if (i2 == 4) {
                return new d24((g14) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
