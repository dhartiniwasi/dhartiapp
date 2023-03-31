package p336qe;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: qe.l */
/* compiled from: Okio */
public final class C12241l {

    /* renamed from: a */
    static final Logger f45397a = Logger.getLogger(C12241l.class.getName());

    /* renamed from: qe.l$a */
    /* compiled from: Okio */
    class C12242a implements C12251s {

        /* renamed from: a */
        final /* synthetic */ C12253u f45398a;

        /* renamed from: b */
        final /* synthetic */ OutputStream f45399b;

        C12242a(C12253u uVar, OutputStream outputStream) {
            this.f45398a = uVar;
            this.f45399b = outputStream;
        }

        public void close() throws IOException {
            this.f45399b.close();
        }

        public void flush() throws IOException {
            this.f45399b.flush();
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            C12255v.m58892b(cVar.f45378b, 0, j);
            while (j > 0) {
                this.f45398a.mo36858f();
                C12248p pVar = cVar.f45377a;
                int min = (int) Math.min(j, (long) (pVar.f45413c - pVar.f45412b));
                this.f45399b.write(pVar.f45411a, pVar.f45412b, min);
                int i = pVar.f45412b + min;
                pVar.f45412b = i;
                long j2 = (long) min;
                j -= j2;
                cVar.f45378b -= j2;
                if (i == pVar.f45413c) {
                    cVar.f45377a = pVar.mo36877b();
                    C12249q.m58859a(pVar);
                }
            }
        }

        /* renamed from: o */
        public C12253u mo36029o() {
            return this.f45398a;
        }

        public String toString() {
            return "sink(" + this.f45399b + ")";
        }
    }

    /* renamed from: qe.l$b */
    /* compiled from: Okio */
    class C12243b implements C12252t {

        /* renamed from: a */
        final /* synthetic */ C12253u f45400a;

        /* renamed from: b */
        final /* synthetic */ InputStream f45401b;

        C12243b(C12253u uVar, InputStream inputStream) {
            this.f45400a = uVar;
            this.f45401b = inputStream;
        }

        public void close() throws IOException {
            this.f45401b.close();
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return this.f45400a;
        }

        public String toString() {
            return "source(" + this.f45401b + ")";
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0;
            } else {
                try {
                    this.f45400a.mo36858f();
                    C12248p Q = cVar.mo36776Q(1);
                    int read = this.f45401b.read(Q.f45411a, Q.f45413c, (int) Math.min(j, (long) (8192 - Q.f45413c)));
                    if (read != -1) {
                        Q.f45413c += read;
                        long j2 = (long) read;
                        cVar.f45378b += j2;
                        return j2;
                    } else if (Q.f45412b != Q.f45413c) {
                        return -1;
                    } else {
                        cVar.f45377a = Q.mo36877b();
                        C12249q.m58859a(Q);
                        return -1;
                    }
                } catch (AssertionError e) {
                    if (C12241l.m58808c(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }
    }

    /* renamed from: qe.l$c */
    /* compiled from: Okio */
    class C12244c extends C12226a {

        /* renamed from: k */
        final /* synthetic */ Socket f45402k;

        C12244c(Socket socket) {
            this.f45402k = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public IOException mo36212o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo35747t() {
            try {
                this.f45402k.close();
            } catch (Exception e) {
                Logger logger = C12241l.f45397a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.f45402k, e);
            } catch (AssertionError e2) {
                if (C12241l.m58808c(e2)) {
                    Logger logger2 = C12241l.f45397a;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.f45402k, e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private C12241l() {
    }

    /* renamed from: a */
    public static C12233d m58806a(C12251s sVar) {
        return new C12246n(sVar);
    }

    /* renamed from: b */
    public static C12234e m58807b(C12252t tVar) {
        return new C12247o(tVar);
    }

    /* renamed from: c */
    static boolean m58808c(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: d */
    private static C12251s m58809d(OutputStream outputStream, C12253u uVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (uVar != null) {
            return new C12242a(uVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: e */
    public static C12251s m58810e(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C12226a i = m58814i(socket);
            return i.mo36757r(m58809d(socket.getOutputStream(), i));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: f */
    public static C12252t m58811f(InputStream inputStream) {
        return m58812g(inputStream, new C12253u());
    }

    /* renamed from: g */
    private static C12252t m58812g(InputStream inputStream, C12253u uVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (uVar != null) {
            return new C12243b(uVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: h */
    public static C12252t m58813h(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C12226a i = m58814i(socket);
            return i.mo36758s(m58812g(socket.getInputStream(), i));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: i */
    private static C12226a m58814i(Socket socket) {
        return new C12244c(socket);
    }
}
