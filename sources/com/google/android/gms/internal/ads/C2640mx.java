package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2640mx extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2640mx zzb;
    private int zze;
    private by3 zzf = sx3.m20713x();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;
    private int zzm;

    static {
        C2640mx mxVar = new C2640mx();
        zzb = mxVar;
        sx3.m20701B(C2640mx.class, mxVar);
    }

    private C2640mx() {
    }

    /* renamed from: G */
    public static C2454hx m16789G() {
        return (C2454hx) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m16791I(C2640mx mxVar, Iterable iterable) {
        by3 by3 = mxVar.zzf;
        if (!by3.mo8988e()) {
            mxVar.zzf = sx3.m20714y(by3);
        }
        sv3.m20652h(iterable, mxVar.zzf);
    }

    /* renamed from: J */
    static /* synthetic */ void m16792J(C2640mx mxVar, int i) {
        mxVar.zze |= 1;
        mxVar.zzg = i;
    }

    /* renamed from: K */
    static /* synthetic */ void m16793K(C2640mx mxVar, int i) {
        mxVar.zze |= 2;
        mxVar.zzh = i;
    }

    /* renamed from: L */
    static /* synthetic */ void m16794L(C2640mx mxVar, long j) {
        mxVar.zze |= 4;
        mxVar.zzi = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m16795M(C2640mx mxVar, String str) {
        str.getClass();
        mxVar.zze |= 8;
        mxVar.zzj = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m16796N(C2640mx mxVar, String str) {
        str.getClass();
        mxVar.zze |= 16;
        mxVar.zzk = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m16797O(C2640mx mxVar, long j) {
        mxVar.zze |= 32;
        mxVar.zzl = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m16798P(C2640mx mxVar, int i) {
        mxVar.zze |= 64;
        mxVar.zzm = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zze", "zzf", C2417gx.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C2640mx();
        } else {
            if (i2 == 4) {
                return new C2454hx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
