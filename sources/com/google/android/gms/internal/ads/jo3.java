package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jo3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final jo3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        jo3 jo3 = new jo3();
        zzb = jo3;
        sx3.m20701B(jo3.class, jo3);
    }

    private jo3() {
    }

    /* renamed from: H */
    public static io3 m14992H() {
        return (io3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static jo3 m14994J() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new jo3();
        } else {
            if (i2 == 4) {
                return new io3((ho3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo11473G() {
        return this.zze;
    }
}
