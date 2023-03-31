package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w14 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final w14 zzb;
    private int zze;
    private String zzf = "";
    private v14 zzg;
    private long zzh;
    private String zzi = "";

    static {
        w14 w14 = new w14();
        zzb = w14;
        sx3.m20701B(w14.class, w14);
    }

    private w14() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new w14();
        } else {
            if (i2 == 4) {
                return new t14((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
