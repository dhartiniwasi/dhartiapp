package p371uc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: uc.e */
/* compiled from: Headers */
public final class C12731e {

    /* renamed from: a */
    private final String[] f46649a;

    /* renamed from: uc.e$b */
    /* compiled from: Headers */
    public static final class C12733b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<String> f46650a = new ArrayList(20);

        /* renamed from: d */
        private void m60381d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12733b mo37647b(String str, String str2) {
            this.f46650a.add(str);
            this.f46650a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C12731e mo37648c() {
            return new C12731e(this);
        }

        /* renamed from: e */
        public C12733b mo37649e(String str) {
            int i = 0;
            while (i < this.f46650a.size()) {
                if (str.equalsIgnoreCase(this.f46650a.get(i))) {
                    this.f46650a.remove(i);
                    this.f46650a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: f */
        public C12733b mo37650f(String str, String str2) {
            m60381d(str, str2);
            mo37649e(str);
            mo37647b(str, str2);
            return this;
        }
    }

    /* renamed from: a */
    public String mo37643a(int i) {
        int i2 = i * 2;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f46649a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    /* renamed from: b */
    public int mo37644b() {
        return this.f46649a.length / 2;
    }

    /* renamed from: c */
    public String mo37645c(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0) {
            return null;
        }
        String[] strArr = this.f46649a;
        if (i2 >= strArr.length) {
            return null;
        }
        return strArr[i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = mo37644b();
        for (int i = 0; i < b; i++) {
            sb.append(mo37643a(i));
            sb.append(": ");
            sb.append(mo37645c(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    private C12731e(C12733b bVar) {
        this.f46649a = (String[]) bVar.f46650a.toArray(new String[bVar.f46650a.size()]);
    }
}
