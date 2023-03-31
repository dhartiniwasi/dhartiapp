package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bp3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final bp3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private ip3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        bp3 bp3 = new bp3();
        zzb = bp3;
        sx3.m20701B(bp3.class, bp3);
    }

    private bp3() {
    }

    /* renamed from: H */
    public static ap3 m10535H() {
        return (ap3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static bp3 m10537J(jw3 jw3, ex3 ex3) throws ey3 {
        return (bp3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: N */
    static /* synthetic */ void m10539N(bp3 bp3, ip3 ip3) {
        ip3.getClass();
        bp3.zzf = ip3;
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
            return new bp3();
        } else {
            if (i2 == 4) {
                return new ap3((zo3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo8918G() {
        return this.zze;
    }

    /* renamed from: K */
    public final ip3 mo8919K() {
        ip3 ip3 = this.zzf;
        return ip3 == null ? ip3.m14476J() : ip3;
    }

    /* renamed from: L */
    public final jw3 mo8920L() {
        return this.zzg;
    }
}
