package p014b2;

import p014b2.C1637g;

/* renamed from: b2.h0 */
/* compiled from: ResamplingAudioProcessor */
final class C1642h0 extends C1671x {
    C1642h0() {
    }

    /* renamed from: c */
    public C1637g.C1638a mo6455c(C1637g.C1638a aVar) throws C1637g.C1639b {
        int i = aVar.f4704c;
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            throw new C1637g.C1639b(aVar);
        } else if (i != 2) {
            return new C1637g.C1638a(aVar.f4702a, aVar.f4703b, 2);
        } else {
            return C1637g.C1638a.f4701e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b0 A[LOOP:4: B:27:0x00b0->B:28:0x00b2, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:12:0x0037, B:28:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6456f(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            b2.g$a r3 = r9.f4843b
            int r3 = r3.f4704c
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L_0x002d
            if (r3 == r7) goto L_0x002a
            if (r3 == r6) goto L_0x002f
            if (r3 == r5) goto L_0x0027
            if (r3 != r4) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0027:
            int r2 = r2 / 3
            goto L_0x002d
        L_0x002a:
            int r2 = r2 / 2
            goto L_0x002f
        L_0x002d:
            int r2 = r2 * 2
        L_0x002f:
            java.nio.ByteBuffer r2 = r9.mo6623l(r2)
            b2.g$a r3 = r9.f4843b
            int r3 = r3.f4704c
            if (r3 == r8) goto L_0x00b0
            if (r3 == r7) goto L_0x008a
            if (r3 == r6) goto L_0x0075
            if (r3 == r5) goto L_0x005e
            if (r3 != r4) goto L_0x0058
        L_0x0041:
            if (r0 >= r1) goto L_0x00c5
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0041
        L_0x0058:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x005e:
            if (r0 >= r1) goto L_0x00c5
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x005e
        L_0x0075:
            if (r0 >= r1) goto L_0x00c5
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L_0x0075
        L_0x008a:
            if (r0 >= r1) goto L_0x00c5
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = p161w3.C5953m0.m35150p(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x008a
        L_0x00b0:
            if (r0 >= r1) goto L_0x00c5
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x00b0
        L_0x00c5:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p014b2.C1642h0.mo6456f(java.nio.ByteBuffer):void");
    }
}
