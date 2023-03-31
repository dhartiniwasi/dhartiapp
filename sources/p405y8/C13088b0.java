package p405y8;

import com.google.protobuf.C8137e1;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p200c9.C6838a;
import p405y8.C13085b;
import p405y8.C13161s;

/* renamed from: y8.b0 */
/* compiled from: Value */
public final class C13088b0 extends C8260z<C13088b0, C13090b> implements C8249w0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    /* access modifiers changed from: private */
    public static final C13088b0 DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile C8143f1<C13088b0> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* renamed from: y8.b0$a */
    /* compiled from: Value */
    static /* synthetic */ class C13089a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47332a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z$f[] r0 = com.google.protobuf.C8260z.C8266f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47332a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47332a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13088b0.C13089a.<clinit>():void");
        }
    }

    /* renamed from: y8.b0$b */
    /* compiled from: Value */
    public static final class C13090b extends C8260z.C8261a<C13088b0, C13090b> implements C8249w0 {
        /* synthetic */ C13090b(C13089a aVar) {
            this();
        }

        /* renamed from: D */
        public C13161s mo38123D() {
            return ((C13088b0) this.f35196b).mo38118t0();
        }

        /* renamed from: E */
        public C13090b mo38124E(C13085b.C13087b bVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61491z0((C13085b) bVar.build());
            return this;
        }

        /* renamed from: F */
        public C13090b mo38125F(C13085b bVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61491z0(bVar);
            return this;
        }

        /* renamed from: G */
        public C13090b mo38126G(boolean z) {
            mo27440u();
            ((C13088b0) this.f35196b).m61467A0(z);
            return this;
        }

        /* renamed from: H */
        public C13090b mo38127H(C8153i iVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61468B0(iVar);
            return this;
        }

        /* renamed from: I */
        public C13090b mo38128I(double d) {
            mo27440u();
            ((C13088b0) this.f35196b).m61469C0(d);
            return this;
        }

        /* renamed from: J */
        public C13090b mo38129J(C6838a.C6840b bVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61470D0((C6838a) bVar.build());
            return this;
        }

        /* renamed from: K */
        public C13090b mo38130K(long j) {
            mo27440u();
            ((C13088b0) this.f35196b).m61471E0(j);
            return this;
        }

        /* renamed from: L */
        public C13090b mo38131L(C13161s.C13163b bVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61472F0((C13161s) bVar.build());
            return this;
        }

        /* renamed from: M */
        public C13090b mo38132M(C13161s sVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61472F0(sVar);
            return this;
        }

        /* renamed from: N */
        public C13090b mo38133N(C8137e1 e1Var) {
            mo27440u();
            ((C13088b0) this.f35196b).m61473G0(e1Var);
            return this;
        }

        /* renamed from: O */
        public C13090b mo38134O(String str) {
            mo27440u();
            ((C13088b0) this.f35196b).m61474H0(str);
            return this;
        }

        /* renamed from: P */
        public C13090b mo38135P(String str) {
            mo27440u();
            ((C13088b0) this.f35196b).m61475I0(str);
            return this;
        }

        /* renamed from: Q */
        public C13090b mo38136Q(C8234t1.C8236b bVar) {
            mo27440u();
            ((C13088b0) this.f35196b).m61476J0((C8234t1) bVar.build());
            return this;
        }

        private C13090b() {
            super(C13088b0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.b0$c */
    /* compiled from: Value */
    public enum C13091c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);
        

        /* renamed from: a */
        private final int f47346a;

        private C13091c(int i) {
            this.f47346a = i;
        }

        /* renamed from: a */
        public static C13091c m61518a(int i) {
            if (i == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (i == 1) {
                return BOOLEAN_VALUE;
            }
            if (i == 2) {
                return INTEGER_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 5) {
                return REFERENCE_VALUE;
            }
            if (i == 6) {
                return MAP_VALUE;
            }
            if (i == 17) {
                return STRING_VALUE;
            }
            if (i == 18) {
                return BYTES_VALUE;
            }
            switch (i) {
                case 8:
                    return GEO_POINT_VALUE;
                case 9:
                    return ARRAY_VALUE;
                case 10:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        C13088b0 b0Var = new C13088b0();
        DEFAULT_INSTANCE = b0Var;
        C8260z.m45899X(C13088b0.class, b0Var);
    }

    private C13088b0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m61467A0(boolean z) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m61468B0(C8153i iVar) {
        iVar.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m61469C0(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d);
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m61470D0(C6838a aVar) {
        aVar.getClass();
        this.valueType_ = aVar;
        this.valueTypeCase_ = 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m61471E0(long j) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m61472F0(C13161s sVar) {
        sVar.getClass();
        this.valueType_ = sVar;
        this.valueTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m61473G0(C8137e1 e1Var) {
        this.valueType_ = Integer.valueOf(e1Var.mo26872f());
        this.valueTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public void m61474H0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m61475I0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m61476J0(C8234t1 t1Var) {
        t1Var.getClass();
        this.valueType_ = t1Var;
        this.valueTypeCase_ = 10;
    }

    /* renamed from: p0 */
    public static C13088b0 m61489p0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: y0 */
    public static C13090b m61490y0() {
        return (C13090b) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m61491z0(C13085b bVar) {
        bVar.getClass();
        this.valueType_ = bVar;
        this.valueTypeCase_ = 9;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13089a.f47332a[fVar.ordinal()]) {
            case 1:
                return new C13088b0();
            case 2:
                return new C13090b((C13089a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", C13161s.class, C6838a.class, C13085b.class, C8234t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13088b0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13088b0.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new C8260z.C8262b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: m0 */
    public C13085b mo38112m0() {
        if (this.valueTypeCase_ == 9) {
            return (C13085b) this.valueType_;
        }
        return C13085b.m61454h0();
    }

    /* renamed from: n0 */
    public boolean mo38113n0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    /* renamed from: o0 */
    public C8153i mo38114o0() {
        if (this.valueTypeCase_ == 18) {
            return (C8153i) this.valueType_;
        }
        return C8153i.f34908b;
    }

    /* renamed from: q0 */
    public double mo38115q0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: r0 */
    public C6838a mo38116r0() {
        if (this.valueTypeCase_ == 8) {
            return (C6838a) this.valueType_;
        }
        return C6838a.m39384d0();
    }

    /* renamed from: s0 */
    public long mo38117s0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0;
    }

    /* renamed from: t0 */
    public C13161s mo38118t0() {
        if (this.valueTypeCase_ == 6) {
            return (C13161s) this.valueType_;
        }
        return C13161s.m61754c0();
    }

    /* renamed from: u0 */
    public String mo38119u0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    /* renamed from: v0 */
    public String mo38120v0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    /* renamed from: w0 */
    public C8234t1 mo38121w0() {
        if (this.valueTypeCase_ == 10) {
            return (C8234t1) this.valueType_;
        }
        return C8234t1.m45638d0();
    }

    /* renamed from: x0 */
    public C13091c mo38122x0() {
        return C13091c.m61518a(this.valueTypeCase_);
    }
}
