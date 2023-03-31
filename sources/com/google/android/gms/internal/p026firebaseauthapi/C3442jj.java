package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3442jj extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3442jj zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public C3325g1 zze = C3325g1.f22056b;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        C3442jj jjVar = new C3442jj();
        zzb = jjVar;
        C3425j2.m25862j(C3442jj.class, jjVar);
    }

    private C3442jj() {
    }

    /* renamed from: C */
    public static C3442jj m25926C() {
        return zzb;
    }

    /* renamed from: z */
    public static C3343gj m25930z() {
        return (C3343gj) zzb.mo16211s();
    }

    /* renamed from: A */
    public final C3409ij mo16224A() {
        C3409ij a = C3409ij.m25815a(this.zzf);
        return a == null ? C3409ij.UNRECOGNIZED : a;
    }

    /* renamed from: D */
    public final C3325g1 mo16225D() {
        return this.zze;
    }

    /* renamed from: E */
    public final String mo16226E() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3442jj();
        } else {
            if (i2 == 4) {
                return new C3343gj((C3310fj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
