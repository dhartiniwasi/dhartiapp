package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.ig */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2475ig extends C2513jh {
    public C2475ig(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", ybVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        this.f11603e.mo15378T(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.f11604f.invoke((Object) null, new Object[]{this.f11600b.mo14902b()})).booleanValue();
            C3063yb ybVar = this.f11603e;
            if (true == booleanValue) {
                i = 2;
            }
            ybVar.mo15378T(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
