package p405y8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: y8.e0 */
/* compiled from: WriteResponse */
public final class C13108e0 extends C8260z<C13108e0, C13110b> implements C8249w0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C13108e0 DEFAULT_INSTANCE;
    private static volatile C8143f1<C13108e0> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private C8234t1 commitTime_;
    private String streamId_ = "";
    private C8153i streamToken_ = C8153i.f34908b;
    private C8119d0.C8130j<C13114f0> writeResults_ = C8260z.m45886C();

    /* renamed from: y8.e0$a */
    /* compiled from: WriteResponse */
    static /* synthetic */ class C13109a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47364a;

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
                f47364a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47364a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13108e0.C13109a.<clinit>():void");
        }
    }

    /* renamed from: y8.e0$b */
    /* compiled from: WriteResponse */
    public static final class C13110b extends C8260z.C8261a<C13108e0, C13110b> implements C8249w0 {
        /* synthetic */ C13110b(C13109a aVar) {
            this();
        }

        private C13110b() {
            super(C13108e0.DEFAULT_INSTANCE);
        }
    }

    static {
        C13108e0 e0Var = new C13108e0();
        DEFAULT_INSTANCE = e0Var;
        C8260z.m45899X(C13108e0.class, e0Var);
    }

    private C13108e0() {
    }

    /* renamed from: c0 */
    public static C13108e0 m61591c0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13109a.f47364a[fVar.ordinal()]) {
            case 1:
                return new C13108e0();
            case 2:
                return new C13110b((C13109a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\n\u0003\u001b\u0004\t", new Object[]{"streamId_", "streamToken_", "writeResults_", C13114f0.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13108e0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13108e0.class) {
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
    public C8234t1 mo38164b0() {
        C8234t1 t1Var = this.commitTime_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: d0 */
    public C8153i mo38165d0() {
        return this.streamToken_;
    }

    /* renamed from: e0 */
    public C13114f0 mo38166e0(int i) {
        return this.writeResults_.get(i);
    }

    /* renamed from: f0 */
    public int mo38167f0() {
        return this.writeResults_.size();
    }
}
