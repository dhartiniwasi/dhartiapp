package p155v3;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p155v3.C5828l;
import p155v3.C5849u;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: v3.t */
/* compiled from: DefaultDataSource */
public final class C5847t implements C5828l {

    /* renamed from: a */
    private final Context f28945a;

    /* renamed from: b */
    private final List<C5840p0> f28946b = new ArrayList();

    /* renamed from: c */
    private final C5828l f28947c;

    /* renamed from: d */
    private C5828l f28948d;

    /* renamed from: e */
    private C5828l f28949e;

    /* renamed from: f */
    private C5828l f28950f;

    /* renamed from: g */
    private C5828l f28951g;

    /* renamed from: h */
    private C5828l f28952h;

    /* renamed from: i */
    private C5828l f28953i;

    /* renamed from: j */
    private C5828l f28954j;

    /* renamed from: k */
    private C5828l f28955k;

    /* renamed from: v3.t$a */
    /* compiled from: DefaultDataSource */
    public static final class C5848a implements C5828l.C5829a {

        /* renamed from: a */
        private final Context f28956a;

        /* renamed from: b */
        private final C5828l.C5829a f28957b;

        /* renamed from: c */
        private C5840p0 f28958c;

        public C5848a(Context context) {
            this(context, new C5849u.C5851b());
        }

        /* renamed from: b */
        public C5847t mo20353a() {
            C5847t tVar = new C5847t(this.f28956a, this.f28957b.mo20353a());
            C5840p0 p0Var = this.f28958c;
            if (p0Var != null) {
                tVar.mo6818n(p0Var);
            }
            return tVar;
        }

        public C5848a(Context context, C5828l.C5829a aVar) {
            this.f28956a = context.getApplicationContext();
            this.f28957b = aVar;
        }
    }

    public C5847t(Context context, C5828l lVar) {
        this.f28945a = context.getApplicationContext();
        this.f28947c = (C5828l) C5917a.m34872e(lVar);
    }

    /* renamed from: q */
    private void m34683q(C5828l lVar) {
        for (int i = 0; i < this.f28946b.size(); i++) {
            lVar.mo6818n(this.f28946b.get(i));
        }
    }

    /* renamed from: r */
    private C5828l m34684r() {
        if (this.f28949e == null) {
            C5792c cVar = new C5792c(this.f28945a);
            this.f28949e = cVar;
            m34683q(cVar);
        }
        return this.f28949e;
    }

    /* renamed from: s */
    private C5828l m34685s() {
        if (this.f28950f == null) {
            C5808h hVar = new C5808h(this.f28945a);
            this.f28950f = hVar;
            m34683q(hVar);
        }
        return this.f28950f;
    }

    /* renamed from: t */
    private C5828l m34686t() {
        if (this.f28953i == null) {
            C5822j jVar = new C5822j();
            this.f28953i = jVar;
            m34683q(jVar);
        }
        return this.f28953i;
    }

    /* renamed from: u */
    private C5828l m34687u() {
        if (this.f28948d == null) {
            C5854y yVar = new C5854y();
            this.f28948d = yVar;
            m34683q(yVar);
        }
        return this.f28948d;
    }

    /* renamed from: v */
    private C5828l m34688v() {
        if (this.f28954j == null) {
            C5826k0 k0Var = new C5826k0(this.f28945a);
            this.f28954j = k0Var;
            m34683q(k0Var);
        }
        return this.f28954j;
    }

    /* renamed from: w */
    private C5828l m34689w() {
        if (this.f28951g == null) {
            try {
                C5828l lVar = (C5828l) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f28951g = lVar;
                m34683q(lVar);
            } catch (ClassNotFoundException unused) {
                C5961r.m35215i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f28951g == null) {
                this.f28951g = this.f28947c;
            }
        }
        return this.f28951g;
    }

    /* renamed from: x */
    private C5828l m34690x() {
        if (this.f28952h == null) {
            C5842q0 q0Var = new C5842q0();
            this.f28952h = q0Var;
            m34683q(q0Var);
        }
        return this.f28952h;
    }

    /* renamed from: y */
    private void m34691y(C5828l lVar, C5840p0 p0Var) {
        if (lVar != null) {
            lVar.mo6818n(p0Var);
        }
    }

    public void close() throws IOException {
        C5828l lVar = this.f28955k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f28955k = null;
            }
        }
    }

    /* renamed from: i */
    public Map<String, List<String>> mo6816i() {
        C5828l lVar = this.f28955k;
        return lVar == null ? Collections.emptyMap() : lVar.mo6816i();
    }

    /* renamed from: m */
    public Uri mo6817m() {
        C5828l lVar = this.f28955k;
        if (lVar == null) {
            return null;
        }
        return lVar.mo6817m();
    }

    /* renamed from: n */
    public void mo6818n(C5840p0 p0Var) {
        C5917a.m34872e(p0Var);
        this.f28947c.mo6818n(p0Var);
        this.f28946b.add(p0Var);
        m34691y(this.f28948d, p0Var);
        m34691y(this.f28949e, p0Var);
        m34691y(this.f28950f, p0Var);
        m34691y(this.f28951g, p0Var);
        m34691y(this.f28952h, p0Var);
        m34691y(this.f28953i, p0Var);
        m34691y(this.f28954j, p0Var);
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws IOException {
        C5917a.m34873f(this.f28955k == null);
        String scheme = pVar.f28881a.getScheme();
        if (C5953m0.m35163v0(pVar.f28881a)) {
            String path = pVar.f28881a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f28955k = m34687u();
            } else {
                this.f28955k = m34684r();
            }
        } else if ("asset".equals(scheme)) {
            this.f28955k = m34684r();
        } else if ("content".equals(scheme)) {
            this.f28955k = m34685s();
        } else if ("rtmp".equals(scheme)) {
            this.f28955k = m34689w();
        } else if ("udp".equals(scheme)) {
            this.f28955k = m34690x();
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            this.f28955k = m34686t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f28955k = m34688v();
        } else {
            this.f28955k = this.f28947c;
        }
        return this.f28955k.mo6819o(pVar);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((C5828l) C5917a.m34872e(this.f28955k)).read(bArr, i, i2);
    }
}
