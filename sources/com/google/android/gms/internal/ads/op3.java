package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class op3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final op3 zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        op3 op3 = new op3();
        zzb = op3;
        sx3.m20701B(op3.class, op3);
    }

    private op3() {
    }

    /* renamed from: H */
    public static np3 m18018H() {
        return (np3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static op3 m18020J(jw3 jw3, ex3 ex3) throws ey3 {
        return (op3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new op3();
        } else {
            if (i2 == 4) {
                return new np3((mp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo13019G() {
        return this.zze;
    }
}
