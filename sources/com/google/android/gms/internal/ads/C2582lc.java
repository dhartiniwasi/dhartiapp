package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.lc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2582lc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2582lc zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = AdError.NETWORK_ERROR_CODE;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = AdError.NETWORK_ERROR_CODE;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C2582lc lcVar = new C2582lc();
        zzb = lcVar;
        sx3.m20701B(C2582lc.class, lcVar);
    }

    private C2582lc() {
    }

    /* renamed from: G */
    public static C2545kc m15920G() {
        return (C2545kc) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m15922I(C2582lc lcVar, long j) {
        lcVar.zze |= 1;
        lcVar.zzf = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m15923J(C2582lc lcVar, long j) {
        lcVar.zze |= 2;
        lcVar.zzg = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m15924K(C2582lc lcVar, long j) {
        lcVar.zze |= 4;
        lcVar.zzh = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m15925L(C2582lc lcVar, long j) {
        lcVar.zze |= 8;
        lcVar.zzi = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m15926M(C2582lc lcVar) {
        lcVar.zze &= -9;
        lcVar.zzi = -1;
    }

    /* renamed from: N */
    static /* synthetic */ void m15927N(C2582lc lcVar, long j) {
        lcVar.zze |= 16;
        lcVar.zzj = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m15928O(C2582lc lcVar, long j) {
        lcVar.zze |= 32;
        lcVar.zzk = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m15929P(C2582lc lcVar, long j) {
        lcVar.zze |= 128;
        lcVar.zzm = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m15930Q(C2582lc lcVar, long j) {
        lcVar.zze |= 256;
        lcVar.zzn = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m15931R(C2582lc lcVar, long j) {
        lcVar.zze |= 512;
        lcVar.zzo = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m15932S(C2582lc lcVar, long j) {
        lcVar.zze |= 2048;
        lcVar.zzq = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m15933T(C2582lc lcVar, long j) {
        lcVar.zze |= 4096;
        lcVar.zzr = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m15934U(C2582lc lcVar, long j) {
        lcVar.zze |= 8192;
        lcVar.zzs = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m15935V(C2582lc lcVar, long j) {
        lcVar.zze |= 16384;
        lcVar.zzt = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m15936W(C2582lc lcVar, long j) {
        lcVar.zze |= 32768;
        lcVar.zzu = j;
    }

    /* renamed from: X */
    static /* synthetic */ void m15937X(C2582lc lcVar, long j) {
        lcVar.zze |= 65536;
        lcVar.zzv = j;
    }

    /* renamed from: Y */
    static /* synthetic */ void m15938Y(C2582lc lcVar, long j) {
        lcVar.zze |= 131072;
        lcVar.zzw = j;
    }

    /* renamed from: Z */
    static /* synthetic */ void m15939Z(C2582lc lcVar, long j) {
        lcVar.zze |= 262144;
        lcVar.zzx = j;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m15940a0(C2582lc lcVar, int i) {
        lcVar.zzl = i - 1;
        lcVar.zze |= 64;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m15941b0(C2582lc lcVar, int i) {
        lcVar.zzp = i - 1;
        lcVar.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            wx3 wx3 = C2953vc.f19003a;
            return sx3.m20700A(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", wx3, "zzm", "zzn", "zzo", "zzp", wx3, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new C2582lc();
        } else {
            if (i2 == 4) {
                return new C2545kc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
