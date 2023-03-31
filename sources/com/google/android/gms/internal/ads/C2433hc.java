package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2433hc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2433hc zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        C2433hc hcVar = new C2433hc();
        zzb = hcVar;
        sx3.m20701B(C2433hc.class, hcVar);
    }

    private C2433hc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", C2284dc.f8181a, "zzg"});
        } else if (i2 == 3) {
            return new C2433hc();
        } else {
            if (i2 == 4) {
                return new C2396gc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
