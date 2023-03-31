package p229f8;

import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p405y8.C13210y;

/* renamed from: f8.c */
/* compiled from: Target */
public final class C10151c extends C8260z<C10151c, C10153b> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C10151c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile C8143f1<C10151c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private C8234t1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private C8153i resumeToken_ = C8153i.f34908b;
    private C8234t1 snapshotVersion_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    /* renamed from: f8.c$a */
    /* compiled from: Target */
    static /* synthetic */ class C10152a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40538a;

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
                f40538a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40538a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229f8.C10151c.C10152a.<clinit>():void");
        }
    }

    /* renamed from: f8.c$b */
    /* compiled from: Target */
    public static final class C10153b extends C8260z.C8261a<C10151c, C10153b> implements C8249w0 {
        /* synthetic */ C10153b(C10152a aVar) {
            this();
        }

        /* renamed from: D */
        public C10153b mo32815D() {
            mo27440u();
            ((C10151c) this.f35196b).m51518j0();
            return this;
        }

        /* renamed from: E */
        public C10153b mo32816E(C13210y.C13213c cVar) {
            mo27440u();
            ((C10151c) this.f35196b).m51521u0(cVar);
            return this;
        }

        /* renamed from: F */
        public C10153b mo32817F(C8234t1 t1Var) {
            mo27440u();
            ((C10151c) this.f35196b).m51522v0(t1Var);
            return this;
        }

        /* renamed from: G */
        public C10153b mo32818G(long j) {
            mo27440u();
            ((C10151c) this.f35196b).m51523w0(j);
            return this;
        }

        /* renamed from: H */
        public C10153b mo32819H(C13210y.C13215d dVar) {
            mo27440u();
            ((C10151c) this.f35196b).m51524x0(dVar);
            return this;
        }

        /* renamed from: I */
        public C10153b mo32820I(C8153i iVar) {
            mo27440u();
            ((C10151c) this.f35196b).m51525y0(iVar);
            return this;
        }

        /* renamed from: J */
        public C10153b mo32821J(C8234t1 t1Var) {
            mo27440u();
            ((C10151c) this.f35196b).m51526z0(t1Var);
            return this;
        }

        /* renamed from: K */
        public C10153b mo32822K(int i) {
            mo27440u();
            ((C10151c) this.f35196b).m51508A0(i);
            return this;
        }

        private C10153b() {
            super(C10151c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: f8.c$c */
    /* compiled from: Target */
    public enum C10154c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);
        

        /* renamed from: a */
        private final int f40543a;

        private C10154c(int i) {
            this.f40543a = i;
        }

        /* renamed from: a */
        public static C10154c m51544a(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 5) {
                return QUERY;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        C10151c cVar = new C10151c();
        DEFAULT_INSTANCE = cVar;
        C8260z.m45899X(C10151c.class, cVar);
    }

    private C10151c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m51508A0(int i) {
        this.targetId_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m51518j0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    /* renamed from: s0 */
    public static C10153b m51519s0() {
        return (C10153b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: t0 */
    public static C10151c m51520t0(byte[] bArr) throws C8135e0 {
        return (C10151c) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m51521u0(C13210y.C13213c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m51522v0(C8234t1 t1Var) {
        t1Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = t1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m51523w0(long j) {
        this.lastListenSequenceNumber_ = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m51524x0(C13210y.C13215d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m51525y0(C8153i iVar) {
        iVar.getClass();
        this.resumeToken_ = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m51526z0(C8234t1 t1Var) {
        t1Var.getClass();
        this.snapshotVersion_ = t1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C10152a.f40538a[fVar.ordinal()]) {
            case 1:
                return new C10151c();
            case 2:
                return new C10153b((C10152a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C13210y.C13215d.class, C13210y.C13213c.class, "lastLimboFreeSnapshotVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10151c> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10151c.class) {
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

    /* renamed from: k0 */
    public C13210y.C13213c mo32807k0() {
        if (this.targetTypeCase_ == 6) {
            return (C13210y.C13213c) this.targetType_;
        }
        return C13210y.C13213c.m61983e0();
    }

    /* renamed from: l0 */
    public C8234t1 mo32808l0() {
        C8234t1 t1Var = this.lastLimboFreeSnapshotVersion_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: m0 */
    public long mo32809m0() {
        return this.lastListenSequenceNumber_;
    }

    /* renamed from: n0 */
    public C13210y.C13215d mo32810n0() {
        if (this.targetTypeCase_ == 5) {
            return (C13210y.C13215d) this.targetType_;
        }
        return C13210y.C13215d.m61992d0();
    }

    /* renamed from: o0 */
    public C8153i mo32811o0() {
        return this.resumeToken_;
    }

    /* renamed from: p0 */
    public C8234t1 mo32812p0() {
        C8234t1 t1Var = this.snapshotVersion_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: q0 */
    public int mo32813q0() {
        return this.targetId_;
    }

    /* renamed from: r0 */
    public C10154c mo32814r0() {
        return C10154c.m51544a(this.targetTypeCase_);
    }
}
