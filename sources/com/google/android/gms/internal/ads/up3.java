package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class up3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final up3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        up3 up3 = new up3();
        zzb = up3;
        sx3.m20701B(up3.class, up3);
    }

    private up3() {
    }

    /* renamed from: H */
    public static tp3 m21775H() {
        return (tp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static up3 m21777J(jw3 jw3, ex3 ex3) throws ey3 {
        return (up3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new up3();
        } else {
            if (i2 == 4) {
                return new tp3((sp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14571G() {
        return this.zze;
    }
}
