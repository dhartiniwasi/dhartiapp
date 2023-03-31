package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dz2 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final dz2 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public long zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public int zzl;
    private int zzm;
    /* access modifiers changed from: private */
    public int zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private int zzp;
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    /* access modifiers changed from: private */
    public String zzt = "";
    private String zzu = "";

    static {
        dz2 dz2 = new dz2();
        zzb = dz2;
        sx3.m20701B(dz2.class, dz2);
    }

    private dz2() {
    }

    /* renamed from: G */
    public static cz2 m11770G() {
        return (cz2) zzb.mo14160D();
    }

    /* renamed from: I */
    static /* synthetic */ void m11772I(dz2 dz2, String str) {
        str.getClass();
        dz2.zzi = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m11773J(dz2 dz2, String str) {
        str.getClass();
        dz2.zzj = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m11774K(dz2 dz2, String str) {
        str.getClass();
        dz2.zzk = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m11778O(dz2 dz2, String str) {
        str.getClass();
        dz2.zzq = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m11779P(dz2 dz2, String str) {
        str.getClass();
        dz2.zzr = str;
    }

    /* renamed from: Q */
    static /* synthetic */ void m11780Q(dz2 dz2, String str) {
        str.getClass();
        dz2.zzs = str;
    }

    /* renamed from: T */
    static /* synthetic */ void m11783T(dz2 dz2, String str) {
        str.getClass();
        dz2.zzu = str;
    }

    /* renamed from: W */
    static /* synthetic */ void m11786W(dz2 dz2, int i) {
        if (i != 1) {
            dz2.zzm = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: X */
    static /* synthetic */ void m11787X(dz2 dz2, int i) {
        if (i != 1) {
            dz2.zzp = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        } else if (i2 == 3) {
            return new dz2();
        } else {
            if (i2 == 4) {
                return new cz2((bz2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
