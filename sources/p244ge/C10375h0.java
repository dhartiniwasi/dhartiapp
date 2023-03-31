package p244ge;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: ge.h0 */
/* compiled from: Route */
public final class C10375h0 {

    /* renamed from: a */
    final C10350a f41125a;

    /* renamed from: b */
    final Proxy f41126b;

    /* renamed from: c */
    final InetSocketAddress f41127c;

    public C10375h0(C10350a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f41125a = aVar;
        this.f41126b = proxy;
        this.f41127c = inetSocketAddress;
    }

    /* renamed from: a */
    public C10350a mo33335a() {
        return this.f41125a;
    }

    /* renamed from: b */
    public Proxy mo33336b() {
        return this.f41126b;
    }

    /* renamed from: c */
    public boolean mo33337c() {
        return this.f41125a.f40973i != null && this.f41126b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo33338d() {
        return this.f41127c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10375h0) {
            C10375h0 h0Var = (C10375h0) obj;
            return h0Var.f41125a.equals(this.f41125a) && h0Var.f41126b.equals(this.f41126b) && h0Var.f41127c.equals(this.f41127c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f41125a.hashCode()) * 31) + this.f41126b.hashCode()) * 31) + this.f41127c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f41127c + "}";
    }
}
