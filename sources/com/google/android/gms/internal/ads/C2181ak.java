package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.ak */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2181ak {

    /* renamed from: A */
    private Method f6600A;

    /* renamed from: B */
    private int f6601B;

    /* renamed from: C */
    private long f6602C;

    /* renamed from: D */
    private long f6603D;

    /* renamed from: E */
    private int f6604E;

    /* renamed from: F */
    private long f6605F;

    /* renamed from: G */
    private long f6606G;

    /* renamed from: H */
    private int f6607H;

    /* renamed from: I */
    private int f6608I;

    /* renamed from: J */
    private long f6609J;

    /* renamed from: K */
    private long f6610K;

    /* renamed from: L */
    private long f6611L;

    /* renamed from: M */
    private float f6612M;

    /* renamed from: N */
    private C2403gj[] f6613N;

    /* renamed from: O */
    private ByteBuffer[] f6614O;

    /* renamed from: P */
    private ByteBuffer f6615P;

    /* renamed from: Q */
    private ByteBuffer f6616Q;

    /* renamed from: R */
    private byte[] f6617R;

    /* renamed from: S */
    private int f6618S;

    /* renamed from: T */
    private int f6619T;

    /* renamed from: U */
    private boolean f6620U;

    /* renamed from: V */
    private boolean f6621V;

    /* renamed from: W */
    private int f6622W;

    /* renamed from: X */
    private boolean f6623X;

    /* renamed from: Y */
    private long f6624Y;

    /* renamed from: a */
    private final C2218bk f6625a;

    /* renamed from: b */
    private final C2441hk f6626b;

    /* renamed from: c */
    private final C2403gj[] f6627c;

    /* renamed from: d */
    private final C2997wj f6628d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f6629e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f6630f;

    /* renamed from: g */
    private final C2812rj f6631g;

    /* renamed from: h */
    private final LinkedList f6632h;

    /* renamed from: i */
    private AudioTrack f6633i;

    /* renamed from: j */
    private int f6634j;

    /* renamed from: k */
    private int f6635k;

    /* renamed from: l */
    private int f6636l;

    /* renamed from: m */
    private int f6637m;

    /* renamed from: n */
    private boolean f6638n;

    /* renamed from: o */
    private int f6639o;

    /* renamed from: p */
    private long f6640p;

    /* renamed from: q */
    private C2959vi f6641q;

    /* renamed from: r */
    private C2959vi f6642r;

    /* renamed from: s */
    private long f6643s;

    /* renamed from: t */
    private long f6644t;

    /* renamed from: u */
    private int f6645u;

    /* renamed from: v */
    private int f6646v;

    /* renamed from: w */
    private long f6647w;

    /* renamed from: x */
    private long f6648x;

    /* renamed from: y */
    private boolean f6649y;

    /* renamed from: z */
    private long f6650z;

    public C2181ak(C2328ej ejVar, C2403gj[] gjVarArr, C2997wj wjVar) {
        this.f6628d = wjVar;
        if (C2893tq.f18208a >= 18) {
            try {
                this.f6600A = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C2893tq.f18208a >= 19) {
            this.f6631g = new C2849sj();
        } else {
            this.f6631g = new C2812rj((C2775qj) null);
        }
        C2218bk bkVar = new C2218bk();
        this.f6625a = bkVar;
        C2441hk hkVar = new C2441hk();
        this.f6626b = hkVar;
        C2403gj[] gjVarArr2 = new C2403gj[3];
        this.f6627c = gjVarArr2;
        gjVarArr2[0] = new C2367fk();
        gjVarArr2[1] = bkVar;
        System.arraycopy(gjVarArr, 0, gjVarArr2, 2, 0);
        gjVarArr2[2] = hkVar;
        this.f6630f = new long[10];
        this.f6612M = 1.0f;
        this.f6608I = 0;
        this.f6622W = 0;
        this.f6642r = C2959vi.f19105d;
        this.f6619T = -1;
        this.f6613N = new C2403gj[0];
        this.f6614O = new ByteBuffer[0];
        this.f6632h = new LinkedList();
    }

    /* renamed from: p */
    private final long m9803p(long j) {
        return (j * ((long) this.f6634j)) / 1000000;
    }

    /* renamed from: q */
    private final long m9804q(long j) {
        return (j * 1000000) / ((long) this.f6634j);
    }

    /* renamed from: r */
    private final long m9805r() {
        return this.f6638n ? this.f6606G : this.f6605F / ((long) this.f6604E);
    }

    /* renamed from: s */
    private final void m9806s(long j) throws C3108zj {
        ByteBuffer byteBuffer;
        int length = this.f6613N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f6614O[i - 1];
            } else {
                byteBuffer = this.f6615P;
                if (byteBuffer == null) {
                    byteBuffer = C2403gj.f9915a;
                }
            }
            if (i == length) {
                m9813z(byteBuffer, j);
            } else {
                C2403gj gjVar = this.f6613N[i];
                gjVar.mo8845f(byteBuffer);
                ByteBuffer e = gjVar.mo8844e();
                this.f6614O[i] = e;
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

    /* renamed from: t */
    private final void m9807t() {
        ArrayList arrayList = new ArrayList();
        C2403gj[] gjVarArr = this.f6627c;
        for (int i = 0; i < 3; i++) {
            C2403gj gjVar = gjVarArr[i];
            if (gjVar.mo8838V()) {
                arrayList.add(gjVar);
            } else {
                gjVar.mo8841b();
            }
        }
        int size = arrayList.size();
        this.f6613N = (C2403gj[]) arrayList.toArray(new C2403gj[size]);
        this.f6614O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            C2403gj gjVar2 = this.f6613N[i2];
            gjVar2.mo8841b();
            this.f6614O[i2] = gjVar2.mo8844e();
        }
    }

    /* renamed from: u */
    private final void m9808u() {
        this.f6647w = 0;
        this.f6646v = 0;
        this.f6645u = 0;
        this.f6648x = 0;
        this.f6649y = false;
        this.f6650z = 0;
    }

    /* renamed from: v */
    private final void m9809v() {
        if (m9811x()) {
            if (C2893tq.f18208a >= 21) {
                this.f6633i.setVolume(this.f6612M);
                return;
            }
            AudioTrack audioTrack = this.f6633i;
            float f = this.f6612M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9810w() throws com.google.android.gms.internal.ads.C3108zj {
        /*
            r9 = this;
            int r0 = r9.f6619T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f6638n
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.gj[] r0 = r9.f6613N
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f6619T = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f6619T
            com.google.android.gms.internal.ads.gj[] r5 = r9.f6613N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo8840a()
        L_0x0028:
            r9.m9806s(r7)
            boolean r0 = r4.mo8839W()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f6619T
            int r0 = r0 + r2
            r9.f6619T = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f6616Q
            if (r0 == 0) goto L_0x0044
            r9.m9813z(r0, r7)
            java.nio.ByteBuffer r0 = r9.f6616Q
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f6619T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2181ak.m9810w():boolean");
    }

    /* renamed from: x */
    private final boolean m9811x() {
        return this.f6633i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f6637m;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9812y() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.C2893tq.f18208a
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.f6637m
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2181ak.m9812y():boolean");
    }

    /* renamed from: z */
    private final boolean m9813z(ByteBuffer byteBuffer, long j) throws C3108zj {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f6616Q;
        if (byteBuffer2 != null) {
            C2335eq.m12243c(byteBuffer2 == byteBuffer);
        } else {
            this.f6616Q = byteBuffer;
            if (C2893tq.f18208a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f6617R;
                if (bArr == null || bArr.length < remaining) {
                    this.f6617R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f6617R, 0, remaining);
                byteBuffer.position(position);
                this.f6618S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C2893tq.f18208a < 21) {
            int a = this.f6639o - ((int) (this.f6605F - (this.f6631g.mo13813a() * ((long) this.f6604E))));
            if (a > 0) {
                i = this.f6633i.write(this.f6617R, this.f6618S, Math.min(remaining2, a));
                if (i > 0) {
                    this.f6618S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.f6633i.write(byteBuffer, remaining2, 1);
        }
        this.f6624Y = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.f6638n;
            if (!z) {
                this.f6605F += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.f6606G += (long) this.f6607H;
            }
            this.f6616Q = null;
            return true;
        }
        throw new C3108zj(i);
    }

    /* renamed from: a */
    public final long mo8402a(boolean z) {
        long j;
        long j2;
        if (!m9811x() || this.f6608I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f6633i.getPlayState() == 3) {
            long b = this.f6631g.mo13814b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f6648x >= 30000) {
                    long[] jArr = this.f6630f;
                    int i = this.f6645u;
                    jArr[i] = b - nanoTime;
                    this.f6645u = (i + 1) % 10;
                    int i2 = this.f6646v;
                    if (i2 < 10) {
                        this.f6646v = i2 + 1;
                    }
                    this.f6648x = nanoTime;
                    this.f6647w = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f6646v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f6647w += this.f6630f[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m9812y() && nanoTime - this.f6650z >= 500000) {
                    boolean h = this.f6631g.mo13820h();
                    this.f6649y = h;
                    if (h) {
                        long d = this.f6631g.mo13816d() / 1000;
                        long c = this.f6631g.mo13815c();
                        if (d < this.f6610K) {
                            this.f6649y = false;
                        } else if (Math.abs(d - nanoTime) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b);
                            this.f6649y = false;
                        } else if (Math.abs(m9804q(c) - b) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + c + ", " + d + ", " + nanoTime + ", " + b);
                            this.f6649y = false;
                        }
                    }
                    Method method = this.f6600A;
                    if (method != null && !this.f6638n) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f6633i, (Object[]) null)).intValue()) * 1000) - this.f6640p;
                            this.f6611L = intValue;
                            long max = Math.max(intValue, 0);
                            this.f6611L = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + max);
                                this.f6611L = 0;
                            }
                        } catch (Exception unused) {
                            this.f6600A = null;
                        }
                    }
                    this.f6650z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f6649y) {
            j = m9804q(this.f6631g.mo13815c() + m9803p(nanoTime2 - (this.f6631g.mo13816d() / 1000)));
        } else {
            j = this.f6646v == 0 ? this.f6631g.mo13814b() : nanoTime2 + this.f6647w;
            if (!z) {
                j -= this.f6611L;
            }
        }
        long j3 = this.f6609J;
        while (!this.f6632h.isEmpty() && j >= ((C3071yj) this.f6632h.getFirst()).f20632c) {
            C3071yj yjVar = (C3071yj) this.f6632h.remove();
            this.f6642r = yjVar.f20630a;
            this.f6644t = yjVar.f20632c;
            this.f6643s = yjVar.f20631b - this.f6609J;
        }
        if (this.f6642r.f19106a == 1.0f) {
            j2 = (j + this.f6643s) - this.f6644t;
        } else {
            if (this.f6632h.isEmpty()) {
                C2441hk hkVar = this.f6626b;
                if (hkVar.mo10830k() >= 1024) {
                    j2 = C2893tq.m21179j(j - this.f6644t, hkVar.mo10829j(), hkVar.mo10830k()) + this.f6643s;
                }
            }
            j2 = ((long) (((double) this.f6642r.f19106a) * ((double) (j - this.f6644t)))) + this.f6643s;
        }
        return j3 + j2;
    }

    /* renamed from: c */
    public final C2959vi mo8403c() {
        return this.f6642r;
    }

    /* renamed from: d */
    public final C2959vi mo8404d(C2959vi viVar) {
        if (this.f6638n) {
            C2959vi viVar2 = C2959vi.f19105d;
            this.f6642r = viVar2;
            return viVar2;
        }
        float i = this.f6626b.mo10828i(viVar.f19106a);
        this.f6626b.mo10827h(1.0f);
        C2959vi viVar3 = new C2959vi(i, 1.0f);
        C2959vi viVar4 = this.f6641q;
        if (viVar4 == null) {
            if (!this.f6632h.isEmpty()) {
                viVar4 = ((C3071yj) this.f6632h.getLast()).f20630a;
            } else {
                viVar4 = this.f6642r;
            }
        }
        if (!viVar3.equals(viVar4)) {
            if (m9811x()) {
                this.f6641q = viVar3;
            } else {
                this.f6642r = viVar3;
            }
        }
        return this.f6642r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8405e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.C2886tj {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.C2893tq.m21178i(r10, r8)
            r6.f6601B = r7
            com.google.android.gms.internal.ads.bk r7 = r6.f6625a
            r7.mo8847h(r12)
            com.google.android.gms.internal.ads.gj[] r7 = r6.f6627c
            r11 = 0
            r12 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r3 = r1.mo8846g(r9, r8, r10)     // Catch:{ fj -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.mo8838V()
            if (r3 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.mo8843d()
            r10 = 2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.tj r8 = new com.google.android.gms.internal.ads.tj
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.m9807t()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0066;
                case 3: goto L_0x0063;
                case 4: goto L_0x0060;
                case 5: goto L_0x005d;
                case 6: goto L_0x005a;
                case 7: goto L_0x0057;
                case 8: goto L_0x0054;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.tj r7 = new com.google.android.gms.internal.ads.tj
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unsupported channel count: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0054:
            int r12 = com.google.android.gms.internal.ads.C2216bi.f7272a
            goto L_0x006a
        L_0x0057:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006a
        L_0x005a:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x006a
        L_0x005d:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x006a
        L_0x0060:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x006a
        L_0x0063:
            r12 = 28
            goto L_0x006a
        L_0x0066:
            r12 = 12
            goto L_0x006a
        L_0x0069:
            r12 = 4
        L_0x006a:
            int r3 = com.google.android.gms.internal.ads.C2893tq.f18208a
            r4 = 23
            if (r3 > r4) goto L_0x0090
            java.lang.String r4 = com.google.android.gms.internal.ads.C2893tq.f18209b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0090
            java.lang.String r4 = com.google.android.gms.internal.ads.C2893tq.f18210c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0090
            if (r8 == r1) goto L_0x0091
            r1 = 5
            if (r8 == r1) goto L_0x0091
            r7 = 7
            if (r8 == r7) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            int r7 = com.google.android.gms.internal.ads.C2216bi.f7272a
            goto L_0x0091
        L_0x0090:
            r7 = r12
        L_0x0091:
            r12 = 25
            if (r3 > r12) goto L_0x009d
            java.lang.String r12 = com.google.android.gms.internal.ads.C2893tq.f18209b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
        L_0x009d:
            if (r0 != 0) goto L_0x00b3
            boolean r12 = r6.m9811x()
            if (r12 == 0) goto L_0x00b3
            int r12 = r6.f6636l
            if (r12 != r10) goto L_0x00b3
            int r12 = r6.f6634j
            if (r12 != r9) goto L_0x00b3
            int r12 = r6.f6635k
            if (r12 == r7) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            return
        L_0x00b3:
            r6.mo8411k()
            r6.f6636l = r10
            r6.f6638n = r11
            r6.f6634j = r9
            r6.f6635k = r7
            r6.f6637m = r2
            int r8 = com.google.android.gms.internal.ads.C2893tq.m21178i(r2, r8)
            r6.f6604E = r8
            int r8 = r6.f6637m
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00d0
            r11 = 1
        L_0x00d0:
            com.google.android.gms.internal.ads.C2335eq.m12245e(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.m9803p(r9)
            int r11 = r6.f6604E
            int r10 = (int) r9
            int r10 = r10 * r11
            long r0 = (long) r7
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r6.m9803p(r2)
            long r11 = (long) r11
            long r2 = r2 * r11
            long r11 = java.lang.Math.max(r0, r2)
            int r7 = (int) r11
            if (r8 >= r10) goto L_0x00f5
            r8 = r10
            goto L_0x00f8
        L_0x00f5:
            if (r8 <= r7) goto L_0x00f8
            r8 = r7
        L_0x00f8:
            r6.f6639o = r8
            int r7 = r6.f6604E
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.m9804q(r7)
            r6.f6640p = r7
            com.google.android.gms.internal.ads.vi r7 = r6.f6642r
            r6.mo8404d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2181ak.mo8405e(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: f */
    public final void mo8406f() {
        if (this.f6608I == 1) {
            this.f6608I = 2;
        }
    }

    /* renamed from: g */
    public final void mo8407g() {
        this.f6621V = false;
        if (m9811x()) {
            m9808u();
            this.f6631g.mo13818f();
        }
    }

    /* renamed from: h */
    public final void mo8408h() {
        this.f6621V = true;
        if (m9811x()) {
            this.f6610K = System.nanoTime() / 1000;
            this.f6633i.play();
        }
    }

    /* renamed from: i */
    public final void mo8409i() throws C3108zj {
        if (!this.f6620U && m9811x() && m9810w()) {
            this.f6631g.mo13817e(m9805r());
            this.f6620U = true;
        }
    }

    /* renamed from: j */
    public final void mo8410j() {
        mo8411k();
        C2403gj[] gjVarArr = this.f6627c;
        for (int i = 0; i < 3; i++) {
            gjVarArr[i].mo8842c();
        }
        this.f6622W = 0;
        this.f6621V = false;
    }

    /* renamed from: k */
    public final void mo8411k() {
        if (m9811x()) {
            this.f6602C = 0;
            this.f6603D = 0;
            this.f6605F = 0;
            this.f6606G = 0;
            this.f6607H = 0;
            C2959vi viVar = this.f6641q;
            if (viVar != null) {
                this.f6642r = viVar;
                this.f6641q = null;
            } else if (!this.f6632h.isEmpty()) {
                this.f6642r = ((C3071yj) this.f6632h.getLast()).f20630a;
            }
            this.f6632h.clear();
            this.f6643s = 0;
            this.f6644t = 0;
            this.f6615P = null;
            this.f6616Q = null;
            int i = 0;
            while (true) {
                C2403gj[] gjVarArr = this.f6613N;
                if (i >= gjVarArr.length) {
                    break;
                }
                C2403gj gjVar = gjVarArr[i];
                gjVar.mo8841b();
                this.f6614O[i] = gjVar.mo8844e();
                i++;
            }
            this.f6620U = false;
            this.f6619T = -1;
            this.f6608I = 0;
            this.f6611L = 0;
            m9808u();
            if (this.f6633i.getPlayState() == 3) {
                this.f6633i.pause();
            }
            AudioTrack audioTrack = this.f6633i;
            this.f6633i = null;
            this.f6631g.mo13819g((AudioTrack) null, false);
            this.f6629e.close();
            new C2738pj(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void mo8412l(float f) {
        if (this.f6612M != f) {
            this.f6612M = f;
            m9809v();
        }
    }

    /* renamed from: m */
    public final boolean mo8413m(ByteBuffer byteBuffer, long j) throws C2923uj, C3108zj {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.f6615P;
        C2335eq.m12243c(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m9811x()) {
            this.f6629e.block();
            int i2 = this.f6622W;
            if (i2 == 0) {
                this.f6633i = new AudioTrack(3, this.f6634j, this.f6635k, this.f6637m, this.f6639o, 1);
            } else {
                this.f6633i = new AudioTrack(3, this.f6634j, this.f6635k, this.f6637m, this.f6639o, 1, i2);
            }
            int state = this.f6633i.getState();
            if (state == 1) {
                int audioSessionId = this.f6633i.getAudioSessionId();
                if (this.f6622W != audioSessionId) {
                    this.f6622W = audioSessionId;
                    ((C2292dk) this.f6628d).f8296a.f8821Q.mo12633b(audioSessionId);
                }
                this.f6631g.mo13819g(this.f6633i, m9812y());
                m9809v();
                this.f6623X = false;
                if (this.f6621V) {
                    mo8408h();
                }
            } else {
                try {
                    this.f6633i.release();
                } catch (Exception unused) {
                } finally {
                    this.f6633i = null;
                }
                throw new C2923uj(state, this.f6634j, this.f6635k, this.f6639o);
            }
        }
        if (m9812y()) {
            if (this.f6633i.getPlayState() == 2) {
                this.f6623X = false;
                return false;
            } else if (this.f6633i.getPlayState() == 1 && this.f6631g.mo13813a() != 0) {
                return false;
            }
        }
        boolean z = this.f6623X;
        boolean n = mo8414n();
        this.f6623X = n;
        if (z && !n && this.f6633i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.f6624Y;
            C2997wj wjVar = this.f6628d;
            ((C2292dk) wjVar).f8296a.f8821Q.mo12634c(this.f6639o, C2216bi.m10387b(this.f6640p), elapsedRealtime - j4);
        }
        if (this.f6615P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f6638n && this.f6607H == 0) {
                int i3 = this.f6637m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = C2291dj.f8290d;
                    i = 1536;
                } else if (i3 == 6) {
                    i = C2291dj.m11525a(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i3);
                }
                this.f6607H = i;
            }
            if (this.f6641q != null) {
                if (!m9810w()) {
                    return false;
                }
                this.f6632h.add(new C3071yj(this.f6641q, Math.max(0, j3), m9804q(m9805r()), (C3034xj) null));
                this.f6641q = null;
                m9807t();
            }
            if (this.f6608I == 0) {
                this.f6609J = Math.max(0, j3);
                this.f6608I = 1;
            } else {
                long j5 = this.f6609J;
                if (this.f6638n) {
                    j2 = this.f6603D;
                } else {
                    j2 = this.f6602C / ((long) this.f6601B);
                }
                long q = j5 + m9804q(j2);
                if (this.f6608I == 1 && Math.abs(q - j3) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + q + ", got " + j3 + "]");
                    this.f6608I = 2;
                }
                if (this.f6608I == 2) {
                    this.f6609J += j3 - q;
                    this.f6608I = 1;
                    ((C2292dk) this.f6628d).f8296a.f8827W = true;
                }
            }
            if (this.f6638n) {
                this.f6603D += (long) this.f6607H;
            } else {
                this.f6602C += (long) byteBuffer.remaining();
            }
            this.f6615P = byteBuffer2;
        }
        if (this.f6638n) {
            m9813z(this.f6615P, j3);
        } else {
            m9806s(j3);
        }
        if (this.f6615P.hasRemaining()) {
            return false;
        }
        this.f6615P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean mo8414n() {
        if (m9811x()) {
            if (m9805r() > this.f6631g.mo13813a()) {
                return true;
            }
            if (m9812y() && this.f6633i.getPlayState() == 2 && this.f6633i.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo8415o() {
        return !m9811x() || (this.f6620U && !mo8414n());
    }
}
