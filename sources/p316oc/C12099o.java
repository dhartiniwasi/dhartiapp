package p316oc;

import java.util.ArrayList;
import java.util.Iterator;
import p186ac.C6544d;

/* renamed from: oc.o */
/* compiled from: QueuingEventSink */
final class C12099o implements C6544d.C6546b {

    /* renamed from: a */
    private C6544d.C6546b f45132a;

    /* renamed from: b */
    private ArrayList<Object> f45133b = new ArrayList<>();

    /* renamed from: c */
    private boolean f45134c = false;

    /* renamed from: oc.o$b */
    /* compiled from: QueuingEventSink */
    private static class C12101b {
        private C12101b() {
        }
    }

    /* renamed from: oc.o$c */
    /* compiled from: QueuingEventSink */
    private static class C12102c {

        /* renamed from: a */
        String f45135a;

        /* renamed from: b */
        String f45136b;

        /* renamed from: c */
        Object f45137c;

        C12102c(String str, String str2, Object obj) {
            this.f45135a = str;
            this.f45136b = str2;
            this.f45137c = obj;
        }
    }

    C12099o() {
    }

    /* renamed from: b */
    private void m58158b(Object obj) {
        if (!this.f45134c) {
            this.f45133b.add(obj);
        }
    }

    /* renamed from: c */
    private void m58159c() {
        if (this.f45132a != null) {
            Iterator<Object> it = this.f45133b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C12101b) {
                    this.f45132a.mo22142a();
                } else if (next instanceof C12102c) {
                    C12102c cVar = (C12102c) next;
                    this.f45132a.error(cVar.f45135a, cVar.f45136b, cVar.f45137c);
                } else {
                    this.f45132a.success(next);
                }
            }
            this.f45133b.clear();
        }
    }

    /* renamed from: a */
    public void mo22142a() {
        m58158b(new C12101b());
        m58159c();
        this.f45134c = true;
    }

    /* renamed from: d */
    public void mo36500d(C6544d.C6546b bVar) {
        this.f45132a = bVar;
        m58159c();
    }

    public void error(String str, String str2, Object obj) {
        m58158b(new C12102c(str, str2, obj));
        m58159c();
    }

    public void success(Object obj) {
        m58158b(obj);
        m58159c();
    }
}
