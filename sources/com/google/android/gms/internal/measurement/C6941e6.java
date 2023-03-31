package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.e6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C6941e6 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C6958f6 f31667a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6941e6(C6958f6 f6Var, Handler handler) {
        super((Handler) null);
        this.f31667a = f6Var;
    }

    public final void onChange(boolean z) {
        this.f31667a.mo23412e();
    }
}
