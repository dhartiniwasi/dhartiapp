package p033d5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p061h5.C4626a;
import p137s5.C5489e;

/* renamed from: d5.s1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4146s1 extends C4108h {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashMap f23393f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f23394g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile Handler f23395h;

    /* renamed from: i */
    private final C4143r1 f23396i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4626a f23397j;

    /* renamed from: k */
    private final long f23398k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final long f23399l;

    C4146s1(Context context, Looper looper) {
        C4143r1 r1Var = new C4143r1(this, (C4140q1) null);
        this.f23396i = r1Var;
        this.f23394g = context.getApplicationContext();
        this.f23395h = new C5489e(looper, r1Var);
        this.f23397j = C4626a.m30143b();
        this.f23398k = 5000;
        this.f23399l = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo17397d(C4132o1 o1Var, ServiceConnection serviceConnection, String str) {
        C4141r.m28222l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f23393f) {
            C4136p1 p1Var = (C4136p1) this.f23393f.get(o1Var);
            if (p1Var == null) {
                String obj = o1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (p1Var.mo17452h(serviceConnection)) {
                p1Var.mo17450f(serviceConnection, str);
                if (p1Var.mo17453i()) {
                    this.f23395h.sendMessageDelayed(this.f23395h.obtainMessage(0, o1Var), this.f23398k);
                }
            } else {
                String obj2 = o1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo17399f(C4132o1 o1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j;
        C4141r.m28222l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f23393f) {
            C4136p1 p1Var = (C4136p1) this.f23393f.get(o1Var);
            if (p1Var == null) {
                p1Var = new C4136p1(this, o1Var);
                p1Var.mo17448d(serviceConnection, serviceConnection, str);
                p1Var.mo17449e(str, executor);
                this.f23393f.put(o1Var, p1Var);
            } else {
                this.f23395h.removeMessages(0, o1Var);
                if (!p1Var.mo17452h(serviceConnection)) {
                    p1Var.mo17448d(serviceConnection, serviceConnection, str);
                    int a = p1Var.mo17445a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(p1Var.mo17446b(), p1Var.mo17447c());
                    } else if (a == 2) {
                        p1Var.mo17449e(str, executor);
                    }
                } else {
                    String obj = o1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j = p1Var.mo17454j();
        }
        return j;
    }
}
