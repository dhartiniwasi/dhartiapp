package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2564kv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2564kv zzb;
    private int zze;
    private int zzf;
    private C2712ov zzg;
    private C2787qv zzh;

    static {
        C2564kv kvVar = new C2564kv();
        zzb = kvVar;
        sx3.m20701B(C2564kv.class, kvVar);
    }

    private C2564kv() {
    }

    /* renamed from: G */
    public static C2527jv m15626G() {
        return (C2527jv) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m15628I(C2564kv kvVar, C2712ov ovVar) {
        ovVar.getClass();
        kvVar.zzg = ovVar;
        kvVar.zze |= 2;
    }

    /* renamed from: J */
    static /* synthetic */ void m15629J(C2564kv kvVar, C2787qv qvVar) {
        qvVar.getClass();
        kvVar.zzh = qvVar;
        kvVar.zze |= 4;
    }

    /* renamed from: K */
    static /* synthetic */ void m15630K(C2564kv kvVar, int i) {
        kvVar.zzf = 1;
        kvVar.zze = 1 | kvVar.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", C2638mv.f13515a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2564kv();
        } else {
            if (i2 == 4) {
                return new C2527jv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
