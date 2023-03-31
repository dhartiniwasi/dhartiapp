package p181a6;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import p033d5.C4141r;
import p180z4.C6370f;
import p180z4.C6372g;
import p180z4.C6374h;
import p180z4.C6378j;

/* renamed from: a6.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6404a {

    /* renamed from: a */
    private static final C6370f f30645a = C6370f.m37437h();

    /* renamed from: b */
    private static final Object f30646b = new Object();

    /* renamed from: c */
    private static Method f30647c = null;

    /* renamed from: d */
    private static Method f30648d = null;

    /* renamed from: a */
    public static void m37495a(Context context) throws C6374h, C6372g {
        Context context2;
        C4141r.m28222l(context, "Context must not be null");
        f30645a.mo21801n(context, 11925000);
        synchronized (f30646b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m9486e(context, DynamiteModule.f6329f, "com.google.android.gms.providerinstaller.dynamite").mo8135b();
            } catch (DynamiteModule.C2142a e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context e2 = C6378j.m37456e(context);
                if (e2 != null) {
                    try {
                        if (f30648d == null) {
                            Class cls = Long.TYPE;
                            f30648d = m37496b(e2, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                        }
                        f30648d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                    } catch (Exception e3) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e3.getMessage())));
                    }
                }
                if (e2 != null) {
                    m37497c(e2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new C6372g(8);
                }
            } else {
                m37497c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
    }

    /* renamed from: b */
    private static Method m37496b(Context context, String str, String str2, Class[] clsArr) throws ClassNotFoundException, NoSuchMethodException {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m37497c(Context context, Context context2, String str) throws C6372g {
        try {
            if (f30647c == null) {
                f30647c = m37496b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f30647c.invoke((Object) null, new Object[]{context});
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage())));
            }
            throw new C6372g(8);
        }
    }
}
