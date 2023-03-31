package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2825rw extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2825rw zzb;
    private int zze;
    private int zzf;
    private xx3 zzg = sx3.m20710t();

    static {
        C2825rw rwVar = new C2825rw();
        zzb = rwVar;
        sx3.m20701B(C2825rw.class, rwVar);
    }

    private C2825rw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", C2565kw.f12309a, "zzg"});
        } else if (i2 == 3) {
            return new C2825rw();
        } else {
            if (i2 == 4) {
                return new C2788qw((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
