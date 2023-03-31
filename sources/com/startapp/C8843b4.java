package com.startapp;

import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: com.startapp.b4 */
/* compiled from: Sta */
public class C8843b4 {

    /* renamed from: b */
    private static final int f36443b = 65507;

    /* renamed from: c */
    public static final byte f36444c = 8;

    /* renamed from: d */
    public static final byte f36445d = Byte.MIN_VALUE;

    /* renamed from: e */
    private static final byte f36446e = 0;

    /* renamed from: f */
    public static final int f36447f = 8;

    /* renamed from: a */
    private final byte f36448a;

    public C8843b4(byte b) {
        this.f36448a = b;
    }

    /* renamed from: a */
    public ByteBuffer mo29130a(short s, short s2, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        } else if (bArr.length > f36443b) {
            bArr = m48314a(f36443b);
        }
        int length = bArr.length + 8;
        byte[] bArr2 = new byte[length];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.put(this.f36448a);
        wrap.put(f36446e);
        int position = wrap.position();
        wrap.position(position + 2);
        wrap.putShort(s2);
        wrap.putShort(s);
        wrap.put(bArr);
        wrap.putShort(position, m48313a(bArr2, length));
        wrap.flip();
        return wrap;
    }

    /* renamed from: a */
    private static short m48313a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            int i4 = i2 + ((bArr[i3] & 255) << 8);
            i2 = (i4 >> 16) + (65535 & i4);
        }
        for (int i5 = 1; i5 < i; i5 += 2) {
            int i6 = i2 + (bArr[i5] & 255);
            i2 = (i6 >> 16) + (i6 & 65535);
        }
        return (short) (((i2 & 65535) + (i2 >> 16)) ^ 65535);
    }

    /* renamed from: a */
    public static byte[] m48314a(int i) {
        byte[] bArr = new byte[i];
        new Random().nextBytes(bArr);
        return bArr;
    }
}
