package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vo0 implements Runnable {
    vo0(xo0 xo0) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
