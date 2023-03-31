package p386w7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p356t7.C12540b;
import p356t7.C12544d;
import p356t7.C12545e;
import p356t7.C12546f;
import p366u7.C12698a;
import p366u7.C12699b;

/* renamed from: w7.h */
/* compiled from: ProtobufEncoder */
public class C12920h {

    /* renamed from: a */
    private final Map<Class<?>, C12544d<?>> f47138a;

    /* renamed from: b */
    private final Map<Class<?>, C12546f<?>> f47139b;

    /* renamed from: c */
    private final C12544d<Object> f47140c;

    /* renamed from: w7.h$a */
    /* compiled from: ProtobufEncoder */
    public static final class C12921a implements C12699b<C12921a> {

        /* renamed from: d */
        private static final C12544d<Object> f47141d = C12919g.f47137a;

        /* renamed from: a */
        private final Map<Class<?>, C12544d<?>> f47142a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, C12546f<?>> f47143b = new HashMap();

        /* renamed from: c */
        private C12544d<Object> f47144c = f47141d;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m61045e(Object obj, C12545e eVar) throws IOException {
            throw new C12540b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C12920h mo37960c() {
            return new C12920h(new HashMap(this.f47142a), new HashMap(this.f47143b), this.f47144c);
        }

        /* renamed from: d */
        public C12921a mo37961d(C12698a aVar) {
            aVar.mo18854a(this);
            return this;
        }

        /* renamed from: f */
        public <U> C12921a mo37572a(Class<U> cls, C12544d<? super U> dVar) {
            this.f47142a.put(cls, dVar);
            this.f47143b.remove(cls);
            return this;
        }
    }

    C12920h(Map<Class<?>, C12544d<?>> map, Map<Class<?>, C12546f<?>> map2, C12544d<Object> dVar) {
        this.f47138a = map;
        this.f47139b = map2;
        this.f47140c = dVar;
    }

    /* renamed from: a */
    public static C12921a m61041a() {
        return new C12921a();
    }

    /* renamed from: b */
    public void mo37958b(Object obj, OutputStream outputStream) throws IOException {
        new C12917f(outputStream, this.f47138a, this.f47139b, this.f47140c).mo37957q(obj);
    }

    /* renamed from: c */
    public byte[] mo37959c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo37958b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
