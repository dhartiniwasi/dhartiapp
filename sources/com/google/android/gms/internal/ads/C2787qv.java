package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2787qv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2787qv zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C2787qv qvVar = new C2787qv();
        zzb = qvVar;
        sx3.m20701B(C2787qv.class, qvVar);
    }

    private C2787qv() {
    }

    /* renamed from: G */
    public static C2750pv m19370G() {
        return (C2750pv) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m19372I(C2787qv qvVar, boolean z) {
        qvVar.zze |= 1;
        qvVar.zzf = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m19373J(C2787qv qvVar, boolean z) {
        qvVar.zze |= 2;
        qvVar.zzg = z;
    }

    /* renamed from: K */
    static /* synthetic */ void m19374K(C2787qv qvVar, int i) {
        qvVar.zze |= 4;
        qvVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2787qv();
        } else {
            if (i2 == 4) {
                return new C2750pv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
