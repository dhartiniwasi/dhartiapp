package p352sc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import p182a7.C6431n;
import p343rc.C12292c;
import p343rc.C12319g;
import p343rc.C12344k0;
import p343rc.C12367p;
import p343rc.C12399u0;
import p343rc.C12402v0;
import p343rc.C12404w0;
import p343rc.C12410y;
import p343rc.C12423z0;
import p361tc.C12611g;

/* renamed from: sc.a */
/* compiled from: AndroidChannelBuilder */
public final class C12506a extends C12410y<C12506a> {

    /* renamed from: c */
    private static final C12404w0 f45962c = m59649j();

    /* renamed from: a */
    private final C12402v0<?> f45963a;

    /* renamed from: b */
    private Context f45964b;

    /* renamed from: sc.a$b */
    /* compiled from: AndroidChannelBuilder */
    static final class C12508b extends C12399u0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12399u0 f45965a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Context f45966b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ConnectivityManager f45967c;

        /* renamed from: d */
        private final Object f45968d = new Object();

        /* renamed from: e */
        private Runnable f45969e;

        /* renamed from: sc.a$b$a */
        /* compiled from: AndroidChannelBuilder */
        class C12509a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12511c f45970a;

            C12509a(C12511c cVar) {
                this.f45970a = cVar;
            }

            public void run() {
                C12508b.this.f45967c.unregisterNetworkCallback(this.f45970a);
            }
        }

        /* renamed from: sc.a$b$b */
        /* compiled from: AndroidChannelBuilder */
        class C12510b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12512d f45972a;

            C12510b(C12512d dVar) {
                this.f45972a = dVar;
            }

            public void run() {
                C12508b.this.f45966b.unregisterReceiver(this.f45972a);
            }
        }

        /* renamed from: sc.a$b$c */
        /* compiled from: AndroidChannelBuilder */
        private class C12511c extends ConnectivityManager.NetworkCallback {
            private C12511c() {
            }

            public void onAvailable(Network network) {
                C12508b.this.f45965a.mo35083j();
            }

            public void onBlockedStatusChanged(Network network, boolean z) {
                if (!z) {
                    C12508b.this.f45965a.mo35083j();
                }
            }
        }

        /* renamed from: sc.a$b$d */
        /* compiled from: AndroidChannelBuilder */
        private class C12512d extends BroadcastReceiver {

            /* renamed from: a */
            private boolean f45975a;

            private C12512d() {
                this.f45975a = false;
            }

            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.f45975a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f45975a = z2;
                if (z2 && !z) {
                    C12508b.this.f45965a.mo35083j();
                }
            }
        }

        C12508b(C12399u0 u0Var, Context context) {
            this.f45965a = u0Var;
            this.f45966b = context;
            if (context != null) {
                this.f45967c = (ConnectivityManager) context.getSystemService("connectivity");
                try {
                    m59657r();
                } catch (SecurityException e) {
                    Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
                }
            } else {
                this.f45967c = null;
            }
        }

        /* renamed from: r */
        private void m59657r() {
            if (Build.VERSION.SDK_INT < 24 || this.f45967c == null) {
                C12512d dVar = new C12512d();
                this.f45966b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f45969e = new C12510b(dVar);
                return;
            }
            C12511c cVar = new C12511c();
            this.f45967c.registerDefaultNetworkCallback(cVar);
            this.f45969e = new C12509a(cVar);
        }

        /* renamed from: s */
        private void m59658s() {
            synchronized (this.f45968d) {
                Runnable runnable = this.f45969e;
                if (runnable != null) {
                    runnable.run();
                    this.f45969e = null;
                }
            }
        }

        /* renamed from: a */
        public String mo35080a() {
            return this.f45965a.mo35080a();
        }

        /* renamed from: e */
        public <RequestT, ResponseT> C12319g<RequestT, ResponseT> mo35081e(C12423z0<RequestT, ResponseT> z0Var, C12292c cVar) {
            return this.f45965a.mo35081e(z0Var, cVar);
        }

        /* renamed from: i */
        public boolean mo35082i(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f45965a.mo35082i(j, timeUnit);
        }

        /* renamed from: j */
        public void mo35083j() {
            this.f45965a.mo35083j();
        }

        /* renamed from: k */
        public C12367p mo35084k(boolean z) {
            return this.f45965a.mo35084k(z);
        }

        /* renamed from: l */
        public void mo35085l(C12367p pVar, Runnable runnable) {
            this.f45965a.mo35085l(pVar, runnable);
        }

        /* renamed from: m */
        public C12399u0 mo35086m() {
            m59658s();
            return this.f45965a.mo35086m();
        }

        /* renamed from: n */
        public C12399u0 mo35087n() {
            m59658s();
            return this.f45965a.mo35087n();
        }
    }

    private C12506a(C12402v0<?> v0Var) {
        this.f45963a = (C12402v0) C6431n.m37562o(v0Var, "delegateBuilder");
    }

    /* renamed from: j */
    private static C12404w0 m59649j() {
        try {
            try {
                C12404w0 w0Var = (C12404w0) C12611g.class.asSubclass(C12404w0.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (C12344k0.m59140a(w0Var)) {
                    return w0Var;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
                return null;
            } catch (Exception e) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e);
                return null;
            }
        } catch (ClassCastException e2) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e2);
            return null;
        }
    }

    /* renamed from: k */
    public static C12506a m59650k(C12402v0<?> v0Var) {
        return new C12506a(v0Var);
    }

    /* renamed from: a */
    public C12399u0 mo34948a() {
        return new C12508b(this.f45963a.mo34948a(), this.f45964b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12402v0<?> mo37160e() {
        return this.f45963a;
    }

    /* renamed from: i */
    public C12506a mo37298i(Context context) {
        this.f45964b = context;
        return this;
    }
}
