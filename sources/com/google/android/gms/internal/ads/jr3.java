package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jr3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final jr3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private pr3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        jr3 jr3 = new jr3();
        zzb = jr3;
        sx3.m20701B(jr3.class, jr3);
    }

    private jr3() {
    }

    /* renamed from: H */
    public static hr3 m15026H() {
        return (hr3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static jr3 m15028J() {
        return zzb;
    }

    /* renamed from: K */
    public static jr3 m15029K(jw3 jw3, ex3 ex3) throws ey3 {
        return (jr3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: O */
    static /* synthetic */ void m15031O(jr3 jr3, pr3 pr3) {
        pr3.getClass();
        jr3.zzf = pr3;
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
            return new jr3();
        } else {
            if (i2 == 4) {
                return new hr3((gr3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo11485G() {
        return this.zze;
    }

    /* renamed from: L */
    public final pr3 mo11486L() {
        pr3 pr3 = this.zzf;
        return pr3 == null ? pr3.m18765J() : pr3;
    }

    /* renamed from: M */
    public final jw3 mo11487M() {
        return this.zzg;
    }
}
