package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uy */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2938uy extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2938uy zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2938uy uyVar = new C2938uy();
        zzb = uyVar;
        sx3.m20701B(C2938uy.class, uyVar);
    }

    private C2938uy() {
    }

    /* renamed from: G */
    public static C2901ty m21894G() {
        return (C2901ty) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m21896I(C2938uy uyVar, boolean z) {
        uyVar.zze |= 1;
        uyVar.zzf = z;
    }

    /* renamed from: J */
    static /* synthetic */ void m21897J(C2938uy uyVar, int i) {
        uyVar.zze |= 2;
        uyVar.zzg = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2938uy();
        } else {
            if (i2 == 4) {
                return new C2901ty((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: K */
    public final boolean mo14638K() {
        return this.zzf;
    }
}
