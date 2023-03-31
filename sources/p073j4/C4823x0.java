package p073j4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.b53;
import p033d5.C4141r;

/* renamed from: j4.x0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4823x0 {

    /* renamed from: a */
    private HandlerThread f25560a = null;

    /* renamed from: b */
    private Handler f25561b = null;

    /* renamed from: c */
    private int f25562c = 0;

    /* renamed from: d */
    private final Object f25563d = new Object();

    /* renamed from: a */
    public final Handler mo18568a() {
        return this.f25561b;
    }

    /* renamed from: b */
    public final Looper mo18569b() {
        Looper looper;
        synchronized (this.f25563d) {
            if (this.f25562c != 0) {
                C4141r.m28222l(this.f25560a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f25560a == null) {
                C4794n1.m30693k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f25560a = handlerThread;
                handlerThread.start();
                this.f25561b = new b53(this.f25560a.getLooper());
                C4794n1.m30693k("Looper thread started.");
            } else {
                C4794n1.m30693k("Resuming the looper thread");
                this.f25563d.notifyAll();
            }
            this.f25562c++;
            looper = this.f25560a.getLooper();
        }
        return looper;
    }
}
