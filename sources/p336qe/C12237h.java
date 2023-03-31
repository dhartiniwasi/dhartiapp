package p336qe;

import java.io.IOException;

/* renamed from: qe.h */
/* compiled from: ForwardingSource */
public abstract class C12237h implements C12252t {

    /* renamed from: a */
    private final C12252t f45386a;

    public C12237h(C12252t tVar) {
        if (tVar != null) {
            this.f45386a = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C12252t mo36851a() {
        return this.f45386a;
    }

    public void close() throws IOException {
        this.f45386a.close();
    }

    /* renamed from: o */
    public C12253u mo33809o() {
        return this.f45386a.mo33809o();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f45386a.toString() + ")";
    }
}
