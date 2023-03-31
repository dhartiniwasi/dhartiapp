package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ob */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2692ob extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2692ob zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private long zzk;
    private long zzl;
    private String zzm = "";
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private by3 zzq = sx3.m20713x();
    private int zzr;

    static {
        C2692ob obVar = new C2692ob();
        zzb = obVar;
        sx3.m20701B(C2692ob.class, obVar);
    }

    private C2692ob() {
    }

    /* renamed from: G */
    public static C2507jb m17665G() {
        return (C2507jb) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m17667I(C2692ob obVar, long j) {
        obVar.zze |= 2;
        obVar.zzg = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m17668J(C2692ob obVar, String str) {
        str.getClass();
        obVar.zze |= 4;
        obVar.zzh = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m17669K(C2692ob obVar, String str) {
        str.getClass();
        obVar.zze |= 8;
        obVar.zzi = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m17670L(C2692ob obVar, String str) {
        obVar.zze |= 16;
        obVar.zzj = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m17671M(C2692ob obVar, String str) {
        obVar.zze |= 1024;
        obVar.zzp = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m17672N(C2692ob obVar, String str) {
        str.getClass();
        obVar.zze |= 1;
        obVar.zzf = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m17673O(C2692ob obVar, int i) {
        obVar.zzr = i - 1;
        obVar.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", C2581lb.class, "zzr", C2618mb.f13290a});
        } else if (i2 == 3) {
            return new C2692ob();
        } else {
            if (i2 == 4) {
                return new C2507jb((C2469ib) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
