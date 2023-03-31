package p244ge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p253he.C10543e;

/* renamed from: ge.w */
/* compiled from: Headers */
public final class C10395w {

    /* renamed from: a */
    private final String[] f41302a;

    /* renamed from: ge.w$a */
    /* compiled from: Headers */
    public static final class C10396a {

        /* renamed from: a */
        final List<String> f41303a = new ArrayList(20);

        /* renamed from: a */
        public C10396a mo33410a(String str, String str2) {
            C10395w.m52489a(str);
            C10395w.m52490b(str2, str);
            return mo33412c(str, str2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C10396a mo33411b(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                return mo33412c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(":")) {
                return mo33412c("", str.substring(1));
            }
            return mo33412c("", str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C10396a mo33412c(String str, String str2) {
            this.f41303a.add(str);
            this.f41303a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C10395w mo33413d() {
            return new C10395w(this);
        }

        /* renamed from: e */
        public C10396a mo33414e(String str) {
            int i = 0;
            while (i < this.f41303a.size()) {
                if (str.equalsIgnoreCase(this.f41303a.get(i))) {
                    this.f41303a.remove(i);
                    this.f41303a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: f */
        public C10396a mo33415f(String str, String str2) {
            C10395w.m52489a(str);
            C10395w.m52490b(str2, str);
            mo33414e(str);
            mo33412c(str, str2);
            return this;
        }
    }

    C10395w(C10396a aVar) {
        List<String> list = aVar.f41303a;
        this.f41302a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    static void m52489a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C10543e.m53055p("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: b */
    static void m52490b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C10543e.m53055p("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    /* renamed from: d */
    private static String m52491d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C10395w m52492g(String... strArr) {
        Objects.requireNonNull(strArr, "namesAndValues == null");
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m52489a(str);
                m52490b(str2, str);
            }
            return new C10395w(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* renamed from: c */
    public String mo33401c(String str) {
        return m52491d(this.f41302a, str);
    }

    /* renamed from: e */
    public String mo33402e(int i) {
        return this.f41302a[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10395w) && Arrays.equals(((C10395w) obj).f41302a, this.f41302a);
    }

    /* renamed from: f */
    public C10396a mo33404f() {
        C10396a aVar = new C10396a();
        Collections.addAll(aVar.f41303a, this.f41302a);
        return aVar;
    }

    /* renamed from: h */
    public int mo33405h() {
        return this.f41302a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f41302a);
    }

    /* renamed from: i */
    public String mo33407i(int i) {
        return this.f41302a[(i * 2) + 1];
    }

    /* renamed from: j */
    public List<String> mo33408j(String str) {
        int h = mo33405h();
        ArrayList arrayList = null;
        for (int i = 0; i < h; i++) {
            if (str.equalsIgnoreCase(mo33402e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo33407i(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h = mo33405h();
        for (int i = 0; i < h; i++) {
            sb.append(mo33402e(i));
            sb.append(": ");
            sb.append(mo33407i(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C10395w(String[] strArr) {
        this.f41302a = strArr;
    }
}
