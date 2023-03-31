package androidx.window.java.layout;

import android.app.Activity;
import androidx.core.util.C0823a;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C11669k;
import p197be.C6746b;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p410yd.C13310i1;
import p410yd.C13318k0;
import p410yd.C13323l0;
import p410yd.C13337p1;

/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
public final class WindowInfoTrackerCallbackAdapter implements WindowInfoTracker {
    private final Map<C0823a<?>, C13337p1> consumerToJobMap = new LinkedHashMap();
    private final ReentrantLock lock = new ReentrantLock();
    private final WindowInfoTracker tracker;

    public WindowInfoTrackerCallbackAdapter(WindowInfoTracker windowInfoTracker) {
        C11669k.m56787e(windowInfoTracker, "tracker");
        this.tracker = windowInfoTracker;
    }

    private final <T> void addListener(Executor executor, C0823a<T> aVar, C6746b<? extends T> bVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(aVar) == null) {
                this.consumerToJobMap.put(aVar, C13302h.m62208b(C13318k0.m62235a(C13310i1.m62220a(executor)), (C11570g) null, (C13323l0) null, new WindowInfoTrackerCallbackAdapter$addListener$1$1(bVar, aVar, (C11565d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1>) null), 3, (Object) null));
            }
            C10349s sVar = C10349s.f40964a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void removeListener(C0823a<?> aVar) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            C13337p1 p1Var = this.consumerToJobMap.get(aVar);
            if (p1Var != null) {
                C13337p1.C13338a.m62306a(p1Var, (CancellationException) null, 1, (Object) null);
            }
            C13337p1 remove = this.consumerToJobMap.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addWindowLayoutInfoListener(Activity activity, Executor executor, C0823a<WindowLayoutInfo> aVar) {
        C11669k.m56787e(activity, "activity");
        C11669k.m56787e(executor, "executor");
        C11669k.m56787e(aVar, "consumer");
        addListener(executor, aVar, this.tracker.windowLayoutInfo(activity));
    }

    public final void removeWindowLayoutInfoListener(C0823a<WindowLayoutInfo> aVar) {
        C11669k.m56787e(aVar, "consumer");
        removeListener(aVar);
    }

    public C6746b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C11669k.m56787e(activity, "activity");
        return this.tracker.windowLayoutInfo(activity);
    }
}
