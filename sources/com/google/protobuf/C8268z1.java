package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.z1 */
/* compiled from: UnsafeUtil */
final class C8268z1 {

    /* renamed from: a */
    private static final Unsafe f35217a = m45985H();

    /* renamed from: b */
    private static final Class<?> f35218b = C8118d.m44647b();

    /* renamed from: c */
    private static final boolean f35219c = m46018q(Long.TYPE);

    /* renamed from: d */
    private static final boolean f35220d = m46018q(Integer.TYPE);

    /* renamed from: e */
    private static final C8273e f35221e = m45983F();

    /* renamed from: f */
    private static final boolean f35222f = m46001X();

    /* renamed from: g */
    private static final boolean f35223g = m46000W();

    /* renamed from: h */
    static final long f35224h;

    /* renamed from: i */
    private static final long f35225i;

    /* renamed from: j */
    private static final long f35226j;

    /* renamed from: k */
    private static final long f35227k;

    /* renamed from: l */
    private static final long f35228l;

    /* renamed from: m */
    private static final long f35229m;

    /* renamed from: n */
    private static final long f35230n;

    /* renamed from: o */
    private static final long f35231o;

    /* renamed from: p */
    private static final long f35232p;

    /* renamed from: q */
    private static final long f35233q;

    /* renamed from: r */
    private static final long f35234r;

    /* renamed from: s */
    private static final long f35235s;

    /* renamed from: t */
    private static final long f35236t;

    /* renamed from: u */
    private static final long f35237u = m46020s(m46016o());

    /* renamed from: v */
    private static final int f35238v;

    /* renamed from: w */
    static final boolean f35239w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.protobuf.z1$a */
    /* compiled from: UnsafeUtil */
    static class C8269a implements PrivilegedExceptionAction<Unsafe> {
        C8269a() {
        }

        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.protobuf.z1$b */
    /* compiled from: UnsafeUtil */
    private static final class C8270b extends C8273e {
        C8270b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo27456c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo27457d(Object obj, long j) {
            if (C8268z1.f35239w) {
                return C8268z1.m46022u(obj, j);
            }
            return C8268z1.m46023v(obj, j);
        }

        /* renamed from: e */
        public byte mo27458e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo27459f(Object obj, long j) {
            if (C8268z1.f35239w) {
                return C8268z1.m46026y(obj, j);
            }
            return C8268z1.m46027z(obj, j);
        }

        /* renamed from: g */
        public double mo27460g(Object obj, long j) {
            return Double.longBitsToDouble(mo27472k(obj, j));
        }

        /* renamed from: h */
        public float mo27461h(Object obj, long j) {
            return Float.intBitsToFloat(mo27471i(obj, j));
        }

        /* renamed from: j */
        public long mo27462j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo27463n(Object obj, long j, boolean z) {
            if (C8268z1.f35239w) {
                C8268z1.m45990M(obj, j, z);
            } else {
                C8268z1.m45991N(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo27464o(Object obj, long j, byte b) {
            if (C8268z1.f35239w) {
                C8268z1.m45993P(obj, j, b);
            } else {
                C8268z1.m45994Q(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo27465p(Object obj, long j, double d) {
            mo27476s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo27466q(Object obj, long j, float f) {
            mo27475r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo27467v() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.z1$c */
    /* compiled from: UnsafeUtil */
    private static final class C8271c extends C8273e {
        C8271c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo27456c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo27457d(Object obj, long j) {
            if (C8268z1.f35239w) {
                return C8268z1.m46022u(obj, j);
            }
            return C8268z1.m46023v(obj, j);
        }

        /* renamed from: e */
        public byte mo27458e(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public byte mo27459f(Object obj, long j) {
            if (C8268z1.f35239w) {
                return C8268z1.m46026y(obj, j);
            }
            return C8268z1.m46027z(obj, j);
        }

        /* renamed from: g */
        public double mo27460g(Object obj, long j) {
            return Double.longBitsToDouble(mo27472k(obj, j));
        }

        /* renamed from: h */
        public float mo27461h(Object obj, long j) {
            return Float.intBitsToFloat(mo27471i(obj, j));
        }

        /* renamed from: j */
        public long mo27462j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: n */
        public void mo27463n(Object obj, long j, boolean z) {
            if (C8268z1.f35239w) {
                C8268z1.m45990M(obj, j, z);
            } else {
                C8268z1.m45991N(obj, j, z);
            }
        }

        /* renamed from: o */
        public void mo27464o(Object obj, long j, byte b) {
            if (C8268z1.f35239w) {
                C8268z1.m45993P(obj, j, b);
            } else {
                C8268z1.m45994Q(obj, j, b);
            }
        }

        /* renamed from: p */
        public void mo27465p(Object obj, long j, double d) {
            mo27476s(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: q */
        public void mo27466q(Object obj, long j, float f) {
            mo27475r(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public boolean mo27467v() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.z1$d */
    /* compiled from: UnsafeUtil */
    private static final class C8272d extends C8273e {
        C8272d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public void mo27456c(long j, byte[] bArr, long j2, long j3) {
            this.f35240a.copyMemory((Object) null, j, bArr, C8268z1.f35224h + j2, j3);
        }

        /* renamed from: d */
        public boolean mo27457d(Object obj, long j) {
            return this.f35240a.getBoolean(obj, j);
        }

        /* renamed from: e */
        public byte mo27458e(long j) {
            return this.f35240a.getByte(j);
        }

        /* renamed from: f */
        public byte mo27459f(Object obj, long j) {
            return this.f35240a.getByte(obj, j);
        }

        /* renamed from: g */
        public double mo27460g(Object obj, long j) {
            return this.f35240a.getDouble(obj, j);
        }

        /* renamed from: h */
        public float mo27461h(Object obj, long j) {
            return this.f35240a.getFloat(obj, j);
        }

        /* renamed from: j */
        public long mo27462j(long j) {
            return this.f35240a.getLong(j);
        }

        /* renamed from: n */
        public void mo27463n(Object obj, long j, boolean z) {
            this.f35240a.putBoolean(obj, j, z);
        }

        /* renamed from: o */
        public void mo27464o(Object obj, long j, byte b) {
            this.f35240a.putByte(obj, j, b);
        }

        /* renamed from: p */
        public void mo27465p(Object obj, long j, double d) {
            this.f35240a.putDouble(obj, j, d);
        }

        /* renamed from: q */
        public void mo27466q(Object obj, long j, float f) {
            this.f35240a.putFloat(obj, j, f);
        }

        /* renamed from: u */
        public boolean mo27468u() {
            Class<Object> cls = Object.class;
            if (!super.mo27468u()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f35240a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C8268z1.m45988K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo27467v() {
            Class<Object> cls = Object.class;
            if (!super.mo27467v()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f35240a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                C8268z1.m45988K(th);
                return false;
            }
        }
    }

    /* renamed from: com.google.protobuf.z1$e */
    /* compiled from: UnsafeUtil */
    private static abstract class C8273e {

        /* renamed from: a */
        Unsafe f35240a;

        C8273e(Unsafe unsafe) {
            this.f35240a = unsafe;
        }

        /* renamed from: a */
        public final int mo27469a(Class<?> cls) {
            return this.f35240a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo27470b(Class<?> cls) {
            return this.f35240a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo27456c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo27457d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo27458e(long j);

        /* renamed from: f */
        public abstract byte mo27459f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo27460g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo27461h(Object obj, long j);

        /* renamed from: i */
        public final int mo27471i(Object obj, long j) {
            return this.f35240a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo27462j(long j);

        /* renamed from: k */
        public final long mo27472k(Object obj, long j) {
            return this.f35240a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object mo27473l(Object obj, long j) {
            return this.f35240a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long mo27474m(Field field) {
            return this.f35240a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo27463n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo27464o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo27465p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo27466q(Object obj, long j, float f);

        /* renamed from: r */
        public final void mo27475r(Object obj, long j, int i) {
            this.f35240a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void mo27476s(Object obj, long j, long j2) {
            this.f35240a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void mo27477t(Object obj, long j, Object obj2) {
            this.f35240a.putObject(obj, j, obj2);
        }

        /* renamed from: u */
        public boolean mo27468u() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f35240a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                C8268z1.m45988K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo27467v() {
            Unsafe unsafe = this.f35240a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (C8268z1.m46016o() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C8268z1.m45988K(th);
                return false;
            }
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long m = (long) m46014m(byte[].class);
        f35224h = m;
        f35225i = (long) m46014m(cls6);
        f35226j = (long) m46015n(cls6);
        f35227k = (long) m46014m(cls5);
        f35228l = (long) m46015n(cls5);
        f35229m = (long) m46014m(cls4);
        f35230n = (long) m46015n(cls4);
        f35231o = (long) m46014m(cls3);
        f35232p = (long) m46015n(cls3);
        f35233q = (long) m46014m(cls2);
        f35234r = (long) m46015n(cls2);
        f35235s = (long) m46014m(cls);
        f35236t = (long) m46015n(cls);
        f35238v = (int) (7 & m);
    }

    private C8268z1() {
    }

    /* renamed from: A */
    static double m45978A(Object obj, long j) {
        return f35221e.mo27460g(obj, j);
    }

    /* renamed from: B */
    static float m45979B(Object obj, long j) {
        return f35221e.mo27461h(obj, j);
    }

    /* renamed from: C */
    static int m45980C(Object obj, long j) {
        return f35221e.mo27471i(obj, j);
    }

    /* renamed from: D */
    static long m45981D(long j) {
        return f35221e.mo27462j(j);
    }

    /* renamed from: E */
    static long m45982E(Object obj, long j) {
        return f35221e.mo27472k(obj, j);
    }

    /* renamed from: F */
    private static C8273e m45983F() {
        Unsafe unsafe = f35217a;
        if (unsafe == null) {
            return null;
        }
        if (!C8118d.m44648c()) {
            return new C8272d(unsafe);
        }
        if (f35219c) {
            return new C8271c(unsafe);
        }
        if (f35220d) {
            return new C8270b(unsafe);
        }
        return null;
    }

    /* renamed from: G */
    static Object m45984G(Object obj, long j) {
        return f35221e.mo27473l(obj, j);
    }

    /* renamed from: H */
    static Unsafe m45985H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8269a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    static boolean m45986I() {
        return f35223g;
    }

    /* renamed from: J */
    static boolean m45987J() {
        return f35222f;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static void m45988K(Throwable th) {
        Logger logger = Logger.getLogger(C8268z1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: L */
    static void m45989L(Object obj, long j, boolean z) {
        f35221e.mo27463n(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static void m45990M(Object obj, long j, boolean z) {
        m45993P(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static void m45991N(Object obj, long j, boolean z) {
        m45994Q(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: O */
    static void m45992O(byte[] bArr, long j, byte b) {
        f35221e.mo27464o(bArr, f35224h + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static void m45993P(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int C = m45980C(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m45997T(obj, j2, ((255 & b) << i) | (C & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static void m45994Q(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m45997T(obj, j2, ((255 & b) << i) | (m45980C(obj, j2) & (~(255 << i))));
    }

    /* renamed from: R */
    static void m45995R(Object obj, long j, double d) {
        f35221e.mo27465p(obj, j, d);
    }

    /* renamed from: S */
    static void m45996S(Object obj, long j, float f) {
        f35221e.mo27466q(obj, j, f);
    }

    /* renamed from: T */
    static void m45997T(Object obj, long j, int i) {
        f35221e.mo27475r(obj, j, i);
    }

    /* renamed from: U */
    static void m45998U(Object obj, long j, long j2) {
        f35221e.mo27476s(obj, j, j2);
    }

    /* renamed from: V */
    static void m45999V(Object obj, long j, Object obj2) {
        f35221e.mo27477t(obj, j, obj2);
    }

    /* renamed from: W */
    private static boolean m46000W() {
        C8273e eVar = f35221e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo27468u();
    }

    /* renamed from: X */
    private static boolean m46001X() {
        C8273e eVar = f35221e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo27467v();
    }

    /* renamed from: k */
    static long m46012k(ByteBuffer byteBuffer) {
        return f35221e.mo27472k(byteBuffer, f35237u);
    }

    /* renamed from: l */
    static <T> T m46013l(Class<T> cls) {
        try {
            return f35217a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    private static int m46014m(Class<?> cls) {
        if (f35223g) {
            return f35221e.mo27469a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    private static int m46015n(Class<?> cls) {
        if (f35223g) {
            return f35221e.mo27470b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static Field m46016o() {
        Field r;
        if (C8118d.m44648c() && (r = m46019r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r;
        }
        Field r2 = m46019r(Buffer.class, "address");
        if (r2 == null || r2.getType() != Long.TYPE) {
            return null;
        }
        return r2;
    }

    /* renamed from: p */
    static void m46017p(long j, byte[] bArr, long j2, long j3) {
        f35221e.mo27456c(j, bArr, j2, j3);
    }

    /* renamed from: q */
    static boolean m46018q(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C8118d.m44648c()) {
            return false;
        }
        try {
            Class<?> cls3 = f35218b;
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

    /* renamed from: r */
    private static Field m46019r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    private static long m46020s(Field field) {
        C8273e eVar;
        if (field == null || (eVar = f35221e) == null) {
            return -1;
        }
        return eVar.mo27474m(field);
    }

    /* renamed from: t */
    static boolean m46021t(Object obj, long j) {
        return f35221e.mo27457d(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static boolean m46022u(Object obj, long j) {
        return m46026y(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static boolean m46023v(Object obj, long j) {
        return m46027z(obj, j) != 0;
    }

    /* renamed from: w */
    static byte m46024w(long j) {
        return f35221e.mo27458e(j);
    }

    /* renamed from: x */
    static byte m46025x(byte[] bArr, long j) {
        return f35221e.mo27459f(bArr, f35224h + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static byte m46026y(Object obj, long j) {
        return (byte) ((m45980C(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static byte m46027z(Object obj, long j) {
        return (byte) ((m45980C(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }
}
