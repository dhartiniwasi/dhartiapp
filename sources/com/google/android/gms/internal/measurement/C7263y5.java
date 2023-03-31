package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7263y5 extends ContentObserver {
    C7263y5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C6873a6.f31548e.set(true);
    }
}
