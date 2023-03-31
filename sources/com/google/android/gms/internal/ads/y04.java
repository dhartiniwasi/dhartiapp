package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class y04 {

    /* renamed from: a */
    private static final Unsafe f20414a;

    /* renamed from: b */
    private static final Class f20415b = uv3.m21878a();

    /* renamed from: c */
    private static final boolean f20416c;

    /* renamed from: d */
    private static final x04 f20417d;

    /* renamed from: e */
    private static final boolean f20418e;

    /* renamed from: f */
    private static final boolean f20419f;

    /* renamed from: g */
    static final long f20420g = ((long) m23653c(byte[].class));

    /* renamed from: h */
    private static final long f20421h;

    /* renamed from: i */
    static final boolean f20422i;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m23667q()
            f20414a = r7
            java.lang.Class r8 = com.google.android.gms.internal.ads.uv3.m21878a()
            f20415b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m23649G(r8)
            f20416c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m23649G(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.w04 r11 = new com.google.android.gms.internal.ads.w04
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.v04 r11 = new com.google.android.gms.internal.ads.v04
            r11.<init>(r7)
        L_0x003b:
            f20417d = r11
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
            sun.misc.Unsafe r11 = r11.f19930a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m23655e()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.y04.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f20418e = r8
            com.google.android.gms.internal.ads.x04 r8 = f20417d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f19930a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.y04.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f20419f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m23653c(r6)
            long r6 = (long) r6
            f20420g = r6
            m23653c(r5)
            m23654d(r5)
            m23653c(r4)
            m23654d(r4)
            m23653c(r3)
            m23654d(r3)
            m23653c(r2)
            m23654d(r2)
            m23653c(r1)
            m23654d(r1)
            m23653c(r0)
            m23654d(r0)
            java.lang.reflect.Field r0 = m23655e()
            r1 = -1
            if (r0 == 0) goto L_0x012d
            com.google.android.gms.internal.ads.x04 r3 = f20417d
            if (r3 != 0) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            long r1 = r3.mo15021n(r0)
        L_0x012d:
            f20421h = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r12 = 0
        L_0x0139:
            f20422i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y04.<clinit>():void");
    }

    private y04() {
    }

    /* renamed from: A */
    static void m23643A(Object obj, long j, float f) {
        f20417d.mo14654h(obj, j, f);
    }

    /* renamed from: B */
    static void m23644B(Object obj, long j, int i) {
        f20417d.mo15023p(obj, j, i);
    }

    /* renamed from: C */
    static void m23645C(Object obj, long j, long j2) {
        f20417d.mo15024q(obj, j, j2);
    }

    /* renamed from: D */
    static void m23646D(Object obj, long j, Object obj2) {
        f20417d.mo15025r(obj, j, obj2);
    }

    /* renamed from: E */
    static /* bridge */ /* synthetic */ boolean m23647E(Object obj, long j) {
        return ((byte) ((f20417d.mo15019l(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: F */
    static /* bridge */ /* synthetic */ boolean m23648F(Object obj, long j) {
        return ((byte) ((f20417d.mo15019l(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: G */
    static boolean m23649G(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = uv3.f18751a;
        try {
            Class cls3 = f20415b;
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

    /* renamed from: H */
    static boolean m23650H(Object obj, long j) {
        return f20417d.mo14655i(obj, j);
    }

    /* renamed from: a */
    static boolean m23651a() {
        return f20419f;
    }

    /* renamed from: b */
    static boolean m23652b() {
        return f20418e;
    }

    /* renamed from: c */
    private static int m23653c(Class cls) {
        if (f20419f) {
            return f20417d.mo15017j(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static int m23654d(Class cls) {
        if (f20419f) {
            return f20417d.mo15018k(cls);
        }
        return -1;
    }

    /* renamed from: e */
    private static Field m23655e() {
        int i = uv3.f18751a;
        Field f = m23656f(Buffer.class, "effectiveDirectAddress");
        if (f != null) {
            return f;
        }
        Field f2 = m23656f(Buffer.class, "address");
        if (f2 == null || f2.getType() != Long.TYPE) {
            return null;
        }
        return f2;
    }

    /* renamed from: f */
    private static Field m23656f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m23657g(Object obj, long j, byte b) {
        long j2 = -4 & j;
        x04 x04 = f20417d;
        int l = x04.mo15019l(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        x04.mo15023p(obj, j2, ((255 & b) << i) | (l & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static void m23658h(Object obj, long j, byte b) {
        long j2 = -4 & j;
        x04 x04 = f20417d;
        int i = (((int) j) & 3) << 3;
        x04.mo15023p(obj, j2, ((255 & b) << i) | (x04.mo15019l(obj, j2) & (~(255 << i))));
    }

    /* renamed from: i */
    static byte m23659i(long j) {
        return f20417d.mo14647a(j);
    }

    /* renamed from: j */
    static double m23660j(Object obj, long j) {
        return f20417d.mo14648b(obj, j);
    }

    /* renamed from: k */
    static float m23661k(Object obj, long j) {
        return f20417d.mo14649c(obj, j);
    }

    /* renamed from: l */
    static int m23662l(Object obj, long j) {
        return f20417d.mo15019l(obj, j);
    }

    /* renamed from: m */
    static long m23663m(ByteBuffer byteBuffer) {
        return f20417d.mo15020m(byteBuffer, f20421h);
    }

    /* renamed from: n */
    static long m23664n(Object obj, long j) {
        return f20417d.mo15020m(obj, j);
    }

    /* renamed from: o */
    static Object m23665o(Class cls) {
        try {
            return f20414a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    static Object m23666p(Object obj, long j) {
        return f20417d.mo15022o(obj, j);
    }

    /* renamed from: q */
    static Unsafe m23667q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new u04());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: w */
    static void m23673w(long j, byte[] bArr, long j2, long j3) {
        f20417d.mo14650d(j, bArr, j2, j3);
    }

    /* renamed from: x */
    static void m23674x(Object obj, long j, boolean z) {
        f20417d.mo14651e(obj, j, z);
    }

    /* renamed from: y */
    static void m23675y(byte[] bArr, long j, byte b) {
        f20417d.mo14652f(bArr, f20420g + j, b);
    }

    /* renamed from: z */
    static void m23676z(Object obj, long j, double d) {
        f20417d.mo14653g(obj, j, d);
    }
}
