package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.C0576b;
import androidx.browser.customtabs.C0577c;
import androidx.browser.customtabs.C0584d;
import androidx.browser.customtabs.C0586e;
import androidx.browser.customtabs.C0588f;
import java.util.List;
import p103o.C5137b;

public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private C0577c mClient;
    private C0586e mConnection;
    private ConnectionCallback mConnectionCallback;
    private C0576b mCustomTabsCallback;
    private C0588f mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, C0584d dVar, Uri uri, int i) {
        dVar.f1914a.setData(uri);
        activity.startActivityForResult(dVar.f1914a, i);
    }

    public void bindCustomTabsService(Activity activity) {
        String packageNameToUse;
        if (this.mClient == null && (packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity)) != null) {
            ServiceConnection serviceConnection = new ServiceConnection(this);
            this.mConnection = serviceConnection;
            C0577c.m2736a(activity, packageNameToUse, serviceConnection);
        }
    }

    public C0588f getSession() {
        C0577c cVar = this.mClient;
        if (cVar == null) {
            this.mCustomTabsSession = null;
        } else if (this.mCustomTabsSession == null) {
            this.mCustomTabsSession = cVar.mo2673c(this.mCustomTabsCallback);
        }
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        C0588f session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        return session.mo2703f(uri, bundle, list);
    }

    public void onServiceConnected(C0577c cVar) {
        this.mClient = cVar;
        cVar.mo2674e(0);
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(C0576b bVar) {
        this.mCustomTabsCallback = bVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        C0586e eVar = this.mConnection;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.mClient = null;
            this.mCustomTabsSession = null;
            this.mConnection = null;
        }
    }

    public static void openCustomTab(Activity activity, C5137b bVar, Uri uri, int i) {
        bVar.mo19100a().setData(uri);
        activity.startActivityForResult(bVar.mo19100a(), i);
    }
}
