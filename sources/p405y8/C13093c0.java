package p405y8;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import java.util.List;
import p405y8.C13139n;

/* renamed from: y8.c0 */
/* compiled from: Write */
public final class C13093c0 extends C8260z<C13093c0, C13095b> implements C8249w0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final C13093c0 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile C8143f1<C13093c0> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private C13165t currentDocument_;
    private int operationCase_ = 0;
    private Object operation_;
    private C13133l updateMask_;
    private C8119d0.C8130j<C13139n.C13142c> updateTransforms_ = C8260z.m45886C();

    /* renamed from: y8.c0$a */
    /* compiled from: Write */
    static /* synthetic */ class C13094a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47347a;

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
                f47347a = r0
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f47347a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z$f r1 = com.google.protobuf.C8260z.C8266f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p405y8.C13093c0.C13094a.<clinit>():void");
        }
    }

    /* renamed from: y8.c0$b */
    /* compiled from: Write */
    public static final class C13095b extends C8260z.C8261a<C13093c0, C13095b> implements C8249w0 {
        /* synthetic */ C13095b(C13094a aVar) {
            this();
        }

        /* renamed from: D */
        public C13095b mo38149D(C13139n.C13142c cVar) {
            mo27440u();
            ((C13093c0) this.f35196b).m61530h0(cVar);
            return this;
        }

        /* renamed from: E */
        public C13095b mo38150E(C13165t tVar) {
            mo27440u();
            ((C13093c0) this.f35196b).m61535y0(tVar);
            return this;
        }

        /* renamed from: F */
        public C13095b mo38151F(String str) {
            mo27440u();
            ((C13093c0) this.f35196b).m61536z0(str);
            return this;
        }

        /* renamed from: G */
        public C13095b mo38152G(C13123i iVar) {
            mo27440u();
            ((C13093c0) this.f35196b).m61520A0(iVar);
            return this;
        }

        /* renamed from: H */
        public C13095b mo38153H(C13133l lVar) {
            mo27440u();
            ((C13093c0) this.f35196b).m61521B0(lVar);
            return this;
        }

        /* renamed from: I */
        public C13095b mo38154I(String str) {
            mo27440u();
            ((C13093c0) this.f35196b).m61522C0(str);
            return this;
        }

        private C13095b() {
            super(C13093c0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: y8.c0$c */
    /* compiled from: Write */
    public enum C13096c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);
        

        /* renamed from: a */
        private final int f47354a;

        private C13096c(int i) {
            this.f47354a = i;
        }

        /* renamed from: a */
        public static C13096c m61556a(int i) {
            if (i == 0) {
                return OPERATION_NOT_SET;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i == 5) {
                return VERIFY;
            }
            if (i != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        C13093c0 c0Var = new C13093c0();
        DEFAULT_INSTANCE = c0Var;
        C8260z.m45899X(C13093c0.class, c0Var);
    }

    private C13093c0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m61520A0(C13123i iVar) {
        iVar.getClass();
        this.operation_ = iVar;
        this.operationCase_ = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m61521B0(C13133l lVar) {
        lVar.getClass();
        this.updateMask_ = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m61522C0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m61530h0(C13139n.C13142c cVar) {
        cVar.getClass();
        m61531i0();
        this.updateTransforms_.add(cVar);
    }

    /* renamed from: i0 */
    private void m61531i0() {
        C8119d0.C8130j<C13139n.C13142c> jVar = this.updateTransforms_;
        if (!jVar.mo26802F1()) {
            this.updateTransforms_ = C8260z.m45891N(jVar);
        }
    }

    /* renamed from: v0 */
    public static C13095b m61532v0() {
        return (C13095b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: w0 */
    public static C13095b m61533w0(C13093c0 c0Var) {
        return (C13095b) DEFAULT_INSTANCE.mo27432x(c0Var);
    }

    /* renamed from: x0 */
    public static C13093c0 m61534x0(byte[] bArr) throws C8135e0 {
        return (C13093c0) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m61535y0(C13165t tVar) {
        tVar.getClass();
        this.currentDocument_ = tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m61536z0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C13094a.f47347a[fVar.ordinal()]) {
            case 1:
                return new C13093c0();
            case 2:
                return new C13095b((C13094a) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", C13123i.class, "updateMask_", "currentDocument_", C13139n.class, "updateTransforms_", C13139n.C13142c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C13093c0> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C13093c0.class) {
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
    public C13165t mo38137j0() {
        C13165t tVar = this.currentDocument_;
        return tVar == null ? C13165t.m61771e0() : tVar;
    }

    /* renamed from: k0 */
    public String mo38138k0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    /* renamed from: l0 */
    public C13096c mo38139l0() {
        return C13096c.m61556a(this.operationCase_);
    }

    /* renamed from: m0 */
    public C13139n mo38140m0() {
        if (this.operationCase_ == 6) {
            return (C13139n) this.operation_;
        }
        return C13139n.m61678b0();
    }

    /* renamed from: n0 */
    public C13123i mo38141n0() {
        if (this.operationCase_ == 1) {
            return (C13123i) this.operation_;
        }
        return C13123i.m61636e0();
    }

    /* renamed from: o0 */
    public C13133l mo38142o0() {
        C13133l lVar = this.updateMask_;
        return lVar == null ? C13133l.m61666e0() : lVar;
    }

    /* renamed from: p0 */
    public List<C13139n.C13142c> mo38143p0() {
        return this.updateTransforms_;
    }

    /* renamed from: q0 */
    public String mo38144q0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    /* renamed from: r0 */
    public boolean mo38145r0() {
        return this.currentDocument_ != null;
    }

    /* renamed from: s0 */
    public boolean mo38146s0() {
        return this.operationCase_ == 6;
    }

    /* renamed from: t0 */
    public boolean mo38147t0() {
        return this.operationCase_ == 1;
    }

    /* renamed from: u0 */
    public boolean mo38148u0() {
        return this.updateMask_ != null;
    }
}
