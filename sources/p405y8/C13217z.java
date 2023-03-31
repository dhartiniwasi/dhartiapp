package p405y8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import java.util.List;
import p192b9.C6726a;

/* renamed from: y8.z */
/* compiled from: TargetChange */
public final class C13217z extends C8260z<C13217z, C13219b> implements C8249w0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final C13217z DEFAULT_INSTANCE;
    private static volatile C8143f1<C13217z> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private C6726a cause_;
    private C8234t1 readTime_;
    private C8153i resumeToken_ = C8153i.f34908b;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private C8119d0.C8126g targetIds_ = C8260z.m45885B();

    /* renamed from: y8.z$a */
    /* compiled from: TargetChange */
    static /* synthetic */ class C13218a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47465a;

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
                f47465a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47465a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13217z.C13218a.<clinit>():void");
        }
    }

    /* renamed from: y8.z$b */
    /* compiled from: TargetChange */
    public static final class C13219b extends C8260z.C8261a<C13217z, C13219b> implements C8249w0 {
        /* synthetic */ C13219b(C13218a aVar) {
            this();
        }

        private C13219b() {
            super(C13217z.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.z$c */
    /* compiled from: TargetChange */
    public enum C13220c implements C8119d0.C8122c {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: h */
        private static final C8119d0.C8123d<C13220c> f47472h = null;

        /* renamed from: a */
        private final int f47474a;

        /* renamed from: y8.z$c$a */
        /* compiled from: TargetChange */
        class C13221a implements C8119d0.C8123d<C13220c> {
            C13221a() {
            }

            /* renamed from: b */
            public C13220c mo26873a(int i) {
                return C13220c.m62010a(i);
            }
        }

        static {
            f47472h = new C13221a();
        }

        private C13220c(int i) {
            this.f47474a = i;
        }

        /* renamed from: a */
        public static C13220c m62010a(int i) {
            if (i == 0) {
                return NO_CHANGE;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i == 3) {
                return CURRENT;
            }
            if (i != 4) {
                return null;
            }
            return RESET;
        }

        /* renamed from: f */
        public final int mo26872f() {
            if (this != UNRECOGNIZED) {
                return this.f47474a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C13217z zVar = new C13217z();
        DEFAULT_INSTANCE = zVar;
        C8260z.m45899X(C13217z.class, zVar);
    }

    private C13217z() {
    }

    /* renamed from: c0 */
    public static C13217z m62002c0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13218a.f47465a[fVar.ordinal()]) {
            case 1:
                return new C13217z();
            case 2:
                return new C13219b((C13218a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13217z> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13217z.class) {
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

    /* renamed from: b0 */
    public C6726a mo38311b0() {
        C6726a aVar = this.cause_;
        return aVar == null ? C6726a.m38625c0() : aVar;
    }

    /* renamed from: d0 */
    public C8234t1 mo38312d0() {
        C8234t1 t1Var = this.readTime_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: e0 */
    public C8153i mo38313e0() {
        return this.resumeToken_;
    }

    /* renamed from: f0 */
    public C13220c mo38314f0() {
        C13220c a = C13220c.m62010a(this.targetChangeType_);
        return a == null ? C13220c.UNRECOGNIZED : a;
    }

    /* renamed from: g0 */
    public int mo38315g0() {
        return this.targetIds_.size();
    }

    /* renamed from: h0 */
    public List<Integer> mo38316h0() {
        return this.targetIds_;
    }
}
