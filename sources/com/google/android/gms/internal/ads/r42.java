package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import p066i4.C4678r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class r42 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ C4678r f16825a;

    public /* synthetic */ r42(C4678r rVar) {
        this.f16825a = rVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C4678r rVar = this.f16825a;
        if (rVar != null) {
            rVar.mo18361d();
        }
    }
}
