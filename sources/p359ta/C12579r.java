package p359ta;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: ta.r */
/* compiled from: DatabaseWorkerPool */
class C12579r implements C12575n {

    /* renamed from: a */
    final String f46131a;

    /* renamed from: b */
    final int f46132b;

    /* renamed from: c */
    private HandlerThread f46133c;

    /* renamed from: d */
    private Handler f46134d;

    C12579r(String str, int i) {
        this.f46131a = str;
        this.f46132b = i;
    }

    /* renamed from: a */
    public void mo37422a(C12569i iVar, Runnable runnable) {
        this.f46134d.post(runnable);
    }

    /* renamed from: b */
    public void mo37423b() {
        HandlerThread handlerThread = this.f46133c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f46133c = null;
            this.f46134d = null;
        }
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f46131a, this.f46132b);
        this.f46133c = handlerThread;
        handlerThread.start();
        this.f46134d = new Handler(this.f46133c.getLooper());
    }
}
