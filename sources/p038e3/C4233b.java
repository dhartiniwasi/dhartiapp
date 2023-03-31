package p038e3;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p045f3.C4256b;
import p161w3.C5953m0;
import p190b7.C6696t;

/* renamed from: e3.b */
/* compiled from: BaseUrlExclusionList */
public final class C4233b {

    /* renamed from: a */
    private final Map<String, Long> f23592a;

    /* renamed from: b */
    private final Map<Integer, Long> f23593b;

    /* renamed from: c */
    private final Map<List<Pair<String, Integer>>, C4256b> f23594c;

    /* renamed from: d */
    private final Random f23595d;

    public C4233b() {
        this(new Random());
    }

    /* renamed from: b */
    private static <T> void m28545b(T t, long j, Map<T, Long> map) {
        if (map.containsKey(t)) {
            j = Math.max(j, ((Long) C5953m0.m35138j(map.get(t))).longValue());
        }
        map.put(t, Long.valueOf(j));
    }

    /* renamed from: c */
    private List<C4256b> m28546c(List<C4256b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m28549h(elapsedRealtime, this.f23592a);
        m28549h(elapsedRealtime, this.f23593b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4256b bVar = list.get(i);
            if (!this.f23592a.containsKey(bVar.f23644b) && !this.f23593b.containsKey(Integer.valueOf(bVar.f23645c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m28547d(C4256b bVar, C4256b bVar2) {
        int compare = Integer.compare(bVar.f23645c, bVar2.f23645c);
        return compare != 0 ? compare : bVar.f23644b.compareTo(bVar2.f23644b);
    }

    /* renamed from: f */
    public static int m28548f(List<C4256b> list) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(Integer.valueOf(list.get(i).f23645c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    private static <T> void m28549h(long j, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            if (((Long) next.getValue()).longValue() <= j) {
                arrayList.add(next.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* renamed from: k */
    private C4256b m28550k(List<C4256b> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).f23646d;
        }
        int nextInt = this.f23595d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            C4256b bVar = list.get(i4);
            i3 += bVar.f23646d;
            if (nextInt < i3) {
                return bVar;
            }
        }
        return (C4256b) C6696t.m38506c(list);
    }

    /* renamed from: e */
    public void mo17596e(C4256b bVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        m28545b(bVar.f23644b, elapsedRealtime, this.f23592a);
        int i = bVar.f23645c;
        if (i != Integer.MIN_VALUE) {
            m28545b(Integer.valueOf(i), elapsedRealtime, this.f23593b);
        }
    }

    /* renamed from: g */
    public int mo17597g(List<C4256b> list) {
        HashSet hashSet = new HashSet();
        List<C4256b> c = m28546c(list);
        for (int i = 0; i < c.size(); i++) {
            hashSet.add(Integer.valueOf(c.get(i).f23645c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void mo17598i() {
        this.f23592a.clear();
        this.f23593b.clear();
        this.f23594c.clear();
    }

    /* renamed from: j */
    public C4256b mo17599j(List<C4256b> list) {
        List<C4256b> c = m28546c(list);
        if (c.size() < 2) {
            return (C4256b) C6696t.m38505b(c, null);
        }
        Collections.sort(c, C9956a.f39891a);
        ArrayList arrayList = new ArrayList();
        int i = c.get(0).f23645c;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C4256b bVar = c.get(i2);
            if (i == bVar.f23645c) {
                arrayList.add(new Pair(bVar.f23644b, Integer.valueOf(bVar.f23646d)));
                i2++;
            } else if (arrayList.size() == 1) {
                return c.get(0);
            }
        }
        C4256b bVar2 = this.f23594c.get(arrayList);
        if (bVar2 != null) {
            return bVar2;
        }
        C4256b k = m28550k(c.subList(0, arrayList.size()));
        this.f23594c.put(arrayList, k);
        return k;
    }

    C4233b(Random random) {
        this.f23594c = new HashMap();
        this.f23595d = random;
        this.f23592a = new HashMap();
        this.f23593b = new HashMap();
    }
}
