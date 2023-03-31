package p316oc;

import android.content.Context;
import android.os.Build;
import android.util.LongSparseArray;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;
import p186ac.C6539c;
import p186ac.C6544d;
import p264io.flutter.view.C11091f;
import p297mb.C11877a;
import p297mb.C11881b;
import p316oc.C12074b;
import p333qb.C12212f;
import p351sb.C12502a;

/* renamed from: oc.t */
/* compiled from: VideoPlayerPlugin */
public class C12109t implements C12502a, C12074b.C12076b {

    /* renamed from: a */
    private final LongSparseArray<C12103p> f45153a = new LongSparseArray<>();

    /* renamed from: b */
    private C12110a f45154b;

    /* renamed from: c */
    private C12106q f45155c = new C12106q();

    /* renamed from: oc.t$a */
    /* compiled from: VideoPlayerPlugin */
    private static final class C12110a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Context f45156a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C6539c f45157b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C12112c f45158c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C12111b f45159d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C11091f f45160e;

        C12110a(Context context, C6539c cVar, C12112c cVar2, C12111b bVar, C11091f fVar) {
            this.f45156a = context;
            this.f45157b = cVar;
            this.f45158c = cVar2;
            this.f45159d = bVar;
            this.f45160e = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36514f(C12109t tVar, C6539c cVar) {
            C12098n.m58157x(cVar, tVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36515g(C6539c cVar) {
            C12098n.m58157x(cVar, (C12074b.C12076b) null);
        }
    }

    /* renamed from: oc.t$b */
    /* compiled from: VideoPlayerPlugin */
    private interface C12111b {
        /* renamed from: a */
        String mo36512a(String str, String str2);
    }

    /* renamed from: oc.t$c */
    /* compiled from: VideoPlayerPlugin */
    private interface C12112c {
        String get(String str);
    }

    /* renamed from: k */
    private void m58212k() {
        for (int i = 0; i < this.f45153a.size(); i++) {
            this.f45153a.valueAt(i).mo36501b();
        }
        this.f45153a.clear();
    }

    /* renamed from: a */
    public void mo36447a(C12074b.C12086j jVar) {
        this.f45153a.get(jVar.mo36495b().longValue()).mo36510n(jVar.mo36496c().doubleValue());
    }

    /* renamed from: b */
    public void mo36448b(C12074b.C12084i iVar) {
        this.f45153a.get(iVar.mo36490b().longValue()).mo36503e();
    }

    /* renamed from: c */
    public void mo36449c(C12074b.C12084i iVar) {
        this.f45153a.get(iVar.mo36490b().longValue()).mo36504f();
    }

    /* renamed from: d */
    public void mo36450d(C12074b.C12082h hVar) {
        this.f45153a.get(hVar.mo36483c().longValue()).mo36505g(hVar.mo36482b().intValue());
    }

    /* renamed from: e */
    public void mo36451e(C12074b.C12079e eVar) {
        this.f45153a.get(eVar.mo36470c().longValue()).mo36508k(eVar.mo36469b().booleanValue());
    }

    /* renamed from: f */
    public void mo36452f(C12074b.C12080f fVar) {
        this.f45155c.f45150a = fVar.mo36474b().booleanValue();
    }

    /* renamed from: g */
    public void mo36453g(C12074b.C12084i iVar) {
        this.f45153a.get(iVar.mo36490b().longValue()).mo36501b();
        this.f45153a.remove(iVar.mo36490b().longValue());
    }

    /* renamed from: h */
    public void mo36454h(C12074b.C12081g gVar) {
        this.f45153a.get(gVar.mo36478c().longValue()).mo36509l(gVar.mo36477b().doubleValue());
    }

    /* renamed from: i */
    public C12074b.C12084i mo36455i(C12074b.C12078d dVar) {
        C12103p pVar;
        String str;
        C11091f.C11094c h = this.f45154b.f45160e.mo34869h();
        C6539c b = this.f45154b.f45157b;
        C6544d dVar2 = new C6544d(b, "flutter.io/videoPlayer/videoEvents" + h.mo34886d());
        if (dVar.mo36458b() != null) {
            if (dVar.mo36461e() != null) {
                str = this.f45154b.f45159d.mo36512a(dVar.mo36458b(), dVar.mo36461e());
            } else {
                str = this.f45154b.f45158c.get(dVar.mo36458b());
            }
            Context e = this.f45154b.f45156a;
            pVar = new C12103p(e, dVar2, h, "asset:///" + str, (String) null, (Map<String, String>) null, this.f45155c);
        } else {
            C11091f.C11094c cVar = h;
            pVar = new C12103p(this.f45154b.f45156a, dVar2, cVar, dVar.mo36462f(), dVar.mo36459c(), dVar.mo36460d(), this.f45155c);
        }
        this.f45153a.put(h.mo34886d(), pVar);
        return new C12074b.C12084i.C12085a().mo36494b(Long.valueOf(h.mo34886d())).mo36493a();
    }

    public void initialize() {
        m58212k();
    }

    /* renamed from: j */
    public C12074b.C12082h mo36457j(C12074b.C12084i iVar) {
        C12103p pVar = this.f45153a.get(iVar.mo36490b().longValue());
        C12074b.C12082h a = new C12074b.C12082h.C12083a().mo36488b(Long.valueOf(pVar.mo36502c())).mo36489c(iVar.mo36490b()).mo36487a();
        pVar.mo36506h();
        return a;
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                HttpsURLConnection.setDefaultSSLSocketFactory(new C12073a());
            } catch (KeyManagementException | NoSuchAlgorithmException e) {
                C11881b.m57390h("VideoPlayerPlugin", "Failed to enable TLSv1.1 and TLSv1.2 Protocols for API level 19 and below.\nFor more information about Socket Security, please consult the following link:\nhttps://developer.android.com/reference/javax/net/ssl/SSLSocket", e);
            }
        }
        C11877a e2 = C11877a.m57376e();
        Context a = bVar.mo37292a();
        C6539c b = bVar.mo37293b();
        C12212f c = e2.mo36134c();
        Objects.requireNonNull(c);
        C12108s sVar = new C12108s(c);
        C12212f c2 = e2.mo36134c();
        Objects.requireNonNull(c2);
        C12110a aVar = new C12110a(a, b, sVar, new C12107r(c2), bVar.mo37297f());
        this.f45154b = aVar;
        aVar.mo36514f(this, bVar.mo37293b());
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        if (this.f45154b == null) {
            C11881b.m57391i("VideoPlayerPlugin", "Detached from the engine before registering to it.");
        }
        this.f45154b.mo36515g(bVar.mo37293b());
        this.f45154b = null;
        initialize();
    }
}
