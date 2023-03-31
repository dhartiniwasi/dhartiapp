package p109o5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p067i5.C4694h;
import p150u4.C5746b;
import p150u4.C5747c;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: o5.l */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5236l implements C5746b {

    /* renamed from: e */
    private static C5746b f27086e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f27087a;

    /* renamed from: b */
    private boolean f27088b = false;

    /* renamed from: c */
    private final ScheduledExecutorService f27089c;

    /* renamed from: d */
    private final ExecutorService f27090d;

    C5236l(Context context) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f27089c = newSingleThreadScheduledExecutor;
        this.f27090d = Executors.newSingleThreadExecutor();
        this.f27087a = context;
        if (!this.f27088b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new C5234j(this, (C5233i) null), 0, 86400, TimeUnit.SECONDS);
            this.f27088b = true;
        }
    }

    /* renamed from: d */
    static synchronized C5746b m32420d(Context context) {
        C5746b bVar;
        synchronized (C5236l.class) {
            C4141r.m28222l(context, "Context must not be null");
            if (f27086e == null) {
                f27086e = new C5236l(context.getApplicationContext());
            }
            bVar = f27086e;
        }
        return bVar;
    }

    /* renamed from: f */
    protected static final void m32421f(Context context) {
        String str;
        if (!m32422g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to clear app set ID generated for App ".concat(valueOf);
            } else {
                str = new String("Failed to clear app set ID generated for App ");
            }
            Log.e("AppSet", str);
        }
        if (!m32422g(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
        }
    }

    /* renamed from: g */
    private static final SharedPreferences m32422g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* renamed from: h */
    private static final void m32423h(Context context) throws C5235k {
        String str;
        SharedPreferences g = m32422g(context);
        if (!g.edit().putLong("app_set_id_last_used_time", C4694h.m30388d().mo18370a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new C5235k("Failed to store the app set ID last used time.");
        }
    }

    /* renamed from: a */
    public final C9975i<C5747c> mo19226a() {
        C9977j jVar = new C9977j();
        this.f27090d.execute(new C5232h(this, jVar));
        return jVar.mo32542a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo19227b() {
        long j = m32422g(this.f27087a).getLong("app_set_id_last_used_time", -1);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo19228e(C9977j jVar) {
        String str;
        String str2;
        String string = m32422g(this.f27087a).getString("app_set_id", (String) null);
        long b = mo19227b();
        if (string == null || C4694h.m30388d().mo18370a() > b) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f27087a;
                if (!m32422g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to store app set ID generated for App ");
                    }
                    Log.e("AppSet", str2);
                    throw new C5235k("Failed to store the app set ID.");
                }
                m32423h(context);
                Context context2 = this.f27087a;
                SharedPreferences g = m32422g(context2);
                if (!g.edit().putLong("app_set_id_creation_time", C4694h.m30388d().mo18370a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                    } else {
                        str = new String("Failed to store app set ID creation time for App ");
                    }
                    Log.e("AppSet", str);
                    throw new C5235k("Failed to store the app set ID creation time.");
                }
            } catch (C5235k e) {
                jVar.mo32543b(e);
                return;
            }
        } else {
            try {
                m32423h(this.f27087a);
            } catch (C5235k e2) {
                jVar.mo32543b(e2);
                return;
            }
        }
        jVar.mo32544c(new C5747c(string, 1));
    }
}
