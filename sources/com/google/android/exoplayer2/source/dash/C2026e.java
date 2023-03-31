package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p015b3.C1743p0;
import p031d3.C4060f;
import p037e2.C4198d0;
import p037e2.C4200e0;
import p045f3.C4257c;
import p127r2.C5432a;
import p127r2.C5439e;
import p141t2.C5507a;
import p141t2.C5509b;
import p155v3.C5789b;
import p155v3.C5819i;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: com.google.android.exoplayer2.source.dash.e */
/* compiled from: PlayerEmsgHandler */
public final class C2026e implements Handler.Callback {

    /* renamed from: a */
    private final C5789b f5850a;

    /* renamed from: b */
    private final C2028b f5851b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5509b f5852c = new C5509b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Handler f5853d = C5953m0.m35166x(this);

    /* renamed from: e */
    private final TreeMap<Long, Long> f5854e = new TreeMap<>();

    /* renamed from: f */
    private C4257c f5855f;

    /* renamed from: g */
    private long f5856g;

    /* renamed from: h */
    private boolean f5857h;

    /* renamed from: i */
    private boolean f5858i;

    /* renamed from: r */
    private boolean f5859r;

    /* renamed from: com.google.android.exoplayer2.source.dash.e$a */
    /* compiled from: PlayerEmsgHandler */
    private static final class C2027a {

        /* renamed from: a */
        public final long f5860a;

        /* renamed from: b */
        public final long f5861b;

        public C2027a(long j, long j2) {
            this.f5860a = j;
            this.f5861b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$b */
    /* compiled from: PlayerEmsgHandler */
    public interface C2028b {
        /* renamed from: a */
        void mo7734a();

        /* renamed from: b */
        void mo7735b(long j);
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$c */
    /* compiled from: PlayerEmsgHandler */
    public final class C2029c implements C4200e0 {

        /* renamed from: a */
        private final C1743p0 f5862a;

        /* renamed from: b */
        private final C6279s1 f5863b = new C6279s1();

        /* renamed from: c */
        private final C5439e f5864c = new C5439e();

        /* renamed from: d */
        private long f5865d = -9223372036854775807L;

        C2029c(C5789b bVar) {
            this.f5862a = C1743p0.m8192l(bVar);
        }

        /* renamed from: g */
        private C5439e m8910g() {
            this.f5864c.mo7029n();
            if (this.f5862a.mo6832S(this.f5863b, this.f5864c, 0, false) != -4) {
                return null;
            }
            this.f5864c.mo7051y();
            return this.f5864c;
        }

        /* renamed from: k */
        private void m8911k(long j, long j2) {
            C2026e.this.f5853d.sendMessage(C2026e.this.f5853d.obtainMessage(1, new C2027a(j, j2)));
        }

        /* renamed from: l */
        private void m8912l() {
            while (this.f5862a.mo6828K(false)) {
                C5439e g = m8910g();
                if (g != null) {
                    long j = g.f5432e;
                    C5432a a = C2026e.this.f5852c.mo19706a(g);
                    if (a != null) {
                        C5507a aVar = (C5507a) a.mo19695c(0);
                        if (C2026e.m8898h(aVar.f27979a, aVar.f27980b)) {
                            m8913m(j, aVar);
                        }
                    }
                }
            }
            this.f5862a.mo6853s();
        }

        /* renamed from: m */
        private void m8913m(long j, C5507a aVar) {
            long c = C2026e.m8896f(aVar);
            if (c != -9223372036854775807L) {
                m8911k(j, c);
            }
        }

        /* renamed from: a */
        public void mo6838a(long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
            this.f5862a.mo6838a(j, i, i2, i3, aVar);
            m8912l();
        }

        /* renamed from: b */
        public /* synthetic */ int mo6840b(C5819i iVar, int i, boolean z) {
            return C4198d0.m28382a(this, iVar, i, z);
        }

        /* renamed from: c */
        public int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException {
            return this.f5862a.mo6840b(iVar, i, z);
        }

        /* renamed from: d */
        public /* synthetic */ void mo6843d(C5918a0 a0Var, int i) {
            C4198d0.m28383b(this, a0Var, i);
        }

        /* renamed from: e */
        public void mo6845e(C6272r1 r1Var) {
            this.f5862a.mo6845e(r1Var);
        }

        /* renamed from: f */
        public void mo6847f(C5918a0 a0Var, int i, int i2) {
            this.f5862a.mo6843d(a0Var, i);
        }

        /* renamed from: h */
        public boolean mo7786h(long j) {
            return C2026e.this.mo7780j(j);
        }

        /* renamed from: i */
        public void mo7787i(C4060f fVar) {
            long j = this.f5865d;
            if (j == -9223372036854775807L || fVar.f23169h > j) {
                this.f5865d = fVar.f23169h;
            }
            C2026e.this.mo7782m(fVar);
        }

        /* renamed from: j */
        public boolean mo7788j(C4060f fVar) {
            long j = this.f5865d;
            return C2026e.this.mo7783n(j != -9223372036854775807L && j < fVar.f23168g);
        }

        /* renamed from: n */
        public void mo7789n() {
            this.f5862a.mo6833T();
        }
    }

    public C2026e(C4257c cVar, C2028b bVar, C5789b bVar2) {
        this.f5855f = cVar;
        this.f5851b = bVar;
        this.f5850a = bVar2;
    }

    /* renamed from: e */
    private Map.Entry<Long, Long> m8895e(long j) {
        return this.f5854e.ceilingEntry(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static long m8896f(C5507a aVar) {
        try {
            return C5953m0.m35085I0(C5953m0.m35074D(aVar.f27983e));
        } catch (C6249m2 unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: g */
    private void m8897g(long j, long j2) {
        Long l = this.f5854e.get(Long.valueOf(j2));
        if (l == null) {
            this.f5854e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f5854e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m8898h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* renamed from: i */
    private void m8899i() {
        if (this.f5857h) {
            this.f5858i = true;
            this.f5857h = false;
            this.f5851b.mo7734a();
        }
    }

    /* renamed from: l */
    private void m8900l() {
        this.f5851b.mo7735b(this.f5856g);
    }

    /* renamed from: p */
    private void m8901p() {
        Iterator<Map.Entry<Long, Long>> it = this.f5854e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f5855f.f23654h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f5859r) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C2027a aVar = (C2027a) message.obj;
        m8897g(aVar.f5860a, aVar.f5861b);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo7780j(long j) {
        C4257c cVar = this.f5855f;
        boolean z = false;
        if (!cVar.f23650d) {
            return false;
        }
        if (this.f5858i) {
            return true;
        }
        Map.Entry<Long, Long> e = m8895e(cVar.f23654h);
        if (e != null && e.getValue().longValue() < j) {
            this.f5856g = e.getKey().longValue();
            m8900l();
            z = true;
        }
        if (z) {
            m8899i();
        }
        return z;
    }

    /* renamed from: k */
    public C2029c mo7781k() {
        return new C2029c(this.f5850a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7782m(C4060f fVar) {
        this.f5857h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo7783n(boolean z) {
        if (!this.f5855f.f23650d) {
            return false;
        }
        if (this.f5858i) {
            return true;
        }
        if (!z) {
            return false;
        }
        m8899i();
        return true;
    }

    /* renamed from: o */
    public void mo7784o() {
        this.f5859r = true;
        this.f5853d.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: q */
    public void mo7785q(C4257c cVar) {
        this.f5858i = false;
        this.f5856g = -9223372036854775807L;
        this.f5855f = cVar;
        m8901p();
    }
}
