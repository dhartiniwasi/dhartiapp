package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: Sta */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a */
    public final transient String f38847a;

    /* renamed from: b */
    public final transient boolean f38848b;

    /* renamed from: c */
    public final transient boolean f38849c;

    /* renamed from: d */
    public final transient Set<String> f38850d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    /* compiled from: Sta */
    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a */
        public final transient String f38851a;

        private MainThreadComparator() {
            this.f38851a = Looper.getMainLooper().getThread().getName();
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str.startsWith(this.f38851a)) {
                return -1;
            }
            if (str2.startsWith(this.f38851a)) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    /* compiled from: Sta */
    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j, StackTraceElement stackTraceElement2) {
            this.skipBeforeAmount = j;
            this.stackTraceElement = stackTraceElement2;
        }

        /* renamed from: a */
        public long mo30779a() {
            return this.skipBeforeAmount;
        }

        /* renamed from: b */
        public StackTraceElement mo30780b() {
            return this.stackTraceElement;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.ThreadsState$b */
    /* compiled from: Sta */
    public static class C9430b {

        /* renamed from: a */
        public String f38852a;

        /* renamed from: b */
        public String f38853b;

        /* renamed from: c */
        public Set<String> f38854c;

        /* renamed from: d */
        public long f38855d;

        /* renamed from: e */
        public boolean f38856e;

        /* renamed from: f */
        public boolean f38857f;
    }

    public ThreadsState(C9430b bVar) {
        this.f38847a = bVar.f38852a;
        this.f38848b = bVar.f38856e;
        this.f38849c = bVar.f38857f;
        this.delay = bVar.f38855d;
        this.handlerDescription = bVar.f38853b;
        this.f38850d = bVar.f38854c;
        mo30772a();
    }

    /* renamed from: a */
    public final void mo30772a() {
        Thread thread = Looper.getMainLooper().getThread();
        String a = m49958a(thread);
        TreeMap treeMap = new TreeMap(new MainThreadComparator());
        boolean z = false;
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            Thread thread2 = (Thread) next.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
            if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
                ShrunkStackTraceElement[] b = mo30775b(stackTraceElementArr);
                if (b != null && b.length > 0) {
                    Thread.State state = thread2.getState();
                    if (thread2 == thread) {
                        if (!mo30773a(stackTraceElementArr)) {
                            z = true;
                            treeMap.put(a, b);
                        } else {
                            return;
                        }
                    } else if (!this.f38849c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(m49958a(thread2), b);
                    }
                } else if (thread2 == thread) {
                    return;
                }
            } else if (thread2 == thread) {
                return;
            }
        }
        if (!z) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b2 = mo30775b(stackTrace);
            if (b2 != null && b2.length > 0 && !mo30773a(stackTrace)) {
                treeMap.put(a, b2);
            } else {
                return;
            }
        }
        this.threadsStackTraces = treeMap;
    }

    /* renamed from: b */
    public long mo30774b() {
        return this.delay;
    }

    /* renamed from: c */
    public String mo30776c() {
        return this.handlerDescription;
    }

    /* renamed from: d */
    public Map<String, ShrunkStackTraceElement[]> mo30777d() {
        return this.threadsStackTraces;
    }

    /* renamed from: b */
    public final ShrunkStackTraceElement[] mo30775b(StackTraceElement[] stackTraceElementArr) {
        ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        String className;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        StackTraceElement stackTraceElement = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < stackTraceElementArr2.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr2[i];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z3 = i < 3;
                String str = this.f38847a;
                boolean z4 = str == null || className.startsWith(str);
                if (z4) {
                    z = true;
                }
                if (!this.f38848b || z4 || z3 || z2) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j, stackTraceElement));
                        stackTraceElement = null;
                        j = 0;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z2 = z4;
            }
            i++;
        }
        if (stackTraceElement != null) {
            shrunkStackTraceElementArr = null;
            arrayList.add(new ShrunkStackTraceElement(j + 1, (StackTraceElement) null));
        } else {
            shrunkStackTraceElementArr = null;
        }
        return z ? (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]) : shrunkStackTraceElementArr;
    }

    /* renamed from: a */
    public final boolean mo30773a(StackTraceElement[] stackTraceElementArr) {
        if (this.f38850d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (!(className == null || methodName == null)) {
                if (this.f38850d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m49958a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
