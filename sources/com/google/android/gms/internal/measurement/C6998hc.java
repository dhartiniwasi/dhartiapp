package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hc */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public enum C6998hc {
    DOUBLE(C7014ic.DOUBLE, 1),
    FLOAT(C7014ic.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C7014ic.BOOLEAN, 0),
    STRING(C7014ic.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C7014ic.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C7014ic.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a */
    private final C7014ic f31740a;

    private C6998hc(C7014ic icVar, int i) {
        this.f31740a = icVar;
    }

    /* renamed from: a */
    public final C7014ic mo23513a() {
        return this.f31740a;
    }
}
