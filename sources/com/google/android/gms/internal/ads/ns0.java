package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ns0 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f14181a;

    ns0(JsResult jsResult) {
        this.f14181a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f14181a.cancel();
    }
}
