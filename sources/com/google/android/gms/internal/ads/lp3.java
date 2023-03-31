package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lp3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final lp3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;

    static {
        lp3 lp3 = new lp3();
        zzb = lp3;
        sx3.m20701B(lp3.class, lp3);
    }

    private lp3() {
    }

    /* renamed from: H */
    public static kp3 m16085H() {
        return (kp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static lp3 m16087J(jw3 jw3, ex3 ex3) throws ey3 {
        return (lp3) sx3.m20707q(zzb, jw3, ex3);
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
            return new lp3();
        } else {
            if (i2 == 4) {
                return new kp3((jp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo12056G() {
        return this.zze;
    }

    /* renamed from: K */
    public final jw3 mo12057K() {
        return this.zzf;
    }
}
