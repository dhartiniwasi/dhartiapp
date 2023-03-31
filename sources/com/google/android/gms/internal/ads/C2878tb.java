package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2878tb extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2878tb zzb;
    private int zze;
    private int zzf = 2;

    static {
        C2878tb tbVar = new C2878tb();
        zzb = tbVar;
        sx3.m20701B(C2878tb.class, tbVar);
    }

    private C2878tb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", C2915ub.f18486a});
        } else if (i2 == 3) {
            return new C2878tb();
        } else {
            if (i2 == 4) {
                return new C2841sb((C2729pb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
