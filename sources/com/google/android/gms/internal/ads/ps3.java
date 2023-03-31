package com.google.android.gms.internal.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ps3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ps3 zzb;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        ps3 ps3 = new ps3();
        zzb = ps3;
        sx3.m20701B(ps3.class, ps3);
    }

    private ps3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new ps3();
        } else {
            if (i2 == 4) {
                return new os3((ns3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final int mo13357G() {
        return this.zzg;
    }

    /* renamed from: I */
    public final String mo13358I() {
        return this.zzi;
    }

    /* renamed from: J */
    public final String mo13359J() {
        return this.zze;
    }

    /* renamed from: K */
    public final String mo13360K() {
        return this.zzf;
    }

    /* renamed from: L */
    public final boolean mo13361L() {
        return this.zzh;
    }
}
