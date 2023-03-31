package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3085yx extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C3085yx zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C3085yx yxVar = new C3085yx();
        zzb = yxVar;
        sx3.m20701B(C3085yx.class, yxVar);
    }

    private C3085yx() {
    }

    /* renamed from: G */
    public static C3048xx m24221G() {
        return (C3048xx) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m24223I(C3085yx yxVar, int i) {
        yxVar.zze |= 1;
        yxVar.zzf = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m24224J(C3085yx yxVar, int i) {
        yxVar.zze |= 2;
        yxVar.zzg = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m24225K(C3085yx yxVar, int i) {
        yxVar.zze |= 4;
        yxVar.zzh = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C3085yx();
        } else {
            if (i2 == 4) {
                return new C3048xx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
