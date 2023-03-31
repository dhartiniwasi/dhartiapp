package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.c2 */
/* compiled from: Sta */
public class C8871c2 {

    /* renamed from: f */
    public static final int[] f36561f;

    /* renamed from: a */
    public final Context f36562a;

    /* renamed from: b */
    public final C8908d3<ConnectivityHelperMetadata> f36563b;

    /* renamed from: c */
    public final List<C8908d3<Void>> f36564c = new LinkedList();

    /* renamed from: d */
    public final AtomicBoolean f36565d = new AtomicBoolean(false);

    /* renamed from: e */
    public C8872a f36566e;

    /* renamed from: com.startapp.c2$a */
    /* compiled from: Sta */
    public static abstract class C8872a {

        /* renamed from: a */
        public final Context f36567a;

        /* renamed from: b */
        public final ConnectivityManager f36568b;

        public C8872a(Context context, ConnectivityManager connectivityManager) {
            this.f36567a = context;
            this.f36568b = connectivityManager;
        }

        /* renamed from: a */
        public abstract int mo29122a();

        /* renamed from: b */
        public void mo29123b() {
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            arrayList.add(0);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
        }
        if (i >= 26) {
            arrayList.add(5);
        }
        if (i >= 27) {
            arrayList.add(6);
        }
        if (i >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        f36561f = iArr;
    }

    public C8871c2(Context context, C8908d3<ConnectivityHelperMetadata> d3Var) {
        this.f36562a = context;
        this.f36563b = d3Var;
    }

    /* renamed from: a */
    public boolean mo29241a() {
        if (C8837b0.m48304a(this.f36562a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f36562a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th) {
                if (!C9605vb.m50466a(th, (Class<? extends Throwable>) RemoteException.class)) {
                    C9023i4.m48681a(th);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m48423a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : f36561f) {
            try {
                if (networkCapabilities.hasTransport(i2)) {
                    i |= 1 << i2;
                }
            } catch (Throwable unused) {
            }
        }
        return i;
    }
}
