package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zs3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final zs3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private by3 zzf = sx3.m20713x();

    static {
        zs3 zs3 = new zs3();
        zzb = zs3;
        sx3.m20701B(zs3.class, zs3);
    }

    private zs3() {
    }

    /* renamed from: G */
    public static ws3 m24777G() {
        return (ws3) zzb.mo14160D();
    }

    /* renamed from: J */
    static /* synthetic */ void m24780J(zs3 zs3, ys3 ys3) {
        ys3.getClass();
        by3 by3 = zs3.zzf;
        if (!by3.mo8988e()) {
            zs3.zzf = sx3.m20714y(by3);
        }
        zs3.zzf.add(ys3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", ys3.class});
        } else if (i2 == 3) {
            return new zs3();
        } else {
            if (i2 == 4) {
                return new ws3((vs3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
