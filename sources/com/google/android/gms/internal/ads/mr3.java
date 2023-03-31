package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mr3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final mr3 zzb;
    private pr3 zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        mr3 mr3 = new mr3();
        zzb = mr3;
        sx3.m20701B(mr3.class, mr3);
    }

    private mr3() {
    }

    /* renamed from: H */
    public static lr3 m16661H() {
        return (lr3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static mr3 m16663J() {
        return zzb;
    }

    /* renamed from: K */
    public static mr3 m16664K(jw3 jw3, ex3 ex3) throws ey3 {
        return (mr3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* renamed from: M */
    static /* synthetic */ void m16665M(mr3 mr3, pr3 pr3) {
        pr3.getClass();
        mr3.zze = pr3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new mr3();
        } else {
            if (i2 == 4) {
                return new lr3((kr3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo12418G() {
        return this.zzf;
    }

    /* renamed from: L */
    public final pr3 mo12419L() {
        pr3 pr3 = this.zze;
        return pr3 == null ? pr3.m18765J() : pr3;
    }
}
