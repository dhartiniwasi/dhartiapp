package p336qe;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: qe.k */
/* compiled from: InflaterSource */
public final class C12240k implements C12252t {

    /* renamed from: a */
    private final C12234e f45393a;

    /* renamed from: b */
    private final Inflater f45394b;

    /* renamed from: c */
    private int f45395c;

    /* renamed from: d */
    private boolean f45396d;

    C12240k(C12234e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f45393a = eVar;
            this.f45394b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: b */
    private void m58802b() throws IOException {
        int i = this.f45395c;
        if (i != 0) {
            int remaining = i - this.f45394b.getRemaining();
            this.f45395c -= remaining;
            this.f45393a.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final boolean mo36862a() throws IOException {
        if (!this.f45394b.needsInput()) {
            return false;
        }
        m58802b();
        if (this.f45394b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f45393a.mo36784Z()) {
            return true;
        } else {
            C12248p pVar = this.f45393a.mo36802j().f45377a;
            int i = pVar.f45413c;
            int i2 = pVar.f45412b;
            int i3 = i - i2;
            this.f45395c = i3;
            this.f45394b.setInput(pVar.f45411a, i2, i3);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f45396d) {
            this.f45394b.end();
            this.f45396d = true;
            this.f45393a.close();
        }
    }

    /* renamed from: o */
    public C12253u mo33809o() {
        return this.f45393a.mo33809o();
    }

    /* renamed from: z */
    public long mo33810z(C12231c cVar, long j) throws IOException {
        C12248p Q;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f45396d) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo36862a();
                try {
                    Q = cVar.mo36776Q(1);
                    int inflate = this.f45394b.inflate(Q.f45411a, Q.f45413c, (int) Math.min(j, (long) (8192 - Q.f45413c)));
                    if (inflate > 0) {
                        Q.f45413c += inflate;
                        long j2 = (long) inflate;
                        cVar.f45378b += j2;
                        return j2;
                    } else if (this.f45394b.finished()) {
                        break;
                    } else if (this.f45394b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m58802b();
            if (Q.f45412b != Q.f45413c) {
                return -1;
            }
            cVar.f45377a = Q.mo36877b();
            C12249q.m58859a(Q);
            return -1;
        }
    }
}
