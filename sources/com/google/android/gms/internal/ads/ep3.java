package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ep3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ep3 zzb;
    private ip3 zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        ep3 ep3 = new ep3();
        zzb = ep3;
        sx3.m20701B(ep3.class, ep3);
    }

    private ep3() {
    }

    /* renamed from: H */
    public static dp3 m12233H() {
        return (dp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static ep3 m12235J(jw3 jw3, ex3 ex3) throws ey3 {
        return (ep3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: L */
    static /* synthetic */ void m12236L(ep3 ep3, ip3 ip3) {
        ip3.getClass();
        ep3.zze = ip3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ep3();
        } else {
            if (i2 == 4) {
                return new dp3((cp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo9993G() {
        return this.zzf;
    }

    /* renamed from: K */
    public final ip3 mo9994K() {
        ip3 ip3 = this.zze;
        return ip3 == null ? ip3.m14476J() : ip3;
    }
}
