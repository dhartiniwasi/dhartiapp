package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2852sm extends C2179ai {

    /* renamed from: P */
    private static final byte[] f17551P = C2893tq.m21185p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f17552A;

    /* renamed from: B */
    private ByteBuffer[] f17553B;

    /* renamed from: C */
    private long f17554C;

    /* renamed from: D */
    private int f17555D;

    /* renamed from: E */
    private int f17556E;

    /* renamed from: F */
    private boolean f17557F;

    /* renamed from: G */
    private boolean f17558G;

    /* renamed from: H */
    private int f17559H;

    /* renamed from: I */
    private int f17560I;

    /* renamed from: J */
    private boolean f17561J;

    /* renamed from: K */
    private boolean f17562K;

    /* renamed from: L */
    private boolean f17563L;

    /* renamed from: M */
    private boolean f17564M;

    /* renamed from: N */
    private boolean f17565N;

    /* renamed from: O */
    protected C2627mk f17566O;

    /* renamed from: i */
    private final C2926um f17567i;

    /* renamed from: j */
    private final C2664nk f17568j;

    /* renamed from: k */
    private final C2664nk f17569k;

    /* renamed from: l */
    private final C2811ri f17570l;

    /* renamed from: m */
    private final List f17571m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f17572n;

    /* renamed from: o */
    private C2774qi f17573o;

    /* renamed from: p */
    private MediaCodec f17574p;

    /* renamed from: q */
    private C2778qm f17575q;

    /* renamed from: r */
    private boolean f17576r;

    /* renamed from: s */
    private boolean f17577s;

    /* renamed from: t */
    private boolean f17578t;

    /* renamed from: u */
    private boolean f17579u;

    /* renamed from: v */
    private boolean f17580v;

    /* renamed from: w */
    private boolean f17581w;

    /* renamed from: x */
    private boolean f17582x;

    /* renamed from: y */
    private boolean f17583y;

    /* renamed from: z */
    private boolean f17584z;

    public C2852sm(int i, C2926um umVar, C2850sk skVar, boolean z) {
        super(i);
        C2335eq.m12245e(C2893tq.f18208a >= 16);
        this.f17567i = umVar;
        this.f17568j = new C2664nk(0);
        this.f17569k = new C2664nk(0);
        this.f17570l = new C2811ri();
        this.f17571m = new ArrayList();
        this.f17572n = new MediaCodec.BufferInfo();
        this.f17559H = 0;
        this.f17560I = 0;
    }

    /* renamed from: r */
    private final void mo9678r() throws C2253ci {
        if (this.f17560I == 2) {
            mo9669H();
            mo14080F();
            return;
        }
        this.f17564M = true;
        mo9931z();
    }

    /* renamed from: s */
    private final boolean m20487s() throws C2253ci {
        MediaCodec mediaCodec = this.f17574p;
        if (mediaCodec == null || this.f17560I == 2 || this.f17563L) {
            return false;
        }
        if (this.f17555D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f17555D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            C2664nk nkVar = this.f17568j;
            nkVar.f14049c = this.f17552A[dequeueInputBuffer];
            nkVar.mo11135b();
        }
        if (this.f17560I == 1) {
            if (!this.f17579u) {
                this.f17562K = true;
                this.f17574p.queueInputBuffer(this.f17555D, 0, 0, 0, 4);
                this.f17555D = -1;
            }
            this.f17560I = 2;
            return false;
        } else if (this.f17583y) {
            this.f17583y = false;
            ByteBuffer byteBuffer = this.f17568j.f14049c;
            byte[] bArr = f17551P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f17574p;
            int i = this.f17555D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.f17555D = -1;
            this.f17561J = true;
            return true;
        } else {
            if (this.f17559H == 1) {
                for (int i2 = 0; i2 < this.f17573o.f16394h.size(); i2++) {
                    this.f17568j.f14049c.put((byte[]) this.f17573o.f16394h.get(i2));
                }
                this.f17559H = 2;
            }
            int position = this.f17568j.f14049c.position();
            int h = mo8374h(this.f17570l, this.f17568j, false);
            if (h == -3) {
                return false;
            }
            if (h == -5) {
                if (this.f17559H == 2) {
                    this.f17568j.mo11135b();
                    this.f17559H = 1;
                }
                mo9681x(this.f17570l.f16958a);
                return true;
            }
            C2664nk nkVar2 = this.f17568j;
            if (nkVar2.mo11139f()) {
                if (this.f17559H == 2) {
                    nkVar2.mo11135b();
                    this.f17559H = 1;
                }
                this.f17563L = true;
                if (!this.f17561J) {
                    mo9678r();
                    return false;
                }
                try {
                    if (!this.f17579u) {
                        this.f17562K = true;
                        this.f17574p.queueInputBuffer(this.f17555D, 0, 0, 0, 4);
                        this.f17555D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C2253ci.m10944a(e, mo8372g());
                }
            } else if (!this.f17565N || nkVar2.mo11140g()) {
                this.f17565N = false;
                boolean i3 = nkVar2.mo12646i();
                if (this.f17576r && !i3) {
                    ByteBuffer byteBuffer2 = nkVar2.f14049c;
                    byte[] bArr2 = C2559kq.f12213a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (b == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i5++;
                        }
                        if (b != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.f17568j.f14049c.position() == 0) {
                        return true;
                    }
                    this.f17576r = false;
                }
                try {
                    C2664nk nkVar3 = this.f17568j;
                    long j = nkVar3.f14050d;
                    if (nkVar3.mo11138e()) {
                        this.f17571m.add(Long.valueOf(j));
                    }
                    this.f17568j.f14049c.flip();
                    mo9668G(this.f17568j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.f17568j.f14048b.mo12038a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f17574p.queueSecureInputBuffer(this.f17555D, 0, a, j, 0);
                    } else {
                        this.f17574p.queueInputBuffer(this.f17555D, 0, this.f17568j.f14049c.limit(), j, 0);
                    }
                    this.f17555D = -1;
                    this.f17561J = true;
                    this.f17559H = 0;
                    this.f17566O.f13351c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C2253ci.m10944a(e2, mo8372g());
                }
            } else {
                nkVar2.mo11135b();
                if (this.f17559H == 2) {
                    this.f17559H = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract boolean mo9667C(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C2253ci;

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final MediaCodec mo14078D() {
        return this.f17574p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C2778qm mo14079E() {
        return this.f17575q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b5  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14080F() throws com.google.android.gms.internal.ads.C2253ci {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f17574p
            if (r0 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.qi r0 = r11.f17573o
            if (r0 != 0) goto L_0x000a
            goto L_0x01dc
        L_0x000a:
            com.google.android.gms.internal.ads.qm r1 = r11.f17575q
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.um r1 = r11.f17567i     // Catch:{ xm -> 0x002e }
            com.google.android.gms.internal.ads.qm r1 = r11.mo9929t(r1, r0, r3)     // Catch:{ xm -> 0x002e }
            r11.f17575q = r1     // Catch:{ xm -> 0x002e }
            if (r1 == 0) goto L_0x001b
            goto L_0x0042
        L_0x001b:
            com.google.android.gms.internal.ads.rm r0 = new com.google.android.gms.internal.ads.rm
            com.google.android.gms.internal.ads.qi r1 = r11.f17573o
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.gms.internal.ads.C2774qi) r1, (java.lang.Throwable) r2, (boolean) r3, (int) r4)
            int r1 = r11.mo8372g()
            com.google.android.gms.internal.ads.ci r0 = com.google.android.gms.internal.ads.C2253ci.m10944a(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            com.google.android.gms.internal.ads.rm r1 = new com.google.android.gms.internal.ads.rm
            com.google.android.gms.internal.ads.qi r2 = r11.f17573o
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.C2774qi) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r11.mo8372g()
            com.google.android.gms.internal.ads.ci r0 = com.google.android.gms.internal.ads.C2253ci.m10944a(r1, r0)
            throw r0
        L_0x0042:
            boolean r0 = r11.mo9671J(r1)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.google.android.gms.internal.ads.qm r0 = r11.f17575q
            java.lang.String r0 = r0.f16464a
            com.google.android.gms.internal.ads.qi r1 = r11.f17573o
            int r4 = com.google.android.gms.internal.ads.C2893tq.f18208a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List r1 = r1.f16394h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            r11.f17576r = r1
            r1 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r1) goto L_0x00a0
            java.lang.String r7 = com.google.android.gms.internal.ads.C2893tq.f18211d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = 1
        L_0x00a3:
            r11.f17577s = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = com.google.android.gms.internal.ads.C2893tq.f18209b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = 1
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            r11.f17578t = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r11.f17579u = r7
            r7 = 23
            if (r4 > r7) goto L_0x0108
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r1 = 1
            goto L_0x0126
        L_0x0108:
            if (r4 > r1) goto L_0x0125
            java.lang.String r1 = com.google.android.gms.internal.ads.C2893tq.f18209b
            java.lang.String r7 = "hb2000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            goto L_0x0106
        L_0x0125:
            r1 = 0
        L_0x0126:
            r11.f17580v = r1
            if (r4 != r5) goto L_0x0134
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = 1
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            r11.f17581w = r1
            com.google.android.gms.internal.ads.qi r1 = r11.f17573o
            if (r4 > r6) goto L_0x0149
            int r1 = r1.f16404z
            if (r1 != r10) goto L_0x0149
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0149
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            r11.f17582x = r1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cb }
            r1.<init>()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r6 = "createCodec:"
            r1.append(r6)     // Catch:{ Exception -> 0x01cb }
            r1.append(r0)     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.C2819rq.m19992a(r1)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01cb }
            r11.f17574p = r1     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.C2819rq.m19993b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = "configureCodec"
            com.google.android.gms.internal.ads.C2819rq.m19992a(r1)     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.qm r1 = r11.f17575q     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r6 = r11.f17574p     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.qi r7 = r11.f17573o     // Catch:{ Exception -> 0x01cb }
            r11.mo9679v(r1, r6, r7, r2)     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.C2819rq.m19993b()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.C2819rq.m19992a(r1)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f17574p     // Catch:{ Exception -> 0x01cb }
            r1.start()     // Catch:{ Exception -> 0x01cb }
            com.google.android.gms.internal.ads.C2819rq.m19993b()     // Catch:{ Exception -> 0x01cb }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01cb }
            long r8 = r6 - r4
            r4 = r11
            r5 = r0
            r4.mo9680w(r5, r6, r8)     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f17574p     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.f17552A = r1     // Catch:{ Exception -> 0x01cb }
            android.media.MediaCodec r1 = r11.f17574p     // Catch:{ Exception -> 0x01cb }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01cb }
            r11.f17553B = r1     // Catch:{ Exception -> 0x01cb }
            int r0 = r11.mo8369d()
            r1 = 2
            if (r0 != r1) goto L_0x01b5
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01ba
        L_0x01b5:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ba:
            r11.f17554C = r0
            r0 = -1
            r11.f17555D = r0
            r11.f17556E = r0
            r11.f17565N = r10
            com.google.android.gms.internal.ads.mk r0 = r11.f17566O
            int r1 = r0.f13349a
            int r1 = r1 + r10
            r0.f13349a = r1
            return
        L_0x01cb:
            r1 = move-exception
            com.google.android.gms.internal.ads.rm r2 = new com.google.android.gms.internal.ads.rm
            com.google.android.gms.internal.ads.qi r4 = r11.f17573o
            r2.<init>((com.google.android.gms.internal.ads.C2774qi) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r11.mo8372g()
            com.google.android.gms.internal.ads.ci r0 = com.google.android.gms.internal.ads.C2253ci.m10944a(r2, r0)
            throw r0
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2852sm.mo14080F():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo9668G(C2664nk nkVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo9669H() {
        this.f17554C = -9223372036854775807L;
        this.f17555D = -1;
        this.f17556E = -1;
        this.f17557F = false;
        this.f17571m.clear();
        this.f17552A = null;
        this.f17553B = null;
        this.f17575q = null;
        this.f17558G = false;
        this.f17561J = false;
        this.f17576r = false;
        this.f17577s = false;
        this.f17578t = false;
        this.f17579u = false;
        this.f17580v = false;
        this.f17582x = false;
        this.f17583y = false;
        this.f17584z = false;
        this.f17562K = false;
        this.f17559H = 0;
        this.f17560I = 0;
        this.f17568j.f14049c = null;
        MediaCodec mediaCodec = this.f17574p;
        if (mediaCodec != null) {
            this.f17566O.f13350b++;
            try {
                mediaCodec.stop();
                try {
                    this.f17574p.release();
                } finally {
                    this.f17574p = null;
                }
            } catch (Throwable th) {
                this.f17574p.release();
                throw th;
            } finally {
                this.f17574p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo9670I(MediaCodec mediaCodec, boolean z, C2774qi qiVar, C2774qi qiVar2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public boolean mo9671J(C2778qm qmVar) {
        return true;
    }

    /* renamed from: a */
    public final int mo14081a() {
        return 4;
    }

    /* renamed from: b */
    public final int mo14082b(C2774qi qiVar) throws C2253ci {
        try {
            return mo9677q(this.f17567i, qiVar);
        } catch (C3037xm e) {
            throw C2253ci.m10944a(e, mo8372g());
        }
    }

    /* renamed from: i0 */
    public boolean mo9676i0() {
        if (this.f17573o != null) {
            if (mo8371f() || this.f17556E >= 0) {
                return true;
            }
            if (this.f17554C == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f17554C) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8377j() {
        this.f17573o = null;
        mo9669H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo8379k(boolean z) throws C2253ci {
        this.f17566O = new C2627mk();
    }

    /* renamed from: k0 */
    public boolean mo9928k0() {
        return this.f17564M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo8380l(long j, boolean z) throws C2253ci {
        this.f17563L = false;
        this.f17564M = false;
        if (this.f17574p != null) {
            this.f17554C = -9223372036854775807L;
            this.f17555D = -1;
            this.f17556E = -1;
            this.f17565N = true;
            this.f17557F = false;
            this.f17571m.clear();
            this.f17583y = false;
            this.f17584z = false;
            if (this.f17577s || (this.f17580v && this.f17562K)) {
                mo9669H();
                mo14080F();
            } else if (this.f17560I != 0) {
                mo9669H();
                mo14080F();
            } else {
                this.f17574p.flush();
                this.f17561J = false;
            }
            if (this.f17558G && this.f17573o != null) {
                this.f17559H = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo9677q(C2926um umVar, C2774qi qiVar) throws C3037xm;

    /* renamed from: r0 */
    public final void mo14083r0(long j, long j2) throws C2253ci {
        boolean z;
        int i;
        boolean z2;
        if (this.f17564M) {
            mo9931z();
            return;
        }
        if (this.f17573o == null) {
            this.f17569k.mo11135b();
            int h = mo8374h(this.f17570l, this.f17569k, true);
            if (h == -5) {
                mo9681x(this.f17570l.f16958a);
            } else if (h == -4) {
                C2335eq.m12245e(this.f17569k.mo11139f());
                this.f17563L = true;
                mo9678r();
                return;
            } else {
                return;
            }
        }
        mo14080F();
        if (this.f17574p != null) {
            C2819rq.m19992a("drainAndFeed");
            while (true) {
                if (this.f17556E < 0) {
                    if (!this.f17581w || !this.f17562K) {
                        i = this.f17574p.dequeueOutputBuffer(this.f17572n, 0);
                        this.f17556E = i;
                    } else {
                        try {
                            i = this.f17574p.dequeueOutputBuffer(this.f17572n, 0);
                            this.f17556E = i;
                        } catch (IllegalStateException unused) {
                            mo9678r();
                            if (this.f17564M) {
                                mo9669H();
                            }
                        }
                    }
                    if (i >= 0) {
                        if (this.f17584z) {
                            this.f17584z = false;
                            this.f17574p.releaseOutputBuffer(i, false);
                            this.f17556E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f17572n;
                            if ((bufferInfo.flags & 4) != 0) {
                                mo9678r();
                                this.f17556E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f17553B[this.f17556E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f17572n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.f17572n.presentationTimeUs;
                            int size = this.f17571m.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z2 = false;
                                    break;
                                } else if (((Long) this.f17571m.get(i2)).longValue() == j3) {
                                    this.f17571m.remove(i2);
                                    z2 = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.f17557F = z2;
                        }
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f17574p.getOutputFormat();
                        if (this.f17578t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f17584z = true;
                        } else {
                            if (this.f17582x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo9682y(this.f17574p, outputFormat);
                        }
                    } else if (i == -3) {
                        this.f17553B = this.f17574p.getOutputBuffers();
                    } else if (this.f17579u && (this.f17563L || this.f17560I == 2)) {
                        mo9678r();
                    }
                }
                if (!this.f17581w || !this.f17562K) {
                    MediaCodec mediaCodec = this.f17574p;
                    ByteBuffer[] byteBufferArr = this.f17553B;
                    int i3 = this.f17556E;
                    ByteBuffer byteBuffer2 = byteBufferArr[i3];
                    MediaCodec.BufferInfo bufferInfo3 = this.f17572n;
                    z = mo9667C(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f17557F);
                } else {
                    try {
                        MediaCodec mediaCodec2 = this.f17574p;
                        ByteBuffer[] byteBufferArr2 = this.f17553B;
                        int i4 = this.f17556E;
                        ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                        MediaCodec.BufferInfo bufferInfo4 = this.f17572n;
                        z = mo9667C(j, j2, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f17557F);
                    } catch (IllegalStateException unused2) {
                        mo9678r();
                        if (this.f17564M) {
                            mo9669H();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                long j4 = this.f17572n.presentationTimeUs;
                this.f17556E = -1;
            }
            do {
            } while (m20487s());
            C2819rq.m19993b();
        } else {
            mo8388p(j);
            this.f17569k.mo11135b();
            int h2 = mo8374h(this.f17570l, this.f17569k, false);
            if (h2 == -5) {
                mo9681x(this.f17570l.f16958a);
            } else if (h2 == -4) {
                C2335eq.m12245e(this.f17569k.mo11139f());
                this.f17563L = true;
                mo9678r();
            }
        }
        this.f17566O.mo12366a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C2778qm mo9929t(C2926um umVar, C2774qi qiVar, boolean z) throws C3037xm {
        return C2295dn.m11569c(qiVar.f16392f, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo9679v(C2778qm qmVar, MediaCodec mediaCodec, C2774qi qiVar, MediaCrypto mediaCrypto) throws C3037xm;

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo9680w(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.f16397s == r0.f16397s) goto L_0x0053;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9681x(com.google.android.gms.internal.ads.C2774qi r6) throws com.google.android.gms.internal.ads.C2253ci {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.qi r0 = r5.f17573o
            r5.f17573o = r6
            com.google.android.gms.internal.ads.rk r6 = r6.f16395i
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.rk r1 = r0.f16395i
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.C2893tq.m21184o(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.qi r6 = r5.f17573o
            com.google.android.gms.internal.ads.rk r6 = r6.f16395i
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo8372g()
            com.google.android.gms.internal.ads.ci r6 = com.google.android.gms.internal.ads.C2253ci.m10944a(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.f17574p
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.qm r2 = r5.f17575q
            boolean r2 = r2.f16465b
            com.google.android.gms.internal.ads.qi r3 = r5.f17573o
            boolean r6 = r5.mo9670I(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.f17558G = r1
            r5.f17559H = r1
            boolean r6 = r5.f17578t
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.qi r6 = r5.f17573o
            int r3 = r6.f16396r
            int r4 = r0.f16396r
            if (r3 != r4) goto L_0x0052
            int r6 = r6.f16397s
            int r0 = r0.f16397s
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r5.f17583y = r1
            return
        L_0x0056:
            boolean r6 = r5.f17561J
            if (r6 == 0) goto L_0x005d
            r5.f17560I = r1
            return
        L_0x005d:
            r5.mo9669H()
            r5.mo14080F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2852sm.mo9681x(com.google.android.gms.internal.ads.qi):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo9682y(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C2253ci;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo9931z() throws C2253ci {
    }
}
