package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pr3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final pr3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        pr3 pr3 = new pr3();
        zzb = pr3;
        sx3.m20701B(pr3.class, pr3);
    }

    private pr3() {
    }

    /* renamed from: H */
    public static or3 m18763H() {
        return (or3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static pr3 m18765J() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new pr3();
        } else {
            if (i2 == 4) {
                return new or3((nr3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo13351G() {
        return this.zzf;
    }

    /* renamed from: L */
    public final int mo13352L() {
        int b = fr3.m12809b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
