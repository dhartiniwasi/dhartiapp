package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ov */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2712ov extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2712ov zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2712ov ovVar = new C2712ov();
        zzb = ovVar;
        sx3.m20701B(C2712ov.class, ovVar);
    }

    private C2712ov() {
    }

    /* renamed from: G */
    public static C2675nv m18098G() {
        return (C2675nv) zzb.mo14160D();
    }

    /* renamed from: I */
    public static C2712ov m18100I() {
        return zzb;
    }

    /* renamed from: J */
    static /* synthetic */ void m18101J(C2712ov ovVar, boolean z) {
        ovVar.zze |= 1;
        ovVar.zzf = z;
    }

    /* renamed from: K */
    static /* synthetic */ void m18102K(C2712ov ovVar, int i) {
        ovVar.zze |= 2;
        ovVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2712ov();
        } else {
            if (i2 == 4) {
                return new C2675nv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
