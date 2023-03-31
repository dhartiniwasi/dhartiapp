package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class so3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final so3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private yo3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        so3 so3 = new so3();
        zzb = so3;
        sx3.m20701B(so3.class, so3);
    }

    private so3() {
    }

    /* renamed from: H */
    public static ro3 m20542H() {
        return (ro3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static so3 m20544J() {
        return zzb;
    }

    /* renamed from: K */
    public static so3 m20545K(jw3 jw3, ex3 ex3) throws ey3 {
        return (so3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: O */
    static /* synthetic */ void m20547O(so3 so3, yo3 yo3) {
        yo3.getClass();
        so3.zzf = yo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new so3();
        } else {
            if (i2 == 4) {
                return new ro3((qo3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14111G() {
        return this.zze;
    }

    /* renamed from: L */
    public final yo3 mo14112L() {
        yo3 yo3 = this.zzf;
        return yo3 == null ? yo3.m24125J() : yo3;
    }

    /* renamed from: M */
    public final jw3 mo14113M() {
        return this.zzg;
    }
}
