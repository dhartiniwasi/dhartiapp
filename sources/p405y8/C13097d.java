package p405y8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: y8.d */
/* compiled from: BatchGetDocumentsRequest */
public final class C13097d extends C8260z<C13097d, C13099b> implements C8249w0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C13097d DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile C8143f1<C13097d> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private String database_ = "";
    private C8119d0.C8130j<String> documents_ = C8260z.m45886C();
    private C13133l mask_;

    /* renamed from: y8.d$a */
    /* compiled from: BatchGetDocumentsRequest */
    static /* synthetic */ class C13098a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47355a;

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
                f47355a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47355a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13097d.C13098a.<clinit>():void");
        }
    }

    /* renamed from: y8.d$b */
    /* compiled from: BatchGetDocumentsRequest */
    public static final class C13099b extends C8260z.C8261a<C13097d, C13099b> implements C8249w0 {
        /* synthetic */ C13099b(C13098a aVar) {
            this();
        }

        /* renamed from: D */
        public C13099b mo38155D(String str) {
            mo27440u();
            ((C13097d) this.f35196b).m61560d0(str);
            return this;
        }

        /* renamed from: E */
        public C13099b mo38156E(String str) {
            mo27440u();
            ((C13097d) this.f35196b).m61564h0(str);
            return this;
        }

        private C13099b() {
            super(C13097d.DEFAULT_INSTANCE);
        }
    }

    static {
        C13097d dVar = new C13097d();
        DEFAULT_INSTANCE = dVar;
        C8260z.m45899X(C13097d.class, dVar);
    }

    private C13097d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m61560d0(String str) {
        str.getClass();
        m61561e0();
        this.documents_.add(str);
    }

    /* renamed from: e0 */
    private void m61561e0() {
        C8119d0.C8130j<String> jVar = this.documents_;
        if (!jVar.mo26802F1()) {
            this.documents_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: f0 */
    public static C13097d m61562f0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static C13099b m61563g0() {
        return (C13099b) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m61564h0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13098a.f47355a[fVar.ordinal()]) {
            case 1:
                return new C13097d();
            case 2:
                return new C13099b((C13098a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\t\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "database_", "documents_", "mask_", C13078a0.class, C8234t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13097d> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13097d.class) {
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
