package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum C3194c2 {
    DOUBLE(0, 1, r7),
    FLOAT(1, 1, r15),
    INT64(2, 1, r5),
    UINT64(3, 1, r5),
    INT32(4, 1, r12),
    FIXED64(5, 1, r5),
    FIXED32(6, 1, r12),
    BOOL(7, 1, r24),
    STRING(8, 1, r18),
    MESSAGE(9, 1, r20),
    BYTES(10, 1, r22),
    UINT32(11, 1, r5),
    ENUM(12, 1, r33),
    SFIXED32(13, 1, r5),
    SFIXED64(14, 1, r9),
    SINT32(15, 1, r12),
    SINT64(16, 1, r9),
    GROUP(17, 1, r20),
    DOUBLE_LIST(18, 2, r7),
    FLOAT_LIST(19, 2, r15),
    INT64_LIST(20, 2, r5),
    UINT64_LIST(21, 2, r5),
    INT32_LIST(22, 2, r12),
    FIXED64_LIST(23, 2, r9),
    FIXED32_LIST(24, 2, r12),
    BOOL_LIST(25, 2, r24),
    STRING_LIST(26, 2, r18),
    MESSAGE_LIST(27, 2, r20),
    BYTES_LIST(28, 2, r22),
    UINT32_LIST(29, 2, r12),
    ENUM_LIST(30, 2, r33),
    SFIXED32_LIST(31, 2, r12),
    SFIXED64_LIST(32, 2, r9),
    SINT32_LIST(33, 2, r12),
    SINT64_LIST(34, 2, r9),
    DOUBLE_LIST_PACKED(35, 3, r7),
    FLOAT_LIST_PACKED(36, 3, r15),
    INT64_LIST_PACKED(37, 3, r5),
    UINT64_LIST_PACKED(38, 3, r5),
    INT32_LIST_PACKED(39, 3, r12),
    FIXED64_LIST_PACKED(40, 3, r9),
    FIXED32_LIST_PACKED(41, 3, r12),
    BOOL_LIST_PACKED(42, 3, r24),
    UINT32_LIST_PACKED(43, 3, r12),
    ENUM_LIST_PACKED(44, 3, r33),
    SFIXED32_LIST_PACKED(45, 3, r12),
    SFIXED64_LIST_PACKED(46, 3, r9),
    SINT32_LIST_PACKED(47, 3, r12),
    SINT64_LIST_PACKED(48, 3, r9),
    GROUP_LIST(49, 2, r20),
    MAP(50, 4, C3722s2.VOID);
    

    /* renamed from: r0 */
    private static final C3194c2[] f21841r0 = null;

    /* renamed from: a */
    private final C3722s2 f21851a;

    /* renamed from: b */
    private final int f21852b;

    /* renamed from: c */
    private final Class f21853c;

    static {
        int i;
        f21841r0 = new C3194c2[r1];
        for (C3194c2 c2Var : values()) {
            f21841r0[c2Var.f21852b] = c2Var;
        }
    }

    private C3194c2(int i, int i2, C3722s2 s2Var) {
        this.f21852b = i;
        this.f21851a = s2Var;
        C3722s2 s2Var2 = C3722s2.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.f21853c = s2Var.mo16730a();
        } else if (i3 != 3) {
            this.f21853c = null;
        } else {
            this.f21853c = s2Var.mo16730a();
        }
        if (i2 == 1) {
            s2Var.ordinal();
        }
    }

    public final int zza() {
        return this.f21852b;
    }
}
