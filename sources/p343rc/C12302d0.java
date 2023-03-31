package p343rc;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p182a7.C6431n;

/* renamed from: rc.d0 */
/* compiled from: InternalChannelz */
public final class C12302d0 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Logger f45555f = Logger.getLogger(C12302d0.class.getName());

    /* renamed from: g */
    private static final C12302d0 f45556g = new C12302d0();

    /* renamed from: a */
    private final ConcurrentNavigableMap<Long, C12327i0<Object>> f45557a = new ConcurrentSkipListMap();

    /* renamed from: b */
    private final ConcurrentNavigableMap<Long, C12327i0<Object>> f45558b = new ConcurrentSkipListMap();

    /* renamed from: c */
    private final ConcurrentMap<Long, C12327i0<Object>> f45559c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Long, C12327i0<Object>> f45560d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ConcurrentMap<Long, Object> f45561e = new ConcurrentHashMap();

    /* renamed from: rc.d0$b */
    /* compiled from: InternalChannelz */
    public static final class C12304b {

        /* renamed from: a */
        public final C12305c f45562a;

        public C12304b(C12305c cVar) {
            this.f45562a = (C12305c) C6431n.m37561n(cVar);
        }
    }

    /* renamed from: rc.d0$c */
    /* compiled from: InternalChannelz */
    public static final class C12305c {

        /* renamed from: a */
        public final String f45563a;

        /* renamed from: b */
        public final Certificate f45564b;

        /* renamed from: c */
        public final Certificate f45565c;

        public C12305c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C12302d0.f45555f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", new Object[]{sSLSession.getPeerHost()}), e);
            }
            this.f45563a = cipherSuite;
            this.f45564b = certificate2;
            this.f45565c = certificate;
        }
    }

    /* renamed from: b */
    private static <T extends C12327i0<?>> void m59036b(Map<Long, T> map, T t) {
        C12327i0 i0Var = (C12327i0) map.put(Long.valueOf(t.mo34935f().mo37017d()), t);
    }

    /* renamed from: f */
    public static long m59037f(C12368p0 p0Var) {
        return p0Var.mo34935f().mo37017d();
    }

    /* renamed from: g */
    public static C12302d0 m59038g() {
        return f45556g;
    }

    /* renamed from: h */
    private static <T extends C12327i0<?>> void m59039h(Map<Long, T> map, T t) {
        C12327i0 i0Var = (C12327i0) map.remove(Long.valueOf(m59037f(t)));
    }

    /* renamed from: c */
    public void mo36995c(C12327i0<Object> i0Var) {
        m59036b(this.f45560d, i0Var);
    }

    /* renamed from: d */
    public void mo36996d(C12327i0<Object> i0Var) {
        m59036b(this.f45558b, i0Var);
    }

    /* renamed from: e */
    public void mo36997e(C12327i0<Object> i0Var) {
        m59036b(this.f45559c, i0Var);
    }

    /* renamed from: i */
    public void mo36998i(C12327i0<Object> i0Var) {
        m59039h(this.f45560d, i0Var);
    }

    /* renamed from: j */
    public void mo36999j(C12327i0<Object> i0Var) {
        m59039h(this.f45558b, i0Var);
    }

    /* renamed from: k */
    public void mo37000k(C12327i0<Object> i0Var) {
        m59039h(this.f45559c, i0Var);
    }
}
