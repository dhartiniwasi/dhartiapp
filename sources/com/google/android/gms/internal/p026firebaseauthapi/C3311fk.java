package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3311fk extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3311fk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3410ik zze;

    static {
        C3311fk fkVar = new C3311fk();
        zzb = fkVar;
        C3425j2.m25862j(C3311fk.class, fkVar);
    }

    private C3311fk() {
    }

    /* renamed from: A */
    public static C3278ek m25577A() {
        return (C3278ek) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3311fk m25579C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3311fk) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: F */
    static /* synthetic */ void m25581F(C3311fk fkVar, C3410ik ikVar) {
        ikVar.getClass();
        fkVar.zze = ikVar;
    }

    /* renamed from: D */
    public final C3410ik mo16028D() {
        C3410ik ikVar = this.zze;
        return ikVar == null ? C3410ik.m25816A() : ikVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3311fk();
        } else {
            if (i2 == 4) {
                return new C3278ek((C3245dk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16029z() {
        return this.zzd;
    }
}
