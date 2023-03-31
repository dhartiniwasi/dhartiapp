package p120q2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p021c2.C1842c;
import p177z1.C6272r1;

/* renamed from: q2.l */
/* compiled from: MediaCodecAdapter */
public interface C5376l {

    /* renamed from: q2.l$a */
    /* compiled from: MediaCodecAdapter */
    public static final class C5377a {

        /* renamed from: a */
        public final C5381n f27507a;

        /* renamed from: b */
        public final MediaFormat f27508b;

        /* renamed from: c */
        public final C6272r1 f27509c;

        /* renamed from: d */
        public final Surface f27510d;

        /* renamed from: e */
        public final MediaCrypto f27511e;

        /* renamed from: f */
        public final int f27512f;

        private C5377a(C5381n nVar, MediaFormat mediaFormat, C6272r1 r1Var, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.f27507a = nVar;
            this.f27508b = mediaFormat;
            this.f27509c = r1Var;
            this.f27510d = surface;
            this.f27511e = mediaCrypto;
            this.f27512f = i;
        }

        /* renamed from: a */
        public static C5377a m32926a(C5381n nVar, MediaFormat mediaFormat, C6272r1 r1Var, MediaCrypto mediaCrypto) {
            return new C5377a(nVar, mediaFormat, r1Var, (Surface) null, mediaCrypto, 0);
        }

        /* renamed from: b */
        public static C5377a m32927b(C5381n nVar, MediaFormat mediaFormat, C6272r1 r1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new C5377a(nVar, mediaFormat, r1Var, surface, mediaCrypto, 0);
        }
    }

    /* renamed from: q2.l$b */
    /* compiled from: MediaCodecAdapter */
    public interface C5378b {
        /* renamed from: a */
        C5376l mo19446a(C5377a aVar) throws IOException;
    }

    /* renamed from: q2.l$c */
    /* compiled from: MediaCodecAdapter */
    public interface C5379c {
        /* renamed from: a */
        void mo19479a(C5376l lVar, long j, long j2);
    }

    /* renamed from: a */
    void mo19430a();

    /* renamed from: b */
    boolean mo19431b();

    /* renamed from: c */
    void mo19432c(int i, int i2, C1842c cVar, long j, int i3);

    /* renamed from: d */
    void mo19433d(C5379c cVar, Handler handler);

    /* renamed from: e */
    MediaFormat mo19434e();

    /* renamed from: f */
    void mo19435f(Bundle bundle);

    void flush();

    /* renamed from: g */
    void mo19437g(int i, long j);

    /* renamed from: h */
    int mo19438h();

    /* renamed from: i */
    int mo19439i(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: j */
    void mo19440j(int i, boolean z);

    /* renamed from: k */
    void mo19441k(int i);

    /* renamed from: l */
    ByteBuffer mo19442l(int i);

    /* renamed from: m */
    void mo19443m(Surface surface);

    /* renamed from: n */
    void mo19444n(int i, int i2, int i3, long j, int i4);

    /* renamed from: o */
    ByteBuffer mo19445o(int i);
}
