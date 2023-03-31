package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wa4 implements o84, xa4 {

    /* renamed from: A */
    private C2388g4 f19547A;

    /* renamed from: B */
    private C2388g4 f19548B;

    /* renamed from: C */
    private boolean f19549C;

    /* renamed from: D */
    private boolean f19550D;

    /* renamed from: E */
    private int f19551E;

    /* renamed from: F */
    private int f19552F;

    /* renamed from: G */
    private int f19553G;

    /* renamed from: H */
    private boolean f19554H;

    /* renamed from: a */
    private final Context f19555a;

    /* renamed from: b */
    private final ya4 f19556b;

    /* renamed from: c */
    private final PlaybackSession f19557c;

    /* renamed from: d */
    private final long f19558d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private final fs0 f19559e = new fs0();

    /* renamed from: f */
    private final dq0 f19560f = new dq0();

    /* renamed from: g */
    private final HashMap f19561g = new HashMap();

    /* renamed from: h */
    private final HashMap f19562h = new HashMap();

    /* renamed from: i */
    private String f19563i;

    /* renamed from: r */
    private PlaybackMetrics.Builder f19564r;

    /* renamed from: s */
    private int f19565s;

    /* renamed from: t */
    private int f19566t = 0;

    /* renamed from: u */
    private int f19567u = 0;

    /* renamed from: v */
    private gc0 f19568v;

    /* renamed from: w */
    private va4 f19569w;

    /* renamed from: x */
    private va4 f19570x;

    /* renamed from: y */
    private va4 f19571y;

    /* renamed from: z */
    private C2388g4 f19572z;

    private wa4(Context context, PlaybackSession playbackSession) {
        this.f19555a = context.getApplicationContext();
        this.f19557c = playbackSession;
        ua4 ua4 = new ua4(ua4.f18477h);
        this.f19556b = ua4;
        ua4.mo14486d(this);
    }

    /* renamed from: g */
    public static wa4 m22647g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new wa4(context, mediaMetricsManager.createPlaybackSession());
    }

    /* renamed from: j */
    private static int m22648j(int i) {
        switch (gb2.m13152V(i)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: k */
    private final void m22649k() {
        long j;
        long j2;
        PlaybackMetrics.Builder builder = this.f19564r;
        if (builder != null && this.f19554H) {
            builder.setAudioUnderrunCount(this.f19553G);
            this.f19564r.setVideoFramesDropped(this.f19551E);
            this.f19564r.setVideoFramesPlayed(this.f19552F);
            Long l = (Long) this.f19561g.get(this.f19563i);
            PlaybackMetrics.Builder builder2 = this.f19564r;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(j);
            Long l2 = (Long) this.f19562h.get(this.f19563i);
            PlaybackMetrics.Builder builder3 = this.f19564r;
            if (l2 == null) {
                j2 = 0;
            } else {
                j2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(j2);
            this.f19564r.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.f19557c.reportPlaybackMetrics(this.f19564r.build());
        }
        this.f19564r = null;
        this.f19563i = null;
        this.f19553G = 0;
        this.f19551E = 0;
        this.f19552F = 0;
        this.f19572z = null;
        this.f19547A = null;
        this.f19548B = null;
        this.f19554H = false;
    }

    /* renamed from: m */
    private final void m22650m(long j, C2388g4 g4Var, int i) {
        if (!gb2.m13186t(this.f19547A, g4Var)) {
            int i2 = this.f19547A == null ? 1 : 0;
            this.f19547A = g4Var;
            m22654w(0, j, g4Var, i2);
        }
    }

    /* renamed from: o */
    private final void m22651o(long j, C2388g4 g4Var, int i) {
        if (!gb2.m13186t(this.f19548B, g4Var)) {
            int i2 = this.f19548B == null ? 1 : 0;
            this.f19548B = g4Var;
            m22654w(2, j, g4Var, i2);
        }
    }

    /* renamed from: r */
    private final void m22652r(gt0 gt0, mg4 mg4) {
        int a;
        PlaybackMetrics.Builder builder = this.f19564r;
        if (mg4 != null && (a = gt0.mo8899a(mg4.f12629a)) != -1) {
            int i = 0;
            gt0.mo8902d(a, this.f19560f, false);
            gt0.mo8903e(this.f19560f.f8361c, this.f19559e, 0);
            C3112zn znVar = this.f19559e.f9427b.f10509b;
            int i2 = 2;
            if (znVar != null) {
                int Z = gb2.m13156Z(znVar.f21169a);
                i = Z != 0 ? Z != 1 ? Z != 2 ? 1 : 4 : 5 : 3;
            }
            builder.setStreamType(i);
            fs0 fs0 = this.f19559e;
            if (fs0.f9437l != -9223372036854775807L && !fs0.f9435j && !fs0.f9432g && !fs0.mo10268b()) {
                builder.setMediaDurationMillis(gb2.m13176j0(this.f19559e.f9437l));
            }
            if (true != this.f19559e.mo10268b()) {
                i2 = 1;
            }
            builder.setPlaybackType(i2);
            this.f19554H = true;
        }
    }

    /* renamed from: v */
    private final void m22653v(long j, C2388g4 g4Var, int i) {
        if (!gb2.m13186t(this.f19572z, g4Var)) {
            int i2 = this.f19572z == null ? 1 : 0;
            this.f19572z = g4Var;
            m22654w(1, j, g4Var, i2);
        }
    }

    /* renamed from: w */
    private final void m22654w(int i, long j, C2388g4 g4Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f19558d);
        if (g4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = g4Var.f9672k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = g4Var.f9673l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = g4Var.f9670i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = g4Var.f9669h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = g4Var.f9678q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = g4Var.f9679r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = g4Var.f9686y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = g4Var.f9687z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = g4Var.f9664c;
            if (str4 != null) {
                String[] H = gb2.m13138H(str4, "-");
                Pair create = Pair.create(H[0], H.length >= 2 ? H[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = g4Var.f9680s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f19554H = true;
        this.f19557c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: x */
    private final boolean m22655x(va4 va4) {
        return va4 != null && va4.f18999c.equals(this.f19556b.mo14484b());
    }

    /* renamed from: B */
    public final void mo11192B(m84 m84, s61 s61) {
        va4 va4 = this.f19569w;
        if (va4 != null) {
            C2388g4 g4Var = va4.f18997a;
            if (g4Var.f9679r == -1) {
                C2311e2 b = g4Var.mo10384b();
                b.mo9781x(s61.f17273a);
                b.mo9760f(s61.f17274b);
                this.f19569w = new va4(b.mo9782y(), 0, va4.f18999c);
            }
        }
    }

    /* renamed from: a */
    public final void mo14884a(m84 m84, String str, boolean z) {
        mg4 mg4 = m84.f13272d;
        if ((mg4 == null || !mg4.mo11883b()) && str.equals(this.f19563i)) {
            m22649k();
        }
        this.f19561g.remove(str);
        this.f19562h.remove(str);
    }

    /* renamed from: b */
    public final void mo14885b(m84 m84, String str) {
        mg4 mg4 = m84.f13272d;
        if (mg4 == null || !mg4.mo11883b()) {
            m22649k();
            this.f19563i = str;
            this.f19564r = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-beta02");
            m22652r(m84.f13270b, m84.f13272d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11214c(com.google.android.gms.internal.ads.zl0 r21, com.google.android.gms.internal.ads.n84 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r2 = r22.mo12544b()
            if (r2 == 0) goto L_0x03d9
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r22.mo12544b()
            r5 = 11
            if (r3 >= r4) goto L_0x0036
            int r4 = r1.mo12543a(r3)
            com.google.android.gms.internal.ads.m84 r6 = r1.mo12545c(r4)
            if (r4 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.ya4 r4 = r0.f19556b
            r4.mo14483a(r6)
            goto L_0x0033
        L_0x0024:
            if (r4 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.ya4 r4 = r0.f19556b
            int r5 = r0.f19565s
            r4.mo14488f(r6, r5)
            goto L_0x0033
        L_0x002e:
            com.google.android.gms.internal.ads.ya4 r4 = r0.f19556b
            r4.mo14489g(r6)
        L_0x0033:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0036:
            long r3 = android.os.SystemClock.elapsedRealtime()
            boolean r6 = r1.mo12546d(r2)
            if (r6 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.m84 r6 = r1.mo12545c(r2)
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f19564r
            if (r7 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.gt0 r7 = r6.f13270b
            com.google.android.gms.internal.ads.mg4 r6 = r6.f13272d
            r0.m22652r(r7, r6)
        L_0x004f:
            r6 = 2
            boolean r7 = r1.mo12546d(r6)
            r9 = 3
            r10 = 0
            r11 = 1
            if (r7 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f19564r
            if (r7 == 0) goto L_0x00c6
            com.google.android.gms.internal.ads.p41 r7 = r21.mo9050Y()
            com.google.android.gms.internal.ads.ua3 r7 = r7.mo13130a()
            int r12 = r7.size()
            r13 = 0
        L_0x006a:
            if (r13 >= r12) goto L_0x008f
            java.lang.Object r14 = r7.get(r13)
            com.google.android.gms.internal.ads.o31 r14 = (com.google.android.gms.internal.ads.o31) r14
            r15 = 0
        L_0x0073:
            int r5 = r14.f14878a
            int r5 = r13 + 1
            if (r15 > 0) goto L_0x008b
            boolean r5 = r14.mo12815d(r15)
            if (r5 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.g4 r5 = r14.mo12813b(r15)
            com.google.android.gms.internal.ads.fl4 r5 = r5.f9676o
            if (r5 == 0) goto L_0x0088
            goto L_0x0090
        L_0x0088:
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008b:
            r13 = r5
            r5 = 11
            goto L_0x006a
        L_0x008f:
            r5 = r10
        L_0x0090:
            if (r5 == 0) goto L_0x00c6
            android.media.metrics.PlaybackMetrics$Builder r7 = r0.f19564r
            int r12 = com.google.android.gms.internal.ads.gb2.f9812a
            r12 = 0
        L_0x0097:
            int r13 = r5.f9328d
            if (r12 >= r13) goto L_0x00c2
            com.google.android.gms.internal.ads.ek4 r13 = r5.mo10182a(r12)
            java.util.UUID r13 = r13.f8835b
            java.util.UUID r14 = com.google.android.gms.internal.ads.ac4.f6523d
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00ab
            r5 = 3
            goto L_0x00c3
        L_0x00ab:
            java.util.UUID r14 = com.google.android.gms.internal.ads.ac4.f6524e
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00b5
            r5 = 2
            goto L_0x00c3
        L_0x00b5:
            java.util.UUID r14 = com.google.android.gms.internal.ads.ac4.f6522c
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x00bf
            r5 = 6
            goto L_0x00c3
        L_0x00bf:
            int r12 = r12 + 1
            goto L_0x0097
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            r7.setDrmType(r5)
        L_0x00c6:
            r5 = 1011(0x3f3, float:1.417E-42)
            boolean r5 = r1.mo12546d(r5)
            if (r5 == 0) goto L_0x00d3
            int r5 = r0.f19553G
            int r5 = r5 + r11
            r0.f19553G = r5
        L_0x00d3:
            com.google.android.gms.internal.ads.gc0 r5 = r0.f19568v
            r16 = 9
            if (r5 != 0) goto L_0x00db
            goto L_0x0283
        L_0x00db:
            android.content.Context r7 = r0.f19555a
            int r8 = r5.f9830a
            r12 = 1001(0x3e9, float:1.403E-42)
            r17 = 14
            r18 = 35
            r19 = 31
            r13 = 21
            r14 = 23
            if (r8 != r12) goto L_0x00f3
            r17 = 20
            r14 = 20
            goto L_0x025d
        L_0x00f3:
            r8 = r5
            com.google.android.gms.internal.ads.u44 r8 = (com.google.android.gms.internal.ads.u44) r8
            int r12 = r8.f18377d
            int r8 = r8.f18381h
            java.lang.Throwable r15 = r5.getCause()
            java.util.Objects.requireNonNull(r15)
            boolean r2 = r15 instanceof java.io.IOException
            if (r2 == 0) goto L_0x01ec
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.d73
            if (r2 == 0) goto L_0x0110
            com.google.android.gms.internal.ads.d73 r15 = (com.google.android.gms.internal.ads.d73) r15
            int r2 = r15.f8113d
            r14 = 5
            goto L_0x025d
        L_0x0110:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.ea0
            if (r2 == 0) goto L_0x0119
            r2 = 0
            r14 = 11
            goto L_0x025d
        L_0x0119:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.c53
            if (r2 != 0) goto L_0x01b9
            boolean r8 = r15 instanceof com.google.android.gms.internal.ads.xf3
            if (r8 == 0) goto L_0x0123
            goto L_0x01b9
        L_0x0123:
            int r2 = r5.f9830a
            r7 = 1002(0x3ea, float:1.404E-42)
            if (r2 != r7) goto L_0x012e
            r2 = 0
            r14 = 21
            goto L_0x025d
        L_0x012e:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.jd4
            if (r2 == 0) goto L_0x0181
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            int r7 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r7 < r13) goto L_0x0151
            boolean r8 = r2 instanceof android.media.MediaDrm.MediaDrmStateException
            if (r8 == 0) goto L_0x0151
            android.media.MediaDrm$MediaDrmStateException r2 = (android.media.MediaDrm.MediaDrmStateException) r2
            java.lang.String r2 = r2.getDiagnosticInfo()
            int r2 = com.google.android.gms.internal.ads.gb2.m13153W(r2)
            int r17 = m22648j(r2)
            goto L_0x0255
        L_0x0151:
            if (r7 < r14) goto L_0x015e
            boolean r7 = r2 instanceof android.media.MediaDrmResetException
            if (r7 == 0) goto L_0x015e
            r17 = 27
            r2 = 0
            r14 = 27
            goto L_0x025d
        L_0x015e:
            boolean r7 = r2 instanceof android.media.NotProvisionedException
            if (r7 == 0) goto L_0x0169
            r17 = 24
            r2 = 0
            r14 = 24
            goto L_0x025d
        L_0x0169:
            boolean r7 = r2 instanceof android.media.DeniedByServerException
            if (r7 == 0) goto L_0x0174
            r17 = 29
            r2 = 0
            r14 = 29
            goto L_0x025d
        L_0x0174:
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.ud4
            if (r2 == 0) goto L_0x017a
            goto L_0x0205
        L_0x017a:
            r17 = 30
            r2 = 0
            r14 = 30
            goto L_0x025d
        L_0x0181:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.g13
            if (r2 == 0) goto L_0x01b4
            java.lang.Throwable r2 = r15.getCause()
            boolean r2 = r2 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto L_0x01b4
            java.lang.Throwable r2 = r15.getCause()
            java.util.Objects.requireNonNull(r2)
            java.lang.Throwable r2 = r2.getCause()
            int r7 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r7 < r13) goto L_0x01af
            boolean r7 = r2 instanceof android.system.ErrnoException
            if (r7 == 0) goto L_0x01af
            android.system.ErrnoException r2 = (android.system.ErrnoException) r2
            int r2 = r2.errno
            int r7 = android.system.OsConstants.EACCES
            if (r2 != r7) goto L_0x01af
            r17 = 32
            r2 = 0
            r14 = 32
            goto L_0x025d
        L_0x01af:
            r2 = 0
            r14 = 31
            goto L_0x025d
        L_0x01b4:
            r2 = 0
            r14 = 9
            goto L_0x025d
        L_0x01b9:
            com.google.android.gms.internal.ads.w02 r7 = com.google.android.gms.internal.ads.w02.m22517b(r7)
            int r7 = r7.mo14853a()
            if (r7 != r11) goto L_0x01c7
            r2 = 0
            r14 = 3
            goto L_0x025d
        L_0x01c7:
            java.lang.Throwable r7 = r15.getCause()
            boolean r8 = r7 instanceof java.net.UnknownHostException
            if (r8 == 0) goto L_0x01d3
            r2 = 0
            r14 = 6
            goto L_0x025d
        L_0x01d3:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException
            if (r7 == 0) goto L_0x01db
            r2 = 0
            r14 = 7
            goto L_0x025d
        L_0x01db:
            if (r2 == 0) goto L_0x01e7
            com.google.android.gms.internal.ads.c53 r15 = (com.google.android.gms.internal.ads.c53) r15
            int r2 = r15.f7611c
            if (r2 != r11) goto L_0x01e7
            r2 = 0
            r14 = 4
            goto L_0x025d
        L_0x01e7:
            r2 = 0
            r14 = 8
            goto L_0x025d
        L_0x01ec:
            if (r12 != r11) goto L_0x01f7
            if (r8 == 0) goto L_0x01f2
            if (r8 != r11) goto L_0x01f7
        L_0x01f2:
            r2 = 0
            r14 = 35
            goto L_0x025d
        L_0x01f7:
            if (r12 != r11) goto L_0x0201
            if (r8 != r9) goto L_0x0201
            r17 = 15
            r2 = 0
            r14 = 15
            goto L_0x025d
        L_0x0201:
            if (r12 != r11) goto L_0x0207
            if (r8 != r6) goto L_0x0207
        L_0x0205:
            r2 = 0
            goto L_0x025d
        L_0x0207:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.re4
            if (r2 == 0) goto L_0x0216
            com.google.android.gms.internal.ads.re4 r15 = (com.google.android.gms.internal.ads.re4) r15
            java.lang.String r2 = r15.f16931d
            int r2 = com.google.android.gms.internal.ads.gb2.m13153W(r2)
            r14 = 13
            goto L_0x025d
        L_0x0216:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.oe4
            if (r2 == 0) goto L_0x0225
            com.google.android.gms.internal.ads.oe4 r15 = (com.google.android.gms.internal.ads.oe4) r15
            java.lang.String r2 = r15.f15062b
            int r2 = com.google.android.gms.internal.ads.gb2.m13153W(r2)
        L_0x0222:
            r14 = 14
            goto L_0x025d
        L_0x0225:
            boolean r2 = r15 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x022b
            r2 = 0
            goto L_0x0222
        L_0x022b:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.ub4
            if (r2 == 0) goto L_0x0238
            com.google.android.gms.internal.ads.ub4 r15 = (com.google.android.gms.internal.ads.ub4) r15
            int r2 = r15.f18488a
            r17 = 17
            r14 = 17
            goto L_0x025d
        L_0x0238:
            boolean r2 = r15 instanceof com.google.android.gms.internal.ads.xb4
            if (r2 == 0) goto L_0x0245
            com.google.android.gms.internal.ads.xb4 r15 = (com.google.android.gms.internal.ads.xb4) r15
            int r2 = r15.f20065a
            r17 = 18
            r14 = 18
            goto L_0x025d
        L_0x0245:
            int r2 = com.google.android.gms.internal.ads.gb2.f9812a
            boolean r2 = r15 instanceof android.media.MediaCodec.CryptoException
            if (r2 == 0) goto L_0x0258
            android.media.MediaCodec$CryptoException r15 = (android.media.MediaCodec.CryptoException) r15
            int r2 = r15.getErrorCode()
            int r17 = m22648j(r2)
        L_0x0255:
            r14 = r17
            goto L_0x025d
        L_0x0258:
            r17 = 22
            r2 = 0
            r14 = 22
        L_0x025d:
            android.media.metrics.PlaybackSession r7 = r0.f19557c
            android.media.metrics.PlaybackErrorEvent$Builder r8 = new android.media.metrics.PlaybackErrorEvent$Builder
            r8.<init>()
            long r12 = r0.f19558d
            long r12 = r3 - r12
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setTimeSinceCreatedMillis(r12)
            android.media.metrics.PlaybackErrorEvent$Builder r8 = r8.setErrorCode(r14)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r8.setSubErrorCode(r2)
            android.media.metrics.PlaybackErrorEvent$Builder r2 = r2.setException(r5)
            android.media.metrics.PlaybackErrorEvent r2 = r2.build()
            r7.reportPlaybackErrorEvent(r2)
            r0.f19554H = r11
            r0.f19568v = r10
        L_0x0283:
            boolean r2 = r1.mo12546d(r6)
            if (r2 == 0) goto L_0x02b2
            com.google.android.gms.internal.ads.p41 r2 = r21.mo9050Y()
            boolean r5 = r2.mo13131b(r6)
            boolean r7 = r2.mo13131b(r11)
            boolean r2 = r2.mo13131b(r9)
            if (r5 != 0) goto L_0x02a0
            if (r7 != 0) goto L_0x02a0
            if (r2 == 0) goto L_0x02b2
            r2 = 1
        L_0x02a0:
            if (r5 != 0) goto L_0x02a7
            r5 = 0
            r0.m22653v(r3, r10, r5)
            goto L_0x02a8
        L_0x02a7:
            r5 = 0
        L_0x02a8:
            if (r7 != 0) goto L_0x02ad
            r0.m22650m(r3, r10, r5)
        L_0x02ad:
            if (r2 != 0) goto L_0x02b2
            r0.m22651o(r3, r10, r5)
        L_0x02b2:
            com.google.android.gms.internal.ads.va4 r2 = r0.f19569w
            boolean r2 = r0.m22655x(r2)
            if (r2 == 0) goto L_0x02ca
            com.google.android.gms.internal.ads.va4 r2 = r0.f19569w
            com.google.android.gms.internal.ads.g4 r2 = r2.f18997a
            int r5 = r2.f9679r
            r7 = -1
            if (r5 == r7) goto L_0x02ca
            r5 = 0
            r0.m22653v(r3, r2, r5)
            r0.f19569w = r10
            goto L_0x02cb
        L_0x02ca:
            r5 = 0
        L_0x02cb:
            com.google.android.gms.internal.ads.va4 r2 = r0.f19570x
            boolean r2 = r0.m22655x(r2)
            if (r2 == 0) goto L_0x02dc
            com.google.android.gms.internal.ads.va4 r2 = r0.f19570x
            com.google.android.gms.internal.ads.g4 r2 = r2.f18997a
            r0.m22650m(r3, r2, r5)
            r0.f19570x = r10
        L_0x02dc:
            com.google.android.gms.internal.ads.va4 r2 = r0.f19571y
            boolean r2 = r0.m22655x(r2)
            if (r2 == 0) goto L_0x02ed
            com.google.android.gms.internal.ads.va4 r2 = r0.f19571y
            com.google.android.gms.internal.ads.g4 r2 = r2.f18997a
            r0.m22651o(r3, r2, r5)
            r0.f19571y = r10
        L_0x02ed:
            android.content.Context r2 = r0.f19555a
            com.google.android.gms.internal.ads.w02 r2 = com.google.android.gms.internal.ads.w02.m22517b(r2)
            int r2 = r2.mo14853a()
            switch(r2) {
                case 0: goto L_0x030e;
                case 1: goto L_0x030b;
                case 2: goto L_0x0309;
                case 3: goto L_0x0307;
                case 4: goto L_0x0305;
                case 5: goto L_0x0303;
                case 6: goto L_0x02fa;
                case 7: goto L_0x0301;
                case 8: goto L_0x02fa;
                case 9: goto L_0x02fe;
                case 10: goto L_0x02fc;
                default: goto L_0x02fa;
            }
        L_0x02fa:
            r13 = 1
            goto L_0x030f
        L_0x02fc:
            r13 = 7
            goto L_0x030f
        L_0x02fe:
            r13 = 8
            goto L_0x030f
        L_0x0301:
            r13 = 3
            goto L_0x030f
        L_0x0303:
            r13 = 6
            goto L_0x030f
        L_0x0305:
            r13 = 5
            goto L_0x030f
        L_0x0307:
            r13 = 4
            goto L_0x030f
        L_0x0309:
            r13 = 2
            goto L_0x030f
        L_0x030b:
            r13 = 9
            goto L_0x030f
        L_0x030e:
            r13 = 0
        L_0x030f:
            int r2 = r0.f19567u
            if (r13 == r2) goto L_0x032f
            r0.f19567u = r13
            android.media.metrics.PlaybackSession r2 = r0.f19557c
            android.media.metrics.NetworkEvent$Builder r5 = new android.media.metrics.NetworkEvent$Builder
            r5.<init>()
            android.media.metrics.NetworkEvent$Builder r5 = r5.setNetworkType(r13)
            long r7 = r0.f19558d
            long r7 = r3 - r7
            android.media.metrics.NetworkEvent$Builder r5 = r5.setTimeSinceCreatedMillis(r7)
            android.media.metrics.NetworkEvent r5 = r5.build()
            r2.reportNetworkEvent(r5)
        L_0x032f:
            int r2 = r21.mo9046U()
            if (r2 == r6) goto L_0x0339
            r2 = 0
            r0.f19549C = r2
            goto L_0x033a
        L_0x0339:
            r2 = 0
        L_0x033a:
            r5 = r21
            com.google.android.gms.internal.ads.c84 r5 = (com.google.android.gms.internal.ads.c84) r5
            com.google.android.gms.internal.ads.u44 r5 = r5.mo9071r()
            r7 = 10
            if (r5 != 0) goto L_0x0349
            r0.f19550D = r2
            goto L_0x0351
        L_0x0349:
            boolean r2 = r1.mo12546d(r7)
            if (r2 == 0) goto L_0x0351
            r0.f19550D = r11
        L_0x0351:
            int r2 = r21.mo9046U()
            boolean r5 = r0.f19549C
            if (r5 == 0) goto L_0x035b
            r5 = 5
            goto L_0x03a5
        L_0x035b:
            boolean r5 = r0.f19550D
            if (r5 == 0) goto L_0x0362
            r5 = 13
            goto L_0x03a5
        L_0x0362:
            r5 = 4
            if (r2 != r5) goto L_0x0368
            r5 = 11
            goto L_0x03a5
        L_0x0368:
            if (r2 != r6) goto L_0x0386
            int r2 = r0.f19566t
            if (r2 == 0) goto L_0x0384
            if (r2 != r6) goto L_0x0371
            goto L_0x0384
        L_0x0371:
            boolean r2 = r21.mo9061h()
            if (r2 != 0) goto L_0x0379
            r5 = 7
            goto L_0x03a5
        L_0x0379:
            int r2 = r21.mo9047V()
            if (r2 == 0) goto L_0x0382
            r5 = 10
            goto L_0x03a5
        L_0x0382:
            r5 = 6
            goto L_0x03a5
        L_0x0384:
            r5 = 2
            goto L_0x03a5
        L_0x0386:
            if (r2 != r9) goto L_0x039a
            boolean r2 = r21.mo9061h()
            if (r2 != 0) goto L_0x038f
            goto L_0x03a5
        L_0x038f:
            int r2 = r21.mo9047V()
            if (r2 == 0) goto L_0x0398
            r5 = 9
            goto L_0x03a5
        L_0x0398:
            r5 = 3
            goto L_0x03a5
        L_0x039a:
            if (r2 != r11) goto L_0x03a3
            int r2 = r0.f19566t
            if (r2 == 0) goto L_0x03a3
            r5 = 12
            goto L_0x03a5
        L_0x03a3:
            int r5 = r0.f19566t
        L_0x03a5:
            int r2 = r0.f19566t
            if (r2 == r5) goto L_0x03c8
            r0.f19566t = r5
            r0.f19554H = r11
            android.media.metrics.PlaybackSession r2 = r0.f19557c
            android.media.metrics.PlaybackStateEvent$Builder r5 = new android.media.metrics.PlaybackStateEvent$Builder
            r5.<init>()
            int r6 = r0.f19566t
            android.media.metrics.PlaybackStateEvent$Builder r5 = r5.setState(r6)
            long r6 = r0.f19558d
            long r3 = r3 - r6
            android.media.metrics.PlaybackStateEvent$Builder r3 = r5.setTimeSinceCreatedMillis(r3)
            android.media.metrics.PlaybackStateEvent r3 = r3.build()
            r2.reportPlaybackStateEvent(r3)
        L_0x03c8:
            r2 = 1028(0x404, float:1.44E-42)
            boolean r3 = r1.mo12546d(r2)
            if (r3 == 0) goto L_0x03d9
            com.google.android.gms.internal.ads.ya4 r3 = r0.f19556b
            com.google.android.gms.internal.ads.m84 r1 = r1.mo12545c(r2)
            r3.mo14487e(r1)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wa4.mo11214c(com.google.android.gms.internal.ads.zl0, com.google.android.gms.internal.ads.n84):void");
    }

    /* renamed from: d */
    public final void mo11216d(m84 m84, ny3 ny3) {
        this.f19551E += ny3.f14236g;
        this.f19552F += ny3.f14234e;
    }

    /* renamed from: e */
    public final void mo11218e(m84 m84, gc0 gc0) {
        this.f19568v = gc0;
    }

    /* renamed from: f */
    public final LogSessionId mo14886f() {
        return this.f19557c.getSessionId();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo11223h(m84 m84, int i, long j) {
    }

    /* renamed from: i */
    public final void mo11225i(m84 m84, ig4 ig4) {
        mg4 mg4 = m84.f13272d;
        if (mg4 != null) {
            C2388g4 g4Var = ig4.f10776b;
            Objects.requireNonNull(g4Var);
            va4 va4 = new va4(g4Var, 0, this.f19556b.mo14485c(m84.f13270b, mg4));
            int i = ig4.f10775a;
            if (i != 0) {
                if (i == 1) {
                    this.f19570x = va4;
                    return;
                } else if (i != 2) {
                    if (i == 3) {
                        this.f19571y = va4;
                        return;
                    }
                    return;
                }
            }
            this.f19569w = va4;
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo11229l(m84 m84, C2388g4 g4Var, oz3 oz3) {
    }

    /* renamed from: n */
    public final void mo11232n(m84 m84, int i, long j, long j2) {
        long j3;
        mg4 mg4 = m84.f13272d;
        if (mg4 != null) {
            String c = this.f19556b.mo14485c(m84.f13270b, mg4);
            Long l = (Long) this.f19562h.get(c);
            Long l2 = (Long) this.f19561g.get(c);
            HashMap hashMap = this.f19562h;
            long j4 = 0;
            if (l == null) {
                j3 = 0;
            } else {
                j3 = l.longValue();
            }
            hashMap.put(c, Long.valueOf(j3 + j));
            HashMap hashMap2 = this.f19561g;
            if (l2 != null) {
                j4 = l2.longValue();
            }
            hashMap2.put(c, Long.valueOf(j4 + ((long) i)));
        }
    }

    /* renamed from: p */
    public final void mo11235p(m84 m84, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
    }

    /* renamed from: q */
    public final void mo11236q(m84 m84, yk0 yk0, yk0 yk02, int i) {
        if (i == 1) {
            this.f19549C = true;
            i = 1;
        }
        this.f19565s = i;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo11238s(m84 m84, C2388g4 g4Var, oz3 oz3) {
    }

    /* renamed from: t */
    public final /* synthetic */ void mo11239t(m84 m84, int i) {
    }

    /* renamed from: u */
    public final /* synthetic */ void mo11240u(m84 m84, Object obj, long j) {
    }
}
