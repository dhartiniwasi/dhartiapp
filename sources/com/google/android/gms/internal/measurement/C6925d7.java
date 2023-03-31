package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p124r.C5413a;

/* renamed from: com.google.android.gms.internal.measurement.d7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C6925d7 implements C7040k6 {

    /* renamed from: b */
    private static final Map f31642b = new C5413a();

    /* renamed from: a */
    private final SharedPreferences f31643a;

    /* renamed from: a */
    static C6925d7 m39920a(Context context, String str, Runnable runnable) {
        C6925d7 d7Var;
        if (!C6890b6.m39660b()) {
            synchronized (C6925d7.class) {
                d7Var = (C6925d7) f31642b.get((Object) null);
                if (d7Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return d7Var;
        }
        throw null;
    }

    /* renamed from: b */
    static synchronized void m39921b() {
        synchronized (C6925d7.class) {
            Map map = f31642b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C6925d7) it.next()).f31643a;
                throw null;
            }
        }
    }

    /* renamed from: i */
    public final Object mo23322i(String str) {
        throw null;
    }
}
