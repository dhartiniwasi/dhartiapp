package p273je;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p244ge.C10350a;
import p244ge.C10366f;
import p244ge.C10375h0;
import p244ge.C10391u;
import p244ge.C10397x;
import p253he.C10543e;

/* renamed from: je.j */
/* compiled from: RouteSelector */
final class C11588j {

    /* renamed from: a */
    private final C10350a f44108a;

    /* renamed from: b */
    private final C11586h f44109b;

    /* renamed from: c */
    private final C10366f f44110c;

    /* renamed from: d */
    private final C10391u f44111d;

    /* renamed from: e */
    private List<Proxy> f44112e = Collections.emptyList();

    /* renamed from: f */
    private int f44113f;

    /* renamed from: g */
    private List<InetSocketAddress> f44114g = Collections.emptyList();

    /* renamed from: h */
    private final List<C10375h0> f44115h = new ArrayList();

    /* renamed from: je.j$a */
    /* compiled from: RouteSelector */
    public static final class C11589a {

        /* renamed from: a */
        private final List<C10375h0> f44116a;

        /* renamed from: b */
        private int f44117b = 0;

        C11589a(List<C10375h0> list) {
            this.f44116a = list;
        }

        /* renamed from: a */
        public List<C10375h0> mo35730a() {
            return new ArrayList(this.f44116a);
        }

        /* renamed from: b */
        public boolean mo35731b() {
            return this.f44117b < this.f44116a.size();
        }

        /* renamed from: c */
        public C10375h0 mo35732c() {
            if (mo35731b()) {
                List<C10375h0> list = this.f44116a;
                int i = this.f44117b;
                this.f44117b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    C11588j(C10350a aVar, C11586h hVar, C10366f fVar, C10391u uVar) {
        this.f44108a = aVar;
        this.f44109b = hVar;
        this.f44110c = fVar;
        this.f44111d = uVar;
        m56584g(aVar.mo33199l(), aVar.mo33193g());
    }

    /* renamed from: a */
    static String m56580a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    /* renamed from: c */
    private boolean m56581c() {
        return this.f44113f < this.f44112e.size();
    }

    /* renamed from: e */
    private Proxy m56582e() throws IOException {
        if (m56581c()) {
            List<Proxy> list = this.f44112e;
            int i = this.f44113f;
            this.f44113f = i + 1;
            Proxy proxy = list.get(i);
            m56583f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f44108a.mo33199l().mo33427l() + "; exhausted proxy configurations: " + this.f44112e);
    }

    /* renamed from: f */
    private void m56583f(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f44114g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f44108a.mo33199l().mo33427l();
            i = this.f44108a.mo33199l().mo33432w();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m56580a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.f44114g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f44111d.mo33383k(this.f44110c, str);
            List<InetAddress> a = this.f44108a.mo33188c().mo33372a(str);
            if (!a.isEmpty()) {
                this.f44111d.mo33382j(this.f44110c, str, a);
                int size = a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f44114g.add(new InetSocketAddress(a.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f44108a.mo33188c() + " returned no addresses for " + str);
        }
    }

    /* renamed from: g */
    private void m56584g(C10397x xVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f44112e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f44108a.mo33196i().select(xVar.mo33418C());
            if (select == null || select.isEmpty()) {
                list = C10543e.m53059t(Proxy.NO_PROXY);
            } else {
                list = C10543e.m53058s(select);
            }
            this.f44112e = list;
        }
        this.f44113f = 0;
    }

    /* renamed from: b */
    public boolean mo35728b() {
        return m56581c() || !this.f44115h.isEmpty();
    }

    /* renamed from: d */
    public C11589a mo35729d() throws IOException {
        if (mo35728b()) {
            ArrayList arrayList = new ArrayList();
            while (m56581c()) {
                Proxy e = m56582e();
                int size = this.f44114g.size();
                for (int i = 0; i < size; i++) {
                    C10375h0 h0Var = new C10375h0(this.f44108a, e, this.f44114g.get(i));
                    if (this.f44109b.mo35724c(h0Var)) {
                        this.f44115h.add(h0Var);
                    } else {
                        arrayList.add(h0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f44115h);
                this.f44115h.clear();
            }
            return new C11589a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
