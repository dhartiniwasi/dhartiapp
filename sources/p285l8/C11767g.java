package p285l8;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: l8.g */
/* compiled from: RandomFidGenerator */
public class C11767g {

    /* renamed from: a */
    private static final byte f44386a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f44387b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m57071b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m57072c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo36003a() {
        byte[] c = m57072c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f44387b & c[0]) | f44386a);
        return m57071b(c);
    }
}
