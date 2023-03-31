package p373ue;

import android.media.MediaDataSource;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.C11669k;

/* renamed from: ue.b */
/* compiled from: ByteDataSource.kt */
public final class C12760b extends MediaDataSource {

    /* renamed from: a */
    private final byte[] f46720a;

    public C12760b(byte[] bArr) {
        C11669k.m56787e(bArr, JsonStorageKeyNames.DATA_KEY);
        this.f46720a = bArr;
    }

    public synchronized void close() {
    }

    public synchronized long getSize() {
        return (long) this.f46720a.length;
    }

    public synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        C11669k.m56787e(bArr, "buffer");
        byte[] bArr2 = this.f46720a;
        if (j >= ((long) bArr2.length)) {
            return -1;
        }
        if (((long) i2) + j > ((long) bArr2.length)) {
            i2 -= (((int) j) + i2) - bArr2.length;
        }
        System.arraycopy(bArr2, (int) j, bArr, i, i2);
        return i2;
    }
}
