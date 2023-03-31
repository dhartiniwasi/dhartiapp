package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6922d4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6922d4 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private C7091n9 zzh = C6995h9.m40157n();
    private C7091n9 zzi = C6995h9.m40157n();
    /* access modifiers changed from: private */
    public C7091n9 zzj = C6995h9.m40157n();
    private String zzk = "";
    private boolean zzl;
    private C7091n9 zzm = C6995h9.m40157n();
    private C7091n9 zzn = C6995h9.m40157n();
    private String zzo = "";

    static {
        C6922d4 d4Var = new C6922d4();
        zza = d4Var;
        C6995h9.m40161u(C6922d4.class, d4Var);
    }

    private C6922d4() {
    }

    /* renamed from: G */
    public static C6905c4 m39900G() {
        return (C6905c4) zza.mo23500y();
    }

    /* renamed from: I */
    public static C6922d4 m39902I() {
        return zza;
    }

    /* renamed from: P */
    static /* synthetic */ void m39903P(C6922d4 d4Var, int i, C6888b4 b4Var) {
        b4Var.getClass();
        C7091n9 n9Var = d4Var.zzi;
        if (!n9Var.mo23698e()) {
            d4Var.zzi = C6995h9.m40158o(n9Var);
        }
        d4Var.zzi.set(i, b4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C6990h4.class, "zzi", C6888b4.class, "zzj", C6955f3.class, "zzk", "zzl", "zzm", C7167s5.class, "zzn", C7277z3.class, "zzo"});
        } else if (i2 == 3) {
            return new C6922d4();
        } else {
            if (i2 == 4) {
                return new C6905c4((C7229w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23307C() {
        return this.zzm.size();
    }

    /* renamed from: D */
    public final int mo23308D() {
        return this.zzi.size();
    }

    /* renamed from: E */
    public final long mo23309E() {
        return this.zze;
    }

    /* renamed from: F */
    public final C6888b4 mo23310F(int i) {
        return (C6888b4) this.zzi.get(i);
    }

    /* renamed from: J */
    public final String mo23311J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final String mo23312K() {
        return this.zzo;
    }

    /* renamed from: L */
    public final List mo23313L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final List mo23314M() {
        return this.zzn;
    }

    /* renamed from: N */
    public final List mo23315N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final List mo23316O() {
        return this.zzh;
    }

    /* renamed from: R */
    public final boolean mo23317R() {
        return this.zzl;
    }

    /* renamed from: S */
    public final boolean mo23318S() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: T */
    public final boolean mo23319T() {
        return (this.zzd & 1) != 0;
    }
}
