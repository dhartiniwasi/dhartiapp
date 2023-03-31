package p074j5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p033d5.C4141r;

/* renamed from: j5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4832b implements ThreadFactory {

    /* renamed from: a */
    private final String f25570a;

    /* renamed from: b */
    private final AtomicInteger f25571b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f25572c = Executors.defaultThreadFactory();

    public C4832b(String str) {
        C4141r.m28222l(str, "Name must not be null");
        this.f25570a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25572c.newThread(new C4833c(runnable, 0));
        String str = this.f25570a;
        int andIncrement = this.f25571b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
