package p186ac;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ac.t */
/* compiled from: StringCodec */
public final class C6571t implements C6554i<String> {

    /* renamed from: a */
    private static final Charset f31016a = Charset.forName("UTF8");

    /* renamed from: b */
    public static final C6571t f31017b = new C6571t();

    private C6571t() {
    }

    /* renamed from: c */
    public String mo22148b(ByteBuffer byteBuffer) {
        int i;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f31016a);
    }

    /* renamed from: d */
    public ByteBuffer mo22147a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f31016a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
