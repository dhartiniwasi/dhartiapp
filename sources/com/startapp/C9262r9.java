package com.startapp;

import android.os.Build;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.r9 */
/* compiled from: Sta */
public class C9262r9 implements Executor {

    /* renamed from: a */
    public final Queue<Runnable> f38154a;

    /* renamed from: b */
    public final Executor f38155b;

    /* renamed from: c */
    public Runnable f38156c;

    /* renamed from: com.startapp.r9$a */
    /* compiled from: Sta */
    public class C9263a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f38157a;

        public C9263a(Runnable runnable) {
            this.f38157a = runnable;
        }

        public void run() {
            try {
                this.f38157a.run();
            } finally {
                C9262r9.this.mo29876a();
            }
        }
    }

    public C9262r9(Executor executor) {
        if (Build.VERSION.SDK_INT >= 9) {
            this.f38154a = new ArrayDeque();
        } else {
            this.f38154a = new LinkedList();
        }
        this.f38155b = executor;
    }

    /* renamed from: a */
    public synchronized void mo29876a() {
        Runnable poll = this.f38154a.poll();
        this.f38156c = poll;
        if (poll != null) {
            this.f38155b.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f38154a.offer(new C9263a(runnable));
        if (this.f38156c == null) {
            mo29876a();
        }
    }
}
