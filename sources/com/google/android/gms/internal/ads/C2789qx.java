package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2789qx extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2789qx zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2789qx qxVar = new C2789qx();
        zzb = qxVar;
        sx3.m20701B(C2789qx.class, qxVar);
    }

    private C2789qx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2789qx();
        } else {
            if (i2 == 4) {
                return new C2752px((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
