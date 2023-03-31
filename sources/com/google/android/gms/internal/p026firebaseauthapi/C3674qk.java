package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum C3674qk implements C3491l2 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private static final C3524m2 f22563h = null;

    /* renamed from: a */
    private final int f22565a;

    static {
        f22563h = new C3641pk();
    }

    private C3674qk(int i) {
        this.f22565a = i;
    }

    /* renamed from: a */
    public static C3674qk m26581a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f22565a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
