package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final y24 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        y24 y24 = new y24();
        zzb = y24;
        sx3.m20701B(y24.class, y24);
    }

    private y24() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new y24();
        } else {
            if (i2 == 4) {
                return new x24((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
