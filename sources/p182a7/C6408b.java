package p182a7;

/* renamed from: a7.b */
/* compiled from: Ascii */
public final class C6408b {
    /* renamed from: a */
    public static boolean m37502a(CharSequence charSequence, CharSequence charSequence2) {
        int b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((b = m37503b(charAt)) >= 26 || b != m37503b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m37503b(char c) {
        return (char) ((c | ' ') - 'a');
    }

    /* renamed from: c */
    public static boolean m37504c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: d */
    public static boolean m37505d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: e */
    public static String m37506e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m37505d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m37505d(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m37507f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m37504c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m37504c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
