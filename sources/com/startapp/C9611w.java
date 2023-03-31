package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import com.startapp.C8871c2;

/* renamed from: com.startapp.w */
/* compiled from: Sta */
public class C9611w extends C8871c2.C8872a {
    public C9611w(Context context, ConnectivityManager connectivityManager) {
        super(context, connectivityManager);
    }

    /* renamed from: a */
    public int mo29122a() {
        Network[] allNetworks;
        if (!C8837b0.m48304a(this.f36567a, "android.permission.ACCESS_NETWORK_STATE") || (allNetworks = this.f36568b.getAllNetworks()) == null) {
            return 0;
        }
        int i = 0;
        for (Network network : allNetworks) {
            if (network != null) {
                i |= C8871c2.m48423a(this.f36568b.getNetworkCapabilities(network));
            }
        }
        return i;
    }
}
