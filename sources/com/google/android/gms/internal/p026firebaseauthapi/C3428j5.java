package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum C3428j5 {
    DOUBLE(C3461k5.DOUBLE, 1),
    FLOAT(C3461k5.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C3461k5.BOOLEAN, 0),
    STRING(C3461k5.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C3461k5.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C3461k5.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a */
    private final C3461k5 f22211a;

    private C3428j5(C3461k5 k5Var, int i) {
        this.f22211a = k5Var;
    }

    /* renamed from: a */
    public final C3461k5 mo16215a() {
        return this.f22211a;
    }
}
