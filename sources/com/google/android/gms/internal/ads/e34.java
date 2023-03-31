package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e34 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final e34 zzb;
    private int zze;
    private String zzf = "";

    static {
        e34 e34 = new e34();
        zzb = e34;
        sx3.m20701B(e34.class, e34);
    }

    private e34() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new e34();
        } else {
            if (i2 == 4) {
                return new d34((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
