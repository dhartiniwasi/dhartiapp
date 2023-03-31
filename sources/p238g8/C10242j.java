package p238g8;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p238g8.C10248k;
import p247h8.C10432b;
import p247h8.C10456n;
import p247h8.C10468v;

/* renamed from: g8.j */
/* compiled from: AndroidConnectivityMonitor */
public final class C10242j implements C10248k {

    /* renamed from: a */
    private final Context f40731a;

    /* renamed from: b */
    private final ConnectivityManager f40732b;

    /* renamed from: c */
    private Runnable f40733c;

    /* renamed from: d */
    private final List<C10456n<C10248k.C10249a>> f40734d = new ArrayList();

    /* renamed from: g8.j$a */
    /* compiled from: AndroidConnectivityMonitor */
    class C10243a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f40735a;

        C10243a(AtomicBoolean atomicBoolean) {
            this.f40735a = atomicBoolean;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f40735a.compareAndSet(true, false)) {
                C10242j.this.mo32949l();
            }
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            if (this.f40735a.compareAndSet(true, false)) {
                C10242j.this.mo32949l();
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f40735a.compareAndSet(true, false)) {
                C10242j.this.mo32949l();
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: g8.j$b */
    /* compiled from: AndroidConnectivityMonitor */
    class C10244b implements ComponentCallbacks2 {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f40737a;

        C10244b(AtomicBoolean atomicBoolean) {
            this.f40737a = atomicBoolean;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 20) {
                this.f40737a.set(true);
            }
        }
    }

    /* renamed from: g8.j$c */
    /* compiled from: AndroidConnectivityMonitor */
    private class C10245c extends ConnectivityManager.NetworkCallback {
        private C10245c() {
        }

        public void onAvailable(Network network) {
            C10242j.this.m51824k(true);
        }

        public void onLost(Network network) {
            C10242j.this.m51824k(false);
        }

        /* synthetic */ C10245c(C10242j jVar, C10243a aVar) {
            this();
        }
    }

    public C10242j(Context context) {
        C10432b.m52648d(context != null, "Context must be non-null", new Object[0]);
        this.f40731a = context;
        this.f40732b = (ConnectivityManager) context.getSystemService("connectivity");
        m51819f();
        m51820g();
    }

    /* renamed from: f */
    private void m51819f() {
        Application application = (Application) this.f40731a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new C10243a(atomicBoolean));
        application.registerComponentCallbacks(new C10244b(atomicBoolean));
    }

    /* renamed from: g */
    private void m51820g() {
        if (Build.VERSION.SDK_INT < 24 || this.f40732b == null) {
            C10246d dVar = new C10246d(this, (C10243a) null);
            this.f40731a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f40733c = new C10239i(this, dVar);
            return;
        }
        C10245c cVar = new C10245c(this, (C10243a) null);
        this.f40732b.registerDefaultNetworkCallback(cVar);
        this.f40733c = new C10237h(this, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m51821h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f40731a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m51822i(C10245c cVar) {
        this.f40732b.unregisterNetworkCallback(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m51823j(C10246d dVar) {
        this.f40731a.unregisterReceiver(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m51824k(boolean z) {
        synchronized (this.f40734d) {
            for (C10456n accept : this.f40734d) {
                accept.accept(z ? C10248k.C10249a.REACHABLE : C10248k.C10249a.UNREACHABLE);
            }
        }
    }

    /* renamed from: a */
    public void mo32948a(C10456n<C10248k.C10249a> nVar) {
        synchronized (this.f40734d) {
            this.f40734d.add(nVar);
        }
    }

    /* renamed from: l */
    public void mo32949l() {
        C10468v.m52767a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (m51821h()) {
            m51824k(true);
        }
    }

    public void shutdown() {
        Runnable runnable = this.f40733c;
        if (runnable != null) {
            runnable.run();
            this.f40733c = null;
        }
    }

    /* renamed from: g8.j$d */
    /* compiled from: AndroidConnectivityMonitor */
    private class C10246d extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f40740a;

        private C10246d() {
            this.f40740a = false;
        }

        public void onReceive(Context context, Intent intent) {
            boolean e = C10242j.this.m51821h();
            if (C10242j.this.m51821h() && !this.f40740a) {
                C10242j.this.m51824k(true);
            } else if (!e && this.f40740a) {
                C10242j.this.m51824k(false);
            }
            this.f40740a = e;
        }

        /* synthetic */ C10246d(C10242j jVar, C10243a aVar) {
            this();
        }
    }
}
