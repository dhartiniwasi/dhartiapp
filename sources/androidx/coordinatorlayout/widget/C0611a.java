package androidx.coordinatorlayout.widget;

import androidx.core.util.C0828e;
import androidx.core.util.C0829f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p124r.C5426g;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0611a<T> {

    /* renamed from: a */
    private final C0828e<ArrayList<T>> f2005a = new C0829f(10);

    /* renamed from: b */
    private final C5426g<T, ArrayList<T>> f2006b = new C5426g<>();

    /* renamed from: c */
    private final ArrayList<T> f2007c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2008d = new HashSet<>();

    /* renamed from: e */
    private void m2900e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f2006b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m2900e(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: f */
    private ArrayList<T> m2901f() {
        ArrayList<T> b = this.f2005a.mo3226b();
        return b == null ? new ArrayList<>() : b;
    }

    /* renamed from: k */
    private void m2902k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2005a.mo3225a(arrayList);
    }

    /* renamed from: a */
    public void mo2837a(T t, T t2) {
        if (!this.f2006b.containsKey(t) || !this.f2006b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f2006b.get(t);
        if (arrayList == null) {
            arrayList = m2901f();
            this.f2006b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public void mo2838b(T t) {
        if (!this.f2006b.containsKey(t)) {
            this.f2006b.put(t, null);
        }
    }

    /* renamed from: c */
    public void mo2839c() {
        int size = this.f2006b.size();
        for (int i = 0; i < size; i++) {
            ArrayList n = this.f2006b.mo19672n(i);
            if (n != null) {
                m2902k(n);
            }
        }
        this.f2006b.clear();
    }

    /* renamed from: d */
    public boolean mo2840d(T t) {
        return this.f2006b.containsKey(t);
    }

    /* renamed from: g */
    public List mo2841g(T t) {
        return this.f2006b.get(t);
    }

    /* renamed from: h */
    public List<T> mo2842h(T t) {
        int size = this.f2006b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList n = this.f2006b.mo19672n(i);
            if (n != null && n.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2006b.mo19668j(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> mo2843i() {
        this.f2007c.clear();
        this.f2008d.clear();
        int size = this.f2006b.size();
        for (int i = 0; i < size; i++) {
            m2900e(this.f2006b.mo19668j(i), this.f2007c, this.f2008d);
        }
        return this.f2007c;
    }

    /* renamed from: j */
    public boolean mo2844j(T t) {
        int size = this.f2006b.size();
        for (int i = 0; i < size; i++) {
            ArrayList n = this.f2006b.mo19672n(i);
            if (n != null && n.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
