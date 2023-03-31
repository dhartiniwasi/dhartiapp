package p264io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: io.flutter.embedding.android.n */
/* compiled from: KeyData */
public class C10654n {

    /* renamed from: a */
    long f41817a;

    /* renamed from: b */
    C10655a f41818b;

    /* renamed from: c */
    long f41819c;

    /* renamed from: d */
    long f41820d;

    /* renamed from: e */
    boolean f41821e;

    /* renamed from: f */
    String f41822f;

    /* renamed from: io.flutter.embedding.android.n$a */
    /* compiled from: KeyData */
    public enum C10655a {
        kDown(0),
        kUp(1),
        kRepeat(2);
        

        /* renamed from: a */
        private long f41827a;

        private C10655a(long j) {
            this.f41827a = j;
        }

        /* renamed from: a */
        public long mo33983a() {
            return this.f41827a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo33982a() {
        int i;
        try {
            String str = this.f41822f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            if (bytes == null) {
                i = 0;
            } else {
                i = bytes.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong((long) i);
            allocateDirect.putLong(this.f41817a);
            allocateDirect.putLong(this.f41818b.mo33983a());
            allocateDirect.putLong(this.f41819c);
            allocateDirect.putLong(this.f41820d);
            allocateDirect.putLong(this.f41821e ? 1 : 0);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
