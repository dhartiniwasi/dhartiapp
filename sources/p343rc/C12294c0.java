package p343rc;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;

/* renamed from: rc.c0 */
/* compiled from: HttpConnectProxiedSocketAddress */
public final class C12294c0 extends C12318f1 {

    /* renamed from: a */
    private final SocketAddress f45540a;

    /* renamed from: b */
    private final InetSocketAddress f45541b;

    /* renamed from: c */
    private final String f45542c;

    /* renamed from: d */
    private final String f45543d;

    /* renamed from: rc.c0$b */
    /* compiled from: HttpConnectProxiedSocketAddress */
    public static final class C12296b {

        /* renamed from: a */
        private SocketAddress f45544a;

        /* renamed from: b */
        private InetSocketAddress f45545b;

        /* renamed from: c */
        private String f45546c;

        /* renamed from: d */
        private String f45547d;

        /* renamed from: a */
        public C12294c0 mo36984a() {
            return new C12294c0(this.f45544a, this.f45545b, this.f45546c, this.f45547d);
        }

        /* renamed from: b */
        public C12296b mo36985b(String str) {
            this.f45547d = str;
            return this;
        }

        /* renamed from: c */
        public C12296b mo36986c(SocketAddress socketAddress) {
            this.f45544a = (SocketAddress) C6431n.m37562o(socketAddress, "proxyAddress");
            return this;
        }

        /* renamed from: d */
        public C12296b mo36987d(InetSocketAddress inetSocketAddress) {
            this.f45545b = (InetSocketAddress) C6431n.m37562o(inetSocketAddress, "targetAddress");
            return this;
        }

        /* renamed from: e */
        public C12296b mo36988e(String str) {
            this.f45546c = str;
            return this;
        }

        private C12296b() {
        }
    }

    /* renamed from: e */
    public static C12296b m59010e() {
        return new C12296b();
    }

    /* renamed from: a */
    public String mo36977a() {
        return this.f45543d;
    }

    /* renamed from: b */
    public SocketAddress mo36978b() {
        return this.f45540a;
    }

    /* renamed from: c */
    public InetSocketAddress mo36979c() {
        return this.f45541b;
    }

    /* renamed from: d */
    public String mo36980d() {
        return this.f45542c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12294c0)) {
            return false;
        }
        C12294c0 c0Var = (C12294c0) obj;
        if (!C6425j.m37541a(this.f45540a, c0Var.f45540a) || !C6425j.m37541a(this.f45541b, c0Var.f45541b) || !C6425j.m37541a(this.f45542c, c0Var.f45542c) || !C6425j.m37541a(this.f45543d, c0Var.f45543d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f45540a, this.f45541b, this.f45542c, this.f45543d);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("proxyAddr", this.f45540a).mo21842d("targetAddr", this.f45541b).mo21842d(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.f45542c).mo21843e("hasPassword", this.f45543d != null).toString();
    }

    private C12294c0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        C6431n.m37562o(socketAddress, "proxyAddress");
        C6431n.m37562o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            C6431n.m37570w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f45540a = socketAddress;
        this.f45541b = inetSocketAddress;
        this.f45542c = str;
        this.f45543d = str2;
    }
}
