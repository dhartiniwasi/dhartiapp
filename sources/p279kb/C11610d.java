package p279kb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import p186ac.C6544d;

/* renamed from: kb.d */
/* compiled from: ConnectivityBroadcastReceiver */
public class C11610d extends BroadcastReceiver implements C6544d.C6549d {

    /* renamed from: a */
    private final Context f44154a;

    /* renamed from: b */
    private final C11607a f44155b;

    /* renamed from: c */
    private C6544d.C6546b f44156c;

    /* renamed from: d */
    private final Handler f44157d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private ConnectivityManager.NetworkCallback f44158e;

    /* renamed from: kb.d$a */
    /* compiled from: ConnectivityBroadcastReceiver */
    class C11611a extends ConnectivityManager.NetworkCallback {
        C11611a() {
        }

        public void onAvailable(Network network) {
            C11610d.this.m56657h();
        }

        public void onLost(Network network) {
            C11610d.this.m56658j("none");
        }
    }

    public C11610d(Context context, C11607a aVar) {
        this.f44154a = context;
        this.f44155b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m56655f() {
        this.f44156c.success(this.f44155b.mo35777b());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m56656g(String str) {
        this.f44156c.success(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m56657h() {
        this.f44157d.post(new C11608b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m56658j(String str) {
        this.f44157d.post(new C11609c(this, str));
    }

    /* renamed from: e */
    public void mo22145e(Object obj, C6544d.C6546b bVar) {
        this.f44156c = bVar;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f44158e = new C11611a();
            this.f44155b.mo35776a().registerDefaultNetworkCallback(this.f44158e);
            return;
        }
        this.f44154a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: i */
    public void mo22146i(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                this.f44154a.unregisterReceiver(this);
            } catch (Exception unused) {
            }
        } else if (this.f44158e != null) {
            this.f44155b.mo35776a().unregisterNetworkCallback(this.f44158e);
            this.f44158e = null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        C6544d.C6546b bVar = this.f44156c;
        if (bVar != null) {
            bVar.success(this.f44155b.mo35777b());
        }
    }
}
