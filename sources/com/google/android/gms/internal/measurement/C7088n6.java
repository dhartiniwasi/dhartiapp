package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.C0693c;

/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7088n6 implements C7040k6 {

    /* renamed from: c */
    private static C7088n6 f31911c;

    /* renamed from: a */
    private final Context f31912a;

    /* renamed from: b */
    private final ContentObserver f31913b;

    private C7088n6() {
        this.f31912a = null;
        this.f31913b = null;
    }

    private C7088n6(Context context) {
        this.f31912a = context;
        C7072m6 m6Var = new C7072m6(this, (Handler) null);
        this.f31913b = m6Var;
        context.getContentResolver().registerContentObserver(C6873a6.f31544a, true, m6Var);
    }

    /* renamed from: a */
    static C7088n6 m40444a(Context context) {
        C7088n6 n6Var;
        C7088n6 n6Var2;
        synchronized (C7088n6.class) {
            if (f31911c == null) {
                if (C0693c.m3183b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    n6Var2 = new C7088n6(context);
                } else {
                    n6Var2 = new C7088n6();
                }
                f31911c = n6Var2;
            }
            n6Var = f31911c;
        }
        return n6Var;
    }

    /* renamed from: d */
    static synchronized void m40445d() {
        Context context;
        synchronized (C7088n6.class) {
            C7088n6 n6Var = f31911c;
            if (!(n6Var == null || (context = n6Var.f31912a) == null || n6Var.f31913b == null)) {
                context.getContentResolver().unregisterContentObserver(f31911c.f31913b);
            }
            f31911c = null;
        }
    }

    /* renamed from: b */
    public final String mo23322i(String str) {
        Context context = this.f31912a;
        if (context != null && !C6890b6.m39659a(context)) {
            try {
                return (String) C7008i6.m40199a(new C7056l6(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String mo23696c(String str) {
        return C6873a6.m39466a(this.f31912a.getContentResolver(), str, (String) null);
    }
}
