package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class po3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final po3 zzb;
    private vo3 zze;
    private mr3 zzf;

    static {
        po3 po3 = new po3();
        zzb = po3;
        sx3.m20701B(po3.class, po3);
    }

    private po3() {
    }

    /* renamed from: G */
    public static oo3 m18701G() {
        return (oo3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static po3 m18703I(jw3 jw3, ex3 ex3) throws ey3 {
        return (po3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: L */
    static /* synthetic */ void m18704L(po3 po3, vo3 vo3) {
        vo3.getClass();
        po3.zze = vo3;
    }

    /* renamed from: M */
    static /* synthetic */ void m18705M(po3 po3, mr3 mr3) {
        mr3.getClass();
        po3.zzf = mr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new po3();
        } else {
            if (i2 == 4) {
                return new oo3((no3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final vo3 mo13319J() {
        vo3 vo3 = this.zze;
        return vo3 == null ? vo3.m22328J() : vo3;
    }

    /* renamed from: K */
    public final mr3 mo13320K() {
        mr3 mr3 = this.zzf;
        return mr3 == null ? mr3.m16663J() : mr3;
    }
}
