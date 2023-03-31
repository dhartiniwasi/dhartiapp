package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7364g4 extends Thread {

    /* renamed from: a */
    private final Object f32501a;

    /* renamed from: b */
    private final BlockingQueue f32502b;

    /* renamed from: c */
    private boolean f32503c = false;

    /* renamed from: d */
    final /* synthetic */ C7375h4 f32504d;

    public C7364g4(C7375h4 h4Var, String str, BlockingQueue blockingQueue) {
        this.f32504d = h4Var;
        C4141r.m28221k(str);
        C4141r.m28221k(blockingQueue);
        this.f32501a = new Object();
        this.f32502b = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m41491b() {
        synchronized (this.f32504d.f32538i) {
            if (!this.f32503c) {
                this.f32504d.f32539j.release();
                this.f32504d.f32538i.notifyAll();
                C7375h4 h4Var = this.f32504d;
                if (this == h4Var.f32532c) {
                    h4Var.f32532c = null;
                } else if (this == h4Var.f32533d) {
                    h4Var.f32533d = null;
                } else {
                    h4Var.f32389a.mo24135l().mo24256q().mo24208a("Current scheduler thread is neither worker nor network");
                }
                this.f32503c = true;
            }
        }
    }

    /* renamed from: c */
    private final void m41492c(InterruptedException interruptedException) {
        this.f32504d.f32389a.mo24135l().mo24261w().mo24209b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo24272a() {
        synchronized (this.f32501a) {
            this.f32501a.notifyAll();
        }
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f32504d.f32539j.acquire();
                z = true;
            } catch (InterruptedException e) {
                m41492c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C7353f4 f4Var = (C7353f4) this.f32502b.poll();
                if (f4Var != null) {
                    Process.setThreadPriority(true != f4Var.f32476b ? 10 : threadPriority);
                    f4Var.run();
                } else {
                    synchronized (this.f32501a) {
                        if (this.f32502b.peek() == null) {
                            boolean unused = this.f32504d.f32540k;
                            try {
                                this.f32501a.wait(30000);
                            } catch (InterruptedException e2) {
                                m41492c(e2);
                            }
                        }
                    }
                    synchronized (this.f32504d.f32538i) {
                        if (this.f32502b.peek() == null) {
                            m41491b();
                            m41491b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m41491b();
            throw th;
        }
    }
}
