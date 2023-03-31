package com.google.protobuf;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8116c2;
import com.google.protobuf.C8119d0;
import com.google.protobuf.C8139f;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8204o0;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.y0 */
/* compiled from: MessageSchema */
final class C8255y0<T> implements C8202n1<T> {

    /* renamed from: r */
    private static final int[] f35169r = new int[0];

    /* renamed from: s */
    private static final Unsafe f35170s = C8268z1.m45985H();

    /* renamed from: a */
    private final int[] f35171a;

    /* renamed from: b */
    private final Object[] f35172b;

    /* renamed from: c */
    private final int f35173c;

    /* renamed from: d */
    private final int f35174d;

    /* renamed from: e */
    private final C8243v0 f35175e;

    /* renamed from: f */
    private final boolean f35176f;

    /* renamed from: g */
    private final boolean f35177g;

    /* renamed from: h */
    private final boolean f35178h;

    /* renamed from: i */
    private final boolean f35179i;

    /* renamed from: j */
    private final int[] f35180j;

    /* renamed from: k */
    private final int f35181k;

    /* renamed from: l */
    private final int f35182l;

    /* renamed from: m */
    private final C8093a1 f35183m;

    /* renamed from: n */
    private final C8186l0 f35184n;

    /* renamed from: o */
    private final C8245v1<?, ?> f35185o;

    /* renamed from: p */
    private final C8223r<?> f35186p;

    /* renamed from: q */
    private final C8212q0 f35187q;

    /* renamed from: com.google.protobuf.y0$a */
    /* compiled from: MessageSchema */
    static /* synthetic */ class C8256a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35188a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f35188a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.C8256a.<clinit>():void");
        }
    }

    private C8255y0(int[] iArr, Object[] objArr, int i, int i2, C8243v0 v0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C8093a1 a1Var, C8186l0 l0Var, C8245v1<?, ?> v1Var, C8223r<?> rVar, C8212q0 q0Var) {
        this.f35171a = iArr;
        this.f35172b = objArr;
        this.f35173c = i;
        this.f35174d = i2;
        this.f35177g = v0Var instanceof C8260z;
        this.f35178h = z;
        this.f35176f = rVar != null && rVar.mo27280e(v0Var);
        this.f35179i = z2;
        this.f35180j = iArr2;
        this.f35181k = i3;
        this.f35182l = i4;
        this.f35183m = a1Var;
        this.f35184n = l0Var;
        this.f35185o = v1Var;
        this.f35186p = rVar;
        this.f35175e = v0Var;
        this.f35187q = q0Var;
    }

    /* renamed from: A */
    private <UT, UB> int m45791A(C8245v1<UT, UB> v1Var, T t) {
        return v1Var.mo27332h(v1Var.mo27331g(t));
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45792A0(T r13, com.google.protobuf.C8116c2 r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f35176f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.r<?> r0 = r12.f35186p
            com.google.protobuf.v r0 = r0.mo27278c(r13)
            boolean r2 = r0.mo27304n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo27307t()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f35171a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.m45860y0(r5)
            int r7 = r12.m45820Y(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.r<?> r8 = r12.f35186p
            int r8 = r8.mo27276a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.r<?> r8 = r12.f35186p
            r8.mo27285j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m45858x0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            r14.mo26864s(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45826e0(r13, r8)
            r14.mo26836F(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26844N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45826e0(r13, r8)
            r14.mo26871z(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26865t(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26840J(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26849d(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            r14.mo26867v(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            r14.mo26855j(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            r12.m45798D0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            boolean r6 = m45822a0(r13, r8)
            r14.mo26863r(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26851f(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45826e0(r13, r8)
            r14.mo26856k(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45825d0(r13, r8)
            r14.mo26868w(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45826e0(r13, r8)
            r14.mo26860o(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45826e0(r13, r8)
            r14.mo26862q(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            float r6 = m45824c0(r13, r8)
            r14.mo26837G(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.m45806K(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            double r8 = m45823b0(r13, r8)
            r14.mo26852g(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            r12.m45796C0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            com.google.protobuf.C8209p1.m45509U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45518b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45516a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45514Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45513Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45505Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45522d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45502N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45506R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45507S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45510V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45524e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45511W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45508T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.m45820Y(r5)
            long r10 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45504P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45518b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45516a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45514Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45513Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45505Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45522d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45503O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            com.google.protobuf.C8209p1.m45512X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45520c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45502N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45506R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45507S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45510V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45524e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45511W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45508T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.m45820Y(r5)
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C8209p1.m45504P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            r14.mo26864s(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45809N(r13, r8)
            r14.mo26836F(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26844N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45809N(r13, r8)
            r14.mo26871z(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26865t(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26840J(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26849d(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            r14.mo26867v(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            com.google.protobuf.n1 r8 = r12.m45855w(r5)
            r14.mo26855j(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r13, r8)
            r12.m45798D0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            boolean r6 = m45833l(r13, r8)
            r14.mo26863r(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26851f(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45809N(r13, r8)
            r14.mo26856k(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            int r6 = m45793B(r13, r8)
            r14.mo26868w(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45809N(r13, r8)
            r14.mo26860o(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            long r8 = m45809N(r13, r8)
            r14.mo26862q(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            float r6 = m45849t(r13, r8)
            r14.mo26837G(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.m45797D(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m45821Z(r6)
            double r8 = m45841p(r13, r8)
            r14.mo26852g(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.r<?> r3 = r12.f35186p
            r3.mo27285j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.v1<?, ?> r0 = r12.f35185o
            r12.m45800E0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45792A0(java.lang.Object, com.google.protobuf.c2):void");
    }

    /* renamed from: B */
    private static <T> int m45793B(T t, long j) {
        return C8268z1.m45980C(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45794B0(T r11, com.google.protobuf.C8116c2 r12) throws java.io.IOException {
        /*
            r10 = this;
            com.google.protobuf.v1<?, ?> r0 = r10.f35185o
            r10.m45800E0(r0, r11, r12)
            boolean r0 = r10.f35176f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.r<?> r0 = r10.f35186p
            com.google.protobuf.v r0 = r0.mo27278c(r11)
            boolean r2 = r0.mo27304n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo27299g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f35171a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m45860y0(r3)
            int r5 = r10.m45820Y(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.r<?> r6 = r10.f35186p
            int r6 = r6.mo27276a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.r<?> r6 = r10.f35186p
            r6.mo27285j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m45858x0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            r12.mo26864s(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45826e0(r11, r6)
            r12.mo26836F(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26844N(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45826e0(r11, r6)
            r12.mo26871z(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26865t(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26840J(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26849d(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.i r4 = (com.google.protobuf.C8153i) r4
            r12.mo26867v(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            r12.mo26855j(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            r10.m45798D0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            boolean r4 = m45822a0(r11, r6)
            r12.mo26863r(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26851f(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45826e0(r11, r6)
            r12.mo26856k(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45825d0(r11, r6)
            r12.mo26868w(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45826e0(r11, r6)
            r12.mo26860o(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45826e0(r11, r6)
            r12.mo26862q(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            float r4 = m45824c0(r11, r6)
            r12.mo26837G(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.m45806K(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            double r6 = m45823b0(r11, r6)
            r12.mo26852g(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            r10.m45796C0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            com.google.protobuf.C8209p1.m45509U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45518b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45516a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45514Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45513Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45505Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45522d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45502N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45506R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45507S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45510V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45524e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45511W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45508T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.m45820Y(r3)
            long r8 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45504P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45518b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45516a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45514Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45513Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45505Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45522d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45503O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            com.google.protobuf.C8209p1.m45512X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45520c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45502N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45506R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45507S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45510V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45524e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45511W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45508T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.m45820Y(r3)
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C8209p1.m45504P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            r12.mo26864s(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45809N(r11, r6)
            r12.mo26836F(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26844N(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45809N(r11, r6)
            r12.mo26871z(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26865t(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26840J(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26849d(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.i r4 = (com.google.protobuf.C8153i) r4
            r12.mo26867v(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            com.google.protobuf.n1 r6 = r10.m45855w(r3)
            r12.mo26855j(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            java.lang.Object r4 = com.google.protobuf.C8268z1.m45984G(r11, r6)
            r10.m45798D0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            boolean r4 = m45833l(r11, r6)
            r12.mo26863r(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26851f(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45809N(r11, r6)
            r12.mo26856k(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            int r4 = m45793B(r11, r6)
            r12.mo26868w(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45809N(r11, r6)
            r12.mo26860o(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            long r6 = m45809N(r11, r6)
            r12.mo26862q(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            float r4 = m45849t(r11, r6)
            r12.mo26837G(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.m45797D(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m45821Z(r4)
            double r6 = m45841p(r11, r6)
            r12.mo26852g(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.r<?> r11 = r10.f35186p
            r11.mo27285j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45794B0(java.lang.Object, com.google.protobuf.c2):void");
    }

    /* renamed from: C */
    private static boolean m45795C(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: C0 */
    private <K, V> void m45796C0(C8116c2 c2Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            c2Var.mo26833C(i, this.f35187q.mo27225c(m45853v(i2)), this.f35187q.mo27230h(obj));
        }
    }

    /* renamed from: D */
    private boolean m45797D(T t, int i) {
        int m0 = m45836m0(i);
        long j = (long) (1048575 & m0);
        if (j == 1048575) {
            int y0 = m45860y0(i);
            long Z = m45821Z(y0);
            switch (m45858x0(y0)) {
                case 0:
                    if (Double.doubleToRawLongBits(C8268z1.m45978A(t, Z)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C8268z1.m45979B(t, Z)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C8268z1.m45982E(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C8268z1.m45982E(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C8268z1.m45982E(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C8268z1.m46021t(t, Z);
                case 8:
                    Object G = C8268z1.m45984G(t, Z);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof C8153i) {
                        return !C8153i.f34908b.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C8268z1.m45984G(t, Z) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C8153i.f34908b.equals(C8268z1.m45984G(t, Z));
                case 11:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C8268z1.m45982E(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C8268z1.m45980C(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C8268z1.m45982E(t, Z) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C8268z1.m45984G(t, Z) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C8268z1.m45980C(t, j) & (1 << (m0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: D0 */
    private void m45798D0(int i, Object obj, C8116c2 c2Var) throws IOException {
        if (obj instanceof String) {
            c2Var.mo26859n(i, (String) obj);
        } else {
            c2Var.mo26867v(i, (C8153i) obj);
        }
    }

    /* renamed from: E */
    private boolean m45799E(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m45797D(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: E0 */
    private <UT, UB> void m45800E0(C8245v1<UT, UB> v1Var, T t, C8116c2 c2Var) throws IOException {
        v1Var.mo27344t(v1Var.mo27331g(t), c2Var);
    }

    /* renamed from: F */
    private static boolean m45801F(Object obj, int i, C8202n1 n1Var) {
        return n1Var.mo27200d(C8268z1.m45984G(obj, m45821Z(i)));
    }

    /* renamed from: G */
    private <N> boolean m45802G(Object obj, int i, int i2) {
        List list = (List) C8268z1.m45984G(obj, m45821Z(i));
        if (list.isEmpty()) {
            return true;
        }
        C8202n1 w = m45855w(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!w.mo27200d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m45803H(T t, int i, int i2) {
        Map<?, ?> h = this.f35187q.mo27230h(C8268z1.m45984G(t, m45821Z(i)));
        if (h.isEmpty()) {
            return true;
        }
        if (this.f35187q.mo27225c(m45853v(i2)).f35036c.mo26800a() != C8105b2.C8112c.MESSAGE) {
            return true;
        }
        C8202n1<?> n1Var = null;
        for (Object next : h.values()) {
            if (n1Var == null) {
                n1Var = C8166i1.m44835a().mo26961c(next.getClass());
            }
            if (!n1Var.mo27200d(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private static boolean m45804I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C8260z) {
            return ((C8260z) obj).mo27417J();
        }
        return true;
    }

    /* renamed from: J */
    private boolean m45805J(T t, T t2, int i) {
        long m0 = (long) (m45836m0(i) & 1048575);
        return C8268z1.m45980C(t, m0) == C8268z1.m45980C(t2, m0);
    }

    /* renamed from: K */
    private boolean m45806K(T t, int i, int i2) {
        return C8268z1.m45980C(t, (long) (m45836m0(i2) & 1048575)) == i;
    }

    /* renamed from: L */
    private static boolean m45807L(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: M */
    private static List<?> m45808M(Object obj, long j) {
        return (List) C8268z1.m45984G(obj, j);
    }

    /* renamed from: N */
    private static <T> long m45809N(T t, long j) {
        return C8268z1.m45982E(t, j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:98|97|157|174|175|(0)(0)|196|219|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x06a1, code lost:
        r0 = th;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0194, code lost:
        r12 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        r14 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:174:0x0643 */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0649 A[Catch:{ all -> 0x06a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x06b3 A[LOOP:6: B:205:0x06af->B:207:0x06b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06c8  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <UT, UB, ET extends com.google.protobuf.C8240v.C8242b<ET>> void m45810O(com.google.protobuf.C8245v1<UT, UB> r19, com.google.protobuf.C8223r<ET> r20, T r21, com.google.protobuf.C8190l1 r22, com.google.protobuf.C8210q r23) throws java.io.IOException {
        /*
            r18 = this;
            r8 = r18
            r7 = r19
            r15 = r21
            r0 = r22
            r6 = r23
            r17 = 0
            r5 = r17
            r9 = r5
        L_0x000f:
            int r2 = r22.mo27040A()     // Catch:{ all -> 0x06a7 }
            int r3 = r8.m45832k0(r2)     // Catch:{ all -> 0x06a7 }
            if (r3 >= 0) goto L_0x00b9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x003e
            int r0 = r8.f35181k
            r4 = r5
        L_0x0021:
            int r1 = r8.f35182l
            if (r0 >= r1) goto L_0x0038
            int[] r1 = r8.f35180j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            r7.mo27339o(r15, r4)
        L_0x003d:
            return
        L_0x003e:
            boolean r1 = r8.f35176f     // Catch:{ all -> 0x00b5 }
            if (r1 != 0) goto L_0x0047
            r4 = r20
            r12 = r17
            goto L_0x0050
        L_0x0047:
            com.google.protobuf.v0 r1 = r8.f35175e     // Catch:{ all -> 0x00b5 }
            r4 = r20
            java.lang.Object r1 = r4.mo27277b(r6, r1, r2)     // Catch:{ all -> 0x00b5 }
            r12 = r1
        L_0x0050:
            if (r12 == 0) goto L_0x0071
            if (r9 != 0) goto L_0x005c
            com.google.protobuf.v r1 = r20.mo27279d(r21)     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            goto L_0x06a9
        L_0x005c:
            r1 = r9
        L_0x005d:
            r9 = r20
            r10 = r21
            r11 = r22
            r13 = r23
            r14 = r1
            r3 = r15
            r15 = r5
            r16 = r19
            java.lang.Object r5 = r9.mo27282g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00b1 }
            r9 = r1
        L_0x006f:
            r15 = r3
            goto L_0x000f
        L_0x0071:
            r3 = r15
            boolean r1 = r7.mo27341q(r0)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x007f
            boolean r1 = r22.mo27048I()     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x008d
        L_0x007e:
            goto L_0x006f
        L_0x007f:
            if (r5 != 0) goto L_0x0086
            java.lang.Object r1 = r7.mo27330f(r3)     // Catch:{ all -> 0x00b1 }
            r5 = r1
        L_0x0086:
            boolean r1 = r7.mo27337m(r5, r0)     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x008d
            goto L_0x007e
        L_0x008d:
            int r0 = r8.f35181k
            r4 = r5
        L_0x0090:
            int r1 = r8.f35182l
            if (r0 >= r1) goto L_0x00aa
            int[] r1 = r8.f35180j
            r5 = r1[r0]
            r1 = r18
            r2 = r21
            r10 = r3
            r3 = r5
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r3 = r10
            goto L_0x0090
        L_0x00aa:
            r10 = r3
            if (r4 == 0) goto L_0x00b0
            r7.mo27339o(r10, r4)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = move-exception
            r10 = r3
            goto L_0x06a5
        L_0x00b5:
            r0 = move-exception
            r10 = r15
            goto L_0x06a5
        L_0x00b9:
            r4 = r20
            r10 = r15
            int r11 = r8.m45860y0(r3)     // Catch:{ all -> 0x06a3 }
            int r1 = m45858x0(r11)     // Catch:{ a -> 0x0640 }
            switch(r1) {
                case 0: goto L_0x05fd;
                case 1: goto L_0x05eb;
                case 2: goto L_0x05d9;
                case 3: goto L_0x05c7;
                case 4: goto L_0x05b5;
                case 5: goto L_0x05a2;
                case 6: goto L_0x058f;
                case 7: goto L_0x057c;
                case 8: goto L_0x0571;
                case 9: goto L_0x055c;
                case 10: goto L_0x0549;
                case 11: goto L_0x0536;
                case 12: goto L_0x0510;
                case 13: goto L_0x04fd;
                case 14: goto L_0x04ea;
                case 15: goto L_0x04d7;
                case 16: goto L_0x04c4;
                case 17: goto L_0x04af;
                case 18: goto L_0x049d;
                case 19: goto L_0x048b;
                case 20: goto L_0x0479;
                case 21: goto L_0x0467;
                case 22: goto L_0x0455;
                case 23: goto L_0x0443;
                case 24: goto L_0x0431;
                case 25: goto L_0x041f;
                case 26: goto L_0x0417;
                case 27: goto L_0x0402;
                case 28: goto L_0x03f0;
                case 29: goto L_0x03de;
                case 30: goto L_0x03bd;
                case 31: goto L_0x03ab;
                case 32: goto L_0x0399;
                case 33: goto L_0x0387;
                case 34: goto L_0x0375;
                case 35: goto L_0x0363;
                case 36: goto L_0x0351;
                case 37: goto L_0x033f;
                case 38: goto L_0x032d;
                case 39: goto L_0x031b;
                case 40: goto L_0x0309;
                case 41: goto L_0x02f7;
                case 42: goto L_0x02e5;
                case 43: goto L_0x02d3;
                case 44: goto L_0x02b2;
                case 45: goto L_0x02a0;
                case 46: goto L_0x028e;
                case 47: goto L_0x027c;
                case 48: goto L_0x026a;
                case 49: goto L_0x024a;
                case 50: goto L_0x0235;
                case 51: goto L_0x021e;
                case 52: goto L_0x020a;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e4;
                case 55: goto L_0x01d1;
                case 56: goto L_0x01be;
                case 57: goto L_0x01ab;
                case 58: goto L_0x0198;
                case 59: goto L_0x018e;
                case 60: goto L_0x017d;
                case 61: goto L_0x016e;
                case 62: goto L_0x015b;
                case 63: goto L_0x0133;
                case 64: goto L_0x0120;
                case 65: goto L_0x010c;
                case 66: goto L_0x00f8;
                case 67: goto L_0x00e4;
                case 68: goto L_0x00d2;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            r12 = r5
            r13 = r6
            r14 = r7
            if (r12 != 0) goto L_0x0619
            java.lang.Object r1 = r14.mo27330f(r10)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x0617
        L_0x00d2:
            java.lang.Object r1 = r8.m45816U(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.C8243v0) r1     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.n1 r11 = r8.m45855w(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r0.mo27064i(r1, r11, r6)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45856w0(r10, r2, r3, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x00e4:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.mo27081w()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x00f8:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.mo27079v()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x010c:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.mo27068m()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0120:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.mo27049J()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0133:
            int r1 = r22.mo27077t()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.d0$e r12 = r8.m45851u(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            if (r12 == 0) goto L_0x014c
            boolean r12 = r12.mo26874a(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            if (r12 == 0) goto L_0x0144
            goto L_0x014c
        L_0x0144:
            java.lang.Object r5 = com.google.protobuf.C8209p1.m45500L(r10, r2, r1, r5, r7)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r13 = r6
            r14 = r7
            goto L_0x069c
        L_0x014c:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x015b:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.mo27070o()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x016e:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.i r1 = r22.mo27045F()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x017d:
            java.lang.Object r1 = r8.m45816U(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.C8243v0) r1     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.n1 r11 = r8.m45855w(r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r0.mo27042C(r1, r11, r6)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45856w0(r10, r2, r3, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x018e:
            r8.m45842p0(r10, r11, r0)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
        L_0x0194:
            r12 = r5
            r13 = r6
            goto L_0x0247
        L_0x0198:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            boolean r1 = r22.mo27066k()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01ab:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.mo27065j()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01be:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.mo27058c()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01d1:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            int r1 = r22.mo27047H()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01e4:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.mo27057b()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x01f7:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            long r13 = r22.mo27052M()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x020a:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            float r1 = r22.readFloat()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x021e:
            long r11 = m45821Z(r11)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            double r13 = r22.readDouble()     // Catch:{ a -> 0x0641, all -> 0x0232 }
            java.lang.Double r1 = java.lang.Double.valueOf(r13)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            com.google.protobuf.C8268z1.m45999V(r10, r11, r1)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            r8.m45850t0(r10, r2, r3)     // Catch:{ a -> 0x0641, all -> 0x0232 }
            goto L_0x0194
        L_0x0232:
            r0 = move-exception
            goto L_0x06a5
        L_0x0235:
            java.lang.Object r11 = r8.m45853v(r3)     // Catch:{ a -> 0x0640 }
            r1 = r18
            r2 = r21
            r4 = r11
            r12 = r5
            r5 = r23
            r13 = r6
            r6 = r22
            r1.m45811P(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0267, all -> 0x0263 }
        L_0x0247:
            r14 = r7
            goto L_0x060e
        L_0x024a:
            r12 = r5
            r13 = r6
            long r4 = m45821Z(r11)     // Catch:{ a -> 0x0267, all -> 0x0263 }
            com.google.protobuf.n1 r6 = r8.m45855w(r3)     // Catch:{ a -> 0x0267, all -> 0x0263 }
            r1 = r18
            r2 = r21
            r3 = r4
            r5 = r22
            r14 = r7
            r7 = r23
            r1.m45838n0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0263:
            r0 = move-exception
            r14 = r7
            goto L_0x0612
        L_0x0267:
            r14 = r7
            goto L_0x0615
        L_0x026a:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27060e(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x027c:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27056a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x028e:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27072q(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02a0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27059d(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02b2:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r4 = r1.mo27155e(r10, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27076s(r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r5 = r8.m45851u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.C8209p1.m45489A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x02d3:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27062g(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02e5:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27082x(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x02f7:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27078u(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0309:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27054O(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x031b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27073r(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x032d:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27069n(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x033f:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27071p(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0351:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27046G(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0363:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27051L(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0375:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27060e(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0387:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27056a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0399:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27072q(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03ab:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27059d(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03bd:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r4 = r1.mo27155e(r10, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27076s(r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r5 = r8.m45851u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r21
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r19
            java.lang.Object r5 = com.google.protobuf.C8209p1.m45489A(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x03de:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27062g(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x03f0:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27050K(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0402:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.n1 r5 = r8.m45855w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r1 = r18
            r2 = r21
            r3 = r11
            r4 = r22
            r6 = r23
            r1.m45840o0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0417:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.m45844q0(r10, r11, r0)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x041f:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27082x(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0431:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27078u(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0443:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27054O(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0455:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27073r(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0467:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27069n(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0479:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27071p(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x048b:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27046G(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x049d:
            r12 = r5
            r13 = r6
            r14 = r7
            com.google.protobuf.l0 r1 = r8.f35184n     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r2 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            java.util.List r1 = r1.mo27155e(r10, r2)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27051L(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04af:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.m45815T(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.C8243v0) r1     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.n1 r2 = r8.m45855w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27064i(r1, r2, r13)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45854v0(r10, r3, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04c4:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.mo27081w()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45998U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04d7:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.mo27079v()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04ea:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.mo27068m()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45998U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x04fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.mo27049J()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0510:
            r12 = r5
            r13 = r6
            r14 = r7
            int r1 = r22.mo27077t()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.d0$e r4 = r8.m45851u(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            if (r4 == 0) goto L_0x052a
            boolean r4 = r4.mo26874a(r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            if (r4 == 0) goto L_0x0524
            goto L_0x052a
        L_0x0524:
            java.lang.Object r5 = com.google.protobuf.C8209p1.m45500L(r10, r2, r1, r12, r14)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x069c
        L_0x052a:
            long r4 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r4, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0536:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.mo27070o()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0549:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.i r4 = r22.mo27045F()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45999V(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x055c:
            r12 = r5
            r13 = r6
            r14 = r7
            java.lang.Object r1 = r8.m45815T(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.v0 r1 = (com.google.protobuf.C8243v0) r1     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.n1 r2 = r8.m45855w(r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r0.mo27042C(r1, r2, r13)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45854v0(r10, r3, r1)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x0571:
            r12 = r5
            r13 = r6
            r14 = r7
            r8.m45842p0(r10, r11, r0)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x057c:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            boolean r4 = r22.mo27066k()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45989L(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x058f:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.mo27065j()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05a2:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.mo27058c()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45998U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05b5:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            int r4 = r22.mo27047H()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45997T(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05c7:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.mo27057b()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45998U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05d9:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            long r4 = r22.mo27052M()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45998U(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05eb:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            float r4 = r22.readFloat()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45996S(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            goto L_0x060e
        L_0x05fd:
            r12 = r5
            r13 = r6
            r14 = r7
            long r1 = m45821Z(r11)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            double r4 = r22.readDouble()     // Catch:{ a -> 0x0615, all -> 0x0611 }
            com.google.protobuf.C8268z1.m45995R(r10, r1, r4)     // Catch:{ a -> 0x0615, all -> 0x0611 }
            r8.m45848s0(r10, r3)     // Catch:{ a -> 0x0615, all -> 0x0611 }
        L_0x060e:
            r5 = r12
            goto L_0x069c
        L_0x0611:
            r0 = move-exception
        L_0x0612:
            r5 = r12
            goto L_0x06ab
        L_0x0615:
            r5 = r12
            goto L_0x0643
        L_0x0617:
            r5 = r1
            goto L_0x061a
        L_0x0619:
            r5 = r12
        L_0x061a:
            boolean r1 = r14.mo27337m(r5, r0)     // Catch:{ a -> 0x0643 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f35181k
            r4 = r5
        L_0x0623:
            int r1 = r8.f35182l
            if (r0 >= r1) goto L_0x063a
            int[] r1 = r8.f35180j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0623
        L_0x063a:
            if (r4 == 0) goto L_0x063f
            r14.mo27339o(r10, r4)
        L_0x063f:
            return
        L_0x0640:
            r12 = r5
        L_0x0641:
            r13 = r6
            r14 = r7
        L_0x0643:
            boolean r1 = r14.mo27341q(r0)     // Catch:{ all -> 0x06a1 }
            if (r1 == 0) goto L_0x066f
            boolean r1 = r22.mo27048I()     // Catch:{ all -> 0x06a1 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f35181k
            r4 = r5
        L_0x0652:
            int r1 = r8.f35182l
            if (r0 >= r1) goto L_0x0669
            int[] r1 = r8.f35180j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0652
        L_0x0669:
            if (r4 == 0) goto L_0x066e
            r14.mo27339o(r10, r4)
        L_0x066e:
            return
        L_0x066f:
            if (r5 != 0) goto L_0x0676
            java.lang.Object r1 = r14.mo27330f(r10)     // Catch:{ all -> 0x06a1 }
            r5 = r1
        L_0x0676:
            boolean r1 = r14.mo27337m(r5, r0)     // Catch:{ all -> 0x06a1 }
            if (r1 != 0) goto L_0x069c
            int r0 = r8.f35181k
            r4 = r5
        L_0x067f:
            int r1 = r8.f35182l
            if (r0 >= r1) goto L_0x0696
            int[] r1 = r8.f35180j
            r3 = r1[r0]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x067f
        L_0x0696:
            if (r4 == 0) goto L_0x069b
            r14.mo27339o(r10, r4)
        L_0x069b:
            return
        L_0x069c:
            r15 = r10
            r6 = r13
            r7 = r14
            goto L_0x000f
        L_0x06a1:
            r0 = move-exception
            goto L_0x06ab
        L_0x06a3:
            r0 = move-exception
            r12 = r5
        L_0x06a5:
            r14 = r7
            goto L_0x06ab
        L_0x06a7:
            r0 = move-exception
            r12 = r5
        L_0x06a9:
            r14 = r7
            r10 = r15
        L_0x06ab:
            int r1 = r8.f35181k
            r7 = r1
            r4 = r5
        L_0x06af:
            int r1 = r8.f35182l
            if (r7 >= r1) goto L_0x06c6
            int[] r1 = r8.f35180j
            r3 = r1[r7]
            r1 = r18
            r2 = r21
            r5 = r19
            r6 = r21
            java.lang.Object r4 = r1.m45845r(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x06af
        L_0x06c6:
            if (r4 == 0) goto L_0x06cb
            r14.mo27339o(r10, r4)
        L_0x06cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45810O(com.google.protobuf.v1, com.google.protobuf.r, java.lang.Object, com.google.protobuf.l1, com.google.protobuf.q):void");
    }

    /* renamed from: P */
    private final <K, V> void m45811P(Object obj, int i, Object obj2, C8210q qVar, C8190l1 l1Var) throws IOException {
        long Z = m45821Z(m45860y0(i));
        Object G = C8268z1.m45984G(obj, Z);
        if (G == null) {
            G = this.f35187q.mo27227e(obj2);
            C8268z1.m45999V(obj, Z, G);
        } else if (this.f35187q.mo27229g(G)) {
            Object e = this.f35187q.mo27227e(obj2);
            this.f35187q.mo27223a(e, G);
            C8268z1.m45999V(obj, Z, e);
            G = e;
        }
        l1Var.mo27043D(this.f35187q.mo27226d(G), this.f35187q.mo27225c(obj2), qVar);
    }

    /* renamed from: Q */
    private void m45812Q(T t, T t2, int i) {
        if (m45797D(t2, i)) {
            long Z = m45821Z(m45860y0(i));
            Unsafe unsafe = f35170s;
            Object object = unsafe.getObject(t2, Z);
            if (object != null) {
                C8202n1 w = m45855w(i);
                if (!m45797D(t, i)) {
                    if (!m45804I(object)) {
                        unsafe.putObject(t, Z, object);
                    } else {
                        Object i2 = w.mo27205i();
                        w.mo27197a(i2, object);
                        unsafe.putObject(t, Z, i2);
                    }
                    m45848s0(t, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, Z);
                if (!m45804I(object2)) {
                    Object i3 = w.mo27205i();
                    w.mo27197a(i3, object2);
                    unsafe.putObject(t, Z, i3);
                    object2 = i3;
                }
                w.mo27197a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + m45820Y(i) + " is present but null: " + t2);
        }
    }

    /* renamed from: R */
    private void m45813R(T t, T t2, int i) {
        int Y = m45820Y(i);
        if (m45806K(t2, Y, i)) {
            long Z = m45821Z(m45860y0(i));
            Unsafe unsafe = f35170s;
            Object object = unsafe.getObject(t2, Z);
            if (object != null) {
                C8202n1 w = m45855w(i);
                if (!m45806K(t, Y, i)) {
                    if (!m45804I(object)) {
                        unsafe.putObject(t, Z, object);
                    } else {
                        Object i2 = w.mo27205i();
                        w.mo27197a(i2, object);
                        unsafe.putObject(t, Z, i2);
                    }
                    m45850t0(t, Y, i);
                    return;
                }
                Object object2 = unsafe.getObject(t, Z);
                if (!m45804I(object2)) {
                    Object i3 = w.mo27205i();
                    w.mo27197a(i3, object2);
                    unsafe.putObject(t, Z, i3);
                    object2 = i3;
                }
                w.mo27197a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + m45820Y(i) + " is present but null: " + t2);
        }
    }

    /* renamed from: S */
    private void m45814S(T t, T t2, int i) {
        int y0 = m45860y0(i);
        long Z = m45821Z(y0);
        int Y = m45820Y(i);
        switch (m45858x0(y0)) {
            case 0:
                if (m45797D(t2, i)) {
                    C8268z1.m45995R(t, Z, C8268z1.m45978A(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 1:
                if (m45797D(t2, i)) {
                    C8268z1.m45996S(t, Z, C8268z1.m45979B(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 2:
                if (m45797D(t2, i)) {
                    C8268z1.m45998U(t, Z, C8268z1.m45982E(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 3:
                if (m45797D(t2, i)) {
                    C8268z1.m45998U(t, Z, C8268z1.m45982E(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 4:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 5:
                if (m45797D(t2, i)) {
                    C8268z1.m45998U(t, Z, C8268z1.m45982E(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 6:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 7:
                if (m45797D(t2, i)) {
                    C8268z1.m45989L(t, Z, C8268z1.m46021t(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 8:
                if (m45797D(t2, i)) {
                    C8268z1.m45999V(t, Z, C8268z1.m45984G(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 9:
                m45812Q(t, t2, i);
                return;
            case 10:
                if (m45797D(t2, i)) {
                    C8268z1.m45999V(t, Z, C8268z1.m45984G(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 11:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 12:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 13:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 14:
                if (m45797D(t2, i)) {
                    C8268z1.m45998U(t, Z, C8268z1.m45982E(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 15:
                if (m45797D(t2, i)) {
                    C8268z1.m45997T(t, Z, C8268z1.m45980C(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 16:
                if (m45797D(t2, i)) {
                    C8268z1.m45998U(t, Z, C8268z1.m45982E(t2, Z));
                    m45848s0(t, i);
                    return;
                }
                return;
            case 17:
                m45812Q(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
            case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f35184n.mo27154d(t, t2, Z);
                return;
            case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                C8209p1.m45494F(this.f35187q, t, t2, Z);
                return;
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
            case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
            case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
            case C8710R.styleable.AppCompatTheme_colorError /*56*/:
            case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                if (m45806K(t2, Y, i)) {
                    C8268z1.m45999V(t, Z, C8268z1.m45984G(t2, Z));
                    m45850t0(t, Y, i);
                    return;
                }
                return;
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                m45813R(t, t2, i);
                return;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
            case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
            case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                if (m45806K(t2, Y, i)) {
                    C8268z1.m45999V(t, Z, C8268z1.m45984G(t2, Z));
                    m45850t0(t, Y, i);
                    return;
                }
                return;
            case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                m45813R(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: T */
    private Object m45815T(T t, int i) {
        C8202n1 w = m45855w(i);
        long Z = m45821Z(m45860y0(i));
        if (!m45797D(t, i)) {
            return w.mo27205i();
        }
        Object object = f35170s.getObject(t, Z);
        if (m45804I(object)) {
            return object;
        }
        Object i2 = w.mo27205i();
        if (object != null) {
            w.mo27197a(i2, object);
        }
        return i2;
    }

    /* renamed from: U */
    private Object m45816U(T t, int i, int i2) {
        C8202n1 w = m45855w(i2);
        if (!m45806K(t, i, i2)) {
            return w.mo27205i();
        }
        Object object = f35170s.getObject(t, m45821Z(m45860y0(i2)));
        if (m45804I(object)) {
            return object;
        }
        Object i3 = w.mo27205i();
        if (object != null) {
            w.mo27197a(i3, object);
        }
        return i3;
    }

    /* renamed from: V */
    static <T> C8255y0<T> m45817V(Class<T> cls, C8233t0 t0Var, C8093a1 a1Var, C8186l0 l0Var, C8245v1<?, ?> v1Var, C8223r<?> rVar, C8212q0 q0Var) {
        if (t0Var instanceof C8179k1) {
            return m45819X((C8179k1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var);
        }
        return m45818W((C8225r1) t0Var, a1Var, l0Var, v1Var, rVar, q0Var);
    }

    /* renamed from: W */
    static <T> C8255y0<T> m45818W(C8225r1 r1Var, C8093a1 a1Var, C8186l0 l0Var, C8245v1<?, ?> v1Var, C8223r<?> rVar, C8212q0 q0Var) {
        boolean z = r1Var.mo27087c() == C8152h1.PROTO3;
        C8237u[] e = r1Var.mo27287e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = r1Var.mo27286d();
                if (d == null) {
                    d = f35169r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f35169r;
                    int[] iArr3 = f35169r;
                    int[] iArr4 = new int[(d.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new C8255y0(iArr, objArr, 0, 0, r1Var.mo27086b(), z, true, iArr4, d.length, d.length + iArr2.length, a1Var, l0Var, v1Var, rVar, q0Var);
                }
                C8237u uVar = e[0];
                throw null;
            }
            C8237u uVar2 = e[0];
            throw null;
        }
        C8237u uVar3 = e[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036e  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.protobuf.C8255y0<T> m45819X(com.google.protobuf.C8179k1 r34, com.google.protobuf.C8093a1 r35, com.google.protobuf.C8186l0 r36, com.google.protobuf.C8245v1<?, ?> r37, com.google.protobuf.C8223r<?> r38, com.google.protobuf.C8212q0 r39) {
        /*
            com.google.protobuf.h1 r0 = r34.mo27087c()
            com.google.protobuf.h1 r1 = com.google.protobuf.C8152h1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r34.mo27089e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f35169r
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0161
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0161:
            sun.misc.Unsafe r15 = f35170s
            java.lang.Object[] r17 = r34.mo27088d()
            com.google.protobuf.v0 r18 = r34.mo27086b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r4 >= r1) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m45846r0(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0273
        L_0x026b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m45846r0(r2, r8)
            r17[r1] = r8
        L_0x0273:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r31 = r0
            r0 = r10
            r8 = r11
            r29 = r32
            r25 = 1
            r10 = r9
            r9 = r1
            r1 = 0
            goto L_0x0388
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m45846r0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x031c
            r8 = 1
            goto L_0x031d
        L_0x031c:
            r8 = 0
        L_0x031d:
            if (r8 == 0) goto L_0x036e
            r8 = 17
            if (r5 > r8) goto L_0x036e
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0344
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r29
            goto L_0x0332
        L_0x0344:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x034a
        L_0x0348:
            r29 = r8
        L_0x034a:
            int r8 = r6 * 2
            int r26 = r1 / 32
            int r8 = r8 + r26
            r12 = r17[r8]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m45846r0(r2, r12)
            r17[r8] = r12
        L_0x0363:
            r0 = r10
            r8 = r11
            long r10 = r15.objectFieldOffset(r12)
            int r11 = (int) r10
            int r1 = r1 % 32
            r10 = r11
            goto L_0x0378
        L_0x036e:
            r31 = r0
            r0 = r10
            r8 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0378:
            r11 = 18
            if (r5 < r11) goto L_0x0386
            r11 = 49
            if (r5 > r11) goto L_0x0386
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r11 = r21 + 1
            r7[r21] = r4
            int r4 = r11 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0395
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0396
        L_0x0395:
            r12 = 0
        L_0x0396:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039d
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r11] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r10
            r7[r4] = r1
            r10 = r0
            r11 = r8
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0180
        L_0x03c0:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            r8 = r11
            com.google.protobuf.y0 r1 = new com.google.protobuf.y0
            com.google.protobuf.v0 r9 = r34.mo27086b()
            r11 = 0
            r4 = r1
            r5 = r7
            r6 = r8
            r7 = r14
            r8 = r33
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45819X(com.google.protobuf.k1, com.google.protobuf.a1, com.google.protobuf.l0, com.google.protobuf.v1, com.google.protobuf.r, com.google.protobuf.q0):com.google.protobuf.y0");
    }

    /* renamed from: Y */
    private int m45820Y(int i) {
        return this.f35171a[i];
    }

    /* renamed from: Z */
    private static long m45821Z(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: a0 */
    private static <T> boolean m45822a0(T t, long j) {
        return ((Boolean) C8268z1.m45984G(t, j)).booleanValue();
    }

    /* renamed from: b0 */
    private static <T> double m45823b0(T t, long j) {
        return ((Double) C8268z1.m45984G(t, j)).doubleValue();
    }

    /* renamed from: c0 */
    private static <T> float m45824c0(T t, long j) {
        return ((Float) C8268z1.m45984G(t, j)).floatValue();
    }

    /* renamed from: d0 */
    private static <T> int m45825d0(T t, long j) {
        return ((Integer) C8268z1.m45984G(t, j)).intValue();
    }

    /* renamed from: e0 */
    private static <T> long m45826e0(T t, long j) {
        return ((Long) C8268z1.m45984G(t, j)).longValue();
    }

    /* renamed from: f0 */
    private <K, V> int m45827f0(T t, byte[] bArr, int i, int i2, int i3, long j, C8139f.C8141b bVar) throws IOException {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f35170s;
        int i4 = i3;
        Object v = m45853v(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f35187q.mo27229g(object)) {
            Object e = this.f35187q.mo27227e(v);
            this.f35187q.mo27223a(e, object);
            unsafe.putObject(t, j2, e);
            object = e;
        }
        return m45837n(bArr, i, i2, this.f35187q.mo27225c(v), this.f35187q.mo27226d(object), bVar);
    }

    /* renamed from: g0 */
    private int m45828g0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C8139f.C8141b bVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C8139f.C8141b bVar2 = bVar;
        Unsafe unsafe = f35170s;
        long j3 = (long) (this.f35171a[i13 + 2] & 1048575);
        switch (i7) {
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C8139f.m44719d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C8139f.m44727l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                if (i12 == 0) {
                    int L = C8139f.m44711L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bVar2.f34873b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                if (i12 == 0) {
                    int I = C8139f.m44708I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bVar2.f34872a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorError /*56*/:
            case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C8139f.m44725j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C8139f.m44723h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                if (i12 == 0) {
                    int L2 = C8139f.m44711L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(bVar2.f34873b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                if (i12 == 2) {
                    int I2 = C8139f.m44708I(bArr2, i9, bVar2);
                    int i18 = bVar2.f34872a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C8094a2.m44518t(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, C8119d0.f34855b));
                        I2 += i18;
                    } else {
                        throw C8135e0.m44685d();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                if (i12 == 2) {
                    Object U = m45816U(t2, i11, i13);
                    int O = C8139f.m44714O(U, m45855w(i13), bArr, i, i2, bVar);
                    m45856w0(t2, i11, i13, U);
                    return O;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                if (i12 == 2) {
                    int b = C8139f.m44717b(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, bVar2.f34874c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                if (i12 == 0) {
                    int I3 = C8139f.m44708I(bArr2, i9, bVar2);
                    int i19 = bVar2.f34872a;
                    C8119d0.C8124e u = m45851u(i13);
                    if (u == null || u.mo26874a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m45857x(t).mo27356n(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                if (i12 == 0) {
                    int I4 = C8139f.m44708I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C8167j.m44839b(bVar2.f34872a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                if (i12 == 0) {
                    int L3 = C8139f.m44711L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C8167j.m44840c(bVar2.f34873b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                if (i12 == 3) {
                    Object U2 = m45816U(t2, i11, i13);
                    int N = C8139f.m44713N(U2, m45855w(i13), bArr, i, i2, (i10 & -8) | 4, bVar);
                    m45856w0(t2, i11, i13, U2);
                    return N;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0297, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ba, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02bd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r13 = r19;
        r19 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a2, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b4, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b7, code lost:
        r2 = r4;
        r28 = r10;
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0250, code lost:
        if (r0 != r15) goto L_0x0252;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m45829i0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.C8139f.C8141b r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m45835m(r31)
            sun.misc.Unsafe r9 = f35170s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x02e2
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.protobuf.C8139f.m44707H(r0, r12, r3, r11)
            int r3 = r11.f34872a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m45834l0(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m45832k0(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = -1
            r20 = 0
            goto L_0x02bf
        L_0x004e:
            int[] r0 = r15.f35171a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m45858x0(r1)
            r18 = r9
            long r8 = m45821Z(r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x01c0
            int[] r10 = r15.f35171a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x0092
            if (r7 == r13) goto L_0x0082
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0084
        L_0x0082:
            r7 = r18
        L_0x0084:
            if (r10 == r13) goto L_0x008c
            long r1 = (long) r10
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008c:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0094
        L_0x0092:
            r10 = r18
        L_0x0094:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01a5;
                case 1: goto L_0x0195;
                case 2: goto L_0x017a;
                case 3: goto L_0x017a;
                case 4: goto L_0x016a;
                case 5: goto L_0x0153;
                case 6: goto L_0x0145;
                case 7: goto L_0x012c;
                case 8: goto L_0x010f;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00dd;
                case 11: goto L_0x016a;
                case 12: goto L_0x00cc;
                case 13: goto L_0x0145;
                case 14: goto L_0x0153;
                case 15: goto L_0x00b7;
                case 16: goto L_0x009e;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r19
            r19 = r33
            goto L_0x01b7
        L_0x009e:
            if (r3 != 0) goto L_0x0098
            int r17 = com.google.protobuf.C8139f.m44711L(r12, r4, r11)
            long r0 = r11.f34873b
            long r4 = com.google.protobuf.C8167j.m44840c(r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x018d
        L_0x00b7:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44708I(r12, r4, r11)
            int r1 = r11.f34872a
            int r1 = com.google.protobuf.C8167j.m44839b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x00cc:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44708I(r12, r4, r11)
            int r1 = r11.f34872a
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x00dd:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44717b(r12, r4, r11)
            java.lang.Object r1 = r11.f34874c
            r10.putObject(r14, r8, r1)
            goto L_0x01b4
        L_0x00ef:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            java.lang.Object r8 = r15.m45815T(r14, r13)
            com.google.protobuf.n1 r1 = r15.m45855w(r13)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.protobuf.C8139f.m44714O(r0, r1, r2, r3, r4, r5)
            r15.m45854v0(r14, r13, r8)
            goto L_0x01b4
        L_0x010f:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01b7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0121
            int r0 = com.google.protobuf.C8139f.m44702C(r12, r4, r11)
            goto L_0x0125
        L_0x0121:
            int r0 = com.google.protobuf.C8139f.m44705F(r12, r4, r11)
        L_0x0125:
            java.lang.Object r1 = r11.f34874c
            r10.putObject(r14, r8, r1)
            goto L_0x01b4
        L_0x012c:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44711L(r12, r4, r11)
            long r1 = r11.f34873b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r5 = 0
        L_0x0140:
            com.google.protobuf.C8268z1.m45989L(r14, r8, r5)
            goto L_0x01b4
        L_0x0145:
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44723h(r12, r4)
            r10.putInt(r14, r8, r0)
            goto L_0x01a2
        L_0x0153:
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01b7
            long r22 = com.google.protobuf.C8139f.m44725j(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01b4
        L_0x016a:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r0 = com.google.protobuf.C8139f.m44708I(r12, r4, r11)
            int r1 = r11.f34872a
            r10.putInt(r14, r8, r1)
            goto L_0x01b4
        L_0x017a:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01b7
            int r17 = com.google.protobuf.C8139f.m44711L(r12, r4, r11)
            long r4 = r11.f34873b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x018d:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0202
        L_0x0195:
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01b7
            float r0 = com.google.protobuf.C8139f.m44727l(r12, r4)
            com.google.protobuf.C8268z1.m45996S(r14, r8, r0)
        L_0x01a2:
            int r0 = r4 + 4
            goto L_0x01b4
        L_0x01a5:
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01b7
            double r0 = com.google.protobuf.C8139f.m44719d(r12, r4)
            com.google.protobuf.C8268z1.m45995R(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01b4:
            r6 = r6 | r21
            goto L_0x0200
        L_0x01b7:
            r2 = r4
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02bf
        L_0x01c0:
            r19 = r33
            r23 = r1
            r13 = r2
            r10 = r18
            r1 = 27
            if (r0 != r1) goto L_0x0216
            r1 = 2
            if (r3 != r1) goto L_0x0209
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.protobuf.d0$j r0 = (com.google.protobuf.C8119d0.C8130j) r0
            boolean r1 = r0.mo26802F1()
            if (r1 != 0) goto L_0x01ec
            int r1 = r0.size()
            if (r1 != 0) goto L_0x01e3
            r1 = 10
            goto L_0x01e5
        L_0x01e3:
            int r1 = r1 * 2
        L_0x01e5:
            com.google.protobuf.d0$j r0 = r0.mo26823m(r1)
            r10.putObject(r14, r8, r0)
        L_0x01ec:
            r5 = r0
            com.google.protobuf.n1 r0 = r15.m45855w(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.protobuf.C8139f.m44732q(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0200:
            r9 = r10
            r2 = r13
        L_0x0202:
            r1 = r19
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0209:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x029a
        L_0x0216:
            r1 = 49
            if (r0 > r1) goto L_0x0266
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m45830j0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02bd
        L_0x0252:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x02dd
        L_0x0266:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02a0
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x029a
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            int r0 = r0.m45827f0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02bd
            goto L_0x0252
        L_0x029a:
            r2 = r15
        L_0x029b:
            r6 = r24
            r7 = r25
            goto L_0x02bf
        L_0x02a0:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.m45828g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02bd
            goto L_0x0252
        L_0x02bd:
            r2 = r0
            goto L_0x029b
        L_0x02bf:
            com.google.protobuf.w1 r4 = m45857x(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.protobuf.C8139f.m44706G(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r2 = r20
        L_0x02dd:
            r9 = r28
            r10 = -1
            goto L_0x001a
        L_0x02e2:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x02f5
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x02f5:
            r1 = r34
            if (r0 != r1) goto L_0x02fa
            return r0
        L_0x02fa:
            com.google.protobuf.e0 r0 = com.google.protobuf.C8135e0.m44689h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45829i0(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):int");
    }

    /* renamed from: j0 */
    private int m45830j0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C8139f.C8141b bVar) throws IOException {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C8139f.C8141b bVar2 = bVar;
        Unsafe unsafe = f35170s;
        C8119d0.C8130j jVar = (C8119d0.C8130j) unsafe.getObject(t, j3);
        if (!jVar.mo26802F1()) {
            int size = jVar.size();
            jVar = jVar.mo26823m(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, jVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C8139f.m44734s(bArr, i9, jVar, bVar2);
                }
                if (i10 == 1) {
                    return C8139f.m44720e(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C8139f.m44737v(bArr, i9, jVar, bVar2);
                }
                if (i10 == 5) {
                    return C8139f.m44728m(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C8139f.m44741z(bArr, i9, jVar, bVar2);
                }
                if (i10 == 0) {
                    return C8139f.m44712M(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                if (i10 == 2) {
                    return C8139f.m44740y(bArr, i9, jVar, bVar2);
                }
                if (i10 == 0) {
                    return C8139f.m44709J(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C8139f.m44736u(bArr, i9, jVar, bVar2);
                }
                if (i10 == 1) {
                    return C8139f.m44726k(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C8139f.m44735t(bArr, i9, jVar, bVar2);
                }
                if (i10 == 5) {
                    return C8139f.m44724i(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C8139f.m44733r(bArr, i9, jVar, bVar2);
                }
                if (i10 == 0) {
                    return C8139f.m44716a(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return C8139f.m44703D(i3, bArr, i, i2, jVar, bVar);
                    }
                    return C8139f.m44704E(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C8139f.m44732q(m45855w(i11), i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C8139f.m44718c(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 30:
            case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                if (i10 == 2) {
                    i8 = C8139f.m44740y(bArr, i9, jVar, bVar2);
                } else if (i10 == 0) {
                    i8 = C8139f.m44709J(i3, bArr, i, i2, jVar, bVar);
                }
                C8209p1.m45489A(t, i4, jVar, m45851u(i11), null, this.f35185o);
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C8139f.m44738w(bArr, i9, jVar, bVar2);
                }
                if (i10 == 0) {
                    return C8139f.m44700A(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C8139f.m44739x(bArr, i9, jVar, bVar2);
                }
                if (i10 == 0) {
                    return C8139f.m44701B(i3, bArr, i, i2, jVar, bVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C8139f.m44730o(m45855w(i11), i3, bArr, i, i2, jVar, bVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: k */
    private boolean m45831k(T t, T t2, int i) {
        return m45797D(t, i) == m45797D(t2, i);
    }

    /* renamed from: k0 */
    private int m45832k0(int i) {
        if (i < this.f35173c || i > this.f35174d) {
            return -1;
        }
        return m45852u0(i, 0);
    }

    /* renamed from: l */
    private static <T> boolean m45833l(T t, long j) {
        return C8268z1.m46021t(t, j);
    }

    /* renamed from: l0 */
    private int m45834l0(int i, int i2) {
        if (i < this.f35173c || i > this.f35174d) {
            return -1;
        }
        return m45852u0(i, i2);
    }

    /* renamed from: m */
    private static void m45835m(Object obj) {
        if (!m45804I(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    /* renamed from: m0 */
    private int m45836m0(int i) {
        return this.f35171a[i + 2];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <K, V> int m45837n(byte[] r15, int r16, int r17, com.google.protobuf.C8204o0.C8205a<K, V> r18, java.util.Map<K, V> r19, com.google.protobuf.C8139f.C8141b r20) throws java.io.IOException {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.C8139f.m44708I(r15, r0, r10)
            int r1 = r10.f34872a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f35035b
            V r2 = r9.f35037d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.C8139f.m44707H(r0, r15, r1, r10)
            int r1 = r10.f34872a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.b2$b r1 = r9.f35036c
            int r1 = r1.mo26801b()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.b2$b r4 = r9.f35036c
            V r0 = r9.f35037d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.m45839o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f34874c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.b2$b r1 = r9.f35034a
            int r1 = r1.mo26801b()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.b2$b r4 = r9.f35034a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.m45839o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f34874c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.C8139f.m44715P(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.e0 r0 = com.google.protobuf.C8135e0.m44689h()
            throw r0
        L_0x0081:
            com.google.protobuf.e0 r0 = com.google.protobuf.C8135e0.m44692m()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45837n(byte[], int, int, com.google.protobuf.o0$a, java.util.Map, com.google.protobuf.f$b):int");
    }

    /* renamed from: n0 */
    private <E> void m45838n0(Object obj, long j, C8190l1 l1Var, C8202n1<E> n1Var, C8210q qVar) throws IOException {
        l1Var.mo27061f(this.f35184n.mo27155e(obj, j), n1Var, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m45839o(byte[] r2, int r3, int r4, com.google.protobuf.C8105b2.C8107b r5, java.lang.Class<?> r6, com.google.protobuf.C8139f.C8141b r7) throws java.io.IOException {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.C8255y0.C8256a.f35188a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.C8139f.m44705F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = com.google.protobuf.C8139f.m44711L(r2, r3, r7)
            long r3 = r7.f34873b
            long r3 = com.google.protobuf.C8167j.m44840c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f34874c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = com.google.protobuf.C8139f.m44708I(r2, r3, r7)
            int r3 = r7.f34872a
            int r3 = com.google.protobuf.C8167j.m44839b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f34874c = r3
            goto L_0x00ae
        L_0x003d:
            com.google.protobuf.i1 r5 = com.google.protobuf.C8166i1.m44835a()
            com.google.protobuf.n1 r5 = r5.mo26961c(r6)
            int r2 = com.google.protobuf.C8139f.m44731p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = com.google.protobuf.C8139f.m44711L(r2, r3, r7)
            long r3 = r7.f34873b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f34874c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = com.google.protobuf.C8139f.m44708I(r2, r3, r7)
            int r3 = r7.f34872a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f34874c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = com.google.protobuf.C8139f.m44727l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f34874c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = com.google.protobuf.C8139f.m44725j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f34874c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = com.google.protobuf.C8139f.m44723h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f34874c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = com.google.protobuf.C8139f.m44719d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f34874c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = com.google.protobuf.C8139f.m44717b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = com.google.protobuf.C8139f.m44711L(r2, r3, r7)
            long r3 = r7.f34873b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f34874c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45839o(byte[], int, int, com.google.protobuf.b2$b, java.lang.Class, com.google.protobuf.f$b):int");
    }

    /* renamed from: o0 */
    private <E> void m45840o0(Object obj, int i, C8190l1 l1Var, C8202n1<E> n1Var, C8210q qVar) throws IOException {
        l1Var.mo27067l(this.f35184n.mo27155e(obj, m45821Z(i)), n1Var, qVar);
    }

    /* renamed from: p */
    private static <T> double m45841p(T t, long j) {
        return C8268z1.m45978A(t, j);
    }

    /* renamed from: p0 */
    private void m45842p0(Object obj, int i, C8190l1 l1Var) throws IOException {
        if (m45795C(i)) {
            C8268z1.m45999V(obj, m45821Z(i), l1Var.mo27053N());
        } else if (this.f35177g) {
            C8268z1.m45999V(obj, m45821Z(i), l1Var.mo27083y());
        } else {
            C8268z1.m45999V(obj, m45821Z(i), l1Var.mo27045F());
        }
    }

    /* renamed from: q */
    private boolean m45843q(T t, T t2, int i) {
        int y0 = m45860y0(i);
        long Z = m45821Z(y0);
        switch (m45858x0(y0)) {
            case 0:
                if (!m45831k(t, t2, i) || Double.doubleToLongBits(C8268z1.m45978A(t, Z)) != Double.doubleToLongBits(C8268z1.m45978A(t2, Z))) {
                    return false;
                }
                return true;
            case 1:
                if (!m45831k(t, t2, i) || Float.floatToIntBits(C8268z1.m45979B(t, Z)) != Float.floatToIntBits(C8268z1.m45979B(t2, Z))) {
                    return false;
                }
                return true;
            case 2:
                if (!m45831k(t, t2, i) || C8268z1.m45982E(t, Z) != C8268z1.m45982E(t2, Z)) {
                    return false;
                }
                return true;
            case 3:
                if (!m45831k(t, t2, i) || C8268z1.m45982E(t, Z) != C8268z1.m45982E(t2, Z)) {
                    return false;
                }
                return true;
            case 4:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 5:
                if (!m45831k(t, t2, i) || C8268z1.m45982E(t, Z) != C8268z1.m45982E(t2, Z)) {
                    return false;
                }
                return true;
            case 6:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 7:
                if (!m45831k(t, t2, i) || C8268z1.m46021t(t, Z) != C8268z1.m46021t(t2, Z)) {
                    return false;
                }
                return true;
            case 8:
                if (!m45831k(t, t2, i) || !C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z))) {
                    return false;
                }
                return true;
            case 9:
                if (!m45831k(t, t2, i) || !C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z))) {
                    return false;
                }
                return true;
            case 10:
                if (!m45831k(t, t2, i) || !C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z))) {
                    return false;
                }
                return true;
            case 11:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 12:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 13:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 14:
                if (!m45831k(t, t2, i) || C8268z1.m45982E(t, Z) != C8268z1.m45982E(t2, Z)) {
                    return false;
                }
                return true;
            case 15:
                if (!m45831k(t, t2, i) || C8268z1.m45980C(t, Z) != C8268z1.m45980C(t2, Z)) {
                    return false;
                }
                return true;
            case 16:
                if (!m45831k(t, t2, i) || C8268z1.m45982E(t, Z) != C8268z1.m45982E(t2, Z)) {
                    return false;
                }
                return true;
            case 17:
                if (!m45831k(t, t2, i) || !C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
            case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z));
            case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                return C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z));
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
            case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
            case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
            case C8710R.styleable.AppCompatTheme_colorError /*56*/:
            case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
            case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
            case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
            case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                if (!m45805J(t, t2, i) || !C8209p1.m45499K(C8268z1.m45984G(t, Z), C8268z1.m45984G(t2, Z))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: q0 */
    private void m45844q0(Object obj, int i, C8190l1 l1Var) throws IOException {
        if (m45795C(i)) {
            l1Var.mo27044E(this.f35184n.mo27155e(obj, m45821Z(i)));
        } else {
            l1Var.mo27041B(this.f35184n.mo27155e(obj, m45821Z(i)));
        }
    }

    /* renamed from: r */
    private <UT, UB> UB m45845r(Object obj, int i, UB ub, C8245v1<UT, UB> v1Var, Object obj2) {
        C8119d0.C8124e u;
        int Y = m45820Y(i);
        Object G = C8268z1.m45984G(obj, m45821Z(m45860y0(i)));
        if (G == null || (u = m45851u(i)) == null) {
            return ub;
        }
        return m45847s(i, Y, this.f35187q.mo27226d(G), u, ub, v1Var, obj2);
    }

    /* renamed from: r0 */
    private static Field m45846r0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: s */
    private <K, V, UT, UB> UB m45847s(int i, int i2, Map<K, V> map, C8119d0.C8124e eVar, UB ub, C8245v1<UT, UB> v1Var, Object obj) {
        C8204o0.C8205a<?, ?> c = this.f35187q.mo27225c(m45853v(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo26874a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = v1Var.mo27330f(obj);
                }
                C8153i.C8161h A = C8153i.m44766A(C8204o0.m45469b(c, next.getKey(), next.getValue()));
                try {
                    C8204o0.m45471e(A.mo26954b(), c, next.getKey(), next.getValue());
                    v1Var.mo27328d(ub, i2, A.mo26953a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: s0 */
    private void m45848s0(T t, int i) {
        int m0 = m45836m0(i);
        long j = (long) (1048575 & m0);
        if (j != 1048575) {
            C8268z1.m45997T(t, j, (1 << (m0 >>> 20)) | C8268z1.m45980C(t, j));
        }
    }

    /* renamed from: t */
    private static <T> float m45849t(T t, long j) {
        return C8268z1.m45979B(t, j);
    }

    /* renamed from: t0 */
    private void m45850t0(T t, int i, int i2) {
        C8268z1.m45997T(t, (long) (m45836m0(i2) & 1048575), i);
    }

    /* renamed from: u */
    private C8119d0.C8124e m45851u(int i) {
        return (C8119d0.C8124e) this.f35172b[((i / 3) * 2) + 1];
    }

    /* renamed from: u0 */
    private int m45852u0(int i, int i2) {
        int length = (this.f35171a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int Y = m45820Y(i4);
            if (i == Y) {
                return i4;
            }
            if (i < Y) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: v */
    private Object m45853v(int i) {
        return this.f35172b[(i / 3) * 2];
    }

    /* renamed from: v0 */
    private void m45854v0(T t, int i, Object obj) {
        f35170s.putObject(t, m45821Z(m45860y0(i)), obj);
        m45848s0(t, i);
    }

    /* renamed from: w */
    private C8202n1 m45855w(int i) {
        int i2 = (i / 3) * 2;
        C8202n1 n1Var = (C8202n1) this.f35172b[i2];
        if (n1Var != null) {
            return n1Var;
        }
        C8202n1 c = C8166i1.m44835a().mo26961c((Class) this.f35172b[i2 + 1]);
        this.f35172b[i2] = c;
        return c;
    }

    /* renamed from: w0 */
    private void m45856w0(T t, int i, int i2, Object obj) {
        f35170s.putObject(t, m45821Z(m45860y0(i2)), obj);
        m45850t0(t, i, i2);
    }

    /* renamed from: x */
    static C8250w1 m45857x(Object obj) {
        C8260z zVar = (C8260z) obj;
        C8250w1 w1Var = zVar.unknownFields;
        if (w1Var != C8250w1.m45718c()) {
            return w1Var;
        }
        C8250w1 k = C8250w1.m45722k();
        zVar.unknownFields = k;
        return k;
    }

    /* renamed from: x0 */
    private static int m45858x0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0346, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0460, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0517, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m45859y(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f35170s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f35171a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x051e
            int r9 = r0.m45860y0(r5)
            int r10 = r0.m45820Y(r5)
            int r11 = m45858x0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x003a
            int[] r12 = r0.f35171a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r3
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0058
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0058
        L_0x003a:
            boolean r12 = r0.f35179i
            if (r12 == 0) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.C8246w.DOUBLE_LIST_PACKED
            int r12 = r12.mo27345a()
            if (r11 < r12) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.C8246w.SINT64_LIST_PACKED
            int r12 = r12.mo27345a()
            if (r11 > r12) goto L_0x0056
            int[] r12 = r0.f35171a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r3
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            r15 = 0
        L_0x0058:
            long r13 = m45821Z(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050b;
                case 1: goto L_0x0501;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e5;
                case 4: goto L_0x04d7;
                case 5: goto L_0x04cd;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04b8;
                case 8: goto L_0x049c;
                case 9: goto L_0x048b;
                case 10: goto L_0x047c;
                case 11: goto L_0x046f;
                case 12: goto L_0x0462;
                case 13: goto L_0x0457;
                case 14: goto L_0x044e;
                case 15: goto L_0x0441;
                case 16: goto L_0x0434;
                case 17: goto L_0x0421;
                case 18: goto L_0x0412;
                case 19: goto L_0x0406;
                case 20: goto L_0x03fa;
                case 21: goto L_0x03ee;
                case 22: goto L_0x03e2;
                case 23: goto L_0x03d6;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03be;
                case 26: goto L_0x03b3;
                case 27: goto L_0x03a4;
                case 28: goto L_0x0398;
                case 29: goto L_0x038b;
                case 30: goto L_0x037e;
                case 31: goto L_0x0371;
                case 32: goto L_0x0364;
                case 33: goto L_0x0357;
                case 34: goto L_0x034a;
                case 35: goto L_0x032a;
                case 36: goto L_0x030d;
                case 37: goto L_0x02f0;
                case 38: goto L_0x02d3;
                case 39: goto L_0x02b5;
                case 40: goto L_0x0297;
                case 41: goto L_0x0279;
                case 42: goto L_0x025b;
                case 43: goto L_0x023d;
                case 44: goto L_0x021f;
                case 45: goto L_0x0201;
                case 46: goto L_0x01e3;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01a7;
                case 49: goto L_0x0197;
                case 50: goto L_0x0187;
                case 51: goto L_0x0179;
                case 52: goto L_0x016d;
                case 53: goto L_0x015d;
                case 54: goto L_0x014d;
                case 55: goto L_0x013d;
                case 56: goto L_0x0131;
                case 57: goto L_0x0124;
                case 58: goto L_0x0117;
                case 59: goto L_0x00f9;
                case 60: goto L_0x00e5;
                case 61: goto L_0x00d3;
                case 62: goto L_0x00c3;
                case 63: goto L_0x00b3;
                case 64: goto L_0x00a6;
                case 65: goto L_0x009a;
                case 66: goto L_0x008a;
                case 67: goto L_0x007a;
                case 68: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x041e
        L_0x0064:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r3 = (com.google.protobuf.C8243v0) r3
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8180l.m45164t(r10, r3, r4)
            goto L_0x041d
        L_0x007a:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m45826e0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45134R(r10, r3)
            goto L_0x041d
        L_0x008a:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m45825d0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45132P(r10, r3)
            goto L_0x041d
        L_0x009a:
            boolean r9 = r0.m45806K(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.C8180l.m45130N(r10, r3)
            goto L_0x041d
        L_0x00a6:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.C8180l.m45128L(r10, r3)
            goto L_0x0460
        L_0x00b3:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m45825d0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45156l(r10, r3)
            goto L_0x041d
        L_0x00c3:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m45825d0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45139W(r10, r3)
            goto L_0x041d
        L_0x00d3:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.i r3 = (com.google.protobuf.C8153i) r3
            int r3 = com.google.protobuf.C8180l.m45151h(r10, r3)
            goto L_0x041d
        L_0x00e5:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8209p1.m45534o(r10, r3, r4)
            goto L_0x041d
        L_0x00f9:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C8153i
            if (r4 == 0) goto L_0x010f
            com.google.protobuf.i r3 = (com.google.protobuf.C8153i) r3
            int r3 = com.google.protobuf.C8180l.m45151h(r10, r3)
            goto L_0x041d
        L_0x010f:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C8180l.m45136T(r10, r3)
            goto L_0x041d
        L_0x0117:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.C8180l.m45146e(r10, r3)
            goto L_0x041d
        L_0x0124:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.C8180l.m45158n(r10, r3)
            goto L_0x0460
        L_0x0131:
            boolean r9 = r0.m45806K(r1, r10, r5)
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.C8180l.m45160p(r10, r3)
            goto L_0x041d
        L_0x013d:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = m45825d0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45167w(r10, r3)
            goto L_0x041d
        L_0x014d:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m45826e0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45141Y(r10, r3)
            goto L_0x041d
        L_0x015d:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            long r3 = m45826e0(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45169y(r10, r3)
            goto L_0x041d
        L_0x016d:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            int r3 = com.google.protobuf.C8180l.m45162r(r10, r9)
            goto L_0x041d
        L_0x0179:
            boolean r3 = r0.m45806K(r1, r10, r5)
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r3 = com.google.protobuf.C8180l.m45154j(r10, r3)
            goto L_0x041d
        L_0x0187:
            com.google.protobuf.q0 r3 = r0.f35187q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.m45853v(r5)
            int r3 = r3.mo27228f(r10, r4, r9)
            goto L_0x041d
        L_0x0197:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8209p1.m45529j(r10, r3, r4)
            goto L_0x041d
        L_0x01a7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45539t(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x01bb
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01bb:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x01c5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45537r(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x01d9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d9:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45528i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x01f7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f7:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x0201:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45526g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x0215
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0215:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x021f:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45523e(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x0233
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0233:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x023d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45542w(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x0251
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0251:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x025b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45517b(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x026f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026f:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45526g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x028d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028d:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x0297:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45528i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x02ab
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02ab:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x02b5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45531l(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x02c9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c9:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x02d3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45544y(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x02e7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e7:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x02f0:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45533n(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x0304
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0304:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x030d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45526g(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x0321
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0321:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
            goto L_0x0346
        L_0x032a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45528i(r3)
            if (r3 <= 0) goto L_0x041e
            boolean r4 = r0.f35179i
            if (r4 == 0) goto L_0x033e
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033e:
            int r4 = com.google.protobuf.C8180l.m45138V(r10)
            int r9 = com.google.protobuf.C8180l.m45140X(r3)
        L_0x0346:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0460
        L_0x034a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C8209p1.m45538s(r10, r3, r4)
            goto L_0x041d
        L_0x0357:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45536q(r10, r3, r4)
            goto L_0x041d
        L_0x0364:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45527h(r10, r3, r4)
            goto L_0x041d
        L_0x0371:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45525f(r10, r3, r4)
            goto L_0x041d
        L_0x037e:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45521d(r10, r3, r4)
            goto L_0x041d
        L_0x038b:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45541v(r10, r3, r4)
            goto L_0x041d
        L_0x0398:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45519c(r10, r3)
            goto L_0x041d
        L_0x03a4:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8209p1.m45535p(r10, r3, r4)
            goto L_0x041d
        L_0x03b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45540u(r10, r3)
            goto L_0x041d
        L_0x03be:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C8209p1.m45515a(r10, r3, r4)
            goto L_0x041d
        L_0x03ca:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45525f(r10, r3, r4)
            goto L_0x041d
        L_0x03d6:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45527h(r10, r3, r4)
            goto L_0x041d
        L_0x03e2:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45530k(r10, r3, r4)
            goto L_0x041d
        L_0x03ee:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45543x(r10, r3, r4)
            goto L_0x041d
        L_0x03fa:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45532m(r10, r3, r4)
            goto L_0x041d
        L_0x0406:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45525f(r10, r3, r4)
            goto L_0x041d
        L_0x0412:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C8209p1.m45527h(r10, r3, r4)
        L_0x041d:
            int r6 = r6 + r3
        L_0x041e:
            r11 = 0
            goto L_0x0517
        L_0x0421:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.v0 r3 = (com.google.protobuf.C8243v0) r3
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8180l.m45164t(r10, r3, r4)
            goto L_0x041d
        L_0x0434:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45134R(r10, r3)
            goto L_0x041d
        L_0x0441:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45132P(r10, r3)
            goto L_0x041d
        L_0x044e:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x041e
            int r3 = com.google.protobuf.C8180l.m45130N(r10, r3)
            goto L_0x041d
        L_0x0457:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 0
            int r4 = com.google.protobuf.C8180l.m45128L(r10, r3)
        L_0x0460:
            int r6 = r6 + r4
            goto L_0x041e
        L_0x0462:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45156l(r10, r3)
            goto L_0x041d
        L_0x046f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45139W(r10, r3)
            goto L_0x041d
        L_0x047c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.i r3 = (com.google.protobuf.C8153i) r3
            int r3 = com.google.protobuf.C8180l.m45151h(r10, r3)
            goto L_0x041d
        L_0x048b:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.n1 r4 = r0.m45855w(r5)
            int r3 = com.google.protobuf.C8209p1.m45534o(r10, r3, r4)
            goto L_0x041d
        L_0x049c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C8153i
            if (r4 == 0) goto L_0x04b0
            com.google.protobuf.i r3 = (com.google.protobuf.C8153i) r3
            int r3 = com.google.protobuf.C8180l.m45151h(r10, r3)
            goto L_0x041d
        L_0x04b0:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.C8180l.m45136T(r10, r3)
            goto L_0x041d
        L_0x04b8:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r3 = 1
            int r3 = com.google.protobuf.C8180l.m45146e(r10, r3)
            goto L_0x041d
        L_0x04c3:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x041e
            r11 = 0
            int r3 = com.google.protobuf.C8180l.m45158n(r10, r11)
            goto L_0x0516
        L_0x04cd:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0517
            int r3 = com.google.protobuf.C8180l.m45160p(r10, r3)
            goto L_0x0516
        L_0x04d7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45167w(r10, r3)
            goto L_0x0516
        L_0x04e5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45141Y(r10, r3)
            goto L_0x0516
        L_0x04f3:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.C8180l.m45169y(r10, r3)
            goto L_0x0516
        L_0x0501:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            int r3 = com.google.protobuf.C8180l.m45162r(r10, r9)
            goto L_0x0516
        L_0x050b:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0517
            r3 = 0
            int r3 = com.google.protobuf.C8180l.m45154j(r10, r3)
        L_0x0516:
            int r6 = r6 + r3
        L_0x0517:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x051e:
            com.google.protobuf.v1<?, ?> r2 = r0.f35185o
            int r2 = r0.m45791A(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f35176f
            if (r2 == 0) goto L_0x0534
            com.google.protobuf.r<?> r2 = r0.f35186p
            com.google.protobuf.v r1 = r2.mo27278c(r1)
            int r1 = r1.mo27303l()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45859y(java.lang.Object):int");
    }

    /* renamed from: y0 */
    private int m45860y0(int i) {
        return this.f35171a[i + 1];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m45861z(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f35170s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f35171a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.m45860y0(r4)
            int r7 = m45858x0(r6)
            int r8 = r15.m45820Y(r4)
            long r9 = m45821Z(r6)
            com.google.protobuf.w r6 = com.google.protobuf.C8246w.DOUBLE_LIST_PACKED
            int r6 = r6.mo27345a()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.w r6 = com.google.protobuf.C8246w.SINT64_LIST_PACKED
            int r6 = r6.mo27345a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f35171a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.v0 r6 = (com.google.protobuf.C8243v0) r6
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8180l.m45164t(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m45826e0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45134R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m45825d0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45132P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45130N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45128L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m45825d0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45156l(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m45825d0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45139W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            int r6 = com.google.protobuf.C8180l.m45151h(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8209p1.m45534o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C8153i
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            int r6 = com.google.protobuf.C8180l.m45151h(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C8180l.m45136T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45146e(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45158n(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45160p(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m45825d0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45167w(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m45826e0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45141Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m45826e0(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45169y(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45162r(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.m45806K(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.C8180l.m45154j(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.q0 r6 = r0.f35187q
            java.lang.Object r7 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            java.lang.Object r9 = r15.m45853v(r4)
            int r6 = r6.mo27228f(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m45808M(r1, r9)
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8209p1.m45529j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45539t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45537r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45528i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45526g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45523e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45542w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45517b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45526g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45528i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45531l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45544y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45533n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45526g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C8209p1.m45528i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f35179i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.C8180l.m45138V(r8)
            int r8 = com.google.protobuf.C8180l.m45140X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45538s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45536q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45527h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45525f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45521d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45541v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45519c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m45808M(r1, r9)
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8209p1.m45535p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45540u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45515a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45525f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45527h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45530k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45543x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45532m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45525f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m45808M(r1, r9)
            int r6 = com.google.protobuf.C8209p1.m45527h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.v0 r6 = (com.google.protobuf.C8243v0) r6
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8180l.m45164t(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C8268z1.m45982E(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45134R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8268z1.m45980C(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45132P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45130N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45128L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8268z1.m45980C(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45156l(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8268z1.m45980C(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45139W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            int r6 = com.google.protobuf.C8180l.m45151h(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            com.google.protobuf.n1 r7 = r15.m45855w(r4)
            int r6 = com.google.protobuf.C8209p1.m45534o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C8268z1.m45984G(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C8153i
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.i r6 = (com.google.protobuf.C8153i) r6
            int r6 = com.google.protobuf.C8180l.m45151h(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.C8180l.m45136T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45146e(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45158n(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45160p(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8268z1.m45980C(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45167w(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C8268z1.m45982E(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45141Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C8268z1.m45982E(r1, r9)
            int r6 = com.google.protobuf.C8180l.m45169y(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C8180l.m45162r(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.m45797D(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.C8180l.m45154j(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.v1<?, ?> r2 = r0.f35185o
            int r1 = r15.m45791A(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45861z(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45862z0(T r18, com.google.protobuf.C8116c2 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f35176f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.r<?> r3 = r0.f35186p
            com.google.protobuf.v r3 = r3.mo27278c(r1)
            boolean r5 = r3.mo27304n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo27307t()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f35171a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f35170s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048f
            int r13 = r0.m45860y0(r10)
            int r14 = r0.m45820Y(r10)
            int r15 = m45858x0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f35171a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0052
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0052:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.protobuf.r<?> r9 = r0.f35186p
            int r9 = r9.mo27276a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.protobuf.r<?> r9 = r0.f35186p
            r9.mo27285j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            long r8 = m45821Z(r13)
            switch(r15) {
                case 0: goto L_0x047d;
                case 1: goto L_0x0471;
                case 2: goto L_0x0465;
                case 3: goto L_0x0459;
                case 4: goto L_0x044d;
                case 5: goto L_0x0441;
                case 6: goto L_0x0435;
                case 7: goto L_0x0429;
                case 8: goto L_0x041d;
                case 9: goto L_0x040c;
                case 10: goto L_0x03fd;
                case 11: goto L_0x03f0;
                case 12: goto L_0x03e3;
                case 13: goto L_0x03d6;
                case 14: goto L_0x03c9;
                case 15: goto L_0x03bc;
                case 16: goto L_0x03af;
                case 17: goto L_0x039e;
                case 18: goto L_0x038e;
                case 19: goto L_0x037e;
                case 20: goto L_0x036e;
                case 21: goto L_0x035e;
                case 22: goto L_0x034e;
                case 23: goto L_0x033e;
                case 24: goto L_0x032e;
                case 25: goto L_0x031e;
                case 26: goto L_0x030f;
                case 27: goto L_0x02fc;
                case 28: goto L_0x02ed;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02cd;
                case 31: goto L_0x02bd;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029d;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r13 = 0
            goto L_0x0488
        L_0x0081:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.m45855w(r10)
            r2.mo26864s(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m45826e0(r1, r8)
            r2.mo26836F(r14, r8)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26844N(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m45826e0(r1, r8)
            r2.mo26871z(r14, r8)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26865t(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26840J(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26849d(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.i r4 = (com.google.protobuf.C8153i) r4
            r2.mo26867v(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.m45855w(r10)
            r2.mo26855j(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m45798D0(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = m45822a0(r1, r8)
            r2.mo26863r(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26851f(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m45826e0(r1, r8)
            r2.mo26856k(r14, r8)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = m45825d0(r1, r8)
            r2.mo26868w(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m45826e0(r1, r8)
            r2.mo26860o(r14, r8)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = m45826e0(r1, r8)
            r2.mo26862q(r14, r8)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = m45824c0(r1, r8)
            r2.mo26837G(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.m45806K(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r8 = m45823b0(r1, r8)
            r2.mo26852g(r14, r8)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m45796C0(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1 r9 = r0.m45855w(r10)
            com.google.protobuf.C8209p1.m45509U(r4, r8, r2, r9)
            goto L_0x007e
        L_0x01ad:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.C8209p1.m45518b0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bd:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45516a0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01cd:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45514Z(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01dd:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45513Y(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01ed:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45505Q(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01fd:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45522d0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x020d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45502N(r4, r8, r2, r13)
            goto L_0x007e
        L_0x021d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45506R(r4, r8, r2, r13)
            goto L_0x007e
        L_0x022d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45507S(r4, r8, r2, r13)
            goto L_0x007e
        L_0x023d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45510V(r4, r8, r2, r13)
            goto L_0x007e
        L_0x024d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45524e0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x025d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45511W(r4, r8, r2, r13)
            goto L_0x007e
        L_0x026d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45508T(r4, r8, r2, r13)
            goto L_0x007e
        L_0x027d:
            r13 = 1
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45504P(r4, r8, r2, r13)
            goto L_0x007e
        L_0x028d:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C8209p1.m45518b0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x029d:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45516a0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ad:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45514Z(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02bd:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45513Y(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02cd:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45505Q(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02dd:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45522d0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ed:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45503O(r4, r8, r2)
            goto L_0x007e
        L_0x02fc:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1 r9 = r0.m45855w(r10)
            com.google.protobuf.C8209p1.m45512X(r4, r8, r2, r9)
            goto L_0x007e
        L_0x030f:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45520c0(r4, r8, r2)
            goto L_0x007e
        L_0x031e:
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C8209p1.m45502N(r4, r8, r2, r13)
            goto L_0x0488
        L_0x032e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45506R(r4, r8, r2, r13)
            goto L_0x0488
        L_0x033e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45507S(r4, r8, r2, r13)
            goto L_0x0488
        L_0x034e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45510V(r4, r8, r2, r13)
            goto L_0x0488
        L_0x035e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45524e0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x036e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45511W(r4, r8, r2, r13)
            goto L_0x0488
        L_0x037e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45508T(r4, r8, r2, r13)
            goto L_0x0488
        L_0x038e:
            r13 = 0
            int r4 = r0.m45820Y(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C8209p1.m45504P(r4, r8, r2, r13)
            goto L_0x0488
        L_0x039e:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.m45855w(r10)
            r2.mo26864s(r14, r4, r8)
            goto L_0x0488
        L_0x03af:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo26836F(r14, r8)
            goto L_0x0488
        L_0x03bc:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26844N(r14, r4)
            goto L_0x0488
        L_0x03c9:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo26871z(r14, r8)
            goto L_0x0488
        L_0x03d6:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26865t(r14, r4)
            goto L_0x0488
        L_0x03e3:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26840J(r14, r4)
            goto L_0x0488
        L_0x03f0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26849d(r14, r4)
            goto L_0x0488
        L_0x03fd:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.i r4 = (com.google.protobuf.C8153i) r4
            r2.mo26867v(r14, r4)
            goto L_0x0488
        L_0x040c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.n1 r8 = r0.m45855w(r10)
            r2.mo26855j(r14, r4, r8)
            goto L_0x0488
        L_0x041d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m45798D0(r14, r4, r2)
            goto L_0x0488
        L_0x0429:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            boolean r4 = m45833l(r1, r8)
            r2.mo26863r(r14, r4)
            goto L_0x0488
        L_0x0435:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26851f(r14, r4)
            goto L_0x0488
        L_0x0441:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo26856k(r14, r8)
            goto L_0x0488
        L_0x044d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.mo26868w(r14, r4)
            goto L_0x0488
        L_0x0459:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo26860o(r14, r8)
            goto L_0x0488
        L_0x0465:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.mo26862q(r14, r8)
            goto L_0x0488
        L_0x0471:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            float r4 = m45849t(r1, r8)
            r2.mo26837G(r14, r4)
            goto L_0x0488
        L_0x047d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            double r8 = m45841p(r1, r8)
            r2.mo26852g(r14, r8)
        L_0x0488:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048f:
            if (r5 == 0) goto L_0x04a6
            com.google.protobuf.r<?> r4 = r0.f35186p
            r4.mo27285j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a4
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048f
        L_0x04a4:
            r5 = 0
            goto L_0x048f
        L_0x04a6:
            com.google.protobuf.v1<?, ?> r3 = r0.f35185o
            r0.m45800E0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.m45862z0(java.lang.Object, com.google.protobuf.c2):void");
    }

    /* renamed from: a */
    public void mo27197a(T t, T t2) {
        m45835m(t);
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f35171a.length; i += 3) {
            m45814S(t, t2, i);
        }
        C8209p1.m45495G(this.f35185o, t, t2);
        if (this.f35176f) {
            C8209p1.m45493E(this.f35186p, t, t2);
        }
    }

    /* renamed from: b */
    public void mo27198b(T t, C8116c2 c2Var) throws IOException {
        if (c2Var.mo26857l() == C8116c2.C8117a.DESCENDING) {
            m45794B0(t, c2Var);
        } else if (this.f35178h) {
            m45792A0(t, c2Var);
        } else {
            m45862z0(t, c2Var);
        }
    }

    /* renamed from: c */
    public void mo27199c(T t) {
        if (m45804I(t)) {
            if (t instanceof C8260z) {
                C8260z zVar = (C8260z) t;
                zVar.mo27428t();
                zVar.mo27427s();
                zVar.mo27419L();
            }
            int length = this.f35171a.length;
            for (int i = 0; i < length; i += 3) {
                int y0 = m45860y0(i);
                long Z = m45821Z(y0);
                int x0 = m45858x0(y0);
                if (x0 != 9) {
                    switch (x0) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                        case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f35184n.mo27153c(t, Z);
                            continue;
                        case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                            Unsafe unsafe = f35170s;
                            Object object = unsafe.getObject(t, Z);
                            if (object != null) {
                                unsafe.putObject(t, Z, this.f35187q.mo27224b(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (m45797D(t, i)) {
                    m45855w(i).mo27199c(f35170s.getObject(t, Z));
                }
            }
            this.f35185o.mo27334j(t);
            if (this.f35176f) {
                this.f35186p.mo27281f(t);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo27200d(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f35181k) {
            int i6 = this.f35180j[i5];
            int Y = m45820Y(i6);
            int y0 = m45860y0(i6);
            int i7 = this.f35171a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f35170s.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m45807L(y0) && !m45799E(t, i6, i2, i, i9)) {
                return false;
            }
            int x0 = m45858x0(y0);
            if (x0 != 9 && x0 != 17) {
                if (x0 != 27) {
                    if (x0 == 60 || x0 == 68) {
                        if (m45806K(t2, Y, i6) && !m45801F(t2, y0, m45855w(i6))) {
                            return false;
                        }
                    } else if (x0 != 49) {
                        if (x0 == 50 && !m45803H(t2, y0, i6)) {
                            return false;
                        }
                    }
                }
                if (!m45802G(t2, y0, i6)) {
                    return false;
                }
            } else if (m45799E(t, i6, i2, i, i9) && !m45801F(t2, y0, m45855w(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return !this.f35176f || this.f35186p.mo27278c(t2).mo27306p();
    }

    /* renamed from: e */
    public void mo27201e(T t, C8190l1 l1Var, C8210q qVar) throws IOException {
        Objects.requireNonNull(qVar);
        m45835m(t);
        m45810O(this.f35185o, this.f35186p, t, l1Var, qVar);
    }

    /* renamed from: f */
    public void mo27202f(T t, byte[] bArr, int i, int i2, C8139f.C8141b bVar) throws IOException {
        if (this.f35178h) {
            m45829i0(t, bArr, i, i2, bVar);
        } else {
            mo27391h0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: g */
    public boolean mo27203g(T t, T t2) {
        int length = this.f35171a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m45843q(t, t2, i)) {
                return false;
            }
        }
        if (!this.f35185o.mo27331g(t).equals(this.f35185o.mo27331g(t2))) {
            return false;
        }
        if (this.f35176f) {
            return this.f35186p.mo27278c(t).equals(this.f35186p.mo27278c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public int mo27204h(T t) {
        return this.f35178h ? m45861z(t) : m45859y(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.protobuf.w1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0333, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0376, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0397, code lost:
        if (r0 != r15) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x039a, code lost:
        r8 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x025c, code lost:
        r5 = r11 | r17;
        r11 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0278, code lost:
        r0 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0294, code lost:
        r5 = r11 | r17;
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0298, code lost:
        r2 = r8;
        r3 = r12;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x029c, code lost:
        r12 = r6;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a1, code lost:
        r17 = r29;
        r2 = r3;
        r20 = r8;
        r25 = r10;
        r19 = r11;
        r9 = r12;
        r8 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo27391h0(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.C8139f.C8141b r32) throws java.io.IOException {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            m45835m(r27)
            sun.misc.Unsafe r10 = f35170s
            r16 = 0
            r0 = r29
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            if (r0 >= r13) goto L_0x03f5
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.protobuf.C8139f.m44707H(r0, r12, r3, r9)
            int r3 = r9.f34872a
            r4 = r3
            r3 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x003b
            int r2 = r2 / r8
            int r1 = r15.m45834l0(r0, r2)
            goto L_0x003f
        L_0x003b:
            int r1 = r15.m45832k0(r0)
        L_0x003f:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0054
            r22 = r0
            r2 = r3
            r9 = r4
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r18 = -1
            r20 = 0
            goto L_0x039e
        L_0x0054:
            int[] r1 = r15.f35171a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r8 = m45858x0(r1)
            long r11 = m45821Z(r1)
            r19 = r4
            r4 = 17
            r20 = r11
            if (r8 > r4) goto L_0x02af
            int[] r4 = r15.f35171a
            int r12 = r2 + 2
            r4 = r4[r12]
            int r12 = r4 >>> 20
            r11 = 1
            int r12 = r11 << r12
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r11
            r17 = r12
            if (r4 == r6) goto L_0x008b
            if (r6 == r11) goto L_0x0083
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0083:
            long r5 = (long) r4
            int r5 = r10.getInt(r14, r5)
            r12 = r4
            r11 = r5
            goto L_0x008d
        L_0x008b:
            r11 = r5
            r12 = r6
        L_0x008d:
            r4 = 5
            switch(r8) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0262;
                case 2: goto L_0x023c;
                case 3: goto L_0x023c;
                case 4: goto L_0x0222;
                case 5: goto L_0x01ff;
                case 6: goto L_0x01e7;
                case 7: goto L_0x01c4;
                case 8: goto L_0x019f;
                case 9: goto L_0x0179;
                case 10: goto L_0x015e;
                case 11: goto L_0x0222;
                case 12: goto L_0x0122;
                case 13: goto L_0x01e7;
                case 14: goto L_0x01ff;
                case 15: goto L_0x0104;
                case 16: goto L_0x00e0;
                case 17: goto L_0x009e;
                default: goto L_0x0091;
            }
        L_0x0091:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            goto L_0x02a1
        L_0x009e:
            r5 = 3
            if (r7 != r5) goto L_0x00d3
            java.lang.Object r7 = r15.m45815T(r14, r2)
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.protobuf.n1 r1 = r15.m45855w(r2)
            r22 = r0
            r0 = r7
            r18 = -1
            r8 = r2
            r2 = r28
            r6 = r19
            r4 = r30
            r29 = r12
            r12 = r6
            r6 = r32
            int r0 = com.google.protobuf.C8139f.m44713N(r0, r1, r2, r3, r4, r5, r6)
            r15.m45854v0(r14, r8, r7)
            r5 = r11 | r17
            r6 = r29
            r11 = r31
            r2 = r8
            r3 = r12
            r1 = r22
            r12 = r28
            goto L_0x001c
        L_0x00d3:
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            r6 = r28
            goto L_0x02a1
        L_0x00e0:
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            r6 = r28
            if (r7 != 0) goto L_0x02a1
            r4 = r20
            int r7 = com.google.protobuf.C8139f.m44711L(r6, r3, r9)
            long r0 = r9.f34873b
            long r19 = com.google.protobuf.C8167j.m44840c(r0)
            r0 = r10
            r1 = r27
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x025c
        L_0x0104:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44708I(r6, r3, r9)
            int r1 = r9.f34872a
            int r1 = com.google.protobuf.C8167j.m44839b(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x0122:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44708I(r6, r3, r9)
            int r1 = r9.f34872a
            com.google.protobuf.d0$e r2 = r15.m45851u(r8)
            if (r2 == 0) goto L_0x0159
            boolean r2 = r2.mo26874a(r1)
            if (r2 == 0) goto L_0x0144
            goto L_0x0159
        L_0x0144:
            com.google.protobuf.w1 r2 = m45857x(r27)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo27356n(r12, r1)
            r2 = r8
            r5 = r11
            r3 = r12
            r1 = r22
            r11 = r31
            goto L_0x029c
        L_0x0159:
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x015e:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44717b(r6, r3, r9)
            java.lang.Object r1 = r9.f34874c
            r10.putObject(r14, r4, r1)
            goto L_0x0294
        L_0x0179:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            java.lang.Object r7 = r15.m45815T(r14, r8)
            com.google.protobuf.n1 r1 = r15.m45855w(r8)
            r0 = r7
            r2 = r28
            r4 = r30
            r5 = r32
            int r0 = com.google.protobuf.C8139f.m44714O(r0, r1, r2, r3, r4, r5)
            r15.m45854v0(r14, r8, r7)
            goto L_0x0294
        L_0x019f:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x01b9
            int r0 = com.google.protobuf.C8139f.m44702C(r6, r3, r9)
            goto L_0x01bd
        L_0x01b9:
            int r0 = com.google.protobuf.C8139f.m44705F(r6, r3, r9)
        L_0x01bd:
            java.lang.Object r1 = r9.f34874c
            r10.putObject(r14, r4, r1)
            goto L_0x0294
        L_0x01c4:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44711L(r6, r3, r9)
            long r1 = r9.f34873b
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x01e1
            r1 = 1
            goto L_0x01e2
        L_0x01e1:
            r1 = 0
        L_0x01e2:
            com.google.protobuf.C8268z1.m45989L(r14, r4, r1)
            goto L_0x0294
        L_0x01e7:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r18 = -1
            if (r7 != r4) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44723h(r6, r3)
            r10.putInt(r14, r1, r0)
            goto L_0x0278
        L_0x01ff:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r1 = r20
            r0 = 1
            r18 = -1
            if (r7 != r0) goto L_0x02a1
            long r4 = com.google.protobuf.C8139f.m44725j(r6, r3)
            r0 = r10
            r20 = r1
            r1 = r27
            r7 = r3
            r2 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0294
        L_0x0222:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.protobuf.C8139f.m44708I(r6, r3, r9)
            int r1 = r9.f34872a
            r4 = r20
            r10.putInt(r14, r4, r1)
            goto L_0x0294
        L_0x023c:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r4 = r20
            r18 = -1
            if (r7 != 0) goto L_0x02a1
            int r7 = com.google.protobuf.C8139f.m44711L(r6, r3, r9)
            long r2 = r9.f34873b
            r0 = r10
            r1 = r27
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x025c:
            r5 = r11 | r17
            r11 = r31
            r0 = r7
            goto L_0x0298
        L_0x0262:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r18 = -1
            if (r7 != r4) goto L_0x02a1
            float r2 = com.google.protobuf.C8139f.m44727l(r6, r3)
            com.google.protobuf.C8268z1.m45996S(r14, r0, r2)
        L_0x0278:
            int r0 = r3 + 4
            goto L_0x0294
        L_0x027b:
            r6 = r28
            r22 = r0
            r8 = r2
            r29 = r12
            r12 = r19
            r0 = r20
            r2 = 1
            r18 = -1
            if (r7 != r2) goto L_0x02a1
            double r4 = com.google.protobuf.C8139f.m44719d(r6, r3)
            com.google.protobuf.C8268z1.m45995R(r14, r0, r4)
            int r0 = r3 + 8
        L_0x0294:
            r5 = r11 | r17
            r11 = r31
        L_0x0298:
            r2 = r8
            r3 = r12
            r1 = r22
        L_0x029c:
            r12 = r6
            r6 = r29
            goto L_0x001c
        L_0x02a1:
            r17 = r29
            r2 = r3
            r20 = r8
            r25 = r10
            r19 = r11
            r9 = r12
            r8 = r31
            goto L_0x039e
        L_0x02af:
            r22 = r0
            r11 = r2
            r17 = r6
            r12 = r19
            r18 = -1
            r19 = r5
            r5 = r20
            r0 = 27
            if (r8 != r0) goto L_0x0308
            r0 = 2
            if (r7 != r0) goto L_0x02ff
            java.lang.Object r0 = r10.getObject(r14, r5)
            com.google.protobuf.d0$j r0 = (com.google.protobuf.C8119d0.C8130j) r0
            boolean r1 = r0.mo26802F1()
            if (r1 != 0) goto L_0x02e1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d8
            r1 = 10
            goto L_0x02da
        L_0x02d8:
            int r1 = r1 * 2
        L_0x02da:
            com.google.protobuf.d0$j r0 = r0.mo26823m(r1)
            r10.putObject(r14, r5, r0)
        L_0x02e1:
            r5 = r0
            com.google.protobuf.n1 r0 = r15.m45855w(r11)
            r1 = r12
            r2 = r28
            r4 = r30
            r6 = r32
            int r0 = com.google.protobuf.C8139f.m44732q(r0, r1, r2, r3, r4, r5, r6)
            r2 = r11
            r3 = r12
            r6 = r17
            r5 = r19
            r1 = r22
            r12 = r28
            r11 = r31
            goto L_0x001c
        L_0x02ff:
            r15 = r3
            r25 = r10
            r20 = r11
            r21 = r12
            goto L_0x0379
        L_0x0308:
            r0 = 49
            if (r8 > r0) goto L_0x034f
            long r1 = (long) r1
            r0 = r26
            r20 = r1
            r1 = r27
            r2 = r28
            r4 = r3
            r15 = r4
            r4 = r30
            r23 = r5
            r5 = r12
            r6 = r22
            r29 = r8
            r8 = r11
            r25 = r10
            r9 = r20
            r20 = r11
            r11 = r29
            r21 = r12
            r12 = r23
            r14 = r32
            int r0 = r0.m45830j0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039a
        L_0x0335:
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            r6 = r17
            r5 = r19
            r2 = r20
            r3 = r21
            r1 = r22
            r10 = r25
            goto L_0x001c
        L_0x034f:
            r15 = r3
            r23 = r5
            r29 = r8
            r25 = r10
            r20 = r11
            r21 = r12
            r0 = 50
            r9 = r29
            if (r9 != r0) goto L_0x037f
            r0 = 2
            if (r7 != r0) goto L_0x0379
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r20
            r6 = r23
            r8 = r32
            int r0 = r0.m45827f0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x039a
            goto L_0x0335
        L_0x0379:
            r8 = r31
            r2 = r15
        L_0x037c:
            r9 = r21
            goto L_0x039e
        L_0x037f:
            r0 = r26
            r8 = r1
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r21
            r6 = r22
            r10 = r23
            r12 = r20
            r13 = r32
            int r0 = r0.m45828g0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039a
            goto L_0x0335
        L_0x039a:
            r8 = r31
            r2 = r0
            goto L_0x037c
        L_0x039e:
            if (r9 != r8) goto L_0x03ae
            if (r8 == 0) goto L_0x03ae
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r26
            r6 = r2
            r0 = r17
            r5 = r19
            goto L_0x0404
        L_0x03ae:
            r10 = r26
            boolean r0 = r10.f35176f
            r11 = r32
            if (r0 == 0) goto L_0x03d0
            com.google.protobuf.q r0 = r11.f34875d
            com.google.protobuf.q r1 = com.google.protobuf.C8210q.m45546b()
            if (r0 == r1) goto L_0x03d0
            com.google.protobuf.v0 r5 = r10.f35175e
            com.google.protobuf.v1<?, ?> r6 = r10.f35185o
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r7 = r32
            int r0 = com.google.protobuf.C8139f.m44722g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x03df
        L_0x03d0:
            com.google.protobuf.w1 r4 = m45857x(r27)
            r0 = r9
            r1 = r28
            r3 = r30
            r5 = r32
            int r0 = com.google.protobuf.C8139f.m44706G(r0, r1, r2, r3, r4, r5)
        L_0x03df:
            r14 = r27
            r12 = r28
            r13 = r30
            r3 = r9
            r15 = r10
            r9 = r11
            r6 = r17
            r5 = r19
            r2 = r20
            r1 = r22
            r10 = r25
            r11 = r8
            goto L_0x001c
        L_0x03f5:
            r19 = r5
            r17 = r6
            r25 = r10
            r8 = r11
            r10 = r15
            r6 = r0
            r9 = r3
            r0 = r17
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0404:
            if (r0 == r1) goto L_0x040f
            long r0 = (long) r0
            r7 = r27
            r2 = r25
            r2.putInt(r7, r0, r5)
            goto L_0x0411
        L_0x040f:
            r7 = r27
        L_0x0411:
            r0 = 0
            int r1 = r10.f35181k
            r3 = r0
            r11 = r1
        L_0x0416:
            int r0 = r10.f35182l
            if (r11 >= r0) goto L_0x0430
            int[] r0 = r10.f35180j
            r2 = r0[r11]
            com.google.protobuf.v1<?, ?> r4 = r10.f35185o
            r0 = r26
            r1 = r27
            r5 = r27
            java.lang.Object r0 = r0.m45845r(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.protobuf.w1 r3 = (com.google.protobuf.C8250w1) r3
            int r11 = r11 + 1
            goto L_0x0416
        L_0x0430:
            if (r3 == 0) goto L_0x0437
            com.google.protobuf.v1<?, ?> r0 = r10.f35185o
            r0.mo27339o(r7, r3)
        L_0x0437:
            if (r8 != 0) goto L_0x0443
            r0 = r30
            if (r6 != r0) goto L_0x043e
            goto L_0x0449
        L_0x043e:
            com.google.protobuf.e0 r0 = com.google.protobuf.C8135e0.m44689h()
            throw r0
        L_0x0443:
            r0 = r30
            if (r6 > r0) goto L_0x044a
            if (r9 != r8) goto L_0x044a
        L_0x0449:
            return r6
        L_0x044a:
            com.google.protobuf.e0 r0 = com.google.protobuf.C8135e0.m44689h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.mo27391h0(java.lang.Object, byte[], int, int, int, com.google.protobuf.f$b):int");
    }

    /* renamed from: i */
    public T mo27205i() {
        return this.f35183m.mo26783a(this.f35175e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo27206j(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f35171a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m45860y0(r1)
            int r4 = r8.m45820Y(r1)
            long r5 = m45821Z(r3)
            int r3 = m45858x0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m45826e0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m45826e0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m45822a0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44651c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m45826e0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m45825d0(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m45826e0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m45826e0(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m45824c0(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m45806K(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m45823b0(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C8268z1.m45982E(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C8268z1.m45982E(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C8268z1.m45984G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C8268z1.m46021t(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44651c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C8268z1.m45982E(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C8268z1.m45980C(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C8268z1.m45982E(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C8268z1.m45982E(r9, r5)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C8268z1.m45979B(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C8268z1.m45978A(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C8119d0.m44654f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.v1<?, ?> r0 = r8.f35185o
            java.lang.Object r0 = r0.mo27331g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f35176f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.r<?> r0 = r8.f35186p
            com.google.protobuf.v r9 = r0.mo27278c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8255y0.mo27206j(java.lang.Object):int");
    }
}
