package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final s24 zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        s24 s24 = new s24();
        zzb = s24;
        sx3.m20701B(s24.class, s24);
    }

    private s24() {
    }

    /* renamed from: G */
    public static q24 m20133G() {
        return (q24) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m20135I(s24 s24, String str) {
        s24.zze |= 1;
        s24.zzf = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m20136J(s24 s24, long j) {
        s24.zze |= 2;
        s24.zzg = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m20137K(s24 s24, boolean z) {
        s24.zze |= 4;
        s24.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", t24.f17816a, "zzj", "zzk"});
        } else if (i2 == 3) {
            return new s24();
        } else {
            if (i2 == 4) {
                return new q24((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
