package p376v7;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p356t7.C12539a;
import p356t7.C12540b;
import p356t7.C12544d;
import p356t7.C12545e;
import p356t7.C12546f;
import p356t7.C12547g;
import p366u7.C12698a;
import p366u7.C12699b;

/* renamed from: v7.d */
/* compiled from: JsonDataEncoderBuilder */
public final class C12848d implements C12699b<C12848d> {

    /* renamed from: e */
    private static final C12544d<Object> f46940e = C12845a.f46937a;

    /* renamed from: f */
    private static final C12546f<String> f46941f = C12847c.f46939a;

    /* renamed from: g */
    private static final C12546f<Boolean> f46942g = C12846b.f46938a;

    /* renamed from: h */
    private static final C12850b f46943h = new C12850b((C12849a) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<Class<?>, C12544d<?>> f46944a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<Class<?>, C12546f<?>> f46945b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12544d<Object> f46946c = f46940e;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f46947d = false;

    /* renamed from: v7.d$a */
    /* compiled from: JsonDataEncoderBuilder */
    class C12849a implements C12539a {
        C12849a() {
        }

        /* renamed from: a */
        public void mo37359a(Object obj, Writer writer) throws IOException {
            C12851e eVar = new C12851e(writer, C12848d.this.f46944a, C12848d.this.f46945b, C12848d.this.f46946c, C12848d.this.f46947d);
            eVar.mo37835h(obj, false);
            eVar.mo37842p();
        }
    }

    /* renamed from: v7.d$b */
    /* compiled from: JsonDataEncoderBuilder */
    private static final class C12850b implements C12546f<Date> {

        /* renamed from: a */
        private static final DateFormat f46949a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f46949a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C12850b() {
        }

        /* renamed from: b */
        public void mo37370a(Date date, C12547g gVar) throws IOException {
            gVar.mo37371d(f46949a.format(date));
        }

        /* synthetic */ C12850b(C12849a aVar) {
            this();
        }
    }

    public C12848d() {
        mo37831p(String.class, f46941f);
        mo37831p(Boolean.class, f46942g);
        mo37831p(Date.class, f46943h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m60762l(Object obj, C12545e eVar) throws IOException {
        throw new C12540b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: i */
    public C12539a mo37827i() {
        return new C12849a();
    }

    /* renamed from: j */
    public C12848d mo37828j(C12698a aVar) {
        aVar.mo18854a(this);
        return this;
    }

    /* renamed from: k */
    public C12848d mo37829k(boolean z) {
        this.f46947d = z;
        return this;
    }

    /* renamed from: o */
    public <T> C12848d mo37572a(Class<T> cls, C12544d<? super T> dVar) {
        this.f46944a.put(cls, dVar);
        this.f46945b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C12848d mo37831p(Class<T> cls, C12546f<? super T> fVar) {
        this.f46945b.put(cls, fVar);
        this.f46944a.remove(cls);
        return this;
    }
}
