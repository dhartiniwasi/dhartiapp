package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
import p066i4.C4678r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class v42 extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f18913a;

    /* renamed from: b */
    final /* synthetic */ Timer f18914b;

    /* renamed from: c */
    final /* synthetic */ C4678r f18915c;

    v42(AlertDialog alertDialog, Timer timer, C4678r rVar) {
        this.f18913a = alertDialog;
        this.f18914b = timer;
        this.f18915c = rVar;
    }

    public final void run() {
        this.f18913a.dismiss();
        this.f18914b.cancel();
        C4678r rVar = this.f18915c;
        if (rVar != null) {
            rVar.mo18361d();
        }
    }
}
