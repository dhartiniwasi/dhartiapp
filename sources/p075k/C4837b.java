package p075k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: k.b */
/* compiled from: DefaultTaskExecutor */
public class C4837b extends C4839c {

    /* renamed from: a */
    private final Object f25579a = new Object();

    /* renamed from: b */
    private final ExecutorService f25580b = Executors.newFixedThreadPool(4, new C4838a());

    /* renamed from: c */
    private volatile Handler f25581c;

    /* renamed from: k.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C4838a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f25582a = new AtomicInteger(0);

        C4838a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f25582a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m30864d(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo18576a(Runnable runnable) {
        this.f25580b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo18577b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo18578c(Runnable runnable) {
        if (this.f25581c == null) {
            synchronized (this.f25579a) {
                if (this.f25581c == null) {
                    this.f25581c = m30864d(Looper.getMainLooper());
                }
            }
        }
        this.f25581c.post(runnable);
    }
}
