package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.nw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2676nw extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2676nw zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private int zzi = AdError.NETWORK_ERROR_CODE;
    private C3085yx zzj;
    /* access modifiers changed from: private */
    public ay3 zzk = sx3.m20712v();
    private C2341ew zzl;
    private C2491iw zzm;
    private C2231bx zzn;
    private C2490iv zzo;
    private C2640mx zzp;
    private C2938uy zzq;
    private C2824rv zzr;

    static {
        C2676nw nwVar = new C2676nw();
        zzb = nwVar;
        sx3.m20701B(C2676nw.class, nwVar);
    }

    private C2676nw() {
    }

    /* renamed from: I */
    public static C2639mw m17296I() {
        return (C2639mw) zzb.mo14160D();
    }

    /* renamed from: L */
    static /* synthetic */ void m17298L(C2676nw nwVar, String str) {
        str.getClass();
        nwVar.zze |= 2;
        nwVar.zzg = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m17299M(C2676nw nwVar, Iterable iterable) {
        ay3 ay3 = nwVar.zzk;
        if (!ay3.mo8988e()) {
            int size = ay3.size();
            nwVar.zzk = ay3.mo8624g(size == 0 ? 10 : size + size);
        }
        sv3.m20652h(iterable, nwVar.zzk);
    }

    /* renamed from: O */
    static /* synthetic */ void m17301O(C2676nw nwVar, C2341ew ewVar) {
        ewVar.getClass();
        nwVar.zzl = ewVar;
        nwVar.zze |= 32;
    }

    /* renamed from: P */
    static /* synthetic */ void m17302P(C2676nw nwVar, C2490iv ivVar) {
        ivVar.getClass();
        nwVar.zzo = ivVar;
        nwVar.zze |= 256;
    }

    /* renamed from: Q */
    static /* synthetic */ void m17303Q(C2676nw nwVar, C2640mx mxVar) {
        mxVar.getClass();
        nwVar.zzp = mxVar;
        nwVar.zze |= 512;
    }

    /* renamed from: R */
    static /* synthetic */ void m17304R(C2676nw nwVar, C2938uy uyVar) {
        uyVar.getClass();
        nwVar.zzq = uyVar;
        nwVar.zze |= 1024;
    }

    /* renamed from: S */
    static /* synthetic */ void m17305S(C2676nw nwVar, C2824rv rvVar) {
        rvVar.getClass();
        nwVar.zzr = rvVar;
        nwVar.zze |= 2048;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C2565kw.f12309a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        } else if (i2 == 3) {
            return new C2676nw();
        } else {
            if (i2 == 4) {
                return new C2639mw((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final C2490iv mo12721G() {
        C2490iv ivVar = this.zzo;
        return ivVar == null ? C2490iv.m14564H() : ivVar;
    }

    /* renamed from: H */
    public final C2341ew mo12722H() {
        C2341ew ewVar = this.zzl;
        return ewVar == null ? C2341ew.m12278H() : ewVar;
    }

    /* renamed from: K */
    public final String mo12723K() {
        return this.zzg;
    }
}
