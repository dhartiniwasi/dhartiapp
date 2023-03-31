package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.hd */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2434hd implements Runnable {
    /* synthetic */ C2434hd(C2397gd gdVar) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C2471id.f10743b = MessageDigest.getInstance("MD5");
            countDownLatch = C2471id.f10746e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C2471id.f10746e;
        } catch (Throwable th) {
            C2471id.f10746e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
