package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mo3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final mo3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private so3 zzf;
    private jr3 zzg;

    static {
        mo3 mo3 = new mo3();
        zzb = mo3;
        sx3.m20701B(mo3.class, mo3);
    }

    private mo3() {
    }

    /* renamed from: H */
    public static lo3 m16612H() {
        return (lo3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static mo3 m16614J(jw3 jw3, ex3 ex3) throws ey3 {
        return (mo3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: N */
    static /* synthetic */ void m16616N(mo3 mo3, so3 so3) {
        so3.getClass();
        mo3.zzf = so3;
    }

    /* renamed from: O */
    static /* synthetic */ void m16617O(mo3 mo3, jr3 jr3) {
        jr3.getClass();
        mo3.zzg = jr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new mo3();
        } else {
            if (i2 == 4) {
                return new lo3((ko3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo12386G() {
        return this.zze;
    }

    /* renamed from: K */
    public final so3 mo12387K() {
        so3 so3 = this.zzf;
        return so3 == null ? so3.m20544J() : so3;
    }

    /* renamed from: L */
    public final jr3 mo12388L() {
        jr3 jr3 = this.zzg;
        return jr3 == null ? jr3.m15028J() : jr3;
    }
}
