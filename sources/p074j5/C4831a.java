package p074j5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p033d5.C4141r;

/* renamed from: j5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4831a implements ThreadFactory {

    /* renamed from: a */
    private final String f25568a;

    /* renamed from: b */
    private final ThreadFactory f25569b = Executors.defaultThreadFactory();

    public C4831a(String str) {
        C4141r.m28222l(str, "Name must not be null");
        this.f25568a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f25569b.newThread(new C4833c(runnable, 0));
        newThread.setName(this.f25568a);
        return newThread;
    }
}
