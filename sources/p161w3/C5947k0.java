package p161w3;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: w3.k0 */
/* compiled from: UriUtil */
public final class C5947k0 {
    /* renamed from: a */
    private static int[] m35051a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: b */
    public static boolean m35052b(String str) {
        return (str == null || m35051a(str)[0] == -1) ? false : true;
    }

    /* renamed from: c */
    private static String m35053c(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m35054d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a = m35051a(str2);
        if (a[0] != -1) {
            sb.append(str2);
            m35053c(sb, a[1], a[2]);
            return sb.toString();
        }
        int[] a2 = m35051a(str);
        if (a[3] == 0) {
            sb.append(str, 0, a2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (a[2] == 0) {
            sb.append(str, 0, a2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (a[1] != 0) {
            int i = a2[0] + 1;
            sb.append(str, 0, i);
            sb.append(str2);
            return m35053c(sb, a[1] + i, i + a[2]);
        } else if (str2.charAt(a[1]) == '/') {
            sb.append(str, 0, a2[1]);
            sb.append(str2);
            return m35053c(sb, a2[1], a2[1] + a[2]);
        } else if (a2[0] + 2 >= a2[1] || a2[1] != a2[2]) {
            int lastIndexOf = str.lastIndexOf(47, a2[2] - 1);
            int i2 = lastIndexOf == -1 ? a2[1] : lastIndexOf + 1;
            sb.append(str, 0, i2);
            sb.append(str2);
            return m35053c(sb, a2[1], i2 + a[2]);
        } else {
            sb.append(str, 0, a2[1]);
            sb.append('/');
            sb.append(str2);
            return m35053c(sb, a2[1], a2[1] + a[2] + 1);
        }
    }

    /* renamed from: e */
    public static Uri m35055e(String str, String str2) {
        return Uri.parse(m35054d(str, str2));
    }
}
