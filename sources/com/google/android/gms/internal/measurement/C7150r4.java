package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7150r4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7150r4 zza;
    private int zzd;
    /* access modifiers changed from: private */
    public C7091n9 zze = C6995h9.m40157n();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C7150r4 r4Var = new C7150r4();
        zza = r4Var;
        C6995h9.m40161u(C7150r4.class, r4Var);
    }

    private C7150r4() {
    }

    /* renamed from: G */
    public static C7134q4 m40779G() {
        return (C7134q4) zza.mo23500y();
    }

    /* renamed from: L */
    static /* synthetic */ void m40781L(C7150r4 r4Var, int i, C7214v4 v4Var) {
        v4Var.getClass();
        r4Var.m40789W();
        r4Var.zze.set(i, v4Var);
    }

    /* renamed from: M */
    static /* synthetic */ void m40782M(C7150r4 r4Var, C7214v4 v4Var) {
        v4Var.getClass();
        r4Var.m40789W();
        r4Var.zze.add(v4Var);
    }

    /* renamed from: N */
    static /* synthetic */ void m40783N(C7150r4 r4Var, Iterable iterable) {
        r4Var.m40789W();
        C7121p7.m40558g(iterable, r4Var.zze);
    }

    /* renamed from: P */
    static /* synthetic */ void m40785P(C7150r4 r4Var, int i) {
        r4Var.m40789W();
        r4Var.zze.remove(i);
    }

    /* renamed from: Q */
    static /* synthetic */ void m40786Q(C7150r4 r4Var, String str) {
        str.getClass();
        r4Var.zzd |= 1;
        r4Var.zzf = str;
    }

    /* renamed from: R */
    static /* synthetic */ void m40787R(C7150r4 r4Var, long j) {
        r4Var.zzd |= 2;
        r4Var.zzg = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m40788S(C7150r4 r4Var, long j) {
        r4Var.zzd |= 4;
        r4Var.zzh = j;
    }

    /* renamed from: W */
    private final void m40789W() {
        C7091n9 n9Var = this.zze;
        if (!n9Var.mo23698e()) {
            this.zze = C6995h9.m40158o(n9Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C7214v4.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C7150r4();
        } else {
            if (i2 == 4) {
                return new C7134q4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23807C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final int mo23808D() {
        return this.zze.size();
    }

    /* renamed from: E */
    public final long mo23809E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final long mo23810F() {
        return this.zzg;
    }

    /* renamed from: I */
    public final C7214v4 mo23811I(int i) {
        return (C7214v4) this.zze.get(i);
    }

    /* renamed from: J */
    public final String mo23812J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List mo23813K() {
        return this.zze;
    }

    /* renamed from: T */
    public final boolean mo23814T() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: U */
    public final boolean mo23815U() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: V */
    public final boolean mo23816V() {
        return (this.zzd & 2) != 0;
    }
}
