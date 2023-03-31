package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6991h5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6991h5 zza;
    /* access modifiers changed from: private */
    public C7075m9 zzd = C6995h9.m40155l();
    /* access modifiers changed from: private */
    public C7075m9 zze = C6995h9.m40155l();
    /* access modifiers changed from: private */
    public C7091n9 zzf = C6995h9.m40157n();
    /* access modifiers changed from: private */
    public C7091n9 zzg = C6995h9.m40157n();

    static {
        C6991h5 h5Var = new C6991h5();
        zza = h5Var;
        C6995h9.m40161u(C6991h5.class, h5Var);
    }

    private C6991h5() {
    }

    /* renamed from: H */
    public static C6974g5 m40121H() {
        return (C6974g5) zza.mo23500y();
    }

    /* renamed from: J */
    public static C6991h5 m40123J() {
        return zza;
    }

    /* renamed from: P */
    static /* synthetic */ void m40124P(C6991h5 h5Var, Iterable iterable) {
        C7075m9 m9Var = h5Var.zzd;
        if (!m9Var.mo23698e()) {
            h5Var.zzd = C6995h9.m40156m(m9Var);
        }
        C7121p7.m40558g(iterable, h5Var.zzd);
    }

    /* renamed from: R */
    static /* synthetic */ void m40126R(C6991h5 h5Var, Iterable iterable) {
        C7075m9 m9Var = h5Var.zze;
        if (!m9Var.mo23698e()) {
            h5Var.zze = C6995h9.m40156m(m9Var);
        }
        C7121p7.m40558g(iterable, h5Var.zze);
    }

    /* renamed from: T */
    static /* synthetic */ void m40128T(C6991h5 h5Var, Iterable iterable) {
        h5Var.m40134Z();
        C7121p7.m40558g(iterable, h5Var.zzf);
    }

    /* renamed from: V */
    static /* synthetic */ void m40130V(C6991h5 h5Var, int i) {
        h5Var.m40134Z();
        h5Var.zzf.remove(i);
    }

    /* renamed from: W */
    static /* synthetic */ void m40131W(C6991h5 h5Var, Iterable iterable) {
        h5Var.m40135a0();
        C7121p7.m40558g(iterable, h5Var.zzg);
    }

    /* renamed from: Y */
    static /* synthetic */ void m40133Y(C6991h5 h5Var, int i) {
        h5Var.m40135a0();
        h5Var.zzg.remove(i);
    }

    /* renamed from: Z */
    private final void m40134Z() {
        C7091n9 n9Var = this.zzf;
        if (!n9Var.mo23698e()) {
            this.zzf = C6995h9.m40158o(n9Var);
        }
    }

    /* renamed from: a0 */
    private final void m40135a0() {
        C7091n9 n9Var = this.zzg;
        if (!n9Var.mo23698e()) {
            this.zzg = C6995h9.m40158o(n9Var);
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
            return C6995h9.m40160r(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C7118p4.class, "zzg", C7023j5.class});
        } else if (i2 == 3) {
            return new C6991h5();
        } else {
            if (i2 == 4) {
                return new C6974g5((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23475C() {
        return this.zzf.size();
    }

    /* renamed from: D */
    public final int mo23476D() {
        return this.zze.size();
    }

    /* renamed from: E */
    public final int mo23477E() {
        return this.zzg.size();
    }

    /* renamed from: F */
    public final int mo23478F() {
        return this.zzd.size();
    }

    /* renamed from: G */
    public final C7118p4 mo23479G(int i) {
        return (C7118p4) this.zzf.get(i);
    }

    /* renamed from: K */
    public final C7023j5 mo23480K(int i) {
        return (C7023j5) this.zzg.get(i);
    }

    /* renamed from: L */
    public final List mo23481L() {
        return this.zzf;
    }

    /* renamed from: M */
    public final List mo23482M() {
        return this.zze;
    }

    /* renamed from: N */
    public final List mo23483N() {
        return this.zzg;
    }

    /* renamed from: O */
    public final List mo23484O() {
        return this.zzd;
    }
}
