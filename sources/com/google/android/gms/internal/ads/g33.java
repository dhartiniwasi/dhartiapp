package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g33 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final g33 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private c33 zzi;

    static {
        g33 g33 = new g33();
        zzb = g33;
        sx3.m20701B(g33.class, g33);
    }

    private g33() {
    }

    /* renamed from: G */
    public static e33 m13020G() {
        return (e33) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m13022I(g33 g33, String str) {
        str.getClass();
        g33.zze |= 2;
        g33.zzg = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m13023J(g33 g33, c33 c33) {
        c33.getClass();
        g33.zzi = c33;
        g33.zze |= 8;
    }

    /* renamed from: K */
    static /* synthetic */ void m13024K(g33 g33, int i) {
        g33.zzf = 1;
        g33.zze = 1 | g33.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", f33.f9104a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new g33();
        } else {
            if (i2 == 4) {
                return new e33((d33) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
