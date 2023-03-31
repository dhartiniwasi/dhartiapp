package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sq3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final sq3 zzb;
    private br3 zze;
    private mq3 zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        sq3 sq3 = new sq3();
        zzb = sq3;
        sx3.m20701B(sq3.class, sq3);
    }

    private sq3() {
    }

    /* renamed from: H */
    public static rq3 m20558H() {
        return (rq3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static sq3 m20560J() {
        return zzb;
    }

    /* renamed from: L */
    static /* synthetic */ void m20561L(sq3 sq3, br3 br3) {
        br3.getClass();
        sq3.zze = br3;
    }

    /* renamed from: M */
    static /* synthetic */ void m20562M(sq3 sq3, mq3 mq3) {
        mq3.getClass();
        sq3.zzf = mq3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new sq3();
        } else {
            if (i2 == 4) {
                return new rq3((qq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final mq3 mo14120G() {
        mq3 mq3 = this.zzf;
        return mq3 == null ? mq3.m16648I() : mq3;
    }

    /* renamed from: K */
    public final br3 mo14121K() {
        br3 br3 = this.zze;
        return br3 == null ? br3.m10550I() : br3;
    }

    /* renamed from: N */
    public final int mo14122N() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
