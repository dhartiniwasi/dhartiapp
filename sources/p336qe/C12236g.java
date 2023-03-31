package p336qe;

import java.io.IOException;

/* renamed from: qe.g */
/* compiled from: ForwardingSink */
public abstract class C12236g implements C12251s {

    /* renamed from: a */
    private final C12251s f45385a;

    public C12236g(C12251s sVar) {
        if (sVar != null) {
            this.f45385a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f45385a.close();
    }

    public void flush() throws IOException {
        this.f45385a.flush();
    }

    /* renamed from: k1 */
    public void mo35694k1(C12231c cVar, long j) throws IOException {
        this.f45385a.mo35694k1(cVar, j);
    }

    /* renamed from: o */
    public C12253u mo36029o() {
        return this.f45385a.mo36029o();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f45385a.toString() + ")";
    }
}
