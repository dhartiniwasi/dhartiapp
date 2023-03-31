package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2698oh extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2698oh zzb;
    private int zze;
    private C2810rh zzf;
    private jw3 zzg;
    private jw3 zzh;

    static {
        C2698oh ohVar = new C2698oh();
        zzb = ohVar;
        sx3.m20701B(C2698oh.class, ohVar);
    }

    private C2698oh() {
        jw3 jw3 = jw3.f11808b;
        this.zzg = jw3;
        this.zzh = jw3;
    }

    /* renamed from: H */
    public static C2698oh m17773H(jw3 jw3, ex3 ex3) throws ey3 {
        return (C2698oh) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2698oh();
        } else {
            if (i2 == 4) {
                return new C2661nh((C2624mh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final C2810rh mo12916I() {
        C2810rh rhVar = this.zzf;
        return rhVar == null ? C2810rh.m19823L() : rhVar;
    }

    /* renamed from: J */
    public final jw3 mo12917J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final jw3 mo12918K() {
        return this.zzg;
    }
}
