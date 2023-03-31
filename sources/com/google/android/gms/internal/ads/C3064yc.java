package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3064yc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C3064yc zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private jw3 zzh = jw3.f11808b;

    static {
        C3064yc ycVar = new C3064yc();
        zzb = ycVar;
        sx3.m20701B(C3064yc.class, ycVar);
    }

    private C3064yc() {
    }

    /* renamed from: I */
    public static C3064yc m23927I() {
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
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C3064yc();
        } else {
            if (i2 == 4) {
                return new C3027xc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: G */
    public final long mo15417G() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo15418J() {
        return (this.zze & 1) != 0;
    }
}
