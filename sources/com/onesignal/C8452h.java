package com.onesignal;

import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.h */
/* compiled from: BackgroundRunnable.kt */
public class C8452h implements Runnable {
    public void run() {
        Thread currentThread = Thread.currentThread();
        C11669k.m56786d(currentThread, "Thread.currentThread()");
        currentThread.setPriority(10);
    }
}
