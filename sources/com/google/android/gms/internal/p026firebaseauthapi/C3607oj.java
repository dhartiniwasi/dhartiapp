package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.oj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3607oj extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3607oj zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public C3325g1 zze = C3325g1.f22056b;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        C3607oj ojVar = new C3607oj();
        zzb = ojVar;
        C3425j2.m25862j(C3607oj.class, ojVar);
    }

    private C3607oj() {
    }

    /* renamed from: B */
    public static C3607oj m26378B() {
        return zzb;
    }

    /* renamed from: F */
    static /* synthetic */ void m26379F(C3607oj ojVar, String str) {
        str.getClass();
        ojVar.zzd = str;
    }

    /* renamed from: z */
    public static C3574nj m26382z() {
        return (C3574nj) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3674qk mo16510C() {
        C3674qk a = C3674qk.m26581a(this.zzf);
        return a == null ? C3674qk.UNRECOGNIZED : a;
    }

    /* renamed from: D */
    public final C3325g1 mo16511D() {
        return this.zze;
    }

    /* renamed from: E */
    public final String mo16512E() {
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
            return new C3607oj();
        } else {
            if (i2 == 4) {
                return new C3574nj((C3541mj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
