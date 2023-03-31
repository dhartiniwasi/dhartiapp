package com.startapp;

import java.util.Collection;
import java.util.Locale;

/* renamed from: com.startapp.c6 */
/* compiled from: Sta */
public class C8879c6 {

    /* renamed from: d */
    public static final C8879c6 f36583d = new C8879c6();

    /* renamed from: a */
    public final String f36584a;

    /* renamed from: b */
    public final String f36585b;

    /* renamed from: c */
    public final String f36586c;

    public C8879c6(Locale locale, Collection<Locale> collection) {
        this.f36584a = locale.toString();
        this.f36585b = m48433a((Locale) null, collection, ';');
        this.f36586c = m48433a(locale, collection, ',');
    }

    /* renamed from: a */
    public static String m48433a(Locale locale, Iterable<Locale> iterable, char c) {
        boolean z;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z = true;
        } else {
            z = false;
            sb = null;
        }
        if (iterable != null) {
            for (Locale next : iterable) {
                if (next != null) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    if (z) {
                        sb.append(c);
                    }
                    sb.append(next);
                    z = true;
                }
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public C8879c6() {
        this.f36584a = null;
        this.f36585b = null;
        this.f36586c = null;
    }
}
