package com.google.protobuf;

import java.lang.reflect.Type;

/* renamed from: com.google.protobuf.w */
/* compiled from: FieldType */
public enum C8246w {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, C8248b.MAP, C8145g0.VOID);
    

    /* renamed from: t0 */
    private static final C8246w[] f35136t0 = null;

    /* renamed from: u0 */
    private static final Type[] f35138u0 = null;

    /* renamed from: a */
    private final C8145g0 f35145a;

    /* renamed from: b */
    private final int f35146b;

    /* renamed from: c */
    private final C8248b f35147c;

    /* renamed from: d */
    private final Class<?> f35148d;

    /* renamed from: e */
    private final boolean f35149e;

    /* renamed from: com.google.protobuf.w$a */
    /* compiled from: FieldType */
    static /* synthetic */ class C8247a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35150a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f35151b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.g0[] r0 = com.google.protobuf.C8145g0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35151b = r0
                r1 = 1
                com.google.protobuf.g0 r2 = com.google.protobuf.C8145g0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35151b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.g0 r3 = com.google.protobuf.C8145g0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f35151b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.g0 r4 = com.google.protobuf.C8145g0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.w$b[] r3 = com.google.protobuf.C8246w.C8248b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f35150a = r3
                com.google.protobuf.w$b r4 = com.google.protobuf.C8246w.C8248b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f35150a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.w$b r3 = com.google.protobuf.C8246w.C8248b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f35150a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.w$b r1 = com.google.protobuf.C8246w.C8248b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8246w.C8247a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.w$b */
    /* compiled from: FieldType */
    enum C8248b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a */
        private final boolean f35157a;

        private C8248b(boolean z) {
            this.f35157a = z;
        }
    }

    static {
        int i;
        f35138u0 = new Type[0];
        C8246w[] values = values();
        f35136t0 = new C8246w[values.length];
        for (C8246w wVar : values) {
            f35136t0[wVar.f35146b] = wVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.protobuf.C8246w.C8247a.f35151b[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C8246w(int r4, com.google.protobuf.C8246w.C8248b r5, com.google.protobuf.C8145g0 r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f35146b = r4
            r1.f35147c = r5
            r1.f35145a = r6
            int[] r2 = com.google.protobuf.C8246w.C8247a.f35150a
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.f35148d = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.mo26915a()
            r1.f35148d = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.mo26915a()
            r1.f35148d = r2
        L_0x0028:
            r2 = 0
            com.google.protobuf.w$b r0 = com.google.protobuf.C8246w.C8248b.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.protobuf.C8246w.C8247a.f35151b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r1.f35149e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8246w.<init>(java.lang.String, int, int, com.google.protobuf.w$b, com.google.protobuf.g0):void");
    }

    /* renamed from: a */
    public int mo27345a() {
        return this.f35146b;
    }
}
