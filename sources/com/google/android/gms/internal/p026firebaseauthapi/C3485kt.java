package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3485kt {
    /* renamed from: a */
    public static String m26018a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        m26019b(sb, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            m26019b(sb, locale2);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static void m26019b(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }
}
