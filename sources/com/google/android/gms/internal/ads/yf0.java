package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class yf0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f20585a;

    /* renamed from: b */
    final /* synthetic */ ag0 f20586b;

    yf0(ag0 ag0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f20586b = ag0;
        this.f20585a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f20586b.mo8327e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20585a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f20585a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
