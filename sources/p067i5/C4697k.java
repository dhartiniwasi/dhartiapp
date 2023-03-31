package p067i5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: i5.k */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4697k {
    /* renamed from: a */
    public static void m30405a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m30406b(InputStream inputStream, OutputStream outputStream) throws IOException {
        return m30407c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    /* renamed from: c */
    public static long m30407c(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m30405a(inputStream);
                    m30405a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m30405a(inputStream);
            m30405a(outputStream);
        }
        return j;
    }

    @Deprecated
    /* renamed from: d */
    public static byte[] m30408d(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m30407c(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
