package kotlinx.coroutines.scheduling;

import p410yd.C13333o0;

/* renamed from: kotlinx.coroutines.scheduling.k */
/* compiled from: Tasks.kt */
public final class C11750k extends C11747h {

    /* renamed from: c */
    public final Runnable f44361c;

    public C11750k(Runnable runnable, long j, C11748i iVar) {
        super(j, iVar);
        this.f44361c = runnable;
    }

    public void run() {
        try {
            this.f44361c.run();
        } finally {
            this.f44359b.mo35985a();
        }
    }

    public String toString() {
        return "Task[" + C13333o0.m62287a(this.f44361c) + '@' + C13333o0.m62288b(this.f44361c) + ", " + this.f44358a + ", " + this.f44359b + ']';
    }
}
