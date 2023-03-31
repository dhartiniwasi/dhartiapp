package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum e14 {
    DOUBLE(f14.DOUBLE, 1),
    FLOAT(f14.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(f14.BOOLEAN, 0),
    STRING(f14.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(f14.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(f14.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: a */
    private final f14 f8584a;

    private e14(f14 f14, int i) {
        this.f8584a = f14;
    }

    /* renamed from: a */
    public final f14 mo9751a() {
        return this.f8584a;
    }
}
