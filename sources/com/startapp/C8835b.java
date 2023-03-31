package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.startapp.C8871c2;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.b */
/* compiled from: Sta */
public class C8835b extends C8871c2.C8872a {

    /* renamed from: c */
    public final Map<Network, Integer> f36436c = new HashMap();

    /* renamed from: com.startapp.b$a */
    /* compiled from: Sta */
    public class C8836a extends ConnectivityManager.NetworkCallback {
        public C8836a() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            int a = C8871c2.m48423a(networkCapabilities);
            synchronized (C8835b.this.f36436c) {
                C8835b.this.f36436c.put(network, Integer.valueOf(a));
            }
        }

        public void onLost(Network network) {
            synchronized (C8835b.this.f36436c) {
                C8835b.this.f36436c.remove(network);
            }
        }
    }

    public C8835b(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    /* renamed from: a */
    public int mo29122a() {
        int i;
        synchronized (this.f36436c) {
            i = 0;
            for (Integer next : this.f36436c.values()) {
                if (next != null) {
                    i |= next.intValue();
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo29123b() {
        if (C8837b0.m48304a(this.f36567a, "android.permission.ACCESS_NETWORK_STATE")) {
            this.f36568b.registerDefaultNetworkCallback(new C8836a());
        }
    }
}
