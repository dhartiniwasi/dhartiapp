package p376v7;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p356t7.C12540b;
import p356t7.C12541c;
import p356t7.C12544d;
import p356t7.C12545e;
import p356t7.C12546f;
import p356t7.C12547g;

/* renamed from: v7.e */
/* compiled from: JsonValueObjectEncoderContext */
final class C12851e implements C12545e, C12547g {

    /* renamed from: a */
    private C12851e f46950a = null;

    /* renamed from: b */
    private boolean f46951b = true;

    /* renamed from: c */
    private final JsonWriter f46952c;

    /* renamed from: d */
    private final Map<Class<?>, C12544d<?>> f46953d;

    /* renamed from: e */
    private final Map<Class<?>, C12546f<?>> f46954e;

    /* renamed from: f */
    private final C12544d<Object> f46955f;

    /* renamed from: g */
    private final boolean f46956g;

    C12851e(Writer writer, Map<Class<?>, C12544d<?>> map, Map<Class<?>, C12546f<?>> map2, C12544d<Object> dVar, boolean z) {
        this.f46952c = new JsonWriter(writer);
        this.f46953d = map;
        this.f46954e = map2;
        this.f46955f = dVar;
        this.f46956g = z;
    }

    /* renamed from: o */
    private boolean m60774o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    private C12851e m60775r(String str, Object obj) throws IOException, C12540b {
        m60777t();
        this.f46952c.name(str);
        if (obj != null) {
            return mo37835h(obj, false);
        }
        this.f46952c.nullValue();
        return this;
    }

    /* renamed from: s */
    private C12851e m60776s(String str, Object obj) throws IOException, C12540b {
        if (obj == null) {
            return this;
        }
        m60777t();
        this.f46952c.name(str);
        return mo37835h(obj, false);
    }

    /* renamed from: t */
    private void m60777t() throws IOException {
        if (this.f46951b) {
            C12851e eVar = this.f46950a;
            if (eVar != null) {
                eVar.m60777t();
                this.f46950a.f46951b = false;
                this.f46950a = null;
                this.f46952c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* renamed from: a */
    public C12545e mo37367a(C12541c cVar, long j) throws IOException {
        return mo37838k(cVar.mo37360b(), j);
    }

    /* renamed from: b */
    public C12545e mo37368b(C12541c cVar, int i) throws IOException {
        return mo37837j(cVar.mo37360b(), i);
    }

    /* renamed from: c */
    public C12545e mo37369c(C12541c cVar, Object obj) throws IOException {
        return mo37839l(cVar.mo37360b(), obj);
    }

    /* renamed from: f */
    public C12851e mo37833f(int i) throws IOException {
        m60777t();
        this.f46952c.value((long) i);
        return this;
    }

    /* renamed from: g */
    public C12851e mo37834g(long j) throws IOException {
        m60777t();
        this.f46952c.value(j);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12851e mo37835h(Object obj, boolean z) throws IOException {
        Class<?> cls;
        int i = 0;
        if (z && m60774o(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new C12540b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f46952c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f46952c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return mo37841n((byte[]) obj);
            }
            this.f46952c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f46952c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo37834g(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f46952c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f46952c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number h : (Number[]) obj) {
                    mo37835h(h, false);
                }
            } else {
                for (Object h2 : (Object[]) obj) {
                    mo37835h(h2, false);
                }
            }
            this.f46952c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f46952c.beginArray();
            for (Object h3 : (Collection) obj) {
                mo37835h(h3, false);
            }
            this.f46952c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f46952c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo37839l((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C12540b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f46952c.endObject();
            return this;
        } else {
            C12544d dVar = this.f46953d.get(obj.getClass());
            if (dVar != null) {
                return mo37843q(dVar, obj, z);
            }
            C12546f fVar = this.f46954e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo37370a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return mo37843q(this.f46955f, obj, z);
            } else {
                mo37371d(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: i */
    public C12851e mo37371d(String str) throws IOException {
        m60777t();
        this.f46952c.value(str);
        return this;
    }

    /* renamed from: j */
    public C12851e mo37837j(String str, int i) throws IOException {
        m60777t();
        this.f46952c.name(str);
        return mo37833f(i);
    }

    /* renamed from: k */
    public C12851e mo37838k(String str, long j) throws IOException {
        m60777t();
        this.f46952c.name(str);
        return mo37834g(j);
    }

    /* renamed from: l */
    public C12851e mo37839l(String str, Object obj) throws IOException {
        if (this.f46956g) {
            return m60776s(str, obj);
        }
        return m60775r(str, obj);
    }

    /* renamed from: m */
    public C12851e mo37372e(boolean z) throws IOException {
        m60777t();
        this.f46952c.value(z);
        return this;
    }

    /* renamed from: n */
    public C12851e mo37841n(byte[] bArr) throws IOException {
        m60777t();
        if (bArr == null) {
            this.f46952c.nullValue();
        } else {
            this.f46952c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo37842p() throws IOException {
        m60777t();
        this.f46952c.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C12851e mo37843q(C12544d<Object> dVar, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f46952c.beginObject();
        }
        dVar.mo18855a(obj, this);
        if (!z) {
            this.f46952c.endObject();
        }
        return this;
    }
}
