package com.unity3d.scar.adapter.common;

/* renamed from: com.unity3d.scar.adapter.common.a */
/* compiled from: DispatchGroup */
public class C9694a {

    /* renamed from: a */
    private int f39573a;

    /* renamed from: b */
    private Runnable f39574b;

    public C9694a() {
        this.f39573a = 0;
        this.f39573a = 0;
    }

    /* renamed from: d */
    private void m50608d() {
        Runnable runnable;
        if (this.f39573a <= 0 && (runnable = this.f39574b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public synchronized void mo31563a() {
        this.f39573a++;
    }

    /* renamed from: b */
    public synchronized void mo31564b() {
        this.f39573a--;
        m50608d();
    }

    /* renamed from: c */
    public void mo31565c(Runnable runnable) {
        this.f39574b = runnable;
        m50608d();
    }
}
