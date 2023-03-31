package com.startapp;

import android.os.HandlerThread;

/* renamed from: com.startapp.t3 */
/* compiled from: Sta */
public class C9550t3 extends HandlerThread {

    /* renamed from: a */
    public final Object f39181a = new Object();

    public C9550t3(String str) {
        super(str);
    }

    public void onLooperPrepared() {
        synchronized (this.f39181a) {
            this.f39181a.notifyAll();
        }
    }

    public void start() {
        synchronized (this.f39181a) {
            super.start();
            try {
                this.f39181a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
