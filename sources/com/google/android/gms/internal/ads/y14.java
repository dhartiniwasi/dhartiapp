package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y14 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final y14 zzb;
    private int zze;
    private jw3 zzf;
    private jw3 zzg;
    private byte zzh = 2;

    static {
        y14 y14 = new y14();
        zzb = y14;
        sx3.m20701B(y14.class, y14);
    }

    private y14() {
        jw3 jw3 = jw3.f11808b;
        this.zzf = jw3;
        this.zzg = jw3;
    }

    /* renamed from: G */
    public static x14 m23680G() {
        return (x14) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m23682I(y14 y14, jw3 jw3) {
        y14.zze |= 1;
        y14.zzf = jw3;
    }

    /* renamed from: J */
    static /* synthetic */ void m23683J(y14 y14, jw3 jw3) {
        y14.zze |= 2;
        y14.zzg = jw3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new y14();
        } else {
            if (i2 == 4) {
                return new x14((g14) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
