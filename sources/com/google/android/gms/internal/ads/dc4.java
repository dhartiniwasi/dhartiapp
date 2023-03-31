package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dc4 {

    /* renamed from: A */
    private long f8187A;

    /* renamed from: B */
    private long f8188B;

    /* renamed from: C */
    private long f8189C;

    /* renamed from: D */
    private boolean f8190D;

    /* renamed from: E */
    private long f8191E;

    /* renamed from: F */
    private long f8192F;

    /* renamed from: a */
    private final cc4 f8193a;

    /* renamed from: b */
    private final long[] f8194b;

    /* renamed from: c */
    private AudioTrack f8195c;

    /* renamed from: d */
    private int f8196d;

    /* renamed from: e */
    private int f8197e;

    /* renamed from: f */
    private bc4 f8198f;

    /* renamed from: g */
    private int f8199g;

    /* renamed from: h */
    private boolean f8200h;

    /* renamed from: i */
    private long f8201i;

    /* renamed from: j */
    private float f8202j;

    /* renamed from: k */
    private boolean f8203k;

    /* renamed from: l */
    private long f8204l;

    /* renamed from: m */
    private long f8205m;

    /* renamed from: n */
    private Method f8206n;

    /* renamed from: o */
    private long f8207o;

    /* renamed from: p */
    private boolean f8208p;

    /* renamed from: q */
    private boolean f8209q;

    /* renamed from: r */
    private long f8210r;

    /* renamed from: s */
    private long f8211s;

    /* renamed from: t */
    private long f8212t;

    /* renamed from: u */
    private long f8213u;

    /* renamed from: v */
    private int f8214v;

    /* renamed from: w */
    private int f8215w;

    /* renamed from: x */
    private long f8216x;

    /* renamed from: y */
    private long f8217y;

    /* renamed from: z */
    private long f8218z;

    public dc4(cc4 cc4) {
        this.f8193a = cc4;
        int i = gb2.f9812a;
        try {
            this.f8206n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f8194b = new long[10];
    }

    /* renamed from: l */
    private final long m11448l(long j) {
        return (j * 1000000) / ((long) this.f8199g);
    }

    /* renamed from: m */
    private final long m11449m() {
        AudioTrack audioTrack = this.f8195c;
        Objects.requireNonNull(audioTrack);
        if (this.f8216x != -9223372036854775807L) {
            return Math.min(this.f8187A, this.f8218z + ((((SystemClock.elapsedRealtime() * 1000) - this.f8216x) * ((long) this.f8199g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f8200h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f8213u = this.f8211s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f8213u;
        }
        if (gb2.f9812a <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.f8211s > 0 && playState == 3) {
                if (this.f8217y == -9223372036854775807L) {
                    this.f8217y = SystemClock.elapsedRealtime();
                }
                return this.f8211s;
            }
            this.f8217y = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.f8211s > playbackHeadPosition) {
            this.f8212t++;
        }
        this.f8211s = playbackHeadPosition;
        return playbackHeadPosition + (this.f8212t << 32);
    }

    /* renamed from: n */
    private final void m11450n() {
        this.f8204l = 0;
        this.f8215w = 0;
        this.f8214v = 0;
        this.f8205m = 0;
        this.f8189C = 0;
        this.f8192F = 0;
        this.f8203k = false;
    }

    /* renamed from: a */
    public final int mo9542a(long j) {
        return this.f8197e - ((int) (j - (m11449m() * ((long) this.f8196d))));
    }

    /* renamed from: b */
    public final long mo9543b(boolean z) {
        long j;
        Method method;
        dc4 dc4 = this;
        AudioTrack audioTrack = dc4.f8195c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long l = dc4.m11448l(m11449m());
            if (l != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - dc4.f8205m >= 30000) {
                    long[] jArr = dc4.f8194b;
                    int i = dc4.f8214v;
                    jArr[i] = l - nanoTime;
                    dc4.f8214v = (i + 1) % 10;
                    int i2 = dc4.f8215w;
                    if (i2 < 10) {
                        dc4.f8215w = i2 + 1;
                    }
                    dc4.f8205m = nanoTime;
                    dc4.f8204l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = dc4.f8215w;
                        if (i3 >= i4) {
                            break;
                        }
                        dc4.f8204l += dc4.f8194b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!dc4.f8200h) {
                    bc4 bc4 = dc4.f8198f;
                    Objects.requireNonNull(bc4);
                    if (bc4.mo8745g(nanoTime)) {
                        long b = bc4.mo8740b();
                        long a = bc4.mo8739a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            qc4 qc4 = (qc4) dc4.f8193a;
                            ot1.m18060e("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + a + ", " + b + ", " + nanoTime + ", " + l + ", " + qc4.f16342a.m22134v() + ", " + qc4.f16342a.m22135w());
                            bc4.mo8742d();
                        } else {
                            bc4 bc42 = bc4;
                            if (Math.abs(dc4.m11448l(a) - l) > 5000000) {
                                qc4 qc42 = (qc4) dc4.f8193a;
                                ot1.m18060e("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + a + ", " + b + ", " + nanoTime + ", " + l + ", " + qc42.f16342a.m22134v() + ", " + qc42.f16342a.m22135w());
                                bc42.mo8742d();
                            } else {
                                bc42.mo8741c();
                            }
                        }
                        dc4 = this;
                    }
                    if (dc4.f8209q && (method = dc4.f8206n) != null && nanoTime - dc4.f8210r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = dc4.f8195c;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = gb2.f9812a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - dc4.f8201i;
                            dc4.f8207o = intValue;
                            long max = Math.max(intValue, 0);
                            dc4.f8207o = max;
                            if (max > 5000000) {
                                ot1.m18060e("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                dc4.f8207o = 0;
                            }
                        } catch (Exception unused) {
                            dc4.f8206n = null;
                        }
                        dc4.f8210r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        bc4 bc43 = dc4.f8198f;
        Objects.requireNonNull(bc43);
        boolean f = bc43.mo8744f();
        if (f) {
            j = dc4.m11448l(bc43.mo8739a()) + gb2.m13162c0(nanoTime2 - bc43.mo8740b(), dc4.f8202j);
        } else {
            if (dc4.f8215w == 0) {
                j = dc4.m11448l(m11449m());
            } else {
                j = dc4.f8204l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - dc4.f8207o);
            }
        }
        if (dc4.f8190D != f) {
            dc4.f8192F = dc4.f8189C;
            dc4.f8191E = dc4.f8188B;
        }
        long j2 = nanoTime2 - dc4.f8192F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (dc4.f8191E + gb2.m13162c0(j2, dc4.f8202j)))) / 1000;
        }
        if (!dc4.f8203k) {
            long j4 = dc4.f8188B;
            if (j > j4) {
                dc4.f8203k = true;
                long currentTimeMillis = System.currentTimeMillis() - gb2.m13176j0(gb2.m13166e0(gb2.m13176j0(j - j4), dc4.f8202j));
                vc4 vc4 = ((qc4) dc4.f8193a).f16342a;
                if (vc4.f19053n != null) {
                    ((ad4) vc4.f19053n).f6529a.f7683R0.mo13754r(currentTimeMillis);
                }
            }
        }
        dc4.f8189C = nanoTime2;
        dc4.f8188B = j;
        dc4.f8190D = f;
        return j;
    }

    /* renamed from: c */
    public final void mo9544c(long j) {
        this.f8218z = m11449m();
        this.f8216x = SystemClock.elapsedRealtime() * 1000;
        this.f8187A = j;
    }

    /* renamed from: d */
    public final void mo9545d() {
        m11450n();
        this.f8195c = null;
        this.f8198f = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9546e(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f8195c = r4
            r3.f8196d = r7
            r3.f8197e = r8
            com.google.android.gms.internal.ads.bc4 r0 = new com.google.android.gms.internal.ads.bc4
            r0.<init>(r4)
            r3.f8198f = r0
            int r4 = r4.getSampleRate()
            r3.f8199g = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0025
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a
            r2 = 23
            if (r5 >= r2) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0026
            if (r6 != r4) goto L_0x0025
            r6 = 6
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.f8200h = r0
            boolean r4 = com.google.android.gms.internal.ads.gb2.m13188v(r6)
            r3.f8209q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x003c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.m11448l(r7)
            goto L_0x003d
        L_0x003c:
            r7 = r5
        L_0x003d:
            r3.f8201i = r7
            r7 = 0
            r3.f8211s = r7
            r3.f8212t = r7
            r3.f8213u = r7
            r3.f8208p = r1
            r3.f8216x = r5
            r3.f8217y = r5
            r3.f8210r = r7
            r3.f8207o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f8202j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dc4.mo9546e(android.media.AudioTrack, boolean, int, int, int):void");
    }

    /* renamed from: f */
    public final void mo9547f() {
        bc4 bc4 = this.f8198f;
        Objects.requireNonNull(bc4);
        bc4.mo8743e();
    }

    /* renamed from: g */
    public final boolean mo9548g(long j) {
        if (j > m11449m()) {
            return true;
        }
        if (!this.f8200h) {
            return false;
        }
        AudioTrack audioTrack = this.f8195c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m11449m() == 0;
    }

    /* renamed from: h */
    public final boolean mo9549h() {
        AudioTrack audioTrack = this.f8195c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: i */
    public final boolean mo9550i(long j) {
        return this.f8217y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f8217y >= 200;
    }

    /* renamed from: j */
    public final boolean mo9551j(long j) {
        AudioTrack audioTrack = this.f8195c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f8200h) {
            if (playState == 2) {
                this.f8208p = false;
                return false;
            } else if (playState == 1) {
                if (m11449m() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f8208p;
        boolean g = mo9548g(j);
        this.f8208p = g;
        if (z && !g && playState != 1) {
            cc4 cc4 = this.f8193a;
            int i = this.f8197e;
            long j0 = gb2.m13176j0(this.f8201i);
            qc4 qc4 = (qc4) cc4;
            if (qc4.f16342a.f19053n != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                vc4 vc4 = qc4.f16342a;
                ((ad4) vc4.f19053n).f6529a.f7683R0.mo13756t(i, j0, elapsedRealtime - vc4.f19036S);
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo9552k() {
        m11450n();
        if (this.f8216x != -9223372036854775807L) {
            return false;
        }
        bc4 bc4 = this.f8198f;
        Objects.requireNonNull(bc4);
        bc4.mo8743e();
        return true;
    }
}
