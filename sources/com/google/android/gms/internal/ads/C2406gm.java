package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.gm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2406gm implements C2961vk {

    /* renamed from: w */
    public static final C3072yk f9969w = new C2294dm();

    /* renamed from: x */
    private static final int f9970x = C2893tq.m21176g("seig");

    /* renamed from: y */
    private static final byte[] f9971y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: a */
    private final SparseArray f9972a = new SparseArray();

    /* renamed from: b */
    private final C2633mq f9973b = new C2633mq(C2559kq.f12213a);

    /* renamed from: c */
    private final C2633mq f9974c = new C2633mq(5);

    /* renamed from: d */
    private final C2633mq f9975d = new C2633mq();

    /* renamed from: e */
    private final C2633mq f9976e = new C2633mq(1);

    /* renamed from: f */
    private final C2633mq f9977f = new C2633mq(16);

    /* renamed from: g */
    private final byte[] f9978g = new byte[16];

    /* renamed from: h */
    private final Stack f9979h = new Stack();

    /* renamed from: i */
    private final LinkedList f9980i = new LinkedList();

    /* renamed from: j */
    private int f9981j;

    /* renamed from: k */
    private int f9982k;

    /* renamed from: l */
    private long f9983l;

    /* renamed from: m */
    private int f9984m;

    /* renamed from: n */
    private C2633mq f9985n;

    /* renamed from: o */
    private long f9986o;

    /* renamed from: p */
    private long f9987p = -9223372036854775807L;

    /* renamed from: q */
    private C2369fm f9988q;

    /* renamed from: r */
    private int f9989r;

    /* renamed from: s */
    private int f9990s;

    /* renamed from: t */
    private int f9991t;

    /* renamed from: u */
    private C3035xk f9992u;

    /* renamed from: v */
    private boolean f9993v;

    public C2406gm(int i, C2782qq qqVar, C2629mm mmVar) {
        m13386e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.C2813rk m13385c(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b5
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.sl r5 = (com.google.android.gms.internal.ads.C2851sl) r5
            int r6 = r5.f18129a
            int r7 = com.google.android.gms.internal.ads.C2888tl.f18073V
            if (r6 != r7) goto L_0x00b1
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.mq r5 = r5.f17521P0
            byte[] r5 = r5.f13448a
            com.google.android.gms.internal.ads.mq r6 = new com.google.android.gms.internal.ads.mq
            r6.<init>((byte[]) r5)
            int r8 = r6.mo12393d()
            r9 = 32
            if (r8 >= r9) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0095
        L_0x0030:
            r6.mo12411v(r1)
            int r8 = r6.mo12394e()
            int r9 = r6.mo12390a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r8 = r6.mo12394e()
            if (r8 == r7) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            int r7 = r6.mo12394e()
            int r7 = com.google.android.gms.internal.ads.C2888tl.m21067b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x0069:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo12401l()
            long r12 = r6.mo12401l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0081
            int r7 = r6.mo12398i()
            int r7 = r7 * 16
            r6.mo12412w(r7)
        L_0x0081:
            int r7 = r6.mo12398i()
            int r8 = r6.mo12390a()
            if (r7 == r8) goto L_0x008c
            goto L_0x002e
        L_0x008c:
            byte[] r8 = new byte[r7]
            r6.mo12406q(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0095:
            if (r6 != 0) goto L_0x0099
            r6 = r2
            goto L_0x009d
        L_0x0099:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x009d:
            if (r6 != 0) goto L_0x00a7
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b1
        L_0x00a7:
            com.google.android.gms.internal.ads.qk r7 = new com.google.android.gms.internal.ads.qk
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b1:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b5:
            if (r4 != 0) goto L_0x00b8
            return r2
        L_0x00b8:
            com.google.android.gms.internal.ads.rk r14 = new com.google.android.gms.internal.ads.rk
            r14.<init>((java.util.List) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2406gm.m13385c(java.util.List):com.google.android.gms.internal.ads.rk");
    }

    /* renamed from: e */
    private final void m13386e() {
        this.f9981j = 0;
        this.f9984m = 0;
    }

    /* renamed from: g */
    private static void m13387g(C2633mq mqVar, int i, C2703om omVar) throws C2885ti {
        mqVar.mo12411v(i + 8);
        int a = C2888tl.m21066a(mqVar.mo12394e());
        if ((a & 1) == 0) {
            boolean z = (a & 2) != 0;
            int i2 = mqVar.mo12398i();
            int i3 = omVar.f15246e;
            if (i2 == i3) {
                Arrays.fill(omVar.f15254m, 0, i2, z);
                omVar.mo12976a(mqVar.mo12390a());
                mqVar.mo12406q(omVar.f15257p.f13448a, 0, omVar.f15256o);
                omVar.f15257p.mo12411v(0);
                omVar.f15258q = false;
                return;
            }
            throw new C2885ti("Length mismatch: " + i2 + ", " + i3);
        }
        throw new C2885ti("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0595  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13388h(long r50) throws com.google.android.gms.internal.ads.C2885ti {
        /*
            r49 = this;
        L_0x0000:
            r0 = r49
        L_0x0002:
            java.util.Stack r1 = r0.f9979h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x062d
            java.util.Stack r1 = r0.f9979h
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.rl r1 = (com.google.android.gms.internal.ads.C2814rl) r1
            long r1 = r1.f16995P0
            int r3 = (r1 > r50 ? 1 : (r1 == r50 ? 0 : -1))
            if (r3 != 0) goto L_0x062d
            java.util.Stack r1 = r0.f9979h
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.rl r1 = (com.google.android.gms.internal.ads.C2814rl) r1
            int r2 = r1.f18129a
            int r3 = com.google.android.gms.internal.ads.C2888tl.f18041C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List r2 = r1.f16996Q0
            com.google.android.gms.internal.ads.rk r2 = m13385c(r2)
            int r3 = com.google.android.gms.internal.ads.C2888tl.f18063N
            com.google.android.gms.internal.ads.rl r3 = r1.mo13836d(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.List r8 = r3.f16996Q0
            int r8 = r8.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = r9
            r9 = 0
        L_0x0049:
            if (r9 >= r8) goto L_0x00b3
            java.util.List r10 = r3.f16996Q0
            java.lang.Object r10 = r10.get(r9)
            com.google.android.gms.internal.ads.sl r10 = (com.google.android.gms.internal.ads.C2851sl) r10
            int r11 = r10.f18129a
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18127z
            if (r11 != r12) goto L_0x0091
            com.google.android.gms.internal.ads.mq r10 = r10.f17521P0
            r10.mo12411v(r4)
            int r11 = r10.mo12394e()
            int r12 = r10.mo12398i()
            int r13 = r10.mo12398i()
            int r6 = r10.mo12398i()
            int r10 = r10.mo12394e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.internal.ads.cm r4 = new com.google.android.gms.internal.ads.cm
            int r12 = r12 + -1
            r4.<init>(r12, r13, r6, r10)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.cm r4 = (com.google.android.gms.internal.ads.C2257cm) r4
            r14.put(r6, r4)
            goto L_0x00ae
        L_0x0091:
            int r4 = com.google.android.gms.internal.ads.C2888tl.f18065O
            if (r11 != r4) goto L_0x00ae
            com.google.android.gms.internal.ads.mq r4 = r10.f17521P0
            r4.mo12411v(r5)
            int r6 = r4.mo12394e()
            int r6 = com.google.android.gms.internal.ads.C2888tl.m21067b(r6)
            if (r6 != 0) goto L_0x00a9
            long r10 = r4.mo12402m()
            goto L_0x00ad
        L_0x00a9:
            long r10 = r4.mo12403n()
        L_0x00ad:
            r15 = r10
        L_0x00ae:
            int r9 = r9 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b3:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List r4 = r1.f16997R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bf:
            if (r5 >= r4) goto L_0x00e7
            java.util.List r6 = r1.f16997R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.google.android.gms.internal.ads.rl r8 = (com.google.android.gms.internal.ads.C2814rl) r8
            int r6 = r8.f18129a
            int r9 = com.google.android.gms.internal.ads.C2888tl.f18045E
            if (r6 != r9) goto L_0x00e4
            int r6 = com.google.android.gms.internal.ads.C2888tl.f18043D
            com.google.android.gms.internal.ads.sl r9 = r1.mo13837e(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.google.android.gms.internal.ads.mm r6 = com.google.android.gms.internal.ads.C2220bm.m10474a(r8, r9, r10, r12, r13)
            if (r6 == 0) goto L_0x00e4
            int r8 = r6.f13395a
            r3.put(r8, r6)
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00bf
        L_0x00e7:
            int r1 = r3.size()
            android.util.SparseArray r2 = r0.f9972a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f4:
            if (r6 >= r1) goto L_0x0128
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.mm r2 = (com.google.android.gms.internal.ads.C2629mm) r2
            com.google.android.gms.internal.ads.fm r4 = new com.google.android.gms.internal.ads.fm
            com.google.android.gms.internal.ads.xk r5 = r0.f9992u
            int r7 = r2.f13396b
            com.google.android.gms.internal.ads.fl r5 = r5.mo15103g(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f13395a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.cm r5 = (com.google.android.gms.internal.ads.C2257cm) r5
            r4.mo10189a(r2, r5)
            android.util.SparseArray r5 = r0.f9972a
            int r7 = r2.f13395a
            r5.put(r7, r4)
            long r4 = r0.f9987p
            long r7 = r2.f13399e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f9987p = r4
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0128:
            com.google.android.gms.internal.ads.xk r1 = r0.f9992u
            r1.mo15102d()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray r2 = r0.f9972a
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.C2335eq.m12245e(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.mm r2 = (com.google.android.gms.internal.ads.C2629mm) r2
            android.util.SparseArray r4 = r0.f9972a
            int r5 = r2.f13395a
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.fm r4 = (com.google.android.gms.internal.ads.C2369fm) r4
            int r5 = r2.f13395a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.cm r5 = (com.google.android.gms.internal.ads.C2257cm) r5
            r4.mo10189a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.google.android.gms.internal.ads.C2888tl.f18059L
            if (r2 != r3) goto L_0x0616
            android.util.SparseArray r2 = r0.f9972a
            byte[] r3 = r0.f9978g
            java.util.List r4 = r1.f16997R0
            int r4 = r4.size()
            r6 = 0
        L_0x016c:
            if (r6 >= r4) goto L_0x05ea
            java.util.List r8 = r1.f16997R0
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.rl r8 = (com.google.android.gms.internal.ads.C2814rl) r8
            int r9 = r8.f18129a
            int r10 = com.google.android.gms.internal.ads.C2888tl.f18061M
            if (r9 != r10) goto L_0x05d0
            int r9 = com.google.android.gms.internal.ads.C2888tl.f18125y
            com.google.android.gms.internal.ads.sl r9 = r8.mo13837e(r9)
            com.google.android.gms.internal.ads.mq r9 = r9.f17521P0
            r9.mo12411v(r5)
            int r10 = r9.mo12394e()
            int r10 = com.google.android.gms.internal.ads.C2888tl.m21066a(r10)
            int r11 = r9.mo12394e()
            java.lang.Object r11 = r2.get(r11)
            com.google.android.gms.internal.ads.fm r11 = (com.google.android.gms.internal.ads.C2369fm) r11
            if (r11 != 0) goto L_0x019d
            r11 = 0
            goto L_0x01e4
        L_0x019d:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01ab
            long r12 = r9.mo12403n()
            com.google.android.gms.internal.ads.om r14 = r11.f9329a
            r14.f15243b = r12
            r14.f15244c = r12
        L_0x01ab:
            com.google.android.gms.internal.ads.cm r12 = r11.f9332d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01b8
            int r13 = r9.mo12398i()
            int r13 = r13 + -1
            goto L_0x01ba
        L_0x01b8:
            int r13 = r12.f7823a
        L_0x01ba:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01c3
            int r14 = r9.mo12398i()
            goto L_0x01c5
        L_0x01c3:
            int r14 = r12.f7824b
        L_0x01c5:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01ce
            int r15 = r9.mo12398i()
            goto L_0x01d0
        L_0x01ce:
            int r15 = r12.f7825c
        L_0x01d0:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01d9
            int r9 = r9.mo12398i()
            goto L_0x01db
        L_0x01d9:
            int r9 = r12.f7826d
        L_0x01db:
            com.google.android.gms.internal.ads.om r10 = r11.f9329a
            com.google.android.gms.internal.ads.cm r12 = new com.google.android.gms.internal.ads.cm
            r12.<init>(r13, r14, r15, r9)
            r10.f15242a = r12
        L_0x01e4:
            if (r11 != 0) goto L_0x01e8
            goto L_0x05d0
        L_0x01e8:
            com.google.android.gms.internal.ads.om r9 = r11.f9329a
            long r12 = r9.f15259r
            r11.mo10190b()
            int r10 = com.google.android.gms.internal.ads.C2888tl.f18123x
            com.google.android.gms.internal.ads.sl r14 = r8.mo13837e(r10)
            if (r14 == 0) goto L_0x0213
            com.google.android.gms.internal.ads.sl r10 = r8.mo13837e(r10)
            com.google.android.gms.internal.ads.mq r10 = r10.f17521P0
            r10.mo12411v(r5)
            int r12 = r10.mo12394e()
            int r12 = com.google.android.gms.internal.ads.C2888tl.m21067b(r12)
            if (r12 != r7) goto L_0x020f
            long r12 = r10.mo12403n()
            goto L_0x0213
        L_0x020f:
            long r12 = r10.mo12402m()
        L_0x0213:
            java.util.List r10 = r8.f16996Q0
            int r14 = r10.size()
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x021c:
            if (r15 >= r14) goto L_0x024e
            java.lang.Object r18 = r10.get(r15)
            r19 = r2
            r2 = r18
            com.google.android.gms.internal.ads.sl r2 = (com.google.android.gms.internal.ads.C2851sl) r2
            r18 = r4
            int r4 = r2.f18129a
            r20 = r12
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18037A
            if (r4 != r12) goto L_0x0243
            com.google.android.gms.internal.ads.mq r2 = r2.f17521P0
            r4 = 12
            r2.mo12411v(r4)
            int r2 = r2.mo12398i()
            if (r2 <= 0) goto L_0x0245
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L_0x0245
        L_0x0243:
            r4 = 12
        L_0x0245:
            int r15 = r15 + 1
            r4 = r18
            r2 = r19
            r12 = r20
            goto L_0x021c
        L_0x024e:
            r19 = r2
            r18 = r4
            r20 = r12
            r2 = 0
            r4 = 12
            r11.f9335g = r2
            r11.f9334f = r2
            r11.f9333e = r2
            com.google.android.gms.internal.ads.om r2 = r11.f9329a
            r2.f15245d = r7
            r2.f15246e = r5
            int[] r12 = r2.f15248g
            if (r12 == 0) goto L_0x026a
            int r12 = r12.length
            if (r12 >= r7) goto L_0x0272
        L_0x026a:
            long[] r12 = new long[r7]
            r2.f15247f = r12
            int[] r7 = new int[r7]
            r2.f15248g = r7
        L_0x0272:
            int[] r7 = r2.f15249h
            if (r7 == 0) goto L_0x0279
            int r7 = r7.length
            if (r7 >= r5) goto L_0x0291
        L_0x0279:
            int r5 = r5 * 125
            int r5 = r5 / 100
            int[] r7 = new int[r5]
            r2.f15249h = r7
            int[] r7 = new int[r5]
            r2.f15250i = r7
            long[] r7 = new long[r5]
            r2.f15251j = r7
            boolean[] r7 = new boolean[r5]
            r2.f15252k = r7
            boolean[] r5 = new boolean[r5]
            r2.f15254m = r5
        L_0x0291:
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x0294:
            if (r2 >= r14) goto L_0x03fe
            java.lang.Object r17 = r10.get(r2)
            r4 = r17
            com.google.android.gms.internal.ads.sl r4 = (com.google.android.gms.internal.ads.C2851sl) r4
            int r15 = r4.f18129a
            int r12 = com.google.android.gms.internal.ads.C2888tl.f18037A
            if (r15 != r12) goto L_0x03d4
            int r12 = r7 + 1
            com.google.android.gms.internal.ads.mq r4 = r4.f17521P0
            r13 = 8
            r4.mo12411v(r13)
            int r13 = r4.mo12394e()
            int r13 = com.google.android.gms.internal.ads.C2888tl.m21066a(r13)
            com.google.android.gms.internal.ads.mm r15 = r11.f9331c
            r24 = r10
            com.google.android.gms.internal.ads.om r10 = r11.f9329a
            r25 = r12
            com.google.android.gms.internal.ads.cm r12 = r10.f15242a
            r26 = r14
            int[] r14 = r10.f15248g
            int r27 = r4.mo12398i()
            r14[r7] = r27
            long[] r14 = r10.f15247f
            r27 = r1
            long r0 = r10.f15243b
            r14[r7] = r0
            r28 = r13 & 1
            if (r28 == 0) goto L_0x02e4
            r28 = r6
            int r6 = r4.mo12394e()
            r29 = r8
            r30 = r9
            long r8 = (long) r6
            long r0 = r0 + r8
            r14[r7] = r0
            goto L_0x02ea
        L_0x02e4:
            r28 = r6
            r29 = r8
            r30 = r9
        L_0x02ea:
            r0 = r13 & 4
            int r1 = r12.f7826d
            if (r0 == 0) goto L_0x02f4
            int r1 = r4.mo12398i()
        L_0x02f4:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r8 = r13 & 512(0x200, float:7.175E-43)
            r9 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            long[] r14 = r15.f13403i
            if (r14 == 0) goto L_0x0323
            r31 = r1
            int r1 = r14.length
            r32 = r3
            r3 = 1
            if (r1 != r3) goto L_0x0327
            r1 = 0
            r33 = r14[r1]
            r22 = 0
            int r3 = (r33 > r22 ? 1 : (r33 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0327
            long[] r3 = r15.f13404j
            r33 = r3[r1]
            r35 = 1000(0x3e8, double:4.94E-321)
            r3 = r2
            long r1 = r15.f13397c
            r37 = r1
            long r1 = com.google.android.gms.internal.ads.C2893tq.m21179j(r33, r35, r37)
            r22 = r1
            goto L_0x032a
        L_0x0323:
            r31 = r1
            r32 = r3
        L_0x0327:
            r3 = r2
            r22 = 0
        L_0x032a:
            int[] r1 = r10.f15249h
            int[] r2 = r10.f15250i
            long[] r14 = r10.f15251j
            r33 = r11
            boolean[] r11 = r10.f15252k
            r34 = r3
            int[] r3 = r10.f15248g
            r3 = r3[r7]
            int r3 = r3 + r5
            r41 = r14
            long r14 = r15.f13397c
            if (r7 <= 0) goto L_0x0348
            r42 = r1
            r43 = r2
            long r1 = r10.f15259r
            goto L_0x034e
        L_0x0348:
            r42 = r1
            r43 = r2
            r1 = r20
        L_0x034e:
            if (r5 >= r3) goto L_0x03cb
            if (r6 == 0) goto L_0x0357
            int r7 = r4.mo12398i()
            goto L_0x0359
        L_0x0357:
            int r7 = r12.f7824b
        L_0x0359:
            if (r8 == 0) goto L_0x0364
            int r35 = r4.mo12398i()
            r44 = r3
            r3 = r35
            goto L_0x0368
        L_0x0364:
            r44 = r3
            int r3 = r12.f7825c
        L_0x0368:
            if (r5 != 0) goto L_0x0373
            if (r0 == 0) goto L_0x0372
            r45 = r0
            r0 = r31
            r5 = 0
            goto L_0x0382
        L_0x0372:
            r5 = 0
        L_0x0373:
            if (r9 == 0) goto L_0x037e
            int r35 = r4.mo12394e()
            r45 = r0
            r0 = r35
            goto L_0x0382
        L_0x037e:
            r45 = r0
            int r0 = r12.f7826d
        L_0x0382:
            if (r13 == 0) goto L_0x0396
            r46 = r6
            int r6 = r4.mo12394e()
            int r6 = r6 * 1000
            r47 = r8
            r48 = r9
            long r8 = (long) r6
            long r8 = r8 / r14
            int r6 = (int) r8
            r43[r5] = r6
            goto L_0x039f
        L_0x0396:
            r46 = r6
            r47 = r8
            r48 = r9
            r6 = 0
            r43[r5] = r6
        L_0x039f:
            r37 = 1000(0x3e8, double:4.94E-321)
            r35 = r1
            r39 = r14
            long r8 = com.google.android.gms.internal.ads.C2893tq.m21179j(r35, r37, r39)
            long r8 = r8 - r22
            r41[r5] = r8
            r42[r5] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03b9
            r0 = 0
            goto L_0x03ba
        L_0x03b9:
            r0 = 1
        L_0x03ba:
            r11[r5] = r0
            long r6 = (long) r7
            long r1 = r1 + r6
            int r5 = r5 + 1
            r3 = r44
            r0 = r45
            r6 = r46
            r8 = r47
            r9 = r48
            goto L_0x034e
        L_0x03cb:
            r44 = r3
            r10.f15259r = r1
            r7 = r25
            r5 = r44
            goto L_0x03e6
        L_0x03d4:
            r27 = r1
            r34 = r2
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r24 = r10
            r33 = r11
            r26 = r14
        L_0x03e6:
            int r2 = r34 + 1
            r0 = r49
            r10 = r24
            r14 = r26
            r1 = r27
            r6 = r28
            r8 = r29
            r9 = r30
            r3 = r32
            r11 = r33
            r4 = 12
            goto L_0x0294
        L_0x03fe:
            r27 = r1
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r33 = r11
            int r0 = com.google.android.gms.internal.ads.C2888tl.f18084d0
            com.google.android.gms.internal.ads.sl r0 = r8.mo13837e(r0)
            if (r0 == 0) goto L_0x048b
            r11 = r33
            com.google.android.gms.internal.ads.mm r1 = r11.f9331c
            com.google.android.gms.internal.ads.nm[] r1 = r1.f13402h
            r2 = r30
            com.google.android.gms.internal.ads.cm r3 = r2.f15242a
            int r3 = r3.f7823a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.mq r0 = r0.f17521P0
            int r1 = r1.f14111a
            r3 = 8
            r0.mo12411v(r3)
            int r4 = r0.mo12394e()
            int r4 = com.google.android.gms.internal.ads.C2888tl.m21066a(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0438
            r0.mo12412w(r3)
        L_0x0438:
            int r3 = r0.mo12396g()
            int r4 = r0.mo12398i()
            int r5 = r2.f15246e
            if (r4 != r5) goto L_0x046c
            if (r3 != 0) goto L_0x045b
            boolean[] r3 = r2.f15254m
            r5 = 0
            r6 = 0
        L_0x044a:
            if (r5 >= r4) goto L_0x0468
            int r7 = r0.mo12396g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0455
            r7 = 1
            goto L_0x0456
        L_0x0455:
            r7 = 0
        L_0x0456:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x044a
        L_0x045b:
            if (r3 <= r1) goto L_0x045f
            r0 = 1
            goto L_0x0460
        L_0x045f:
            r0 = 0
        L_0x0460:
            int r6 = r3 * r4
            boolean[] r1 = r2.f15254m
            r3 = 0
            java.util.Arrays.fill(r1, r3, r4, r0)
        L_0x0468:
            r2.mo12976a(r6)
            goto L_0x048d
        L_0x046c:
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Length mismatch: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x048b:
            r2 = r30
        L_0x048d:
            int r0 = com.google.android.gms.internal.ads.C2888tl.f18086e0
            com.google.android.gms.internal.ads.sl r0 = r8.mo13837e(r0)
            if (r0 == 0) goto L_0x04dd
            com.google.android.gms.internal.ads.mq r0 = r0.f17521P0
            r1 = 8
            r0.mo12411v(r1)
            int r3 = r0.mo12394e()
            int r4 = com.google.android.gms.internal.ads.C2888tl.m21066a(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04ab
            r0.mo12412w(r1)
        L_0x04ab:
            int r1 = r0.mo12398i()
            if (r1 != r5) goto L_0x04c6
            long r4 = r2.f15244c
            int r1 = com.google.android.gms.internal.ads.C2888tl.m21067b(r3)
            if (r1 != 0) goto L_0x04be
            long r0 = r0.mo12402m()
            goto L_0x04c2
        L_0x04be:
            long r0 = r0.mo12403n()
        L_0x04c2:
            long r4 = r4 + r0
            r2.f15244c = r4
            goto L_0x04dd
        L_0x04c6:
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04dd:
            int r0 = com.google.android.gms.internal.ads.C2888tl.f18094i0
            com.google.android.gms.internal.ads.sl r0 = r8.mo13837e(r0)
            if (r0 == 0) goto L_0x04eb
            com.google.android.gms.internal.ads.mq r0 = r0.f17521P0
            r1 = 0
            m13387g(r0, r1, r2)
        L_0x04eb:
            int r0 = com.google.android.gms.internal.ads.C2888tl.f18088f0
            com.google.android.gms.internal.ads.sl r0 = r8.mo13837e(r0)
            int r1 = com.google.android.gms.internal.ads.C2888tl.f18090g0
            com.google.android.gms.internal.ads.sl r1 = r8.mo13837e(r1)
            if (r0 == 0) goto L_0x058b
            if (r1 == 0) goto L_0x058b
            com.google.android.gms.internal.ads.mq r0 = r0.f17521P0
            com.google.android.gms.internal.ads.mq r1 = r1.f17521P0
            r3 = 8
            r0.mo12411v(r3)
            int r3 = r0.mo12394e()
            int r4 = r0.mo12394e()
            int r5 = f9970x
            if (r4 == r5) goto L_0x0512
            goto L_0x058b
        L_0x0512:
            int r3 = com.google.android.gms.internal.ads.C2888tl.m21067b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x051d
            r0.mo12412w(r4)
        L_0x051d:
            int r0 = r0.mo12394e()
            if (r0 != r6) goto L_0x0583
            r0 = 8
            r1.mo12411v(r0)
            int r0 = r1.mo12394e()
            int r3 = r1.mo12394e()
            if (r3 != r5) goto L_0x058b
            int r0 = com.google.android.gms.internal.ads.C2888tl.m21067b(r0)
            r3 = 2
            if (r0 != r6) goto L_0x054c
            long r4 = r1.mo12402m()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0544
            goto L_0x0551
        L_0x0544:
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x054c:
            if (r0 < r3) goto L_0x0551
            r1.mo12412w(r4)
        L_0x0551:
            long r4 = r1.mo12402m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x057b
            r1.mo12412w(r3)
            int r0 = r1.mo12396g()
            r3 = 1
            if (r0 != r3) goto L_0x058c
            int r0 = r1.mo12396g()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r1.mo12406q(r5, r6, r4)
            r2.f15253l = r3
            com.google.android.gms.internal.ads.nm r1 = new com.google.android.gms.internal.ads.nm
            r1.<init>(r3, r0, r5)
            r2.f15255n = r1
            goto L_0x058c
        L_0x057b:
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0583:
            com.google.android.gms.internal.ads.ti r0 = new com.google.android.gms.internal.ads.ti
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x058b:
            r3 = 1
        L_0x058c:
            java.util.List r0 = r8.f16996Q0
            int r0 = r0.size()
            r1 = 0
        L_0x0593:
            if (r1 >= r0) goto L_0x05ca
            java.util.List r4 = r8.f16996Q0
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.ads.sl r4 = (com.google.android.gms.internal.ads.C2851sl) r4
            int r5 = r4.f18129a
            int r6 = com.google.android.gms.internal.ads.C2888tl.f18092h0
            if (r5 != r6) goto L_0x05be
            com.google.android.gms.internal.ads.mq r4 = r4.f17521P0
            r5 = 8
            r4.mo12411v(r5)
            r6 = r32
            r7 = 16
            r9 = 0
            r4.mo12406q(r6, r9, r7)
            byte[] r10 = f9971y
            boolean r10 = java.util.Arrays.equals(r6, r10)
            if (r10 == 0) goto L_0x05c5
            m13387g(r4, r7, r2)
            goto L_0x05c5
        L_0x05be:
            r6 = r32
            r5 = 8
            r7 = 16
            r9 = 0
        L_0x05c5:
            int r1 = r1 + 1
            r32 = r6
            goto L_0x0593
        L_0x05ca:
            r6 = r32
            r5 = 8
            r9 = 0
            goto L_0x05db
        L_0x05d0:
            r27 = r1
            r19 = r2
            r18 = r4
            r28 = r6
            r9 = 0
            r6 = r3
            r3 = 1
        L_0x05db:
            int r0 = r28 + 1
            r3 = r6
            r4 = r18
            r2 = r19
            r1 = r27
            r7 = 1
            r6 = r0
            r0 = r49
            goto L_0x016c
        L_0x05ea:
            r9 = 0
            java.util.List r0 = r1.f16996Q0
            com.google.android.gms.internal.ads.rk r0 = m13385c(r0)
            if (r0 == 0) goto L_0x0000
            r2 = r49
            android.util.SparseArray r1 = r2.f9972a
            int r1 = r1.size()
            r6 = 0
        L_0x05fc:
            if (r6 >= r1) goto L_0x062a
            android.util.SparseArray r3 = r2.f9972a
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.fm r3 = (com.google.android.gms.internal.ads.C2369fm) r3
            com.google.android.gms.internal.ads.fl r4 = r3.f9330b
            com.google.android.gms.internal.ads.mm r3 = r3.f9331c
            com.google.android.gms.internal.ads.qi r3 = r3.f13400f
            com.google.android.gms.internal.ads.qi r3 = r3.mo13540c(r0)
            r4.mo10172b(r3)
            int r6 = r6 + 1
            goto L_0x05fc
        L_0x0616:
            r2 = r0
            java.util.Stack r0 = r2.f9979h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x062a
            java.util.Stack r0 = r2.f9979h
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.rl r0 = (com.google.android.gms.internal.ads.C2814rl) r0
            r0.mo13838f(r1)
        L_0x062a:
            r0 = r2
            goto L_0x0002
        L_0x062d:
            r2 = r0
            r49.m13386e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2406gm.m13388h(long):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: com.google.android.gms.internal.ads.fm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10567a(com.google.android.gms.internal.ads.C2924uk r25, com.google.android.gms.internal.ads.C2219bl r26) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
        L_0x0004:
            int r2 = r0.f9981j
            r4 = 2
            r6 = 8
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x033e
            if (r2 == r7) goto L_0x0240
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r4) goto L_0x01e7
            if (r2 != r12) goto L_0x00f4
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            if (r2 != 0) goto L_0x007f
            android.util.SparseArray r2 = r0.f9972a
            int r13 = r2.size()
            r14 = 0
            r15 = 0
        L_0x0025:
            if (r14 >= r13) goto L_0x0047
            java.lang.Object r16 = r2.valueAt(r14)
            r12 = r16
            com.google.android.gms.internal.ads.fm r12 = (com.google.android.gms.internal.ads.C2369fm) r12
            int r5 = r12.f9335g
            com.google.android.gms.internal.ads.om r3 = r12.f9329a
            int r9 = r3.f15245d
            if (r5 != r9) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            long[] r3 = r3.f15247f
            r18 = r3[r5]
            int r3 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x0043
            r15 = r12
            r10 = r18
        L_0x0043:
            int r14 = r14 + 1
            r12 = 3
            goto L_0x0025
        L_0x0047:
            if (r15 != 0) goto L_0x0062
            long r2 = r0.f9986o
            long r4 = r25.mo14524d()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x005a
            r1.mo14529i(r3, r8)
            r24.m13386e()
            goto L_0x0004
        L_0x005a:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x0062:
            com.google.android.gms.internal.ads.om r2 = r15.f9329a
            long[] r2 = r2.f15247f
            int r3 = r15.f9335g
            r9 = r2[r3]
            long r2 = r25.mo14524d()
            long r9 = r9 - r2
            int r2 = (int) r9
            if (r2 >= 0) goto L_0x007a
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r3)
            r2 = 0
        L_0x007a:
            r1.mo14529i(r2, r8)
            r0.f9988q = r15
        L_0x007f:
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            com.google.android.gms.internal.ads.om r3 = r2.f9329a
            int[] r5 = r3.f15249h
            int r9 = r2.f9333e
            r5 = r5[r9]
            r0.f9989r = r5
            boolean r10 = r3.f15253l
            if (r10 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.mq r5 = r3.f15257p
            com.google.android.gms.internal.ads.cm r10 = r3.f15242a
            int r10 = r10.f7823a
            com.google.android.gms.internal.ads.nm r11 = r3.f15255n
            if (r11 == 0) goto L_0x009a
            goto L_0x00a0
        L_0x009a:
            com.google.android.gms.internal.ads.mm r11 = r2.f9331c
            com.google.android.gms.internal.ads.nm[] r11 = r11.f13402h
            r11 = r11[r10]
        L_0x00a0:
            int r10 = r11.f14111a
            boolean[] r3 = r3.f15254m
            boolean r3 = r3[r9]
            com.google.android.gms.internal.ads.mq r9 = r0.f9976e
            byte[] r11 = r9.f13448a
            if (r7 == r3) goto L_0x00ae
            r12 = 0
            goto L_0x00b0
        L_0x00ae:
            r12 = 128(0x80, float:1.794E-43)
        L_0x00b0:
            r12 = r12 | r10
            byte r12 = (byte) r12
            r11[r8] = r12
            r9.mo12411v(r8)
            com.google.android.gms.internal.ads.fl r2 = r2.f9330b
            com.google.android.gms.internal.ads.mq r9 = r0.f9976e
            r2.mo10174d(r9, r7)
            r2.mo10174d(r5, r10)
            if (r3 != 0) goto L_0x00c5
            int r10 = r10 + r7
            goto L_0x00d5
        L_0x00c5:
            int r3 = r5.mo12399j()
            r9 = -2
            r5.mo12412w(r9)
            int r3 = r3 * 6
            int r3 = r3 + r4
            r2.mo10174d(r5, r3)
            int r10 = r10 + r7
            int r10 = r10 + r3
        L_0x00d5:
            r0.f9990s = r10
            int r2 = r0.f9989r
            int r5 = r2 + r10
            r0.f9989r = r5
            goto L_0x00e0
        L_0x00de:
            r0.f9990s = r8
        L_0x00e0:
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            com.google.android.gms.internal.ads.mm r2 = r2.f9331c
            int r2 = r2.f13401g
            if (r2 != r7) goto L_0x00ef
            int r5 = r5 + -8
            r0.f9989r = r5
            r1.mo14529i(r6, r8)
        L_0x00ef:
            r2 = 4
            r0.f9981j = r2
            r0.f9991t = r8
        L_0x00f4:
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            com.google.android.gms.internal.ads.om r3 = r2.f9329a
            com.google.android.gms.internal.ads.mm r5 = r2.f9331c
            com.google.android.gms.internal.ads.fl r9 = r2.f9330b
            int r2 = r2.f9333e
            int r6 = r5.f13405k
            if (r6 != 0) goto L_0x0113
        L_0x0102:
            int r4 = r0.f9990s
            int r6 = r0.f9989r
            if (r4 >= r6) goto L_0x0169
            int r6 = r6 - r4
            int r4 = r9.mo10171a(r1, r6, r8)
            int r6 = r0.f9990s
            int r6 = r6 + r4
            r0.f9990s = r6
            goto L_0x0102
        L_0x0113:
            com.google.android.gms.internal.ads.mq r10 = r0.f9974c
            byte[] r10 = r10.f13448a
            r10[r8] = r8
            r10[r7] = r8
            r10[r4] = r8
            int r4 = r6 + 1
            r11 = 4
            int r6 = 4 - r6
        L_0x0122:
            int r11 = r0.f9990s
            int r12 = r0.f9989r
            if (r11 >= r12) goto L_0x0169
            int r11 = r0.f9991t
            if (r11 != 0) goto L_0x015a
            r1.mo14528h(r10, r6, r4, r8)
            com.google.android.gms.internal.ads.mq r11 = r0.f9974c
            r11.mo12411v(r8)
            com.google.android.gms.internal.ads.mq r11 = r0.f9974c
            int r11 = r11.mo12398i()
            r12 = -1
            int r11 = r11 + r12
            r0.f9991t = r11
            com.google.android.gms.internal.ads.mq r11 = r0.f9973b
            r11.mo12411v(r8)
            com.google.android.gms.internal.ads.mq r11 = r0.f9973b
            r12 = 4
            r9.mo10174d(r11, r12)
            com.google.android.gms.internal.ads.mq r11 = r0.f9974c
            r9.mo10174d(r11, r7)
            int r11 = r0.f9990s
            int r11 = r11 + 5
            r0.f9990s = r11
            int r11 = r0.f9989r
            int r11 = r11 + r6
            r0.f9989r = r11
            goto L_0x0122
        L_0x015a:
            int r11 = r9.mo10171a(r1, r11, r8)
            int r12 = r0.f9990s
            int r12 = r12 + r11
            r0.f9990s = r12
            int r12 = r0.f9991t
            int r12 = r12 - r11
            r0.f9991t = r12
            goto L_0x0122
        L_0x0169:
            long[] r1 = r3.f15251j
            r10 = r1[r2]
            int[] r1 = r3.f15250i
            r1 = r1[r2]
            long r12 = (long) r1
            long r10 = r10 + r12
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            boolean r1 = r3.f15253l
            if (r7 == r1) goto L_0x017d
            r4 = 0
            goto L_0x017f
        L_0x017d:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x017f:
            boolean[] r6 = r3.f15252k
            boolean r2 = r6[r2]
            r12 = r4 | r2
            if (r1 == 0) goto L_0x01a5
            com.google.android.gms.internal.ads.nm r1 = r3.f15255n
            if (r1 != 0) goto L_0x0193
            com.google.android.gms.internal.ads.nm[] r1 = r5.f13402h
            com.google.android.gms.internal.ads.cm r2 = r3.f15242a
            int r2 = r2.f7823a
            r1 = r1[r2]
        L_0x0193:
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            com.google.android.gms.internal.ads.nm r4 = r2.f9337i
            if (r1 == r4) goto L_0x01a1
            com.google.android.gms.internal.ads.el r2 = new com.google.android.gms.internal.ads.el
            byte[] r4 = r1.f14112b
            r2.<init>(r7, r4)
            goto L_0x01a3
        L_0x01a1:
            com.google.android.gms.internal.ads.el r2 = r2.f9336h
        L_0x01a3:
            r15 = r2
            goto L_0x01a7
        L_0x01a5:
            r1 = 0
            r15 = 0
        L_0x01a7:
            com.google.android.gms.internal.ads.fm r2 = r0.f9988q
            r2.f9336h = r15
            r2.f9337i = r1
            int r13 = r0.f9989r
            r14 = 0
            r9.mo10173c(r10, r12, r13, r14, r15)
            java.util.LinkedList r1 = r0.f9980i
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01db
            com.google.android.gms.internal.ads.fm r1 = r0.f9988q
            int r2 = r1.f9333e
            int r2 = r2 + r7
            r1.f9333e = r2
            int r2 = r1.f9334f
            int r2 = r2 + r7
            r1.f9334f = r2
            int[] r3 = r3.f15248g
            int r4 = r1.f9335g
            r3 = r3[r4]
            if (r2 != r3) goto L_0x01d7
            int r4 = r4 + r7
            r1.f9335g = r4
            r1.f9334f = r8
            r1 = 0
            r0.f9988q = r1
        L_0x01d7:
            r1 = 3
            r0.f9981j = r1
            return r8
        L_0x01db:
            r1 = 0
            java.util.LinkedList r2 = r0.f9980i
            java.lang.Object r2 = r2.removeFirst()
            com.google.android.gms.internal.ads.em r2 = (com.google.android.gms.internal.ads.C2331em) r2
            int r2 = r2.f8844a
            throw r1
        L_0x01e7:
            android.util.SparseArray r2 = r0.f9972a
            int r2 = r2.size()
            r3 = 0
            r5 = 0
        L_0x01ef:
            if (r3 >= r2) goto L_0x0212
            android.util.SparseArray r4 = r0.f9972a
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.fm r4 = (com.google.android.gms.internal.ads.C2369fm) r4
            com.google.android.gms.internal.ads.om r4 = r4.f9329a
            boolean r6 = r4.f15258q
            if (r6 == 0) goto L_0x020f
            long r6 = r4.f15244c
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x020f
            android.util.SparseArray r4 = r0.f9972a
            java.lang.Object r4 = r4.valueAt(r3)
            com.google.android.gms.internal.ads.fm r4 = (com.google.android.gms.internal.ads.C2369fm) r4
            r5 = r4
            r10 = r6
        L_0x020f:
            int r3 = r3 + 1
            goto L_0x01ef
        L_0x0212:
            if (r5 != 0) goto L_0x0219
            r2 = 3
            r0.f9981j = r2
            goto L_0x0004
        L_0x0219:
            long r2 = r25.mo14524d()
            long r10 = r10 - r2
            int r2 = (int) r10
            if (r2 < 0) goto L_0x0238
            r1.mo14529i(r2, r8)
            com.google.android.gms.internal.ads.om r2 = r5.f9329a
            com.google.android.gms.internal.ads.mq r3 = r2.f15257p
            byte[] r3 = r3.f13448a
            int r4 = r2.f15256o
            r1.mo14528h(r3, r8, r4, r8)
            com.google.android.gms.internal.ads.mq r3 = r2.f15257p
            r3.mo12411v(r8)
            r2.f15258q = r8
            goto L_0x0004
        L_0x0238:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x0240:
            long r2 = r0.f9983l
            int r3 = (int) r2
            int r2 = r0.f9984m
            int r3 = r3 - r2
            com.google.android.gms.internal.ads.mq r2 = r0.f9985n
            if (r2 == 0) goto L_0x0332
            byte[] r2 = r2.f13448a
            r1.mo14528h(r2, r6, r3, r8)
            com.google.android.gms.internal.ads.sl r2 = new com.google.android.gms.internal.ads.sl
            int r3 = r0.f9982k
            com.google.android.gms.internal.ads.mq r5 = r0.f9985n
            r2.<init>(r3, r5)
            long r9 = r25.mo14524d()
            java.util.Stack r3 = r0.f9979h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0271
            java.util.Stack r3 = r0.f9979h
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.rl r3 = (com.google.android.gms.internal.ads.C2814rl) r3
            r3.mo13839g(r2)
            goto L_0x0335
        L_0x0271:
            int r3 = r2.f18129a
            int r5 = com.google.android.gms.internal.ads.C2888tl.f18039B
            if (r3 != r5) goto L_0x032f
            com.google.android.gms.internal.ads.mq r2 = r2.f17521P0
            r2.mo12411v(r6)
            int r3 = r2.mo12394e()
            r5 = 4
            r2.mo12412w(r5)
            long r5 = r2.mo12402m()
            int r3 = com.google.android.gms.internal.ads.C2888tl.m21067b(r3)
            if (r3 != 0) goto L_0x0297
            long r11 = r2.mo12402m()
            long r13 = r2.mo12402m()
            goto L_0x029f
        L_0x0297:
            long r11 = r2.mo12403n()
            long r13 = r2.mo12403n()
        L_0x029f:
            long r9 = r9 + r13
            r18 = r11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r15 = r5
            long r20 = com.google.android.gms.internal.ads.C2893tq.m21179j(r11, r13, r15)
            r2.mo12412w(r4)
            int r3 = r2.mo12399j()
            int[] r4 = new int[r3]
            long[] r15 = new long[r3]
            long[] r13 = new long[r3]
            long[] r14 = new long[r3]
            r11 = r20
        L_0x02bd:
            if (r8 >= r3) goto L_0x030c
            int r16 = r2.mo12394e()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r16 & r17
            if (r17 != 0) goto L_0x0304
            long r22 = r2.mo12402m()
            r17 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r17
            r4[r8] = r16
            r15[r8] = r9
            r14[r8] = r11
            long r18 = r18 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r22 = r3
            r7 = r13
            r3 = r14
            r13 = r16
            r1 = r15
            r15 = r5
            long r11 = com.google.android.gms.internal.ads.C2893tq.m21179j(r11, r13, r15)
            r13 = r3[r8]
            long r13 = r11 - r13
            r7[r8] = r13
            r13 = 4
            r2.mo12412w(r13)
            r14 = r4[r8]
            long r14 = (long) r14
            long r9 = r9 + r14
            int r8 = r8 + 1
            r15 = r1
            r14 = r3
            r13 = r7
            r3 = r22
            r7 = 1
            r1 = r25
            goto L_0x02bd
        L_0x0304:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x030c:
            r7 = r13
            r3 = r14
            r1 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            com.google.android.gms.internal.ads.tk r5 = new com.google.android.gms.internal.ads.tk
            r5.<init>(r4, r1, r7, r3)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            r2.longValue()
            com.google.android.gms.internal.ads.xk r2 = r0.f9992u
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.dl r1 = (com.google.android.gms.internal.ads.C2293dl) r1
            r2.mo15101a(r1)
            r1 = 1
            r0.f9993v = r1
        L_0x032f:
            r1 = r25
            goto L_0x0335
        L_0x0332:
            r1.mo14529i(r3, r8)
        L_0x0335:
            long r2 = r25.mo14524d()
            r0.m13388h(r2)
            goto L_0x0004
        L_0x033e:
            int r2 = r0.f9984m
            if (r2 != 0) goto L_0x0366
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            byte[] r2 = r2.f13448a
            r3 = 1
            boolean r2 = r1.mo14528h(r2, r8, r6, r3)
            if (r2 != 0) goto L_0x034f
            r2 = -1
            return r2
        L_0x034f:
            r0.f9984m = r6
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            r2.mo12411v(r8)
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            long r2 = r2.mo12402m()
            r0.f9983l = r2
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            int r2 = r2.mo12394e()
            r0.f9982k = r2
        L_0x0366:
            long r2 = r0.f9983l
            r9 = 1
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0382
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            byte[] r2 = r2.f13448a
            r1.mo14528h(r2, r6, r6, r8)
            int r2 = r0.f9984m
            int r2 = r2 + r6
            r0.f9984m = r2
            com.google.android.gms.internal.ads.mq r2 = r0.f9977f
            long r2 = r2.mo12403n()
            r0.f9983l = r2
        L_0x0382:
            int r5 = r0.f9984m
            long r9 = (long) r5
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x04ba
            long r2 = r25.mo14524d()
            long r2 = r2 - r9
            int r5 = r0.f9982k
            int r7 = com.google.android.gms.internal.ads.C2888tl.f18059L
            if (r5 != r7) goto L_0x03ae
            android.util.SparseArray r5 = r0.f9972a
            int r5 = r5.size()
            r7 = 0
        L_0x039b:
            if (r7 >= r5) goto L_0x03ae
            android.util.SparseArray r9 = r0.f9972a
            java.lang.Object r9 = r9.valueAt(r7)
            com.google.android.gms.internal.ads.fm r9 = (com.google.android.gms.internal.ads.C2369fm) r9
            com.google.android.gms.internal.ads.om r9 = r9.f9329a
            r9.f15244c = r2
            r9.f15243b = r2
            int r7 = r7 + 1
            goto L_0x039b
        L_0x03ae:
            int r5 = r0.f9982k
            int r7 = com.google.android.gms.internal.ads.C2888tl.f18093i
            if (r5 != r7) goto L_0x03d3
            r7 = 0
            r0.f9988q = r7
            long r5 = r0.f9983l
            long r2 = r2 + r5
            r0.f9986o = r2
            boolean r2 = r0.f9993v
            if (r2 != 0) goto L_0x03cf
            com.google.android.gms.internal.ads.xk r2 = r0.f9992u
            com.google.android.gms.internal.ads.cl r3 = new com.google.android.gms.internal.ads.cl
            long r5 = r0.f9987p
            r3.<init>(r5)
            r2.mo15101a(r3)
            r2 = 1
            r0.f9993v = r2
        L_0x03cf:
            r0.f9981j = r4
            goto L_0x0004
        L_0x03d3:
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18041C
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18045E
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18047F
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18049G
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18051H
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18059L
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18061M
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18063N
            if (r5 == r2) goto L_0x0493
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18068Q
            if (r5 != r2) goto L_0x03f9
            goto L_0x0493
        L_0x03f9:
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18071T
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18070S
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18043D
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18039B
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18072U
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18123x
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18125y
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18067P
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18127z
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18037A
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18073V
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18084d0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18086e0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18094i0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18092h0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18088f0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18090g0
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18069R
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18065O
            if (r5 == r2) goto L_0x0463
            int r2 = com.google.android.gms.internal.ads.C2888tl.f18050G0
            if (r5 != r2) goto L_0x044d
            goto L_0x0463
        L_0x044d:
            long r5 = r0.f9983l
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x045b
            r2 = 0
            r0.f9985n = r2
            r2 = 1
            r0.f9981j = r2
            goto L_0x0004
        L_0x045b:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0463:
            int r2 = r0.f9984m
            if (r2 != r6) goto L_0x048b
            long r9 = r0.f9983l
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0483
            com.google.android.gms.internal.ads.mq r2 = new com.google.android.gms.internal.ads.mq
            int r3 = (int) r9
            r2.<init>((int) r3)
            r0.f9985n = r2
            com.google.android.gms.internal.ads.mq r3 = r0.f9977f
            byte[] r3 = r3.f13448a
            byte[] r2 = r2.f13448a
            java.lang.System.arraycopy(r3, r8, r2, r8, r6)
            r2 = 1
            r0.f9981j = r2
            goto L_0x0004
        L_0x0483:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x048b:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x0493:
            long r2 = r25.mo14524d()
            long r6 = r0.f9983l
            long r2 = r2 + r6
            r6 = -8
            long r2 = r2 + r6
            java.util.Stack r4 = r0.f9979h
            com.google.android.gms.internal.ads.rl r6 = new com.google.android.gms.internal.ads.rl
            r6.<init>(r5, r2)
            r4.add(r6)
            long r4 = r0.f9983l
            int r6 = r0.f9984m
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x04b5
            r0.m13388h(r2)
            goto L_0x0004
        L_0x04b5:
            r24.m13386e()
            goto L_0x0004
        L_0x04ba:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2406gm.mo10567a(com.google.android.gms.internal.ads.uk, com.google.android.gms.internal.ads.bl):int");
    }

    /* renamed from: b */
    public final boolean mo10568b(C2924uk ukVar) throws IOException, InterruptedException {
        return C2592lm.m16068a(ukVar);
    }

    /* renamed from: d */
    public final void mo10569d(long j, long j2) {
        int size = this.f9972a.size();
        for (int i = 0; i < size; i++) {
            ((C2369fm) this.f9972a.valueAt(i)).mo10190b();
        }
        this.f9980i.clear();
        this.f9979h.clear();
        m13386e();
    }

    /* renamed from: f */
    public final void mo10570f(C3035xk xkVar) {
        this.f9992u = xkVar;
    }
}
