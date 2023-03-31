package p014b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p161w3.C5953m0;

/* renamed from: b2.g */
/* compiled from: AudioProcessor */
public interface C1637g {

    /* renamed from: a */
    public static final ByteBuffer f4700a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: b2.g$a */
    /* compiled from: AudioProcessor */
    public static final class C1638a {

        /* renamed from: e */
        public static final C1638a f4701e = new C1638a(-1, -1, -1);

        /* renamed from: a */
        public final int f4702a;

        /* renamed from: b */
        public final int f4703b;

        /* renamed from: c */
        public final int f4704c;

        /* renamed from: d */
        public final int f4705d;

        public C1638a(int i, int i2, int i3) {
            this.f4702a = i;
            this.f4703b = i2;
            this.f4704c = i3;
            this.f4705d = C5953m0.m35159t0(i3) ? C5953m0.m35127d0(i3, i2) : -1;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f4702a + ", channelCount=" + this.f4703b + ", encoding=" + this.f4704c + ']';
        }
    }

    /* renamed from: b2.g$b */
    /* compiled from: AudioProcessor */
    public static final class C1639b extends Exception {
        public C1639b(C1638a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: b */
    boolean mo6512b();

    /* renamed from: d */
    boolean mo6513d();

    /* renamed from: e */
    ByteBuffer mo6514e();

    /* renamed from: f */
    void mo6456f(ByteBuffer byteBuffer);

    void flush();

    /* renamed from: g */
    C1638a mo6516g(C1638a aVar) throws C1639b;

    /* renamed from: h */
    void mo6517h();

    void reset();
}
