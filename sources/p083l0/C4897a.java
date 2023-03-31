package p083l0;

import androidx.room.C1450h;
import p111p0.C5257f;

/* renamed from: l0.a */
/* compiled from: EntityInsertionAdapter */
public abstract class C4897a<T> extends C4900d {
    public C4897a(C1450h hVar) {
        super(hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo17722g(C5257f fVar, T t);

    /* renamed from: h */
    public final void mo18707h(T t) {
        C5257f a = mo18718a();
        try {
            mo17722g(a, t);
            a.mo19247C1();
        } finally {
            mo18720f(a);
        }
    }
}
