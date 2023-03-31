package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2824rv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2824rv zzb;
    private by3 zze = sx3.m20713x();

    static {
        C2824rv rvVar = new C2824rv();
        zzb = rvVar;
        sx3.m20701B(C2824rv.class, rvVar);
    }

    private C2824rv() {
    }

    /* renamed from: G */
    public static C2601lv m20046G() {
        return (C2601lv) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m20048I(C2824rv rvVar, C2564kv kvVar) {
        kvVar.getClass();
        by3 by3 = rvVar.zze;
        if (!by3.mo8988e()) {
            rvVar.zze = sx3.m20714y(by3);
        }
        rvVar.zze.add(kvVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2564kv.class});
        } else if (i2 == 3) {
            return new C2824rv();
        } else {
            if (i2 == 4) {
                return new C2601lv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
