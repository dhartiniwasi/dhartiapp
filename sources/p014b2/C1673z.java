package p014b2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p004a2.C0079u1;
import p014b2.C1616b0;
import p014b2.C1637g;
import p014b2.C1660t;
import p014b2.C1668v;
import p161w3.C5917a;
import p161w3.C5923d;
import p161w3.C5933g;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6272r1;
import p177z1.C6280t2;

/* renamed from: b2.z */
/* compiled from: DefaultAudioSink */
public final class C1673z implements C1660t {

    /* renamed from: c0 */
    public static boolean f4852c0 = false;

    /* renamed from: A */
    private int f4853A;

    /* renamed from: B */
    private long f4854B;

    /* renamed from: C */
    private long f4855C;

    /* renamed from: D */
    private long f4856D;

    /* renamed from: E */
    private long f4857E;

    /* renamed from: F */
    private int f4858F;

    /* renamed from: G */
    private boolean f4859G;

    /* renamed from: H */
    private boolean f4860H;

    /* renamed from: I */
    private long f4861I;

    /* renamed from: J */
    private float f4862J;

    /* renamed from: K */
    private C1637g[] f4863K;

    /* renamed from: L */
    private ByteBuffer[] f4864L;

    /* renamed from: M */
    private ByteBuffer f4865M;

    /* renamed from: N */
    private int f4866N;

    /* renamed from: O */
    private ByteBuffer f4867O;

    /* renamed from: P */
    private byte[] f4868P;

    /* renamed from: Q */
    private int f4869Q;

    /* renamed from: R */
    private int f4870R;

    /* renamed from: S */
    private boolean f4871S;

    /* renamed from: T */
    private boolean f4872T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f4873U;

    /* renamed from: V */
    private boolean f4874V;

    /* renamed from: W */
    private int f4875W;

    /* renamed from: X */
    private C1670w f4876X;

    /* renamed from: Y */
    private boolean f4877Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public long f4878Z;

    /* renamed from: a */
    private final C1633f f4879a;

    /* renamed from: a0 */
    private boolean f4880a0;

    /* renamed from: b */
    private final C1676c f4881b;

    /* renamed from: b0 */
    private boolean f4882b0;

    /* renamed from: c */
    private final boolean f4883c;

    /* renamed from: d */
    private final C1672y f4884d;

    /* renamed from: e */
    private final C1650l0 f4885e;

    /* renamed from: f */
    private final C1637g[] f4886f;

    /* renamed from: g */
    private final C1637g[] f4887g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5933g f4888h;

    /* renamed from: i */
    private final C1668v f4889i;

    /* renamed from: j */
    private final ArrayDeque<C1682i> f4890j;

    /* renamed from: k */
    private final boolean f4891k;

    /* renamed from: l */
    private final int f4892l;

    /* renamed from: m */
    private C1685l f4893m;

    /* renamed from: n */
    private final C1683j<C1660t.C1662b> f4894n;

    /* renamed from: o */
    private final C1683j<C1660t.C1665e> f4895o;

    /* renamed from: p */
    private final C1677d f4896p;

    /* renamed from: q */
    private C0079u1 f4897q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1660t.C1663c f4898r;

    /* renamed from: s */
    private C1679f f4899s;

    /* renamed from: t */
    private C1679f f4900t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public AudioTrack f4901u;

    /* renamed from: v */
    private C1624e f4902v;

    /* renamed from: w */
    private C1682i f4903w;

    /* renamed from: x */
    private C1682i f4904x;

    /* renamed from: y */
    private C6280t2 f4905y;

    /* renamed from: z */
    private ByteBuffer f4906z;

    /* renamed from: b2.z$a */
    /* compiled from: DefaultAudioSink */
    class C1674a extends Thread {

        /* renamed from: a */
        final /* synthetic */ AudioTrack f4907a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1674a(String str, AudioTrack audioTrack) {
            super(str);
            this.f4907a = audioTrack;
        }

        public void run() {
            try {
                this.f4907a.flush();
                this.f4907a.release();
            } finally {
                C1673z.this.f4888h.mo20596e();
            }
        }
    }

    /* renamed from: b2.z$b */
    /* compiled from: DefaultAudioSink */
    private static final class C1675b {
        /* renamed from: a */
        public static void m7792a(AudioTrack audioTrack, C0079u1 u1Var) {
            LogSessionId a = u1Var.mo214a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(a);
            }
        }
    }

    /* renamed from: b2.z$c */
    /* compiled from: DefaultAudioSink */
    public interface C1676c {
        /* renamed from: a */
        long mo6627a(long j);

        /* renamed from: b */
        C6280t2 mo6628b(C6280t2 t2Var);

        /* renamed from: c */
        long mo6629c();

        /* renamed from: d */
        boolean mo6630d(boolean z);

        /* renamed from: e */
        C1637g[] mo6631e();
    }

    /* renamed from: b2.z$d */
    /* compiled from: DefaultAudioSink */
    interface C1677d {

        /* renamed from: a */
        public static final C1677d f4909a = new C1616b0.C1617a().mo6453g();

        /* renamed from: a */
        int mo6448a(int i, int i2, int i3, int i4, int i5, double d);
    }

    /* renamed from: b2.z$e */
    /* compiled from: DefaultAudioSink */
    public static final class C1678e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C1633f f4910a = C1633f.f4680c;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1676c f4911b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f4912c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f4913d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f4914e = 0;

        /* renamed from: f */
        C1677d f4915f = C1677d.f4909a;

        /* renamed from: f */
        public C1673z mo6632f() {
            if (this.f4911b == null) {
                this.f4911b = new C1680g(new C1637g[0]);
            }
            return new C1673z(this, (C1674a) null);
        }

        /* renamed from: g */
        public C1678e mo6633g(C1633f fVar) {
            C5917a.m34872e(fVar);
            this.f4910a = fVar;
            return this;
        }

        /* renamed from: h */
        public C1678e mo6634h(boolean z) {
            this.f4913d = z;
            return this;
        }

        /* renamed from: i */
        public C1678e mo6635i(boolean z) {
            this.f4912c = z;
            return this;
        }

        /* renamed from: j */
        public C1678e mo6636j(int i) {
            this.f4914e = i;
            return this;
        }
    }

    /* renamed from: b2.z$f */
    /* compiled from: DefaultAudioSink */
    private static final class C1679f {

        /* renamed from: a */
        public final C6272r1 f4916a;

        /* renamed from: b */
        public final int f4917b;

        /* renamed from: c */
        public final int f4918c;

        /* renamed from: d */
        public final int f4919d;

        /* renamed from: e */
        public final int f4920e;

        /* renamed from: f */
        public final int f4921f;

        /* renamed from: g */
        public final int f4922g;

        /* renamed from: h */
        public final int f4923h;

        /* renamed from: i */
        public final C1637g[] f4924i;

        public C1679f(C6272r1 r1Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, C1637g[] gVarArr) {
            this.f4916a = r1Var;
            this.f4917b = i;
            this.f4918c = i2;
            this.f4919d = i3;
            this.f4920e = i4;
            this.f4921f = i5;
            this.f4922g = i6;
            this.f4923h = i7;
            this.f4924i = gVarArr;
        }

        /* renamed from: d */
        private AudioTrack m7809d(boolean z, C1624e eVar, int i) {
            int i2 = C5953m0.f29110a;
            if (i2 >= 29) {
                return m7811f(z, eVar, i);
            }
            if (i2 >= 21) {
                return m7810e(z, eVar, i);
            }
            return m7812g(eVar, i);
        }

        /* renamed from: e */
        private AudioTrack m7810e(boolean z, C1624e eVar, int i) {
            return new AudioTrack(m7813i(eVar, z), C1673z.m7735J(this.f4920e, this.f4921f, this.f4922g), this.f4923h, 1, i);
        }

        /* renamed from: f */
        private AudioTrack m7811f(boolean z, C1624e eVar, int i) {
            AudioFormat z2 = C1673z.m7735J(this.f4920e, this.f4921f, this.f4922g);
            AudioAttributes i2 = m7813i(eVar, z);
            boolean z3 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(i2).setAudioFormat(z2).setTransferMode(1).setBufferSizeInBytes(this.f4923h).setSessionId(i);
            if (this.f4918c != 1) {
                z3 = false;
            }
            return sessionId.setOffloadedPlayback(z3).build();
        }

        /* renamed from: g */
        private AudioTrack m7812g(C1624e eVar, int i) {
            int f0 = C5953m0.m35131f0(eVar.f4657c);
            if (i == 0) {
                return new AudioTrack(f0, this.f4920e, this.f4921f, this.f4922g, this.f4923h, 1);
            }
            return new AudioTrack(f0, this.f4920e, this.f4921f, this.f4922g, this.f4923h, 1, i);
        }

        /* renamed from: i */
        private static AudioAttributes m7813i(C1624e eVar, boolean z) {
            if (z) {
                return m7814j();
            }
            return eVar.mo6457b().f4661a;
        }

        /* renamed from: j */
        private static AudioAttributes m7814j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack mo6637a(boolean z, C1624e eVar, int i) throws C1660t.C1662b {
            try {
                AudioTrack d = m7809d(z, eVar, i);
                int state = d.getState();
                if (state == 1) {
                    return d;
                }
                try {
                    d.release();
                } catch (Exception unused) {
                }
                throw new C1660t.C1662b(state, this.f4920e, this.f4921f, this.f4923h, this.f4916a, mo6642l(), (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new C1660t.C1662b(0, this.f4920e, this.f4921f, this.f4923h, this.f4916a, mo6642l(), e);
            }
        }

        /* renamed from: b */
        public boolean mo6638b(C1679f fVar) {
            return fVar.f4918c == this.f4918c && fVar.f4922g == this.f4922g && fVar.f4920e == this.f4920e && fVar.f4921f == this.f4921f && fVar.f4919d == this.f4919d;
        }

        /* renamed from: c */
        public C1679f mo6639c(int i) {
            return new C1679f(this.f4916a, this.f4917b, this.f4918c, this.f4919d, this.f4920e, this.f4921f, this.f4922g, i, this.f4924i);
        }

        /* renamed from: h */
        public long mo6640h(long j) {
            return (j * 1000000) / ((long) this.f4920e);
        }

        /* renamed from: k */
        public long mo6641k(long j) {
            return (j * 1000000) / ((long) this.f4916a.f30225H);
        }

        /* renamed from: l */
        public boolean mo6642l() {
            return this.f4918c == 1;
        }
    }

    /* renamed from: b2.z$g */
    /* compiled from: DefaultAudioSink */
    public static class C1680g implements C1676c {

        /* renamed from: a */
        private final C1637g[] f4925a;

        /* renamed from: b */
        private final C1644i0 f4926b;

        /* renamed from: c */
        private final C1648k0 f4927c;

        public C1680g(C1637g... gVarArr) {
            this(gVarArr, new C1644i0(), new C1648k0());
        }

        /* renamed from: a */
        public long mo6627a(long j) {
            return this.f4927c.mo6534a(j);
        }

        /* renamed from: b */
        public C6280t2 mo6628b(C6280t2 t2Var) {
            this.f4927c.mo6536i(t2Var.f30331a);
            this.f4927c.mo6535c(t2Var.f30332b);
            return t2Var;
        }

        /* renamed from: c */
        public long mo6629c() {
            return this.f4926b.mo6524p();
        }

        /* renamed from: d */
        public boolean mo6630d(boolean z) {
            this.f4926b.mo6525v(z);
            return z;
        }

        /* renamed from: e */
        public C1637g[] mo6631e() {
            return this.f4925a;
        }

        public C1680g(C1637g[] gVarArr, C1644i0 i0Var, C1648k0 k0Var) {
            C1637g[] gVarArr2 = new C1637g[(gVarArr.length + 2)];
            this.f4925a = gVarArr2;
            System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
            this.f4926b = i0Var;
            this.f4927c = k0Var;
            gVarArr2[gVarArr.length] = i0Var;
            gVarArr2[gVarArr.length + 1] = k0Var;
        }
    }

    /* renamed from: b2.z$h */
    /* compiled from: DefaultAudioSink */
    public static final class C1681h extends RuntimeException {
        /* synthetic */ C1681h(String str, C1674a aVar) {
            this(str);
        }

        private C1681h(String str) {
            super(str);
        }
    }

    /* renamed from: b2.z$i */
    /* compiled from: DefaultAudioSink */
    private static final class C1682i {

        /* renamed from: a */
        public final C6280t2 f4928a;

        /* renamed from: b */
        public final boolean f4929b;

        /* renamed from: c */
        public final long f4930c;

        /* renamed from: d */
        public final long f4931d;

        /* synthetic */ C1682i(C6280t2 t2Var, boolean z, long j, long j2, C1674a aVar) {
            this(t2Var, z, j, j2);
        }

        private C1682i(C6280t2 t2Var, boolean z, long j, long j2) {
            this.f4928a = t2Var;
            this.f4929b = z;
            this.f4930c = j;
            this.f4931d = j2;
        }
    }

    /* renamed from: b2.z$j */
    /* compiled from: DefaultAudioSink */
    private static final class C1683j<T extends Exception> {

        /* renamed from: a */
        private final long f4932a;

        /* renamed from: b */
        private T f4933b;

        /* renamed from: c */
        private long f4934c;

        public C1683j(long j) {
            this.f4932a = j;
        }

        /* renamed from: a */
        public void mo6643a() {
            this.f4933b = null;
        }

        /* renamed from: b */
        public void mo6644b(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f4933b == null) {
                this.f4933b = t;
                this.f4934c = this.f4932a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f4934c) {
                T t2 = this.f4933b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f4933b;
                mo6643a();
                throw t3;
            }
        }
    }

    /* renamed from: b2.z$k */
    /* compiled from: DefaultAudioSink */
    private final class C1684k implements C1668v.C1669a {
        private C1684k() {
        }

        /* renamed from: a */
        public void mo6615a(long j) {
            if (C1673z.this.f4898r != null) {
                C1673z.this.f4898r.mo6498a(j);
            }
        }

        /* renamed from: b */
        public void mo6616b(int i, long j) {
            if (C1673z.this.f4898r != null) {
                C1673z.this.f4898r.mo6502e(i, j, SystemClock.elapsedRealtime() - C1673z.this.f4878Z);
            }
        }

        /* renamed from: c */
        public void mo6617c(long j) {
            C5961r.m35215i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        /* renamed from: d */
        public void mo6618d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1673z.this.m7741Q() + ", " + C1673z.this.m7742R();
            if (!C1673z.f4852c0) {
                C5961r.m35215i("DefaultAudioSink", str);
                return;
            }
            throw new C1681h(str, (C1674a) null);
        }

        /* renamed from: e */
        public void mo6619e(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C1673z.this.m7741Q() + ", " + C1673z.this.m7742R();
            if (!C1673z.f4852c0) {
                C5961r.m35215i("DefaultAudioSink", str);
                return;
            }
            throw new C1681h(str, (C1674a) null);
        }

        /* synthetic */ C1684k(C1673z zVar, C1674a aVar) {
            this();
        }
    }

    /* renamed from: b2.z$l */
    /* compiled from: DefaultAudioSink */
    private final class C1685l {

        /* renamed from: a */
        private final Handler f4936a = new Handler();

        /* renamed from: b */
        private final AudioTrack.StreamEventCallback f4937b;

        /* renamed from: b2.z$l$a */
        /* compiled from: DefaultAudioSink */
        class C1686a extends AudioTrack.StreamEventCallback {

            /* renamed from: a */
            final /* synthetic */ C1673z f4939a;

            C1686a(C1673z zVar) {
                this.f4939a = zVar;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                C5917a.m34873f(audioTrack == C1673z.this.f4901u);
                if (C1673z.this.f4898r != null && C1673z.this.f4873U) {
                    C1673z.this.f4898r.mo6504g();
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                C5917a.m34873f(audioTrack == C1673z.this.f4901u);
                if (C1673z.this.f4898r != null && C1673z.this.f4873U) {
                    C1673z.this.f4898r.mo6504g();
                }
            }
        }

        public C1685l() {
            this.f4937b = new C1686a(C1673z.this);
        }

        /* renamed from: a */
        public void mo6645a(AudioTrack audioTrack) {
            Handler handler = this.f4936a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new C1612a0(handler), this.f4937b);
        }

        /* renamed from: b */
        public void mo6646b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f4937b);
            this.f4936a.removeCallbacksAndMessages((Object) null);
        }
    }

    /* synthetic */ C1673z(C1678e eVar, C1674a aVar) {
        this(eVar);
    }

    /* renamed from: C */
    private void m7728C(long j) {
        C6280t2 t2Var;
        if (m7759h0()) {
            t2Var = this.f4881b.mo6628b(m7736K());
        } else {
            t2Var = C6280t2.f30329d;
        }
        C6280t2 t2Var2 = t2Var;
        boolean d = m7759h0() ? this.f4881b.mo6630d(mo6625P()) : false;
        this.f4890j.add(new C1682i(t2Var2, d, Math.max(0, j), this.f4900t.mo6640h(m7742R()), (C1674a) null));
        m7758g0();
        C1660t.C1663c cVar = this.f4898r;
        if (cVar != null) {
            cVar.mo6499b(d);
        }
    }

    /* renamed from: D */
    private long m7729D(long j) {
        while (!this.f4890j.isEmpty() && j >= this.f4890j.getFirst().f4931d) {
            this.f4904x = this.f4890j.remove();
        }
        C1682i iVar = this.f4904x;
        long j2 = j - iVar.f4931d;
        if (iVar.f4928a.equals(C6280t2.f30329d)) {
            return this.f4904x.f4930c + j2;
        }
        if (this.f4890j.isEmpty()) {
            return this.f4904x.f4930c + this.f4881b.mo6627a(j2);
        }
        C1682i first = this.f4890j.getFirst();
        return first.f4930c - C5953m0.m35118Z(first.f4931d - j, this.f4904x.f4928a.f30331a);
    }

    /* renamed from: E */
    private long m7730E(long j) {
        return j + this.f4900t.mo6640h(this.f4881b.mo6629c());
    }

    /* renamed from: F */
    private AudioTrack m7731F(C1679f fVar) throws C1660t.C1662b {
        try {
            return fVar.mo6637a(this.f4877Y, this.f4902v, this.f4875W);
        } catch (C1660t.C1662b e) {
            C1660t.C1663c cVar = this.f4898r;
            if (cVar != null) {
                cVar.mo6500c(e);
            }
            throw e;
        }
    }

    /* renamed from: G */
    private AudioTrack m7732G() throws C1660t.C1662b {
        try {
            return m7731F((C1679f) C5917a.m34872e(this.f4900t));
        } catch (C1660t.C1662b e) {
            C1679f fVar = this.f4900t;
            if (fVar.f4923h > 1000000) {
                C1679f c = fVar.mo6639c(1000000);
                try {
                    AudioTrack F = m7731F(c);
                    this.f4900t = c;
                    return F;
                } catch (C1660t.C1662b e2) {
                    e.addSuppressed(e2);
                    m7747W();
                    throw e;
                }
            }
            m7747W();
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7733H() throws p014b2.C1660t.C1665e {
        /*
            r9 = this;
            int r0 = r9.f4870R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f4870R = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f4870R
            b2.g[] r5 = r9.f4863K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo6517h()
        L_0x001f:
            r9.m7749Y(r7)
            boolean r0 = r4.mo6513d()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f4870R
            int r0 = r0 + r2
            r9.f4870R = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f4867O
            if (r0 == 0) goto L_0x003b
            r9.m7762k0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f4867O
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f4870R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b2.C1673z.m7733H():boolean");
    }

    /* renamed from: I */
    private void m7734I() {
        int i = 0;
        while (true) {
            C1637g[] gVarArr = this.f4863K;
            if (i < gVarArr.length) {
                C1637g gVar = gVarArr[i];
                gVar.flush();
                this.f4864L[i] = gVar.mo6514e();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static AudioFormat m7735J(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* renamed from: K */
    private C6280t2 m7736K() {
        return m7739N().f4928a;
    }

    /* renamed from: L */
    private static int m7737L(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        C5917a.m34873f(minBufferSize != -2);
        return minBufferSize;
    }

    /* renamed from: M */
    private static int m7738M(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return C1613b.m7411d(byteBuffer);
            case 7:
            case 8:
                return C1621c0.m7441e(byteBuffer);
            case 9:
                int m = C1635f0.m7528m(C5953m0.m35084I(byteBuffer, byteBuffer.position()));
                if (m != -1) {
                    return m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 14:
                int a = C1613b.m7408a(byteBuffer);
                if (a == -1) {
                    return 0;
                }
                return C1613b.m7415h(byteBuffer, a) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C1618c.m7433c(byteBuffer);
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
        }
    }

    /* renamed from: N */
    private C1682i m7739N() {
        C1682i iVar = this.f4903w;
        if (iVar != null) {
            return iVar;
        }
        if (!this.f4890j.isEmpty()) {
            return this.f4890j.getLast();
        }
        return this.f4904x;
    }

    /* renamed from: O */
    private int m7740O(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = C5953m0.f29110a;
        if (i >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        return (i != 30 || !C5953m0.f29113d.startsWith("Pixel")) ? 1 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public long m7741Q() {
        C1679f fVar = this.f4900t;
        if (fVar.f4918c == 0) {
            return this.f4854B / ((long) fVar.f4917b);
        }
        return this.f4855C;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public long m7742R() {
        C1679f fVar = this.f4900t;
        if (fVar.f4918c == 0) {
            return this.f4856D / ((long) fVar.f4919d);
        }
        return this.f4857E;
    }

    /* renamed from: S */
    private boolean m7743S() throws C1660t.C1662b {
        C0079u1 u1Var;
        if (!this.f4888h.mo20595d()) {
            return false;
        }
        AudioTrack G = m7732G();
        this.f4901u = G;
        if (m7746V(G)) {
            m7750Z(this.f4901u);
            if (this.f4892l != 3) {
                AudioTrack audioTrack = this.f4901u;
                C6272r1 r1Var = this.f4900t.f4916a;
                audioTrack.setOffloadDelayPadding(r1Var.f30227J, r1Var.f30228K);
            }
        }
        if (C5953m0.f29110a >= 31 && (u1Var = this.f4897q) != null) {
            C1675b.m7792a(this.f4901u, u1Var);
        }
        this.f4875W = this.f4901u.getAudioSessionId();
        C1668v vVar = this.f4889i;
        AudioTrack audioTrack2 = this.f4901u;
        C1679f fVar = this.f4900t;
        vVar.mo6612s(audioTrack2, fVar.f4918c == 2, fVar.f4922g, fVar.f4919d, fVar.f4923h);
        m7755d0();
        int i = this.f4876X.f4841a;
        if (i != 0) {
            this.f4901u.attachAuxEffect(i);
            this.f4901u.setAuxEffectSendLevel(this.f4876X.f4842b);
        }
        this.f4860H = true;
        return true;
    }

    /* renamed from: T */
    private static boolean m7744T(int i) {
        return (C5953m0.f29110a >= 24 && i == -6) || i == -32;
    }

    /* renamed from: U */
    private boolean m7745U() {
        return this.f4901u != null;
    }

    /* renamed from: V */
    private static boolean m7746V(AudioTrack audioTrack) {
        return C5953m0.f29110a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: W */
    private void m7747W() {
        if (this.f4900t.mo6642l()) {
            this.f4880a0 = true;
        }
    }

    /* renamed from: X */
    private void m7748X() {
        if (!this.f4872T) {
            this.f4872T = true;
            this.f4889i.mo6605g(m7742R());
            this.f4901u.stop();
            this.f4853A = 0;
        }
    }

    /* renamed from: Y */
    private void m7749Y(long j) throws C1660t.C1665e {
        ByteBuffer byteBuffer;
        int length = this.f4863K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f4864L[i - 1];
            } else {
                byteBuffer = this.f4865M;
                if (byteBuffer == null) {
                    byteBuffer = C1637g.f4700a;
                }
            }
            if (i == length) {
                m7762k0(byteBuffer, j);
            } else {
                C1637g gVar = this.f4863K[i];
                if (i > this.f4870R) {
                    gVar.mo6456f(byteBuffer);
                }
                ByteBuffer e = gVar.mo6514e();
                this.f4864L[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: Z */
    private void m7750Z(AudioTrack audioTrack) {
        if (this.f4893m == null) {
            this.f4893m = new C1685l();
        }
        this.f4893m.mo6645a(audioTrack);
    }

    /* renamed from: a0 */
    private void m7751a0() {
        this.f4854B = 0;
        this.f4855C = 0;
        this.f4856D = 0;
        this.f4857E = 0;
        this.f4882b0 = false;
        this.f4858F = 0;
        this.f4904x = new C1682i(m7736K(), mo6625P(), 0, 0, (C1674a) null);
        this.f4861I = 0;
        this.f4903w = null;
        this.f4890j.clear();
        this.f4865M = null;
        this.f4866N = 0;
        this.f4867O = null;
        this.f4872T = false;
        this.f4871S = false;
        this.f4870R = -1;
        this.f4906z = null;
        this.f4853A = 0;
        this.f4885e.mo6539n();
        m7734I();
    }

    /* renamed from: b0 */
    private void m7753b0(C6280t2 t2Var, boolean z) {
        C1682i N = m7739N();
        if (!t2Var.equals(N.f4928a) || z != N.f4929b) {
            C1682i iVar = new C1682i(t2Var, z, -9223372036854775807L, -9223372036854775807L, (C1674a) null);
            if (m7745U()) {
                this.f4903w = iVar;
            } else {
                this.f4904x = iVar;
            }
        }
    }

    /* renamed from: c0 */
    private void m7754c0(C6280t2 t2Var) {
        if (m7745U()) {
            try {
                this.f4901u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(t2Var.f30331a).setPitch(t2Var.f30332b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C5961r.m35216j("DefaultAudioSink", "Failed to set playback params", e);
            }
            t2Var = new C6280t2(this.f4901u.getPlaybackParams().getSpeed(), this.f4901u.getPlaybackParams().getPitch());
            this.f4889i.mo6613t(t2Var.f30331a);
        }
        this.f4905y = t2Var;
    }

    /* renamed from: d0 */
    private void m7755d0() {
        if (m7745U()) {
            if (C5953m0.f29110a >= 21) {
                m7756e0(this.f4901u, this.f4862J);
            } else {
                m7757f0(this.f4901u, this.f4862J);
            }
        }
    }

    /* renamed from: e0 */
    private static void m7756e0(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: f0 */
    private static void m7757f0(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: g0 */
    private void m7758g0() {
        C1637g[] gVarArr = this.f4900t.f4924i;
        ArrayList arrayList = new ArrayList();
        for (C1637g gVar : gVarArr) {
            if (gVar.mo6512b()) {
                arrayList.add(gVar);
            } else {
                gVar.flush();
            }
        }
        int size = arrayList.size();
        this.f4863K = (C1637g[]) arrayList.toArray(new C1637g[size]);
        this.f4864L = new ByteBuffer[size];
        m7734I();
    }

    /* renamed from: h0 */
    private boolean m7759h0() {
        return !this.f4877Y && "audio/raw".equals(this.f4900t.f4916a.f30243t) && !m7760i0(this.f4900t.f4916a.f30226I);
    }

    /* renamed from: i0 */
    private boolean m7760i0(int i) {
        return this.f4883c && C5953m0.m35157s0(i);
    }

    /* renamed from: j0 */
    private boolean m7761j0(C6272r1 r1Var, C1624e eVar) {
        int f;
        int G;
        int O;
        if (C5953m0.f29110a < 29 || this.f4892l == 0 || (f = C5967v.m35242f((String) C5917a.m34872e(r1Var.f30243t), r1Var.f30240i)) == 0 || (G = C5953m0.m35080G(r1Var.f30224G)) == 0 || (O = m7740O(m7735J(r1Var.f30225H, G, f), eVar.mo6457b().f4661a)) == 0) {
            return false;
        }
        if (O == 1) {
            boolean z = (r1Var.f30227J == 0 && r1Var.f30228K == 0) ? false : true;
            boolean z2 = this.f4892l == 1;
            if (!z || !z2) {
                return true;
            }
            return false;
        } else if (O == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k0 */
    private void m7762k0(ByteBuffer byteBuffer, long j) throws C1660t.C1665e {
        int i;
        C1660t.C1663c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f4867O;
            boolean z = true;
            if (byteBuffer2 != null) {
                C5917a.m34868a(byteBuffer2 == byteBuffer);
            } else {
                this.f4867O = byteBuffer;
                if (C5953m0.f29110a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f4868P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f4868P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f4868P, 0, remaining);
                    byteBuffer.position(position);
                    this.f4869Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C5953m0.f29110a < 21) {
                int c = this.f4889i.mo6603c(this.f4856D);
                if (c > 0) {
                    i = this.f4901u.write(this.f4868P, this.f4869Q, Math.min(remaining2, c));
                    if (i > 0) {
                        this.f4869Q += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f4877Y) {
                C5917a.m34873f(j != -9223372036854775807L);
                i = m7764m0(this.f4901u, byteBuffer, remaining2, j);
            } else {
                i = m7763l0(this.f4901u, byteBuffer, remaining2);
            }
            this.f4878Z = SystemClock.elapsedRealtime();
            if (i < 0) {
                boolean T = m7744T(i);
                if (T) {
                    m7747W();
                }
                C1660t.C1665e eVar = new C1660t.C1665e(i, this.f4900t.f4916a, T);
                C1660t.C1663c cVar2 = this.f4898r;
                if (cVar2 != null) {
                    cVar2.mo6500c(eVar);
                }
                if (!eVar.f4796b) {
                    this.f4895o.mo6644b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f4895o.mo6643a();
            if (m7746V(this.f4901u)) {
                if (this.f4857E > 0) {
                    this.f4882b0 = false;
                }
                if (this.f4873U && (cVar = this.f4898r) != null && i < remaining2 && !this.f4882b0) {
                    cVar.mo6501d();
                }
            }
            int i2 = this.f4900t.f4918c;
            if (i2 == 0) {
                this.f4856D += (long) i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.f4865M) {
                        z = false;
                    }
                    C5917a.m34873f(z);
                    this.f4857E += ((long) this.f4858F) * ((long) this.f4866N);
                }
                this.f4867O = null;
            }
        }
    }

    /* renamed from: l0 */
    private static int m7763l0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: m0 */
    private int m7764m0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (C5953m0.f29110a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.f4906z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f4906z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f4906z.putInt(1431633921);
        }
        if (this.f4853A == 0) {
            this.f4906z.putInt(4, i);
            this.f4906z.putLong(8, j * 1000);
            this.f4906z.position(0);
            this.f4853A = i;
        }
        int remaining = this.f4906z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f4906z, remaining, 1);
            if (write < 0) {
                this.f4853A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int l0 = m7763l0(audioTrack, byteBuffer, i);
        if (l0 < 0) {
            this.f4853A = 0;
            return l0;
        }
        this.f4853A -= l0;
        return l0;
    }

    /* renamed from: E0 */
    public void mo6568E0() {
        this.f4873U = true;
        if (m7745U()) {
            this.f4889i.mo6614u();
            this.f4901u.play();
        }
    }

    /* renamed from: P */
    public boolean mo6625P() {
        return m7739N().f4929b;
    }

    /* renamed from: a */
    public boolean mo6569a(C6272r1 r1Var) {
        return mo6582n(r1Var) != 0;
    }

    /* renamed from: c */
    public void mo6570c(C6280t2 t2Var) {
        C6280t2 t2Var2 = new C6280t2(C5953m0.m35150p(t2Var.f30331a, 0.1f, 8.0f), C5953m0.m35150p(t2Var.f30332b, 0.1f, 8.0f));
        if (!this.f4891k || C5953m0.f29110a < 23) {
            m7753b0(t2Var2, mo6625P());
        } else {
            m7754c0(t2Var2);
        }
    }

    /* renamed from: d */
    public boolean mo6571d() {
        return !m7745U() || (this.f4871S && !mo6577i());
    }

    /* renamed from: e */
    public C6280t2 mo6572e() {
        if (this.f4891k) {
            return this.f4905y;
        }
        return m7736K();
    }

    /* renamed from: f */
    public void mo6573f(boolean z) {
        m7753b0(m7736K(), z);
    }

    public void flush() {
        if (m7745U()) {
            m7751a0();
            if (this.f4889i.mo6607i()) {
                this.f4901u.pause();
            }
            if (m7746V(this.f4901u)) {
                ((C1685l) C5917a.m34872e(this.f4893m)).mo6646b(this.f4901u);
            }
            AudioTrack audioTrack = this.f4901u;
            this.f4901u = null;
            if (C5953m0.f29110a < 21 && !this.f4874V) {
                this.f4875W = 0;
            }
            C1679f fVar = this.f4899s;
            if (fVar != null) {
                this.f4900t = fVar;
                this.f4899s = null;
            }
            this.f4889i.mo6611q();
            this.f4888h.mo20594c();
            new C1674a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f4895o.mo6643a();
        this.f4894n.mo6643a();
    }

    /* renamed from: g */
    public void mo6575g(C1670w wVar) {
        if (!this.f4876X.equals(wVar)) {
            int i = wVar.f4841a;
            float f = wVar.f4842b;
            AudioTrack audioTrack = this.f4901u;
            if (audioTrack != null) {
                if (this.f4876X.f4841a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f4901u.setAuxEffectSendLevel(f);
                }
            }
            this.f4876X = wVar;
        }
    }

    /* renamed from: h */
    public void mo6576h() throws C1660t.C1665e {
        if (!this.f4871S && m7745U() && m7733H()) {
            m7748X();
            this.f4871S = true;
        }
    }

    /* renamed from: i */
    public boolean mo6577i() {
        return m7745U() && this.f4889i.mo6606h(m7742R());
    }

    /* renamed from: j */
    public void mo6578j(C0079u1 u1Var) {
        this.f4897q = u1Var;
    }

    /* renamed from: k */
    public void mo6579k(int i) {
        if (this.f4875W != i) {
            this.f4875W = i;
            this.f4874V = i != 0;
            flush();
        }
    }

    /* renamed from: l */
    public long mo6580l(boolean z) {
        if (!m7745U() || this.f4860H) {
            return Long.MIN_VALUE;
        }
        return m7730E(m7729D(Math.min(this.f4889i.mo6604d(z), this.f4900t.mo6640h(m7742R()))));
    }

    /* renamed from: m */
    public void mo6581m() {
        if (this.f4877Y) {
            this.f4877Y = false;
            flush();
        }
    }

    /* renamed from: n */
    public int mo6582n(C6272r1 r1Var) {
        if (!"audio/raw".equals(r1Var.f30243t)) {
            return ((this.f4880a0 || !m7761j0(r1Var, this.f4902v)) && !this.f4879a.mo6507h(r1Var)) ? 0 : 2;
        }
        if (!C5953m0.m35159t0(r1Var.f30226I)) {
            C5961r.m35215i("DefaultAudioSink", "Invalid PCM encoding: " + r1Var.f30226I);
            return 0;
        }
        int i = r1Var.f30226I;
        if (i == 2 || (this.f4883c && i == 4)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: o */
    public void mo6583o(C1660t.C1663c cVar) {
        this.f4898r = cVar;
    }

    /* renamed from: p */
    public void mo6584p() {
        this.f4859G = true;
    }

    public void pause() {
        this.f4873U = false;
        if (m7745U() && this.f4889i.mo6610p()) {
            this.f4901u.pause();
        }
    }

    /* renamed from: q */
    public void mo6586q() {
        C5917a.m34873f(C5953m0.f29110a >= 21);
        C5917a.m34873f(this.f4874V);
        if (!this.f4877Y) {
            this.f4877Y = true;
            flush();
        }
    }

    /* renamed from: r */
    public void mo6587r(C6272r1 r1Var, int i, int[] iArr) throws C1660t.C1661a {
        C1637g[] gVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1637g[] gVarArr2;
        int[] iArr2;
        C6272r1 r1Var2 = r1Var;
        if ("audio/raw".equals(r1Var2.f30243t)) {
            C5917a.m34868a(C5953m0.m35159t0(r1Var2.f30226I));
            i7 = C5953m0.m35127d0(r1Var2.f30226I, r1Var2.f30224G);
            if (m7760i0(r1Var2.f30226I)) {
                gVarArr2 = this.f4887g;
            } else {
                gVarArr2 = this.f4886f;
            }
            this.f4885e.mo6540o(r1Var2.f30227J, r1Var2.f30228K);
            if (C5953m0.f29110a < 21 && r1Var2.f30224G == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.f4884d.mo6624m(iArr2);
            C1637g.C1638a aVar = new C1637g.C1638a(r1Var2.f30225H, r1Var2.f30224G, r1Var2.f30226I);
            int length = gVarArr2.length;
            int i11 = 0;
            while (i11 < length) {
                C1637g gVar = gVarArr2[i11];
                try {
                    C1637g.C1638a g = gVar.mo6516g(aVar);
                    if (gVar.mo6512b()) {
                        aVar = g;
                    }
                    i11++;
                } catch (C1637g.C1639b e) {
                    throw new C1660t.C1661a((Throwable) e, r1Var2);
                }
            }
            int i12 = aVar.f4704c;
            int i13 = aVar.f4702a;
            int G = C5953m0.m35080G(aVar.f4703b);
            gVarArr = gVarArr2;
            i3 = C5953m0.m35127d0(i12, aVar.f4703b);
            i5 = i12;
            i2 = i13;
            i6 = G;
            i4 = 0;
        } else {
            C1637g[] gVarArr3 = new C1637g[0];
            int i14 = r1Var2.f30225H;
            if (m7761j0(r1Var2, this.f4902v)) {
                gVarArr = gVarArr3;
                i2 = i14;
                i5 = C5967v.m35242f((String) C5917a.m34872e(r1Var2.f30243t), r1Var2.f30240i);
                i6 = C5953m0.m35080G(r1Var2.f30224G);
                i7 = -1;
                i4 = 1;
            } else {
                Pair<Integer, Integer> f = this.f4879a.mo6506f(r1Var2);
                if (f != null) {
                    int intValue = ((Integer) f.first).intValue();
                    gVarArr = gVarArr3;
                    i2 = i14;
                    i6 = ((Integer) f.second).intValue();
                    i5 = intValue;
                    i7 = -1;
                    i4 = 2;
                } else {
                    throw new C1660t.C1661a("Unable to configure passthrough for: " + r1Var2, r1Var2);
                }
            }
            i3 = -1;
        }
        if (i != 0) {
            i9 = i;
            i8 = i5;
        } else {
            i8 = i5;
            i9 = this.f4896p.mo6448a(m7737L(i2, i6, i5), i5, i4, i3, i2, this.f4891k ? 8.0d : 1.0d);
        }
        if (i8 == 0) {
            throw new C1660t.C1661a("Invalid output encoding (mode=" + i4 + ") for: " + r1Var2, r1Var2);
        } else if (i6 != 0) {
            this.f4880a0 = false;
            C1679f fVar = new C1679f(r1Var, i7, i4, i3, i2, i6, i8, i9, gVarArr);
            if (m7745U()) {
                this.f4899s = fVar;
            } else {
                this.f4900t = fVar;
            }
        } else {
            throw new C1660t.C1661a("Invalid output channel config (mode=" + i4 + ") for: " + r1Var2, r1Var2);
        }
    }

    public void reset() {
        flush();
        for (C1637g reset : this.f4886f) {
            reset.reset();
        }
        for (C1637g reset2 : this.f4887g) {
            reset2.reset();
        }
        this.f4873U = false;
        this.f4880a0 = false;
    }

    /* renamed from: s */
    public void mo6589s(C1624e eVar) {
        if (!this.f4902v.equals(eVar)) {
            this.f4902v = eVar;
            if (!this.f4877Y) {
                flush();
            }
        }
    }

    public void setVolume(float f) {
        if (this.f4862J != f) {
            this.f4862J = f;
            m7755d0();
        }
    }

    /* renamed from: t */
    public boolean mo6591t(ByteBuffer byteBuffer, long j, int i) throws C1660t.C1662b, C1660t.C1665e {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        int i2 = i;
        ByteBuffer byteBuffer3 = this.f4865M;
        C5917a.m34868a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f4899s != null) {
            if (!m7733H()) {
                return false;
            }
            if (!this.f4899s.mo6638b(this.f4900t)) {
                m7748X();
                if (mo6577i()) {
                    return false;
                }
                flush();
            } else {
                this.f4900t = this.f4899s;
                this.f4899s = null;
                if (m7746V(this.f4901u) && this.f4892l != 3) {
                    if (this.f4901u.getPlayState() == 3) {
                        this.f4901u.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f4901u;
                    C6272r1 r1Var = this.f4900t.f4916a;
                    audioTrack.setOffloadDelayPadding(r1Var.f30227J, r1Var.f30228K);
                    this.f4882b0 = true;
                }
            }
            m7728C(j2);
        }
        if (!m7745U()) {
            try {
                if (!m7743S()) {
                    return false;
                }
            } catch (C1660t.C1662b e) {
                C1660t.C1662b bVar = e;
                if (!bVar.f4791b) {
                    this.f4894n.mo6644b(bVar);
                    return false;
                }
                throw bVar;
            }
        }
        this.f4894n.mo6643a();
        if (this.f4860H) {
            this.f4861I = Math.max(0, j2);
            this.f4859G = false;
            this.f4860H = false;
            if (this.f4891k && C5953m0.f29110a >= 23) {
                m7754c0(this.f4905y);
            }
            m7728C(j2);
            if (this.f4873U) {
                mo6568E0();
            }
        }
        if (!this.f4889i.mo6609k(m7742R())) {
            return false;
        }
        if (this.f4865M == null) {
            C5917a.m34868a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C1679f fVar = this.f4900t;
            if (fVar.f4918c != 0 && this.f4858F == 0) {
                int M = m7738M(fVar.f4922g, byteBuffer2);
                this.f4858F = M;
                if (M == 0) {
                    return true;
                }
            }
            if (this.f4903w != null) {
                if (!m7733H()) {
                    return false;
                }
                m7728C(j2);
                this.f4903w = null;
            }
            long k = this.f4861I + this.f4900t.mo6641k(m7741Q() - this.f4885e.mo6538m());
            if (!this.f4859G && Math.abs(k - j2) > 200000) {
                this.f4898r.mo6500c(new C1660t.C1664d(j2, k));
                this.f4859G = true;
            }
            if (this.f4859G) {
                if (!m7733H()) {
                    return false;
                }
                long j3 = j2 - k;
                this.f4861I += j3;
                this.f4859G = false;
                m7728C(j2);
                C1660t.C1663c cVar = this.f4898r;
                if (!(cVar == null || j3 == 0)) {
                    cVar.mo6503f();
                }
            }
            if (this.f4900t.f4918c == 0) {
                this.f4854B += (long) byteBuffer.remaining();
            } else {
                this.f4855C += ((long) this.f4858F) * ((long) i2);
            }
            this.f4865M = byteBuffer2;
            this.f4866N = i2;
        }
        m7749Y(j2);
        if (!this.f4865M.hasRemaining()) {
            this.f4865M = null;
            this.f4866N = 0;
            return true;
        } else if (!this.f4889i.mo6608j(m7742R())) {
            return false;
        } else {
            C5961r.m35215i("DefaultAudioSink", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    /* renamed from: u */
    public void mo6592u() {
        if (C5953m0.f29110a < 25) {
            flush();
            return;
        }
        this.f4895o.mo6643a();
        this.f4894n.mo6643a();
        if (m7745U()) {
            m7751a0();
            if (this.f4889i.mo6607i()) {
                this.f4901u.pause();
            }
            this.f4901u.flush();
            this.f4889i.mo6611q();
            C1668v vVar = this.f4889i;
            AudioTrack audioTrack = this.f4901u;
            C1679f fVar = this.f4900t;
            vVar.mo6612s(audioTrack, fVar.f4918c == 2, fVar.f4922g, fVar.f4919d, fVar.f4923h);
            this.f4860H = true;
        }
    }

    private C1673z(C1678e eVar) {
        this.f4879a = eVar.f4910a;
        C1676c b = eVar.f4911b;
        this.f4881b = b;
        int i = C5953m0.f29110a;
        this.f4883c = i >= 21 && eVar.f4912c;
        this.f4891k = i >= 23 && eVar.f4913d;
        this.f4892l = i >= 29 ? eVar.f4914e : 0;
        this.f4896p = eVar.f4915f;
        C5933g gVar = new C5933g(C5923d.f29058a);
        this.f4888h = gVar;
        gVar.mo20596e();
        this.f4889i = new C1668v(new C1684k(this, (C1674a) null));
        C1672y yVar = new C1672y();
        this.f4884d = yVar;
        C1650l0 l0Var = new C1650l0();
        this.f4885e = l0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C1671x[]{new C1642h0(), yVar, l0Var});
        Collections.addAll(arrayList, b.mo6631e());
        this.f4886f = (C1637g[]) arrayList.toArray(new C1637g[0]);
        this.f4887g = new C1637g[]{new C1623d0()};
        this.f4862J = 1.0f;
        this.f4902v = C1624e.f4653g;
        this.f4875W = 0;
        this.f4876X = new C1670w(0, 0.0f);
        C6280t2 t2Var = C6280t2.f30329d;
        this.f4904x = new C1682i(t2Var, false, 0, 0, (C1674a) null);
        this.f4905y = t2Var;
        this.f4870R = -1;
        this.f4863K = new C1637g[0];
        this.f4864L = new ByteBuffer[0];
        this.f4890j = new ArrayDeque<>();
        this.f4894n = new C1683j<>(100);
        this.f4895o = new C1683j<>(100);
    }
}
