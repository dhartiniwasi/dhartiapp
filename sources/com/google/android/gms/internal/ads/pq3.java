package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pq3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final pq3 zzb;
    private sq3 zze;

    static {
        pq3 pq3 = new pq3();
        zzb = pq3;
        sx3.m20701B(pq3.class, pq3);
    }

    private pq3() {
    }

    /* renamed from: G */
    public static oq3 m18725G() {
        return (oq3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static pq3 m18727I(jw3 jw3, ex3 ex3) throws ey3 {
        return (pq3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: K */
    static /* synthetic */ void m18728K(pq3 pq3, sq3 sq3) {
        sq3.getClass();
        pq3.zze = sq3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new pq3();
        } else {
            if (i2 == 4) {
                return new oq3((nq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final sq3 mo13328J() {
        sq3 sq3 = this.zze;
        return sq3 == null ? sq3.m20560J() : sq3;
    }
}
