package p229f8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import p405y8.C13093c0;

/* renamed from: f8.e */
/* compiled from: WriteBatch */
public final class C10158e extends C8260z<C10158e, C10160b> implements C8249w0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C10158e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile C8143f1<C10158e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private C8119d0.C8130j<C13093c0> baseWrites_ = C8260z.m45886C();
    private int batchId_;
    private C8234t1 localWriteTime_;
    private C8119d0.C8130j<C13093c0> writes_ = C8260z.m45886C();

    /* renamed from: f8.e$a */
    /* compiled from: WriteBatch */
    static /* synthetic */ class C10159a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40545a;

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
                f40545a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f40545a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p229f8.C10158e.C10159a.<clinit>():void");
        }
    }

    /* renamed from: f8.e$b */
    /* compiled from: WriteBatch */
    public static final class C10160b extends C8260z.C8261a<C10158e, C10160b> implements C8249w0 {
        /* synthetic */ C10160b(C10159a aVar) {
            this();
        }

        /* renamed from: D */
        public C10160b mo32833D(C13093c0 c0Var) {
            mo27440u();
            ((C10158e) this.f35196b).m51562f0(c0Var);
            return this;
        }

        /* renamed from: E */
        public C10160b mo32834E(C13093c0 c0Var) {
            mo27440u();
            ((C10158e) this.f35196b).m51563g0(c0Var);
            return this;
        }

        /* renamed from: F */
        public C10160b mo32835F(int i) {
            mo27440u();
            ((C10158e) this.f35196b).m51569s0(i);
            return this;
        }

        /* renamed from: G */
        public C10160b mo32836G(C8234t1 t1Var) {
            mo27440u();
            ((C10158e) this.f35196b).m51570t0(t1Var);
            return this;
        }

        private C10160b() {
            super(C10158e.DEFAULT_INSTANCE);
        }
    }

    static {
        C10158e eVar = new C10158e();
        DEFAULT_INSTANCE = eVar;
        C8260z.m45899X(C10158e.class, eVar);
    }

    private C10158e() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m51562f0(C13093c0 c0Var) {
        c0Var.getClass();
        m51564h0();
        this.baseWrites_.add(c0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m51563g0(C13093c0 c0Var) {
        c0Var.getClass();
        m51565i0();
        this.writes_.add(c0Var);
    }

    /* renamed from: h0 */
    private void m51564h0() {
        C8119d0.C8130j<C13093c0> jVar = this.baseWrites_;
        if (!jVar.mo26802F1()) {
            this.baseWrites_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: i0 */
    private void m51565i0() {
        C8119d0.C8130j<C13093c0> jVar = this.writes_;
        if (!jVar.mo26802F1()) {
            this.writes_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: p0 */
    public static C10160b m51566p0() {
        return (C10160b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: q0 */
    public static C10158e m51567q0(C8153i iVar) throws C8135e0 {
        return (C10158e) C8260z.m45893R(DEFAULT_INSTANCE, iVar);
    }

    /* renamed from: r0 */
    public static C10158e m51568r0(byte[] bArr) throws C8135e0 {
        return (C10158e) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m51569s0(int i) {
        this.batchId_ = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m51570t0(C8234t1 t1Var) {
        t1Var.getClass();
        this.localWriteTime_ = t1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        Class<C13093c0> cls = C13093c0.class;
        switch (C10159a.f40545a[fVar.ordinal()]) {
            case 1:
                return new C10158e();
            case 2:
                return new C10160b((C10159a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", cls, "localWriteTime_", "baseWrites_", cls});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10158e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10158e.class) {
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

    /* renamed from: j0 */
    public C13093c0 mo32827j0(int i) {
        return this.baseWrites_.get(i);
    }

    /* renamed from: k0 */
    public int mo32828k0() {
        return this.baseWrites_.size();
    }

    /* renamed from: l0 */
    public int mo32829l0() {
        return this.batchId_;
    }

    /* renamed from: m0 */
    public C8234t1 mo32830m0() {
        C8234t1 t1Var = this.localWriteTime_;
        return t1Var == null ? C8234t1.m45638d0() : t1Var;
    }

    /* renamed from: n0 */
    public C13093c0 mo32831n0(int i) {
        return this.writes_.get(i);
    }

    /* renamed from: o0 */
    public int mo32832o0() {
        return this.writes_.size();
    }
}
