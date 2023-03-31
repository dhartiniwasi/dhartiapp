package com.startapp;

/* renamed from: com.startapp.x2 */
/* compiled from: Sta */
public class C9632x2 {

    /* renamed from: a */
    private static C9633a f39367a;

    /* renamed from: com.startapp.x2$a */
    /* compiled from: Sta */
    public interface C9633a {
        /* renamed from: a */
        void mo29700a(Throwable th);
    }

    /* renamed from: com.startapp.x2$b */
    /* compiled from: Sta */
    public static class C9634b {
        /* renamed from: a */
        public static StackTraceElement[] m50515a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    /* renamed from: a */
    public static void m50509a(C9633a aVar) {
        f39367a = aVar;
    }

    /* renamed from: a */
    private static void m50511a(Throwable th, boolean z, boolean z2) {
    }

    /* renamed from: b */
    public static void m50512b(Throwable th) {
        m50511a(th, true, true);
    }

    /* renamed from: c */
    public static void m50513c(Throwable th) {
        C9633a aVar = f39367a;
        if (aVar != null) {
            try {
                aVar.mo29700a(th);
            } catch (Throwable unused) {
            }
        } else {
            m50511a(th, false, false);
        }
    }

    /* renamed from: a */
    public static void m50510a(Throwable th) {
        m50511a(th, true, false);
    }

    /* renamed from: a */
    private static StackTraceElement m50508a(int i) {
        if (i < 0) {
            i = 0;
        }
        StackTraceElement[] a = C9634b.m50515a();
        if (a == null) {
            return null;
        }
        String name = C9634b.class.getName();
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = a[i2];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i3 = i2 + 3 + i;
                if (i3 < length) {
                    return a[i3];
                }
                return null;
            }
        }
        return null;
    }
}
