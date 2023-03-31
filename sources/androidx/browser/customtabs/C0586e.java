package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p011b.C1586b;

/* renamed from: androidx.browser.customtabs.e */
/* compiled from: CustomTabsServiceConnection */
public abstract class C0586e implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: androidx.browser.customtabs.e$a */
    /* compiled from: CustomTabsServiceConnection */
    class C0587a extends C0577c {
        C0587a(C1586b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    /* access modifiers changed from: package-private */
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C0577c cVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext != null) {
            onCustomTabsServiceConnected(componentName, new C0587a(C1586b.C1587a.m7337p(iBinder), componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    /* access modifiers changed from: package-private */
    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
