package p211d8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: d8.r */
/* compiled from: FieldPath */
public final class C9898r extends C9881e<C9898r> {

    /* renamed from: b */
    public static final C9898r f39731b = m50743x("__name__");

    /* renamed from: c */
    public static final C9898r f39732c = new C9898r(Collections.emptyList());

    private C9898r(List<String> list) {
        super(list);
    }

    /* renamed from: v */
    public static C9898r m50741v(List<String> list) {
        return list.isEmpty() ? f39732c : new C9898r(list);
    }

    /* renamed from: w */
    public static C9898r m50742w(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i++;
                if (i != str.length()) {
                    sb.append(str.charAt(i));
                } else {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
            } else if (charAt == '.') {
                if (!z) {
                    String sb2 = sb.toString();
                    if (!sb2.isEmpty()) {
                        StringBuilder sb3 = new StringBuilder();
                        arrayList.add(sb2);
                        sb = sb3;
                    } else {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                } else {
                    sb.append(charAt);
                }
            } else if (charAt == '`') {
                z = !z;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new C9898r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    /* renamed from: x */
    public static C9898r m50743x(String str) {
        return new C9898r(Collections.singletonList(str));
    }

    /* renamed from: z */
    private static boolean m50744z(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public String mo32348c() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f39707a.size(); i++) {
            if (i > 0) {
                sb.append(".");
            }
            String replace = this.f39707a.get(i).replace("\\", "\\\\").replace("`", "\\`");
            if (!m50744z(replace)) {
                replace = '`' + replace + '`';
            }
            sb.append(replace);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C9898r mo32353k(List<String> list) {
        return new C9898r(list);
    }

    /* renamed from: y */
    public boolean mo32415y() {
        return equals(f39731b);
    }
}
