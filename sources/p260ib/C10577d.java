package p260ib;

import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: ib.d */
/* compiled from: Protos */
public final class C10577d extends C8260z<C10577d, C10578a> implements C8249w0 {
    public static final int ASPECTTOLERANCE_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C10577d DEFAULT_INSTANCE;
    private static volatile C8143f1<C10577d> PARSER = null;
    public static final int USEAUTOFOCUS_FIELD_NUMBER = 2;
    private double aspectTolerance_;
    private boolean useAutoFocus_;

    /* renamed from: ib.d$a */
    /* compiled from: Protos */
    public static final class C10578a extends C8260z.C8261a<C10577d, C10578a> implements C8249w0 {
        /* synthetic */ C10578a(C10576c cVar) {
            this();
        }

        /* renamed from: D */
        public C10578a mo33775D(double d) {
            mo27440u();
            ((C10577d) this.f35196b).m53133h0(d);
            return this;
        }

        /* renamed from: E */
        public C10578a mo33776E(boolean z) {
            mo27440u();
            ((C10577d) this.f35196b).m53134i0(z);
            return this;
        }

        private C10578a() {
            super(C10577d.DEFAULT_INSTANCE);
        }
    }

    static {
        C10577d dVar = new C10577d();
        DEFAULT_INSTANCE = dVar;
        C8260z.m45899X(C10577d.class, dVar);
    }

    private C10577d() {
    }

    /* renamed from: e0 */
    public static C10577d m53131e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static C10578a m53132g0() {
        return (C10578a) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m53133h0(double d) {
        this.aspectTolerance_ = d;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m53134i0(boolean z) {
        this.useAutoFocus_ = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C10576c.f41620a[fVar.ordinal()]) {
            case 1:
                return new C10577d();
            case 2:
                return new C10578a((C10576c) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0007", new Object[]{"aspectTolerance_", "useAutoFocus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10577d> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10577d.class) {
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

    /* renamed from: d0 */
    public double mo33773d0() {
        return this.aspectTolerance_;
    }

    /* renamed from: f0 */
    public boolean mo33774f0() {
        return this.useAutoFocus_;
    }
}
