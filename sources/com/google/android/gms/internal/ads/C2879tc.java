package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.tc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2879tc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2879tc zzb;
    private int zze;
    private jw3 zzf;
    private jw3 zzg;
    private jw3 zzh;
    private jw3 zzi;

    static {
        C2879tc tcVar = new C2879tc();
        zzb = tcVar;
        sx3.m20701B(C2879tc.class, tcVar);
    }

    private C2879tc() {
        jw3 jw3 = jw3.f11808b;
        this.zzf = jw3;
        this.zzg = jw3;
        this.zzh = jw3;
        this.zzi = jw3;
    }

    /* renamed from: G */
    public static C2842sc m20955G() {
        return (C2842sc) zzb.mo14160D();
    }

    /* renamed from: I */
    public static C2879tc m20957I(byte[] bArr, ex3 ex3) throws ey3 {
        return (C2879tc) sx3.m20709s(zzb, bArr, ex3);
    }

    /* renamed from: N */
    static /* synthetic */ void m20958N(C2879tc tcVar, jw3 jw3) {
        tcVar.zze |= 1;
        tcVar.zzf = jw3;
    }

    /* renamed from: O */
    static /* synthetic */ void m20959O(C2879tc tcVar, jw3 jw3) {
        tcVar.zze |= 2;
        tcVar.zzg = jw3;
    }

    /* renamed from: P */
    static /* synthetic */ void m20960P(C2879tc tcVar, jw3 jw3) {
        tcVar.zze |= 4;
        tcVar.zzh = jw3;
    }

    /* renamed from: Q */
    static /* synthetic */ void m20961Q(C2879tc tcVar, jw3 jw3) {
        tcVar.zze |= 8;
        tcVar.zzi = jw3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2879tc();
        } else {
            if (i2 == 4) {
                return new C2842sc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final jw3 mo14273J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final jw3 mo14274K() {
        return this.zzg;
    }

    /* renamed from: L */
    public final jw3 mo14275L() {
        return this.zzi;
    }

    /* renamed from: M */
    public final jw3 mo14276M() {
        return this.zzh;
    }
}
