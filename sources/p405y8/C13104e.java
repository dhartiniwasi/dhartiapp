package p405y8;

import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: y8.e */
/* compiled from: BatchGetDocumentsResponse */
public final class C13104e extends C8260z<C13104e, C13106b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C13104e DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile C8143f1<C13104e> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private C8234t1 readTime_;
    private int resultCase_ = 0;
    private Object result_;
    private C8153i transaction_ = C8153i.f34908b;

    /* renamed from: y8.e$a */
    /* compiled from: BatchGetDocumentsResponse */
    static /* synthetic */ class C13105a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47358a;

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
                f47358a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47358a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13104e.C13105a.<clinit>():void");
        }
    }

    /* renamed from: y8.e$b */
    /* compiled from: BatchGetDocumentsResponse */
    public static final class C13106b extends C8260z.C8261a<C13104e, C13106b> implements C8249w0 {
        /* synthetic */ C13106b(C13105a aVar) {
            this();
        }

        private C13106b() {
            super(C13104e.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.e$c */
    /* compiled from: BatchGetDocumentsResponse */
    public enum C13107c {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);
        

        /* renamed from: a */
        private final int f47363a;

        private C13107c(int i) {
            this.f47363a = i;
        }

        /* renamed from: a */
        public static C13107c m61589a(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 1) {
                return FOUND;
            }
            if (i != 2) {
                return null;
            }
            return MISSING;
        }
    }

    static {
        C13104e eVar = new C13104e();
        DEFAULT_INSTANCE = eVar;
        C8260z.m45899X(C13104e.class, eVar);
    }

    private C13104e() {
    }

    /* renamed from: b0 */
    public static C13104e m61583b0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13105a.f47358a[fVar.ordinal()]) {
            case 1:
                return new C13104e();
            case 2:
                return new C13106b((C13105a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004\t", new Object[]{"result_", "resultCase_", C13123i.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13104e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13104e.class) {
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

    /* renamed from: c0 */
    public C13123i mo38160c0() {
        if (this.resultCase_ == 1) {
            return (C13123i) this.result_;
        }
        return C13123i.m61636e0();
    }

    /* renamed from: d0 */
    public String mo38161d0() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    /* renamed from: e0 */
    public C8234t1 mo38162e0() {
        C8234t1 t1Var = this.readTime_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: f0 */
    public C13107c mo38163f0() {
        return C13107c.m61589a(this.resultCase_);
    }
}
