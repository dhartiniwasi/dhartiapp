package p244ge;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p244ge.C10397x;
import p253he.C10543e;

/* renamed from: ge.a */
/* compiled from: Address */
public final class C10350a {

    /* renamed from: a */
    final C10397x f40965a;

    /* renamed from: b */
    final C10389s f40966b;

    /* renamed from: c */
    final SocketFactory f40967c;

    /* renamed from: d */
    final C10359d f40968d;

    /* renamed from: e */
    final List<C10355b0> f40969e;

    /* renamed from: f */
    final List<C10381m> f40970f;

    /* renamed from: g */
    final ProxySelector f40971g;

    /* renamed from: h */
    final Proxy f40972h;

    /* renamed from: i */
    final SSLSocketFactory f40973i;

    /* renamed from: j */
    final HostnameVerifier f40974j;

    /* renamed from: k */
    final C10372h f40975k;

    public C10350a(String str, int i, C10389s sVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C10372h hVar, C10359d dVar, Proxy proxy, List<C10355b0> list, List<C10381m> list2, ProxySelector proxySelector) {
        this.f40965a = new C10397x.C10398a().mo33443q(sSLSocketFactory != null ? "https" : "http").mo33438e(str).mo33441l(i).mo33435a();
        Objects.requireNonNull(sVar, "dns == null");
        this.f40966b = sVar;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f40967c = socketFactory;
        Objects.requireNonNull(dVar, "proxyAuthenticator == null");
        this.f40968d = dVar;
        Objects.requireNonNull(list, "protocols == null");
        this.f40969e = C10543e.m53058s(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f40970f = C10543e.m53058s(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f40971g = proxySelector;
        this.f40972h = proxy;
        this.f40973i = sSLSocketFactory;
        this.f40974j = hostnameVerifier;
        this.f40975k = hVar;
    }

    /* renamed from: a */
    public C10372h mo33186a() {
        return this.f40975k;
    }

    /* renamed from: b */
    public List<C10381m> mo33187b() {
        return this.f40970f;
    }

    /* renamed from: c */
    public C10389s mo33188c() {
        return this.f40966b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33189d(C10350a aVar) {
        return this.f40966b.equals(aVar.f40966b) && this.f40968d.equals(aVar.f40968d) && this.f40969e.equals(aVar.f40969e) && this.f40970f.equals(aVar.f40970f) && this.f40971g.equals(aVar.f40971g) && Objects.equals(this.f40972h, aVar.f40972h) && Objects.equals(this.f40973i, aVar.f40973i) && Objects.equals(this.f40974j, aVar.f40974j) && Objects.equals(this.f40975k, aVar.f40975k) && mo33199l().mo33432w() == aVar.mo33199l().mo33432w();
    }

    /* renamed from: e */
    public HostnameVerifier mo33190e() {
        return this.f40974j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10350a) {
            C10350a aVar = (C10350a) obj;
            return this.f40965a.equals(aVar.f40965a) && mo33189d(aVar);
        }
    }

    /* renamed from: f */
    public List<C10355b0> mo33192f() {
        return this.f40969e;
    }

    /* renamed from: g */
    public Proxy mo33193g() {
        return this.f40972h;
    }

    /* renamed from: h */
    public C10359d mo33194h() {
        return this.f40968d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f40965a.hashCode()) * 31) + this.f40966b.hashCode()) * 31) + this.f40968d.hashCode()) * 31) + this.f40969e.hashCode()) * 31) + this.f40970f.hashCode()) * 31) + this.f40971g.hashCode()) * 31) + Objects.hashCode(this.f40972h)) * 31) + Objects.hashCode(this.f40973i)) * 31) + Objects.hashCode(this.f40974j)) * 31) + Objects.hashCode(this.f40975k);
    }

    /* renamed from: i */
    public ProxySelector mo33196i() {
        return this.f40971g;
    }

    /* renamed from: j */
    public SocketFactory mo33197j() {
        return this.f40967c;
    }

    /* renamed from: k */
    public SSLSocketFactory mo33198k() {
        return this.f40973i;
    }

    /* renamed from: l */
    public C10397x mo33199l() {
        return this.f40965a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f40965a.mo33427l());
        sb.append(":");
        sb.append(this.f40965a.mo33432w());
        if (this.f40972h != null) {
            sb.append(", proxy=");
            sb.append(this.f40972h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f40971g);
        }
        sb.append("}");
        return sb.toString();
    }
}
