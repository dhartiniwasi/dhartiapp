package com.google.android.gms.internal.ads;

import p053g4.C4409t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class if1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ jf1 f10763a;

    /* renamed from: b */
    public final /* synthetic */ Object f10764b;

    public /* synthetic */ if1(jf1 jf1, Object obj) {
        this.f10763a = jf1;
        this.f10764b = obj;
    }

    public final void run() {
        try {
            this.f10763a.mo8299b(this.f10764b);
        } catch (Throwable th) {
            C4409t.m29325q().mo15125s(th, "EventEmitter.notify");
            C4794n1.m30694l("Event emitter exception.", th);
        }
    }
}
