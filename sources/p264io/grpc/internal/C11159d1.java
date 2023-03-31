package p264io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p182a7.C6445u;

/* renamed from: io.grpc.internal.d1 */
/* compiled from: LogExceptionRunnable */
public final class C11159d1 implements Runnable {

    /* renamed from: b */
    private static final Logger f43043b = Logger.getLogger(C11159d1.class.getName());

    /* renamed from: a */
    private final Runnable f43044a;

    public C11159d1(Runnable runnable) {
        this.f43044a = (Runnable) C6431n.m37562o(runnable, "task");
    }

    public void run() {
        try {
            this.f43044a.run();
        } catch (Throwable th) {
            Logger logger = f43043b;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f43044a, th);
            C6445u.m37608f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f43044a + ")";
    }
}
