package com.google.android.gms.internal.p026firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3197c5 {

    /* renamed from: a */
    private static final Unsafe f21861a;

    /* renamed from: b */
    private static final Class f21862b = C3687r0.m26661a();

    /* renamed from: c */
    private static final boolean f21863c;

    /* renamed from: d */
    private static final C3164b5 f21864d;

    /* renamed from: e */
    private static final boolean f21865e;

    /* renamed from: f */
    private static final boolean f21866f;

    /* renamed from: g */
    static final long f21867g = ((long) m25292E(byte[].class));

    /* renamed from: h */
    static final boolean f21868h;

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
            sun.misc.Unsafe r7 = m25304l()
            f21861a = r7
            java.lang.Class r8 = com.google.android.gms.internal.p026firebaseauthapi.C3687r0.m26661a()
            f21862b = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m25288A(r8)
            f21863c = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m25288A(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.google.android.gms.internal.firebase-auth-api.a5 r11 = new com.google.android.gms.internal.firebase-auth-api.a5
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.z4 r11 = new com.google.android.gms.internal.firebase-auth-api.z4
            r11.<init>(r7)
        L_0x003b:
            f21864d = r11
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
            sun.misc.Unsafe r11 = r11.f21773a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m25294b()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p026firebaseauthapi.C3197c5.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f21865e = r8
            com.google.android.gms.internal.firebase-auth-api.b5 r8 = f21864d
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f21773a
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
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.p026firebaseauthapi.C3197c5.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f21866f = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m25292E(r6)
            long r6 = (long) r6
            f21867g = r6
            m25292E(r5)
            m25293a(r5)
            m25292E(r4)
            m25293a(r4)
            m25292E(r3)
            m25293a(r3)
            m25292E(r2)
            m25293a(r2)
            m25292E(r1)
            m25293a(r1)
            m25292E(r0)
            m25293a(r0)
            java.lang.reflect.Field r0 = m25294b()
            if (r0 == 0) goto L_0x0129
            com.google.android.gms.internal.firebase-auth-api.b5 r1 = f21864d
            if (r1 == 0) goto L_0x0129
            r1.mo15775l(r0)
        L_0x0129:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r12 = 0
        L_0x0133:
            f21868h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3197c5.<clinit>():void");
    }

    private C3197c5() {
    }

    /* renamed from: A */
    static boolean m25288A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C3687r0.f22598a;
        try {
            Class cls3 = f21862b;
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
    static boolean m25289B(Object obj, long j) {
        return f21864d.mo15715g(obj, j);
    }

    /* renamed from: C */
    static boolean m25290C() {
        return f21866f;
    }

    /* renamed from: D */
    static boolean m25291D() {
        return f21865e;
    }

    /* renamed from: E */
    private static int m25292E(Class cls) {
        if (f21866f) {
            return f21864d.mo15771h(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m25293a(Class cls) {
        if (f21866f) {
            return f21864d.mo15772i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m25294b() {
        int i = C3687r0.f22598a;
        Field c = m25295c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m25295c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m25295c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m25296d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C3164b5 b5Var = f21864d;
        int j3 = b5Var.mo15773j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        b5Var.mo15777n(obj, j2, ((255 & b) << i) | (j3 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m25297e(Object obj, long j, byte b) {
        long j2 = -4 & j;
        C3164b5 b5Var = f21864d;
        int i = (((int) j) & 3) << 3;
        b5Var.mo15777n(obj, j2, ((255 & b) << i) | (b5Var.mo15773j(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    static double m25298f(Object obj, long j) {
        return f21864d.mo15709a(obj, j);
    }

    /* renamed from: g */
    static float m25299g(Object obj, long j) {
        return f21864d.mo15710b(obj, j);
    }

    /* renamed from: h */
    static int m25300h(Object obj, long j) {
        return f21864d.mo15773j(obj, j);
    }

    /* renamed from: i */
    static long m25301i(Object obj, long j) {
        return f21864d.mo15774k(obj, j);
    }

    /* renamed from: j */
    static Object m25302j(Class cls) {
        try {
            return f21861a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m25303k(Object obj, long j) {
        return f21864d.mo15776m(obj, j);
    }

    /* renamed from: l */
    static Unsafe m25304l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C3919y4());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m25310r(Object obj, long j, boolean z) {
        f21864d.mo15711c(obj, j, z);
    }

    /* renamed from: s */
    static void m25311s(byte[] bArr, long j, byte b) {
        f21864d.mo15712d(bArr, f21867g + j, b);
    }

    /* renamed from: t */
    static void m25312t(Object obj, long j, double d) {
        f21864d.mo15713e(obj, j, d);
    }

    /* renamed from: u */
    static void m25313u(Object obj, long j, float f) {
        f21864d.mo15714f(obj, j, f);
    }

    /* renamed from: v */
    static void m25314v(Object obj, long j, int i) {
        f21864d.mo15777n(obj, j, i);
    }

    /* renamed from: w */
    static void m25315w(Object obj, long j, long j2) {
        f21864d.mo15778o(obj, j, j2);
    }

    /* renamed from: x */
    static void m25316x(Object obj, long j, Object obj2) {
        f21864d.mo15779p(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m25317y(Object obj, long j) {
        return ((byte) ((f21864d.mo15773j(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m25318z(Object obj, long j) {
        return ((byte) ((f21864d.mo15773j(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
