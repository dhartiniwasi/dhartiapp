package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2810rh extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2810rh zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        C2810rh rhVar = new C2810rh();
        zzb = rhVar;
        sx3.m20701B(C2810rh.class, rhVar);
    }

    private C2810rh() {
    }

    /* renamed from: J */
    public static C2773qh m19821J() {
        return (C2773qh) zzb.mo14160D();
    }

    /* renamed from: L */
    public static C2810rh m19823L() {
        return zzb;
    }

    /* renamed from: M */
    public static C2810rh m19824M(jw3 jw3) throws ey3 {
        return (C2810rh) sx3.m20705o(zzb, jw3);
    }

    /* renamed from: N */
    public static C2810rh m19825N(jw3 jw3, ex3 ex3) throws ey3 {
        return (C2810rh) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: Q */
    static /* synthetic */ void m19826Q(C2810rh rhVar, String str) {
        str.getClass();
        rhVar.zze |= 1;
        rhVar.zzf = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m19827R(C2810rh rhVar, long j) {
        rhVar.zze |= 16;
        rhVar.zzj = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m19828S(C2810rh rhVar, String str) {
        str.getClass();
        rhVar.zze |= 2;
        rhVar.zzg = str;
    }

    /* renamed from: T */
    static /* synthetic */ void m19829T(C2810rh rhVar, long j) {
        rhVar.zze |= 4;
        rhVar.zzh = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m19830U(C2810rh rhVar, long j) {
        rhVar.zze |= 8;
        rhVar.zzi = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2810rh();
        } else {
            if (i2 == 4) {
                return new C2773qh((C2736ph) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final long mo13796G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final long mo13797H() {
        return this.zzh;
    }

    /* renamed from: I */
    public final long mo13798I() {
        return this.zzj;
    }

    /* renamed from: O */
    public final String mo13799O() {
        return this.zzg;
    }

    /* renamed from: P */
    public final String mo13800P() {
        return this.zzf;
    }
}
