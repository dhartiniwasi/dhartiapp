package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class iz1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C2955ve f11144a;

    /* renamed from: b */
    public final /* synthetic */ Context f11145b;

    public /* synthetic */ iz1(C2955ve veVar, Context context) {
        this.f11144a = veVar;
        this.f11145b = context;
    }

    public final Object call() {
        C2955ve veVar = this.f11144a;
        return veVar.mo14737c().mo12591b(this.f11145b);
    }
}
