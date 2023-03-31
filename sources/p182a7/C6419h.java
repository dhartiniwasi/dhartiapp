package p182a7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* renamed from: a7.h */
/* compiled from: MoreObjects */
public final class C6419h {

    /* renamed from: a7.h$b */
    /* compiled from: MoreObjects */
    public static final class C6421b {

        /* renamed from: a */
        private final String f30669a;

        /* renamed from: b */
        private final C6423b f30670b;

        /* renamed from: c */
        private C6423b f30671c;

        /* renamed from: d */
        private boolean f30672d;

        /* renamed from: e */
        private boolean f30673e;

        /* renamed from: a7.h$b$a */
        /* compiled from: MoreObjects */
        private static final class C6422a extends C6423b {
            private C6422a() {
                super();
            }
        }

        /* renamed from: a7.h$b$b */
        /* compiled from: MoreObjects */
        private static class C6423b {

            /* renamed from: a */
            String f30674a;

            /* renamed from: b */
            Object f30675b;

            /* renamed from: c */
            C6423b f30676c;

            private C6423b() {
            }
        }

        /* renamed from: f */
        private C6423b m37529f() {
            C6423b bVar = new C6423b();
            this.f30671c.f30676c = bVar;
            this.f30671c = bVar;
            return bVar;
        }

        /* renamed from: g */
        private C6421b m37530g(String str, Object obj) {
            C6423b f = m37529f();
            f.f30675b = obj;
            f.f30674a = (String) C6431n.m37561n(str);
            return this;
        }

        /* renamed from: h */
        private C6422a m37531h() {
            C6422a aVar = new C6422a();
            this.f30671c.f30676c = aVar;
            this.f30671c = aVar;
            return aVar;
        }

        /* renamed from: i */
        private C6421b m37532i(String str, Object obj) {
            C6422a h = m37531h();
            h.f30675b = obj;
            h.f30674a = (String) C6431n.m37561n(str);
            return this;
        }

        /* renamed from: j */
        private static boolean m37533j(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof C6426k) {
                    return !((C6426k) obj).mo21846a();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: a */
        public C6421b mo21839a(String str, double d) {
            return m37532i(str, String.valueOf(d));
        }

        /* renamed from: b */
        public C6421b mo21840b(String str, int i) {
            return m37532i(str, String.valueOf(i));
        }

        /* renamed from: c */
        public C6421b mo21841c(String str, long j) {
            return m37532i(str, String.valueOf(j));
        }

        /* renamed from: d */
        public C6421b mo21842d(String str, Object obj) {
            return m37530g(str, obj);
        }

        /* renamed from: e */
        public C6421b mo21843e(String str, boolean z) {
            return m37532i(str, String.valueOf(z));
        }

        /* renamed from: k */
        public C6421b mo21844k() {
            this.f30672d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f30672d;
            boolean z2 = this.f30673e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f30669a);
            sb.append('{');
            String str = "";
            for (C6423b bVar = this.f30670b.f30676c; bVar != null; bVar = bVar.f30676c) {
                Object obj = bVar.f30675b;
                if (!(bVar instanceof C6422a)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m37533j(obj)) {
                    }
                }
                sb.append(str);
                String str2 = bVar.f30674a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private C6421b(String str) {
            C6423b bVar = new C6423b();
            this.f30670b = bVar;
            this.f30671c = bVar;
            this.f30672d = false;
            this.f30673e = false;
            this.f30669a = (String) C6431n.m37561n(str);
        }
    }

    /* renamed from: a */
    public static <T> T m37526a(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    /* renamed from: b */
    public static C6421b m37527b(Class<?> cls) {
        return new C6421b(cls.getSimpleName());
    }

    /* renamed from: c */
    public static C6421b m37528c(Object obj) {
        return new C6421b(obj.getClass().getSimpleName());
    }
}
