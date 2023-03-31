package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3192c0 extends C3260e2 {

    /* renamed from: g */
    final /* synthetic */ C3740sk f21796g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3192c0(C3226d1 d1Var, C3262e4 e4Var, CharSequence charSequence, C3740sk skVar) {
        super(e4Var, charSequence);
        this.f21796g = skVar;
    }

    /* renamed from: d */
    public final int mo15869d(int i) {
        return ((C3842vn) this.f21796g).f22817a.end();
    }

    /* renamed from: e */
    public final int mo15870e(int i) {
        if (((C3842vn) this.f21796g).f22817a.find(i)) {
            return ((C3842vn) this.f21796g).f22817a.start();
        }
        return -1;
    }
}
