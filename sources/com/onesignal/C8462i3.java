package com.onesignal;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.C0576b;
import androidx.browser.customtabs.C0577c;
import androidx.browser.customtabs.C0584d;
import androidx.browser.customtabs.C0586e;
import androidx.browser.customtabs.C0588f;
import java.util.List;

/* renamed from: com.onesignal.i3 */
/* compiled from: OneSignalChromeTab */
class C8462i3 {

    /* renamed from: com.onesignal.i3$a */
    /* compiled from: OneSignalChromeTab */
    private static class C8463a extends C0586e {

        /* renamed from: a */
        private String f35664a;

        /* renamed from: b */
        private boolean f35665b;

        C8463a(String str, boolean z) {
            this.f35664a = str;
            this.f35665b = z;
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, C0577c cVar) {
            cVar.mo2674e(0);
            C0588f c = cVar.mo2673c((C0576b) null);
            if (c != null) {
                Uri parse = Uri.parse(this.f35664a);
                c.mo2703f(parse, (Bundle) null, (List<Bundle>) null);
                if (this.f35665b) {
                    C0584d b = new C0584d.C0585a(c).mo2688b();
                    b.f1914a.setData(parse);
                    b.f1914a.addFlags(268435456);
                    if (Build.VERSION.SDK_INT >= 16) {
                        C8338d3.f35438f.startActivity(b.f1914a, b.f1915b);
                    } else {
                        C8338d3.f35438f.startActivity(b.f1914a);
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: a */
    private static boolean m46902a() {
        Class<C0586e> cls = C0586e.class;
        return true;
    }

    /* renamed from: b */
    protected static boolean m46903b(String str, boolean z) {
        if (!m46902a()) {
            return false;
        }
        return C0577c.m2736a(C8338d3.f35438f, "com.android.chrome", new C8463a(str, z));
    }
}
