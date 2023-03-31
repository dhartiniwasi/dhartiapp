package p260ib;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8204o0;
import com.google.protobuf.C8208p0;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p260ib.C10577d;

/* renamed from: ib.f */
/* compiled from: Protos */
public final class C10581f extends C8260z<C10581f, C10583b> implements C8249w0 {
    public static final int ANDROID_FIELD_NUMBER = 4;
    public static final int AUTOENABLEFLASH_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final C10581f DEFAULT_INSTANCE;
    private static volatile C8143f1<C10581f> PARSER = null;
    public static final int RESTRICTFORMAT_FIELD_NUMBER = 2;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public static final int USECAMERA_FIELD_NUMBER = 3;
    private static final C8119d0.C8127h.C8128a<Integer, C10579e> restrictFormat_converter_ = new C10582a();
    private C10577d android_;
    private boolean autoEnableFlash_;
    private int restrictFormatMemoizedSerializedSize;
    private C8119d0.C8126g restrictFormat_ = C8260z.m45885B();
    private C8208p0<String, String> strings_ = C8208p0.m45481e();
    private int useCamera_;

    /* renamed from: ib.f$a */
    /* compiled from: Protos */
    class C10582a implements C8119d0.C8127h.C8128a<Integer, C10579e> {
        C10582a() {
        }

        /* renamed from: b */
        public C10579e mo26877a(Integer num) {
            C10579e a = C10579e.m53140a(num.intValue());
            return a == null ? C10579e.UNRECOGNIZED : a;
        }
    }

    /* renamed from: ib.f$b */
    /* compiled from: Protos */
    public static final class C10583b extends C8260z.C8261a<C10581f, C10583b> implements C8249w0 {
        /* synthetic */ C10583b(C10576c cVar) {
            this();
        }

        /* renamed from: D */
        public C10583b mo33784D(Iterable<? extends C10579e> iterable) {
            mo27440u();
            ((C10581f) this.f35196b).m53149f0(iterable);
            return this;
        }

        /* renamed from: E */
        public C10583b mo33785E(Map<String, String> map) {
            mo27440u();
            ((C10581f) this.f35196b).m53151j0().putAll(map);
            return this;
        }

        /* renamed from: F */
        public C10583b mo33786F(C10577d.C10578a aVar) {
            mo27440u();
            ((C10581f) this.f35196b).m53156r0((C10577d) aVar.build());
            return this;
        }

        /* renamed from: G */
        public C10583b mo33787G(int i) {
            mo27440u();
            ((C10581f) this.f35196b).m53157s0(i);
            return this;
        }

        private C10583b() {
            super(C10581f.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ib.f$c */
    /* compiled from: Protos */
    private static final class C10584c {

        /* renamed from: a */
        static final C8204o0<String, String> f41637a;

        static {
            C8105b2.C8107b bVar = C8105b2.C8107b.STRING;
            f41637a = C8204o0.m45470d(bVar, "", bVar, "");
        }
    }

    static {
        C10581f fVar = new C10581f();
        DEFAULT_INSTANCE = fVar;
        C8260z.m45899X(C10581f.class, fVar);
    }

    private C10581f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m53149f0(Iterable<? extends C10579e> iterable) {
        m53150g0();
        for (C10579e f : iterable) {
            this.restrictFormat_.mo26815S(f.mo26872f());
        }
    }

    /* renamed from: g0 */
    private void m53150g0() {
        if (!this.restrictFormat_.mo26802F1()) {
            this.restrictFormat_ = C8260z.m45890M(this.restrictFormat_);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public Map<String, String> m53151j0() {
        return m53152n0();
    }

    /* renamed from: n0 */
    private C8208p0<String, String> m53152n0() {
        if (!this.strings_.mo27213i()) {
            this.strings_ = this.strings_.mo27216l();
        }
        return this.strings_;
    }

    /* renamed from: o0 */
    private C8208p0<String, String> m53153o0() {
        return this.strings_;
    }

    /* renamed from: p0 */
    public static C10583b m53154p0() {
        return (C10583b) DEFAULT_INSTANCE.mo27431w();
    }

    /* renamed from: q0 */
    public static C10581f m53155q0(byte[] bArr) throws C8135e0 {
        return (C10581f) C8260z.m45895T(DEFAULT_INSTANCE, bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m53156r0(C10577d dVar) {
        dVar.getClass();
        this.android_ = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m53157s0(int i) {
        this.useCamera_ = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C10576c.f41620a[fVar.ordinal()]) {
            case 1:
                return new C10581f();
            case 2:
                return new C10583b((C10576c) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u00012\u0002,\u0003\u0004\u0004\t\u0005\u0007", new Object[]{"strings_", C10584c.f41637a, "restrictFormat_", "useCamera_", "android_", "autoEnableFlash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10581f> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10581f.class) {
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

    /* renamed from: h0 */
    public C10577d mo33778h0() {
        C10577d dVar = this.android_;
        return dVar == null ? C10577d.m53131e0() : dVar;
    }

    /* renamed from: i0 */
    public boolean mo33779i0() {
        return this.autoEnableFlash_;
    }

    /* renamed from: k0 */
    public List<C10579e> mo33780k0() {
        return new C8119d0.C8127h(this.restrictFormat_, restrictFormat_converter_);
    }

    /* renamed from: l0 */
    public Map<String, String> mo33781l0() {
        return Collections.unmodifiableMap(m53153o0());
    }

    /* renamed from: m0 */
    public int mo33782m0() {
        return this.useCamera_;
    }
}
