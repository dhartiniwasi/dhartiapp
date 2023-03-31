package p244ge;

import java.io.Closeable;
import java.util.Objects;
import p253he.C10543e;
import p336qe.C12231c;
import p336qe.C12234e;

/* renamed from: ge.g0 */
/* compiled from: ResponseBody */
public abstract class C10370g0 implements Closeable {

    /* renamed from: ge.g0$a */
    /* compiled from: ResponseBody */
    class C10371a extends C10370g0 {

        /* renamed from: a */
        final /* synthetic */ long f41115a;

        /* renamed from: b */
        final /* synthetic */ C12234e f41116b;

        C10371a(C10401z zVar, long j, C12234e eVar) {
            this.f41115a = j;
            this.f41116b = eVar;
        }

        /* renamed from: f */
        public long mo33323f() {
            return this.f41115a;
        }

        /* renamed from: m */
        public C12234e mo33324m() {
            return this.f41116b;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m52391a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* renamed from: g */
    public static C10370g0 m52392g(C10401z zVar, long j, C12234e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new C10371a(zVar, j, eVar);
    }

    /* renamed from: h */
    public static C10370g0 m52393h(C10401z zVar, byte[] bArr) {
        return m52392g(zVar, (long) bArr.length, new C12231c().mo36792e1(bArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        m52391a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo33321b() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.mo33323f()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0053
            qe.e r2 = r6.mo33324m()
            r3 = 0
            byte[] r4 = r2.mo36779V()     // Catch:{ all -> 0x004a }
            m52391a(r3, r2)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0049
            int r2 = r4.length
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0024
            goto L_0x0049
        L_0x0024:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Content-Length ("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            int r0 = r4.length
            r3.append(r0)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0052
            m52391a(r0, r2)
        L_0x0052:
            throw r1
        L_0x0053:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p244ge.C10370g0.mo33321b():byte[]");
    }

    public void close() {
        C10543e.m53045f(mo33324m());
    }

    /* renamed from: f */
    public abstract long mo33323f();

    /* renamed from: m */
    public abstract C12234e mo33324m();
}
