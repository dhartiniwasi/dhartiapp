package p405y8;

import com.google.protobuf.C8101b0;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: y8.w */
/* compiled from: StructuredAggregationQuery */
public final class C13175w extends C8260z<C13175w, C13181c> implements C8249w0 {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C13175w DEFAULT_INSTANCE;
    private static volatile C8143f1<C13175w> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private C8119d0.C8130j<C13177b> aggregations_ = C8260z.m45886C();
    private int queryTypeCase_ = 0;
    private Object queryType_;

    /* renamed from: y8.w$a */
    /* compiled from: StructuredAggregationQuery */
    static /* synthetic */ class C13176a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47418a;

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
                f47418a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47418a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13175w.C13176a.<clinit>():void");
        }
    }

    /* renamed from: y8.w$b */
    /* compiled from: StructuredAggregationQuery */
    public static final class C13177b extends C8260z<C13177b, C13178a> implements C8249w0 {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int COUNT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C13177b DEFAULT_INSTANCE;
        private static volatile C8143f1<C13177b> PARSER;
        private String alias_ = "";
        private int operatorCase_ = 0;
        private Object operator_;

        /* renamed from: y8.w$b$a */
        /* compiled from: StructuredAggregationQuery */
        public static final class C13178a extends C8260z.C8261a<C13177b, C13178a> implements C8249w0 {
            /* synthetic */ C13178a(C13176a aVar) {
                this();
            }

            /* renamed from: D */
            public C13178a mo38242D(String str) {
                mo27440u();
                ((C13177b) this.f35196b).m61808e0(str);
                return this;
            }

            /* renamed from: E */
            public C13178a mo38243E(C13179b bVar) {
                mo27440u();
                ((C13177b) this.f35196b).m61809f0(bVar);
                return this;
            }

            private C13178a() {
                super(C13177b.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: y8.w$b$b */
        /* compiled from: StructuredAggregationQuery */
        public static final class C13179b extends C8260z<C13179b, C13180a> implements C8249w0 {
            /* access modifiers changed from: private */
            public static final C13179b DEFAULT_INSTANCE;
            private static volatile C8143f1<C13179b> PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private C8101b0 upTo_;

            /* renamed from: y8.w$b$b$a */
            /* compiled from: StructuredAggregationQuery */
            public static final class C13180a extends C8260z.C8261a<C13179b, C13180a> implements C8249w0 {
                /* synthetic */ C13180a(C13176a aVar) {
                    this();
                }

                private C13180a() {
                    super(C13179b.DEFAULT_INSTANCE);
                }
            }

            static {
                C13179b bVar = new C13179b();
                DEFAULT_INSTANCE = bVar;
                C8260z.m45899X(C13179b.class, bVar);
            }

            private C13179b() {
            }

            /* renamed from: b0 */
            public static C13179b m61814b0() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: protected */
            /* renamed from: A */
            public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
                switch (C13176a.f47418a[fVar.ordinal()]) {
                    case 1:
                        return new C13179b();
                    case 2:
                        return new C13180a((C13176a) null);
                    case 3:
                        return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"upTo_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        C8143f1<C13179b> f1Var = PARSER;
                        if (f1Var == null) {
                            synchronized (C13179b.class) {
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
        }

        static {
            C13177b bVar = new C13177b();
            DEFAULT_INSTANCE = bVar;
            C8260z.m45899X(C13177b.class, bVar);
        }

        private C13177b() {
        }

        /* renamed from: d0 */
        public static C13178a m61807d0() {
            return (C13178a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m61808e0(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: f0 */
        public void m61809f0(C13179b bVar) {
            bVar.getClass();
            this.operator_ = bVar;
            this.operatorCase_ = 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13176a.f47418a[fVar.ordinal()]) {
                case 1:
                    return new C13177b();
                case 2:
                    return new C13178a((C13176a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0007\u0002\u0000\u0000\u0000\u0001<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", C13179b.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13177b> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13177b.class) {
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
    }

    /* renamed from: y8.w$c */
    /* compiled from: StructuredAggregationQuery */
    public static final class C13181c extends C8260z.C8261a<C13175w, C13181c> implements C8249w0 {
        /* synthetic */ C13181c(C13176a aVar) {
            this();
        }

        /* renamed from: D */
        public C13181c mo38244D(C13177b.C13178a aVar) {
            mo27440u();
            ((C13175w) this.f35196b).m61799d0((C13177b) aVar.build());
            return this;
        }

        /* renamed from: E */
        public C13181c mo38245E(C13182x xVar) {
            mo27440u();
            ((C13175w) this.f35196b).m61802g0(xVar);
            return this;
        }

        private C13181c() {
            super(C13175w.DEFAULT_INSTANCE);
        }
    }

    static {
        C13175w wVar = new C13175w();
        DEFAULT_INSTANCE = wVar;
        C8260z.m45899X(C13175w.class, wVar);
    }

    private C13175w() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m61799d0(C13177b bVar) {
        bVar.getClass();
        m61800e0();
        this.aggregations_.add(bVar);
    }

    /* renamed from: e0 */
    private void m61800e0() {
        C8119d0.C8130j<C13177b> jVar = this.aggregations_;
        if (!jVar.mo26802F1()) {
            this.aggregations_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: f0 */
    public static C13181c m61801f0() {
        return (C13181c) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m61802g0(C13182x xVar) {
        xVar.getClass();
        this.queryType_ = xVar;
        this.queryTypeCase_ = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13176a.f47418a[fVar.ordinal()]) {
            case 1:
                return new C13175w();
            case 2:
                return new C13181c((C13176a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", C13182x.class, "aggregations_", C13177b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13175w> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13175w.class) {
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
}
