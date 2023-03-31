package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s14 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final s14 zzb;
    private int zze;
    private String zzf = "";

    static {
        s14 s14 = new s14();
        zzb = s14;
        sx3.m20701B(s14.class, s14);
    }

    private s14() {
    }

    /* renamed from: G */
    public static r14 m20118G() {
        return (r14) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m20120I(s14 s14, String str) {
        s14.zze |= 1;
        s14.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new s14();
        } else {
            if (i2 == 4) {
                return new r14((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
