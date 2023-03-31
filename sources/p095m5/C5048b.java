package p095m5;

import android.os.Looper;
import android.util.Log;

/* renamed from: m5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C5048b {

    /* renamed from: a */
    private static volatile ClassLoader f26439a;

    /* renamed from: b */
    private static volatile Thread f26440b;

    /* renamed from: a */
    public static synchronized ClassLoader m31765a() {
        ClassLoader classLoader;
        synchronized (C5048b.class) {
            if (f26439a == null) {
                f26439a = m31766b();
            }
            classLoader = f26439a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m31766b() {
        synchronized (C5048b.class) {
            ClassLoader classLoader = null;
            if (f26440b == null) {
                f26440b = m31767c();
                if (f26440b == null) {
                    return null;
                }
            }
            synchronized (f26440b) {
                try {
                    classLoader = f26440b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m31767c() {
        C5047a aVar;
        C5047a aVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (C5048b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (aVar == null) {
                        try {
                            aVar2 = new C5047a(threadGroup, "GmsDynamite");
                            try {
                                aVar2.setContextClassLoader((ClassLoader) null);
                                aVar2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            aVar2 = aVar;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            aVar = aVar2;
                            return aVar;
                        }
                        aVar = aVar2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    aVar2 = null;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                    aVar = aVar2;
                    return aVar;
                }
            }
            return aVar;
        }
    }
}
