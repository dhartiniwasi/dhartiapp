package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ft3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ft3 zzb;
    private String zze = "";

    static {
        ft3 ft3 = new ft3();
        zzb = ft3;
        sx3.m20701B(ft3.class, ft3);
    }

    private ft3() {
    }

    /* renamed from: H */
    public static ft3 m12845H() {
        return zzb;
    }

    /* renamed from: I */
    public static ft3 m12846I(jw3 jw3, ex3 ex3) throws ey3 {
        return (ft3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ft3();
        } else {
            if (i2 == 4) {
                return new et3((dt3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final String mo10296J() {
        return this.zze;
    }
}
