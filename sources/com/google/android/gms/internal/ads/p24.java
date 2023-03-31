package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final p24 zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private c24 zzh;
    private g24 zzi;
    private int zzj;
    private xx3 zzk = sx3.m20710t();
    private String zzl = "";
    private int zzm;
    private by3 zzn = sx3.m20713x();
    private byte zzo = 2;

    static {
        p24 p24 = new p24();
        zzb = p24;
        sx3.m20701B(p24.class, p24);
    }

    private p24() {
    }

    /* renamed from: H */
    public static o24 m18304H() {
        return (o24) zzb.mo14160D();
    }

    /* renamed from: K */
    static /* synthetic */ void m18306K(p24 p24, int i) {
        p24.zze |= 1;
        p24.zzf = i;
    }

    /* renamed from: L */
    static /* synthetic */ void m18307L(p24 p24, String str) {
        str.getClass();
        p24.zze |= 2;
        p24.zzg = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m18308M(p24 p24, c24 c24) {
        c24.getClass();
        p24.zzh = c24;
        p24.zze |= 4;
    }

    /* renamed from: N */
    static /* synthetic */ void m18309N(p24 p24, String str) {
        str.getClass();
        by3 by3 = p24.zzn;
        if (!by3.mo8988e()) {
            p24.zzn = sx3.m20714y(by3);
        }
        p24.zzn.add(str);
    }

    /* renamed from: O */
    static /* synthetic */ void m18310O(p24 p24, int i) {
        p24.zzm = i - 1;
        p24.zze |= 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", m24.f13197a, "zzn"});
        } else if (i2 == 3) {
            return new p24();
        } else {
            if (i2 == 4) {
                return new o24((g14) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }

    /* renamed from: G */
    public final int mo13121G() {
        return this.zzn.size();
    }

    /* renamed from: J */
    public final String mo13122J() {
        return this.zzg;
    }
}
