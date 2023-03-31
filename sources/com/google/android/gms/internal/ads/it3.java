package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class it3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final it3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private mt3 zzf;

    static {
        it3 it3 = new it3();
        zzb = it3;
        sx3.m20701B(it3.class, it3);
    }

    private it3() {
    }

    /* renamed from: H */
    public static ht3 m14551H() {
        return (ht3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static it3 m14553J(jw3 jw3, ex3 ex3) throws ey3 {
        return (it3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: M */
    static /* synthetic */ void m14555M(it3 it3, mt3 mt3) {
        mt3.getClass();
        it3.zzf = mt3;
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
            return new it3();
        } else {
            if (i2 == 4) {
                return new ht3((gt3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo11241G() {
        return this.zze;
    }

    /* renamed from: K */
    public final mt3 mo11242K() {
        mt3 mt3 = this.zzf;
        return mt3 == null ? mt3.m16702I() : mt3;
    }
}
