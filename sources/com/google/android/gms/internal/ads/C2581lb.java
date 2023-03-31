package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2581lb extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2581lb zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C2581lb lbVar = new C2581lb();
        zzb = lbVar;
        sx3.m20701B(C2581lb.class, lbVar);
    }

    private C2581lb() {
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
            return new C2581lb();
        } else {
            if (i2 == 4) {
                return new C2544kb((C2469ib) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
