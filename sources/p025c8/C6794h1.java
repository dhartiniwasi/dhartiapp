package p025c8;

import java.util.Collections;
import java.util.Iterator;
import p211d8.C9888l;
import p320p7.C12130e;

/* renamed from: c8.h1 */
/* compiled from: ReferenceSet */
public class C6794h1 {

    /* renamed from: a */
    private C12130e<C6786e> f31347a = new C12130e<>(Collections.emptyList(), C6786e.f31325c);

    /* renamed from: b */
    private C12130e<C6786e> f31348b = new C12130e<>(Collections.emptyList(), C6786e.f31326d);

    /* renamed from: e */
    private void m38914e(C6786e eVar) {
        this.f31347a = this.f31347a.mo36644j(eVar);
        this.f31348b = this.f31348b.mo36644j(eVar);
    }

    /* renamed from: a */
    public void mo22813a(C9888l lVar, int i) {
        C6786e eVar = new C6786e(lVar, i);
        this.f31347a = this.f31347a.mo36638f(eVar);
        this.f31348b = this.f31348b.mo36638f(eVar);
    }

    /* renamed from: b */
    public void mo22814b(C12130e<C9888l> eVar, int i) {
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            mo22813a(it.next(), i);
        }
    }

    /* renamed from: c */
    public boolean mo22815c(C9888l lVar) {
        Iterator<C6786e> i = this.f31347a.mo36640i(new C6786e(lVar, 0));
        if (!i.hasNext()) {
            return false;
        }
        return i.next().mo22780d().equals(lVar);
    }

    /* renamed from: d */
    public C12130e<C9888l> mo22816d(int i) {
        Iterator<C6786e> i2 = this.f31348b.mo36640i(new C6786e(C9888l.m50694c(), i));
        C12130e<C9888l> j = C9888l.m50695j();
        while (i2.hasNext()) {
            C6786e next = i2.next();
            if (next.mo22779c() != i) {
                break;
            }
            j = j.mo36638f(next.mo22780d());
        }
        return j;
    }

    /* renamed from: f */
    public void mo22817f(C9888l lVar, int i) {
        m38914e(new C6786e(lVar, i));
    }

    /* renamed from: g */
    public void mo22818g(C12130e<C9888l> eVar, int i) {
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            mo22817f(it.next(), i);
        }
    }

    /* renamed from: h */
    public C12130e<C9888l> mo22819h(int i) {
        Iterator<C6786e> i2 = this.f31348b.mo36640i(new C6786e(C9888l.m50694c(), i));
        C12130e<C9888l> j = C9888l.m50695j();
        while (i2.hasNext()) {
            C6786e next = i2.next();
            if (next.mo22779c() != i) {
                break;
            }
            j = j.mo36638f(next.mo22780d());
            m38914e(next);
        }
        return j;
    }
}
