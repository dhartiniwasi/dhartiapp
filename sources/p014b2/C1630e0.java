package p014b2;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import p014b2.C1658s;
import p014b2.C1660t;
import p021c2.C1848g;
import p021c2.C1852i;
import p120q2.C5376l;
import p120q2.C5381n;
import p120q2.C5382o;
import p120q2.C5385q;
import p120q2.C5386v;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5965t;
import p161w3.C5966u;
import p161w3.C5967v;
import p177z1.C6211d3;
import p177z1.C6217e3;
import p177z1.C6264q;
import p177z1.C6272r1;
import p177z1.C6279s1;
import p177z1.C6280t2;
import p190b7.C6685q;

/* renamed from: b2.e0 */
/* compiled from: MediaCodecAudioRenderer */
public class C1630e0 extends C5382o implements C5965t {

    /* renamed from: V0 */
    private final Context f4667V0;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public final C1658s.C1659a f4668W0;

    /* renamed from: X0 */
    private final C1660t f4669X0;

    /* renamed from: Y0 */
    private int f4670Y0;

    /* renamed from: Z0 */
    private boolean f4671Z0;

    /* renamed from: a1 */
    private C6272r1 f4672a1;

    /* renamed from: b1 */
    private long f4673b1;

    /* renamed from: c1 */
    private boolean f4674c1;

    /* renamed from: d1 */
    private boolean f4675d1;

    /* renamed from: e1 */
    private boolean f4676e1;

    /* renamed from: f1 */
    private boolean f4677f1;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public C6211d3.C6212a f4678g1;

    /* renamed from: b2.e0$b */
    /* compiled from: MediaCodecAudioRenderer */
    private final class C1632b implements C1660t.C1663c {
        private C1632b() {
        }

        /* renamed from: a */
        public void mo6498a(long j) {
            C1630e0.this.f4668W0.mo6558B(j);
        }

        /* renamed from: b */
        public void mo6499b(boolean z) {
            C1630e0.this.f4668W0.mo6559C(z);
        }

        /* renamed from: c */
        public void mo6500c(Exception exc) {
            C5961r.m35210d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C1630e0.this.f4668W0.mo6562l(exc);
        }

        /* renamed from: d */
        public void mo6501d() {
            if (C1630e0.this.f4678g1 != null) {
                C1630e0.this.f4678g1.mo21236a();
            }
        }

        /* renamed from: e */
        public void mo6502e(int i, long j, long j2) {
            C1630e0.this.f4668W0.mo6560D(i, j, j2);
        }

        /* renamed from: f */
        public void mo6503f() {
            C1630e0.this.mo6496w1();
        }

        /* renamed from: g */
        public void mo6504g() {
            if (C1630e0.this.f4678g1 != null) {
                C1630e0.this.f4678g1.mo21237b();
            }
        }
    }

    public C1630e0(Context context, C5376l.C5378b bVar, C5385q qVar, boolean z, Handler handler, C1658s sVar, C1660t tVar) {
        super(1, bVar, qVar, z, 44100.0f);
        this.f4667V0 = context.getApplicationContext();
        this.f4669X0 = tVar;
        this.f4668W0 = new C1658s.C1659a(handler, sVar);
        tVar.mo6583o(new C1632b());
    }

    /* renamed from: q1 */
    private static boolean m7462q1(String str) {
        if (C5953m0.f29110a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C5953m0.f29112c)) {
            String str2 = C5953m0.f29111b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r1 */
    private static boolean m7463r1() {
        if (C5953m0.f29110a == 23) {
            String str = C5953m0.f29113d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s1 */
    private int m7464s1(C5381n nVar, C6272r1 r1Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(nVar.f27515a) || (i = C5953m0.f29110a) >= 24 || (i == 23 && C5953m0.m35165w0(this.f4667V0))) {
            return r1Var.f30244u;
        }
        return -1;
    }

    /* renamed from: u1 */
    private static List<C5381n> m7465u1(C5385q qVar, C6272r1 r1Var, boolean z, C1660t tVar) throws C5386v.C5389c {
        C5381n v;
        String str = r1Var.f30243t;
        if (str == null) {
            return C6685q.m38445x();
        }
        if (tVar.mo6569a(r1Var) && (v = C5386v.m33093v()) != null) {
            return C6685q.m38446y(v);
        }
        List<C5381n> a = qVar.mo19512a(str, z, false);
        String m = C5386v.m33084m(r1Var);
        if (m == null) {
            return C6685q.m38443t(a);
        }
        return C6685q.m38441r().mo22546g(a).mo22546g(qVar.mo19512a(m, z, false)).mo22547h();
    }

    /* renamed from: x1 */
    private void m7466x1() {
        long l = this.f4669X0.mo6580l(mo6484d());
        if (l != Long.MIN_VALUE) {
            if (!this.f4675d1) {
                l = Math.max(this.f4673b1, l);
            }
            this.f4673b1 = l;
            this.f4675d1 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        this.f4676e1 = true;
        try {
            this.f4669X0.flush();
            try {
                super.mo6466G();
            } finally {
                this.f4668W0.mo6565o(this.f27560Q0);
            }
        } catch (Throwable th) {
            super.mo6466G();
            throw th;
        } finally {
            this.f4668W0.mo6565o(this.f27560Q0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo6467H(boolean z, boolean z2) throws C6264q {
        super.mo6467H(z, z2);
        this.f4668W0.mo6566p(this.f27560Q0);
        if (mo21288A().f29959a) {
            this.f4669X0.mo6586q();
        } else {
            this.f4669X0.mo6581m();
        }
        this.f4669X0.mo6578j(mo21291D());
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) throws C6264q {
        super.mo6468I(j, z);
        if (this.f4677f1) {
            this.f4669X0.mo6592u();
        } else {
            this.f4669X0.flush();
        }
        this.f4673b1 = j;
        this.f4674c1 = true;
        this.f4675d1 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo6469I0(Exception exc) {
        C5961r.m35210d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f4668W0.mo6561k(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo6470J() {
        try {
            super.mo6470J();
        } finally {
            if (this.f4676e1) {
                this.f4676e1 = false;
                this.f4669X0.reset();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo6471J0(String str, C5376l.C5377a aVar, long j, long j2) {
        this.f4668W0.mo6563m(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6472K() {
        super.mo6472K();
        this.f4669X0.mo6568E0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo6473K0(String str) {
        this.f4668W0.mo6564n(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6474L() {
        m7466x1();
        this.f4669X0.pause();
        super.mo6474L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C1852i mo6475L0(C6279s1 s1Var) throws C6264q {
        C1852i L0 = super.mo6475L0(s1Var);
        this.f4668W0.mo6567q(s1Var.f30328b, L0);
        return L0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo6476M0(C6272r1 r1Var, MediaFormat mediaFormat) throws C6264q {
        int i;
        int i2;
        C6272r1 r1Var2 = this.f4672a1;
        int[] iArr = null;
        if (r1Var2 != null) {
            r1Var = r1Var2;
        } else if (mo19505o0() != null) {
            if ("audio/raw".equals(r1Var.f30243t)) {
                i = r1Var.f30226I;
            } else if (C5953m0.f29110a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? C5953m0.m35123b0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            C6272r1 E = new C6272r1.C6274b().mo21517e0("audio/raw").mo21511Y(i).mo21500N(r1Var.f30227J).mo21501O(r1Var.f30228K).mo21494H(mediaFormat.getInteger("channel-count")).mo21518f0(mediaFormat.getInteger("sample-rate")).mo21491E();
            if (this.f4671Z0 && E.f30224G == 6 && (i2 = r1Var.f30224G) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < r1Var.f30224G; i3++) {
                    iArr[i3] = i3;
                }
            }
            r1Var = E;
        }
        try {
            this.f4669X0.mo6587r(r1Var, 0, iArr);
        } catch (C1660t.C1661a e) {
            throw mo21296y(e, e.f4789a, 5001);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo6477O0() {
        super.mo6477O0();
        this.f4669X0.mo6584p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo6478P0(C1848g gVar) {
        if (this.f4674c1 && !gVar.mo7033r()) {
            if (Math.abs(gVar.f5432e - this.f4673b1) > 500000) {
                this.f4673b1 = gVar.f5432e;
            }
            this.f4674c1 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public boolean mo6479R0(long j, long j2, C5376l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6272r1 r1Var) throws C6264q {
        C5917a.m34872e(byteBuffer);
        if (this.f4672a1 != null && (i2 & 2) != 0) {
            ((C5376l) C5917a.m34872e(lVar)).mo19440j(i, false);
            return true;
        } else if (z) {
            if (lVar != null) {
                lVar.mo19440j(i, false);
            }
            this.f27560Q0.f5422f += i3;
            this.f4669X0.mo6584p();
            return true;
        } else {
            try {
                if (!this.f4669X0.mo6591t(byteBuffer, j3, i3)) {
                    return false;
                }
                if (lVar != null) {
                    lVar.mo19440j(i, false);
                }
                this.f27560Q0.f5421e += i3;
                return true;
            } catch (C1660t.C1662b e) {
                throw mo21297z(e, e.f4792c, e.f4791b, 5001);
            } catch (C1660t.C1665e e2) {
                throw mo21297z(e2, r1Var, e2.f4796b, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C1852i mo6480S(C5381n nVar, C6272r1 r1Var, C6272r1 r1Var2) {
        int i;
        C1852i e = nVar.mo19481e(r1Var, r1Var2);
        int i2 = e.f5444e;
        if (m7464s1(nVar, r1Var2) > this.f4670Y0) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = nVar.f27515a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = e.f5443d;
        }
        return new C1852i(str, r1Var, r1Var2, i, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo6481W0() throws C6264q {
        try {
            this.f4669X0.mo6576h();
        } catch (C1660t.C1665e e) {
            throw mo21297z(e, e.f4797c, e.f4796b, 5002);
        }
    }

    /* renamed from: b */
    public String mo6482b() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: c */
    public void mo6483c(C6280t2 t2Var) {
        this.f4669X0.mo6570c(t2Var);
    }

    /* renamed from: d */
    public boolean mo6484d() {
        return super.mo6484d() && this.f4669X0.mo6571d();
    }

    /* renamed from: e */
    public C6280t2 mo6485e() {
        return this.f4669X0.mo6572e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public boolean mo6486i1(C6272r1 r1Var) {
        return this.f4669X0.mo6569a(r1Var);
    }

    public boolean isReady() {
        return this.f4669X0.mo6577i() || super.isReady();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public int mo6488j1(C5385q qVar, C6272r1 r1Var) throws C5386v.C5389c {
        boolean z;
        int i = 0;
        if (!C5967v.m35251o(r1Var.f30243t)) {
            return C6217e3.m36424a(0);
        }
        int i2 = C5953m0.f29110a >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = r1Var.f30230M != 0;
        boolean k1 = C5382o.m32995k1(r1Var);
        int i3 = 8;
        int i4 = 4;
        if (k1 && this.f4669X0.mo6569a(r1Var) && (!z3 || C5386v.m33093v() != null)) {
            return C6217e3.m36425b(4, 8, i2);
        }
        if ("audio/raw".equals(r1Var.f30243t) && !this.f4669X0.mo6569a(r1Var)) {
            return C6217e3.m36424a(1);
        }
        if (!this.f4669X0.mo6569a(C5953m0.m35125c0(2, r1Var.f30224G, r1Var.f30225H))) {
            return C6217e3.m36424a(1);
        }
        List<C5381n> u1 = m7465u1(qVar, r1Var, false, this.f4669X0);
        if (u1.isEmpty()) {
            return C6217e3.m36424a(1);
        }
        if (!k1) {
            return C6217e3.m36424a(2);
        }
        C5381n nVar = u1.get(0);
        boolean m = nVar.mo19485m(r1Var);
        if (!m) {
            int i5 = 1;
            while (true) {
                if (i5 >= u1.size()) {
                    break;
                }
                C5381n nVar2 = u1.get(i5);
                if (nVar2.mo19485m(r1Var)) {
                    nVar = nVar2;
                    z = false;
                    break;
                }
                i5++;
            }
        }
        z2 = m;
        z = true;
        if (!z2) {
            i4 = 3;
        }
        if (z2 && nVar.mo19487p(r1Var)) {
            i3 = 16;
        }
        int i6 = nVar.f27522h ? 64 : 0;
        if (z) {
            i = 128;
        }
        return C6217e3.m36426c(i4, i3, i2, i6, i);
    }

    /* renamed from: l */
    public long mo6489l() {
        if (getState() == 2) {
            m7466x1();
        }
        return this.f4673b1;
    }

    /* renamed from: r */
    public void mo6490r(int i, Object obj) throws C6264q {
        if (i == 2) {
            this.f4669X0.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f4669X0.mo6589s((C1624e) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f4669X0.mo6573f(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f4669X0.mo6579k(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f4678g1 = (C6211d3.C6212a) obj;
                    return;
                default:
                    super.mo6490r(i, obj);
                    return;
            }
        } else {
            this.f4669X0.mo6575g((C1670w) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public float mo6491r0(float f, C6272r1 r1Var, C6272r1[] r1VarArr) {
        int i = -1;
        for (C6272r1 r1Var2 : r1VarArr) {
            int i2 = r1Var2.f30225H;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public List<C5381n> mo6492t0(C5385q qVar, C6272r1 r1Var, boolean z) throws C5386v.C5389c {
        return C5386v.m33092u(m7465u1(qVar, r1Var, z, this.f4669X0), r1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public int mo6493t1(C5381n nVar, C6272r1 r1Var, C6272r1[] r1VarArr) {
        int s1 = m7464s1(nVar, r1Var);
        if (r1VarArr.length == 1) {
            return s1;
        }
        for (C6272r1 r1Var2 : r1VarArr) {
            if (nVar.mo19481e(r1Var, r1Var2).f5443d != 0) {
                s1 = Math.max(s1, m7464s1(nVar, r1Var2));
            }
        }
        return s1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public C5376l.C5377a mo6494v0(C5381n nVar, C6272r1 r1Var, MediaCrypto mediaCrypto, float f) {
        this.f4670Y0 = mo6493t1(nVar, r1Var, mo21292E());
        this.f4671Z0 = m7462q1(nVar.f27515a);
        MediaFormat v1 = mo6495v1(r1Var, nVar.f27517c, this.f4670Y0, f);
        this.f4672a1 = "audio/raw".equals(nVar.f27516b) && !"audio/raw".equals(r1Var.f30243t) ? r1Var : null;
        return C5376l.C5377a.m32926a(nVar, v1, r1Var, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public MediaFormat mo6495v1(C6272r1 r1Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", r1Var.f30224G);
        mediaFormat.setInteger("sample-rate", r1Var.f30225H);
        C5966u.m35236e(mediaFormat, r1Var.f30245v);
        C5966u.m35235d(mediaFormat, "max-input-size", i);
        int i2 = C5953m0.f29110a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m7463r1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(r1Var.f30243t)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f4669X0.mo6582n(C5953m0.m35125c0(4, r1Var.f30224G, r1Var.f30225H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i2 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo6496w1() {
        this.f4675d1 = true;
    }

    /* renamed from: x */
    public C5965t mo6497x() {
        return this;
    }
}
