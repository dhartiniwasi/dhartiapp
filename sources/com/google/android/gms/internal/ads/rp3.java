package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rp3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final rp3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;

    static {
        rp3 rp3 = new rp3();
        zzb = rp3;
        sx3.m20701B(rp3.class, rp3);
    }

    private rp3() {
    }

    /* renamed from: H */
    public static qp3 m19984H() {
        return (qp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static rp3 m19986J(jw3 jw3, ex3 ex3) throws ey3 {
        return (rp3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new rp3();
        } else {
            if (i2 == 4) {
                return new qp3((pp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo13868G() {
        return this.zze;
    }

    /* renamed from: K */
    public final jw3 mo13869K() {
        return this.zzf;
    }
}
