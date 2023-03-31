package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rs0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f17089a;

    rs0(JsPromptResult jsPromptResult) {
        this.f17089a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17089a.cancel();
    }
}
