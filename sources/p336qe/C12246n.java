package p336qe;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: qe.n */
/* compiled from: RealBufferedSink */
final class C12246n implements C12233d {

    /* renamed from: a */
    public final C12231c f45405a = new C12231c();

    /* renamed from: b */
    public final C12251s f45406b;

    /* renamed from: c */
    boolean f45407c;

    C12246n(C12251s sVar) {
        Objects.requireNonNull(sVar, "sink == null");
        this.f45406b = sVar;
    }

    /* renamed from: G0 */
    public C12233d mo36768G0(long j) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36768G0(j);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: J */
    public C12233d mo36772J(int i) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36772J(i);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: O */
    public C12233d mo36775O(int i) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36775O(i);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a0 */
    public C12233d mo36787a0(int i) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36787a0(i);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    public void close() throws IOException {
        if (!this.f45407c) {
            Throwable th = null;
            try {
                C12231c cVar = this.f45405a;
                long j = cVar.f45378b;
                if (j > 0) {
                    this.f45406b.mo35694k1(cVar, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f45406b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f45407c = true;
            if (th != null) {
                C12255v.m58895e(th);
            }
        }
    }

    /* renamed from: e1 */
    public C12233d mo36792e1(byte[] bArr) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36792e1(bArr);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f45407c) {
            C12231c cVar = this.f45405a;
            long j = cVar.f45378b;
            if (j > 0) {
                this.f45406b.mo35694k1(cVar, j);
            }
            this.f45406b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f45407c;
    }

    /* renamed from: j */
    public C12231c mo36802j() {
        return this.f45405a;
    }

    /* renamed from: j0 */
    public C12233d mo36803j0() throws IOException {
        if (!this.f45407c) {
            long f = this.f45405a.mo36794f();
            if (f > 0) {
                this.f45406b.mo35694k1(this.f45405a, f);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: k1 */
    public void mo35694k1(C12231c cVar, long j) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo35694k1(cVar, j);
            mo36803j0();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: o */
    public C12253u mo36029o() {
        return this.f45406b.mo36029o();
    }

    /* renamed from: s */
    public C12233d mo36816s(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36816s(bArr, i, i2);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f45406b + ")";
    }

    /* renamed from: w0 */
    public C12233d mo36821w0(String str) throws IOException {
        if (!this.f45407c) {
            this.f45405a.mo36821w0(str);
            return mo36803j0();
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f45407c) {
            int write = this.f45405a.write(byteBuffer);
            mo36803j0();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
