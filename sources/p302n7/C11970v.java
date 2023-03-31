package p302n7;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p395x7.C12977a;
import p395x7.C12978b;
import p395x7.C12979c;
import p395x7.C12980d;

/* renamed from: n7.v */
/* compiled from: EventBus */
class C11970v implements C12980d, C12979c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C12978b<Object>, Executor>> f44885a = new HashMap();

    /* renamed from: b */
    private Queue<C12977a<?>> f44886b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f44887c;

    C11970v(Executor executor) {
        this.f44887c = executor;
    }

    /* renamed from: g */
    private synchronized Set<Map.Entry<C12978b<Object>, Executor>> m57754g(C12977a<?> aVar) {
        Map map;
        map = this.f44885a.get(aVar.mo38039b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> void mo36306a(java.lang.Class<T> r2, p395x7.C12978b<? super T> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            p302n7.C11941e0.m57671b(r2)     // Catch:{ all -> 0x0029 }
            p302n7.C11941e0.m57671b(r3)     // Catch:{ all -> 0x0029 }
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<x7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f44885a     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0011
            monitor-exit(r1)
            return
        L_0x0011:
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<x7.b<java.lang.Object>, java.util.concurrent.Executor>> r0 = r1.f44885a     // Catch:{ all -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0029 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0029 }
            r0.remove(r3)     // Catch:{ all -> 0x0029 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0027
            java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<x7.b<java.lang.Object>, java.util.concurrent.Executor>> r3 = r1.f44885a     // Catch:{ all -> 0x0029 }
            r3.remove(r2)     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p302n7.C11970v.mo36306a(java.lang.Class, x7.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new p302n7.C11969u(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m57754g(r5).iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36278b(p395x7.C12977a<?> r5) {
        /*
            r4 = this;
            p302n7.C11941e0.m57671b(r5)
            monitor-enter(r4)
            java.util.Queue<x7.a<?>> r0 = r4.f44886b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m57754g(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            n7.u r3 = new n7.u
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p302n7.C11970v.mo36278b(x7.a):void");
    }

    /* renamed from: c */
    public <T> void mo36307c(Class<T> cls, C12978b<? super T> bVar) {
        mo36308d(cls, this.f44887c, bVar);
    }

    /* renamed from: d */
    public synchronized <T> void mo36308d(Class<T> cls, Executor executor, C12978b<? super T> bVar) {
        C11941e0.m57671b(cls);
        C11941e0.m57671b(bVar);
        C11941e0.m57671b(executor);
        if (!this.f44885a.containsKey(cls)) {
            this.f44885a.put(cls, new ConcurrentHashMap());
        }
        this.f44885a.get(cls).put(bVar, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36309f() {
        Queue<C12977a<?>> queue;
        synchronized (this) {
            queue = this.f44886b;
            if (queue != null) {
                this.f44886b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C12977a b : queue) {
                mo36278b(b);
            }
        }
    }
}
