package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ij */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum C3409ij implements C3491l2 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private static final C3524m2 f22165h = null;

    /* renamed from: a */
    private final int f22167a;

    static {
        f22165h = new C3376hj();
    }

    private C3409ij(int i) {
        this.f22167a = i;
    }

    /* renamed from: a */
    public static C3409ij m25815a(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f22167a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
