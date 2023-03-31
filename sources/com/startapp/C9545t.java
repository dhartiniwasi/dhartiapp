package com.startapp;

import android.content.Context;
import java.lang.Thread;

/* renamed from: com.startapp.t */
/* compiled from: Sta */
public class C9545t implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public Thread.UncaughtExceptionHandler f39168a;

    public C9545t(Context context) {
    }

    /* renamed from: a */
    public final void mo31271a(Thread thread, Throwable th) {
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f39168a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (C9605vb.m50446a(th) != null) {
                if ("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n".equals(th.getMessage())) {
                    mo31271a(thread, th);
                    return;
                }
                C9023i4.m48682a(th, C9043j4.f36997h);
            }
        } catch (Throwable unused) {
        }
        mo31271a(thread, th);
    }
}
