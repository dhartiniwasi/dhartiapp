package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3179bk extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3179bk zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        C3179bk bkVar = new C3179bk();
        zzb = bkVar;
        C3425j2.m25862j(C3179bk.class, bkVar);
    }

    private C3179bk() {
    }

    /* renamed from: A */
    public static C3146ak m25136A() {
        return (C3146ak) zzb.mo16211s();
    }

    /* renamed from: C */
    static /* synthetic */ void m25138C(C3179bk bkVar, String str) {
        str.getClass();
        bkVar.zzd = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C3179bk();
        } else {
            if (i2 == 4) {
                return new C3146ak((C3934yj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15807z() {
        return this.zzf;
    }
}
