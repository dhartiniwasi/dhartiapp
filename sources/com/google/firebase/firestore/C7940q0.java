package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p008a8.C6514y1;
import p211d8.C9885i;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.q0 */
/* compiled from: QuerySnapshot */
public class C7940q0 implements Iterable<C7933p0> {

    /* renamed from: a */
    private final C7929o0 f34396a;

    /* renamed from: b */
    private final C6514y1 f34397b;

    /* renamed from: c */
    private final FirebaseFirestore f34398c;

    /* renamed from: d */
    private List<C7907g> f34399d;

    /* renamed from: e */
    private C7916i0 f34400e;

    /* renamed from: f */
    private final C7949t0 f34401f;

    /* renamed from: com.google.firebase.firestore.q0$a */
    /* compiled from: QuerySnapshot */
    private class C7941a implements Iterator<C7933p0> {

        /* renamed from: a */
        private final Iterator<C9885i> f34402a;

        C7941a(Iterator<C9885i> it) {
            this.f34402a = it;
        }

        /* renamed from: a */
        public C7933p0 next() {
            return C7940q0.this.m43852c(this.f34402a.next());
        }

        public boolean hasNext() {
            return this.f34402a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    C7940q0(C7929o0 o0Var, C6514y1 y1Var, FirebaseFirestore firebaseFirestore) {
        this.f34396a = (C7929o0) C10472x.m52785b(o0Var);
        this.f34397b = (C6514y1) C10472x.m52785b(y1Var);
        this.f34398c = (FirebaseFirestore) C10472x.m52785b(firebaseFirestore);
        this.f34401f = new C7949t0(y1Var.mo22093j(), y1Var.mo22094k());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C7933p0 m43852c(C9885i iVar) {
        return C7933p0.m43833h(this.f34398c, iVar, this.f34397b.mo22094k(), this.f34397b.mo22088f().contains(iVar.getKey()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7940q0)) {
            return false;
        }
        C7940q0 q0Var = (C7940q0) obj;
        if (!this.f34398c.equals(q0Var.f34398c) || !this.f34396a.equals(q0Var.f34396a) || !this.f34397b.equals(q0Var.f34397b) || !this.f34401f.equals(q0Var.f34401f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public List<C7907g> mo26437f() {
        return mo26439i(C7916i0.EXCLUDE);
    }

    public int hashCode() {
        return (((((this.f34398c.hashCode() * 31) + this.f34396a.hashCode()) * 31) + this.f34397b.hashCode()) * 31) + this.f34401f.hashCode();
    }

    /* renamed from: i */
    public List<C7907g> mo26439i(C7916i0 i0Var) {
        if (!C7916i0.INCLUDE.equals(i0Var) || !this.f34397b.mo22084b()) {
            if (this.f34399d == null || this.f34400e != i0Var) {
                this.f34399d = Collections.unmodifiableList(C7907g.m43705a(this.f34398c, i0Var, this.f34397b));
                this.f34400e = i0Var;
            }
            return this.f34399d;
        }
        throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
    }

    public Iterator<C7933p0> iterator() {
        return new C7941a(this.f34397b.mo22086e().iterator());
    }

    /* renamed from: j */
    public List<C7923m> mo26441j() {
        ArrayList arrayList = new ArrayList(this.f34397b.mo22086e().size());
        Iterator<C9885i> it = this.f34397b.mo22086e().iterator();
        while (it.hasNext()) {
            arrayList.add(m43852c(it.next()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public C7949t0 mo26442k() {
        return this.f34401f;
    }
}
