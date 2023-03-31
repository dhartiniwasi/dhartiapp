package com.startapp;

/* renamed from: com.startapp.h9 */
/* compiled from: Sta */
public class C9006h9 implements Runnable {

    /* renamed from: a */
    private final Runnable f36914a;

    public C9006h9(Runnable runnable) {
        this.f36914a = runnable;
    }

    public void run() {
        try {
            this.f36914a.run();
        } catch (Throwable th) {
            C9632x2.m50513c(th);
        }
    }
}
