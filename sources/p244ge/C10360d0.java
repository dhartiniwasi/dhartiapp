package p244ge;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p244ge.C10395w;
import p253he.C10543e;
import p282ke.C11639f;

/* renamed from: ge.d0 */
/* compiled from: Request */
public final class C10360d0 {

    /* renamed from: a */
    final C10397x f41050a;

    /* renamed from: b */
    final String f41051b;

    /* renamed from: c */
    final C10395w f41052c;

    /* renamed from: d */
    final C10364e0 f41053d;

    /* renamed from: e */
    final Map<Class<?>, Object> f41054e;

    /* renamed from: f */
    private volatile C10362e f41055f;

    C10360d0(C10361a aVar) {
        this.f41050a = aVar.f41056a;
        this.f41051b = aVar.f41057b;
        this.f41052c = aVar.f41058c.mo33413d();
        this.f41053d = aVar.f41059d;
        this.f41054e = C10543e.m53060u(aVar.f41060e);
    }

    /* renamed from: a */
    public C10364e0 mo33253a() {
        return this.f41053d;
    }

    /* renamed from: b */
    public C10362e mo33254b() {
        C10362e eVar = this.f41055f;
        if (eVar != null) {
            return eVar;
        }
        C10362e k = C10362e.m52334k(this.f41052c);
        this.f41055f = k;
        return k;
    }

    /* renamed from: c */
    public String mo33255c(String str) {
        return this.f41052c.mo33401c(str);
    }

    /* renamed from: d */
    public C10395w mo33256d() {
        return this.f41052c;
    }

    /* renamed from: e */
    public boolean mo33257e() {
        return this.f41050a.mo33428m();
    }

    /* renamed from: f */
    public String mo33258f() {
        return this.f41051b;
    }

    /* renamed from: g */
    public C10361a mo33259g() {
        return new C10361a(this);
    }

    /* renamed from: h */
    public C10397x mo33260h() {
        return this.f41050a;
    }

    public String toString() {
        return "Request{method=" + this.f41051b + ", url=" + this.f41050a + ", tags=" + this.f41054e + '}';
    }

    /* renamed from: ge.d0$a */
    /* compiled from: Request */
    public static class C10361a {

        /* renamed from: a */
        C10397x f41056a;

        /* renamed from: b */
        String f41057b;

        /* renamed from: c */
        C10395w.C10396a f41058c;

        /* renamed from: d */
        C10364e0 f41059d;

        /* renamed from: e */
        Map<Class<?>, Object> f41060e;

        public C10361a() {
            this.f41060e = Collections.emptyMap();
            this.f41057b = "GET";
            this.f41058c = new C10395w.C10396a();
        }

        /* renamed from: a */
        public C10360d0 mo33262a() {
            if (this.f41056a != null) {
                return new C10360d0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public C10361a mo33263b() {
            return mo33266e("HEAD", (C10364e0) null);
        }

        /* renamed from: c */
        public C10361a mo33264c(String str, String str2) {
            this.f41058c.mo33415f(str, str2);
            return this;
        }

        /* renamed from: d */
        public C10361a mo33265d(C10395w wVar) {
            this.f41058c = wVar.mo33404f();
            return this;
        }

        /* renamed from: e */
        public C10361a mo33266e(String str, C10364e0 e0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (e0Var != null && !C11639f.m56735b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (e0Var != null || !C11639f.m56738e(str)) {
                this.f41057b = str;
                this.f41059d = e0Var;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        /* renamed from: f */
        public C10361a mo33267f(String str) {
            this.f41058c.mo33414e(str);
            return this;
        }

        /* renamed from: g */
        public C10361a mo33268g(C10397x xVar) {
            Objects.requireNonNull(xVar, "url == null");
            this.f41056a = xVar;
            return this;
        }

        /* renamed from: h */
        public C10361a mo33269h(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return mo33268g(C10397x.m52509k(str));
        }

        C10361a(C10360d0 d0Var) {
            Map<Class<?>, Object> map;
            this.f41060e = Collections.emptyMap();
            this.f41056a = d0Var.f41050a;
            this.f41057b = d0Var.f41051b;
            this.f41059d = d0Var.f41053d;
            if (d0Var.f41054e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(d0Var.f41054e);
            }
            this.f41060e = map;
            this.f41058c = d0Var.f41052c.mo33404f();
        }
    }
}
