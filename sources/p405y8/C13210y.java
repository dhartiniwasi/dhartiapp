package p405y8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p405y8.C13182x;

/* renamed from: y8.y */
/* compiled from: Target */
public final class C13210y extends C8260z<C13210y, C13212b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C13210y DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile C8143f1<C13210y> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private int resumeTypeCase_ = 0;
    private Object resumeType_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* renamed from: y8.y$a */
    /* compiled from: Target */
    static /* synthetic */ class C13211a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47464a;

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
                f47464a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47464a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13210y.C13211a.<clinit>():void");
        }
    }

    /* renamed from: y8.y$b */
    /* compiled from: Target */
    public static final class C13212b extends C8260z.C8261a<C13210y, C13212b> implements C8249w0 {
        /* synthetic */ C13212b(C13211a aVar) {
            this();
        }

        /* renamed from: D */
        public C13212b mo38299D(C13213c cVar) {
            mo27440u();
            ((C13210y) this.f35196b).m61968h0(cVar);
            return this;
        }

        /* renamed from: E */
        public C13212b mo38300E(C13215d dVar) {
            mo27440u();
            ((C13210y) this.f35196b).m61969i0(dVar);
            return this;
        }

        /* renamed from: F */
        public C13212b mo38301F(C8234t1 t1Var) {
            mo27440u();
            ((C13210y) this.f35196b).m61970j0(t1Var);
            return this;
        }

        /* renamed from: G */
        public C13212b mo38302G(C8153i iVar) {
            mo27440u();
            ((C13210y) this.f35196b).m61971k0(iVar);
            return this;
        }

        /* renamed from: H */
        public C13212b mo38303H(int i) {
            mo27440u();
            ((C13210y) this.f35196b).m61972l0(i);
            return this;
        }

        private C13212b() {
            super(C13210y.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.y$c */
    /* compiled from: Target */
    public static final class C13213c extends C8260z<C13213c, C13214a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13213c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile C8143f1<C13213c> PARSER;
        private C8119d0.C8130j<String> documents_ = C8260z.m45886C();

        /* renamed from: y8.y$c$a */
        /* compiled from: Target */
        public static final class C13214a extends C8260z.C8261a<C13213c, C13214a> implements C8249w0 {
            /* synthetic */ C13214a(C13211a aVar) {
                this();
            }

            /* renamed from: D */
            public C13214a mo38306D(String str) {
                mo27440u();
                ((C13213c) this.f35196b).m61981c0(str);
                return this;
            }

            private C13214a() {
                super(C13213c.DEFAULT_INSTANCE);
            }
        }

        static {
            C13213c cVar = new C13213c();
            DEFAULT_INSTANCE = cVar;
            C8260z.m45899X(C13213c.class, cVar);
        }

        private C13213c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c0 */
        public void m61981c0(String str) {
            str.getClass();
            m61982d0();
            this.documents_.add(str);
        }

        /* renamed from: d0 */
        private void m61982d0() {
            C8119d0.C8130j<String> jVar = this.documents_;
            if (!jVar.mo26802F1()) {
                this.documents_ = C8260z.m45891N(jVar);
            }
        }

        /* renamed from: e0 */
        public static C13213c m61983e0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: h0 */
        public static C13214a m61984h0() {
            return (C13214a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13211a.f47464a[fVar.ordinal()]) {
                case 1:
                    return new C13213c();
                case 2:
                    return new C13214a((C13211a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13213c> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13213c.class) {
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
        public String mo38304f0(int i) {
            return this.documents_.get(i);
        }

        /* renamed from: g0 */
        public int mo38305g0() {
            return this.documents_.size();
        }
    }

    /* renamed from: y8.y$d */
    /* compiled from: Target */
    public static final class C13215d extends C8260z<C13215d, C13216a> implements C8249w0 {
        /* access modifiers changed from: private */
        public static final C13215d DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile C8143f1<C13215d> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private String parent_ = "";
        private int queryTypeCase_ = 0;
        private Object queryType_;

        /* renamed from: y8.y$d$a */
        /* compiled from: Target */
        public static final class C13216a extends C8260z.C8261a<C13215d, C13216a> implements C8249w0 {
            /* synthetic */ C13216a(C13211a aVar) {
                this();
            }

            /* renamed from: D */
            public C13216a mo38309D(String str) {
                mo27440u();
                ((C13215d) this.f35196b).m61994h0(str);
                return this;
            }

            /* renamed from: E */
            public C13216a mo38310E(C13182x.C13184b bVar) {
                mo27440u();
                ((C13215d) this.f35196b).m61995i0((C13182x) bVar.build());
                return this;
            }

            private C13216a() {
                super(C13215d.DEFAULT_INSTANCE);
            }
        }

        static {
            C13215d dVar = new C13215d();
            DEFAULT_INSTANCE = dVar;
            C8260z.m45899X(C13215d.class, dVar);
        }

        private C13215d() {
        }

        /* renamed from: d0 */
        public static C13215d m61992d0() {
            return DEFAULT_INSTANCE;
        }

        /* renamed from: g0 */
        public static C13216a m61993g0() {
            return (C13216a) DEFAULT_INSTANCE.mo27431w();
        }

        /* access modifiers changed from: private */
        /* renamed from: h0 */
        public void m61994h0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: i0 */
        public void m61995i0(C13182x xVar) {
            xVar.getClass();
            this.queryType_ = xVar;
            this.queryTypeCase_ = 2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: A */
        public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
            switch (C13211a.f47464a[fVar.ordinal()]) {
                case 1:
                    return new C13215d();
                case 2:
                    return new C13216a((C13211a) null);
                case 3:
                    return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", C13182x.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C8143f1<C13215d> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (C13215d.class) {
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
        public String mo38307e0() {
            return this.parent_;
        }

        /* renamed from: f0 */
        public C13182x mo38308f0() {
            if (this.queryTypeCase_ == 2) {
                return (C13182x) this.queryType_;
            }
            return C13182x.m61832l0();
        }
    }

    static {
        C13210y yVar = new C13210y();
        DEFAULT_INSTANCE = yVar;
        C8260z.m45899X(C13210y.class, yVar);
    }

    private C13210y() {
    }

    /* renamed from: g0 */
    public static C13212b m61967g0() {
        return (C13212b) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m61968h0(C13213c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m61969i0(C13215d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m61970j0(C8234t1 t1Var) {
        t1Var.getClass();
        this.resumeType_ = t1Var;
        this.resumeTypeCase_ = 11;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m61971k0(C8153i iVar) {
        iVar.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m61972l0(int i) {
        this.targetId_ = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13211a.f47464a[fVar.ordinal()]) {
            case 1:
                return new C13210y();
            case 2:
                return new C13212b((C13211a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", C13215d.class, C13213c.class, "targetId_", "once_", C8234t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13210y> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13210y.class) {
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
