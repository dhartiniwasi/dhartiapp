package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import p060h4.C4596v;
import p088l5.C4956b;

/* renamed from: com.google.android.gms.internal.ads.bv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2229bv {

    /* renamed from: a */
    C3069yh f7463a;

    /* renamed from: b */
    boolean f7464b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f7465c;

    public C2229bv() {
        this.f7465c = em0.f8846b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void mo8950b(Context context) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14502a4)).booleanValue()) {
            try {
                this.f7463a = (C3069yh) tm0.m21079b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C3045xu.f20344a);
                this.f7463a.mo14930x5(C4956b.m31385o3(context), "GMA_SDK");
                this.f7464b = true;
            } catch (RemoteException | sm0 | NullPointerException unused) {
                pm0.m18662b("Cannot dynamite load clearcut");
            }
        }
    }

    public C2229bv(Context context) {
        ExecutorService executorService = em0.f8846b;
        this.f7465c = executorService;
        C2679nz.m17343c(context);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14311G8)).booleanValue()) {
            executorService.execute(new C3008wu(this, context));
        } else {
            mo8950b(context);
        }
    }
}
