package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ts3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ts3 zzb;
    private gs3 zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        ts3 ts3 = new ts3();
        zzb = ts3;
        sx3.m20701B(ts3.class, ts3);
    }

    private ts3() {
    }

    /* renamed from: I */
    public static ss3 m21216I() {
        return (ss3) zzb.mo14160D();
    }

    /* renamed from: K */
    static /* synthetic */ void m21218K(ts3 ts3, gs3 gs3) {
        gs3.getClass();
        ts3.zze = gs3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new ts3();
        } else {
            if (i2 == 4) {
                return new ss3((qs3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo14377G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final gs3 mo14378H() {
        gs3 gs3 = this.zze;
        return gs3 == null ? gs3.m13501I() : gs3;
    }

    /* renamed from: M */
    public final boolean mo14379M() {
        return this.zze != null;
    }

    /* renamed from: N */
    public final int mo14380N() {
        int i = this.zzf;
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

    /* renamed from: O */
    public final int mo14381O() {
        int b = ot3.m18065b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
