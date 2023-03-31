package p161w3;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p167x3.C6053c;

/* renamed from: w3.u */
/* compiled from: MediaFormatUtil */
public final class C5966u {
    /* renamed from: a */
    public static void m35232a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m35233b(MediaFormat mediaFormat, C6053c cVar) {
        if (cVar != null) {
            m35235d(mediaFormat, "color-transfer", cVar.f29334c);
            m35235d(mediaFormat, "color-standard", cVar.f29332a);
            m35235d(mediaFormat, "color-range", cVar.f29333b);
            m35232a(mediaFormat, "hdr-static-info", cVar.f29335d);
        }
    }

    /* renamed from: c */
    public static void m35234c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m35235d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m35236e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
