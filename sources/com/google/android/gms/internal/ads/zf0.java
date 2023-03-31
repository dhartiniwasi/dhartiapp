package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zf0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f21073a;

    /* renamed from: b */
    final /* synthetic */ ag0 f21074b;

    zf0(ag0 ag0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f21074b = ag0;
        this.f21073a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f21074b.mo8327e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21073a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f21073a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
