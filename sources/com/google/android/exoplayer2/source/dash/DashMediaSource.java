package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.source.dash.C2017a;
import com.google.android.exoplayer2.source.dash.C2021c;
import com.google.android.exoplayer2.source.dash.C2026e;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005a3.C0092b;
import p005a3.C0093c;
import p015b3.C1687a;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1729l;
import p015b3.C1748q;
import p015b3.C1759t;
import p015b3.C1765u;
import p015b3.C1772x;
import p030d2.C4001b0;
import p030d2.C4033l;
import p030d2.C4048w;
import p030d2.C4052y;
import p038e3.C4233b;
import p038e3.C4235f;
import p038e3.C9957d;
import p038e3.C9958e;
import p045f3.C4255a;
import p045f3.C4257c;
import p045f3.C4258d;
import p045f3.C4262g;
import p045f3.C4265j;
import p045f3.C4278o;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p155v3.C5820i0;
import p155v3.C5823j0;
import p155v3.C5828l;
import p155v3.C5840p0;
import p155v3.C5853x;
import p161w3.C5917a;
import p161w3.C5924d0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6249m2;
import p177z1.C6260o1;
import p177z1.C6266q3;
import p177z1.C6300z1;
import p182a7.C6415d;
import p210d7.C9874c;

public final class DashMediaSource extends C1687a {

    /* renamed from: A */
    private final C2013e f5727A;

    /* renamed from: B */
    private final Object f5728B;

    /* renamed from: C */
    private final SparseArray<C2019b> f5729C;

    /* renamed from: D */
    private final Runnable f5730D;

    /* renamed from: E */
    private final Runnable f5731E;

    /* renamed from: F */
    private final C2026e.C2028b f5732F;

    /* renamed from: G */
    private final C5820i0 f5733G;

    /* renamed from: H */
    private C5828l f5734H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C5810h0 f5735I;

    /* renamed from: J */
    private C5840p0 f5736J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public IOException f5737K;

    /* renamed from: L */
    private Handler f5738L;

    /* renamed from: M */
    private C6300z1.C6309g f5739M;

    /* renamed from: N */
    private Uri f5740N;

    /* renamed from: O */
    private Uri f5741O;

    /* renamed from: P */
    private C4257c f5742P;

    /* renamed from: Q */
    private boolean f5743Q;

    /* renamed from: R */
    private long f5744R;

    /* renamed from: S */
    private long f5745S;

    /* renamed from: a0 */
    private long f5746a0;

    /* renamed from: b0 */
    private int f5747b0;

    /* renamed from: c0 */
    private long f5748c0;

    /* renamed from: d0 */
    private int f5749d0;

    /* renamed from: h */
    private final C6300z1 f5750h;

    /* renamed from: i */
    private final boolean f5751i;

    /* renamed from: r */
    private final C5828l.C5829a f5752r;

    /* renamed from: s */
    private final C2017a.C2018a f5753s;

    /* renamed from: t */
    private final C1712i f5754t;

    /* renamed from: u */
    private final C4052y f5755u;

    /* renamed from: v */
    private final C5804g0 f5756v;

    /* renamed from: w */
    private final C4233b f5757w;

    /* renamed from: x */
    private final long f5758x;

    /* renamed from: y */
    private final C1700e0.C1701a f5759y;

    /* renamed from: z */
    private final C5823j0.C5824a<? extends C4257c> f5760z;

    public static final class Factory implements C1772x.C1773a {

        /* renamed from: a */
        private final C2017a.C2018a f5761a;

        /* renamed from: b */
        private final C5828l.C5829a f5762b;

        /* renamed from: c */
        private C4001b0 f5763c;

        /* renamed from: d */
        private C1712i f5764d;

        /* renamed from: e */
        private C5804g0 f5765e;

        /* renamed from: f */
        private long f5766f;

        /* renamed from: g */
        private C5823j0.C5824a<? extends C4257c> f5767g;

        public Factory(C5828l.C5829a aVar) {
            this(new C2021c.C2022a(aVar), aVar);
        }

        /* renamed from: a */
        public DashMediaSource mo7731a(C6300z1 z1Var) {
            C5917a.m34872e(z1Var.f30391b);
            C5823j0.C5824a aVar = this.f5767g;
            if (aVar == null) {
                aVar = new C4258d();
            }
            List<C0093c> list = z1Var.f30391b.f30459e;
            return new DashMediaSource(z1Var, (C4257c) null, this.f5762b, !list.isEmpty() ? new C0092b(aVar, list) : aVar, this.f5761a, this.f5764d, this.f5763c.mo17162a(z1Var), this.f5765e, this.f5766f, (C2009a) null);
        }

        public Factory(C2017a.C2018a aVar, C5828l.C5829a aVar2) {
            this.f5761a = (C2017a.C2018a) C5917a.m34872e(aVar);
            this.f5762b = aVar2;
            this.f5763c = new C4033l();
            this.f5765e = new C5853x();
            this.f5766f = 30000;
            this.f5764d = new C1729l();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    class C2009a implements C5924d0.C5926b {
        C2009a() {
        }

        /* renamed from: a */
        public void mo7732a(IOException iOException) {
            DashMediaSource.this.m8755a0(iOException);
        }

        /* renamed from: b */
        public void mo7733b() {
            DashMediaSource.this.m8756b0(C5924d0.m34949h());
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    private static final class C2010b extends C6266q3 {

        /* renamed from: c */
        private final long f5769c;

        /* renamed from: d */
        private final long f5770d;

        /* renamed from: e */
        private final long f5771e;

        /* renamed from: f */
        private final int f5772f;

        /* renamed from: g */
        private final long f5773g;

        /* renamed from: h */
        private final long f5774h;

        /* renamed from: i */
        private final long f5775i;

        /* renamed from: r */
        private final C4257c f5776r;

        /* renamed from: s */
        private final C6300z1 f5777s;

        /* renamed from: t */
        private final C6300z1.C6309g f5778t;

        public C2010b(long j, long j2, long j3, int i, long j4, long j5, long j6, C4257c cVar, C6300z1 z1Var, C6300z1.C6309g gVar) {
            C4257c cVar2 = cVar;
            C6300z1.C6309g gVar2 = gVar;
            C5917a.m34873f(cVar2.f23650d != (gVar2 != null) ? false : true);
            this.f5769c = j;
            this.f5770d = j2;
            this.f5771e = j3;
            this.f5772f = i;
            this.f5773g = j4;
            this.f5774h = j5;
            this.f5775i = j6;
            this.f5776r = cVar2;
            this.f5777s = z1Var;
            this.f5778t = gVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r4 = r4.f23684c.get(r8).f23639c.get(0).mo17688l();
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long m8781x(long r11) {
            /*
                r10 = this;
                long r0 = r10.f5775i
                f3.c r2 = r10.f5776r
                boolean r2 = m8782y(r2)
                if (r2 != 0) goto L_0x000b
                return r0
            L_0x000b:
                r2 = 0
                int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                long r0 = r0 + r11
                long r11 = r10.f5774h
                int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r11
            L_0x001e:
                long r11 = r10.f5773g
                long r11 = r11 + r0
                f3.c r4 = r10.f5776r
                r5 = 0
                long r6 = r4.mo17627g(r5)
                r4 = 0
            L_0x0029:
                f3.c r8 = r10.f5776r
                int r8 = r8.mo17625e()
                int r8 = r8 + -1
                if (r4 >= r8) goto L_0x0041
                int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r8 < 0) goto L_0x0041
                long r11 = r11 - r6
                int r4 = r4 + 1
                f3.c r6 = r10.f5776r
                long r6 = r6.mo17627g(r4)
                goto L_0x0029
            L_0x0041:
                f3.c r8 = r10.f5776r
                f3.g r4 = r8.mo17624d(r4)
                r8 = 2
                int r8 = r4.mo17678a(r8)
                r9 = -1
                if (r8 != r9) goto L_0x0050
                return r0
            L_0x0050:
                java.util.List<f3.a> r4 = r4.f23684c
                java.lang.Object r4 = r4.get(r8)
                f3.a r4 = (p045f3.C4255a) r4
                java.util.List<f3.j> r4 = r4.f23639c
                java.lang.Object r4 = r4.get(r5)
                f3.j r4 = (p045f3.C4265j) r4
                e3.f r4 = r4.mo17688l()
                if (r4 == 0) goto L_0x0079
                long r8 = r4.mo17608j(r6)
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 != 0) goto L_0x006f
                goto L_0x0079
            L_0x006f:
                long r2 = r4.mo17605g(r11, r6)
                long r2 = r4.mo17600b(r2)
                long r0 = r0 + r2
                long r0 = r0 - r11
            L_0x0079:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.C2010b.m8781x(long):long");
        }

        /* renamed from: y */
        private static boolean m8782y(C4257c cVar) {
            return cVar.f23650d && cVar.f23651e != -9223372036854775807L && cVar.f23648b == -9223372036854775807L;
        }

        /* renamed from: f */
        public int mo6809f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f5772f) >= 0 && intValue < mo6760m()) {
                return intValue;
            }
            return -1;
        }

        /* renamed from: k */
        public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
            C5917a.m34870c(i, 0, mo6760m());
            Integer num = null;
            String str = z ? this.f5776r.mo17624d(i).f23682a : null;
            if (z) {
                num = Integer.valueOf(this.f5772f + i);
            }
            return bVar.mo21472v(str, num, 0, this.f5776r.mo17627g(i), C5953m0.m35071B0(this.f5776r.mo17624d(i).f23683b - this.f5776r.mo17624d(0).f23683b) - this.f5773g);
        }

        /* renamed from: m */
        public int mo6760m() {
            return this.f5776r.mo17625e();
        }

        /* renamed from: q */
        public Object mo6813q(int i) {
            C5917a.m34870c(i, 0, mo6760m());
            return Integer.valueOf(this.f5772f + i);
        }

        /* renamed from: s */
        public C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
            C5917a.m34870c(i, 0, 1);
            long x = m8781x(j);
            Object obj = C6266q3.C6270d.f30198z;
            C6300z1 z1Var = this.f5777s;
            C4257c cVar = this.f5776r;
            return dVar.mo21482j(obj, z1Var, cVar, this.f5769c, this.f5770d, this.f5771e, true, m8782y(cVar), this.f5778t, x, this.f5774h, 0, mo6760m() - 1, this.f5773g);
        }

        /* renamed from: t */
        public int mo6761t() {
            return 1;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    private final class C2011c implements C2026e.C2028b {
        private C2011c() {
        }

        /* renamed from: a */
        public void mo7734a() {
            DashMediaSource.this.mo7725U();
        }

        /* renamed from: b */
        public void mo7735b(long j) {
            DashMediaSource.this.mo7724T(j);
        }

        /* synthetic */ C2011c(DashMediaSource dashMediaSource, C2009a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    static final class C2012d implements C5823j0.C5824a<Long> {

        /* renamed from: a */
        private static final Pattern f5780a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        C2012d() {
        }

        /* renamed from: b */
        public Long mo216a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, C6415d.f30664c)).readLine();
            try {
                Matcher matcher = f5780a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                throw C6249m2.m36663c("Couldn't parse timestamp: " + readLine, (Throwable) null);
            } catch (ParseException e) {
                throw C6249m2.m36663c((String) null, e);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    private final class C2013e implements C5810h0.C5812b<C5823j0<C4257c>> {
        private C2013e() {
        }

        /* renamed from: a */
        public void mo6784q(C5823j0<C4257c> j0Var, long j, long j2, boolean z) {
            DashMediaSource.this.mo7726V(j0Var, j, j2);
        }

        /* renamed from: b */
        public void mo6780j(C5823j0<C4257c> j0Var, long j, long j2) {
            DashMediaSource.this.mo7727W(j0Var, j, j2);
        }

        /* renamed from: c */
        public C5810h0.C5813c mo6783o(C5823j0<C4257c> j0Var, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo7728X(j0Var, j, j2, iOException, i);
        }

        /* synthetic */ C2013e(DashMediaSource dashMediaSource, C2009a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    final class C2014f implements C5820i0 {
        C2014f() {
        }

        /* renamed from: a */
        private void m8799a() throws IOException {
            if (DashMediaSource.this.f5737K != null) {
                throw DashMediaSource.this.f5737K;
            }
        }

        /* renamed from: b */
        public void mo7740b() throws IOException {
            DashMediaSource.this.f5735I.mo7740b();
            m8799a();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    private final class C2015g implements C5810h0.C5812b<C5823j0<Long>> {
        private C2015g() {
        }

        /* renamed from: a */
        public void mo6784q(C5823j0<Long> j0Var, long j, long j2, boolean z) {
            DashMediaSource.this.mo7726V(j0Var, j, j2);
        }

        /* renamed from: b */
        public void mo6780j(C5823j0<Long> j0Var, long j, long j2) {
            DashMediaSource.this.mo7729Y(j0Var, j, j2);
        }

        /* renamed from: c */
        public C5810h0.C5813c mo6783o(C5823j0<Long> j0Var, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.mo7730Z(j0Var, j, j2, iOException);
        }

        /* synthetic */ C2015g(DashMediaSource dashMediaSource, C2009a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    private static final class C2016h implements C5823j0.C5824a<Long> {
        private C2016h() {
        }

        /* renamed from: b */
        public Long mo216a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(C5953m0.m35085I0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ C2016h(C2009a aVar) {
            this();
        }
    }

    static {
        C6260o1.m36802a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(C6300z1 z1Var, C4257c cVar, C5828l.C5829a aVar, C5823j0.C5824a aVar2, C2017a.C2018a aVar3, C1712i iVar, C4052y yVar, C5804g0 g0Var, long j, C2009a aVar4) {
        this(z1Var, cVar, aVar, aVar2, aVar3, iVar, yVar, g0Var, j);
    }

    /* renamed from: L */
    private static long m8747L(C4262g gVar, long j, long j2) {
        C4262g gVar2 = gVar;
        long j3 = j;
        long j4 = j2;
        long B0 = C5953m0.m35071B0(gVar2.f23683b);
        boolean P = m8751P(gVar);
        long j5 = Long.MAX_VALUE;
        for (int i = 0; i < gVar2.f23684c.size(); i++) {
            C4255a aVar = gVar2.f23684c.get(i);
            List<C4265j> list = aVar.f23639c;
            if ((!P || aVar.f23638b != 3) && !list.isEmpty()) {
                C4235f l = list.get(0).mo17688l();
                if (l == null) {
                    return B0 + j3;
                }
                long k = l.mo17609k(j3, j4);
                if (k == 0) {
                    return B0;
                }
                long d = (l.mo17602d(j3, j4) + k) - 1;
                j5 = Math.min(j5, l.mo17601c(d, j3) + l.mo17600b(d) + B0);
            }
        }
        return j5;
    }

    /* renamed from: M */
    private static long m8748M(C4262g gVar, long j, long j2) {
        C4262g gVar2 = gVar;
        long j3 = j;
        long j4 = j2;
        long B0 = C5953m0.m35071B0(gVar2.f23683b);
        boolean P = m8751P(gVar);
        long j5 = B0;
        for (int i = 0; i < gVar2.f23684c.size(); i++) {
            C4255a aVar = gVar2.f23684c.get(i);
            List<C4265j> list = aVar.f23639c;
            if ((!P || aVar.f23638b != 3) && !list.isEmpty()) {
                C4235f l = list.get(0).mo17688l();
                if (l == null || l.mo17609k(j3, j4) == 0) {
                    return B0;
                }
                j5 = Math.max(j5, l.mo17600b(l.mo17602d(j3, j4)) + B0);
            }
        }
        return j5;
    }

    /* renamed from: N */
    private static long m8749N(C4257c cVar, long j) {
        C4235f l;
        C4257c cVar2 = cVar;
        int e = cVar.mo17625e() - 1;
        C4262g d = cVar2.mo17624d(e);
        long B0 = C5953m0.m35071B0(d.f23683b);
        long g = cVar2.mo17627g(e);
        long B02 = C5953m0.m35071B0(j);
        long B03 = C5953m0.m35071B0(cVar2.f23647a);
        long B04 = C5953m0.m35071B0(5000);
        for (int i = 0; i < d.f23684c.size(); i++) {
            List<C4265j> list = d.f23684c.get(i).f23639c;
            if (!list.isEmpty() && (l = list.get(0).mo17688l()) != null) {
                long e2 = ((B03 + B0) + l.mo17603e(g, B02)) - B02;
                if (e2 < B04 - 100000 || (e2 > B04 && e2 < B04 + 100000)) {
                    B04 = e2;
                }
            }
        }
        return C9874c.m50646b(B04, 1000, RoundingMode.CEILING);
    }

    /* renamed from: O */
    private long m8750O() {
        return (long) Math.min((this.f5747b0 - 1) * AdError.NETWORK_ERROR_CODE, 5000);
    }

    /* renamed from: P */
    private static boolean m8751P(C4262g gVar) {
        for (int i = 0; i < gVar.f23684c.size(); i++) {
            int i2 = gVar.f23684c.get(i).f23638b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    private static boolean m8752Q(C4262g gVar) {
        for (int i = 0; i < gVar.f23684c.size(); i++) {
            C4235f l = gVar.f23684c.get(i).f23639c.get(0).mo17688l();
            if (l == null || l.mo17606h()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m8753R() {
        m8757c0(false);
    }

    /* renamed from: S */
    private void m8754S() {
        C5924d0.m34951j(this.f5735I, new C2009a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m8755a0(IOException iOException) {
        C5961r.m35210d("DashMediaSource", "Failed to resolve time offset.", iOException);
        m8757c0(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m8756b0(long j) {
        this.f5746a0 = j;
        m8757c0(true);
    }

    /* renamed from: c0 */
    private void m8757c0(boolean z) {
        long j;
        long j2;
        C4262g gVar;
        for (int i = 0; i < this.f5729C.size(); i++) {
            int keyAt = this.f5729C.keyAt(i);
            if (keyAt >= this.f5749d0) {
                this.f5729C.valueAt(i).mo7750K(this.f5742P, keyAt - this.f5749d0);
            }
        }
        C4262g d = this.f5742P.mo17624d(0);
        int e = this.f5742P.mo17625e() - 1;
        C4262g d2 = this.f5742P.mo17624d(e);
        long g = this.f5742P.mo17627g(e);
        long B0 = C5953m0.m35071B0(C5953m0.m35121a0(this.f5746a0));
        long M = m8748M(d, this.f5742P.mo17627g(0), B0);
        long L = m8747L(d2, g, B0);
        boolean z2 = this.f5742P.f23650d && !m8752Q(d2);
        if (z2) {
            long j3 = this.f5742P.f23652f;
            if (j3 != -9223372036854775807L) {
                M = Math.max(M, L - C5953m0.m35071B0(j3));
            }
        }
        long j4 = L - M;
        C4257c cVar = this.f5742P;
        C4262g gVar2 = d;
        if (cVar.f23650d) {
            C5917a.m34873f(cVar.f23647a != -9223372036854775807L);
            long B02 = (B0 - C5953m0.m35071B0(this.f5742P.f23647a)) - M;
            m8764j0(B02, j4);
            long Y0 = this.f5742P.f23647a + C5953m0.m35117Y0(M);
            long B03 = B02 - C5953m0.m35071B0(this.f5739M.f30445a);
            long min = Math.min(5000000, j4 / 2);
            j2 = Y0;
            j = B03 < min ? min : B03;
            gVar = gVar2;
        } else {
            gVar = gVar2;
            j2 = -9223372036854775807L;
            j = 0;
        }
        long B04 = M - C5953m0.m35071B0(gVar.f23683b);
        C4257c cVar2 = this.f5742P;
        mo6652D(new C2010b(cVar2.f23647a, j2, this.f5746a0, this.f5749d0, B04, j4, j, cVar2, this.f5750h, cVar2.f23650d ? this.f5739M : null));
        if (!this.f5751i) {
            this.f5738L.removeCallbacks(this.f5731E);
            if (z2) {
                this.f5738L.postDelayed(this.f5731E, m8749N(this.f5742P, C5953m0.m35121a0(this.f5746a0)));
            }
            if (this.f5743Q) {
                m8763i0();
            } else if (z) {
                C4257c cVar3 = this.f5742P;
                if (cVar3.f23650d) {
                    long j5 = cVar3.f23651e;
                    if (j5 != -9223372036854775807L) {
                        if (j5 == 0) {
                            j5 = 5000;
                        }
                        m8761g0(Math.max(0, (this.f5744R + j5) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    /* renamed from: d0 */
    private void m8758d0(C4278o oVar) {
        String str = oVar.f23737a;
        if (C5953m0.m35124c(str, "urn:mpeg:dash:utc:direct:2014") || C5953m0.m35124c(str, "urn:mpeg:dash:utc:direct:2012")) {
            m8759e0(oVar);
        } else if (C5953m0.m35124c(str, "urn:mpeg:dash:utc:http-iso:2014") || C5953m0.m35124c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            m8760f0(oVar, new C2012d());
        } else if (C5953m0.m35124c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || C5953m0.m35124c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            m8760f0(oVar, new C2016h((C2009a) null));
        } else if (C5953m0.m35124c(str, "urn:mpeg:dash:utc:ntp:2014") || C5953m0.m35124c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m8754S();
        } else {
            m8755a0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* renamed from: e0 */
    private void m8759e0(C4278o oVar) {
        try {
            m8756b0(C5953m0.m35085I0(oVar.f23738b) - this.f5745S);
        } catch (C6249m2 e) {
            m8755a0(e);
        }
    }

    /* renamed from: f0 */
    private void m8760f0(C4278o oVar, C5823j0.C5824a<Long> aVar) {
        m8762h0(new C5823j0(this.f5734H, Uri.parse(oVar.f23738b), 5, aVar), new C2015g(this, (C2009a) null), 1);
    }

    /* renamed from: g0 */
    private void m8761g0(long j) {
        this.f5738L.postDelayed(this.f5730D, j);
    }

    /* renamed from: h0 */
    private <T> void m8762h0(C5823j0<T> j0Var, C5810h0.C5812b<C5823j0<T>> bVar, int i) {
        this.f5759y.mo6731z(new C1748q(j0Var.f28845a, j0Var.f28846b, this.f5735I.mo20341n(j0Var, bVar, i)), j0Var.f28847c);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m8763i0() {
        Uri uri;
        this.f5738L.removeCallbacks(this.f5730D);
        if (!this.f5735I.mo20336i()) {
            if (this.f5735I.mo20337j()) {
                this.f5743Q = true;
                return;
            }
            synchronized (this.f5728B) {
                uri = this.f5740N;
            }
            this.f5743Q = false;
            m8762h0(new C5823j0(this.f5734H, uri, 4, this.f5760z), this.f5727A, this.f5756v.mo20332d(4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d1  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8764j0(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            long r5 = p161w3.C5953m0.m35117Y0(r18)
            z1.z1 r1 = r0.f5750h
            z1.z1$g r1 = r1.f30393d
            long r1 = r1.f30447c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            long r1 = java.lang.Math.min(r5, r1)
        L_0x0019:
            r9 = r1
            goto L_0x002d
        L_0x001b:
            f3.c r1 = r0.f5742P
            f3.l r1 = r1.f23656j
            if (r1 == 0) goto L_0x002c
            long r1 = r1.f23729c
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x0019
        L_0x002c:
            r9 = r5
        L_0x002d:
            long r1 = r18 - r20
            long r1 = p161w3.C5953m0.m35117Y0(r1)
            r3 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x003e
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r1 = r3
        L_0x003e:
            f3.c r3 = r0.f5742P
            long r3 = r3.f23649c
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            long r1 = r1 + r3
            long r1 = java.lang.Math.min(r1, r5)
        L_0x004b:
            r3 = r1
            z1.z1 r1 = r0.f5750h
            z1.z1$g r1 = r1.f30393d
            long r1 = r1.f30446b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x005b
            long r3 = p161w3.C5953m0.m35154r(r1, r3, r5)
            goto L_0x006b
        L_0x005b:
            f3.c r1 = r0.f5742P
            f3.l r1 = r1.f23656j
            if (r1 == 0) goto L_0x006b
            long r1 = r1.f23728b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x006b
            long r3 = p161w3.C5953m0.m35154r(r1, r3, r5)
        L_0x006b:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0070
            r9 = r3
        L_0x0070:
            z1.z1$g r1 = r0.f5739M
            long r1 = r1.f30445a
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            f3.c r1 = r0.f5742P
            f3.l r2 = r1.f23656j
            if (r2 == 0) goto L_0x0087
            long r5 = r2.f23727a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r1 = r5
            goto L_0x0090
        L_0x0087:
            long r1 = r1.f23653g
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            long r1 = r0.f5758x
        L_0x0090:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0095
            r1 = r3
        L_0x0095:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            r1 = 5000000(0x4c4b40, double:2.470328E-317)
            r5 = 2
            long r5 = r20 / r5
            long r1 = java.lang.Math.min(r1, r5)
            long r1 = r18 - r1
            long r11 = p161w3.C5953m0.m35117Y0(r1)
            r13 = r3
            r15 = r9
            long r1 = p161w3.C5953m0.m35154r(r11, r13, r15)
        L_0x00b0:
            z1.z1 r5 = r0.f5750h
            z1.z1$g r5 = r5.f30393d
            float r6 = r5.f30448d
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00be
            goto L_0x00ca
        L_0x00be:
            f3.c r6 = r0.f5742P
            f3.l r6 = r6.f23656j
            if (r6 == 0) goto L_0x00c7
            float r6 = r6.f23730d
            goto L_0x00ca
        L_0x00c7:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00ca:
            float r5 = r5.f30449e
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00d1
            goto L_0x00dd
        L_0x00d1:
            f3.c r5 = r0.f5742P
            f3.l r5 = r5.f23656j
            if (r5 == 0) goto L_0x00da
            float r5 = r5.f23731e
            goto L_0x00dd
        L_0x00da:
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00dd:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00f7
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00f7
            f3.c r11 = r0.f5742P
            f3.l r11 = r11.f23656j
            if (r11 == 0) goto L_0x00f3
            long r13 = r11.f23727a
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x00f7
        L_0x00f3:
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00f7:
            z1.z1$g$a r7 = new z1.z1$g$a
            r7.<init>()
            z1.z1$g$a r1 = r7.mo21616k(r1)
            z1.z1$g$a r1 = r1.mo21614i(r3)
            z1.z1$g$a r1 = r1.mo21612g(r9)
            z1.z1$g$a r1 = r1.mo21615j(r6)
            z1.z1$g$a r1 = r1.mo21613h(r5)
            z1.z1$g r1 = r1.mo21611f()
            r0.f5739M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m8764j0(long, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        this.f5736J = p0Var;
        this.f5755u.mo17207H();
        this.f5755u.mo17210c(Looper.myLooper(), mo6649A());
        if (this.f5751i) {
            m8757c0(false);
            return;
        }
        this.f5734H = this.f5752r.mo20353a();
        this.f5735I = new C5810h0("DashMediaSource");
        this.f5738L = C5953m0.m35164w();
        m8763i0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        this.f5743Q = false;
        this.f5734H = null;
        C5810h0 h0Var = this.f5735I;
        if (h0Var != null) {
            h0Var.mo20339l();
            this.f5735I = null;
        }
        this.f5744R = 0;
        this.f5745S = 0;
        this.f5742P = this.f5751i ? this.f5742P : null;
        this.f5740N = this.f5741O;
        this.f5737K = null;
        Handler handler = this.f5738L;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f5738L = null;
        }
        this.f5746a0 = -9223372036854775807L;
        this.f5747b0 = 0;
        this.f5748c0 = -9223372036854775807L;
        this.f5749d0 = 0;
        this.f5729C.clear();
        this.f5757w.mo17598i();
        this.f5755u.mo17208a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo7724T(long j) {
        long j2 = this.f5748c0;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.f5748c0 = j;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo7725U() {
        this.f5738L.removeCallbacks(this.f5731E);
        m8763i0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo7726V(C5823j0<?> j0Var, long j, long j2) {
        C5823j0<?> j0Var2 = j0Var;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        this.f5756v.mo20330b(j0Var2.f28845a);
        this.f5759y.mo6722q(qVar, j0Var2.f28847c);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7727W(p155v3.C5823j0<p045f3.C4257c> r19, long r20, long r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r14 = r20
            b3.q r12 = new b3.q
            long r3 = r0.f28845a
            v3.p r5 = r0.f28846b
            android.net.Uri r6 = r19.mo20352f()
            java.util.Map r7 = r19.mo20350d()
            long r16 = r19.mo20349a()
            r2 = r12
            r8 = r20
            r10 = r22
            r14 = r12
            r12 = r16
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            v3.g0 r2 = r1.f5756v
            long r3 = r0.f28845a
            r2.mo20330b(r3)
            b3.e0$a r2 = r1.f5759y
            int r3 = r0.f28847c
            r2.mo6725t(r14, r3)
            java.lang.Object r2 = r19.mo20351e()
            f3.c r2 = (p045f3.C4257c) r2
            f3.c r3 = r1.f5742P
            r4 = 0
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x0042
        L_0x003e:
            int r3 = r3.mo17625e()
        L_0x0042:
            f3.g r5 = r2.mo17624d(r4)
            long r5 = r5.f23683b
            r7 = 0
        L_0x0049:
            if (r7 >= r3) goto L_0x005a
            f3.c r8 = r1.f5742P
            f3.g r8 = r8.mo17624d(r7)
            long r8 = r8.f23683b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x005a
            int r7 = r7 + 1
            goto L_0x0049
        L_0x005a:
            boolean r5 = r2.f23650d
            r6 = 1
            if (r5 == 0) goto L_0x00cd
            int r5 = r3 - r7
            int r8 = r2.mo17625e()
            if (r5 <= r8) goto L_0x0070
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
            p161w3.C5961r.m35215i(r5, r8)
        L_0x006e:
            r5 = 1
            goto L_0x00a9
        L_0x0070:
            long r8 = r1.f5748c0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a8
            long r10 = r2.f23654h
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x00a8
            java.lang.String r5 = "DashMediaSource"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Loaded stale dynamic manifest: "
            r8.append(r9)
            long r9 = r2.f23654h
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            long r9 = r1.f5748c0
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p161w3.C5961r.m35215i(r5, r8)
            goto L_0x006e
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            if (r5 == 0) goto L_0x00cb
            int r2 = r1.f5747b0
            int r3 = r2 + 1
            r1.f5747b0 = r3
            v3.g0 r3 = r1.f5756v
            int r0 = r0.f28847c
            int r0 = r3.mo20332d(r0)
            if (r2 >= r0) goto L_0x00c3
            long r2 = r18.m8750O()
            r1.m8761g0(r2)
            goto L_0x00ca
        L_0x00c3:
            e3.c r0 = new e3.c
            r0.<init>()
            r1.f5737K = r0
        L_0x00ca:
            return
        L_0x00cb:
            r1.f5747b0 = r4
        L_0x00cd:
            r1.f5742P = r2
            boolean r5 = r1.f5743Q
            boolean r2 = r2.f23650d
            r2 = r2 & r5
            r1.f5743Q = r2
            r8 = r20
            long r10 = r8 - r22
            r1.f5744R = r10
            r1.f5745S = r8
            java.lang.Object r2 = r1.f5728B
            monitor-enter(r2)
            v3.p r5 = r0.f28846b     // Catch:{ all -> 0x011b }
            android.net.Uri r5 = r5.f28881a     // Catch:{ all -> 0x011b }
            android.net.Uri r8 = r1.f5740N     // Catch:{ all -> 0x011b }
            if (r5 != r8) goto L_0x00ea
            r4 = 1
        L_0x00ea:
            if (r4 == 0) goto L_0x00f9
            f3.c r4 = r1.f5742P     // Catch:{ all -> 0x011b }
            android.net.Uri r4 = r4.f23657k     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x00f3
            goto L_0x00f7
        L_0x00f3:
            android.net.Uri r4 = r19.mo20352f()     // Catch:{ all -> 0x011b }
        L_0x00f7:
            r1.f5740N = r4     // Catch:{ all -> 0x011b }
        L_0x00f9:
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            if (r3 != 0) goto L_0x0112
            f3.c r0 = r1.f5742P
            boolean r2 = r0.f23650d
            if (r2 == 0) goto L_0x010e
            f3.o r0 = r0.f23655i
            if (r0 == 0) goto L_0x010a
            r1.m8758d0(r0)
            goto L_0x011a
        L_0x010a:
            r18.m8754S()
            goto L_0x011a
        L_0x010e:
            r1.m8757c0(r6)
            goto L_0x011a
        L_0x0112:
            int r0 = r1.f5749d0
            int r0 = r0 + r7
            r1.f5749d0 = r0
            r1.m8757c0(r6)
        L_0x011a:
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.mo7727W(v3.j0, long, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public C5810h0.C5813c mo7728X(C5823j0<C4257c> j0Var, long j, long j2, IOException iOException, int i) {
        C5810h0.C5813c cVar;
        C5823j0<C4257c> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        long c = this.f5756v.mo20331c(new C5804g0.C5807c(qVar, new C1759t(j0Var2.f28847c), iOException2, i));
        if (c == -9223372036854775807L) {
            cVar = C5810h0.f28824g;
        } else {
            cVar = C5810h0.m34569h(false, c);
        }
        boolean z = !cVar.mo20342c();
        this.f5759y.mo6729x(qVar, j0Var2.f28847c, iOException2, z);
        if (z) {
            this.f5756v.mo20330b(j0Var2.f28845a);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo7729Y(C5823j0<Long> j0Var, long j, long j2) {
        C5823j0<Long> j0Var2 = j0Var;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        this.f5756v.mo20330b(j0Var2.f28845a);
        this.f5759y.mo6725t(qVar, j0Var2.f28847c);
        m8756b0(j0Var.mo20351e().longValue() - j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C5810h0.C5813c mo7730Z(C5823j0<Long> j0Var, long j, long j2, IOException iOException) {
        C5823j0<Long> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        C1700e0.C1701a aVar = this.f5759y;
        C1748q qVar = r4;
        C1748q qVar2 = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        aVar.mo6729x(qVar, j0Var2.f28847c, iOException2, true);
        this.f5756v.mo20330b(j0Var2.f28845a);
        m8755a0(iOException2);
        return C5810h0.f28823f;
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        C2019b bVar = (C2019b) uVar;
        bVar.mo7749G();
        this.f5729C.remove(bVar.f5792a);
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5750h;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C1772x.C1774b bVar3 = bVar;
        int intValue = ((Integer) bVar3.f5270a).intValue() - this.f5749d0;
        int i = intValue;
        C1700e0.C1701a x = mo6668x(bVar3, this.f5742P.mo17624d(intValue).f23683b);
        C4048w.C4049a u = mo6665u(bVar);
        C2019b bVar4 = r2;
        C2019b bVar5 = new C2019b(intValue + this.f5749d0, this.f5742P, this.f5757w, i, this.f5753s, this.f5736J, this.f5755u, u, this.f5756v, x, this.f5746a0, this.f5733G, bVar2, this.f5754t, this.f5732F, mo6649A());
        C2019b bVar6 = bVar4;
        this.f5729C.put(bVar6.f5792a, bVar6);
        return bVar6;
    }

    /* renamed from: l */
    public void mo6710l() throws IOException {
        this.f5733G.mo7740b();
    }

    private DashMediaSource(C6300z1 z1Var, C4257c cVar, C5828l.C5829a aVar, C5823j0.C5824a<? extends C4257c> aVar2, C2017a.C2018a aVar3, C1712i iVar, C4052y yVar, C5804g0 g0Var, long j) {
        this.f5750h = z1Var;
        this.f5739M = z1Var.f30393d;
        this.f5740N = ((C6300z1.C6311h) C5917a.m34872e(z1Var.f30391b)).f30455a;
        this.f5741O = z1Var.f30391b.f30455a;
        this.f5742P = cVar;
        this.f5752r = aVar;
        this.f5760z = aVar2;
        this.f5753s = aVar3;
        this.f5755u = yVar;
        this.f5756v = g0Var;
        this.f5758x = j;
        this.f5754t = iVar;
        this.f5757w = new C4233b();
        boolean z = cVar != null;
        this.f5751i = z;
        this.f5759y = mo6667w((C1772x.C1774b) null);
        this.f5728B = new Object();
        this.f5729C = new SparseArray<>();
        this.f5732F = new C2011c(this, (C2009a) null);
        this.f5748c0 = -9223372036854775807L;
        this.f5746a0 = -9223372036854775807L;
        if (z) {
            C5917a.m34873f(true ^ cVar.f23650d);
            this.f5727A = null;
            this.f5730D = null;
            this.f5731E = null;
            this.f5733G = new C5820i0.C5821a();
            return;
        }
        this.f5727A = new C2013e(this, (C2009a) null);
        this.f5733G = new C2014f();
        this.f5730D = new C9957d(this);
        this.f5731E = new C9958e(this);
    }
}
