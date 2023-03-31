package p229f8;

import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p405y8.C13123i;

/* renamed from: f8.a */
/* compiled from: MaybeDocument */
public final class C10144a extends C8260z<C10144a, C10146b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C10144a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile C8143f1<C10144a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: f8.a$a */
    /* compiled from: MaybeDocument */
    static /* synthetic */ class C10145a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40530a;

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
                f40530a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40530a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229f8.C10144a.C10145a.<clinit>():void");
        }
    }

    /* renamed from: f8.a$b */
    /* compiled from: MaybeDocument */
    public static final class C10146b extends C8260z.C8261a<C10144a, C10146b> implements C8249w0 {
        /* synthetic */ C10146b(C10145a aVar) {
            this();
        }

        /* renamed from: D */
        public C10146b mo32799D(C13123i iVar) {
            mo27440u();
            ((C10144a) this.f35196b).m51481m0(iVar);
            return this;
        }

        /* renamed from: E */
        public C10146b mo32800E(boolean z) {
            mo27440u();
            ((C10144a) this.f35196b).m51482n0(z);
            return this;
        }

        /* renamed from: F */
        public C10146b mo32801F(C10148b bVar) {
            mo27440u();
            ((C10144a) this.f35196b).m51483o0(bVar);
            return this;
        }

        /* renamed from: G */
        public C10146b mo32802G(C10155d dVar) {
            mo27440u();
            ((C10144a) this.f35196b).m51484p0(dVar);
            return this;
        }

        private C10146b() {
            super(C10144a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: f8.a$c */
    /* compiled from: MaybeDocument */
    public enum C10147c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);
        

        /* renamed from: a */
        private final int f40536a;

        private C10147c(int i) {
            this.f40536a = i;
        }

        /* renamed from: a */
        public static C10147c m51495a(int i) {
            if (i == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return NO_DOCUMENT;
            }
            if (i == 2) {
                return DOCUMENT;
            }
            if (i != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        C10144a aVar = new C10144a();
        DEFAULT_INSTANCE = aVar;
        C8260z.m45899X(C10144a.class, aVar);
    }

    private C10144a() {
    }

    /* renamed from: k0 */
    public static C10146b m51479k0() {
        return (C10146b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: l0 */
    public static C10144a m51480l0(byte[] bArr) throws C8135e0 {
        return (C10144a) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m51481m0(C13123i iVar) {
        iVar.getClass();
        this.documentType_ = iVar;
        this.documentTypeCase_ = 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m51482n0(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m51483o0(C10148b bVar) {
        bVar.getClass();
        this.documentType_ = bVar;
        this.documentTypeCase_ = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m51484p0(C10155d dVar) {
        dVar.getClass();
        this.documentType_ = dVar;
        this.documentTypeCase_ = 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C10145a.f40530a[fVar.ordinal()]) {
            case 1:
                return new C10144a();
            case 2:
                return new C10146b((C10145a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", C10148b.class, C13123i.class, C10155d.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10144a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10144a.class) {
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
    public C13123i mo32794f0() {
        if (this.documentTypeCase_ == 2) {
            return (C13123i) this.documentType_;
        }
        return C13123i.m61636e0();
    }

    /* renamed from: g0 */
    public C10147c mo32795g0() {
        return C10147c.m51495a(this.documentTypeCase_);
    }

    /* renamed from: h0 */
    public boolean mo32796h0() {
        return this.hasCommittedMutations_;
    }

    /* renamed from: i0 */
    public C10148b mo32797i0() {
        if (this.documentTypeCase_ == 1) {
            return (C10148b) this.documentType_;
        }
        return C10148b.m51499d0();
    }

    /* renamed from: j0 */
    public C10155d mo32798j0() {
        if (this.documentTypeCase_ == 3) {
            return (C10155d) this.documentType_;
        }
        return C10155d.m51548d0();
    }
}
