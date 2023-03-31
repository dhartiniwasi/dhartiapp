package p330q8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C0681a;
import p246h7.C10408b;
import p395x7.C12977a;
import p395x7.C12979c;

/* renamed from: q8.a */
/* compiled from: DataCollectionConfigStorage */
public class C12192a {

    /* renamed from: a */
    private final Context f45276a;

    /* renamed from: b */
    private final SharedPreferences f45277b;

    /* renamed from: c */
    private final C12979c f45278c;

    /* renamed from: d */
    private boolean f45279d = m58483c();

    public C12192a(Context context, String str, C12979c cVar) {
        Context a = m58482a(context);
        this.f45276a = a;
        this.f45277b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f45278c = cVar;
    }

    /* renamed from: a */
    private static Context m58482a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return C0681a.m3146b(context);
    }

    /* renamed from: c */
    private boolean m58483c() {
        if (this.f45277b.contains("firebase_data_collection_default_enabled")) {
            return this.f45277b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m58484d();
    }

    /* renamed from: d */
    private boolean m58484d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f45276a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f45276a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: f */
    private synchronized void m58485f(boolean z) {
        if (this.f45279d != z) {
            this.f45279d = z;
            this.f45278c.mo36278b(new C12977a(C10408b.class, new C10408b(z)));
        }
    }

    /* renamed from: b */
    public synchronized boolean mo36702b() {
        return this.f45279d;
    }

    /* renamed from: e */
    public synchronized void mo36703e(Boolean bool) {
        if (bool == null) {
            this.f45277b.edit().remove("firebase_data_collection_default_enabled").apply();
            m58485f(m58484d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f45277b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            m58485f(equals);
        }
    }
}
