package p030d2;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p004a2.C0079u1;
import p030d2.C4009g;
import p030d2.C4016g0;
import p030d2.C4035m;
import p030d2.C4042o;
import p030d2.C4048w;
import p030d2.C4052y;
import p155v3.C5804g0;
import p155v3.C5853x;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6227i;
import p177z1.C6272r1;
import p190b7.C6678p0;
import p190b7.C6685q;
import p190b7.C6694s;
import p190b7.C6695s0;

/* renamed from: d2.h */
/* compiled from: DefaultDrmSessionManager */
public class C4021h implements C4052y {

    /* renamed from: c */
    private final UUID f23054c;

    /* renamed from: d */
    private final C4016g0.C4019c f23055d;

    /* renamed from: e */
    private final C4041n0 f23056e;

    /* renamed from: f */
    private final HashMap<String, String> f23057f;

    /* renamed from: g */
    private final boolean f23058g;

    /* renamed from: h */
    private final int[] f23059h;

    /* renamed from: i */
    private final boolean f23060i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4028g f23061j;

    /* renamed from: k */
    private final C5804g0 f23062k;

    /* renamed from: l */
    private final C4029h f23063l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f23064m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final List<C4009g> f23065n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Set<C4027f> f23066o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Set<C4009g> f23067p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f23068q;

    /* renamed from: r */
    private C4016g0 f23069r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4009g f23070s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C4009g f23071t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Looper f23072u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f23073v;

    /* renamed from: w */
    private int f23074w;

    /* renamed from: x */
    private byte[] f23075x;

    /* renamed from: y */
    private C0079u1 f23076y;

    /* renamed from: z */
    volatile C4025d f23077z;

    /* renamed from: d2.h$b */
    /* compiled from: DefaultDrmSessionManager */
    public static final class C4023b {

        /* renamed from: a */
        private final HashMap<String, String> f23078a = new HashMap<>();

        /* renamed from: b */
        private UUID f23079b = C6227i.f29963d;

        /* renamed from: c */
        private C4016g0.C4019c f23080c = C4031k0.f23099d;

        /* renamed from: d */
        private boolean f23081d;

        /* renamed from: e */
        private int[] f23082e = new int[0];

        /* renamed from: f */
        private boolean f23083f;

        /* renamed from: g */
        private C5804g0 f23084g = new C5853x();

        /* renamed from: h */
        private long f23085h = 300000;

        /* renamed from: a */
        public C4021h mo17213a(C4041n0 n0Var) {
            return new C4021h(this.f23079b, this.f23080c, n0Var, this.f23078a, this.f23081d, this.f23082e, this.f23083f, this.f23084g, this.f23085h);
        }

        /* renamed from: b */
        public C4023b mo17214b(boolean z) {
            this.f23081d = z;
            return this;
        }

        /* renamed from: c */
        public C4023b mo17215c(boolean z) {
            this.f23083f = z;
            return this;
        }

        /* renamed from: d */
        public C4023b mo17216d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (!(i == 2 || i == 1)) {
                    z = false;
                }
                C5917a.m34868a(z);
            }
            this.f23082e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: e */
        public C4023b mo17217e(UUID uuid, C4016g0.C4019c cVar) {
            this.f23079b = (UUID) C5917a.m34872e(uuid);
            this.f23080c = (C4016g0.C4019c) C5917a.m34872e(cVar);
            return this;
        }
    }

    /* renamed from: d2.h$c */
    /* compiled from: DefaultDrmSessionManager */
    private class C4024c implements C4016g0.C4018b {
        private C4024c() {
        }

        /* renamed from: a */
        public void mo17202a(C4016g0 g0Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((C4025d) C5917a.m34872e(C4021h.this.f23077z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* renamed from: d2.h$d */
    /* compiled from: DefaultDrmSessionManager */
    private class C4025d extends Handler {
        public C4025d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C4009g gVar : C4021h.this.f23065n) {
                    if (gVar.mo17188q(bArr)) {
                        gVar.mo17189y(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d2.h$e */
    /* compiled from: DefaultDrmSessionManager */
    public static final class C4026e extends Exception {
        private C4026e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: d2.h$f */
    /* compiled from: DefaultDrmSessionManager */
    private class C4027f implements C4052y.C4054b {

        /* renamed from: b */
        private final C4048w.C4049a f23088b;

        /* renamed from: c */
        private C4042o f23089c;

        /* renamed from: d */
        private boolean f23090d;

        public C4027f(C4048w.C4049a aVar) {
            this.f23088b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m27774e(C6272r1 r1Var) {
            if (C4021h.this.f23068q != 0 && !this.f23090d) {
                C4021h hVar = C4021h.this;
                this.f23089c = hVar.m27752t((Looper) C5917a.m34872e(hVar.f23072u), this.f23088b, r1Var, false);
                C4021h.this.f23066o.add(this);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m27775f() {
            if (!this.f23090d) {
                C4042o oVar = this.f23089c;
                if (oVar != null) {
                    oVar.mo17177a(this.f23088b);
                }
                C4021h.this.f23066o.remove(this);
                this.f23090d = true;
            }
        }

        /* renamed from: a */
        public void mo17219a() {
            C5953m0.m35089K0((Handler) C5917a.m34872e(C4021h.this.f23073v), new C9852i(this));
        }

        /* renamed from: d */
        public void mo17220d(C6272r1 r1Var) {
            ((Handler) C5917a.m34872e(C4021h.this.f23073v)).post(new C9854j(this, r1Var));
        }
    }

    /* renamed from: d2.h$g */
    /* compiled from: DefaultDrmSessionManager */
    private class C4028g implements C4009g.C4010a {

        /* renamed from: a */
        private final Set<C4009g> f23092a = new HashSet();

        /* renamed from: b */
        private C4009g f23093b;

        public C4028g(C4021h hVar) {
        }

        /* renamed from: a */
        public void mo17191a(C4009g gVar) {
            this.f23092a.add(gVar);
            if (this.f23093b == null) {
                this.f23093b = gVar;
                gVar.mo17187E();
            }
        }

        /* renamed from: b */
        public void mo17192b(Exception exc, boolean z) {
            this.f23093b = null;
            C6685q<C4009g> t = C6685q.m38443t(this.f23092a);
            this.f23092a.clear();
            C6695s0<C4009g> l = t.iterator();
            while (l.hasNext()) {
                l.next().mo17186A(exc, z);
            }
        }

        /* renamed from: c */
        public void mo17193c() {
            this.f23093b = null;
            C6685q<C4009g> t = C6685q.m38443t(this.f23092a);
            this.f23092a.clear();
            C6695s0<C4009g> l = t.iterator();
            while (l.hasNext()) {
                l.next().mo17190z();
            }
        }

        /* renamed from: d */
        public void mo17221d(C4009g gVar) {
            this.f23092a.remove(gVar);
            if (this.f23093b == gVar) {
                this.f23093b = null;
                if (!this.f23092a.isEmpty()) {
                    C4009g next = this.f23092a.iterator().next();
                    this.f23093b = next;
                    next.mo17187E();
                }
            }
        }
    }

    /* renamed from: d2.h$h */
    /* compiled from: DefaultDrmSessionManager */
    private class C4029h implements C4009g.C4011b {
        private C4029h() {
        }

        /* renamed from: a */
        public void mo17194a(C4009g gVar, int i) {
            if (C4021h.this.f23064m != -9223372036854775807L) {
                C4021h.this.f23067p.remove(gVar);
                ((Handler) C5917a.m34872e(C4021h.this.f23073v)).removeCallbacksAndMessages(gVar);
            }
        }

        /* renamed from: b */
        public void mo17195b(C4009g gVar, int i) {
            if (i == 1 && C4021h.this.f23068q > 0 && C4021h.this.f23064m != -9223372036854775807L) {
                C4021h.this.f23067p.add(gVar);
                ((Handler) C5917a.m34872e(C4021h.this.f23073v)).postAtTime(new C9856k(gVar), gVar, SystemClock.uptimeMillis() + C4021h.this.f23064m);
            } else if (i == 0) {
                C4021h.this.f23065n.remove(gVar);
                if (C4021h.this.f23070s == gVar) {
                    C4009g unused = C4021h.this.f23070s = null;
                }
                if (C4021h.this.f23071t == gVar) {
                    C4009g unused2 = C4021h.this.f23071t = null;
                }
                C4021h.this.f23061j.mo17221d(gVar);
                if (C4021h.this.f23064m != -9223372036854775807L) {
                    ((Handler) C5917a.m34872e(C4021h.this.f23073v)).removeCallbacksAndMessages(gVar);
                    C4021h.this.f23067p.remove(gVar);
                }
            }
            C4021h.this.m27734C();
        }
    }

    /* renamed from: A */
    private C4042o m27732A(int i, boolean z) {
        C4016g0 g0Var = (C4016g0) C5917a.m34872e(this.f23069r);
        if ((g0Var.mo17175m() == 2 && C4030h0.f23095d) || C5953m0.m35169y0(this.f23059h, i) == -1 || g0Var.mo17175m() == 1) {
            return null;
        }
        C4009g gVar = this.f23070s;
        if (gVar == null) {
            C4009g x = m27756x(C6685q.m38445x(), true, (C4048w.C4049a) null, z);
            this.f23065n.add(x);
            this.f23070s = x;
        } else {
            gVar.mo17179c((C4048w.C4049a) null);
        }
        return this.f23070s;
    }

    /* renamed from: B */
    private void m27733B(Looper looper) {
        if (this.f23077z == null) {
            this.f23077z = new C4025d(looper);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m27734C() {
        if (this.f23069r != null && this.f23068q == 0 && this.f23065n.isEmpty() && this.f23066o.isEmpty()) {
            ((C4016g0) C5917a.m34872e(this.f23069r)).mo17163a();
            this.f23069r = null;
        }
    }

    /* renamed from: D */
    private void m27735D() {
        C6695s0<C4009g> l = C6694s.m38493r(this.f23067p).iterator();
        while (l.hasNext()) {
            l.next().mo17177a((C4048w.C4049a) null);
        }
    }

    /* renamed from: E */
    private void m27736E() {
        C6695s0<C4027f> l = C6694s.m38493r(this.f23066o).iterator();
        while (l.hasNext()) {
            l.next().mo17219a();
        }
    }

    /* renamed from: G */
    private void m27737G(C4042o oVar, C4048w.C4049a aVar) {
        oVar.mo17177a(aVar);
        if (this.f23064m != -9223372036854775807L) {
            oVar.mo17177a((C4048w.C4049a) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public C4042o m27752t(Looper looper, C4048w.C4049a aVar, C6272r1 r1Var, boolean z) {
        List<C4035m.C4037b> list;
        m27733B(looper);
        C4035m mVar = r1Var.f30246w;
        if (mVar == null) {
            return m27732A(C5967v.m35247k(r1Var.f30243t), z);
        }
        C4009g gVar = null;
        if (this.f23075x == null) {
            list = m27757y((C4035m) C5917a.m34872e(mVar), this.f23054c, false);
            if (list.isEmpty()) {
                C4026e eVar = new C4026e(this.f23054c);
                C5961r.m35210d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.mo17257l(eVar);
                }
                return new C4007e0(new C4042o.C4043a(eVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            list = null;
        }
        if (this.f23058g) {
            Iterator<C4009g> it = this.f23065n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4009g next = it.next();
                if (C5953m0.m35124c(next.f23017a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f23071t;
        }
        if (gVar == null) {
            gVar = m27756x(list, false, aVar, z);
            if (!this.f23058g) {
                this.f23071t = gVar;
            }
            this.f23065n.add(gVar);
        } else {
            gVar.mo17179c(aVar);
        }
        return gVar;
    }

    /* renamed from: u */
    private static boolean m27753u(C4042o oVar) {
        if (oVar.getState() != 1 || (C5953m0.f29110a >= 19 && !(((C4042o.C4043a) C5917a.m34872e(oVar.mo17183g())).getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m27754v(C4035m mVar) {
        if (this.f23075x != null) {
            return true;
        }
        if (m27757y(mVar, this.f23054c, true).isEmpty()) {
            if (mVar.f23115d != 1 || !mVar.mo17231e(0).mo17243d(C6227i.f29961b)) {
                return false;
            }
            C5961r.m35215i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f23054c);
        }
        String str = mVar.f23114c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            if (C5953m0.f29110a >= 25) {
                return true;
            }
            return false;
        } else if ("cbc1".equals(str) || "cens".equals(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: w */
    private C4009g m27755w(List<C4035m.C4037b> list, boolean z, C4048w.C4049a aVar) {
        C5917a.m34872e(this.f23069r);
        List<C4035m.C4037b> list2 = list;
        C4009g gVar = new C4009g(this.f23054c, this.f23069r, this.f23061j, this.f23063l, list2, this.f23074w, this.f23060i | z, z, this.f23075x, this.f23057f, this.f23056e, (Looper) C5917a.m34872e(this.f23072u), this.f23062k, (C0079u1) C5917a.m34872e(this.f23076y));
        gVar.mo17179c(aVar);
        if (this.f23064m != -9223372036854775807L) {
            gVar.mo17179c((C4048w.C4049a) null);
        }
        return gVar;
    }

    /* renamed from: x */
    private C4009g m27756x(List<C4035m.C4037b> list, boolean z, C4048w.C4049a aVar, boolean z2) {
        C4009g w = m27755w(list, z, aVar);
        if (m27753u(w) && !this.f23067p.isEmpty()) {
            m27735D();
            m27737G(w, aVar);
            w = m27755w(list, z, aVar);
        }
        if (!m27753u(w) || !z2 || this.f23066o.isEmpty()) {
            return w;
        }
        m27736E();
        if (!this.f23067p.isEmpty()) {
            m27735D();
        }
        m27737G(w, aVar);
        return m27755w(list, z, aVar);
    }

    /* renamed from: y */
    private static List<C4035m.C4037b> m27757y(C4035m mVar, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(mVar.f23115d);
        for (int i = 0; i < mVar.f23115d; i++) {
            C4035m.C4037b e = mVar.mo17231e(i);
            if ((e.mo17243d(uuid) || (C6227i.f29962c.equals(uuid) && e.mo17243d(C6227i.f29961b))) && (e.f23120e != null || z)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private synchronized void m27758z(Looper looper) {
        Looper looper2 = this.f23072u;
        if (looper2 == null) {
            this.f23072u = looper;
            this.f23073v = new Handler(looper);
        } else {
            C5917a.m34873f(looper2 == looper);
            C5917a.m34872e(this.f23073v);
        }
    }

    /* renamed from: F */
    public void mo17206F(int i, byte[] bArr) {
        C5917a.m34873f(this.f23065n.isEmpty());
        if (i == 1 || i == 3) {
            C5917a.m34872e(bArr);
        }
        this.f23074w = i;
        this.f23075x = bArr;
    }

    /* renamed from: H */
    public final void mo17207H() {
        int i = this.f23068q;
        this.f23068q = i + 1;
        if (i == 0) {
            if (this.f23069r == null) {
                C4016g0 a = this.f23055d.mo17203a(this.f23054c);
                this.f23069r = a;
                a.mo17176n(new C4024c());
            } else if (this.f23064m != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.f23065n.size(); i2++) {
                    this.f23065n.get(i2).mo17179c((C4048w.C4049a) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo17208a() {
        int i = this.f23068q - 1;
        this.f23068q = i;
        if (i == 0) {
            if (this.f23064m != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f23065n);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C4009g) arrayList.get(i2)).mo17177a((C4048w.C4049a) null);
                }
            }
            m27736E();
            m27734C();
        }
    }

    /* renamed from: b */
    public C4042o mo17209b(C4048w.C4049a aVar, C6272r1 r1Var) {
        C5917a.m34873f(this.f23068q > 0);
        C5917a.m34875h(this.f23072u);
        return m27752t(this.f23072u, aVar, r1Var, true);
    }

    /* renamed from: c */
    public void mo17210c(Looper looper, C0079u1 u1Var) {
        m27758z(looper);
        this.f23076y = u1Var;
    }

    /* renamed from: d */
    public C4052y.C4054b mo17211d(C4048w.C4049a aVar, C6272r1 r1Var) {
        C5917a.m34873f(this.f23068q > 0);
        C5917a.m34875h(this.f23072u);
        C4027f fVar = new C4027f(aVar);
        fVar.mo17220d(r1Var);
        return fVar;
    }

    /* renamed from: e */
    public int mo17212e(C6272r1 r1Var) {
        int m = ((C4016g0) C5917a.m34872e(this.f23069r)).mo17175m();
        C4035m mVar = r1Var.f30246w;
        if (mVar == null) {
            if (C5953m0.m35169y0(this.f23059h, C5967v.m35247k(r1Var.f30243t)) != -1) {
                return m;
            }
            return 0;
        } else if (m27754v(mVar)) {
            return m;
        } else {
            return 1;
        }
    }

    private C4021h(UUID uuid, C4016g0.C4019c cVar, C4041n0 n0Var, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, C5804g0 g0Var, long j) {
        C5917a.m34872e(uuid);
        C5917a.m34869b(!C6227i.f29961b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f23054c = uuid;
        this.f23055d = cVar;
        this.f23056e = n0Var;
        this.f23057f = hashMap;
        this.f23058g = z;
        this.f23059h = iArr;
        this.f23060i = z2;
        this.f23062k = g0Var;
        this.f23061j = new C4028g(this);
        this.f23063l = new C4029h();
        this.f23074w = 0;
        this.f23065n = new ArrayList();
        this.f23066o = C6678p0.m38433h();
        this.f23067p = C6678p0.m38433h();
        this.f23064m = j;
    }
}
