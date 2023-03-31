package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ac */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6879ac {

    /* renamed from: a */
    private static final Unsafe f31565a;

    /* renamed from: b */
    private static final Class f31566b = C7153r7.m40801a();

    /* renamed from: c */
    private static final boolean f31567c;

    /* renamed from: d */
    private static final C7285zb f31568d;

    /* renamed from: e */
    private static final boolean f31569e;

    /* renamed from: f */
    private static final boolean f31570f;

    /* renamed from: g */
    static final long f31571g = ((long) m39534E(byte[].class));

    /* renamed from: h */
    static final boolean f31572h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m39546l()
            f31565a = r7
            java.lang.Class r8 = com.google.android.gms.internal.measurement.C7153r7.m40801a()
            f31566b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m39530A(r8)
            f31567c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m39530A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.measurement.yb r11 = new com.google.android.gms.internal.measurement.yb
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.xb r11 = new com.google.android.gms.internal.measurement.xb
            r11.<init>(r7)
        L_0x003b:
            f31568d = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f32287a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m39536b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C6879ac.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f31569e = r8
            com.google.android.gms.internal.measurement.zb r8 = f31568d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f32287a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C6879ac.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f31570f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m39534E(r6)
            long r6 = (long) r6
            f31571g = r6
            m39534E(r5)
            m39535a(r5)
            m39534E(r4)
            m39535a(r4)
            m39534E(r3)
            m39535a(r3)
            m39534E(r2)
            m39535a(r2)
            m39534E(r1)
            m39535a(r1)
            m39534E(r0)
            m39535a(r0)
            java.lang.reflect.Field r0 = m39536b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.measurement.zb r1 = f31568d
            if (r1 == 0) goto L_0x0129
            r1.mo24038l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f31572h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6879ac.<clinit>():void");
    }

    private C6879ac() {
    }

    /* renamed from: A */
    static boolean m39530A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C7153r7.f32009a;
        try {
            Class cls3 = f31566b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: B */
    static boolean m39531B(Object obj, long j) {
        return f31568d.mo24000g(obj, j);
    }

    /* renamed from: C */
    static boolean m39532C() {
        return f31570f;
    }

    /* renamed from: D */
    static boolean m39533D() {
        return f31569e;
    }

    /* renamed from: E */
    private static int m39534E(Class cls) {
        if (f31570f) {
            return f31568d.mo24034h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m39535a(Class cls) {
        if (f31570f) {
            return f31568d.mo24035i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m39536b() {
        int i = C7153r7.f32009a;
        Field c = m39537c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m39537c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m39537c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m39538d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C7285zb zbVar = f31568d;
        int j3 = zbVar.mo24036j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zbVar.mo24040n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m39539e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C7285zb zbVar = f31568d;
        int i = (((int) j) & 3) << 3;
        zbVar.mo24040n(obj, j2, ((255 & b) << i) | (zbVar.mo24036j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m39540f(Object obj, long j) {
        return f31568d.mo23994a(obj, j);
    }

    /* renamed from: g */
    static float m39541g(Object obj, long j) {
        return f31568d.mo23995b(obj, j);
    }

    /* renamed from: h */
    static int m39542h(Object obj, long j) {
        return f31568d.mo24036j(obj, j);
    }

    /* renamed from: i */
    static long m39543i(Object obj, long j) {
        return f31568d.mo24037k(obj, j);
    }

    /* renamed from: j */
    static Object m39544j(Class cls) {
        try {
            return f31565a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m39545k(Object obj, long j) {
        return f31568d.mo24039m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m39546l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7237wb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m39552r(Object obj, long j, boolean z) {
        f31568d.mo23996c(obj, j, z);
    }

    /* renamed from: s */
    static void m39553s(byte[] bArr, long j, byte b) {
        f31568d.mo23997d(bArr, f31571g + j, b);
    }

    /* renamed from: t */
    static void m39554t(Object obj, long j, double d) {
        f31568d.mo23998e(obj, j, d);
    }

    /* renamed from: u */
    static void m39555u(Object obj, long j, float f) {
        f31568d.mo23999f(obj, j, f);
    }

    /* renamed from: v */
    static void m39556v(Object obj, long j, int i) {
        f31568d.mo24040n(obj, j, i);
    }

    /* renamed from: w */
    static void m39557w(Object obj, long j, long j2) {
        f31568d.mo24041o(obj, j, j2);
    }

    /* renamed from: x */
    static void m39558x(Object obj, long j, Object obj2) {
        f31568d.mo24042p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m39559y(Object obj, long j) {
        return ((byte) ((f31568d.mo24036j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m39560z(Object obj, long j) {
        return ((byte) ((f31568d.mo24036j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
