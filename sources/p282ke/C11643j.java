package p282ke;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p244ge.C10351a0;
import p244ge.C10360d0;
import p244ge.C10364e0;
import p244ge.C10367f0;
import p244ge.C10375h0;
import p244ge.C10397x;
import p244ge.C10399y;
import p253he.C10543e;
import p273je.C11590k;

/* renamed from: ke.j */
/* compiled from: RetryAndFollowUpInterceptor */
public final class C11643j implements C10399y {

    /* renamed from: a */
    private final C10351a0 f44216a;

    public C11643j(C10351a0 a0Var) {
        this.f44216a = a0Var;
    }

    /* renamed from: b */
    private C10360d0 m56752b(C10367f0 f0Var, C10375h0 h0Var) throws IOException {
        String h;
        C10397x A;
        Proxy proxy;
        if (f0Var != null) {
            int f = f0Var.mo33292f();
            String f2 = f0Var.mo33301w().mo33258f();
            C10364e0 e0Var = null;
            if (f == 307 || f == 308) {
                if (!f2.equals("GET") && !f2.equals("HEAD")) {
                    return null;
                }
            } else if (f == 401) {
                return this.f44216a.mo33206a().mo33240a(h0Var, f0Var);
            } else {
                if (f != 503) {
                    if (f == 407) {
                        if (h0Var != null) {
                            proxy = h0Var.mo33336b();
                        } else {
                            proxy = this.f44216a.mo33225x();
                        }
                        if (proxy.type() == Proxy.Type.HTTP) {
                            return this.f44216a.mo33226y().mo33240a(h0Var, f0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (f != 408) {
                        switch (f) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f44216a.mo33202B()) {
                        return null;
                    } else {
                        C10364e0 a = f0Var.mo33301w().mo33253a();
                        if (a != null && a.mo33287f()) {
                            return null;
                        }
                        if ((f0Var.mo33298q() == null || f0Var.mo33298q().mo33292f() != 408) && m56756f(f0Var, 0) <= 0) {
                            return f0Var.mo33301w();
                        }
                        return null;
                    }
                } else if ((f0Var.mo33298q() == null || f0Var.mo33298q().mo33292f() != 503) && m56756f(f0Var, Integer.MAX_VALUE) == 0) {
                    return f0Var.mo33301w();
                } else {
                    return null;
                }
            }
            if (!this.f44216a.mo33216k() || (h = f0Var.mo33294h("Location")) == null || (A = f0Var.mo33301w().mo33260h().mo33416A(h)) == null) {
                return null;
            }
            if (!A.mo33417B().equals(f0Var.mo33301w().mo33260h().mo33417B()) && !this.f44216a.mo33217l()) {
                return null;
            }
            C10360d0.C10361a g = f0Var.mo33301w().mo33259g();
            if (C11639f.m56735b(f2)) {
                boolean d = C11639f.m56737d(f2);
                if (C11639f.m56736c(f2)) {
                    g.mo33266e("GET", (C10364e0) null);
                } else {
                    if (d) {
                        e0Var = f0Var.mo33301w().mo33253a();
                    }
                    g.mo33266e(f2, e0Var);
                }
                if (!d) {
                    g.mo33267f("Transfer-Encoding");
                    g.mo33267f("Content-Length");
                    g.mo33267f("Content-Type");
                }
            }
            if (!C10543e.m53031D(f0Var.mo33301w().mo33260h(), A)) {
                g.mo33267f("Authorization");
            }
            return g.mo33268g(A).mo33262a();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    private boolean m56753c(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    private boolean m56754d(IOException iOException, C11590k kVar, boolean z, C10360d0 d0Var) {
        if (!this.f44216a.mo33202B()) {
            return false;
        }
        if ((!z || !m56755e(iOException, d0Var)) && m56753c(iOException, z) && kVar.mo35735c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m56755e(IOException iOException, C10360d0 d0Var) {
        C10364e0 a = d0Var.mo33253a();
        return (a != null && a.mo33287f()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    private int m56756f(C10367f0 f0Var, int i) {
        String h = f0Var.mo33294h("Retry-After");
        if (h == null) {
            return i;
        }
        if (h.matches("\\d+")) {
            return Integer.valueOf(h).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r1.mo35737f();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p244ge.C10367f0 mo33446a(p244ge.C10399y.C10400a r9) throws java.io.IOException {
        /*
            r8 = this;
            ge.d0 r0 = r9.mo33451e()
            ke.g r9 = (p282ke.C11640g) r9
            je.k r1 = r9.mo35802h()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = 0
        L_0x000e:
            r1.mo35743m(r0)
            boolean r6 = r1.mo35740i()
            if (r6 != 0) goto L_0x00c1
            ge.f0 r0 = r9.mo35801g(r0, r1, r3)     // Catch:{ i -> 0x00a8, IOException -> 0x0098 }
            if (r4 == 0) goto L_0x0035
            ge.f0$a r0 = r0.mo33297p()
            ge.f0$a r4 = r4.mo33297p()
            ge.f0$a r4 = r4.mo33304b(r3)
            ge.f0 r4 = r4.mo33305c()
            ge.f0$a r0 = r0.mo33314n(r4)
            ge.f0 r0 = r0.mo33305c()
        L_0x0035:
            r4 = r0
            he.a r0 = p253he.C10539a.f41555a
            je.c r0 = r0.mo33233f(r4)
            if (r0 == 0) goto L_0x0047
            je.e r6 = r0.mo35678c()
            ge.h0 r6 = r6.mo35711q()
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            ge.d0 r6 = r8.m56752b(r4, r6)
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0059
            boolean r9 = r0.mo35683h()
            if (r9 == 0) goto L_0x0059
            r1.mo35745o()
        L_0x0059:
            return r4
        L_0x005a:
            ge.e0 r7 = r6.mo33253a()
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.mo33287f()
            if (r7 == 0) goto L_0x0067
            return r4
        L_0x0067:
            ge.g0 r7 = r4.mo33289a()
            p253he.C10543e.m53045f(r7)
            boolean r7 = r1.mo35739h()
            if (r7 == 0) goto L_0x0077
            r0.mo35680e()
        L_0x0077:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007f
            r0 = r6
            goto L_0x000e
        L_0x007f:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0096:
            r9 = move-exception
            goto L_0x00bd
        L_0x0098:
            r6 = move-exception
            boolean r7 = r6 instanceof p300me.C11888a     // Catch:{ all -> 0x0096 }
            if (r7 != 0) goto L_0x009f
            r7 = 1
            goto L_0x00a0
        L_0x009f:
            r7 = 0
        L_0x00a0:
            boolean r7 = r8.m56754d(r6, r1, r7, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00a7
            goto L_0x00b3
        L_0x00a7:
            throw r6     // Catch:{ all -> 0x0096 }
        L_0x00a8:
            r6 = move-exception
            java.io.IOException r7 = r6.mo35727c()     // Catch:{ all -> 0x0096 }
            boolean r7 = r8.m56754d(r7, r1, r2, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00b8
        L_0x00b3:
            r1.mo35737f()
            goto L_0x000e
        L_0x00b8:
            java.io.IOException r9 = r6.mo35726b()     // Catch:{ all -> 0x0096 }
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x00bd:
            r1.mo35737f()
            throw r9
        L_0x00c1:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p282ke.C11643j.mo33446a(ge.y$a):ge.f0");
    }
}
