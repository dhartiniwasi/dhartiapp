package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ut3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ut3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;

    static {
        ut3 ut3 = new ut3();
        zzb = ut3;
        sx3.m20701B(ut3.class, ut3);
    }

    private ut3() {
    }

    /* renamed from: H */
    public static tt3 m21854H() {
        return (tt3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static ut3 m21856J(jw3 jw3, ex3 ex3) throws ey3 {
        return (ut3) sx3.m20707q(zzb, jw3, ex3);
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
            return new ut3();
        } else {
            if (i2 == 4) {
                return new tt3((st3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14624G() {
        return this.zze;
    }

    /* renamed from: K */
    public final jw3 mo14625K() {
        return this.zzf;
    }
}
