package p174y4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p074j5.C4831a;
import p130r5.C5467e;
import p218e6.C9975i;

/* renamed from: y4.x */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C6167x {

    /* renamed from: e */
    private static C6167x f29621e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f29622a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f29623b;

    /* renamed from: c */
    private C6161r f29624c = new C6161r(this, (C6160q) null);

    /* renamed from: d */
    private int f29625d = 1;

    C6167x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f29623b = scheduledExecutorService;
        this.f29622a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized C6167x m35856b(Context context) {
        C6167x xVar;
        synchronized (C6167x.class) {
            if (f29621e == null) {
                C5467e.m33405a();
                f29621e = new C6167x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C4831a("MessengerIpcClient"))));
            }
            xVar = f29621e;
        }
        return xVar;
    }

    /* renamed from: f */
    private final synchronized int m35858f() {
        int i;
        i = this.f29625d;
        this.f29625d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> C9975i<T> m35859g(C6164u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f29624c.mo21035g(uVar)) {
            C6161r rVar = new C6161r(this, (C6160q) null);
            this.f29624c = rVar;
            rVar.mo21035g(uVar);
        }
        return uVar.f29618b.mo32542a();
    }

    /* renamed from: c */
    public final C9975i<Void> mo21044c(int i, Bundle bundle) {
        return m35859g(new C6163t(m35858f(), 2, bundle));
    }

    /* renamed from: d */
    public final C9975i<Bundle> mo21045d(int i, Bundle bundle) {
        return m35859g(new C6166w(m35858f(), 1, bundle));
    }
}
