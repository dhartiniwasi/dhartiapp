package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.iv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2490iv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2490iv zzb;
    private int zze;
    private int zzf;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private C3083yv zzh;
    private C2193aw zzi;
    private by3 zzj = sx3.m20713x();
    private C2267cw zzk;
    private C2714ox zzl;
    private C2305dx zzm;
    private C2825rw zzn;
    private C2899tw zzo;
    private by3 zzp = sx3.m20713x();

    static {
        C2490iv ivVar = new C2490iv();
        zzb = ivVar;
        sx3.m20701B(C2490iv.class, ivVar);
    }

    private C2490iv() {
    }

    /* renamed from: H */
    public static C2490iv m14564H() {
        return zzb;
    }

    /* renamed from: J */
    static /* synthetic */ void m14565J(C2490iv ivVar, C2378fv fvVar) {
        ivVar.zzf = fvVar.zza();
        ivVar.zze |= 1;
    }

    /* renamed from: K */
    static /* synthetic */ void m14566K(C2490iv ivVar, C2193aw awVar) {
        awVar.getClass();
        ivVar.zzi = awVar;
        ivVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", C2378fv.m12854b(), "zzg", C2565kw.f12309a, "zzh", "zzi", "zzj", C3009wv.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C2195ay.class});
        } else if (i2 == 3) {
            return new C2490iv();
        } else {
            if (i2 == 4) {
                return new C2452hv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final C2193aw mo11245I() {
        C2193aw awVar = this.zzi;
        return awVar == null ? C2193aw.m10021H() : awVar;
    }
}
