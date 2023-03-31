package p061h5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p033d5.C4141r;
import p033d5.C4149t1;
import p067i5.C4699m;
import p081k5.C4888c;

/* renamed from: h5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4626a {

    /* renamed from: b */
    private static final Object f25068b = new Object();

    /* renamed from: c */
    private static volatile C4626a f25069c;

    /* renamed from: a */
    public ConcurrentHashMap f25070a = new ConcurrentHashMap();

    private C4626a() {
    }

    /* renamed from: b */
    public static C4626a m30143b() {
        if (f25069c == null) {
            synchronized (f25068b) {
                if (f25069c == null) {
                    f25069c = new C4626a();
                }
            }
        }
        C4626a aVar = f25069c;
        C4141r.m28221k(aVar);
        return aVar;
    }

    /* renamed from: e */
    private static void m30144e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m30145f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C4888c.m31075a(context).mo18670c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m30146g(serviceConnection)) {
            return m30147h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f25070a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m30147h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f25070a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m30146g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C4149t1);
    }

    /* renamed from: h */
    private static final boolean m30147h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!C4699m.m30420k() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo18191a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m30145f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo18192c(Context context, ServiceConnection serviceConnection) {
        if (!m30146g(serviceConnection) || !this.f25070a.containsKey(serviceConnection)) {
            m30144e(context, serviceConnection);
            return;
        }
        try {
            m30144e(context, (ServiceConnection) this.f25070a.get(serviceConnection));
        } finally {
            this.f25070a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo18193d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return m30145f(context, str, intent, serviceConnection, i, true, executor);
    }
}
