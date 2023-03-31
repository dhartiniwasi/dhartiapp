package com.google.android.gms.internal.p026firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.List;
import p017b5.C1793e;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3518lt extends LifecycleCallback {

    /* renamed from: b */
    private final List f22340b;

    private C3518lt(C1793e eVar, List list) {
        super(eVar);
        this.f6083a.mo6925a("PhoneAuthActivityStopCallback", this);
        this.f22340b = list;
    }

    /* renamed from: l */
    public static void m26133l(Activity activity, List list) {
        C1793e c = LifecycleCallback.m9130c(activity);
        if (((C3518lt) c.mo6926b("PhoneAuthActivityStopCallback", C3518lt.class)) == null) {
            new C3518lt(c, list);
        }
    }

    /* renamed from: k */
    public final void mo8008k() {
        synchronized (this.f22340b) {
            this.f22340b.clear();
        }
    }
}
