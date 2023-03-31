package p359ta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: ta.p */
/* compiled from: DatabaseWorkerPool */
class C12577p implements C12575n {

    /* renamed from: a */
    final String f46125a;

    /* renamed from: b */
    final int f46126b;

    /* renamed from: c */
    final int f46127c;

    /* renamed from: d */
    private final LinkedList<C12571j> f46128d = new LinkedList<>();

    /* renamed from: e */
    private final LinkedList<C12573l> f46129e = new LinkedList<>();

    /* renamed from: f */
    private final LinkedList<C12573l> f46130f = new LinkedList<>();

    C12577p(String str, int i, int i2) {
        this.f46125a = str;
        this.f46126b = i;
        this.f46127c = i2;
    }

    /* renamed from: d */
    private synchronized void m59862d(C12573l lVar) {
        ListIterator listIterator = this.f46128d.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                if (lVar.mo37417b((C12571j) listIterator.next())) {
                    listIterator.remove();
                    break;
                }
            } else {
                break;
            }
        }
        while (listIterator.hasNext() && lVar.mo37417b((C12571j) listIterator.next())) {
            listIterator.remove();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m59863e(C12573l lVar) {
        m59862d(lVar);
        if (lVar.mo37419d()) {
            this.f46130f.remove(lVar);
            this.f46129e.add(lVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo37422a(C12569i iVar, Runnable runnable) {
        C12571j jVar = new C12571j(iVar, runnable);
        if (this.f46128d.isEmpty()) {
            Iterator it = this.f46130f.iterator();
            while (it.hasNext()) {
                if (((C12573l) it.next()).mo37417b(jVar)) {
                    return;
                }
            }
        }
        this.f46128d.add(jVar);
        Iterator it2 = this.f46129e.iterator();
        while (it2.hasNext()) {
            C12573l lVar = (C12573l) it2.next();
            m59862d(lVar);
            if (lVar.mo37418c()) {
                this.f46130f.add(lVar);
                this.f46129e.remove(lVar);
                return;
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo37423b() {
        Iterator it = this.f46129e.iterator();
        while (it.hasNext()) {
            ((C12573l) it.next()).mo37420g();
        }
        Iterator it2 = this.f46130f.iterator();
        while (it2.hasNext()) {
            ((C12573l) it2.next()).mo37420g();
        }
    }

    public synchronized void start() {
        for (int i = 0; i < this.f46126b; i++) {
            C12573l lVar = new C12573l(this.f46125a + i, this.f46127c);
            lVar.mo37421h(new C12576o(this, lVar));
            this.f46129e.add(lVar);
        }
    }
}
