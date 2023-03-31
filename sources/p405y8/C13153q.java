package p405y8;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8204o0;
import com.google.protobuf.C8208p0;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import java.util.Map;

/* renamed from: y8.q */
/* compiled from: ListenRequest */
public final class C13153q extends C8260z<C13153q, C13155b> implements C8249w0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C13153q DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile C8143f1<C13153q> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private String database_ = "";
    private C8208p0<String, String> labels_ = C8208p0.m45481e();
    private int targetChangeCase_ = 0;
    private Object targetChange_;

    /* renamed from: y8.q$a */
    /* compiled from: ListenRequest */
    static /* synthetic */ class C13154a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47397a;

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
                f47397a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47397a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13153q.C13154a.<clinit>():void");
        }
    }

    /* renamed from: y8.q$b */
    /* compiled from: ListenRequest */
    public static final class C13155b extends C8260z.C8261a<C13153q, C13155b> implements C8249w0 {
        /* synthetic */ C13155b(C13154a aVar) {
            this();
        }

        /* renamed from: D */
        public C13155b mo38216D(Map<String, String> map) {
            mo27440u();
            ((C13153q) this.f35196b).m61731g0().putAll(map);
            return this;
        }

        /* renamed from: E */
        public C13155b mo38217E(C13210y yVar) {
            mo27440u();
            ((C13153q) this.f35196b).m61734j0(yVar);
            return this;
        }

        /* renamed from: F */
        public C13155b mo38218F(String str) {
            mo27440u();
            ((C13153q) this.f35196b).m61735k0(str);
            return this;
        }

        /* renamed from: G */
        public C13155b mo38219G(int i) {
            mo27440u();
            ((C13153q) this.f35196b).m61736l0(i);
            return this;
        }

        private C13155b() {
            super(C13153q.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.q$c */
    /* compiled from: ListenRequest */
    private static final class C13156c {

        /* renamed from: a */
        static final C8204o0<String, String> f47398a;

        static {
            C8105b2.C8107b bVar = C8105b2.C8107b.STRING;
            f47398a = C8204o0.m45470d(bVar, "", bVar, "");
        }
    }

    static {
        C13153q qVar = new C13153q();
        DEFAULT_INSTANCE = qVar;
        C8260z.m45899X(C13153q.class, qVar);
    }

    private C13153q() {
    }

    /* renamed from: f0 */
    public static C13153q m61730f0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public Map<String, String> m61731g0() {
        return m61732h0();
    }

    /* renamed from: h0 */
    private C8208p0<String, String> m61732h0() {
        if (!this.labels_.mo27213i()) {
            this.labels_ = this.labels_.mo27216l();
        }
        return this.labels_;
    }

    /* renamed from: i0 */
    public static C13155b m61733i0() {
        return (C13155b) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m61734j0(C13210y yVar) {
        yVar.getClass();
        this.targetChange_ = yVar;
        this.targetChangeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m61735k0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m61736l0(int i) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13154a.f47397a[fVar.ordinal()]) {
            case 1:
                return new C13153q();
            case 2:
                return new C13155b((C13154a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", C13210y.class, "labels_", C13156c.f47398a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13153q> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13153q.class) {
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
