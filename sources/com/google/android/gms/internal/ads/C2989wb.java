package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2989wb extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2989wb zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C2989wb wbVar = new C2989wb();
        zzb = wbVar;
        sx3.m20701B(C2989wb.class, wbVar);
    }

    private C2989wb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C2989wb();
        } else {
            if (i2 == 4) {
                return new C2952vb((C2729pb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
