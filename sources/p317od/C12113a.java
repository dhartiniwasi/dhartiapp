package p317od;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C11669k;

/* renamed from: od.a */
/* compiled from: IOStreams.kt */
public final class C12113a {
    /* renamed from: a */
    public static final long m58231a(InputStream inputStream, OutputStream outputStream, int i) {
        C11669k.m56787e(inputStream, "<this>");
        C11669k.m56787e(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m58232b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m58231a(inputStream, outputStream, i);
    }
}
