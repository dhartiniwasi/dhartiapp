package p155v3;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p015b3.C1748q;
import p155v3.C5810h0;
import p155v3.C5837p;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: v3.j0 */
/* compiled from: ParsingLoadable */
public final class C5823j0<T> implements C5810h0.C5815e {

    /* renamed from: a */
    public final long f28845a;

    /* renamed from: b */
    public final C5837p f28846b;

    /* renamed from: c */
    public final int f28847c;

    /* renamed from: d */
    private final C5836o0 f28848d;

    /* renamed from: e */
    private final C5824a<? extends T> f28849e;

    /* renamed from: f */
    private volatile T f28850f;

    /* renamed from: v3.j0$a */
    /* compiled from: ParsingLoadable */
    public interface C5824a<T> {
        /* renamed from: a */
        T mo216a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C5823j0(C5828l lVar, Uri uri, int i, C5824a<? extends T> aVar) {
        this(lVar, new C5837p.C5839b().mo20380i(uri).mo20373b(1).mo20372a(), i, aVar);
    }

    /* renamed from: a */
    public long mo20349a() {
        return this.f28848d.mo20362q();
    }

    /* renamed from: b */
    public final void mo6786b() throws IOException {
        this.f28848d.mo20365t();
        C5831n nVar = new C5831n(this.f28848d, this.f28846b);
        try {
            nVar.mo20354b();
            this.f28850f = this.f28849e.mo216a((Uri) C5917a.m34872e(this.f28848d.mo6817m()), nVar);
        } finally {
            C5953m0.m35146n(nVar);
        }
    }

    /* renamed from: c */
    public final void mo6787c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> mo20350d() {
        return this.f28848d.mo20364s();
    }

    /* renamed from: e */
    public final T mo20351e() {
        return this.f28850f;
    }

    /* renamed from: f */
    public Uri mo20352f() {
        return this.f28848d.mo20363r();
    }

    public C5823j0(C5828l lVar, C5837p pVar, int i, C5824a<? extends T> aVar) {
        this.f28848d = new C5836o0(lVar);
        this.f28846b = pVar;
        this.f28847c = i;
        this.f28849e = aVar;
        this.f28845a = C1748q.m8237a();
    }
}
