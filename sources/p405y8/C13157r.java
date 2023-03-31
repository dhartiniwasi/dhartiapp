package p405y8;

import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: y8.r */
/* compiled from: ListenResponse */
public final class C13157r extends C8260z<C13157r, C13159b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C13157r DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile C8143f1<C13157r> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* renamed from: y8.r$a */
    /* compiled from: ListenResponse */
    static /* synthetic */ class C13158a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47399a;

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
                f47399a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47399a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13157r.C13158a.<clinit>():void");
        }
    }

    /* renamed from: y8.r$b */
    /* compiled from: ListenResponse */
    public static final class C13159b extends C8260z.C8261a<C13157r, C13159b> implements C8249w0 {
        /* synthetic */ C13159b(C13158a aVar) {
            this();
        }

        private C13159b() {
            super(C13157r.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.r$c */
    /* compiled from: ListenResponse */
    public enum C13160c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);
        

        /* renamed from: a */
        private final int f47407a;

        private C13160c(int i) {
            this.f47407a = i;
        }

        /* renamed from: a */
        public static C13160c m61751a(int i) {
            if (i == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (i == 2) {
                return TARGET_CHANGE;
            }
            if (i == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i == 4) {
                return DOCUMENT_DELETE;
            }
            if (i == 5) {
                return FILTER;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        C13157r rVar = new C13157r();
        DEFAULT_INSTANCE = rVar;
        C8260z.m45899X(C13157r.class, rVar);
    }

    private C13157r() {
    }

    /* renamed from: b0 */
    public static C13157r m61743b0() {
        return DEFAULT_INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13158a.f47399a[fVar.ordinal()]) {
            case 1:
                return new C13157r();
            case 2:
                return new C13159b((C13158a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", C13217z.class, C13127j.class, C13130k.class, C13147o.class, C13136m.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13157r> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13157r.class) {
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
    public C13127j mo38220c0() {
        if (this.responseTypeCase_ == 3) {
            return (C13127j) this.responseType_;
        }
        return C13127j.m61651b0();
    }

    /* renamed from: d0 */
    public C13130k mo38221d0() {
        if (this.responseTypeCase_ == 4) {
            return (C13130k) this.responseType_;
        }
        return C13130k.m61657b0();
    }

    /* renamed from: e0 */
    public C13136m mo38222e0() {
        if (this.responseTypeCase_ == 6) {
            return (C13136m) this.responseType_;
        }
        return C13136m.m61673b0();
    }

    /* renamed from: f0 */
    public C13147o mo38223f0() {
        if (this.responseTypeCase_ == 5) {
            return (C13147o) this.responseType_;
        }
        return C13147o.m61711c0();
    }

    /* renamed from: g0 */
    public C13160c mo38224g0() {
        return C13160c.m61751a(this.responseTypeCase_);
    }

    /* renamed from: h0 */
    public C13217z mo38225h0() {
        if (this.responseTypeCase_ == 2) {
            return (C13217z) this.responseType_;
        }
        return C13217z.m62002c0();
    }
}
