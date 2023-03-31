package p004a2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p004a2.C0016c;
import p004a2.C0075t1;
import p014b2.C1624e;
import p014b2.C1660t;
import p015b3.C1748q;
import p015b3.C1759t;
import p015b3.C1772x;
import p021c2.C1846e;
import p021c2.C1852i;
import p030d2.C4021h;
import p030d2.C4035m;
import p030d2.C4042o;
import p030d2.C4046p0;
import p079k3.C4868e;
import p120q2.C5380m;
import p120q2.C5382o;
import p127r2.C5432a;
import p155v3.C5788a0;
import p155v3.C5791b0;
import p155v3.C5794c0;
import p155v3.C5842q0;
import p155v3.C5854y;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5974y;
import p167x3.C6076z;
import p177z1.C6214e2;
import p177z1.C6227i;
import p177z1.C6249m2;
import p177z1.C6259o;
import p177z1.C6264q;
import p177z1.C6265q2;
import p177z1.C6266q3;
import p177z1.C6272r1;
import p177z1.C6280t2;
import p177z1.C6282u2;
import p177z1.C6290v3;
import p177z1.C6300z1;
import p190b7.C6685q;
import p190b7.C6695s0;

/* renamed from: a2.s1 */
/* compiled from: MediaMetricsListener */
public final class C0070s1 implements C0016c, C0075t1.C0076a {

    /* renamed from: A */
    private boolean f184A;

    /* renamed from: a */
    private final Context f185a;

    /* renamed from: b */
    private final C0075t1 f186b;

    /* renamed from: c */
    private final PlaybackSession f187c;

    /* renamed from: d */
    private final long f188d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private final C6266q3.C6270d f189e = new C6266q3.C6270d();

    /* renamed from: f */
    private final C6266q3.C6268b f190f = new C6266q3.C6268b();

    /* renamed from: g */
    private final HashMap<String, Long> f191g = new HashMap<>();

    /* renamed from: h */
    private final HashMap<String, Long> f192h = new HashMap<>();

    /* renamed from: i */
    private String f193i;

    /* renamed from: j */
    private PlaybackMetrics.Builder f194j;

    /* renamed from: k */
    private int f195k;

    /* renamed from: l */
    private int f196l = 0;

    /* renamed from: m */
    private int f197m = 0;

    /* renamed from: n */
    private C6265q2 f198n;

    /* renamed from: o */
    private C0072b f199o;

    /* renamed from: p */
    private C0072b f200p;

    /* renamed from: q */
    private C0072b f201q;

    /* renamed from: r */
    private C6272r1 f202r;

    /* renamed from: s */
    private C6272r1 f203s;

    /* renamed from: t */
    private C6272r1 f204t;

    /* renamed from: u */
    private boolean f205u;

    /* renamed from: v */
    private int f206v;

    /* renamed from: w */
    private boolean f207w;

    /* renamed from: x */
    private int f208x;

    /* renamed from: y */
    private int f209y;

    /* renamed from: z */
    private int f210z;

    /* renamed from: a2.s1$a */
    /* compiled from: MediaMetricsListener */
    private static final class C0071a {

        /* renamed from: a */
        public final int f211a;

        /* renamed from: b */
        public final int f212b;

        public C0071a(int i, int i2) {
            this.f211a = i;
            this.f212b = i2;
        }
    }

    /* renamed from: a2.s1$b */
    /* compiled from: MediaMetricsListener */
    private static final class C0072b {

        /* renamed from: a */
        public final C6272r1 f213a;

        /* renamed from: b */
        public final int f214b;

        /* renamed from: c */
        public final String f215c;

        public C0072b(C6272r1 r1Var, int i, String str) {
            this.f213a = r1Var;
            this.f214b = i;
            this.f215c = str;
        }
    }

    private C0070s1(Context context, PlaybackSession playbackSession) {
        this.f185a = context.getApplicationContext();
        this.f187c = playbackSession;
        C0066r1 r1Var = new C0066r1();
        this.f186b = r1Var;
        r1Var.mo201d(this);
    }

    /* renamed from: A0 */
    private boolean m452A0(C0072b bVar) {
        return bVar != null && bVar.f215c.equals(this.f186b.mo198a());
    }

    /* renamed from: B0 */
    public static C0070s1 m453B0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C0070s1(context, mediaMetricsManager.createPlaybackSession());
    }

    /* renamed from: C0 */
    private void m454C0() {
        PlaybackMetrics.Builder builder = this.f194j;
        if (builder != null && this.f184A) {
            builder.setAudioUnderrunCount(this.f210z);
            this.f194j.setVideoFramesDropped(this.f208x);
            this.f194j.setVideoFramesPlayed(this.f209y);
            Long l = this.f191g.get(this.f193i);
            this.f194j.setNetworkTransferDurationMillis(l == null ? 0 : l.longValue());
            Long l2 = this.f192h.get(this.f193i);
            this.f194j.setNetworkBytesRead(l2 == null ? 0 : l2.longValue());
            this.f194j.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f187c.reportPlaybackMetrics(this.f194j.build());
        }
        this.f194j = null;
        this.f193i = null;
        this.f210z = 0;
        this.f208x = 0;
        this.f209y = 0;
        this.f202r = null;
        this.f203s = null;
        this.f204t = null;
        this.f184A = false;
    }

    /* renamed from: D0 */
    private static int m455D0(int i) {
        switch (C5953m0.m35108U(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /*6002*/:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /*6003*/:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: E0 */
    private static C4035m m456E0(C6685q<C6290v3.C6291a> qVar) {
        C4035m mVar;
        C6695s0<C6290v3.C6291a> l = qVar.iterator();
        while (l.hasNext()) {
            C6290v3.C6291a next = l.next();
            int i = 0;
            while (true) {
                if (i < next.f30361a) {
                    if (next.mo21564f(i) && (mVar = next.mo21560c(i).f30246w) != null) {
                        return mVar;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    /* renamed from: F0 */
    private static int m457F0(C4035m mVar) {
        for (int i = 0; i < mVar.f23115d; i++) {
            UUID uuid = mVar.mo17231e(i).f23117b;
            if (uuid.equals(C6227i.f29963d)) {
                return 3;
            }
            if (uuid.equals(C6227i.f29964e)) {
                return 2;
            }
            if (uuid.equals(C6227i.f29962c)) {
                return 6;
            }
        }
        return 1;
    }

    /* renamed from: G0 */
    private static C0071a m458G0(C6265q2 q2Var, Context context, boolean z) {
        boolean z2;
        int i;
        if (q2Var.f30179a == 1001) {
            return new C0071a(20, 0);
        }
        if (q2Var instanceof C6264q) {
            C6264q qVar = (C6264q) q2Var;
            z2 = qVar.f30171d == 1;
            i = qVar.f30175h;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) C5917a.m34872e(q2Var.getCause());
        if (th instanceof IOException) {
            if (th instanceof C5794c0) {
                return new C0071a(5, ((C5794c0) th).f28789d);
            }
            if ((th instanceof C5791b0) || (th instanceof C6249m2)) {
                return new C0071a(z ? 10 : 11, 0);
            } else if ((th instanceof C5788a0) || (th instanceof C5842q0.C5843a)) {
                if (C5974y.m35278d(context).mo20665f() == 1) {
                    return new C0071a(3, 0);
                }
                Throwable cause = th.getCause();
                if (cause instanceof UnknownHostException) {
                    return new C0071a(6, 0);
                }
                if (cause instanceof SocketTimeoutException) {
                    return new C0071a(7, 0);
                }
                if (!(th instanceof C5788a0) || ((C5788a0) th).f28782c != 1) {
                    return new C0071a(8, 0);
                }
                return new C0071a(4, 0);
            } else if (q2Var.f30179a == 1002) {
                return new C0071a(21, 0);
            } else {
                if (th instanceof C4042o.C4043a) {
                    Throwable th2 = (Throwable) C5917a.m34872e(th.getCause());
                    int i2 = C5953m0.f29110a;
                    if (i2 >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                        int V = C5953m0.m35110V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                        return new C0071a(m455D0(V), V);
                    } else if (i2 >= 23 && (th2 instanceof MediaDrmResetException)) {
                        return new C0071a(27, 0);
                    } else {
                        if (i2 >= 18 && (th2 instanceof NotProvisionedException)) {
                            return new C0071a(24, 0);
                        }
                        if (i2 >= 18 && (th2 instanceof DeniedByServerException)) {
                            return new C0071a(29, 0);
                        }
                        if (th2 instanceof C4046p0) {
                            return new C0071a(23, 0);
                        }
                        if (th2 instanceof C4021h.C4026e) {
                            return new C0071a(28, 0);
                        }
                        return new C0071a(30, 0);
                    }
                } else if (!(th instanceof C5854y.C5856b) || !(th.getCause() instanceof FileNotFoundException)) {
                    return new C0071a(9, 0);
                } else {
                    Throwable cause2 = ((Throwable) C5917a.m34872e(th.getCause())).getCause();
                    if (C5953m0.f29110a < 21 || !(cause2 instanceof ErrnoException) || ((ErrnoException) cause2).errno != OsConstants.EACCES) {
                        return new C0071a(31, 0);
                    }
                    return new C0071a(32, 0);
                }
            }
        } else if (z2 && (i == 0 || i == 1)) {
            return new C0071a(35, 0);
        } else {
            if (z2 && i == 3) {
                return new C0071a(15, 0);
            }
            if (z2 && i == 2) {
                return new C0071a(23, 0);
            }
            if (th instanceof C5382o.C5384b) {
                return new C0071a(13, C5953m0.m35110V(((C5382o.C5384b) th).f27600d));
            }
            if (th instanceof C5380m) {
                return new C0071a(14, C5953m0.m35110V(((C5380m) th).f27514b));
            }
            if (th instanceof OutOfMemoryError) {
                return new C0071a(14, 0);
            }
            if (th instanceof C1660t.C1662b) {
                return new C0071a(17, ((C1660t.C1662b) th).f4790a);
            }
            if (th instanceof C1660t.C1665e) {
                return new C0071a(18, ((C1660t.C1665e) th).f4795a);
            }
            if (C5953m0.f29110a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new C0071a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new C0071a(m455D0(errorCode), errorCode);
        }
    }

    /* renamed from: H0 */
    private static Pair<String, String> m459H0(String str) {
        String[] Q0 = C5953m0.m35101Q0(str, "-");
        return Pair.create(Q0[0], Q0.length >= 2 ? Q0[1] : null);
    }

    /* renamed from: J0 */
    private static int m460J0(Context context) {
        switch (C5974y.m35278d(context).mo20665f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
            default:
                return 1;
        }
    }

    /* renamed from: K0 */
    private static int m461K0(C6300z1 z1Var) {
        C6300z1.C6311h hVar = z1Var.f30391b;
        if (hVar == null) {
            return 0;
        }
        int p0 = C5953m0.m35151p0(hVar.f30455a, hVar.f30456b);
        if (p0 == 0) {
            return 3;
        }
        if (p0 != 1) {
            return p0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* renamed from: L0 */
    private static int m462L0(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: M0 */
    private void m463M0(C0016c.C0018b bVar) {
        for (int i = 0; i < bVar.mo137d(); i++) {
            int b = bVar.mo135b(i);
            C0016c.C0017a c = bVar.mo136c(b);
            if (b == 0) {
                this.f186b.mo199b(c);
            } else if (b == 11) {
                this.f186b.mo203f(c, this.f195k);
            } else {
                this.f186b.mo200c(c);
            }
        }
    }

    /* renamed from: N0 */
    private void m464N0(long j) {
        int J0 = m460J0(this.f185a);
        if (J0 != this.f197m) {
            this.f197m = J0;
            this.f187c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(J0).setTimeSinceCreatedMillis(j - this.f188d).build());
        }
    }

    /* renamed from: O0 */
    private void m465O0(long j) {
        C6265q2 q2Var = this.f198n;
        if (q2Var != null) {
            C0071a G0 = m458G0(q2Var, this.f185a, this.f206v == 4);
            this.f187c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.f188d).setErrorCode(G0.f211a).setSubErrorCode(G0.f212b).setException(q2Var).build());
            this.f184A = true;
            this.f198n = null;
        }
    }

    /* renamed from: P0 */
    private void m466P0(C6282u2 u2Var, C0016c.C0018b bVar, long j) {
        if (u2Var.mo21162N() != 2) {
            this.f205u = false;
        }
        if (u2Var.mo21189p() == null) {
            this.f207w = false;
        } else if (bVar.mo134a(10)) {
            this.f207w = true;
        }
        int X0 = m474X0(u2Var);
        if (this.f196l != X0) {
            this.f196l = X0;
            this.f184A = true;
            this.f187c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f196l).setTimeSinceCreatedMillis(j - this.f188d).build());
        }
    }

    /* renamed from: Q0 */
    private void m467Q0(C6282u2 u2Var, C0016c.C0018b bVar, long j) {
        if (bVar.mo134a(2)) {
            C6290v3 w = u2Var.mo21196w();
            boolean c = w.mo21556c(2);
            boolean c2 = w.mo21556c(1);
            boolean c3 = w.mo21556c(3);
            if (c || c2 || c3) {
                if (!c) {
                    m472V0(j, (C6272r1) null, 0);
                }
                if (!c2) {
                    m468R0(j, (C6272r1) null, 0);
                }
                if (!c3) {
                    m470T0(j, (C6272r1) null, 0);
                }
            }
        }
        if (m452A0(this.f199o)) {
            C0072b bVar2 = this.f199o;
            C6272r1 r1Var = bVar2.f213a;
            if (r1Var.f30249z != -1) {
                m472V0(j, r1Var, bVar2.f214b);
                this.f199o = null;
            }
        }
        if (m452A0(this.f200p)) {
            C0072b bVar3 = this.f200p;
            m468R0(j, bVar3.f213a, bVar3.f214b);
            this.f200p = null;
        }
        if (m452A0(this.f201q)) {
            C0072b bVar4 = this.f201q;
            m470T0(j, bVar4.f213a, bVar4.f214b);
            this.f201q = null;
        }
    }

    /* renamed from: R0 */
    private void m468R0(long j, C6272r1 r1Var, int i) {
        if (!C5953m0.m35124c(this.f203s, r1Var)) {
            int i2 = (this.f203s == null && i == 0) ? 1 : i;
            this.f203s = r1Var;
            m473W0(0, j, r1Var, i2);
        }
    }

    /* renamed from: S0 */
    private void m469S0(C6282u2 u2Var, C0016c.C0018b bVar) {
        C4035m E0;
        if (bVar.mo134a(0)) {
            C0016c.C0017a c = bVar.mo136c(0);
            if (this.f194j != null) {
                m471U0(c.f37b, c.f39d);
            }
        }
        if (!(!bVar.mo134a(2) || this.f194j == null || (E0 = m456E0(u2Var.mo21196w().mo21555b())) == null)) {
            ((PlaybackMetrics.Builder) C5953m0.m35138j(this.f194j)).setDrmType(m457F0(E0));
        }
        if (bVar.mo134a(1011)) {
            this.f210z++;
        }
    }

    /* renamed from: T0 */
    private void m470T0(long j, C6272r1 r1Var, int i) {
        if (!C5953m0.m35124c(this.f204t, r1Var)) {
            int i2 = (this.f204t == null && i == 0) ? 1 : i;
            this.f204t = r1Var;
            m473W0(2, j, r1Var, i2);
        }
    }

    /* renamed from: U0 */
    private void m471U0(C6266q3 q3Var, C1772x.C1774b bVar) {
        int f;
        PlaybackMetrics.Builder builder = this.f194j;
        if (bVar != null && (f = q3Var.mo6809f(bVar.f5270a)) != -1) {
            q3Var.mo21447j(f, this.f190f);
            q3Var.mo21450r(this.f190f.f30186c, this.f189e);
            builder.setStreamType(m461K0(this.f189e.f30201c));
            C6266q3.C6270d dVar = this.f189e;
            if (dVar.f30212v != -9223372036854775807L && !dVar.f30210t && !dVar.f30207i && !dVar.mo21480h()) {
                builder.setMediaDurationMillis(this.f189e.mo21478f());
            }
            builder.setPlaybackType(this.f189e.mo21480h() ? 2 : 1);
            this.f184A = true;
        }
    }

    /* renamed from: V0 */
    private void m472V0(long j, C6272r1 r1Var, int i) {
        if (!C5953m0.m35124c(this.f202r, r1Var)) {
            int i2 = (this.f202r == null && i == 0) ? 1 : i;
            this.f202r = r1Var;
            m473W0(1, j, r1Var, i2);
        }
    }

    /* renamed from: W0 */
    private void m473W0(int i, long j, C6272r1 r1Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f188d);
        if (r1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m462L0(i2));
            String str = r1Var.f30242s;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = r1Var.f30243t;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = r1Var.f30240i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = r1Var.f30239h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = r1Var.f30248y;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = r1Var.f30249z;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = r1Var.f30224G;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = r1Var.f30225H;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = r1Var.f30234c;
            if (str4 != null) {
                Pair<String, String> H0 = m459H0(str4);
                timeSinceCreatedMillis.setLanguage((String) H0.first);
                Object obj = H0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = r1Var.f30218A;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f184A = true;
        this.f187c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: X0 */
    private int m474X0(C6282u2 u2Var) {
        int N = u2Var.mo21162N();
        if (this.f205u) {
            return 5;
        }
        if (this.f207w) {
            return 13;
        }
        if (N == 4) {
            return 11;
        }
        if (N == 2) {
            int i = this.f196l;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (!u2Var.mo21183i()) {
                return 7;
            }
            return u2Var.mo21155C() != 0 ? 10 : 6;
        } else if (N == 3) {
            if (!u2Var.mo21183i()) {
                return 4;
            }
            if (u2Var.mo21155C() != 0) {
                return 9;
            }
            return 3;
        } else if (N != 1 || this.f196l == 0) {
            return this.f196l;
        } else {
            return 12;
        }
    }

    /* renamed from: A */
    public /* synthetic */ void mo58A(C0016c.C0017a aVar, int i, C1846e eVar) {
        C0013b.m116p(this, aVar, i, eVar);
    }

    /* renamed from: B */
    public /* synthetic */ void mo59B(C0016c.C0017a aVar, C1624e eVar) {
        C0013b.m87a(this, aVar, eVar);
    }

    /* renamed from: C */
    public /* synthetic */ void mo60C(C0016c.C0017a aVar, C6290v3 v3Var) {
        C0013b.m92c0(this, aVar, v3Var);
    }

    /* renamed from: D */
    public /* synthetic */ void mo61D(C0016c.C0017a aVar) {
        C0013b.m62B(this, aVar);
    }

    /* renamed from: E */
    public /* synthetic */ void mo62E(C0016c.C0017a aVar) {
        C0013b.m124x(this, aVar);
    }

    /* renamed from: F */
    public /* synthetic */ void mo63F(C0016c.C0017a aVar, C5432a aVar2) {
        C0013b.m72L(this, aVar, aVar2);
    }

    /* renamed from: G */
    public /* synthetic */ void mo64G(C0016c.C0017a aVar, String str, long j) {
        C0013b.m98f0(this, aVar, str, j);
    }

    /* renamed from: H */
    public /* synthetic */ void mo65H(C0016c.C0017a aVar, boolean z, int i) {
        C0013b.m73M(this, aVar, z, i);
    }

    /* renamed from: I */
    public /* synthetic */ void mo66I(C0016c.C0017a aVar, boolean z, int i) {
        C0013b.m79S(this, aVar, z, i);
    }

    /* renamed from: I0 */
    public LogSessionId mo209I0() {
        return this.f187c.getSessionId();
    }

    /* renamed from: J */
    public /* synthetic */ void mo67J(C0016c.C0017a aVar, C4868e eVar) {
        C0013b.m115o(this, aVar, eVar);
    }

    /* renamed from: K */
    public /* synthetic */ void mo68K(C0016c.C0017a aVar, String str, long j, long j2) {
        C0013b.m100g0(this, aVar, str, j, j2);
    }

    /* renamed from: L */
    public /* synthetic */ void mo69L(C0016c.C0017a aVar, int i, String str, long j) {
        C0013b.m118r(this, aVar, i, str, j);
    }

    /* renamed from: M */
    public void mo70M(C0016c.C0017a aVar, C6076z zVar) {
        C0072b bVar = this.f199o;
        if (bVar != null) {
            C6272r1 r1Var = bVar.f213a;
            if (r1Var.f30249z == -1) {
                this.f199o = new C0072b(r1Var.mo21483b().mo21522j0(zVar.f29445a).mo21503Q(zVar.f29446b).mo21491E(), bVar.f214b, bVar.f215c);
            }
        }
    }

    /* renamed from: N */
    public void mo71N(C0016c.C0017a aVar, int i, long j, long j2) {
        long j3;
        C1772x.C1774b bVar = aVar.f39d;
        if (bVar != null) {
            String e = this.f186b.mo202e(aVar.f37b, (C1772x.C1774b) C5917a.m34872e(bVar));
            Long l = this.f192h.get(e);
            Long l2 = this.f191g.get(e);
            HashMap<String, Long> hashMap = this.f192h;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(e, Long.valueOf(j3 + j));
            HashMap<String, Long> hashMap2 = this.f191g;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(e, Long.valueOf(j4 + ((long) i)));
        }
    }

    /* renamed from: O */
    public /* synthetic */ void mo72O(C0016c.C0017a aVar, long j) {
        C0013b.m105j(this, aVar, j);
    }

    /* renamed from: P */
    public /* synthetic */ void mo73P(C0016c.C0017a aVar, int i) {
        C0013b.m90b0(this, aVar, i);
    }

    /* renamed from: Q */
    public /* synthetic */ void mo74Q(C0016c.C0017a aVar, int i, long j) {
        C0013b.m63C(this, aVar, i, j);
    }

    /* renamed from: R */
    public void mo75R(C0016c.C0017a aVar, C6265q2 q2Var) {
        this.f198n = q2Var;
    }

    /* renamed from: S */
    public /* synthetic */ void mo76S(C0016c.C0017a aVar) {
        C0013b.m84X(this, aVar);
    }

    /* renamed from: T */
    public void mo210T(C0016c.C0017a aVar, String str) {
    }

    /* renamed from: U */
    public /* synthetic */ void mo77U(C0016c.C0017a aVar) {
        C0013b.m125y(this, aVar);
    }

    /* renamed from: V */
    public /* synthetic */ void mo78V(C0016c.C0017a aVar, int i) {
        C0013b.m82V(this, aVar, i);
    }

    /* renamed from: W */
    public void mo211W(C0016c.C0017a aVar, String str, boolean z) {
        C1772x.C1774b bVar = aVar.f39d;
        if ((bVar == null || !bVar.mo6886b()) && str.equals(this.f193i)) {
            m454C0();
        }
        this.f191g.remove(str);
        this.f192h.remove(str);
    }

    /* renamed from: X */
    public /* synthetic */ void mo79X(C0016c.C0017a aVar, C1846e eVar) {
        C0013b.m104i0(this, aVar, eVar);
    }

    /* renamed from: Y */
    public /* synthetic */ void mo80Y(C0016c.C0017a aVar, int i, int i2) {
        C0013b.m88a0(this, aVar, i, i2);
    }

    /* renamed from: Z */
    public /* synthetic */ void mo81Z(C0016c.C0017a aVar, C1748q qVar, C1759t tVar) {
        C0013b.m68H(this, aVar, qVar, tVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo82a(C0016c.C0017a aVar, int i) {
        C0013b.m80T(this, aVar, i);
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo83a0(C0016c.C0017a aVar) {
        C0013b.m78R(this, aVar);
    }

    /* renamed from: b */
    public /* synthetic */ void mo84b(C0016c.C0017a aVar, C6272r1 r1Var) {
        C0013b.m101h(this, aVar, r1Var);
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo85b0(C0016c.C0017a aVar, C6265q2 q2Var) {
        C0013b.m77Q(this, aVar, q2Var);
    }

    /* renamed from: c */
    public /* synthetic */ void mo86c(C0016c.C0017a aVar, boolean z) {
        C0013b.m69I(this, aVar, z);
    }

    /* renamed from: c0 */
    public void mo87c0(C6282u2 u2Var, C0016c.C0018b bVar) {
        if (bVar.mo137d() != 0) {
            m463M0(bVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m469S0(u2Var, bVar);
            m465O0(elapsedRealtime);
            m467Q0(u2Var, bVar, elapsedRealtime);
            m464N0(elapsedRealtime);
            m466P0(u2Var, bVar, elapsedRealtime);
            if (bVar.mo134a(1028)) {
                this.f186b.mo204g(bVar.mo136c(1028));
            }
        }
    }

    /* renamed from: d */
    public /* synthetic */ void mo88d(C0016c.C0017a aVar, int i) {
        C0013b.m76P(this, aVar, i);
    }

    /* renamed from: d0 */
    public /* synthetic */ void mo89d0(C0016c.C0017a aVar, C6282u2.C6284b bVar) {
        C0013b.m111m(this, aVar, bVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo90e(C0016c.C0017a aVar, C6300z1 z1Var, int i) {
        C0013b.m70J(this, aVar, z1Var, i);
    }

    /* renamed from: e0 */
    public /* synthetic */ void mo91e0(C0016c.C0017a aVar, Exception exc) {
        C0013b.m89b(this, aVar, exc);
    }

    /* renamed from: f */
    public /* synthetic */ void mo92f(C0016c.C0017a aVar, String str) {
        C0013b.m102h0(this, aVar, str);
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo93f0(C0016c.C0017a aVar, boolean z) {
        C0013b.m85Y(this, aVar, z);
    }

    /* renamed from: g */
    public void mo212g(C0016c.C0017a aVar, String str) {
        C1772x.C1774b bVar = aVar.f39d;
        if (bVar == null || !bVar.mo6886b()) {
            m454C0();
            this.f193i = str;
            this.f194j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            m471U0(aVar.f37b, aVar.f39d);
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo94g0(C0016c.C0017a aVar, int i, long j, long j2) {
        C0013b.m109l(this, aVar, i, j, j2);
    }

    /* renamed from: h */
    public /* synthetic */ void mo95h(C0016c.C0017a aVar, C1846e eVar) {
        C0013b.m99g(this, aVar, eVar);
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo96h0(C0016c.C0017a aVar) {
        C0013b.m122v(this, aVar);
    }

    /* renamed from: i */
    public /* synthetic */ void mo97i(C0016c.C0017a aVar, boolean z) {
        C0013b.m64D(this, aVar, z);
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo98i0(C0016c.C0017a aVar, int i, C6272r1 r1Var) {
        C0013b.m119s(this, aVar, i, r1Var);
    }

    /* renamed from: j */
    public void mo99j(C0016c.C0017a aVar, C6282u2.C6288e eVar, C6282u2.C6288e eVar2, int i) {
        if (i == 1) {
            this.f205u = true;
        }
        this.f195k = i;
    }

    /* renamed from: j0 */
    public void mo213j0(C0016c.C0017a aVar, String str, String str2) {
    }

    /* renamed from: k */
    public /* synthetic */ void mo100k(C0016c.C0017a aVar, C6272r1 r1Var, C1852i iVar) {
        C0013b.m110l0(this, aVar, r1Var, iVar);
    }

    /* renamed from: k0 */
    public /* synthetic */ void mo101k0(C0016c.C0017a aVar) {
        C0013b.m123w(this, aVar);
    }

    /* renamed from: l */
    public /* synthetic */ void mo102l(C0016c.C0017a aVar, float f) {
        C0013b.m114n0(this, aVar, f);
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo103l0(C0016c.C0017a aVar, C6272r1 r1Var, C1852i iVar) {
        C0013b.m103i(this, aVar, r1Var, iVar);
    }

    /* renamed from: m */
    public /* synthetic */ void mo104m(C0016c.C0017a aVar, int i, boolean z) {
        C0013b.m121u(this, aVar, i, z);
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo105m0(C0016c.C0017a aVar, int i, C1846e eVar) {
        C0013b.m117q(this, aVar, i, eVar);
    }

    /* renamed from: n */
    public /* synthetic */ void mo106n(C0016c.C0017a aVar, long j, int i) {
        C0013b.m106j0(this, aVar, j, i);
    }

    /* renamed from: n0 */
    public /* synthetic */ void mo107n0(C0016c.C0017a aVar, Exception exc) {
        C0013b.m96e0(this, aVar, exc);
    }

    /* renamed from: o */
    public /* synthetic */ void mo108o(C0016c.C0017a aVar, C1748q qVar, C1759t tVar) {
        C0013b.m66F(this, aVar, qVar, tVar);
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo109o0(C0016c.C0017a aVar, int i) {
        C0013b.m75O(this, aVar, i);
    }

    /* renamed from: p */
    public /* synthetic */ void mo110p(C0016c.C0017a aVar, int i) {
        C0013b.m126z(this, aVar, i);
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo111p0(C0016c.C0017a aVar, C6214e2 e2Var) {
        C0013b.m71K(this, aVar, e2Var);
    }

    /* renamed from: q */
    public /* synthetic */ void mo112q(C0016c.C0017a aVar, Exception exc) {
        C0013b.m61A(this, aVar, exc);
    }

    /* renamed from: q0 */
    public void mo113q0(C0016c.C0017a aVar, C1759t tVar) {
        if (aVar.f39d != null) {
            C0072b bVar = new C0072b((C6272r1) C5917a.m34872e(tVar.f5237c), tVar.f5238d, this.f186b.mo202e(aVar.f37b, (C1772x.C1774b) C5917a.m34872e(aVar.f39d)));
            int i = tVar.f5236b;
            if (i != 0) {
                if (i == 1) {
                    this.f200p = bVar;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.f201q = bVar;
                        return;
                    }
                    return;
                }
            }
            this.f199o = bVar;
        }
    }

    /* renamed from: r */
    public /* synthetic */ void mo114r(C0016c.C0017a aVar, String str, long j, long j2) {
        C0013b.m93d(this, aVar, str, j, j2);
    }

    /* renamed from: r0 */
    public /* synthetic */ void mo115r0(C0016c.C0017a aVar, Exception exc) {
        C0013b.m107k(this, aVar, exc);
    }

    /* renamed from: s */
    public /* synthetic */ void mo116s(C0016c.C0017a aVar, C1759t tVar) {
        C0013b.m94d0(this, aVar, tVar);
    }

    /* renamed from: s0 */
    public /* synthetic */ void mo117s0(C0016c.C0017a aVar, C1748q qVar, C1759t tVar) {
        C0013b.m67G(this, aVar, qVar, tVar);
    }

    /* renamed from: t */
    public void mo118t(C0016c.C0017a aVar, C1846e eVar) {
        this.f208x += eVar.f5423g;
        this.f209y += eVar.f5421e;
    }

    /* renamed from: t0 */
    public /* synthetic */ void mo119t0(C0016c.C0017a aVar, int i, int i2, int i3, float f) {
        C0013b.m112m0(this, aVar, i, i2, i3, f);
    }

    /* renamed from: u */
    public /* synthetic */ void mo120u(C0016c.C0017a aVar, boolean z) {
        C0013b.m86Z(this, aVar, z);
    }

    /* renamed from: u0 */
    public /* synthetic */ void mo121u0(C0016c.C0017a aVar, C6259o oVar) {
        C0013b.m120t(this, aVar, oVar);
    }

    /* renamed from: v */
    public void mo122v(C0016c.C0017a aVar, C1748q qVar, C1759t tVar, IOException iOException, boolean z) {
        this.f206v = tVar.f5235a;
    }

    /* renamed from: v0 */
    public /* synthetic */ void mo123v0(C0016c.C0017a aVar, boolean z) {
        C0013b.m65E(this, aVar, z);
    }

    /* renamed from: w */
    public /* synthetic */ void mo124w(C0016c.C0017a aVar, String str) {
        C0013b.m95e(this, aVar, str);
    }

    /* renamed from: w0 */
    public /* synthetic */ void mo125w0(C0016c.C0017a aVar, Object obj, long j) {
        C0013b.m81U(this, aVar, obj, j);
    }

    /* renamed from: x */
    public /* synthetic */ void mo126x(C0016c.C0017a aVar) {
        C0013b.m83W(this, aVar);
    }

    /* renamed from: x0 */
    public /* synthetic */ void mo127x0(C0016c.C0017a aVar, C1846e eVar) {
        C0013b.m97f(this, aVar, eVar);
    }

    /* renamed from: y */
    public /* synthetic */ void mo128y(C0016c.C0017a aVar, List list) {
        C0013b.m113n(this, aVar, list);
    }

    /* renamed from: y0 */
    public /* synthetic */ void mo129y0(C0016c.C0017a aVar, C6272r1 r1Var) {
        C0013b.m108k0(this, aVar, r1Var);
    }

    /* renamed from: z */
    public /* synthetic */ void mo130z(C0016c.C0017a aVar, String str, long j) {
        C0013b.m91c(this, aVar, str, j);
    }

    /* renamed from: z0 */
    public /* synthetic */ void mo131z0(C0016c.C0017a aVar, C6280t2 t2Var) {
        C0013b.m74N(this, aVar, t2Var);
    }
}
