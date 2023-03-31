package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ur3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ur3 zzb;
    private xr3 zze;

    static {
        ur3 ur3 = new ur3();
        zzb = ur3;
        sx3.m20701B(ur3.class, ur3);
    }

    private ur3() {
    }

    /* renamed from: G */
    public static tr3 m21827G() {
        return (tr3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static ur3 m21829I(jw3 jw3, ex3 ex3) throws ey3 {
        return (ur3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: K */
    static /* synthetic */ void m21830K(ur3 ur3, xr3 xr3) {
        xr3.getClass();
        ur3.zze = xr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ur3();
        } else {
            if (i2 == 4) {
                return new tr3((sr3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final xr3 mo14601J() {
        xr3 xr3 = this.zze;
        return xr3 == null ? xr3.m23517I() : xr3;
    }
}
