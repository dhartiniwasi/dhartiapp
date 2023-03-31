package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p011b.C1584a;
import p011b.C1586b;

/* renamed from: androidx.browser.customtabs.f */
/* compiled from: CustomTabsSession */
public final class C0588f {

    /* renamed from: a */
    private final Object f1926a = new Object();

    /* renamed from: b */
    private final C1586b f1927b;

    /* renamed from: c */
    private final C1584a f1928c;

    /* renamed from: d */
    private final ComponentName f1929d;

    /* renamed from: e */
    private final PendingIntent f1930e;

    C0588f(C1586b bVar, C1584a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1927b = bVar;
        this.f1928c = aVar;
        this.f1929d = componentName;
        this.f1930e = pendingIntent;
    }

    /* renamed from: a */
    private void m2758a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1930e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    private Bundle m2759b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m2758a(bundle2);
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public IBinder mo2700c() {
        return this.f1928c.asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ComponentName mo2701d() {
        return this.f1929d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PendingIntent mo2702e() {
        return this.f1930e;
    }

    /* renamed from: f */
    public boolean mo2703f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1927b.mo6406K2(this.f1928c, uri, m2759b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
