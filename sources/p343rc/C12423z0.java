package p343rc;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p182a7.C6419h;
import p182a7.C6431n;

/* renamed from: rc.z0 */
/* compiled from: MethodDescriptor */
public final class C12423z0<ReqT, RespT> {

    /* renamed from: a */
    private final C12427d f45775a;

    /* renamed from: b */
    private final String f45776b;

    /* renamed from: c */
    private final String f45777c;

    /* renamed from: d */
    private final C12426c<ReqT> f45778d;

    /* renamed from: e */
    private final C12426c<RespT> f45779e;

    /* renamed from: f */
    private final Object f45780f;

    /* renamed from: g */
    private final boolean f45781g;

    /* renamed from: h */
    private final boolean f45782h;

    /* renamed from: i */
    private final boolean f45783i;

    /* renamed from: j */
    private final AtomicReferenceArray<Object> f45784j;

    /* renamed from: rc.z0$b */
    /* compiled from: MethodDescriptor */
    public static final class C12425b<ReqT, RespT> {

        /* renamed from: a */
        private C12426c<ReqT> f45785a;

        /* renamed from: b */
        private C12426c<RespT> f45786b;

        /* renamed from: c */
        private C12427d f45787c;

        /* renamed from: d */
        private String f45788d;

        /* renamed from: e */
        private boolean f45789e;

        /* renamed from: f */
        private boolean f45790f;

        /* renamed from: g */
        private Object f45791g;

        /* renamed from: h */
        private boolean f45792h;

        /* renamed from: a */
        public C12423z0<ReqT, RespT> mo37196a() {
            return new C12423z0(this.f45787c, this.f45788d, this.f45785a, this.f45786b, this.f45791g, this.f45789e, this.f45790f, this.f45792h);
        }

        /* renamed from: b */
        public C12425b<ReqT, RespT> mo37197b(String str) {
            this.f45788d = str;
            return this;
        }

        /* renamed from: c */
        public C12425b<ReqT, RespT> mo37198c(C12426c<ReqT> cVar) {
            this.f45785a = cVar;
            return this;
        }

        /* renamed from: d */
        public C12425b<ReqT, RespT> mo37199d(C12426c<RespT> cVar) {
            this.f45786b = cVar;
            return this;
        }

        /* renamed from: e */
        public C12425b<ReqT, RespT> mo37200e(boolean z) {
            this.f45792h = z;
            return this;
        }

        /* renamed from: f */
        public C12425b<ReqT, RespT> mo37201f(C12427d dVar) {
            this.f45787c = dVar;
            return this;
        }

        private C12425b() {
        }
    }

    /* renamed from: rc.z0$c */
    /* compiled from: MethodDescriptor */
    public interface C12426c<T> {
        /* renamed from: a */
        T mo37202a(InputStream inputStream);

        /* renamed from: b */
        InputStream mo37203b(T t);
    }

    /* renamed from: rc.z0$d */
    /* compiled from: MethodDescriptor */
    public enum C12427d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: a */
        public final boolean mo37204a() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    /* renamed from: a */
    public static String m59386a(String str) {
        int lastIndexOf = ((String) C6431n.m37562o(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m59387b(String str, String str2) {
        return ((String) C6431n.m37562o(str, "fullServiceName")) + "/" + ((String) C6431n.m37562o(str2, "methodName"));
    }

    /* renamed from: g */
    public static <ReqT, RespT> C12425b<ReqT, RespT> m59388g() {
        return m59389h((C12426c) null, (C12426c) null);
    }

    /* renamed from: h */
    public static <ReqT, RespT> C12425b<ReqT, RespT> m59389h(C12426c<ReqT> cVar, C12426c<RespT> cVar2) {
        return new C12425b().mo37198c(cVar).mo37199d(cVar2);
    }

    /* renamed from: c */
    public String mo37189c() {
        return this.f45776b;
    }

    /* renamed from: d */
    public String mo37190d() {
        return this.f45777c;
    }

    /* renamed from: e */
    public C12427d mo37191e() {
        return this.f45775a;
    }

    /* renamed from: f */
    public boolean mo37192f() {
        return this.f45782h;
    }

    /* renamed from: i */
    public RespT mo37193i(InputStream inputStream) {
        return this.f45779e.mo37202a(inputStream);
    }

    /* renamed from: j */
    public InputStream mo37194j(ReqT reqt) {
        return this.f45778d.mo37203b(reqt);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("fullMethodName", this.f45776b).mo21842d("type", this.f45775a).mo21843e("idempotent", this.f45781g).mo21843e("safe", this.f45782h).mo21843e("sampledToLocalTracing", this.f45783i).mo21842d("requestMarshaller", this.f45778d).mo21842d("responseMarshaller", this.f45779e).mo21842d("schemaDescriptor", this.f45780f).mo21844k().toString();
    }

    private C12423z0(C12427d dVar, String str, C12426c<ReqT> cVar, C12426c<RespT> cVar2, Object obj, boolean z, boolean z2, boolean z3) {
        this.f45784j = new AtomicReferenceArray<>(2);
        this.f45775a = (C12427d) C6431n.m37562o(dVar, "type");
        this.f45776b = (String) C6431n.m37562o(str, "fullMethodName");
        this.f45777c = m59386a(str);
        this.f45778d = (C12426c) C6431n.m37562o(cVar, "requestMarshaller");
        this.f45779e = (C12426c) C6431n.m37562o(cVar2, "responseMarshaller");
        this.f45780f = obj;
        this.f45781g = z;
        this.f45782h = z2;
        this.f45783i = z3;
    }
}
