package p302n7;

import p276k8.C11598a;
import p276k8.C11600b;

/* renamed from: n7.d0 */
/* compiled from: OptionalProvider */
class C11939d0<T> implements C11600b<T>, C11598a<T> {

    /* renamed from: c */
    private static final C11598a.C11599a<Object> f44833c = C11933b0.f44817a;

    /* renamed from: d */
    private static final C11600b<Object> f44834d = C11937c0.f44832a;

    /* renamed from: a */
    private C11598a.C11599a<T> f44835a;

    /* renamed from: b */
    private volatile C11600b<T> f44836b;

    private C11939d0(C11598a.C11599a<T> aVar, C11600b<T> bVar) {
        this.f44835a = aVar;
        this.f44836b = bVar;
    }

    /* renamed from: e */
    static <T> C11939d0<T> m57654e() {
        return new C11939d0<>(f44833c, f44834d);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m57655f(C11600b bVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m57656g() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m57657h(C11598a.C11599a aVar, C11598a.C11599a aVar2, C11600b bVar) {
        aVar.mo35753a(bVar);
        aVar2.mo35753a(bVar);
    }

    /* renamed from: i */
    static <T> C11939d0<T> m57658i(C11600b<T> bVar) {
        return new C11939d0<>((C11598a.C11599a) null, bVar);
    }

    /* renamed from: a */
    public void mo35752a(C11598a.C11599a<T> aVar) {
        C11600b<T> bVar;
        C11600b<T> bVar2 = this.f44836b;
        C11600b<Object> bVar3 = f44834d;
        if (bVar2 != bVar3) {
            aVar.mo35753a(bVar2);
            return;
        }
        C11600b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f44836b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f44835a = new C11931a0(this.f44835a, aVar);
            }
        }
        if (bVar4 != null) {
            aVar.mo35753a(bVar);
        }
    }

    public T get() {
        return this.f44836b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo36262j(C11600b<T> bVar) {
        C11598a.C11599a<T> aVar;
        if (this.f44836b == f44834d) {
            synchronized (this) {
                aVar = this.f44835a;
                this.f44835a = null;
                this.f44836b = bVar;
            }
            aVar.mo35753a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
