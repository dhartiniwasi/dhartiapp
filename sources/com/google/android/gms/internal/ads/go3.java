package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class go3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final go3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private jo3 zzf;

    static {
        go3 go3 = new go3();
        zzb = go3;
        sx3.m20701B(go3.class, go3);
    }

    private go3() {
    }

    /* renamed from: H */
    public static eo3 m13435H() {
        return (eo3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static go3 m13437J(jw3 jw3, ex3 ex3) throws ey3 {
        return (go3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: M */
    static /* synthetic */ void m13439M(go3 go3, jo3 jo3) {
        jo3.getClass();
        go3.zzf = jo3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new go3();
        } else {
            if (i2 == 4) {
                return new eo3((do3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo10594G() {
        return this.zze;
    }

    /* renamed from: K */
    public final jo3 mo10595K() {
        jo3 jo3 = this.zzf;
        return jo3 == null ? jo3.m14994J() : jo3;
    }
}
