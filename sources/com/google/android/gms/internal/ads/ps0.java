package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ps0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsResult f15984a;

    ps0(JsResult jsResult) {
        this.f15984a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15984a.confirm();
    }
}
