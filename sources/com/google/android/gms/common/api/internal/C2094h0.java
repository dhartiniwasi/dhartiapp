package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p123q5.C5412j;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2094h0 extends C5412j {

    /* renamed from: a */
    final /* synthetic */ C2097i0 f6202a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2094h0(C2097i0 i0Var, Looper looper) {
        super(looper);
        this.f6202a = i0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C2091g0) message.obj).mo8067b(this.f6202a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
