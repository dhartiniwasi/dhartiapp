package p300me;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p244ge.C10351a0;
import p244ge.C10355b0;
import p244ge.C10360d0;
import p244ge.C10367f0;
import p244ge.C10395w;
import p244ge.C10399y;
import p253he.C10539a;
import p253he.C10543e;
import p273je.C11583e;
import p282ke.C11635c;
import p282ke.C11638e;
import p282ke.C11642i;
import p282ke.C11644k;
import p336qe.C12251s;
import p336qe.C12252t;

/* renamed from: me.g */
/* compiled from: Http2ExchangeCodec */
public final class C11912g implements C11635c {

    /* renamed from: g */
    private static final List<String> f44749g = C10543e.m53059t("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    private static final List<String> f44750h = C10543e.m53059t("connection", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final C10399y.C10400a f44751a;

    /* renamed from: b */
    private final C11583e f44752b;

    /* renamed from: c */
    private final C11895f f44753c;

    /* renamed from: d */
    private volatile C11916i f44754d;

    /* renamed from: e */
    private final C10355b0 f44755e;

    /* renamed from: f */
    private volatile boolean f44756f;

    public C11912g(C10351a0 a0Var, C11583e eVar, C10399y.C10400a aVar, C11895f fVar) {
        this.f44752b = eVar;
        this.f44751a = aVar;
        this.f44753c = fVar;
        List<C10355b0> v = a0Var.mo33224v();
        C10355b0 b0Var = C10355b0.H2_PRIOR_KNOWLEDGE;
        this.f44755e = !v.contains(b0Var) ? C10355b0.HTTP_2 : b0Var;
    }

    /* renamed from: i */
    public static List<C11890c> m57501i(C10360d0 d0Var) {
        C10395w d = d0Var.mo33256d();
        ArrayList arrayList = new ArrayList(d.mo33405h() + 4);
        arrayList.add(new C11890c(C11890c.f44648f, d0Var.mo33258f()));
        arrayList.add(new C11890c(C11890c.f44649g, C11642i.m56751c(d0Var.mo33260h())));
        String c = d0Var.mo33255c("Host");
        if (c != null) {
            arrayList.add(new C11890c(C11890c.f44651i, c));
        }
        arrayList.add(new C11890c(C11890c.f44650h, d0Var.mo33260h().mo33417B()));
        int h = d.mo33405h();
        for (int i = 0; i < h; i++) {
            String lowerCase = d.mo33402e(i).toLowerCase(Locale.US);
            if (!f44749g.contains(lowerCase) || (lowerCase.equals("te") && d.mo33407i(i).equals("trailers"))) {
                arrayList.add(new C11890c(lowerCase, d.mo33407i(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static C10367f0.C10368a m57502j(C10395w wVar, C10355b0 b0Var) throws IOException {
        C10395w.C10396a aVar = new C10395w.C10396a();
        int h = wVar.mo33405h();
        C11644k kVar = null;
        for (int i = 0; i < h; i++) {
            String e = wVar.mo33402e(i);
            String i2 = wVar.mo33407i(i);
            if (e.equals(":status")) {
                kVar = C11644k.m56758a("HTTP/1.1 " + i2);
            } else if (!f44750h.contains(e)) {
                C10539a.f41555a.mo33229b(aVar, e, i2);
            }
        }
        if (kVar != null) {
            return new C10367f0.C10368a().mo33315o(b0Var).mo33307g(kVar.f44218b).mo33312l(kVar.f44219c).mo33310j(aVar.mo33413d());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public C12251s mo35789a(C10360d0 d0Var, long j) {
        return this.f44754d.mo36200h();
    }

    /* renamed from: b */
    public C12252t mo35790b(C10367f0 f0Var) {
        return this.f44754d.mo36201i();
    }

    /* renamed from: c */
    public long mo35791c(C10367f0 f0Var) {
        return C11638e.m56727b(f0Var);
    }

    public void cancel() {
        this.f44756f = true;
        if (this.f44754d != null) {
            this.f44754d.mo36198f(C11889b.CANCEL);
        }
    }

    /* renamed from: d */
    public void mo35793d() throws IOException {
        this.f44754d.mo36200h().close();
    }

    /* renamed from: e */
    public C10367f0.C10368a mo35794e(boolean z) throws IOException {
        C10367f0.C10368a j = m57502j(this.f44754d.mo36208p(), this.f44755e);
        if (!z || C10539a.f41555a.mo33231d(j) != 100) {
            return j;
        }
        return null;
    }

    /* renamed from: f */
    public C11583e mo35795f() {
        return this.f44752b;
    }

    /* renamed from: g */
    public void mo35796g(C10360d0 d0Var) throws IOException {
        if (this.f44754d == null) {
            this.f44754d = this.f44753c.mo36157K(m57501i(d0Var), d0Var.mo33253a() != null);
            if (!this.f44756f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f44754d.mo36204l().mo36859g((long) this.f44751a.mo33447a(), timeUnit);
                this.f44754d.mo36210r().mo36859g((long) this.f44751a.mo33448b(), timeUnit);
                return;
            }
            this.f44754d.mo36198f(C11889b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: h */
    public void mo35797h() throws IOException {
        this.f44753c.flush();
    }
}
