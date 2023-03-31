package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.uo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3810uo extends C3774tl implements Serializable {

    /* renamed from: a */
    private final Pattern f22783a;

    C3810uo(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f22783a = pattern;
    }

    /* renamed from: a */
    public final C3740sk mo16814a(CharSequence charSequence) {
        return new C3842vn(this.f22783a.matcher(charSequence));
    }

    public final String toString() {
        return this.f22783a.toString();
    }
}
