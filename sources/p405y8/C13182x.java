package p405y8;

import com.google.protobuf.C8088a;
import com.google.protobuf.C8090a0;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import java.util.List;
import p405y8.C13120h;

/* renamed from: y8.x */
/* compiled from: StructuredQuery */
public final class C13182x extends C8260z<C13182x, C13184b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C13182x DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile C8143f1<C13182x> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private C13120h endAt_;
    private C8119d0.C8130j<C13185c> from_ = C8260z.m45886C();
    private C8090a0 limit_;
    private int offset_;
    private C8119d0.C8130j<C13202i> orderBy_ = C8260z.m45886C();
    private C13204j select_;
    private C13120h startAt_;
    private C13199h where_;

    /* renamed from: y8.x$a */
    /* compiled from: StructuredQuery */
    static /* synthetic */ class C13183a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47419a;

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
                f47419a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47419a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13182x.C13183a.<clinit>():void");
        }
    }

    /* renamed from: y8.x$b */
    /* compiled from: StructuredQuery */
    public static final class C13184b extends C8260z.C8261a<C13182x, C13184b> implements C8249w0 {
        /* synthetic */ C13184b(C13183a aVar) {
            this();
        }

        /* renamed from: D */
        public C13184b mo38258D(C13185c.C13186a aVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61828h0((C13185c) aVar.build());
            return this;
        }

        /* renamed from: E */
        public C13184b mo38259E(C13202i iVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61829i0(iVar);
            return this;
        }

        /* renamed from: F */
        public C13184b mo38260F(C13120h.C13122b bVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61834z0((C13120h) bVar.build());
            return this;
        }

        /* renamed from: G */
        public C13184b mo38261G(C8090a0.C8092b bVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61818A0((C8090a0) bVar.build());
            return this;
        }

        /* renamed from: H */
        public C13184b mo38262H(C13120h.C13122b bVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61819B0((C13120h) bVar.build());
            return this;
        }

        /* renamed from: I */
        public C13184b mo38263I(C13199h hVar) {
            mo27440u();
            ((C13182x) this.f35196b).m61820C0(hVar);
            return this;
        }

        private C13184b() {
            super(C13182x.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.x$c */
    /* compiled from: StructuredQuery */
    public static final class C13185c extends C8260z<C13185c, C13186a> implements C8249w0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final C13185c DEFAULT_INSTANCE;
        private static volatile C8143f1<C13185c> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* renamed from: y8.x$c$a */
        /* compiled from: StructuredQuery */
        public static final class C13186a extends C8260z.C8261a<C13185c, C13186a> implements C8249w0 {
            /* synthetic */ C13186a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13186a mo38266D(boolean z) {
                mo27440u();
                ((C13185c) this.f35196b).m61858g0(z);
                return this;
            }

            /* renamed from: E */
            public C13186a mo38267E(String str) {
                mo27440u();
                ((C13185c) this.f35196b).m61859h0(str);
                return this;
            }

            private C13186a() {
                super(C13185c.DEFAULT_INSTANCE);
            }
        }

        static {
            C13185c cVar = new C13185c();
            DEFAULT_INSTANCE = cVar;
            C8260z.m45899X(C13185c.class, cVar);
        }

        private C13185c() {
        }

        /* renamed from: f0 */
        public static C13186a m61857f0() {
            return (C13186a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public void m61858g0(boolean z) {
            this.allDescendants_ = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public void m61859h0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13185c();
                case 2:
                    return new C13186a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13185c> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13185c.class) {
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

        /* renamed from: d0 */
        public boolean mo38264d0() {
            return this.allDescendants_;
        }

        /* renamed from: e0 */
        public String mo38265e0() {
            return this.collectionId_;
        }
    }

    /* renamed from: y8.x$d */
    /* compiled from: StructuredQuery */
    public static final class C13187d extends C8260z<C13187d, C13188a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13187d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile C8143f1<C13187d> PARSER;
        private C8119d0.C8130j<C13199h> filters_ = C8260z.m45886C();
        private int op_;

        /* renamed from: y8.x$d$a */
        /* compiled from: StructuredQuery */
        public static final class C13188a extends C8260z.C8261a<C13187d, C13188a> implements C8249w0 {
            /* synthetic */ C13188a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13188a mo38270D(Iterable<? extends C13199h> iterable) {
                mo27440u();
                ((C13187d) this.f35196b).m61868d0(iterable);
                return this;
            }

            /* renamed from: E */
            public C13188a mo38271E(C13189b bVar) {
                mo27440u();
                ((C13187d) this.f35196b).m61872j0(bVar);
                return this;
            }

            private C13188a() {
                super(C13187d.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: y8.x$d$b */
        /* compiled from: StructuredQuery */
        public enum C13189b implements C8119d0.C8122c {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);
            

            /* renamed from: f */
            private static final C8119d0.C8123d<C13189b> f47424f = null;

            /* renamed from: a */
            private final int f47426a;

            /* renamed from: y8.x$d$b$a */
            /* compiled from: StructuredQuery */
            class C13190a implements C8119d0.C8123d<C13189b> {
                C13190a() {
                }

                /* renamed from: b */
                public C13189b mo26873a(int i) {
                    return C13189b.m61878a(i);
                }
            }

            static {
                f47424f = new C13190a();
            }

            private C13189b(int i) {
                this.f47426a = i;
            }

            /* renamed from: a */
            public static C13189b m61878a(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return AND;
                }
                if (i != 2) {
                    return null;
                }
                return OR;
            }

            /* renamed from: f */
            public final int mo26872f() {
                if (this != UNRECOGNIZED) {
                    return this.f47426a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C13187d dVar = new C13187d();
            DEFAULT_INSTANCE = dVar;
            C8260z.m45899X(C13187d.class, dVar);
        }

        private C13187d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d0 */
        public void m61868d0(Iterable<? extends C13199h> iterable) {
            m61869e0();
            C8088a.m44475k(iterable, this.filters_);
        }

        /* renamed from: e0 */
        private void m61869e0() {
            C8119d0.C8130j<C13199h> jVar = this.filters_;
            if (!jVar.mo26802F1()) {
                this.filters_ = C8260z.m45891N(jVar);
            }
        }

        /* renamed from: f0 */
        public static C13187d m61870f0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: i0 */
        public static C13188a m61871i0() {
            return (C13188a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: j0 */
        public void m61872j0(C13189b bVar) {
            this.op_ = bVar.mo26872f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13187d();
                case 2:
                    return new C13188a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", C13199h.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13187d> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13187d.class) {
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

        /* renamed from: g0 */
        public List<C13199h> mo38268g0() {
            return this.filters_;
        }

        /* renamed from: h0 */
        public C13189b mo38269h0() {
            C13189b a = C13189b.m61878a(this.op_);
            return a == null ? C13189b.UNRECOGNIZED : a;
        }
    }

    /* renamed from: y8.x$e */
    /* compiled from: StructuredQuery */
    public enum C13191e implements C8119d0.C8122c {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: f */
        private static final C8119d0.C8123d<C13191e> f47431f = null;

        /* renamed from: a */
        private final int f47433a;

        /* renamed from: y8.x$e$a */
        /* compiled from: StructuredQuery */
        class C13192a implements C8119d0.C8123d<C13191e> {
            C13192a() {
            }

            /* renamed from: b */
            public C13191e mo26873a(int i) {
                return C13191e.m61882a(i);
            }
        }

        static {
            f47431f = new C13192a();
        }

        private C13191e(int i) {
            this.f47433a = i;
        }

        /* renamed from: a */
        public static C13191e m61882a(int i) {
            if (i == 0) {
                return DIRECTION_UNSPECIFIED;
            }
            if (i == 1) {
                return ASCENDING;
            }
            if (i != 2) {
                return null;
            }
            return DESCENDING;
        }

        /* renamed from: f */
        public final int mo26872f() {
            if (this != UNRECOGNIZED) {
                return this.f47433a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: y8.x$f */
    /* compiled from: StructuredQuery */
    public static final class C13193f extends C8260z<C13193f, C13194a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13193f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile C8143f1<C13193f> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private C13197g field_;
        private int op_;
        private C13088b0 value_;

        /* renamed from: y8.x$f$a */
        /* compiled from: StructuredQuery */
        public static final class C13194a extends C8260z.C8261a<C13193f, C13194a> implements C8249w0 {
            /* synthetic */ C13194a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13194a mo38277D(C13197g gVar) {
                mo27440u();
                ((C13193f) this.f35196b).m61892j0(gVar);
                return this;
            }

            /* renamed from: E */
            public C13194a mo38278E(C13195b bVar) {
                mo27440u();
                ((C13193f) this.f35196b).m61893k0(bVar);
                return this;
            }

            /* renamed from: F */
            public C13194a mo38279F(C13088b0 b0Var) {
                mo27440u();
                ((C13193f) this.f35196b).m61894l0(b0Var);
                return this;
            }

            private C13194a() {
                super(C13193f.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: y8.x$f$b */
        /* compiled from: StructuredQuery */
        public enum C13195b implements C8119d0.C8122c {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);
            

            /* renamed from: v */
            private static final C8119d0.C8123d<C13195b> f47446v = null;

            /* renamed from: a */
            private final int f47448a;

            /* renamed from: y8.x$f$b$a */
            /* compiled from: StructuredQuery */
            class C13196a implements C8119d0.C8123d<C13195b> {
                C13196a() {
                }

                /* renamed from: b */
                public C13195b mo26873a(int i) {
                    return C13195b.m61902a(i);
                }
            }

            static {
                f47446v = new C13196a();
            }

            private C13195b(int i) {
                this.f47448a = i;
            }

            /* renamed from: a */
            public static C13195b m61902a(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            /* renamed from: f */
            public final int mo26872f() {
                if (this != UNRECOGNIZED) {
                    return this.f47448a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C13193f fVar = new C13193f();
            DEFAULT_INSTANCE = fVar;
            C8260z.m45899X(C13193f.class, fVar);
        }

        private C13193f() {
        }

        /* renamed from: e0 */
        public static C13193f m61890e0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: i0 */
        public static C13194a m61891i0() {
            return (C13194a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: j0 */
        public void m61892j0(C13197g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public void m61893k0(C13195b bVar) {
            this.op_ = bVar.mo26872f();
        }

        /* access modifiers changed from: private */
        /* renamed from: l0 */
        public void m61894l0(C13088b0 b0Var) {
            b0Var.getClass();
            this.value_ = b0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13193f();
                case 2:
                    return new C13194a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13193f> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13193f.class) {
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

        /* renamed from: f0 */
        public C13197g mo38274f0() {
            C13197g gVar = this.field_;
            return gVar == null ? C13197g.m61908c0() : gVar;
        }

        /* renamed from: g0 */
        public C13195b mo38275g0() {
            C13195b a = C13195b.m61902a(this.op_);
            return a == null ? C13195b.UNRECOGNIZED : a;
        }

        /* renamed from: h0 */
        public C13088b0 mo38276h0() {
            C13088b0 b0Var = this.value_;
            return b0Var == null ? C13088b0.m61489p0() : b0Var;
        }
    }

    /* renamed from: y8.x$g */
    /* compiled from: StructuredQuery */
    public static final class C13197g extends C8260z<C13197g, C13198a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13197g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile C8143f1<C13197g> PARSER;
        private String fieldPath_ = "";

        /* renamed from: y8.x$g$a */
        /* compiled from: StructuredQuery */
        public static final class C13198a extends C8260z.C8261a<C13197g, C13198a> implements C8249w0 {
            /* synthetic */ C13198a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13198a mo38282D(String str) {
                mo27440u();
                ((C13197g) this.f35196b).m61910f0(str);
                return this;
            }

            private C13198a() {
                super(C13197g.DEFAULT_INSTANCE);
            }
        }

        static {
            C13197g gVar = new C13197g();
            DEFAULT_INSTANCE = gVar;
            C8260z.m45899X(C13197g.class, gVar);
        }

        private C13197g() {
        }

        /* renamed from: c0 */
        public static C13197g m61908c0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: e0 */
        public static C13198a m61909e0() {
            return (C13198a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: f0 */
        public void m61910f0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13197g();
                case 2:
                    return new C13198a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13197g> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13197g.class) {
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

        /* renamed from: d0 */
        public String mo38281d0() {
            return this.fieldPath_;
        }
    }

    /* renamed from: y8.x$h */
    /* compiled from: StructuredQuery */
    public static final class C13199h extends C8260z<C13199h, C13200a> implements C8249w0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final C13199h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile C8143f1<C13199h> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* renamed from: y8.x$h$a */
        /* compiled from: StructuredQuery */
        public static final class C13200a extends C8260z.C8261a<C13199h, C13200a> implements C8249w0 {
            /* synthetic */ C13200a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13200a mo38287D(C13187d.C13188a aVar) {
                mo27440u();
                ((C13199h) this.f35196b).m61920k0((C13187d) aVar.build());
                return this;
            }

            /* renamed from: E */
            public C13200a mo38288E(C13193f.C13194a aVar) {
                mo27440u();
                ((C13199h) this.f35196b).m61921l0((C13193f) aVar.build());
                return this;
            }

            /* renamed from: F */
            public C13200a mo38289F(C13206k.C13207a aVar) {
                mo27440u();
                ((C13199h) this.f35196b).m61922m0((C13206k) aVar.build());
                return this;
            }

            private C13200a() {
                super(C13199h.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: y8.x$h$b */
        /* compiled from: StructuredQuery */
        public enum C13201b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);
            

            /* renamed from: a */
            private final int f47454a;

            private C13201b(int i) {
                this.f47454a = i;
            }

            /* renamed from: a */
            public static C13201b m61931a(int i) {
                if (i == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (i == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i == 2) {
                    return FIELD_FILTER;
                }
                if (i != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            C13199h hVar = new C13199h();
            DEFAULT_INSTANCE = hVar;
            C8260z.m45899X(C13199h.class, hVar);
        }

        private C13199h() {
        }

        /* renamed from: f0 */
        public static C13199h m61918f0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: j0 */
        public static C13200a m61919j0() {
            return (C13200a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: k0 */
        public void m61920k0(C13187d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* access modifiers changed from: private */
        /* renamed from: l0 */
        public void m61921l0(C13193f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: m0 */
        public void m61922m0(C13206k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13199h();
                case 2:
                    return new C13200a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", C13187d.class, C13193f.class, C13206k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13199h> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13199h.class) {
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

        /* renamed from: e0 */
        public C13187d mo38283e0() {
            if (this.filterTypeCase_ == 1) {
                return (C13187d) this.filterType_;
            }
            return C13187d.m61870f0();
        }

        /* renamed from: g0 */
        public C13193f mo38284g0() {
            if (this.filterTypeCase_ == 2) {
                return (C13193f) this.filterType_;
            }
            return C13193f.m61890e0();
        }

        /* renamed from: h0 */
        public C13201b mo38285h0() {
            return C13201b.m61931a(this.filterTypeCase_);
        }

        /* renamed from: i0 */
        public C13206k mo38286i0() {
            if (this.filterTypeCase_ == 3) {
                return (C13206k) this.filterType_;
            }
            return C13206k.m61948d0();
        }
    }

    /* renamed from: y8.x$i */
    /* compiled from: StructuredQuery */
    public static final class C13202i extends C8260z<C13202i, C13203a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13202i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile C8143f1<C13202i> PARSER;
        private int direction_;
        private C13197g field_;

        /* renamed from: y8.x$i$a */
        /* compiled from: StructuredQuery */
        public static final class C13203a extends C8260z.C8261a<C13202i, C13203a> implements C8249w0 {
            /* synthetic */ C13203a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13203a mo38292D(C13191e eVar) {
                mo27440u();
                ((C13202i) this.f35196b).m61936g0(eVar);
                return this;
            }

            /* renamed from: E */
            public C13203a mo38293E(C13197g gVar) {
                mo27440u();
                ((C13202i) this.f35196b).m61937h0(gVar);
                return this;
            }

            private C13203a() {
                super(C13202i.DEFAULT_INSTANCE);
            }
        }

        static {
            C13202i iVar = new C13202i();
            DEFAULT_INSTANCE = iVar;
            C8260z.m45899X(C13202i.class, iVar);
        }

        private C13202i() {
        }

        /* renamed from: f0 */
        public static C13203a m61935f0() {
            return (C13203a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public void m61936g0(C13191e eVar) {
            this.direction_ = eVar.mo26872f();
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public void m61937h0(C13197g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13202i();
                case 2:
                    return new C13203a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13202i> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13202i.class) {
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

        /* renamed from: d0 */
        public C13191e mo38290d0() {
            C13191e a = C13191e.m61882a(this.direction_);
            return a == null ? C13191e.UNRECOGNIZED : a;
        }

        /* renamed from: e0 */
        public C13197g mo38291e0() {
            C13197g gVar = this.field_;
            return gVar == null ? C13197g.m61908c0() : gVar;
        }
    }

    /* renamed from: y8.x$j */
    /* compiled from: StructuredQuery */
    public static final class C13204j extends C8260z<C13204j, C13205a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13204j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile C8143f1<C13204j> PARSER;
        private C8119d0.C8130j<C13197g> fields_ = C8260z.m45886C();

        /* renamed from: y8.x$j$a */
        /* compiled from: StructuredQuery */
        public static final class C13205a extends C8260z.C8261a<C13204j, C13205a> implements C8249w0 {
            /* synthetic */ C13205a(C13183a aVar) {
                this();
            }

            private C13205a() {
                super(C13204j.DEFAULT_INSTANCE);
            }
        }

        static {
            C13204j jVar = new C13204j();
            DEFAULT_INSTANCE = jVar;
            C8260z.m45899X(C13204j.class, jVar);
        }

        private C13204j() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13204j();
                case 2:
                    return new C13205a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", C13197g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13204j> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13204j.class) {
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

    /* renamed from: y8.x$k */
    /* compiled from: StructuredQuery */
    public static final class C13206k extends C8260z<C13206k, C13207a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13206k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile C8143f1<C13206k> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* renamed from: y8.x$k$a */
        /* compiled from: StructuredQuery */
        public static final class C13207a extends C8260z.C8261a<C13206k, C13207a> implements C8249w0 {
            /* synthetic */ C13207a(C13183a aVar) {
                this();
            }

            /* renamed from: D */
            public C13207a mo38296D(C13197g gVar) {
                mo27440u();
                ((C13206k) this.f35196b).m61950h0(gVar);
                return this;
            }

            /* renamed from: E */
            public C13207a mo38297E(C13208b bVar) {
                mo27440u();
                ((C13206k) this.f35196b).m61951i0(bVar);
                return this;
            }

            private C13207a() {
                super(C13206k.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: y8.x$k$b */
        /* compiled from: StructuredQuery */
        public enum C13208b implements C8119d0.C8122c {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);
            

            /* renamed from: h */
            private static final C8119d0.C8123d<C13208b> f47461h = null;

            /* renamed from: a */
            private final int f47463a;

            /* renamed from: y8.x$k$b$a */
            /* compiled from: StructuredQuery */
            class C13209a implements C8119d0.C8123d<C13208b> {
                C13209a() {
                }

                /* renamed from: b */
                public C13208b mo26873a(int i) {
                    return C13208b.m61957a(i);
                }
            }

            static {
                f47461h = new C13209a();
            }

            private C13208b(int i) {
                this.f47463a = i;
            }

            /* renamed from: a */
            public static C13208b m61957a(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            /* renamed from: f */
            public final int mo26872f() {
                if (this != UNRECOGNIZED) {
                    return this.f47463a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            C13206k kVar = new C13206k();
            DEFAULT_INSTANCE = kVar;
            C8260z.m45899X(C13206k.class, kVar);
        }

        private C13206k() {
        }

        /* renamed from: d0 */
        public static C13206k m61948d0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: g0 */
        public static C13207a m61949g0() {
            return (C13207a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public void m61950h0(C13197g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: i0 */
        public void m61951i0(C13208b bVar) {
            this.op_ = bVar.mo26872f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13183a.f47419a[fVar.ordinal()]) {
                case 1:
                    return new C13206k();
                case 2:
                    return new C13207a((C13183a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", C13197g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13206k> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13206k.class) {
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

        /* renamed from: e0 */
        public C13197g mo38294e0() {
            if (this.operandTypeCase_ == 2) {
                return (C13197g) this.operandType_;
            }
            return C13197g.m61908c0();
        }

        /* renamed from: f0 */
        public C13208b mo38295f0() {
            C13208b a = C13208b.m61957a(this.op_);
            return a == null ? C13208b.UNRECOGNIZED : a;
        }
    }

    static {
        C13182x xVar = new C13182x();
        DEFAULT_INSTANCE = xVar;
        C8260z.m45899X(C13182x.class, xVar);
    }

    private C13182x() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m61818A0(C8090a0 a0Var) {
        a0Var.getClass();
        this.limit_ = a0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m61819B0(C13120h hVar) {
        hVar.getClass();
        this.startAt_ = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m61820C0(C13199h hVar) {
        hVar.getClass();
        this.where_ = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m61828h0(C13185c cVar) {
        cVar.getClass();
        m61830j0();
        this.from_.add(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m61829i0(C13202i iVar) {
        iVar.getClass();
        m61831k0();
        this.orderBy_.add(iVar);
    }

    /* renamed from: j0 */
    private void m61830j0() {
        C8119d0.C8130j<C13185c> jVar = this.from_;
        if (!jVar.mo26802F1()) {
            this.from_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: k0 */
    private void m61831k0() {
        C8119d0.C8130j<C13202i> jVar = this.orderBy_;
        if (!jVar.mo26802F1()) {
            this.orderBy_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: l0 */
    public static C13182x m61832l0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: y0 */
    public static C13184b m61833y0() {
        return (C13184b) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m61834z0(C13120h hVar) {
        hVar.getClass();
        this.endAt_ = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13183a.f47419a[fVar.ordinal()]) {
            case 1:
                return new C13182x();
            case 2:
                return new C13184b((C13183a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", C13185c.class, "where_", "orderBy_", C13202i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13182x> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13182x.class) {
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
    public C13120h mo38246m0() {
        C13120h hVar = this.endAt_;
        return hVar == null ? C13120h.m61624g0() : hVar;
    }

    /* renamed from: n0 */
    public C13185c mo38247n0(int i) {
        return this.from_.get(i);
    }

    /* renamed from: o0 */
    public int mo38248o0() {
        return this.from_.size();
    }

    /* renamed from: p0 */
    public C8090a0 mo38249p0() {
        C8090a0 a0Var = this.limit_;
        return a0Var == null ? C8090a0.m44492c0() : a0Var;
    }

    /* renamed from: q0 */
    public C13202i mo38250q0(int i) {
        return this.orderBy_.get(i);
    }

    /* renamed from: r0 */
    public int mo38251r0() {
        return this.orderBy_.size();
    }

    /* renamed from: s0 */
    public C13120h mo38252s0() {
        C13120h hVar = this.startAt_;
        return hVar == null ? C13120h.m61624g0() : hVar;
    }

    /* renamed from: t0 */
    public C13199h mo38253t0() {
        C13199h hVar = this.where_;
        return hVar == null ? C13199h.m61918f0() : hVar;
    }

    /* renamed from: u0 */
    public boolean mo38254u0() {
        return this.endAt_ != null;
    }

    /* renamed from: v0 */
    public boolean mo38255v0() {
        return this.limit_ != null;
    }

    /* renamed from: w0 */
    public boolean mo38256w0() {
        return this.startAt_ != null;
    }

    /* renamed from: x0 */
    public boolean mo38257x0() {
        return this.where_ != null;
    }
}
