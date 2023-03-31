package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class os0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f15339a;

    os0(JsResult jsResult) {
        this.f15339a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15339a.cancel();
    }
}
