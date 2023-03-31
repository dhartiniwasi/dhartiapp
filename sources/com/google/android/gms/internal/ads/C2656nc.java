package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2656nc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2656nc zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        C2656nc ncVar = new C2656nc();
        zzb = ncVar;
        sx3.m20701B(C2656nc.class, ncVar);
    }

    private C2656nc() {
    }

    /* renamed from: G */
    public static C2619mc m17004G() {
        return (C2619mc) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m17006I(C2656nc ncVar, long j) {
        ncVar.zze |= 1;
        ncVar.zzf = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m17007J(C2656nc ncVar, long j) {
        ncVar.zze |= 4;
        ncVar.zzh = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m17008K(C2656nc ncVar, long j) {
        ncVar.zze |= 8;
        ncVar.zzi = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m17009L(C2656nc ncVar, long j) {
        ncVar.zze |= 16;
        ncVar.zzj = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m17010M(C2656nc ncVar, long j) {
        ncVar.zze |= 32;
        ncVar.zzk = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C2656nc();
        } else {
            if (i2 == 4) {
                return new C2619mc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
