package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class aq3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final aq3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        aq3 aq3 = new aq3();
        zzb = aq3;
        sx3.m20701B(aq3.class, aq3);
    }

    private aq3() {
    }

    /* renamed from: H */
    public static zp3 m9945H() {
        return (zp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static aq3 m9947J(jw3 jw3, ex3 ex3) throws ey3 {
        return (aq3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new aq3();
        } else {
            if (i2 == 4) {
                return new zp3((yp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo8515G() {
        return this.zze;
    }
}
