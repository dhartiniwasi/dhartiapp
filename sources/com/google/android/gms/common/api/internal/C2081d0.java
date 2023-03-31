package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p123q5.C5412j;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2081d0 extends C5412j {

    /* renamed from: a */
    final /* synthetic */ C2087f0 f6146a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2081d0(C2087f0 f0Var, Looper looper) {
        super(looper);
        this.f6146a = f0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C2087f0.m9260q(this.f6146a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C2087f0.m9259p(this.f6146a);
        }
    }
}
