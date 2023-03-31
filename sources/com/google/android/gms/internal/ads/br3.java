package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class br3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final br3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public jw3 zzg = jw3.f11808b;

    static {
        br3 br3 = new br3();
        zzb = br3;
        sx3.m20701B(br3.class, br3);
    }

    private br3() {
    }

    /* renamed from: G */
    public static ar3 m10548G() {
        return (ar3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static br3 m10550I() {
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
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new br3();
        } else {
            if (i2 == 4) {
                return new ar3((zq3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final jw3 mo8922J() {
        return this.zzg;
    }

    /* renamed from: L */
    public final int mo8923L() {
        int i = this.zze;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: M */
    public final int mo8924M() {
        int b = fr3.m12809b(this.zzf);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
