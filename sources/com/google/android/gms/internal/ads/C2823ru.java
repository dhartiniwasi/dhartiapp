package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import p053g4.C4409t;

/* renamed from: com.google.android.gms.internal.ads.ru */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2823ru {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2414gu f17098a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f17099b;

    /* renamed from: c */
    private final Context f17100c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f17101d = new Object();

    C2823ru(Context context) {
        this.f17100c = context;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m20031e(C2823ru ruVar) {
        synchronized (ruVar.f17101d) {
            C2414gu guVar = ruVar.f17098a;
            if (guVar != null) {
                guVar.mo17343e();
                ruVar.f17098a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future mo13882c(C2451hu huVar) {
        C2600lu luVar = new C2600lu(this);
        C2749pu puVar = new C2749pu(this, huVar, luVar);
        C2786qu quVar = new C2786qu(this, luVar);
        synchronized (this.f17101d) {
            C2414gu guVar = new C2414gu(this.f17100c, C4409t.m29330v().mo18569b(), puVar, quVar);
            this.f17098a = guVar;
            guVar.mo17355u();
        }
        return luVar;
    }
}
