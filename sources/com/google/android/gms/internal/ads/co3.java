package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class co3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final co3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;
    private jo3 zzg;

    static {
        co3 co3 = new co3();
        zzb = co3;
        sx3.m20701B(co3.class, co3);
    }

    private co3() {
    }

    /* renamed from: H */
    public static bo3 m11032H() {
        return (bo3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static co3 m11034J(jw3 jw3, ex3 ex3) throws ey3 {
        return (co3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: O */
    static /* synthetic */ void m11037O(co3 co3, jo3 jo3) {
        jo3.getClass();
        co3.zzg = jo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new co3();
        } else {
            if (i2 == 4) {
                return new bo3((ao3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo9244G() {
        return this.zze;
    }

    /* renamed from: K */
    public final jo3 mo9245K() {
        jo3 jo3 = this.zzg;
        return jo3 == null ? jo3.m14994J() : jo3;
    }

    /* renamed from: L */
    public final jw3 mo9246L() {
        return this.zzf;
    }
}
