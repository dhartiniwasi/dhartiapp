package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6913cc;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C7558y3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C7331d4 f33197a;

    /* renamed from: b */
    public final /* synthetic */ String f33198b;

    public /* synthetic */ C7558y3(C7331d4 d4Var, String str) {
        this.f33197a = d4Var;
        this.f33198b = str;
    }

    public final Object call() {
        return new C6913cc("internal.remoteConfig", new C7320c4(this.f33197a, this.f33198b));
    }
}
