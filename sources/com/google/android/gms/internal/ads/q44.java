package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.C0577c;
import androidx.browser.customtabs.C0586e;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q44 extends C0586e {

    /* renamed from: a */
    private final WeakReference f16181a;

    public q44(m00 m00, byte[] bArr) {
        this.f16181a = new WeakReference(m00);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C0577c cVar) {
        m00 m00 = (m00) this.f16181a.get();
        if (m00 != null) {
            m00.mo12239c(cVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m00 m00 = (m00) this.f16181a.get();
        if (m00 != null) {
            m00.mo12240d();
        }
    }
}
