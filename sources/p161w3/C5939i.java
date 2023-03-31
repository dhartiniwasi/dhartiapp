package p161w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: w3.i */
/* compiled from: CopyOnWriteMultiset */
public final class C5939i<E> implements Iterable<E> {

    /* renamed from: a */
    private final Object f29086a = new Object();

    /* renamed from: b */
    private final Map<E, Integer> f29087b = new HashMap();

    /* renamed from: c */
    private Set<E> f29088c = Collections.emptySet();

    /* renamed from: d */
    private List<E> f29089d = Collections.emptyList();

    /* renamed from: I */
    public Set<E> mo20616I() {
        Set<E> set;
        synchronized (this.f29086a) {
            set = this.f29088c;
        }
        return set;
    }

    /* renamed from: b */
    public void mo20617b(E e) {
        synchronized (this.f29086a) {
            ArrayList arrayList = new ArrayList(this.f29089d);
            arrayList.add(e);
            this.f29089d = Collections.unmodifiableList(arrayList);
            Integer num = this.f29087b.get(e);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f29088c);
                hashSet.add(e);
                this.f29088c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f29087b;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e, Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public int mo20618c(E e) {
        int intValue;
        synchronized (this.f29086a) {
            intValue = this.f29087b.containsKey(e) ? this.f29087b.get(e).intValue() : 0;
        }
        return intValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20619f(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f29086a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f29087b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f29089d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f29089d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f29087b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f29088c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f29088c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f29087b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5939i.mo20619f(java.lang.Object):void");
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f29086a) {
            it = this.f29089d.iterator();
        }
        return it;
    }
}
