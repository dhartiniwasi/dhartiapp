package p033d5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p067i5.C4699m;

/* renamed from: d5.p1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4136p1 implements ServiceConnection, C4149t1 {

    /* renamed from: a */
    private final Map f23377a = new HashMap();

    /* renamed from: b */
    private int f23378b = 2;

    /* renamed from: c */
    private boolean f23379c;

    /* renamed from: d */
    private IBinder f23380d;

    /* renamed from: e */
    private final C4132o1 f23381e;

    /* renamed from: f */
    private ComponentName f23382f;

    /* renamed from: g */
    final /* synthetic */ C4146s1 f23383g;

    public C4136p1(C4146s1 s1Var, C4132o1 o1Var) {
        this.f23383g = s1Var;
        this.f23381e = o1Var;
    }

    /* renamed from: a */
    public final int mo17445a() {
        return this.f23378b;
    }

    /* renamed from: b */
    public final ComponentName mo17446b() {
        return this.f23382f;
    }

    /* renamed from: c */
    public final IBinder mo17447c() {
        return this.f23380d;
    }

    /* renamed from: d */
    public final void mo17448d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f23377a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo17449e(String str, Executor executor) {
        this.f23378b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C4699m.m30422m()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C4146s1 s1Var = this.f23383g;
            boolean d = s1Var.f23397j.mo18193d(s1Var.f23394g, str, this.f23381e.mo17437c(s1Var.f23394g), this, this.f23381e.mo17435a(), executor);
            this.f23379c = d;
            if (d) {
                this.f23383g.f23395h.sendMessageDelayed(this.f23383g.f23395h.obtainMessage(1, this.f23381e), this.f23383g.f23399l);
            } else {
                this.f23378b = 2;
                try {
                    C4146s1 s1Var2 = this.f23383g;
                    s1Var2.f23397j.mo18192c(s1Var2.f23394g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo17450f(ServiceConnection serviceConnection, String str) {
        this.f23377a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo17451g(String str) {
        this.f23383g.f23395h.removeMessages(1, this.f23381e);
        C4146s1 s1Var = this.f23383g;
        s1Var.f23397j.mo18192c(s1Var.f23394g, this);
        this.f23379c = false;
        this.f23378b = 2;
    }

    /* renamed from: h */
    public final boolean mo17452h(ServiceConnection serviceConnection) {
        return this.f23377a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo17453i() {
        return this.f23377a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo17454j() {
        return this.f23379c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f23383g.f23393f) {
            this.f23383g.f23395h.removeMessages(1, this.f23381e);
            this.f23380d = iBinder;
            this.f23382f = componentName;
            for (ServiceConnection onServiceConnected : this.f23377a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f23378b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f23383g.f23393f) {
            this.f23383g.f23395h.removeMessages(1, this.f23381e);
            this.f23380d = null;
            this.f23382f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f23377a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f23378b = 2;
        }
    }
}
