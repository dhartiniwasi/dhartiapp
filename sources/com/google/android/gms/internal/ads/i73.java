package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class i73 {
    /* renamed from: a */
    public static String m14184a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m14188e(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m14188e(c)) {
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

    /* renamed from: b */
    public static String m14185b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m14187d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m14187d(c)) {
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

    /* renamed from: c */
    public static boolean m14186c(CharSequence charSequence, CharSequence charSequence2) {
        int f;
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
            if (charAt != charAt2 && ((f = m14189f(charAt)) >= 26 || f != m14189f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m14187d(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: e */
    public static boolean m14188e(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: f */
    private static int m14189f(char c) {
        return (char) ((c | ' ') - 'a');
    }
}
