package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ip3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ip3 zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        ip3 ip3 = new ip3();
        zzb = ip3;
        sx3.m20701B(ip3.class, ip3);
    }

    private ip3() {
    }

    /* renamed from: H */
    public static hp3 m14474H() {
        return (hp3) zzb.mo14160D();
    }

    /* renamed from: J */
    public static ip3 m14476J() {
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
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new ip3();
        } else {
            if (i2 == 4) {
                return new hp3((fp3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo11187G() {
        return this.zze;
    }
}
