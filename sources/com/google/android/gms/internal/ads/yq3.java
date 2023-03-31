package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yq3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final yq3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private sq3 zzf;
    /* access modifiers changed from: private */
    public jw3 zzg;
    /* access modifiers changed from: private */
    public jw3 zzh;

    static {
        yq3 yq3 = new yq3();
        zzb = yq3;
        sx3.m20701B(yq3.class, yq3);
    }

    private yq3() {
        jw3 jw3 = jw3.f11808b;
        this.zzg = jw3;
        this.zzh = jw3;
    }

    /* renamed from: I */
    public static xq3 m24159I() {
        return (xq3) zzb.mo14160D();
    }

    /* renamed from: K */
    public static yq3 m24161K() {
        return zzb;
    }

    /* renamed from: L */
    public static yq3 m24162L(jw3 jw3, ex3 ex3) throws ey3 {
        return (yq3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: P */
    static /* synthetic */ void m24164P(yq3 yq3, sq3 sq3) {
        sq3.getClass();
        yq3.zzf = sq3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new yq3();
        } else {
            if (i2 == 4) {
                return new xq3((wq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo15500G() {
        return this.zze;
    }

    /* renamed from: H */
    public final sq3 mo15501H() {
        sq3 sq3 = this.zzf;
        return sq3 == null ? sq3.m20560J() : sq3;
    }

    /* renamed from: M */
    public final jw3 mo15502M() {
        return this.zzg;
    }

    /* renamed from: N */
    public final jw3 mo15503N() {
        return this.zzh;
    }
}
