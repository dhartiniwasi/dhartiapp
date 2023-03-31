package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jz2 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final jz2 zzb;
    /* access modifiers changed from: private */
    public by3 zze = sx3.m20713x();

    static {
        jz2 jz2 = new jz2();
        zzb = jz2;
        sx3.m20701B(jz2.class, jz2);
    }

    private jz2() {
    }

    /* renamed from: H */
    public static gz2 m15135H() {
        return (gz2) zzb.mo14160D();
    }

    /* renamed from: K */
    static /* synthetic */ void m15138K(jz2 jz2, iz2 iz2) {
        iz2.getClass();
        by3 by3 = jz2.zze;
        if (!by3.mo8988e()) {
            jz2.zze = sx3.m20714y(by3);
        }
        jz2.zze.add(iz2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", iz2.class});
        } else if (i2 == 3) {
            return new jz2();
        } else {
            if (i2 == 4) {
                return new gz2((fz2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo11546G() {
        return this.zze.size();
    }
}
