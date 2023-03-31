package p074j5;

import android.os.Process;

/* renamed from: j5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C4833c implements Runnable {

    /* renamed from: a */
    private final Runnable f25573a;

    public C4833c(Runnable runnable, int i) {
        this.f25573a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f25573a.run();
    }
}
