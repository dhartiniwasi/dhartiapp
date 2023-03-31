package p030d2;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p004a2.C0079u1;
import p015b3.C1748q;
import p015b3.C1759t;
import p021c2.C1841b;
import p030d2.C4016g0;
import p030d2.C4035m;
import p030d2.C4042o;
import p030d2.C4048w;
import p155v3.C5804g0;
import p161w3.C5917a;
import p161w3.C5937h;
import p161w3.C5939i;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6227i;

/* renamed from: d2.g */
/* compiled from: DefaultDrmSession */
class C4009g implements C4042o {

    /* renamed from: a */
    public final List<C4035m.C4037b> f23017a;

    /* renamed from: b */
    private final C4016g0 f23018b;

    /* renamed from: c */
    private final C4010a f23019c;

    /* renamed from: d */
    private final C4011b f23020d;

    /* renamed from: e */
    private final int f23021e;

    /* renamed from: f */
    private final boolean f23022f;

    /* renamed from: g */
    private final boolean f23023g;

    /* renamed from: h */
    private final HashMap<String, String> f23024h;

    /* renamed from: i */
    private final C5939i<C4048w.C4049a> f23025i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C5804g0 f23026j;

    /* renamed from: k */
    private final C0079u1 f23027k;

    /* renamed from: l */
    final C4041n0 f23028l;

    /* renamed from: m */
    final UUID f23029m;

    /* renamed from: n */
    final C4014e f23030n;

    /* renamed from: o */
    private int f23031o;

    /* renamed from: p */
    private int f23032p;

    /* renamed from: q */
    private HandlerThread f23033q;

    /* renamed from: r */
    private C4012c f23034r;

    /* renamed from: s */
    private C1841b f23035s;

    /* renamed from: t */
    private C4042o.C4043a f23036t;

    /* renamed from: u */
    private byte[] f23037u;

    /* renamed from: v */
    private byte[] f23038v;

    /* renamed from: w */
    private C4016g0.C4017a f23039w;

    /* renamed from: x */
    private C4016g0.C4020d f23040x;

    /* renamed from: d2.g$a */
    /* compiled from: DefaultDrmSession */
    public interface C4010a {
        /* renamed from: a */
        void mo17191a(C4009g gVar);

        /* renamed from: b */
        void mo17192b(Exception exc, boolean z);

        /* renamed from: c */
        void mo17193c();
    }

    /* renamed from: d2.g$b */
    /* compiled from: DefaultDrmSession */
    public interface C4011b {
        /* renamed from: a */
        void mo17194a(C4009g gVar, int i);

        /* renamed from: b */
        void mo17195b(C4009g gVar, int i);
    }

    /* renamed from: d2.g$c */
    /* compiled from: DefaultDrmSession */
    private class C4012c extends Handler {

        /* renamed from: a */
        private boolean f23041a;

        public C4012c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private boolean m27709a(Message message, C4044o0 o0Var) {
            IOException iOException;
            C4044o0 o0Var2 = o0Var;
            C4013d dVar = (C4013d) message.obj;
            if (!dVar.f23044b) {
                return false;
            }
            int i = dVar.f23047e + 1;
            dVar.f23047e = i;
            if (i > C4009g.this.f23026j.mo20332d(3)) {
                return false;
            }
            C1748q qVar = new C1748q(dVar.f23043a, o0Var2.f23122a, o0Var2.f23123b, o0Var2.f23124c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f23045c, o0Var2.f23125d);
            C1759t tVar = new C1759t(3);
            if (o0Var.getCause() instanceof IOException) {
                iOException = (IOException) o0Var.getCause();
            } else {
                iOException = new C4015f(o0Var.getCause());
            }
            long c = C4009g.this.f23026j.mo20331c(new C5804g0.C5807c(qVar, tVar, iOException, dVar.f23047e));
            if (c == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f23041a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), c);
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17196b(int i, Object obj, boolean z) {
            obtainMessage(i, new C4013d(C1748q.m8237a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* renamed from: c */
        public synchronized void mo17197c() {
            removeCallbacksAndMessages((Object) null);
            this.f23041a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: d2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: d2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: d2.o0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                d2.g$d r0 = (p030d2.C4009g.C4013d) r0
                int r1 = r6.what     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                if (r1 == 0) goto L_0x0020
                r2 = 1
                if (r1 != r2) goto L_0x001a
                d2.g r1 = p030d2.C4009g.this     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                d2.n0 r2 = r1.f23028l     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f23029m     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f23046d     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                d2.g0$a r3 = (p030d2.C4016g0.C4017a) r3     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo17224a(r1, r3)     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x001a:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                r1.<init>()     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                throw r1     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
            L_0x0020:
                d2.g r1 = p030d2.C4009g.this     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                d2.n0 r2 = r1.f23028l     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                java.util.UUID r1 = r1.f23029m     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                java.lang.Object r3 = r0.f23046d     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                d2.g0$d r3 = (p030d2.C4016g0.C4020d) r3     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                byte[] r1 = r2.mo17225b(r1, r3)     // Catch:{ o0 -> 0x0038, Exception -> 0x002f }
                goto L_0x0040
            L_0x002f:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                p161w3.C5961r.m35216j(r2, r3, r1)
                goto L_0x0040
            L_0x0038:
                r1 = move-exception
                boolean r2 = r5.m27709a(r6, r1)
                if (r2 == 0) goto L_0x0040
                return
            L_0x0040:
                d2.g r2 = p030d2.C4009g.this
                v3.g0 r2 = r2.f23026j
                long r3 = r0.f23043a
                r2.mo20330b(r3)
                monitor-enter(r5)
                boolean r2 = r5.f23041a     // Catch:{ all -> 0x0065 }
                if (r2 != 0) goto L_0x0063
                d2.g r2 = p030d2.C4009g.this     // Catch:{ all -> 0x0065 }
                d2.g$e r2 = r2.f23030n     // Catch:{ all -> 0x0065 }
                int r6 = r6.what     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.f23046d     // Catch:{ all -> 0x0065 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0065 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0065 }
                r6.sendToTarget()     // Catch:{ all -> 0x0065 }
            L_0x0063:
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                return
            L_0x0065:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0065 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p030d2.C4009g.C4012c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: d2.g$d */
    /* compiled from: DefaultDrmSession */
    private static final class C4013d {

        /* renamed from: a */
        public final long f23043a;

        /* renamed from: b */
        public final boolean f23044b;

        /* renamed from: c */
        public final long f23045c;

        /* renamed from: d */
        public final Object f23046d;

        /* renamed from: e */
        public int f23047e;

        public C4013d(long j, boolean z, long j2, Object obj) {
            this.f23043a = j;
            this.f23044b = z;
            this.f23045c = j2;
            this.f23046d = obj;
        }
    }

    /* renamed from: d2.g$e */
    /* compiled from: DefaultDrmSession */
    private class C4014e extends Handler {
        public C4014e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C4009g.this.m27672B(obj, obj2);
            } else if (i == 1) {
                C4009g.this.m27688v(obj, obj2);
            }
        }
    }

    /* renamed from: d2.g$f */
    /* compiled from: DefaultDrmSession */
    public static final class C4015f extends IOException {
        public C4015f(Throwable th) {
            super(th);
        }
    }

    public C4009g(UUID uuid, C4016g0 g0Var, C4010a aVar, C4011b bVar, List<C4035m.C4037b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, C4041n0 n0Var, Looper looper, C5804g0 g0Var2, C0079u1 u1Var) {
        if (i == 1 || i == 3) {
            C5917a.m34872e(bArr);
        }
        this.f23029m = uuid;
        this.f23019c = aVar;
        this.f23020d = bVar;
        this.f23018b = g0Var;
        this.f23021e = i;
        this.f23022f = z;
        this.f23023g = z2;
        if (bArr != null) {
            this.f23038v = bArr;
            this.f23017a = null;
        } else {
            this.f23017a = Collections.unmodifiableList((List) C5917a.m34872e(list));
        }
        this.f23024h = hashMap;
        this.f23028l = n0Var;
        this.f23025i = new C5939i<>();
        this.f23026j = g0Var2;
        this.f23027k = u1Var;
        this.f23031o = 2;
        this.f23030n = new C4014e(looper);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m27672B(Object obj, Object obj2) {
        if (obj != this.f23040x) {
            return;
        }
        if (this.f23031o == 2 || m27684r()) {
            this.f23040x = null;
            if (obj2 instanceof Exception) {
                this.f23019c.mo17192b((Exception) obj2, false);
                return;
            }
            try {
                this.f23018b.mo17173k((byte[]) obj2);
                this.f23019c.mo17193c();
            } catch (Exception e) {
                this.f23019c.mo17192b(e, true);
            }
        }
    }

    /* renamed from: C */
    private boolean m27673C() {
        if (m27684r()) {
            return true;
        }
        try {
            byte[] f = this.f23018b.mo17168f();
            this.f23037u = f;
            this.f23018b.mo17166d(f, this.f23027k);
            this.f23035s = this.f23018b.mo17167e(this.f23037u);
            this.f23031o = 3;
            m27681n(new C9847b(3));
            C5917a.m34872e(this.f23037u);
            return true;
        } catch (NotProvisionedException unused) {
            this.f23019c.mo17191a(this);
            return false;
        } catch (Exception e) {
            m27687u(e, 1);
            return false;
        }
    }

    /* renamed from: D */
    private void m27674D(byte[] bArr, int i, boolean z) {
        try {
            this.f23039w = this.f23018b.mo17174l(bArr, this.f23017a, i, this.f23024h);
            ((C4012c) C5953m0.m35138j(this.f23034r)).mo17196b(1, C5917a.m34872e(this.f23039w), z);
        } catch (Exception e) {
            m27689w(e, true);
        }
    }

    /* renamed from: F */
    private boolean m27675F() {
        try {
            this.f23018b.mo17170h(this.f23037u, this.f23038v);
            return true;
        } catch (Exception e) {
            m27687u(e, 1);
            return false;
        }
    }

    /* renamed from: n */
    private void m27681n(C5937h<C4048w.C4049a> hVar) {
        for (C4048w.C4049a accept : this.f23025i.mo20616I()) {
            hVar.accept(accept);
        }
    }

    /* renamed from: o */
    private void m27682o(boolean z) {
        if (!this.f23023g) {
            byte[] bArr = (byte[]) C5953m0.m35138j(this.f23037u);
            int i = this.f23021e;
            if (i == 0 || i == 1) {
                if (this.f23038v == null) {
                    m27674D(bArr, 1, z);
                } else if (this.f23031o == 4 || m27675F()) {
                    long p = m27683p();
                    if (this.f23021e == 0 && p <= 60) {
                        C5961r.m35208b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + p);
                        m27674D(bArr, 2, z);
                    } else if (p <= 0) {
                        m27687u(new C4039m0(), 2);
                    } else {
                        this.f23031o = 4;
                        m27681n(C9851f.f39632a);
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    C5917a.m34872e(this.f23038v);
                    C5917a.m34872e(this.f23037u);
                    m27674D(this.f23038v, 3, z);
                }
            } else if (this.f23038v == null || m27675F()) {
                m27674D(bArr, 2, z);
            }
        }
    }

    /* renamed from: p */
    private long m27683p() {
        if (!C6227i.f29963d.equals(this.f23029m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C5917a.m34872e(C4047q0.m27851b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* renamed from: r */
    private boolean m27684r() {
        int i = this.f23031o;
        return i == 3 || i == 4;
    }

    /* renamed from: u */
    private void m27687u(Exception exc, int i) {
        this.f23036t = new C4042o.C4043a(exc, C4002c0.m27643a(exc, i));
        C5961r.m35210d("DefaultDrmSession", "DRM session error", exc);
        m27681n(new C9848c(exc));
        if (this.f23031o != 4) {
            this.f23031o = 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m27688v(Object obj, Object obj2) {
        if (obj == this.f23039w && m27684r()) {
            this.f23039w = null;
            if (obj2 instanceof Exception) {
                m27689w((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f23021e == 3) {
                    this.f23018b.mo17172j((byte[]) C5953m0.m35138j(this.f23038v), bArr);
                    m27681n(C9850e.f39631a);
                    return;
                }
                byte[] j = this.f23018b.mo17172j(this.f23037u, bArr);
                int i = this.f23021e;
                if (!((i != 2 && (i != 0 || this.f23038v == null)) || j == null || j.length == 0)) {
                    this.f23038v = j;
                }
                this.f23031o = 4;
                m27681n(C9849d.f39630a);
            } catch (Exception e) {
                m27689w(e, true);
            }
        }
    }

    /* renamed from: w */
    private void m27689w(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f23019c.mo17191a(this);
        } else {
            m27687u(exc, z ? 1 : 2);
        }
    }

    /* renamed from: x */
    private void m27690x() {
        if (this.f23021e == 0 && this.f23031o == 4) {
            C5953m0.m35138j(this.f23037u);
            m27682o(false);
        }
    }

    /* renamed from: A */
    public void mo17186A(Exception exc, boolean z) {
        m27687u(exc, z ? 1 : 3);
    }

    /* renamed from: E */
    public void mo17187E() {
        this.f23040x = this.f23018b.mo17165c();
        ((C4012c) C5953m0.m35138j(this.f23034r)).mo17196b(0, C5917a.m34872e(this.f23040x), true);
    }

    /* renamed from: a */
    public void mo17177a(C4048w.C4049a aVar) {
        int i = this.f23032p;
        if (i <= 0) {
            C5961r.m35209c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f23032p = i2;
        if (i2 == 0) {
            this.f23031o = 0;
            ((C4014e) C5953m0.m35138j(this.f23030n)).removeCallbacksAndMessages((Object) null);
            ((C4012c) C5953m0.m35138j(this.f23034r)).mo17197c();
            this.f23034r = null;
            ((HandlerThread) C5953m0.m35138j(this.f23033q)).quit();
            this.f23033q = null;
            this.f23035s = null;
            this.f23036t = null;
            this.f23039w = null;
            this.f23040x = null;
            byte[] bArr = this.f23037u;
            if (bArr != null) {
                this.f23018b.mo17171i(bArr);
                this.f23037u = null;
            }
        }
        if (aVar != null) {
            this.f23025i.mo20619f(aVar);
            if (this.f23025i.mo20618c(aVar) == 0) {
                aVar.mo17258m();
            }
        }
        this.f23020d.mo17195b(this, this.f23032p);
    }

    /* renamed from: b */
    public final UUID mo17178b() {
        return this.f23029m;
    }

    /* renamed from: c */
    public void mo17179c(C4048w.C4049a aVar) {
        boolean z = false;
        if (this.f23032p < 0) {
            C5961r.m35209c("DefaultDrmSession", "Session reference count less than zero: " + this.f23032p);
            this.f23032p = 0;
        }
        if (aVar != null) {
            this.f23025i.mo20617b(aVar);
        }
        int i = this.f23032p + 1;
        this.f23032p = i;
        if (i == 1) {
            if (this.f23031o == 2) {
                z = true;
            }
            C5917a.m34873f(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f23033q = handlerThread;
            handlerThread.start();
            this.f23034r = new C4012c(this.f23033q.getLooper());
            if (m27673C()) {
                m27682o(true);
            }
        } else if (aVar != null && m27684r() && this.f23025i.mo20618c(aVar) == 1) {
            aVar.mo17256k(this.f23031o);
        }
        this.f23020d.mo17194a(this, this.f23032p);
    }

    /* renamed from: d */
    public boolean mo17180d() {
        return this.f23022f;
    }

    /* renamed from: e */
    public Map<String, String> mo17181e() {
        byte[] bArr = this.f23037u;
        if (bArr == null) {
            return null;
        }
        return this.f23018b.mo17164b(bArr);
    }

    /* renamed from: f */
    public boolean mo17182f(String str) {
        return this.f23018b.mo17169g((byte[]) C5917a.m34875h(this.f23037u), str);
    }

    /* renamed from: g */
    public final C4042o.C4043a mo17183g() {
        if (this.f23031o == 1) {
            return this.f23036t;
        }
        return null;
    }

    public final int getState() {
        return this.f23031o;
    }

    /* renamed from: h */
    public final C1841b mo17185h() {
        return this.f23035s;
    }

    /* renamed from: q */
    public boolean mo17188q(byte[] bArr) {
        return Arrays.equals(this.f23037u, bArr);
    }

    /* renamed from: y */
    public void mo17189y(int i) {
        if (i == 2) {
            m27690x();
        }
    }

    /* renamed from: z */
    public void mo17190z() {
        if (m27673C()) {
            m27682o(true);
        }
    }
}
