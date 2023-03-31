package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p011b.C1584a;
import p011b.C1586b;

/* renamed from: androidx.browser.customtabs.c */
/* compiled from: CustomTabsClient */
public class C0577c {

    /* renamed from: a */
    private final C1586b f1892a;

    /* renamed from: b */
    private final ComponentName f1893b;

    /* renamed from: c */
    private final Context f1894c;

    /* renamed from: androidx.browser.customtabs.c$a */
    /* compiled from: CustomTabsClient */
    class C0578a extends C1584a.C1585a {

        /* renamed from: a */
        private Handler f1895a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        final /* synthetic */ C0576b f1896b;

        /* renamed from: androidx.browser.customtabs.c$a$a */
        /* compiled from: CustomTabsClient */
        class C0579a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f1898a;

            /* renamed from: b */
            final /* synthetic */ Bundle f1899b;

            C0579a(int i, Bundle bundle) {
                this.f1898a = i;
                this.f1899b = bundle;
            }

            public void run() {
                C0578a.this.f1896b.onNavigationEvent(this.f1898a, this.f1899b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$b */
        /* compiled from: CustomTabsClient */
        class C0580b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f1901a;

            /* renamed from: b */
            final /* synthetic */ Bundle f1902b;

            C0580b(String str, Bundle bundle) {
                this.f1901a = str;
                this.f1902b = bundle;
            }

            public void run() {
                C0578a.this.f1896b.extraCallback(this.f1901a, this.f1902b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c */
        /* compiled from: CustomTabsClient */
        class C0581c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f1904a;

            C0581c(Bundle bundle) {
                this.f1904a = bundle;
            }

            public void run() {
                C0578a.this.f1896b.onMessageChannelReady(this.f1904a);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$d */
        /* compiled from: CustomTabsClient */
        class C0582d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f1906a;

            /* renamed from: b */
            final /* synthetic */ Bundle f1907b;

            C0582d(String str, Bundle bundle) {
                this.f1906a = str;
                this.f1907b = bundle;
            }

            public void run() {
                C0578a.this.f1896b.onPostMessage(this.f1906a, this.f1907b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$e */
        /* compiled from: CustomTabsClient */
        class C0583e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f1909a;

            /* renamed from: b */
            final /* synthetic */ Uri f1910b;

            /* renamed from: c */
            final /* synthetic */ boolean f1911c;

            /* renamed from: d */
            final /* synthetic */ Bundle f1912d;

            C0583e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f1909a = i;
                this.f1910b = uri;
                this.f1911c = z;
                this.f1912d = bundle;
            }

            public void run() {
                C0578a.this.f1896b.onRelationshipValidationResult(this.f1909a, this.f1910b, this.f1911c, this.f1912d);
            }
        }

        C0578a(C0576b bVar) {
            this.f1896b = bVar;
        }

        /* renamed from: B4 */
        public void mo2675B4(String str, Bundle bundle) throws RemoteException {
            if (this.f1896b != null) {
                this.f1895a.post(new C0580b(str, bundle));
            }
        }

        /* renamed from: C2 */
        public Bundle mo2676C2(String str, Bundle bundle) throws RemoteException {
            C0576b bVar = this.f1896b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        /* renamed from: Z5 */
        public void mo2677Z5(String str, Bundle bundle) throws RemoteException {
            if (this.f1896b != null) {
                this.f1895a.post(new C0582d(str, bundle));
            }
        }

        /* renamed from: e5 */
        public void mo2678e5(int i, Bundle bundle) {
            if (this.f1896b != null) {
                this.f1895a.post(new C0579a(i, bundle));
            }
        }

        /* renamed from: i6 */
        public void mo2679i6(Bundle bundle) throws RemoteException {
            if (this.f1896b != null) {
                this.f1895a.post(new C0581c(bundle));
            }
        }

        /* renamed from: m6 */
        public void mo2680m6(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f1896b != null) {
                this.f1895a.post(new C0583e(i, uri, z, bundle));
            }
        }
    }

    C0577c(C1586b bVar, ComponentName componentName, Context context) {
        this.f1892a = bVar;
        this.f1893b = componentName;
        this.f1894c = context;
    }

    /* renamed from: a */
    public static boolean m2736a(Context context, String str, C0586e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    /* renamed from: b */
    private C1584a.C1585a m2737b(C0576b bVar) {
        return new C0578a(bVar);
    }

    /* renamed from: d */
    private C0588f m2738d(C0576b bVar, PendingIntent pendingIntent) {
        boolean z;
        C1584a.C1585a b = m2737b(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z = this.f1892a.mo6407O4(b, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z = this.f1892a.mo6409w3(b);
        }
        if (!z) {
            return null;
        }
        return new C0588f(this.f1892a, b, this.f1893b, pendingIntent);
    }

    /* renamed from: c */
    public C0588f mo2673c(C0576b bVar) {
        return m2738d(bVar, (PendingIntent) null);
    }

    /* renamed from: e */
    public boolean mo2674e(long j) {
        try {
            return this.f1892a.mo6408k3(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
