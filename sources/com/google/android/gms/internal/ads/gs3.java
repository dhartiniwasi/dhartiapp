package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gs3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final gs3 zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        gs3 gs3 = new gs3();
        zzb = gs3;
        sx3.m20701B(gs3.class, gs3);
    }

    private gs3() {
    }

    /* renamed from: G */
    public static fs3 m13499G() {
        return (fs3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static gs3 m13501I() {
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
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new gs3();
        } else {
            if (i2 == 4) {
                return new fs3((es3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final jw3 mo10634J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final String mo10635K() {
        return this.zze;
    }

    /* renamed from: N */
    public final int mo10636N() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
