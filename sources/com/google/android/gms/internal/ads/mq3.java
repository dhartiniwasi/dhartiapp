package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mq3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final mq3 zzb;
    private ms3 zze;

    static {
        mq3 mq3 = new mq3();
        zzb = mq3;
        sx3.m20701B(mq3.class, mq3);
    }

    private mq3() {
    }

    /* renamed from: G */
    public static lq3 m16646G() {
        return (lq3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static mq3 m16648I() {
        return zzb;
    }

    /* renamed from: K */
    static /* synthetic */ void m16649K(mq3 mq3, ms3 ms3) {
        ms3.getClass();
        mq3.zze = ms3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new mq3();
        } else {
            if (i2 == 4) {
                return new lq3((kq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final ms3 mo12413J() {
        ms3 ms3 = this.zze;
        return ms3 == null ? ms3.m16685I() : ms3;
    }
}
