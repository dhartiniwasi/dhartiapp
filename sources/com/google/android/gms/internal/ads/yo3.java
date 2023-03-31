package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yo3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final yo3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        yo3 yo3 = new yo3();
        zzb = yo3;
        sx3.m20701B(yo3.class, yo3);
    }

    private yo3() {
    }

    /* renamed from: H */
    public static xo3 m24123H() {
        return (xo3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static yo3 m24125J() {
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
            return new yo3();
        } else {
            if (i2 == 4) {
                return new xo3((wo3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo15479G() {
        return this.zze;
    }
}
