package com.google.protobuf;

/* renamed from: com.google.protobuf.b2 */
/* compiled from: WireFormat */
public final class C8105b2 {

    /* renamed from: a */
    static final int f34806a = m44582c(1, 3);

    /* renamed from: b */
    static final int f34807b = m44582c(1, 4);

    /* renamed from: c */
    static final int f34808c = m44582c(2, 0);

    /* renamed from: d */
    static final int f34809d = m44582c(3, 2);

    /* renamed from: com.google.protobuf.b2$b */
    /* compiled from: WireFormat */
    public enum C8107b {
        DOUBLE(C8112c.DOUBLE, 1),
        FLOAT(C8112c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C8112c.BOOLEAN, 0),
        STRING(C8112c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(C8112c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(C8112c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a */
        private final C8112c f34829a;

        /* renamed from: b */
        private final int f34830b;

        /* renamed from: a */
        public C8112c mo26800a() {
            return this.f34829a;
        }

        /* renamed from: b */
        public int mo26801b() {
            return this.f34830b;
        }

        private C8107b(C8112c cVar, int i) {
            this.f34829a = cVar;
            this.f34830b = i;
        }
    }

    /* renamed from: com.google.protobuf.b2$c */
    /* compiled from: WireFormat */
    public enum C8112c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C8153i.f34908b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a */
        private final Object f34841a;

        private C8112c(Object obj) {
            this.f34841a = obj;
        }
    }

    /* renamed from: a */
    public static int m44580a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m44581b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m44582c(int i, int i2) {
        return (i << 3) | i2;
    }
}
