package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3816uu extends C3260e2 {

    /* renamed from: g */
    final /* synthetic */ C3158b f22793g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3816uu(C3158b bVar, C3262e4 e4Var, CharSequence charSequence) {
        super(e4Var, charSequence);
        this.f22793g = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo15869d(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo15870e(int i) {
        CharSequence charSequence = this.f21970c;
        int length = charSequence.length();
        C3782tt.m27048b(i, length, "index");
        while (i < length) {
            if (charSequence.charAt(i) == '.') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
