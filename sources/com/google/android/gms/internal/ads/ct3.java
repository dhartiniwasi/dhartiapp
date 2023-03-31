package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ct3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ct3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ft3 zzf;

    static {
        ct3 ct3 = new ct3();
        zzb = ct3;
        sx3.m20701B(ct3.class, ct3);
    }

    private ct3() {
    }

    /* renamed from: H */
    public static bt3 m11176H() {
        return (bt3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static ct3 m11178J(jw3 jw3, ex3 ex3) throws ey3 {
        return (ct3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: M */
    static /* synthetic */ void m11180M(ct3 ct3, ft3 ft3) {
        ft3.getClass();
        ct3.zzf = ft3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new ct3();
        } else {
            if (i2 == 4) {
                return new bt3((at3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo9348G() {
        return this.zze;
    }

    /* renamed from: K */
    public final ft3 mo9349K() {
        ft3 ft3 = this.zzf;
        return ft3 == null ? ft3.m12845H() : ft3;
    }
}
