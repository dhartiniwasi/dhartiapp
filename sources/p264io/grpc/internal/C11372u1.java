package p264io.grpc.internal;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6444t;
import p343rc.C12294c0;
import p343rc.C12318f1;
import p343rc.C12322g1;

/* renamed from: io.grpc.internal.u1 */
/* compiled from: ProxyDetectorImpl */
class C11372u1 implements C12322g1 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Logger f43634d = Logger.getLogger(C11372u1.class.getName());

    /* renamed from: e */
    private static final C11375c f43635e = new C11373a();

    /* renamed from: f */
    private static final C6444t<ProxySelector> f43636f = new C11374b();

    /* renamed from: a */
    private final C6444t<ProxySelector> f43637a;

    /* renamed from: b */
    private final C11375c f43638b;

    /* renamed from: c */
    private final InetSocketAddress f43639c;

    /* renamed from: io.grpc.internal.u1$a */
    /* compiled from: ProxyDetectorImpl */
    class C11373a implements C11375c {
        C11373a() {
        }

        /* renamed from: a */
        public PasswordAuthentication mo35363a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                C11372u1.f43634d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.u1$b */
    /* compiled from: ProxyDetectorImpl */
    class C11374b implements C6444t<ProxySelector> {
        C11374b() {
        }

        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: io.grpc.internal.u1$c */
    /* compiled from: ProxyDetectorImpl */
    interface C11375c {
        /* renamed from: a */
        PasswordAuthentication mo35363a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4);
    }

    public C11372u1() {
        this(f43636f, f43635e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* renamed from: c */
    private C12318f1 m55939c(InetSocketAddress inetSocketAddress) throws IOException {
        String str = null;
        try {
            try {
                URI uri = new URI("https", (String) null, C11335r0.m55801h(inetSocketAddress), inetSocketAddress.getPort(), (String) null, (String) null, (String) null);
                ProxySelector proxySelector = this.f43637a.get();
                if (proxySelector == null) {
                    f43634d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f43634d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = this.f43638b.mo35363a(C11335r0.m55801h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", (String) null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C12294c0.C12296b c = C12294c0.m59010e().mo36987d(inetSocketAddress).mo36986c(inetSocketAddress2);
                if (a == null) {
                    return c.mo36984a();
                }
                C12294c0.C12296b e = c.mo36988e(a.getUserName());
                if (a.getPassword() != null) {
                    str = new String(a.getPassword());
                }
                return e.mo36985b(str).mo36984a();
            } catch (URISyntaxException e2) {
                f43634d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", e2);
                return null;
            }
        } catch (Throwable th) {
            f43634d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    /* renamed from: d */
    private static InetSocketAddress m55940d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int i = 80;
        if (split.length > 1) {
            i = Integer.parseInt(split[1]);
        }
        f43634d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], i);
    }

    /* renamed from: a */
    public C12318f1 mo35298a(SocketAddress socketAddress) throws IOException {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.f43639c != null) {
            return C12294c0.m59010e().mo36986c(this.f43639c).mo36987d((InetSocketAddress) socketAddress).mo36984a();
        }
        return m55939c((InetSocketAddress) socketAddress);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [a7.t<java.net.ProxySelector>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11372u1(p182a7.C6444t<java.net.ProxySelector> r1, p264io.grpc.internal.C11372u1.C11375c r2, java.lang.String r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p182a7.C6431n.m37561n(r1)
            a7.t r1 = (p182a7.C6444t) r1
            r0.f43637a = r1
            java.lang.Object r1 = p182a7.C6431n.m37561n(r2)
            io.grpc.internal.u1$c r1 = (p264io.grpc.internal.C11372u1.C11375c) r1
            r0.f43638b = r1
            if (r3 == 0) goto L_0x001c
            java.net.InetSocketAddress r1 = m55940d(r3)
            r0.f43639c = r1
            goto L_0x001f
        L_0x001c:
            r1 = 0
            r0.f43639c = r1
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11372u1.<init>(a7.t, io.grpc.internal.u1$c, java.lang.String):void");
    }
}
