package p279kb;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: kb.a */
/* compiled from: Connectivity */
public class C11607a {

    /* renamed from: a */
    private final ConnectivityManager f44150a;

    public C11607a(ConnectivityManager connectivityManager) {
        this.f44150a = connectivityManager;
    }

    /* renamed from: c */
    private String m56648c() {
        NetworkInfo activeNetworkInfo = this.f44150a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "mobile";
        }
        if (type == 1) {
            return "wifi";
        }
        if (type == 4 || type == 5) {
            return "mobile";
        }
        if (type == 6) {
            return "wifi";
        }
        if (type != 9) {
            return "none";
        }
        return "ethernet";
    }

    /* renamed from: a */
    public ConnectivityManager mo35776a() {
        return this.f44150a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo35777b() {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = this.f44150a.getNetworkCapabilities(this.f44150a.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "ethernet";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
        }
        return m56648c();
    }
}
