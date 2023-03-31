package p343rc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p182a7.C6419h;
import p182a7.C6431n;
import p343rc.C12340k;

/* renamed from: rc.c */
/* compiled from: CallOptions */
public final class C12292c {

    /* renamed from: k */
    public static final C12292c f45527k = new C12292c();

    /* renamed from: a */
    private C12392t f45528a;

    /* renamed from: b */
    private Executor f45529b;

    /* renamed from: c */
    private String f45530c;

    /* renamed from: d */
    private C12287b f45531d;

    /* renamed from: e */
    private String f45532e;

    /* renamed from: f */
    private Object[][] f45533f;

    /* renamed from: g */
    private List<C12340k.C12341a> f45534g;

    /* renamed from: h */
    private Boolean f45535h;

    /* renamed from: i */
    private Integer f45536i;

    /* renamed from: j */
    private Integer f45537j;

    /* renamed from: rc.c$a */
    /* compiled from: CallOptions */
    public static final class C12293a<T> {

        /* renamed from: a */
        private final String f45538a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final T f45539b;

        private C12293a(String str, T t) {
            this.f45538a = str;
            this.f45539b = t;
        }

        /* renamed from: b */
        public static <T> C12293a<T> m59009b(String str) {
            C6431n.m37562o(str, "debugString");
            return new C12293a<>(str, (Object) null);
        }

        public String toString() {
            return this.f45538a;
        }
    }

    private C12292c() {
        this.f45534g = Collections.emptyList();
        this.f45533f = (Object[][]) Array.newInstance(Object.class, new int[]{0, 2});
    }

    /* renamed from: a */
    public String mo36956a() {
        return this.f45530c;
    }

    /* renamed from: b */
    public String mo36957b() {
        return this.f45532e;
    }

    /* renamed from: c */
    public C12287b mo36958c() {
        return this.f45531d;
    }

    /* renamed from: d */
    public C12392t mo36959d() {
        return this.f45528a;
    }

    /* renamed from: e */
    public Executor mo36960e() {
        return this.f45529b;
    }

    /* renamed from: f */
    public Integer mo36961f() {
        return this.f45536i;
    }

    /* renamed from: g */
    public Integer mo36962g() {
        return this.f45537j;
    }

    /* renamed from: h */
    public <T> T mo36963h(C12293a<T> aVar) {
        C6431n.m37562o(aVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f45533f;
            if (i >= objArr.length) {
                return aVar.f45539b;
            }
            if (aVar.equals(objArr[i][0])) {
                return this.f45533f[i][1];
            }
            i++;
        }
    }

    /* renamed from: i */
    public List<C12340k.C12341a> mo36964i() {
        return this.f45534g;
    }

    /* renamed from: j */
    public boolean mo36965j() {
        return Boolean.TRUE.equals(this.f45535h);
    }

    /* renamed from: k */
    public C12292c mo36966k(C12287b bVar) {
        C12292c cVar = new C12292c(this);
        cVar.f45531d = bVar;
        return cVar;
    }

    /* renamed from: l */
    public C12292c mo36967l(C12392t tVar) {
        C12292c cVar = new C12292c(this);
        cVar.f45528a = tVar;
        return cVar;
    }

    /* renamed from: m */
    public C12292c mo36968m(Executor executor) {
        C12292c cVar = new C12292c(this);
        cVar.f45529b = executor;
        return cVar;
    }

    /* renamed from: n */
    public C12292c mo36969n(int i) {
        C6431n.m37555h(i >= 0, "invalid maxsize %s", i);
        C12292c cVar = new C12292c(this);
        cVar.f45536i = Integer.valueOf(i);
        return cVar;
    }

    /* renamed from: o */
    public C12292c mo36970o(int i) {
        C6431n.m37555h(i >= 0, "invalid maxsize %s", i);
        C12292c cVar = new C12292c(this);
        cVar.f45537j = Integer.valueOf(i);
        return cVar;
    }

    /* renamed from: p */
    public <T> C12292c mo36971p(C12293a<T> aVar, T t) {
        C6431n.m37562o(aVar, "key");
        C6431n.m37562o(t, "value");
        C12292c cVar = new C12292c(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f45533f;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (aVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        int length = this.f45533f.length;
        int i2 = i == -1 ? 1 : 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i2;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        cVar.f45533f = objArr2;
        Object[][] objArr3 = this.f45533f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            cVar.f45533f[this.f45533f.length] = new Object[]{aVar, t};
        } else {
            cVar.f45533f[i] = new Object[]{aVar, t};
        }
        return cVar;
    }

    /* renamed from: q */
    public C12292c mo36972q(C12340k.C12341a aVar) {
        C12292c cVar = new C12292c(this);
        ArrayList arrayList = new ArrayList(this.f45534g.size() + 1);
        arrayList.addAll(this.f45534g);
        arrayList.add(aVar);
        cVar.f45534g = Collections.unmodifiableList(arrayList);
        return cVar;
    }

    /* renamed from: r */
    public C12292c mo36973r() {
        C12292c cVar = new C12292c(this);
        cVar.f45535h = Boolean.TRUE;
        return cVar;
    }

    /* renamed from: s */
    public C12292c mo36974s() {
        C12292c cVar = new C12292c(this);
        cVar.f45535h = Boolean.FALSE;
        return cVar;
    }

    public String toString() {
        C6419h.C6421b d = C6419h.m37528c(this).mo21842d("deadline", this.f45528a).mo21842d("authority", this.f45530c).mo21842d("callCredentials", this.f45531d);
        Executor executor = this.f45529b;
        return d.mo21842d("executor", executor != null ? executor.getClass() : null).mo21842d("compressorName", this.f45532e).mo21842d("customOptions", Arrays.deepToString(this.f45533f)).mo21843e("waitForReady", mo36965j()).mo21842d("maxInboundMessageSize", this.f45536i).mo21842d("maxOutboundMessageSize", this.f45537j).mo21842d("streamTracerFactories", this.f45534g).toString();
    }

    private C12292c(C12292c cVar) {
        this.f45534g = Collections.emptyList();
        this.f45528a = cVar.f45528a;
        this.f45530c = cVar.f45530c;
        this.f45531d = cVar.f45531d;
        this.f45529b = cVar.f45529b;
        this.f45532e = cVar.f45532e;
        this.f45533f = cVar.f45533f;
        this.f45535h = cVar.f45535h;
        this.f45536i = cVar.f45536i;
        this.f45537j = cVar.f45537j;
        this.f45534g = cVar.f45534g;
    }
}
