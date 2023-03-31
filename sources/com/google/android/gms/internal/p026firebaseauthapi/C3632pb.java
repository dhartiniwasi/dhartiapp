package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3632pb extends C3726s6 {

    /* renamed from: a */
    private final String f22504a;

    /* renamed from: b */
    private final C3674qk f22505b;

    /* synthetic */ C3632pb(String str, C3674qk qkVar, C3599ob obVar) {
        this.f22504a = str;
        this.f22505b = qkVar;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f22504a;
        C3674qk qkVar = this.f22505b;
        C3409ij ijVar = C3409ij.UNKNOWN_KEYMATERIAL;
        C3674qk qkVar2 = C3674qk.UNKNOWN_PREFIX;
        int ordinal = qkVar.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
