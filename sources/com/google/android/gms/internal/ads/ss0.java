package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ss0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ JsPromptResult f17638a;

    /* renamed from: b */
    final /* synthetic */ EditText f17639b;

    ss0(JsPromptResult jsPromptResult, EditText editText) {
        this.f17638a = jsPromptResult;
        this.f17639b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17638a.confirm(this.f17639b.getText().toString());
    }
}
