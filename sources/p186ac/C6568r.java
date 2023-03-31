package p186ac;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: ac.r */
/* compiled from: StandardMessageCodec */
public class C6568r implements C6554i<Object> {

    /* renamed from: a */
    public static final C6568r f31011a = new C6568r();

    /* renamed from: b */
    private static final boolean f31012b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c */
    private static final Charset f31013c = Charset.forName("UTF8");

    /* renamed from: ac.r$a */
    /* compiled from: StandardMessageCodec */
    static final class C6569a extends ByteArrayOutputStream {
        C6569a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte[] mo22178a() {
            return this.buf;
        }
    }

    /* renamed from: c */
    protected static final void m38100c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    /* renamed from: d */
    protected static final byte[] m38101d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m38102e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    protected static final int m38102e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get() & 255;
            if (b < 254) {
                return b;
            }
            if (b == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: h */
    protected static final void m38103h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: i */
    protected static final void m38104i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m38110o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    protected static final void m38105j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f31012b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: k */
    protected static final void m38106k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m38109n(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    /* renamed from: l */
    protected static final void m38107l(ByteArrayOutputStream byteArrayOutputStream, float f) {
        m38108m(byteArrayOutputStream, Float.floatToIntBits(f));
    }

    /* renamed from: m */
    protected static final void m38108m(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f31012b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: n */
    protected static final void m38109n(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f31012b) {
            byteArrayOutputStream.write((byte) ((int) j));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j));
    }

    /* renamed from: o */
    protected static final void m38110o(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            m38105j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m38108m(byteArrayOutputStream, i);
        }
    }

    /* renamed from: a */
    public ByteBuffer mo22147a(Object obj) {
        if (obj == null) {
            return null;
        }
        C6569a aVar = new C6569a();
        mo22177p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo22178a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: b */
    public Object mo22148b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = mo22175f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo22175f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo22176g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.Map, java.util.HashMap] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo22176g(byte r5, java.nio.ByteBuffer r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 4
            r2 = 8
            switch(r5) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00de;
                case 5: goto L_0x00cb;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00ae;
                case 9: goto L_0x0093;
                case 10: goto L_0x0078;
                case 11: goto L_0x005c;
                case 12: goto L_0x0044;
                case 13: goto L_0x002b;
                case 14: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Message corrupted"
            r5.<init>(r6)
            throw r5
        L_0x000f:
            int r5 = m38102e(r6)
            float[] r0 = new float[r5]
            m38100c(r6, r1)
            java.nio.FloatBuffer r2 = r6.asFloatBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * 4
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00f7
        L_0x002b:
            int r5 = m38102e(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0034:
            if (r0 >= r5) goto L_0x0059
            java.lang.Object r2 = r4.mo22175f(r6)
            java.lang.Object r3 = r4.mo22175f(r6)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L_0x0034
        L_0x0044:
            int r5 = m38102e(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x004d:
            if (r0 >= r5) goto L_0x0059
            java.lang.Object r2 = r4.mo22175f(r6)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x004d
        L_0x0059:
            r0 = r1
            goto L_0x00f7
        L_0x005c:
            int r5 = m38102e(r6)
            double[] r0 = new double[r5]
            m38100c(r6, r2)
            java.nio.DoubleBuffer r1 = r6.asDoubleBuffer()
            r1.get(r0)
            int r1 = r6.position()
            int r5 = r5 * 8
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00f7
        L_0x0078:
            int r5 = m38102e(r6)
            long[] r0 = new long[r5]
            m38100c(r6, r2)
            java.nio.LongBuffer r1 = r6.asLongBuffer()
            r1.get(r0)
            int r1 = r6.position()
            int r5 = r5 * 8
            int r1 = r1 + r5
            r6.position(r1)
            goto L_0x00f7
        L_0x0093:
            int r5 = m38102e(r6)
            int[] r0 = new int[r5]
            m38100c(r6, r1)
            java.nio.IntBuffer r2 = r6.asIntBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * 4
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00f7
        L_0x00ae:
            byte[] r0 = m38101d(r6)
            goto L_0x00f7
        L_0x00b3:
            byte[] r5 = m38101d(r6)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r6 = f31013c
            r0.<init>(r5, r6)
            goto L_0x00f7
        L_0x00bf:
            m38100c(r6, r2)
            double r5 = r6.getDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x00f7
        L_0x00cb:
            byte[] r5 = m38101d(r6)
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r1 = f31013c
            r6.<init>(r5, r1)
            r5 = 16
            r0.<init>(r6, r5)
            goto L_0x00f7
        L_0x00de:
            long r5 = r6.getLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x00f7
        L_0x00e7:
            int r5 = r6.getInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x00f7
        L_0x00f0:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x00f7
        L_0x00f3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x00f7
        L_0x00f6:
            r0 = 0
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p186ac.C6568r.mo22176g(byte, java.nio.ByteBuffer):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22177p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals((Object) null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m38108m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m38109n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                m38103h(byteArrayOutputStream, 8);
                m38106k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                m38104i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f31013c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            m38104i(byteArrayOutputStream, obj.toString().getBytes(f31013c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m38104i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m38110o(byteArrayOutputStream, iArr.length);
            m38103h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                m38108m(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m38110o(byteArrayOutputStream, jArr.length);
            m38103h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                m38109n(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m38110o(byteArrayOutputStream, dArr.length);
            m38103h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                m38106k(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            m38110o(byteArrayOutputStream, list.size());
            for (Object p : list) {
                mo22177p(byteArrayOutputStream, p);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            m38110o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                mo22177p(byteArrayOutputStream, entry.getKey());
                mo22177p(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            m38110o(byteArrayOutputStream, fArr.length);
            m38103h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i < length4) {
                m38107l(byteArrayOutputStream, fArr[i]);
                i++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }
}
