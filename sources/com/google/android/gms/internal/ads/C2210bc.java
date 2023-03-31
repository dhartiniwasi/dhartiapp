package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2210bc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2210bc zzb;
    private int zze;
    private int zzf;

    static {
        C2210bc bcVar = new C2210bc();
        zzb = bcVar;
        sx3.m20701B(C2210bc.class, bcVar);
    }

    private C2210bc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", C2358fc.f9212a});
        } else if (i2 == 3) {
            return new C2210bc();
        } else {
            if (i2 == 4) {
                return new C2173ac((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
