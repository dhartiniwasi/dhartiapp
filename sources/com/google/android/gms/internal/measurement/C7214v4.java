package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7214v4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7214v4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public C7091n9 zzj = C6995h9.m40157n();

    static {
        C7214v4 v4Var = new C7214v4();
        zza = v4Var;
        C6995h9.m40161u(C7214v4.class, v4Var);
    }

    private C7214v4() {
    }

    /* renamed from: G */
    public static C7198u4 m41014G() {
        return (C7198u4) zza.mo23500y();
    }

    /* renamed from: L */
    static /* synthetic */ void m41016L(C7214v4 v4Var, String str) {
        str.getClass();
        v4Var.zzd |= 1;
        v4Var.zze = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m41017M(C7214v4 v4Var, String str) {
        str.getClass();
        v4Var.zzd |= 2;
        v4Var.zzf = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m41018N(C7214v4 v4Var) {
        v4Var.zzd &= -3;
        v4Var.zzf = zza.zzf;
    }

    /* renamed from: O */
    static /* synthetic */ void m41019O(C7214v4 v4Var, long j) {
        v4Var.zzd |= 4;
        v4Var.zzg = j;
    }

    /* renamed from: P */
    static /* synthetic */ void m41020P(C7214v4 v4Var) {
        v4Var.zzd &= -5;
        v4Var.zzg = 0;
    }

    /* renamed from: Q */
    static /* synthetic */ void m41021Q(C7214v4 v4Var, double d) {
        v4Var.zzd |= 16;
        v4Var.zzi = d;
    }

    /* renamed from: R */
    static /* synthetic */ void m41022R(C7214v4 v4Var) {
        v4Var.zzd &= -17;
        v4Var.zzi = 0.0d;
    }

    /* renamed from: S */
    static /* synthetic */ void m41023S(C7214v4 v4Var, C7214v4 v4Var2) {
        v4Var2.getClass();
        v4Var.m41026a0();
        v4Var.zzj.add(v4Var2);
    }

    /* renamed from: T */
    static /* synthetic */ void m41024T(C7214v4 v4Var, Iterable iterable) {
        v4Var.m41026a0();
        C7121p7.m40558g(iterable, v4Var.zzj);
    }

    /* renamed from: a0 */
    private final void m41026a0() {
        C7091n9 n9Var = this.zzj;
        if (!n9Var.mo23698e()) {
            this.zzj = C6995h9.m40158o(n9Var);
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
            return C6995h9.m40160r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C7214v4.class});
        } else if (i2 == 3) {
            return new C7214v4();
        } else {
            if (i2 == 4) {
                return new C7198u4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final double mo23945C() {
        return this.zzi;
    }

    /* renamed from: D */
    public final float mo23946D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final int mo23947E() {
        return this.zzj.size();
    }

    /* renamed from: F */
    public final long mo23948F() {
        return this.zzg;
    }

    /* renamed from: I */
    public final String mo23949I() {
        return this.zze;
    }

    /* renamed from: J */
    public final String mo23950J() {
        return this.zzf;
    }

    /* renamed from: K */
    public final List mo23951K() {
        return this.zzj;
    }

    /* renamed from: V */
    public final boolean mo23952V() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: W */
    public final boolean mo23953W() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: X */
    public final boolean mo23954X() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: Y */
    public final boolean mo23955Y() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Z */
    public final boolean mo23956Z() {
        return (this.zzd & 2) != 0;
    }
}
