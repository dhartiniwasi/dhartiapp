package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cd */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2248cd extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2248cd zzb;
    private int zze;
    private by3 zzf = sx3.m20713x();
    private jw3 zzg = jw3.f11808b;
    private int zzh = 1;
    private int zzi = 1;

    static {
        C2248cd cdVar = new C2248cd();
        zzb = cdVar;
        sx3.m20701B(C2248cd.class, cdVar);
    }

    private C2248cd() {
    }

    /* renamed from: G */
    public static C2211bd m10847G() {
        return (C2211bd) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m10849I(C2248cd cdVar, jw3 jw3) {
        by3 by3 = cdVar.zzf;
        if (!by3.mo8988e()) {
            cdVar.zzf = sx3.m20714y(by3);
        }
        cdVar.zzf.add(jw3);
    }

    /* renamed from: J */
    static /* synthetic */ void m10850J(C2248cd cdVar, jw3 jw3) {
        cdVar.zze |= 1;
        cdVar.zzg = jw3;
    }

    /* renamed from: K */
    static /* synthetic */ void m10851K(C2248cd cdVar, int i) {
        cdVar.zzi = i - 1;
        cdVar.zze |= 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", C2990wc.f19574a, "zzi", C2916uc.f18491a});
        } else if (i2 == 3) {
            return new C2248cd();
        } else {
            if (i2 == 4) {
                return new C2211bd((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
