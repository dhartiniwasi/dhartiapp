package p396x8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p405y8.C13182x;

/* renamed from: x8.a */
/* compiled from: BundledQuery */
public final class C12981a extends C8260z<C12981a, C12983b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C12981a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile C8143f1<C12981a> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private String parent_ = "";
    private int queryTypeCase_ = 0;
    private Object queryType_;

    /* renamed from: x8.a$a */
    /* compiled from: BundledQuery */
    static /* synthetic */ class C12982a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47238a;

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
                f47238a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47238a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p396x8.C12981a.C12982a.<clinit>():void");
        }
    }

    /* renamed from: x8.a$b */
    /* compiled from: BundledQuery */
    public static final class C12983b extends C8260z.C8261a<C12981a, C12983b> implements C8249w0 {
        /* synthetic */ C12983b(C12982a aVar) {
            this();
        }

        /* renamed from: D */
        public C12983b mo38044D(C12984c cVar) {
            mo27440u();
            ((C12981a) this.f35196b).m61185j0(cVar);
            return this;
        }

        /* renamed from: E */
        public C12983b mo38045E(String str) {
            mo27440u();
            ((C12981a) this.f35196b).m61186k0(str);
            return this;
        }

        /* renamed from: F */
        public C12983b mo38046F(C13182x xVar) {
            mo27440u();
            ((C12981a) this.f35196b).m61187l0(xVar);
            return this;
        }

        private C12983b() {
            super(C12981a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: x8.a$c */
    /* compiled from: BundledQuery */
    public enum C12984c implements C8119d0.C8122c {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private static final C8119d0.C8123d<C12984c> f47242e = null;

        /* renamed from: a */
        private final int f47244a;

        /* renamed from: x8.a$c$a */
        /* compiled from: BundledQuery */
        class C12985a implements C8119d0.C8123d<C12984c> {
            C12985a() {
            }

            /* renamed from: b */
            public C12984c mo26873a(int i) {
                return C12984c.m61195a(i);
            }
        }

        static {
            f47242e = new C12985a();
        }

        private C12984c(int i) {
            this.f47244a = i;
        }

        /* renamed from: a */
        public static C12984c m61195a(int i) {
            if (i == 0) {
                return FIRST;
            }
            if (i != 1) {
                return null;
            }
            return LAST;
        }

        /* renamed from: f */
        public final int mo26872f() {
            if (this != UNRECOGNIZED) {
                return this.f47244a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C12981a aVar = new C12981a();
        DEFAULT_INSTANCE = aVar;
        C8260z.m45899X(C12981a.class, aVar);
    }

    private C12981a() {
    }

    /* renamed from: h0 */
    public static C12983b m61183h0() {
        return (C12983b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: i0 */
    public static C12981a m61184i0(byte[] bArr) throws C8135e0 {
        return (C12981a) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m61185j0(C12984c cVar) {
        this.limitType_ = cVar.mo26872f();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m61186k0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m61187l0(C13182x xVar) {
        xVar.getClass();
        this.queryType_ = xVar;
        this.queryTypeCase_ = 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C12982a.f47238a[fVar.ordinal()]) {
            case 1:
                return new C12981a();
            case 2:
                return new C12983b((C12982a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", C13182x.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C12981a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C12981a.class) {
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
    public C12984c mo38041e0() {
        C12984c a = C12984c.m61195a(this.limitType_);
        return a == null ? C12984c.UNRECOGNIZED : a;
    }

    /* renamed from: f0 */
    public String mo38042f0() {
        return this.parent_;
    }

    /* renamed from: g0 */
    public C13182x mo38043g0() {
        if (this.queryTypeCase_ == 2) {
            return (C13182x) this.queryType_;
        }
        return C13182x.m61832l0();
    }
}
