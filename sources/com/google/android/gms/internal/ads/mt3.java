package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mt3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final mt3 zzb;
    private String zze = "";
    private ms3 zzf;

    static {
        mt3 mt3 = new mt3();
        zzb = mt3;
        sx3.m20701B(mt3.class, mt3);
    }

    private mt3() {
    }

    /* renamed from: I */
    public static mt3 m16702I() {
        return zzb;
    }

    /* renamed from: J */
    public static mt3 m16703J(jw3 jw3, ex3 ex3) throws ey3 {
        return (mt3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new mt3();
        } else {
            if (i2 == 4) {
                return new lt3((jt3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final ms3 mo12435G() {
        ms3 ms3 = this.zzf;
        return ms3 == null ? ms3.m16685I() : ms3;
    }

    /* renamed from: K */
    public final String mo12436K() {
        return this.zze;
    }

    /* renamed from: L */
    public final boolean mo12437L() {
        return this.zzf != null;
    }
}
