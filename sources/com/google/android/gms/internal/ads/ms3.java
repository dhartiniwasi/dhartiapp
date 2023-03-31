package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ms3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final ms3 zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public jw3 zzf = jw3.f11808b;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        ms3 ms3 = new ms3();
        zzb = ms3;
        sx3.m20701B(ms3.class, ms3);
    }

    private ms3() {
    }

    /* renamed from: G */
    public static ls3 m16683G() {
        return (ls3) zzb.mo14160D();
    }

    /* renamed from: I */
    public static ms3 m16685I() {
        return zzb;
    }

    /* renamed from: L */
    static /* synthetic */ void m16686L(ms3 ms3, String str) {
        str.getClass();
        ms3.zze = str;
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
            return new ms3();
        } else {
            if (i2 == 4) {
                return new ls3((ks3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: J */
    public final jw3 mo12432J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final String mo12433K() {
        return this.zze;
    }

    /* renamed from: N */
    public final int mo12434N() {
        int b = ot3.m18065b(this.zzg);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
