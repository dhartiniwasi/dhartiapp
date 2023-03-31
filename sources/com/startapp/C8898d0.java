package com.startapp;

import android.content.SharedPreferences;

/* renamed from: com.startapp.d0 */
/* compiled from: Sta */
public class C8898d0 {

    /* renamed from: a */
    public final Object f36662a = new Object();

    /* renamed from: b */
    public final SharedPreferences f36663b;

    /* renamed from: c */
    public volatile String f36664c;

    /* renamed from: d */
    public volatile String f36665d;

    public C8898d0(SharedPreferences sharedPreferences) {
        this.f36663b = sharedPreferences;
    }

    /* renamed from: a */
    public boolean mo29287a() {
        boolean contains;
        synchronized (this.f36662a) {
            contains = this.f36663b.contains("2696a7f502faed4b");
        }
        return contains;
    }
}
