package p356t7;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t7.c */
/* compiled from: FieldDescriptor */
public final class C12541c {

    /* renamed from: a */
    private final String f46046a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f46047b;

    /* renamed from: t7.c$b */
    /* compiled from: FieldDescriptor */
    public static final class C12543b {

        /* renamed from: a */
        private final String f46048a;

        /* renamed from: b */
        private Map<Class<?>, Object> f46049b = null;

        C12543b(String str) {
            this.f46048a = str;
        }

        /* renamed from: a */
        public C12541c mo37365a() {
            Map map;
            String str = this.f46048a;
            if (this.f46049b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f46049b));
            }
            return new C12541c(str, map);
        }

        /* renamed from: b */
        public <T extends Annotation> C12543b mo37366b(T t) {
            if (this.f46049b == null) {
                this.f46049b = new HashMap();
            }
            this.f46049b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C12543b m59731a(String str) {
        return new C12543b(str);
    }

    /* renamed from: d */
    public static C12541c m59732d(String str) {
        return new C12541c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String mo37360b() {
        return this.f46046a;
    }

    /* renamed from: c */
    public <T extends Annotation> T mo37361c(Class<T> cls) {
        return (Annotation) this.f46047b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12541c)) {
            return false;
        }
        C12541c cVar = (C12541c) obj;
        if (!this.f46046a.equals(cVar.f46046a) || !this.f46047b.equals(cVar.f46047b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f46046a.hashCode() * 31) + this.f46047b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f46046a + ", properties=" + this.f46047b.values() + "}";
    }

    private C12541c(String str, Map<Class<?>, Object> map) {
        this.f46046a = str;
        this.f46047b = map;
    }
}
