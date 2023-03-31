package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c33 extends sx3 implements dz3 {
    private static final yx3 zzb = new z23();
    /* access modifiers changed from: private */
    public static final c33 zze;
    private int zzf;
    private xx3 zzg = sx3.m20710t();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        c33 c33 = new c33();
        zze = c33;
        sx3.m20701B(c33.class, c33);
    }

    private c33() {
    }

    /* renamed from: G */
    public static b33 m10693G() {
        return (b33) zze.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m10695I(c33 c33, String str) {
        str.getClass();
        c33.zzf |= 1;
        c33.zzh = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m10696J(c33 c33, int i) {
        xx3 xx3 = c33.zzg;
        if (!xx3.mo8988e()) {
            c33.zzg = sx3.m20711u(xx3);
        }
        c33.zzg.mo14422i0(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", a33.f6397a, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new c33();
        } else {
            if (i2 == 4) {
                return new b33((z23) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
