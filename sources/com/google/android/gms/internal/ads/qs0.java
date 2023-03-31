package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qs0 implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f16511a;

    qs0(JsPromptResult jsPromptResult) {
        this.f16511a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16511a.cancel();
    }
}
