package com.google.android.gms.internal.measurement;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.qa */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7140qa<T> implements C7268ya<T> {

    /* renamed from: p */
    private static final int[] f31977p = new int[0];

    /* renamed from: q */
    private static final Unsafe f31978q = C6879ac.m39546l();

    /* renamed from: a */
    private final int[] f31979a;

    /* renamed from: b */
    private final Object[] f31980b;

    /* renamed from: c */
    private final int f31981c;

    /* renamed from: d */
    private final int f31982d;

    /* renamed from: e */
    private final C7092na f31983e;

    /* renamed from: f */
    private final boolean f31984f;

    /* renamed from: g */
    private final boolean f31985g;

    /* renamed from: h */
    private final int[] f31986h;

    /* renamed from: i */
    private final int f31987i;

    /* renamed from: j */
    private final int f31988j;

    /* renamed from: k */
    private final C6894ba f31989k;

    /* renamed from: l */
    private final C7141qb f31990l;

    /* renamed from: m */
    private final C7202u8 f31991m;

    /* renamed from: n */
    private final C7172sa f31992n;

    /* renamed from: o */
    private final C7012ia f31993o;

    private C7140qa(int[] iArr, Object[] objArr, int i, int i2, C7092na naVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C7172sa saVar, C6894ba baVar, C7141qb qbVar, C7202u8 u8Var, C7012ia iaVar, byte[] bArr) {
        C7092na naVar2 = naVar;
        C7202u8 u8Var2 = u8Var;
        this.f31979a = iArr;
        this.f31980b = objArr;
        this.f31981c = i;
        this.f31982d = i2;
        this.f31985g = z;
        boolean z3 = false;
        if (u8Var2 != null && u8Var2.mo23930c(naVar)) {
            z3 = true;
        }
        this.f31984f = z3;
        this.f31986h = iArr2;
        this.f31987i = i3;
        this.f31988j = i4;
        this.f31992n = saVar;
        this.f31989k = baVar;
        this.f31990l = qbVar;
        this.f31991m = u8Var2;
        this.f31983e = naVar2;
        this.f31993o = iaVar;
    }

    /* renamed from: A */
    private final void m40668A(C7030jc jcVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C6979ga gaVar = (C6979ga) m40698o(i2);
            throw null;
        }
    }

    /* renamed from: B */
    private final boolean m40669B(Object obj, Object obj2, int i) {
        return m40670C(obj, i) == m40670C(obj2, i);
    }

    /* renamed from: C */
    private final boolean m40670C(Object obj, int i) {
        int Y = m40691Y(i);
        long j = (long) (Y & 1048575);
        if (j != 1048575) {
            return (C6879ac.m39542h(obj, j) & (1 << (Y >>> 20))) != 0;
        }
        int k = m40694k(i);
        long j2 = (long) (k & 1048575);
        switch (m40693j(k)) {
            case 0:
                return Double.doubleToRawLongBits(C6879ac.m39540f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C6879ac.m39541g(obj, j2)) != 0;
            case 2:
                return C6879ac.m39543i(obj, j2) != 0;
            case 3:
                return C6879ac.m39543i(obj, j2) != 0;
            case 4:
                return C6879ac.m39542h(obj, j2) != 0;
            case 5:
                return C6879ac.m39543i(obj, j2) != 0;
            case 6:
                return C6879ac.m39542h(obj, j2) != 0;
            case 7:
                return C6879ac.m39531B(obj, j2);
            case 8:
                Object k2 = C6879ac.m39545k(obj, j2);
                if (k2 instanceof String) {
                    return !((String) k2).isEmpty();
                }
                if (k2 instanceof C6977g8) {
                    return !C6977g8.f31702b.equals(k2);
                }
                throw new IllegalArgumentException();
            case 9:
                return C6879ac.m39545k(obj, j2) != null;
            case 10:
                return !C6977g8.f31702b.equals(C6879ac.m39545k(obj, j2));
            case 11:
                return C6879ac.m39542h(obj, j2) != 0;
            case 12:
                return C6879ac.m39542h(obj, j2) != 0;
            case 13:
                return C6879ac.m39542h(obj, j2) != 0;
            case 14:
                return C6879ac.m39543i(obj, j2) != 0;
            case 15:
                return C6879ac.m39542h(obj, j2) != 0;
            case 16:
                return C6879ac.m39543i(obj, j2) != 0;
            case 17:
                return C6879ac.m39545k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: D */
    private final boolean m40671D(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m40670C(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: E */
    private static boolean m40672E(Object obj, int i, C7268ya yaVar) {
        return yaVar.mo23785d(C6879ac.m39545k(obj, (long) (i & 1048575)));
    }

    /* renamed from: F */
    private static boolean m40673F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C6995h9) {
            return ((C6995h9) obj).mo23498w();
        }
        return true;
    }

    /* renamed from: G */
    private final boolean m40674G(Object obj, int i, int i2) {
        return C6879ac.m39542h(obj, (long) (m40691Y(i2) & 1048575)) == i;
    }

    /* renamed from: H */
    private static boolean m40675H(Object obj, long j) {
        return ((Boolean) C6879ac.m39545k(obj, j)).booleanValue();
    }

    /* renamed from: I */
    private static final void m40676I(int i, Object obj, C7030jc jcVar) throws IOException {
        if (obj instanceof String) {
            jcVar.mo23580m(i, (String) obj);
        } else {
            jcVar.mo23587t(i, (C6977g8) obj);
        }
    }

    /* renamed from: K */
    static C7157rb m40677K(Object obj) {
        C6995h9 h9Var = (C6995h9) obj;
        C7157rb rbVar = h9Var.zzc;
        if (rbVar != C7157rb.m40813c()) {
            return rbVar;
        }
        C7157rb f = C7157rb.m40815f();
        h9Var.zzc = f;
        return f;
    }

    /* renamed from: L */
    static C7140qa m40678L(Class cls, C7044ka kaVar, C7172sa saVar, C6894ba baVar, C7141qb qbVar, C7202u8 u8Var, C7012ia iaVar) {
        if (kaVar instanceof C7252xa) {
            return m40679M((C7252xa) kaVar, saVar, baVar, qbVar, u8Var, iaVar);
        }
        C7093nb nbVar = (C7093nb) kaVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.measurement.C7140qa m40679M(com.google.android.gms.internal.measurement.C7252xa r34, com.google.android.gms.internal.measurement.C7172sa r35, com.google.android.gms.internal.measurement.C6894ba r36, com.google.android.gms.internal.measurement.C7141qb r37, com.google.android.gms.internal.measurement.C7202u8 r38, com.google.android.gms.internal.measurement.C7012ia r39) {
        /*
            int r0 = r34.mo23610e()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo23992a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f31977p
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f31978q
            java.lang.Object[] r17 = r34.mo23993b()
            com.google.android.gms.internal.measurement.na r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m40701r(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m40701r(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m40701r(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m40701r(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.measurement.qa r0 = new com.google.android.gms.internal.measurement.qa
            r4 = r0
            com.google.android.gms.internal.measurement.na r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.m40679M(com.google.android.gms.internal.measurement.xa, com.google.android.gms.internal.measurement.sa, com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.qb, com.google.android.gms.internal.measurement.u8, com.google.android.gms.internal.measurement.ia):com.google.android.gms.internal.measurement.qa");
    }

    /* renamed from: N */
    private static double m40680N(Object obj, long j) {
        return ((Double) C6879ac.m39545k(obj, j)).doubleValue();
    }

    /* renamed from: O */
    private static float m40681O(Object obj, long j) {
        return ((Float) C6879ac.m39545k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030d, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030e, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054e, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40682P(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f31978q
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f31979a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r0.m40694k(r5)
            int[] r10 = r0.f31979a
            r11 = r10[r5]
            int r12 = m40693j(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x0341;
                case 31: goto L_0x0335;
                case 32: goto L_0x0329;
                case 33: goto L_0x031d;
                case 34: goto L_0x0311;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02e3;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b9;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028f;
                case 41: goto L_0x0279;
                case 42: goto L_0x0263;
                case 43: goto L_0x024d;
                case 44: goto L_0x0237;
                case 45: goto L_0x0221;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a2;
                case 53: goto L_0x018a;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0152;
                case 57: goto L_0x0145;
                case 58: goto L_0x0136;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x037e
        L_0x0042:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.na r3 = (com.google.android.gms.internal.measurement.C7092na) r3
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40507y(r11, r3, r4)
            goto L_0x037d
        L_0x0058:
            boolean r10 = r0.m40674G(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m40695l(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0074:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m40684R(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030d
        L_0x008f:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x01be
        L_0x009d:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x01ae
        L_0x00ab:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m40684R(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r3)
            goto L_0x030d
        L_0x00c1:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m40684R(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030d
        L_0x00d7:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.g8 r3 = (com.google.android.gms.internal.measurement.C6977g8) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = r3.mo23326f()
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x00f1:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030e
        L_0x00f5:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39492Q(r11, r3, r4)
            goto L_0x037d
        L_0x0109:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C6977g8
            if (r4 == 0) goto L_0x0128
            com.google.android.gms.internal.measurement.g8 r3 = (com.google.android.gms.internal.measurement.C6977g8) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = r3.mo23326f()
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x00f1
        L_0x0128:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40500C(r3)
            goto L_0x030d
        L_0x0136:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0145:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x01ae
        L_0x0152:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x01be
        L_0x015f:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m40684R(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r3)
            goto L_0x030d
        L_0x0175:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m40695l(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r9)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
            goto L_0x019e
        L_0x018a:
            boolean r9 = r0.m40674G(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m40695l(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r9)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
        L_0x019e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x01a2:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x01ae:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01b2:
            boolean r3 = r0.m40674G(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x01be:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m40698o(r5)
            com.google.android.gms.internal.measurement.C7012ia.m40210a(r11, r3, r4)
            goto L_0x037e
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39487L(r11, r3, r4)
            goto L_0x037d
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39497V(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39495T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x020b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x0221:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x0237:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39482G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39500Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x0263:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39479D(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x02a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39489N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x02b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39503a0(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39491P(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x02e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x030c
        L_0x02f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r11)
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x030c:
            int r4 = r4 + r9
        L_0x030d:
            int r4 = r4 + r3
        L_0x030e:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39496U(r11, r3, r9)
            goto L_0x037d
        L_0x031d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39494S(r11, r3, r9)
            goto L_0x037d
        L_0x0329:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r11, r3, r9)
            goto L_0x037d
        L_0x0335:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r11, r3, r9)
            goto L_0x037d
        L_0x0341:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39481F(r11, r3, r9)
            goto L_0x037d
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39499X(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39480E(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39493R(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39498W(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39476A(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39488M(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39501Z(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39490O(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.na r3 = (com.google.android.gms.internal.measurement.C7092na) r3
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40507y(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.g8 r3 = (com.google.android.gms.internal.measurement.C6977g8) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = r3.mo23326f()
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.ya r4 = r0.m40697n(r5)
            int r3 = com.google.android.gms.internal.measurement.C6878ab.m39492Q(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.C6977g8
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.measurement.g8 r3 = (com.google.android.gms.internal.measurement.C6977g8) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = r3.mo23326f()
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40500C(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r9)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r9)
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0555:
            com.google.android.gms.internal.measurement.qb r2 = r0.f31990l
            java.lang.Object r3 = r2.mo23794d(r1)
            int r2 = r2.mo23791a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f31984f
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.measurement.u8 r2 = r0.f31991m
            r2.mo23928a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.m40682P(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40683Q(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f31978q
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f31979a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m40694k(r2)
            int r5 = m40693j(r4)
            int[] r6 = r11.f31979a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.z8 r4 = com.google.android.gms.internal.measurement.C7282z8.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.z8 r4 = com.google.android.gms.internal.measurement.C7282z8.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f31979a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.na r4 = (com.google.android.gms.internal.measurement.C7092na) r4
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40507y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m40674G(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m40695l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m40684R(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m40684R(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m40684R(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.g8 r4 = (com.google.android.gms.internal.measurement.C6977g8) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = r4.mo23326f()
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39492Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C6977g8
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.g8 r4 = (com.google.android.gms.internal.measurement.C6977g8) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = r4.mo23326f()
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40500C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m40684R(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m40695l(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r6)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m40695l(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r6)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m40674G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.lang.Object r5 = r11.m40698o(r2)
            com.google.android.gms.internal.measurement.C7012ia.m40210a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39487L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39497V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39495T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39482G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39500Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39479D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39489N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39503a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39491P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39484I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39486K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40501D(r6)
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39496U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39494S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39481F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39499X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39480E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39493R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39498W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39476A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39488M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39501Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39490O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39483H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39485J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.na r4 = (com.google.android.gms.internal.measurement.C7092na) r4
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40507y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m40670C(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.g8 r4 = (com.google.android.gms.internal.measurement.C6977g8) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = r4.mo23326f()
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            com.google.android.gms.internal.measurement.ya r5 = r11.m40697n(r2)
            int r4 = com.google.android.gms.internal.measurement.C6878ab.m39492Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C6977g8
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.g8 r4 = (com.google.android.gms.internal.measurement.C6977g8) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = r4.mo23326f()
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40500C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r5)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40508z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r6)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r6)
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40503b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m40670C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C7106o8.m40502a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.measurement.qb r0 = r11.f31990l
            java.lang.Object r12 = r0.mo23794d(r12)
            int r12 = r0.mo23791a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.m40683Q(java.lang.Object):int");
    }

    /* renamed from: R */
    private static int m40684R(Object obj, long j) {
        return ((Integer) C6879ac.m39545k(obj, j)).intValue();
    }

    /* renamed from: S */
    private final int m40685S(Object obj, byte[] bArr, int i, int i2, int i3, long j, C7169s7 s7Var) throws IOException {
        Unsafe unsafe = f31978q;
        Object o = m40698o(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C6996ha) object).mo23508f()) {
            C6996ha c = C6996ha.m40176b().mo23502c();
            C7012ia.m40211b(c, object);
            unsafe.putObject(obj, j, c);
        }
        C6979ga gaVar = (C6979ga) o;
        throw null;
    }

    /* renamed from: T */
    private final int m40686T(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C7169s7 s7Var) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C7169s7 s7Var2 = s7Var;
        Unsafe unsafe = f31978q;
        long j3 = (long) (this.f31979a[i13 + 2] & 1048575);
        switch (i7) {
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C7185t7.m40945p(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C7185t7.m40931b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                if (i12 == 0) {
                    int m = C7185t7.m40942m(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(s7Var2.f32050b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                if (i12 == 0) {
                    int j4 = C7185t7.m40939j(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(s7Var2.f32049a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorError /*56*/:
            case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C7185t7.m40945p(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C7185t7.m40931b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                if (i12 == 0) {
                    int m2 = C7185t7.m40942m(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(s7Var2.f32050b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                if (i12 == 2) {
                    int j5 = C7185t7.m40939j(bArr2, i9, s7Var2);
                    int i14 = s7Var2.f32049a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C6981gc.m40080f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, C7107o9.f31926b));
                        j5 += i14;
                    } else {
                        throw C7139q9.m40664c();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                if (i12 == 2) {
                    Object q = m40700q(obj2, i11, i13);
                    int o = C7185t7.m40944o(q, m40697n(i13), bArr, i, i2, s7Var);
                    m40708y(obj2, i11, i13, q);
                    return o;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                if (i12 == 2) {
                    int a = C7185t7.m40930a(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, s7Var2.f32051c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                if (i12 == 0) {
                    int j6 = C7185t7.m40939j(bArr2, i9, s7Var2);
                    int i15 = s7Var2.f32049a;
                    C7043k9 m3 = m40696m(i13);
                    if (m3 == null || m3.mo23350g(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m40677K(obj).mo23827j(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                if (i12 == 0) {
                    int j7 = C7185t7.m40939j(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C7042k8.m40322a(s7Var2.f32049a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j7;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                if (i12 == 0) {
                    int m4 = C7185t7.m40942m(bArr2, i9, s7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C7042k8.m40323b(s7Var2.f32050b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                if (i12 == 3) {
                    Object q2 = m40700q(obj2, i11, i13);
                    int n = C7185t7.m40943n(q2, m40697n(i13), bArr, i, i2, (i10 & -8) | 4, s7Var);
                    m40708y(obj2, i11, i13, q2);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ff, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032b, code lost:
        if (r0 != r14) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x034e, code lost:
        if (r0 != r14) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021e, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023c, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023f, code lost:
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0248, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024c, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ec, code lost:
        if (r0 != r24) goto L_0x02ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40687U(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.C7169s7 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m40702s(r31)
            sun.misc.Unsafe r9 = f31978q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x0376
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40940k(r0, r12, r3, r11)
            int r3 = r11.f32049a
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003f
            int r2 = r2 / 3
            int r0 = r15.m40690X(r5, r2)
            goto L_0x0043
        L_0x003f:
            int r0 = r15.m40689W(r5)
        L_0x0043:
            r2 = r0
            if (r2 != r10) goto L_0x0050
            r2 = r4
            r23 = r5
            r29 = r9
            r15 = 0
        L_0x004c:
            r18 = -1
            goto L_0x0351
        L_0x0050:
            int[] r0 = r15.f31979a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m40693j(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0253
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            if (r0 == r7) goto L_0x008d
            r22 = r1
            r20 = r2
            if (r7 == r15) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r0 == r15) goto L_0x008a
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x008d:
            r22 = r1
            r20 = r2
            r2 = r19
        L_0x0093:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x0221;
                case 1: goto L_0x0205;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01e4;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01ac;
                case 6: goto L_0x0195;
                case 7: goto L_0x0174;
                case 8: goto L_0x014f;
                case 9: goto L_0x0120;
                case 10: goto L_0x0102;
                case 11: goto L_0x01cc;
                case 12: goto L_0x00ef;
                case 13: goto L_0x0195;
                case 14: goto L_0x01ac;
                case 15: goto L_0x00d8;
                case 16: goto L_0x00a5;
                default: goto L_0x0097;
            }
        L_0x0097:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x024c
        L_0x00a5:
            if (r3 != 0) goto L_0x00cf
            int r13 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r4, r11)
            long r0 = r11.f32050b
            long r4 = com.google.android.gms.internal.measurement.C7042k8.m40323b(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0248
        L_0x00cf:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0148
        L_0x00d8:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0148
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r4, r11)
            int r1 = r11.f32049a
            int r1 = com.google.android.gms.internal.measurement.C7042k8.m40322a(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x00ef:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0148
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r4, r11)
            int r1 = r11.f32049a
            r7.putInt(r14, r8, r1)
            goto L_0x0115
        L_0x0102:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0148
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40930a(r12, r4, r11)
            java.lang.Object r1 = r11.f32051c
            r7.putObject(r14, r8, r1)
        L_0x0115:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            goto L_0x036e
        L_0x0120:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0148
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.m40699p(r14, r15)
            com.google.android.gms.internal.measurement.ya r1 = r13.m40697n(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40944o(r0, r1, r2, r3, r4, r5)
            r13.m40707x(r14, r15, r8)
            goto L_0x023c
        L_0x0148:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x024c
        L_0x014f:
            r13 = r30
            r23 = r33
            r15 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40936g(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40937h(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f32051c
            r7.putObject(r14, r8, r1)
            goto L_0x023c
        L_0x0174:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r4, r11)
            long r1 = r11.f32050b
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r5 = 0
        L_0x0190:
            com.google.android.gms.internal.measurement.C6879ac.m39552r(r14, r8, r5)
            goto L_0x023c
        L_0x0195:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021e
        L_0x01ac:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024c
            long r21 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x023c
        L_0x01cc:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r4, r11)
            int r1 = r11.f32049a
            r7.putInt(r14, r8, r1)
            goto L_0x023c
        L_0x01e4:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024c
            int r17 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r4, r11)
            long r4 = r11.f32050b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023f
        L_0x0205:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024c
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C6879ac.m39555u(r14, r8, r0)
        L_0x021e:
            int r0 = r4 + 4
            goto L_0x023c
        L_0x0221:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024c
            long r0 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C6879ac.m39554t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x023c:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023f:
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r13
        L_0x0248:
            r13 = r34
            goto L_0x001d
        L_0x024c:
            r2 = r4
            r29 = r7
            r7 = r20
            goto L_0x004c
        L_0x0253:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02b2
            r0 = 2
            if (r3 != r0) goto L_0x02a7
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.n9 r0 = (com.google.android.gms.internal.measurement.C7091n9) r0
            boolean r1 = r0.mo23698e()
            if (r1 != 0) goto L_0x0284
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027c
            r1 = 10
            goto L_0x027d
        L_0x027c:
            int r1 = r1 + r1
        L_0x027d:
            com.google.android.gms.internal.measurement.n9 r0 = r0.mo23012h(r1)
            r7.putObject(r14, r8, r0)
        L_0x0284:
            r5 = r0
            com.google.android.gms.internal.measurement.ya r0 = r10.m40697n(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40934e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r10
            r10 = -1
            goto L_0x001d
        L_0x02a7:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032e
        L_0x02b2:
            r0 = 49
            if (r13 > r0) goto L_0x0301
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.m40688V(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02ff
        L_0x02ee:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x036c
        L_0x02ff:
            r2 = r0
            goto L_0x032f
        L_0x0301:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x0334
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x032e
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.m40685S(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02ff
            goto L_0x02ee
        L_0x032e:
            r2 = r14
        L_0x032f:
            r6 = r25
            r7 = r26
            goto L_0x0351
        L_0x0334:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.m40686T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02ff
            goto L_0x02ee
        L_0x0351:
            com.google.android.gms.internal.measurement.rb r4 = m40677K(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40938i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
        L_0x036c:
            r9 = r29
        L_0x036e:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x001d
        L_0x0376:
            r25 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0389
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0389:
            r1 = r34
            if (r0 != r1) goto L_0x038e
            return r0
        L_0x038e:
            com.google.android.gms.internal.measurement.q9 r0 = com.google.android.gms.internal.measurement.C7139q9.m40666e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.m40687U(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.s7):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x017a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0447 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0447 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8  */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m40688V(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C7169s7 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f31978q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.n9 r12 = (com.google.android.gms.internal.measurement.C7091n9) r12
            boolean r13 = r12.mo23698e()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.n9 r12 = r12.mo23012h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03d9;
                case 19: goto L_0x038c;
                case 20: goto L_0x0349;
                case 21: goto L_0x0349;
                case 22: goto L_0x032e;
                case 23: goto L_0x02ed;
                case 24: goto L_0x02ac;
                case 25: goto L_0x0253;
                case 26: goto L_0x01a0;
                case 27: goto L_0x0185;
                case 28: goto L_0x012b;
                case 29: goto L_0x032e;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02ac;
                case 32: goto L_0x02ed;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03d9;
                case 36: goto L_0x038c;
                case 37: goto L_0x0349;
                case 38: goto L_0x0349;
                case 39: goto L_0x032e;
                case 40: goto L_0x02ed;
                case 41: goto L_0x02ac;
                case 42: goto L_0x0253;
                case 43: goto L_0x032e;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02ac;
                case 46: goto L_0x02ed;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x0447
            com.google.android.gms.internal.measurement.ya r1 = r15.m40697n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40932c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f32051c
            r12.add(r8)
            goto L_0x0425
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r1, r7)
            long r4 = r7.f32050b
            long r4 = com.google.android.gms.internal.measurement.C7042k8.m40323b(r4)
            r12.mo23254f(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0448
        L_0x007b:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r4, r7)
            long r8 = r7.f32050b
            long r8 = com.google.android.gms.internal.measurement.C7042k8.m40323b(r8)
            r12.mo23254f(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r4, r7)
            long r8 = r7.f32050b
            long r8 = com.google.android.gms.internal.measurement.C7042k8.m40323b(r8)
            r12.mo23254f(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.measurement.i9 r12 = (com.google.android.gms.internal.measurement.C7011i9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r4 = r7.f32049a
            int r4 = com.google.android.gms.internal.measurement.C7042k8.m40322a(r4)
            r12.mo23531i0(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0448
        L_0x00ca:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.measurement.i9 r12 = (com.google.android.gms.internal.measurement.C7011i9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r4 = r7.f32049a
            int r4 = com.google.android.gms.internal.measurement.C7042k8.m40322a(r4)
            r12.mo23531i0(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r4 = r7.f32049a
            int r4 = com.google.android.gms.internal.measurement.C7042k8.m40322a(r4)
            r12.mo23531i0(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.C7185t7.m40935f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x0447
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C7185t7.m40941l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.k9 r3 = r15.m40696m(r8)
            r4 = 0
            com.google.android.gms.internal.measurement.qb r5 = r0.f31990l
            r22 = r16
            r23 = r21
            r24 = r12
            r25 = r3
            r26 = r4
            r27 = r5
            com.google.android.gms.internal.measurement.C6878ab.m39506c(r22, r23, r24, r25, r26, r27)
        L_0x0128:
            r1 = r2
            goto L_0x0448
        L_0x012b:
            if (r6 != r14) goto L_0x0447
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r4 = r7.f32049a
            if (r4 < 0) goto L_0x0180
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017b
            if (r4 != 0) goto L_0x0141
            com.google.android.gms.internal.measurement.g8 r4 = com.google.android.gms.internal.measurement.C6977g8.f31702b
            r12.add(r4)
            goto L_0x0149
        L_0x0141:
            com.google.android.gms.internal.measurement.g8 r6 = com.google.android.gms.internal.measurement.C6977g8.m40061s(r3, r1, r4)
            r12.add(r6)
        L_0x0148:
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x017a
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x0154
            goto L_0x017a
        L_0x0154:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r4 = r7.f32049a
            if (r4 < 0) goto L_0x0175
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0170
            if (r4 != 0) goto L_0x0168
            com.google.android.gms.internal.measurement.g8 r4 = com.google.android.gms.internal.measurement.C6977g8.f31702b
            r12.add(r4)
            goto L_0x0149
        L_0x0168:
            com.google.android.gms.internal.measurement.g8 r6 = com.google.android.gms.internal.measurement.C6977g8.m40061s(r3, r1, r4)
            r12.add(r6)
            goto L_0x0148
        L_0x0170:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x0175:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x017a:
            return r1
        L_0x017b:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x0180:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x0185:
            if (r6 == r14) goto L_0x0189
            goto L_0x0447
        L_0x0189:
            com.google.android.gms.internal.measurement.ya r1 = r15.m40697n(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40934e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a0:
            if (r6 != r14) goto L_0x0447
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01f3
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r6 = r7.f32049a
            if (r6 < 0) goto L_0x01ee
            if (r6 != 0) goto L_0x01bb
            r12.add(r1)
            goto L_0x01c6
        L_0x01bb:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C7107o9.f31926b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01c5:
            int r4 = r4 + r6
        L_0x01c6:
            if (r4 >= r5) goto L_0x0447
            int r6 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r8 = r7.f32049a
            if (r2 != r8) goto L_0x0447
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r6, r7)
            int r6 = r7.f32049a
            if (r6 < 0) goto L_0x01e9
            if (r6 != 0) goto L_0x01de
            r12.add(r1)
            goto L_0x01c6
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C7107o9.f31926b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01c5
        L_0x01e9:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x01ee:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x01f3:
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r6 = r7.f32049a
            if (r6 < 0) goto L_0x024e
            if (r6 != 0) goto L_0x0201
            r12.add(r1)
            goto L_0x0214
        L_0x0201:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C6981gc.m40080f(r3, r4, r8)
            if (r9 == 0) goto L_0x0249
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C7107o9.f31926b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0213:
            r4 = r8
        L_0x0214:
            if (r4 >= r5) goto L_0x0447
            int r6 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r8 = r7.f32049a
            if (r2 != r8) goto L_0x0447
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r6, r7)
            int r6 = r7.f32049a
            if (r6 < 0) goto L_0x0244
            if (r6 != 0) goto L_0x022c
            r12.add(r1)
            goto L_0x0214
        L_0x022c:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C6981gc.m40080f(r3, r4, r8)
            if (r9 == 0) goto L_0x023f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C7107o9.f31926b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0213
        L_0x023f:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40664c()
            throw r1
        L_0x0244:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x0249:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40664c()
            throw r1
        L_0x024e:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40665d()
            throw r1
        L_0x0253:
            r1 = 0
            if (r6 != r14) goto L_0x027b
            com.google.android.gms.internal.measurement.u7 r12 = (com.google.android.gms.internal.measurement.C7201u7) r12
            int r2 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r4 = r7.f32049a
            int r4 = r4 + r2
        L_0x025f:
            if (r2 >= r4) goto L_0x0272
            int r2 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r2, r7)
            long r5 = r7.f32050b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x026d
            r5 = 1
            goto L_0x026e
        L_0x026d:
            r5 = 0
        L_0x026e:
            r12.mo23921c(r5)
            goto L_0x025f
        L_0x0272:
            if (r2 != r4) goto L_0x0276
            goto L_0x0128
        L_0x0276:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x027b:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.measurement.u7 r12 = (com.google.android.gms.internal.measurement.C7201u7) r12
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r4, r7)
            long r8 = r7.f32050b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x028b
            r6 = 1
            goto L_0x028c
        L_0x028b:
            r6 = 0
        L_0x028c:
            r12.mo23921c(r6)
        L_0x028f:
            if (r4 >= r5) goto L_0x02ab
            int r6 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r8 = r7.f32049a
            if (r2 == r8) goto L_0x029a
            goto L_0x02ab
        L_0x029a:
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r6, r7)
            long r8 = r7.f32050b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02a6
            r6 = 1
            goto L_0x02a7
        L_0x02a6:
            r6 = 0
        L_0x02a7:
            r12.mo23921c(r6)
            goto L_0x028f
        L_0x02ab:
            return r4
        L_0x02ac:
            if (r6 != r14) goto L_0x02cc
            com.google.android.gms.internal.measurement.i9 r12 = (com.google.android.gms.internal.measurement.C7011i9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x02b7:
            if (r1 >= r2) goto L_0x02c3
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r3, r1)
            r12.mo23531i0(r4)
            int r1 = r1 + 4
            goto L_0x02b7
        L_0x02c3:
            if (r1 != r2) goto L_0x02c7
            goto L_0x0448
        L_0x02c7:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x02cc:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.measurement.i9 r12 = (com.google.android.gms.internal.measurement.C7011i9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r17, r18)
            r12.mo23531i0(r1)
        L_0x02d7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ec
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x02e4
            goto L_0x02ec
        L_0x02e4:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r3, r4)
            r12.mo23531i0(r1)
            goto L_0x02d7
        L_0x02ec:
            return r1
        L_0x02ed:
            if (r6 != r14) goto L_0x030d
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x02f8:
            if (r1 >= r2) goto L_0x0304
            long r4 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r3, r1)
            r12.mo23254f(r4)
            int r1 = r1 + 8
            goto L_0x02f8
        L_0x0304:
            if (r1 != r2) goto L_0x0308
            goto L_0x0448
        L_0x0308:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x030d:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            long r8 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r17, r18)
            r12.mo23254f(r8)
        L_0x0318:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032d
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x0325
            goto L_0x032d
        L_0x0325:
            long r8 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r3, r4)
            r12.mo23254f(r8)
            goto L_0x0318
        L_0x032d:
            return r1
        L_0x032e:
            if (r6 != r14) goto L_0x0336
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40935f(r3, r4, r12, r7)
            goto L_0x0448
        L_0x0336:
            if (r6 == 0) goto L_0x033a
            goto L_0x0447
        L_0x033a:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40941l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0349:
            if (r6 != r14) goto L_0x0369
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x0354:
            if (r1 >= r2) goto L_0x0360
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r1, r7)
            long r4 = r7.f32050b
            r12.mo23254f(r4)
            goto L_0x0354
        L_0x0360:
            if (r1 != r2) goto L_0x0364
            goto L_0x0448
        L_0x0364:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x0369:
            if (r6 != 0) goto L_0x0447
            com.google.android.gms.internal.measurement.ca r12 = (com.google.android.gms.internal.measurement.C6911ca) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r4, r7)
            long r8 = r7.f32050b
            r12.mo23254f(r8)
        L_0x0376:
            if (r1 >= r5) goto L_0x038b
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x0381
            goto L_0x038b
        L_0x0381:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r3, r4, r7)
            long r8 = r7.f32050b
            r12.mo23254f(r8)
            goto L_0x0376
        L_0x038b:
            return r1
        L_0x038c:
            if (r6 != r14) goto L_0x03b0
            com.google.android.gms.internal.measurement.a9 r12 = (com.google.android.gms.internal.measurement.C6876a9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x0397:
            if (r1 >= r2) goto L_0x03a7
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo23008c(r4)
            int r1 = r1 + 4
            goto L_0x0397
        L_0x03a7:
            if (r1 != r2) goto L_0x03ab
            goto L_0x0448
        L_0x03ab:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x03b0:
            if (r6 != r9) goto L_0x0447
            com.google.android.gms.internal.measurement.a9 r12 = (com.google.android.gms.internal.measurement.C6876a9) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo23008c(r1)
        L_0x03bf:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03d8
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x03cc
            goto L_0x03d8
        L_0x03cc:
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo23008c(r1)
            goto L_0x03bf
        L_0x03d8:
            return r1
        L_0x03d9:
            if (r6 != r14) goto L_0x03fc
            com.google.android.gms.internal.measurement.q8 r12 = (com.google.android.gms.internal.measurement.C7138q8) r12
            int r1 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r2 = r7.f32049a
            int r2 = r2 + r1
        L_0x03e4:
            if (r1 >= r2) goto L_0x03f4
            long r4 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo23774c(r4)
            int r1 = r1 + 8
            goto L_0x03e4
        L_0x03f4:
            if (r1 != r2) goto L_0x03f7
            goto L_0x0448
        L_0x03f7:
            com.google.android.gms.internal.measurement.q9 r1 = com.google.android.gms.internal.measurement.C7139q9.m40667f()
            throw r1
        L_0x03fc:
            if (r6 != r13) goto L_0x0447
            com.google.android.gms.internal.measurement.q8 r12 = (com.google.android.gms.internal.measurement.C7138q8) r12
            long r8 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo23774c(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0424
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r1, r7)
            int r6 = r7.f32049a
            if (r2 == r6) goto L_0x0418
            goto L_0x0424
        L_0x0418:
            long r8 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo23774c(r8)
            goto L_0x040b
        L_0x0424:
            return r1
        L_0x0425:
            if (r4 >= r5) goto L_0x0446
            int r8 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r3, r4, r7)
            int r9 = r7.f32049a
            if (r2 == r9) goto L_0x0430
            goto L_0x0446
        L_0x0430:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C7185t7.m40932c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f32051c
            r12.add(r8)
            goto L_0x0425
        L_0x0446:
            return r4
        L_0x0447:
            r1 = r4
        L_0x0448:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.m40688V(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.s7):int");
    }

    /* renamed from: W */
    private final int m40689W(int i) {
        if (i < this.f31981c || i > this.f31982d) {
            return -1;
        }
        return m40692Z(i, 0);
    }

    /* renamed from: X */
    private final int m40690X(int i, int i2) {
        if (i < this.f31981c || i > this.f31982d) {
            return -1;
        }
        return m40692Z(i, i2);
    }

    /* renamed from: Y */
    private final int m40691Y(int i) {
        return this.f31979a[i + 2];
    }

    /* renamed from: Z */
    private final int m40692Z(int i, int i2) {
        int length = (this.f31979a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f31979a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m40693j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m40694k(int i) {
        return this.f31979a[i + 1];
    }

    /* renamed from: l */
    private static long m40695l(Object obj, long j) {
        return ((Long) C6879ac.m39545k(obj, j)).longValue();
    }

    /* renamed from: m */
    private final C7043k9 m40696m(int i) {
        int i2 = i / 3;
        return (C7043k9) this.f31980b[i2 + i2 + 1];
    }

    /* renamed from: n */
    private final C7268ya m40697n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C7268ya yaVar = (C7268ya) this.f31980b[i3];
        if (yaVar != null) {
            return yaVar;
        }
        C7268ya b = C7220va.m41045a().mo23957b((Class) this.f31980b[i3 + 1]);
        this.f31980b[i3] = b;
        return b;
    }

    /* renamed from: o */
    private final Object m40698o(int i) {
        int i2 = i / 3;
        return this.f31980b[i2 + i2];
    }

    /* renamed from: p */
    private final Object m40699p(Object obj, int i) {
        C7268ya n = m40697n(i);
        long k = (long) (m40694k(i) & 1048575);
        if (!m40670C(obj, i)) {
            return n.mo23782a();
        }
        Object object = f31978q.getObject(obj, k);
        if (m40673F(object)) {
            return object;
        }
        Object a = n.mo23782a();
        if (object != null) {
            n.mo23787f(a, object);
        }
        return a;
    }

    /* renamed from: q */
    private final Object m40700q(Object obj, int i, int i2) {
        C7268ya n = m40697n(i2);
        if (!m40674G(obj, i, i2)) {
            return n.mo23782a();
        }
        Object object = f31978q.getObject(obj, (long) (m40694k(i2) & 1048575));
        if (m40673F(object)) {
            return object;
        }
        Object a = n.mo23782a();
        if (object != null) {
            n.mo23787f(a, object);
        }
        return a;
    }

    /* renamed from: r */
    private static Field m40701r(Class cls, String str) {
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
    private static void m40702s(Object obj) {
        if (!m40673F(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: t */
    private final void m40703t(Object obj, Object obj2, int i) {
        if (m40670C(obj2, i)) {
            long k = (long) (m40694k(i) & 1048575);
            Unsafe unsafe = f31978q;
            Object object = unsafe.getObject(obj2, k);
            if (object != null) {
                C7268ya n = m40697n(i);
                if (!m40670C(obj, i)) {
                    if (!m40673F(object)) {
                        unsafe.putObject(obj, k, object);
                    } else {
                        Object a = n.mo23782a();
                        n.mo23787f(a, object);
                        unsafe.putObject(obj, k, a);
                    }
                    m40705v(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k);
                if (!m40673F(object2)) {
                    Object a2 = n.mo23782a();
                    n.mo23787f(a2, object2);
                    unsafe.putObject(obj, k, a2);
                    object2 = a2;
                }
                n.mo23787f(object2, object);
                return;
            }
            int i2 = this.f31979a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: u */
    private final void m40704u(Object obj, Object obj2, int i) {
        int i2 = this.f31979a[i];
        if (m40674G(obj2, i2, i)) {
            long k = (long) (m40694k(i) & 1048575);
            Unsafe unsafe = f31978q;
            Object object = unsafe.getObject(obj2, k);
            if (object != null) {
                C7268ya n = m40697n(i);
                if (!m40674G(obj, i2, i)) {
                    if (!m40673F(object)) {
                        unsafe.putObject(obj, k, object);
                    } else {
                        Object a = n.mo23782a();
                        n.mo23787f(a, object);
                        unsafe.putObject(obj, k, a);
                    }
                    m40706w(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, k);
                if (!m40673F(object2)) {
                    Object a2 = n.mo23782a();
                    n.mo23787f(a2, object2);
                    unsafe.putObject(obj, k, a2);
                    object2 = a2;
                }
                n.mo23787f(object2, object);
                return;
            }
            int i3 = this.f31979a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: v */
    private final void m40705v(Object obj, int i) {
        int Y = m40691Y(i);
        long j = (long) (1048575 & Y);
        if (j != 1048575) {
            C6879ac.m39556v(obj, j, (1 << (Y >>> 20)) | C6879ac.m39542h(obj, j));
        }
    }

    /* renamed from: w */
    private final void m40706w(Object obj, int i, int i2) {
        C6879ac.m39556v(obj, (long) (m40691Y(i2) & 1048575), i);
    }

    /* renamed from: x */
    private final void m40707x(Object obj, int i, Object obj2) {
        f31978q.putObject(obj, (long) (m40694k(i) & 1048575), obj2);
        m40705v(obj, i);
    }

    /* renamed from: y */
    private final void m40708y(Object obj, int i, int i2, Object obj2) {
        f31978q.putObject(obj, (long) (m40694k(i2) & 1048575), obj2);
        m40706w(obj, i, i2);
    }

    /* renamed from: z */
    private final void m40709z(Object obj, C7030jc jcVar) throws IOException {
        int i;
        Object obj2 = obj;
        C7030jc jcVar2 = jcVar;
        if (!this.f31984f) {
            int length = this.f31979a.length;
            Unsafe unsafe = f31978q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int k = m40694k(i3);
                int[] iArr = this.f31979a;
                int i6 = iArr[i3];
                int j = m40693j(k);
                if (j <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j2 = (long) (k & i2);
                switch (j) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            jcVar2.mo23592y(i6, C6879ac.m39540f(obj2, j2));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23560C(i6, C6879ac.m39541g(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23581n(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23566I(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23567J(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23572a(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23578k(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23579l(i6, C6879ac.m39531B(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m40676I(i6, unsafe.getObject(obj2, j2), jcVar2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23570M(i6, unsafe.getObject(obj2, j2), m40697n(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23587t(i6, (C6977g8) unsafe.getObject(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23574h(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23589v(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23558A(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23583p(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23559B(i6, unsafe.getInt(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23571N(i6, unsafe.getLong(obj2, j2));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            jcVar2.mo23585r(i6, unsafe.getObject(obj2, j2), m40697n(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        C6878ab.m39513j(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 19:
                        C6878ab.m39517n(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 20:
                        C6878ab.m39520q(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 21:
                        C6878ab.m39528y(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 22:
                        C6878ab.m39519p(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 23:
                        C6878ab.m39516m(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 24:
                        C6878ab.m39515l(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 25:
                        C6878ab.m39511h(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        continue;
                    case 26:
                        C6878ab.m39526w(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2);
                        break;
                    case 27:
                        C6878ab.m39521r(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, m40697n(i3));
                        break;
                    case 28:
                        C6878ab.m39512i(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2);
                        break;
                    case 29:
                        C6878ab.m39527x(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 30:
                        C6878ab.m39514k(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 31:
                        C6878ab.m39522s(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 32:
                        C6878ab.m39523t(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 33:
                        C6878ab.m39524u(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 34:
                        C6878ab.m39525v(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, false);
                        break;
                    case 35:
                        C6878ab.m39513j(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 36:
                        C6878ab.m39517n(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 37:
                        C6878ab.m39520q(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 38:
                        C6878ab.m39528y(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 39:
                        C6878ab.m39519p(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 40:
                        C6878ab.m39516m(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 41:
                        C6878ab.m39515l(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 42:
                        C6878ab.m39511h(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                        C6878ab.m39527x(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                        C6878ab.m39514k(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 45:
                        C6878ab.m39522s(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 46:
                        C6878ab.m39523t(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 47:
                        C6878ab.m39524u(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 48:
                        C6878ab.m39525v(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, true);
                        break;
                    case 49:
                        C6878ab.m39518o(this.f31979a[i3], (List) unsafe.getObject(obj2, j2), jcVar2, m40697n(i3));
                        break;
                    case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                        m40668A(jcVar2, i6, unsafe.getObject(obj2, j2), i3);
                        break;
                    case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23592y(i6, m40680N(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23560C(i6, m40681O(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23581n(i6, m40695l(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23566I(i6, m40695l(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23567J(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23572a(i6, m40695l(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23578k(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23579l(i6, m40675H(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                        if (m40674G(obj2, i6, i3)) {
                            m40676I(i6, unsafe.getObject(obj2, j2), jcVar2);
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23570M(i6, unsafe.getObject(obj2, j2), m40697n(i3));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23587t(i6, (C6977g8) unsafe.getObject(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23574h(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23589v(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23558A(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23583p(i6, m40695l(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23559B(i6, m40684R(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23571N(i6, m40695l(obj2, j2));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                        if (m40674G(obj2, i6, i3)) {
                            jcVar2.mo23585r(i6, unsafe.getObject(obj2, j2), m40697n(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            C7141qb qbVar = this.f31990l;
            qbVar.mo23799i(qbVar.mo23794d(obj2), jcVar2);
            return;
        }
        this.f31991m.mo23928a(obj2);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033d, code lost:
        if (r0 != r15) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0359, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0382, code lost:
        if (r0 != r15) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a5, code lost:
        if (r0 != r15) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0191, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0193, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0196, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f9, code lost:
        r5 = r26 | r24;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fc, code lost:
        r2 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0200, code lost:
        r8 = r6;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0297, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0299, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029b, code lost:
        r2 = r11;
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a1, code lost:
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02a3, code lost:
        r7 = r34;
        r2 = r6;
        r28 = r10;
        r20 = r11;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23781J(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.C7169s7 r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            m40702s(r30)
            sun.misc.Unsafe r10 = f31978q
            r16 = 0
            r0 = r32
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            r17 = 0
            if (r0 >= r13) goto L_0x0410
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40940k(r0, r12, r1, r9)
            int r1 = r9.f32049a
            r4 = r1
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r4 = r0
        L_0x0030:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003d
            int r3 = r3 / r8
            int r2 = r15.m40690X(r0, r3)
            goto L_0x0041
        L_0x003d:
            int r2 = r15.m40689W(r0)
        L_0x0041:
            r3 = -1
            if (r2 != r3) goto L_0x0053
            r20 = r0
            r2 = r1
            r8 = r4
            r26 = r5
            r28 = r10
            r7 = r11
            r19 = -1
            r21 = 0
            goto L_0x03a8
        L_0x0053:
            int[] r3 = r15.f31979a
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = m40693j(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02ae
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x008e
            r18 = r4
            if (r6 == r3) goto L_0x0084
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0084:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            r26 = r5
            goto L_0x0094
        L_0x008e:
            r18 = r4
            r26 = r5
            r27 = r6
        L_0x0094:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x027e;
                case 1: goto L_0x0262;
                case 2: goto L_0x0242;
                case 3: goto L_0x0242;
                case 4: goto L_0x022a;
                case 5: goto L_0x0204;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01be;
                case 8: goto L_0x0199;
                case 9: goto L_0x0169;
                case 10: goto L_0x014e;
                case 11: goto L_0x022a;
                case 12: goto L_0x0117;
                case 13: goto L_0x01e0;
                case 14: goto L_0x0204;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00c4;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r2
            r11 = r20
            r6 = r21
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a1
            java.lang.Object r7 = r15.m40699p(r14, r13)
            com.google.android.gms.internal.measurement.ya r1 = r15.m40697n(r13)
            int r0 = r11 << 3
            r5 = r0 | 4
            r0 = r7
            r2 = r31
            r3 = r6
            r4 = r33
            r8 = r18
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40943n(r0, r1, r2, r3, r4, r5, r6)
            r15.m40707x(r14, r13, r7)
            goto L_0x0191
        L_0x00c4:
            if (r7 != 0) goto L_0x00ea
            r1 = r21
            int r6 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r1, r9)
            long r0 = r9.f32050b
            long r4 = com.google.android.gms.internal.measurement.C7042k8.m40323b(r0)
            r11 = r20
            r7 = r22
            r0 = r10
            r1 = r30
            r13 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r7
            r8 = r18
            r0.putLong(r1, r2, r4)
            r5 = r26 | r24
            r0 = r6
            goto L_0x0193
        L_0x00ea:
            r13 = r2
            r11 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r6 = r21
            goto L_0x02a3
        L_0x00f8:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0196
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r1, r9)
            int r1 = r9.f32049a
            int r1 = com.google.android.gms.internal.measurement.C7042k8.m40322a(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0191
        L_0x0117:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0196
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r1, r9)
            int r1 = r9.f32049a
            com.google.android.gms.internal.measurement.k9 r2 = r15.m40696m(r13)
            if (r2 == 0) goto L_0x014a
            boolean r2 = r2.mo23350g(r1)
            if (r2 == 0) goto L_0x013a
            goto L_0x014a
        L_0x013a:
            com.google.android.gms.internal.measurement.rb r2 = m40677K(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo23827j(r8, r1)
            r1 = r8
            r2 = r11
            goto L_0x02f9
        L_0x014a:
            r10.putInt(r14, r3, r1)
            goto L_0x0191
        L_0x014e:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0196
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40930a(r12, r1, r9)
            java.lang.Object r1 = r9.f32051c
            r10.putObject(r14, r3, r1)
            goto L_0x0191
        L_0x0169:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0196
            java.lang.Object r6 = r15.m40699p(r14, r13)
            com.google.android.gms.internal.measurement.ya r2 = r15.m40697n(r13)
            r0 = r6
            r5 = r1
            r1 = r2
            r2 = r31
            r3 = r5
            r4 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40944o(r0, r1, r2, r3, r4, r5)
            r15.m40707x(r14, r13, r6)
        L_0x0191:
            r5 = r26 | r24
        L_0x0193:
            r1 = r8
            goto L_0x01fc
        L_0x0196:
            r6 = r1
            goto L_0x02a3
        L_0x0199:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0200
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01b4
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40936g(r12, r5, r9)
            goto L_0x01b8
        L_0x01b4:
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40937h(r12, r5, r9)
        L_0x01b8:
            java.lang.Object r1 = r9.f32051c
            r10.putObject(r14, r3, r1)
            goto L_0x01f9
        L_0x01be:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0200
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r5, r9)
            long r7 = r9.f32050b
            r17 = 0
            int r2 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x01db
            goto L_0x01dc
        L_0x01db:
            r1 = 0
        L_0x01dc:
            com.google.android.gms.internal.measurement.C6879ac.m39552r(r14, r3, r1)
            goto L_0x01f9
        L_0x01e0:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0200
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
        L_0x01f9:
            r5 = r26 | r24
            r1 = r6
        L_0x01fc:
            r2 = r11
            r3 = r13
            goto L_0x02fc
        L_0x0200:
            r8 = r6
            r6 = r5
            goto L_0x02a3
        L_0x0204:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0225
            long r7 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r12, r5)
            r0 = r10
            r1 = r30
            r2 = r3
            r18 = r6
            r6 = r5
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0297
        L_0x0225:
            r18 = r6
            r6 = r5
            goto L_0x02a1
        L_0x022a:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40939j(r12, r6, r9)
            int r1 = r9.f32049a
            r10.putInt(r14, r3, r1)
            goto L_0x0299
        L_0x0242:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a1
            int r6 = com.google.android.gms.internal.measurement.C7185t7.m40942m(r12, r6, r9)
            long r7 = r9.f32050b
            r0 = r10
            r1 = r30
            r2 = r3
            r4 = r7
            r0.putLong(r1, r2, r4)
            r5 = r26 | r24
            r0 = r6
            goto L_0x029b
        L_0x0262:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a1
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40931b(r12, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C6879ac.m39555u(r14, r3, r0)
            int r0 = r6 + 4
            goto L_0x0299
        L_0x027e:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02a1
            long r0 = com.google.android.gms.internal.measurement.C7185t7.m40945p(r12, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C6879ac.m39554t(r14, r3, r0)
        L_0x0297:
            int r0 = r6 + 8
        L_0x0299:
            r5 = r26 | r24
        L_0x029b:
            r2 = r11
            r3 = r13
            r1 = r18
            goto L_0x02fc
        L_0x02a1:
            r8 = r18
        L_0x02a3:
            r7 = r34
            r2 = r6
            r28 = r10
            r20 = r11
            r21 = r13
            goto L_0x038a
        L_0x02ae:
            r13 = r2
            r2 = r4
            r27 = r6
            r1 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r11 != r0) goto L_0x0311
            r0 = 2
            if (r7 != r0) goto L_0x0304
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.google.android.gms.internal.measurement.n9 r0 = (com.google.android.gms.internal.measurement.C7091n9) r0
            boolean r7 = r0.mo23698e()
            if (r7 != 0) goto L_0x02e1
            int r7 = r0.size()
            if (r7 != 0) goto L_0x02d9
            r7 = 10
            goto L_0x02da
        L_0x02d9:
            int r7 = r7 + r7
        L_0x02da:
            com.google.android.gms.internal.measurement.n9 r0 = r0.mo23012h(r7)
            r10.putObject(r14, r3, r0)
        L_0x02e1:
            r7 = r0
            com.google.android.gms.internal.measurement.ya r0 = r15.m40697n(r13)
            r8 = r1
            r1 = r2
            r11 = r2
            r2 = r31
            r3 = r6
            r4 = r33
            r26 = r5
            r5 = r7
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40934e(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r1 = r11
        L_0x02f9:
            r3 = r13
            r5 = r26
        L_0x02fc:
            r6 = r27
            r13 = r33
            r11 = r34
            goto L_0x001c
        L_0x0304:
            r26 = r5
            r20 = r1
            r18 = r2
            r15 = r6
            r28 = r10
            r21 = r13
            goto L_0x0385
        L_0x0311:
            r26 = r5
            r5 = r2
            r2 = r1
            r0 = 49
            if (r11 > r0) goto L_0x035d
            long r0 = (long) r8
            r21 = r0
            r0 = r29
            r1 = r30
            r8 = r2
            r2 = r31
            r24 = r3
            r3 = r6
            r4 = r33
            r18 = r5
            r15 = r6
            r6 = r8
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r21
            r21 = r13
            r12 = r24
            r14 = r35
            int r0 = r0.m40688V(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0359
        L_0x033f:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r2 = r20
            r3 = r21
            r5 = r26
            r6 = r27
            r10 = r28
            goto L_0x001c
        L_0x0359:
            r7 = r34
            r2 = r0
            goto L_0x0388
        L_0x035d:
            r20 = r2
            r24 = r3
            r18 = r5
            r15 = r6
            r28 = r10
            r21 = r13
            r0 = 50
            if (r11 != r0) goto L_0x038d
            r0 = 2
            if (r7 != r0) goto L_0x0385
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r24
            r8 = r35
            int r0 = r0.m40685S(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0359
            goto L_0x033f
        L_0x0385:
            r7 = r34
            r2 = r15
        L_0x0388:
            r8 = r18
        L_0x038a:
            r6 = r27
            goto L_0x03a8
        L_0x038d:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r20
            r9 = r11
            r10 = r24
            r12 = r21
            r13 = r35
            int r0 = r0.m40686T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0359
            goto L_0x033f
        L_0x03a8:
            if (r8 != r7) goto L_0x03b6
            if (r7 == 0) goto L_0x03b6
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r26
            goto L_0x0419
        L_0x03b6:
            r9 = r29
            boolean r0 = r9.f31984f
            if (r0 == 0) goto L_0x03e9
            r10 = r35
            com.google.android.gms.internal.measurement.t8 r0 = r10.f32052d
            com.google.android.gms.internal.measurement.t8 r1 = com.google.android.gms.internal.measurement.C7186t8.f32111c
            if (r0 == r1) goto L_0x03e6
            com.google.android.gms.internal.measurement.na r1 = r9.f31983e
            r11 = r20
            com.google.android.gms.internal.measurement.g9 r0 = r0.mo23884b(r1, r11)
            if (r0 != 0) goto L_0x03e0
            com.google.android.gms.internal.measurement.rb r4 = m40677K(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40938i(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x03fe
        L_0x03e0:
            r12 = r30
            r0 = r12
            com.google.android.gms.internal.measurement.f9 r0 = (com.google.android.gms.internal.measurement.C6961f9) r0
            throw r17
        L_0x03e6:
            r12 = r30
            goto L_0x03ed
        L_0x03e9:
            r12 = r30
            r10 = r35
        L_0x03ed:
            r11 = r20
            com.google.android.gms.internal.measurement.rb r4 = m40677K(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.C7185t7.m40938i(r0, r1, r2, r3, r4, r5)
        L_0x03fe:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r26
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x001c
        L_0x0410:
            r26 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0419:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0424
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x0424:
            int r3 = r9.f31987i
        L_0x0426:
            int r4 = r9.f31988j
            if (r3 >= r4) goto L_0x0451
            int[] r4 = r9.f31986h
            r4 = r4[r3]
            int[] r5 = r9.f31979a
            r5 = r5[r4]
            int r5 = r9.m40694k(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r12, r5)
            if (r5 != 0) goto L_0x043f
            goto L_0x0445
        L_0x043f:
            com.google.android.gms.internal.measurement.k9 r6 = r9.m40696m(r4)
            if (r6 != 0) goto L_0x0448
        L_0x0445:
            int r3 = r3 + 1
            goto L_0x0426
        L_0x0448:
            com.google.android.gms.internal.measurement.ha r5 = (com.google.android.gms.internal.measurement.C6996ha) r5
            java.lang.Object r0 = r9.m40698o(r4)
            com.google.android.gms.internal.measurement.ga r0 = (com.google.android.gms.internal.measurement.C6979ga) r0
            throw r17
        L_0x0451:
            if (r7 != 0) goto L_0x045d
            r2 = r33
            if (r0 != r2) goto L_0x0458
            goto L_0x0463
        L_0x0458:
            com.google.android.gms.internal.measurement.q9 r0 = com.google.android.gms.internal.measurement.C7139q9.m40666e()
            throw r0
        L_0x045d:
            r2 = r33
            if (r0 > r2) goto L_0x0464
            if (r1 != r7) goto L_0x0464
        L_0x0463:
            return r0
        L_0x0464:
            com.google.android.gms.internal.measurement.q9 r0 = com.google.android.gms.internal.measurement.C7139q9.m40666e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.mo23781J(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.s7):int");
    }

    /* renamed from: a */
    public final Object mo23782a() {
        return ((C6995h9) this.f31983e).mo23493j();
    }

    /* renamed from: b */
    public final int mo23783b(Object obj) {
        return this.f31985g ? m40683Q(obj) : m40682P(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23784c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f31979a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m40694k(r1)
            int[] r4 = r8.f31979a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m40693j(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m40695l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m40695l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m40675H(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40528a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m40695l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m40684R(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m40695l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m40695l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m40681O(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m40674G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m40680N(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C6879ac.m39545k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C6879ac.m39531B(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40528a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C6879ac.m39542h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C6879ac.m39543i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C6879ac.m39541g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C6879ac.m39540f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C7107o9.m40530c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.qb r0 = r8.f31990l
            java.lang.Object r0 = r0.mo23794d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f31984f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.measurement.u8 r0 = r8.f31991m
            r0.mo23928a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7140qa.mo23784c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo23785d(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f31987i) {
            int i6 = this.f31986h[i5];
            int i7 = this.f31979a[i6];
            int k = m40694k(i6);
            int i8 = this.f31979a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f31978q.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & k) != 0 && !m40671D(obj, i6, i2, i, i10)) {
                return false;
            }
            int j = m40693j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j == 60 || j == 68) {
                        if (m40674G(obj2, i7, i6) && !m40672E(obj2, k, m40697n(i6))) {
                            return false;
                        }
                    } else if (j != 49) {
                        if (j == 50 && !((C6996ha) C6879ac.m39545k(obj2, (long) (k & 1048575))).isEmpty()) {
                            C6979ga gaVar = (C6979ga) m40698o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C6879ac.m39545k(obj2, (long) (k & 1048575));
                if (!list.isEmpty()) {
                    C7268ya n = m40697n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!n.mo23785d(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m40671D(obj, i6, i2, i, i10) && !m40672E(obj2, k, m40697n(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f31984f) {
            return true;
        }
        this.f31991m.mo23928a(obj2);
        throw null;
    }

    /* renamed from: e */
    public final void mo23786e(Object obj) {
        if (m40673F(obj)) {
            if (obj instanceof C6995h9) {
                C6995h9 h9Var = (C6995h9) obj;
                h9Var.mo23497v(Integer.MAX_VALUE);
                h9Var.zzb = 0;
                h9Var.mo23495t();
            }
            int length = this.f31979a.length;
            for (int i = 0; i < length; i += 3) {
                int k = m40694k(i);
                long j = (long) (1048575 & k);
                int j2 = m40693j(k);
                if (j2 != 9) {
                    switch (j2) {
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
                            this.f31989k.mo23128a(obj, j);
                            continue;
                        case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                            Unsafe unsafe = f31978q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C6996ha) object).mo23504d();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (m40670C(obj, i)) {
                    m40697n(i).mo23786e(f31978q.getObject(obj, j));
                }
            }
            this.f31990l.mo23797g(obj);
            if (this.f31984f) {
                this.f31991m.mo23929b(obj);
            }
        }
    }

    /* renamed from: f */
    public final void mo23787f(Object obj, Object obj2) {
        m40702s(obj);
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f31979a.length; i += 3) {
            int k = m40694k(i);
            long j = (long) (1048575 & k);
            int i2 = this.f31979a[i];
            switch (m40693j(k)) {
                case 0:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39554t(obj, j, C6879ac.m39540f(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 1:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39555u(obj, j, C6879ac.m39541g(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 2:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39557w(obj, j, C6879ac.m39543i(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 3:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39557w(obj, j, C6879ac.m39543i(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 4:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 5:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39557w(obj, j, C6879ac.m39543i(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 6:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 7:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39552r(obj, j, C6879ac.m39531B(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 8:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39558x(obj, j, C6879ac.m39545k(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 9:
                    m40703t(obj, obj2, i);
                    break;
                case 10:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39558x(obj, j, C6879ac.m39545k(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 11:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 12:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 13:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 14:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39557w(obj, j, C6879ac.m39543i(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 15:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39556v(obj, j, C6879ac.m39542h(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 16:
                    if (!m40670C(obj2, i)) {
                        break;
                    } else {
                        C6879ac.m39557w(obj, j, C6879ac.m39543i(obj2, j));
                        m40705v(obj, i);
                        break;
                    }
                case 17:
                    m40703t(obj, obj2, i);
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
                    this.f31989k.mo23129b(obj, obj2, j);
                    break;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    C6878ab.m39477B(this.f31993o, obj, obj2, j);
                    break;
                case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                    if (!m40674G(obj2, i2, i)) {
                        break;
                    } else {
                        C6879ac.m39558x(obj, j, C6879ac.m39545k(obj2, j));
                        m40706w(obj, i2, i);
                        break;
                    }
                case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                    m40704u(obj, obj2, i);
                    break;
                case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                    if (!m40674G(obj2, i2, i)) {
                        break;
                    } else {
                        C6879ac.m39558x(obj, j, C6879ac.m39545k(obj2, j));
                        m40706w(obj, i2, i);
                        break;
                    }
                case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                    m40704u(obj, obj2, i);
                    break;
            }
        }
        C6878ab.m39509f(this.f31990l, obj, obj2);
        if (this.f31984f) {
            C6878ab.m39508e(this.f31991m, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo23788g(Object obj, Object obj2) {
        boolean z;
        int length = this.f31979a.length;
        for (int i = 0; i < length; i += 3) {
            int k = m40694k(i);
            long j = (long) (k & 1048575);
            switch (m40693j(k)) {
                case 0:
                    if (m40669B(obj, obj2, i) && Double.doubleToLongBits(C6879ac.m39540f(obj, j)) == Double.doubleToLongBits(C6879ac.m39540f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m40669B(obj, obj2, i) && Float.floatToIntBits(C6879ac.m39541g(obj, j)) == Float.floatToIntBits(C6879ac.m39541g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m40669B(obj, obj2, i) && C6879ac.m39543i(obj, j) == C6879ac.m39543i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m40669B(obj, obj2, i) && C6879ac.m39543i(obj, j) == C6879ac.m39543i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m40669B(obj, obj2, i) && C6879ac.m39543i(obj, j) == C6879ac.m39543i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m40669B(obj, obj2, i) && C6879ac.m39531B(obj, j) == C6879ac.m39531B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m40669B(obj, obj2, i) && C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m40669B(obj, obj2, i) && C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m40669B(obj, obj2, i) && C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m40669B(obj, obj2, i) && C6879ac.m39543i(obj, j) == C6879ac.m39543i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m40669B(obj, obj2, i) && C6879ac.m39542h(obj, j) == C6879ac.m39542h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m40669B(obj, obj2, i) && C6879ac.m39543i(obj, j) == C6879ac.m39543i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m40669B(obj, obj2, i) && C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j))) {
                        continue;
                    }
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
                    z = C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j));
                    break;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    z = C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j));
                    break;
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
                    long Y = (long) (m40691Y(i) & 1048575);
                    if (C6879ac.m39542h(obj, Y) == C6879ac.m39542h(obj2, Y) && C6878ab.m39529z(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f31990l.mo23794d(obj).equals(this.f31990l.mo23794d(obj2))) {
            return false;
        }
        if (!this.f31984f) {
            return true;
        }
        this.f31991m.mo23928a(obj);
        this.f31991m.mo23928a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo23789h(Object obj, C7030jc jcVar) throws IOException {
        if (!this.f31985g) {
            m40709z(obj, jcVar);
        } else if (!this.f31984f) {
            int length = this.f31979a.length;
            for (int i = 0; i < length; i += 3) {
                int k = m40694k(i);
                int i2 = this.f31979a[i];
                switch (m40693j(k)) {
                    case 0:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23592y(i2, C6879ac.m39540f(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23560C(i2, C6879ac.m39541g(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23581n(i2, C6879ac.m39543i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23566I(i2, C6879ac.m39543i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23567J(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23572a(i2, C6879ac.m39543i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23578k(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23579l(i2, C6879ac.m39531B(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            m40676I(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar);
                            break;
                        }
                    case 9:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23570M(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), m40697n(i));
                            break;
                        }
                    case 10:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23587t(i2, (C6977g8) C6879ac.m39545k(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23574h(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23589v(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23558A(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23583p(i2, C6879ac.m39543i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23559B(i2, C6879ac.m39542h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23571N(i2, C6879ac.m39543i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m40670C(obj, i)) {
                            break;
                        } else {
                            jcVar.mo23585r(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), m40697n(i));
                            break;
                        }
                    case 18:
                        C6878ab.m39513j(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 19:
                        C6878ab.m39517n(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 20:
                        C6878ab.m39520q(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 21:
                        C6878ab.m39528y(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 22:
                        C6878ab.m39519p(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 23:
                        C6878ab.m39516m(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 24:
                        C6878ab.m39515l(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 25:
                        C6878ab.m39511h(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 26:
                        C6878ab.m39526w(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar);
                        break;
                    case 27:
                        C6878ab.m39521r(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, m40697n(i));
                        break;
                    case 28:
                        C6878ab.m39512i(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar);
                        break;
                    case 29:
                        C6878ab.m39527x(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 30:
                        C6878ab.m39514k(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 31:
                        C6878ab.m39522s(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 32:
                        C6878ab.m39523t(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 33:
                        C6878ab.m39524u(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 34:
                        C6878ab.m39525v(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, false);
                        break;
                    case 35:
                        C6878ab.m39513j(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 36:
                        C6878ab.m39517n(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 37:
                        C6878ab.m39520q(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 38:
                        C6878ab.m39528y(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 39:
                        C6878ab.m39519p(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 40:
                        C6878ab.m39516m(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 41:
                        C6878ab.m39515l(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 42:
                        C6878ab.m39511h(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                        C6878ab.m39527x(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                        C6878ab.m39514k(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 45:
                        C6878ab.m39522s(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 46:
                        C6878ab.m39523t(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 47:
                        C6878ab.m39524u(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 48:
                        C6878ab.m39525v(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, true);
                        break;
                    case 49:
                        C6878ab.m39518o(i2, (List) C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar, m40697n(i));
                        break;
                    case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                        m40668A(jcVar, i2, C6879ac.m39545k(obj, (long) (k & 1048575)), i);
                        break;
                    case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23592y(i2, m40680N(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23560C(i2, m40681O(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23581n(i2, m40695l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23566I(i2, m40695l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23567J(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23572a(i2, m40695l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23578k(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23579l(i2, m40675H(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            m40676I(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), jcVar);
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23570M(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), m40697n(i));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23587t(i2, (C6977g8) C6879ac.m39545k(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23574h(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23589v(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23558A(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23583p(i2, m40695l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23559B(i2, m40684R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23571N(i2, m40695l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                        if (!m40674G(obj, i2, i)) {
                            break;
                        } else {
                            jcVar.mo23585r(i2, C6879ac.m39545k(obj, (long) (k & 1048575)), m40697n(i));
                            break;
                        }
                }
            }
            C7141qb qbVar = this.f31990l;
            qbVar.mo23799i(qbVar.mo23794d(obj), jcVar);
        } else {
            this.f31991m.mo23928a(obj);
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo23790i(Object obj, byte[] bArr, int i, int i2, C7169s7 s7Var) throws IOException {
        if (this.f31985g) {
            m40687U(obj, bArr, i, i2, s7Var);
        } else {
            mo23781J(obj, bArr, i, i2, 0, s7Var);
        }
    }
}
