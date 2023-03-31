package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3589o1 extends IOException {
    C3589o1(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    C3589o1(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
