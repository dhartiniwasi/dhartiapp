package p260ib;

import com.google.protobuf.C8143f1;
import com.google.protobuf.C8249w0;
import com.google.protobuf.C8260z;

/* renamed from: ib.h */
/* compiled from: Protos */
public final class C10587h extends C8260z<C10587h, C10588a> implements C8249w0 {
    /* access modifiers changed from: private */
    public static final C10587h DEFAULT_INSTANCE;
    public static final int FORMATNOTE_FIELD_NUMBER = 4;
    public static final int FORMAT_FIELD_NUMBER = 3;
    private static volatile C8143f1<C10587h> PARSER = null;
    public static final int RAWCONTENT_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String formatNote_ = "";
    private int format_;
    private String rawContent_ = "";
    private int type_;

    /* renamed from: ib.h$a */
    /* compiled from: Protos */
    public static final class C10588a extends C8260z.C8261a<C10587h, C10588a> implements C8249w0 {
        /* synthetic */ C10588a(C10576c cVar) {
            this();
        }

        /* renamed from: D */
        public C10588a mo33789D(C10579e eVar) {
            mo27440u();
            ((C10587h) this.f35196b).m53180g0(eVar);
            return this;
        }

        /* renamed from: E */
        public C10588a mo33790E(String str) {
            mo27440u();
            ((C10587h) this.f35196b).m53181h0(str);
            return this;
        }

        /* renamed from: F */
        public C10588a mo33791F(String str) {
            mo27440u();
            ((C10587h) this.f35196b).m53182i0(str);
            return this;
        }

        /* renamed from: G */
        public C10588a mo33792G(C10585g gVar) {
            mo27440u();
            ((C10587h) this.f35196b).m53183j0(gVar);
            return this;
        }

        private C10588a() {
            super(C10587h.DEFAULT_INSTANCE);
        }
    }

    static {
        C10587h hVar = new C10587h();
        DEFAULT_INSTANCE = hVar;
        C8260z.m45899X(C10587h.class, hVar);
    }

    private C10587h() {
    }

    /* renamed from: f0 */
    public static C10588a m53179f0() {
        return (C10588a) DEFAULT_INSTANCE.mo27431w();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m53180g0(C10579e eVar) {
        this.format_ = eVar.mo26872f();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m53181h0(String str) {
        str.getClass();
        this.formatNote_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m53182i0(String str) {
        str.getClass();
        this.rawContent_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m53183j0(C10585g gVar) {
        this.type_ = gVar.mo26872f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object mo22642A(C8260z.C8266f fVar, Object obj, Object obj2) {
        switch (C10576c.f41620a[fVar.ordinal()]) {
            case 1:
                return new C10587h();
            case 2:
                return new C10588a((C10576c) null);
            case 3:
                return C8260z.m45892P(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"type_", "rawContent_", "format_", "formatNote_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C8143f1<C10587h> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (C10587h.class) {
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
}
