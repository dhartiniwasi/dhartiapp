package p228f7;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: f7.f */
/* compiled from: ThreadFactoryBuilder */
public final class C10142f {

    /* renamed from: a */
    private String f40519a = null;

    /* renamed from: b */
    private Boolean f40520b = null;

    /* renamed from: c */
    private Integer f40521c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f40522d = null;

    /* renamed from: e */
    private ThreadFactory f40523e = null;

    /* renamed from: f7.f$a */
    /* compiled from: ThreadFactoryBuilder */
    class C10143a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ ThreadFactory f40524a;

        /* renamed from: b */
        final /* synthetic */ String f40525b;

        /* renamed from: c */
        final /* synthetic */ AtomicLong f40526c;

        /* renamed from: d */
        final /* synthetic */ Boolean f40527d;

        /* renamed from: e */
        final /* synthetic */ Integer f40528e;

        /* renamed from: f */
        final /* synthetic */ Thread.UncaughtExceptionHandler f40529f;

        C10143a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f40524a = threadFactory;
            this.f40525b = str;
            this.f40526c = atomicLong;
            this.f40527d = bool;
            this.f40528e = num;
            this.f40529f = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f40524a.newThread(runnable);
            String str = this.f40525b;
            if (str != null) {
                AtomicLong atomicLong = this.f40526c;
                Objects.requireNonNull(atomicLong);
                AtomicLong atomicLong2 = atomicLong;
                newThread.setName(C10142f.m51470d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f40527d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f40528e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f40529f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    private static ThreadFactory m51469c(C10142f fVar) {
        String str = fVar.f40519a;
        Boolean bool = fVar.f40520b;
        Integer num = fVar.f40521c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = fVar.f40522d;
        ThreadFactory threadFactory = fVar.f40523e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new C10143a(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m51470d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory mo32790b() {
        return m51469c(this);
    }

    /* renamed from: e */
    public C10142f mo32791e(boolean z) {
        this.f40520b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public C10142f mo32792f(String str) {
        m51470d(str, 0);
        this.f40519a = str;
        return this;
    }
}
