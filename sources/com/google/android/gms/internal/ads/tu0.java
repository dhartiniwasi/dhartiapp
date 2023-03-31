package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tu0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public vm0 f18252a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f18253b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference f18254c;

    /* renamed from: c */
    public final tu0 mo14390c(Context context) {
        this.f18254c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f18253b = context;
        return this;
    }

    /* renamed from: d */
    public final tu0 mo14391d(vm0 vm0) {
        this.f18252a = vm0;
        return this;
    }
}
