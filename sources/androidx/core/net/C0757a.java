package androidx.core.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

/* renamed from: androidx.core.net.a */
/* compiled from: ConnectivityManagerCompat */
public final class C0757a {

    /* renamed from: androidx.core.net.a$a */
    /* compiled from: ConnectivityManagerCompat */
    static class C0758a {
        /* renamed from: a */
        static boolean m3503a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: a */
    public static boolean m3502a(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0758a.m3503a(connectivityManager);
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 7 || type == 9) {
            return false;
        }
        return true;
    }
}
