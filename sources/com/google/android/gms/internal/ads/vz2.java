package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vz2 {

    /* renamed from: a */
    private boolean f19384a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14851a(Context context) {
        e13.m11814b(context, "Application Context cannot be null");
        if (!this.f19384a) {
            this.f19384a = true;
            s03.m20100b().mo13918c(context);
            n03 a = n03.m16839a();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(a);
            }
            c13.m10679g(context);
            p03.m18265b().mo13098c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo14852b() {
        return this.f19384a;
    }
}
