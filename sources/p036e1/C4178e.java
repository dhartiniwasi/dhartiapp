package p036e1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.C0757a;
import p020c1.C1837b;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: e1.e */
/* compiled from: NetworkStateTracker */
public class C4178e extends C4176d<C1837b> {

    /* renamed from: j */
    static final String f23444j = C6094j.m35719f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f23445g = ((ConnectivityManager) this.f23438b.getSystemService("connectivity"));

    /* renamed from: h */
    private C4180b f23446h;

    /* renamed from: i */
    private C4179a f23447i;

    /* renamed from: e1.e$a */
    /* compiled from: NetworkStateTracker */
    private class C4179a extends BroadcastReceiver {
        C4179a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C6094j.m35717c().mo20921a(C4178e.f23444j, "Network broadcast received", new Throwable[0]);
                C4178e eVar = C4178e.this;
                eVar.mo17512d(eVar.mo17514g());
            }
        }
    }

    /* renamed from: e1.e$b */
    /* compiled from: NetworkStateTracker */
    private class C4180b extends ConnectivityManager.NetworkCallback {
        C4180b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C6094j.m35717c().mo20921a(C4178e.f23444j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C4178e eVar = C4178e.this;
            eVar.mo17512d(eVar.mo17514g());
        }

        public void onLost(Network network) {
            C6094j.m35717c().mo20921a(C4178e.f23444j, "Network connection lost", new Throwable[0]);
            C4178e eVar = C4178e.this;
            eVar.mo17512d(eVar.mo17514g());
        }
    }

    public C4178e(Context context, C4647a aVar) {
        super(context, aVar);
        if (m28308j()) {
            this.f23446h = new C4180b();
        } else {
            this.f23447i = new C4179a();
        }
    }

    /* renamed from: j */
    private static boolean m28308j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: e */
    public void mo17507e() {
        if (m28308j()) {
            try {
                C6094j.m35717c().mo20921a(f23444j, "Registering network callback", new Throwable[0]);
                this.f23445g.registerDefaultNetworkCallback(this.f23446h);
            } catch (IllegalArgumentException | SecurityException e) {
                C6094j.m35717c().mo20922b(f23444j, "Received exception while registering network callback", e);
            }
        } else {
            C6094j.m35717c().mo20921a(f23444j, "Registering broadcast receiver", new Throwable[0]);
            this.f23438b.registerReceiver(this.f23447i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: f */
    public void mo17508f() {
        if (m28308j()) {
            try {
                C6094j.m35717c().mo20921a(f23444j, "Unregistering network callback", new Throwable[0]);
                this.f23445g.unregisterNetworkCallback(this.f23446h);
            } catch (IllegalArgumentException | SecurityException e) {
                C6094j.m35717c().mo20922b(f23444j, "Received exception while unregistering network callback", e);
            }
        } else {
            C6094j.m35717c().mo20921a(f23444j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f23438b.unregisterReceiver(this.f23447i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1837b mo17514g() {
        NetworkInfo activeNetworkInfo = this.f23445g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i = mo17516i();
        boolean a = C0757a.m3502a(this.f23445g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C1837b(z2, i, a, z);
    }

    /* renamed from: h */
    public C1837b mo17502b() {
        return mo17514g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17516i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f23445g.getNetworkCapabilities(this.f23445g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C6094j.m35717c().mo20922b(f23444j, "Unable to validate active network", e);
            return false;
        }
    }
}
