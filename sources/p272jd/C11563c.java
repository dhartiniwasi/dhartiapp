package p272jd;

import java.io.Serializable;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p272jd.C11570g;
import p344rd.C12443p;

/* renamed from: jd.c */
/* compiled from: CoroutineContextImpl.kt */
public final class C11563c implements C11570g, Serializable {

    /* renamed from: a */
    private final C11570g f44043a;

    /* renamed from: b */
    private final C11570g.C11573b f44044b;

    /* renamed from: jd.c$a */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C11564a extends C11670l implements C12443p<String, C11570g.C11573b, String> {

        /* renamed from: a */
        public static final C11564a f44045a = new C11564a();

        C11564a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, C11570g.C11573b bVar) {
            C11669k.m56787e(str, "acc");
            C11669k.m56787e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C11563c(C11570g gVar, C11570g.C11573b bVar) {
        C11669k.m56787e(gVar, "left");
        C11669k.m56787e(bVar, "element");
        this.f44043a = gVar;
        this.f44044b = bVar;
    }

    /* renamed from: a */
    private final boolean m56497a(C11570g.C11573b bVar) {
        return C11669k.m56783a(get(bVar.getKey()), bVar);
    }

    /* renamed from: c */
    private final boolean m56498c(C11563c cVar) {
        while (m56497a(cVar.f44044b)) {
            C11570g gVar = cVar.f44043a;
            if (gVar instanceof C11563c) {
                cVar = (C11563c) gVar;
            } else {
                C11669k.m56785c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m56497a((C11570g.C11573b) gVar);
            }
        }
        return false;
    }

    /* renamed from: d */
    private final int m56499d() {
        int i = 2;
        C11563c cVar = this;
        while (true) {
            C11570g gVar = cVar.f44043a;
            cVar = gVar instanceof C11563c ? (C11563c) gVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11563c) {
                C11563c cVar = (C11563c) obj;
                if (cVar.m56499d() != m56499d() || !cVar.m56498c(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
        C11669k.m56787e(pVar, "operation");
        return pVar.invoke(this.f44043a.fold(r, pVar), this.f44044b);
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        C11669k.m56787e(cVar, "key");
        C11563c cVar2 = this;
        while (true) {
            E e = cVar2.f44044b.get(cVar);
            if (e != null) {
                return e;
            }
            C11570g gVar = cVar2.f44043a;
            if (!(gVar instanceof C11563c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C11563c) gVar;
        }
    }

    public int hashCode() {
        return this.f44043a.hashCode() + this.f44044b.hashCode();
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        C11669k.m56787e(cVar, "key");
        if (this.f44044b.get(cVar) != null) {
            return this.f44043a;
        }
        C11570g minusKey = this.f44043a.minusKey(cVar);
        if (minusKey == this.f44043a) {
            return this;
        }
        if (minusKey == C11576h.f44049a) {
            return this.f44044b;
        }
        return new C11563c(minusKey, this.f44044b);
    }

    public C11570g plus(C11570g gVar) {
        return C11570g.C11571a.m56506a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", C11564a.f44045a)) + ']';
    }
}
