package p120q2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p021c2.C1842c;
import p120q2.C5376l;
import p161w3.C5917a;
import p161w3.C5945j0;
import p161w3.C5953m0;

/* renamed from: q2.x */
/* compiled from: SynchronousMediaCodecAdapter */
public final class C5394x implements C5376l {

    /* renamed from: a */
    private final MediaCodec f27611a;

    /* renamed from: b */
    private ByteBuffer[] f27612b;

    /* renamed from: c */
    private ByteBuffer[] f27613c;

    /* renamed from: q2.x$b */
    /* compiled from: SynchronousMediaCodecAdapter */
    public static class C5396b implements C5376l.C5378b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p120q2.C5376l mo19446a(p120q2.C5376l.C5377a r6) throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.mo19521b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                p161w3.C5945j0.m35044a(r2)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f27508b     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f27510d     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f27511e     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                int r6 = r6.f27512f     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                p161w3.C5945j0.m35046c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                p161w3.C5945j0.m35044a(r6)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                p161w3.C5945j0.m35046c()     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                q2.x r6 = new q2.x     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                r6.<init>(r1)     // Catch:{ IOException -> 0x002b, RuntimeException -> 0x0029 }
                return r6
            L_0x0029:
                r6 = move-exception
                goto L_0x002c
            L_0x002b:
                r6 = move-exception
            L_0x002c:
                r0 = r1
                goto L_0x0031
            L_0x002e:
                r6 = move-exception
                goto L_0x0031
            L_0x0030:
                r6 = move-exception
            L_0x0031:
                if (r0 == 0) goto L_0x0036
                r0.release()
            L_0x0036:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q2.C5394x.C5396b.mo19446a(q2.l$a):q2.l");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public MediaCodec mo19521b(C5376l.C5377a aVar) throws IOException {
            C5917a.m34872e(aVar.f27507a);
            String str = aVar.f27507a.f27515a;
            C5945j0.m35044a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C5945j0.m35046c();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m33116q(C5376l.C5379c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo19479a(this, j, j2);
    }

    /* renamed from: a */
    public void mo19430a() {
        this.f27612b = null;
        this.f27613c = null;
        this.f27611a.release();
    }

    /* renamed from: b */
    public boolean mo19431b() {
        return false;
    }

    /* renamed from: c */
    public void mo19432c(int i, int i2, C1842c cVar, long j, int i3) {
        this.f27611a.queueSecureInputBuffer(i, i2, cVar.mo7038a(), j, i3);
    }

    /* renamed from: d */
    public void mo19433d(C5376l.C5379c cVar, Handler handler) {
        this.f27611a.setOnFrameRenderedListener(new C12189w(this, cVar), handler);
    }

    /* renamed from: e */
    public MediaFormat mo19434e() {
        return this.f27611a.getOutputFormat();
    }

    /* renamed from: f */
    public void mo19435f(Bundle bundle) {
        this.f27611a.setParameters(bundle);
    }

    public void flush() {
        this.f27611a.flush();
    }

    /* renamed from: g */
    public void mo19437g(int i, long j) {
        this.f27611a.releaseOutputBuffer(i, j);
    }

    /* renamed from: h */
    public int mo19438h() {
        return this.f27611a.dequeueInputBuffer(0);
    }

    /* renamed from: i */
    public int mo19439i(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f27611a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && C5953m0.f29110a < 21) {
                this.f27613c = this.f27611a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: j */
    public void mo19440j(int i, boolean z) {
        this.f27611a.releaseOutputBuffer(i, z);
    }

    /* renamed from: k */
    public void mo19441k(int i) {
        this.f27611a.setVideoScalingMode(i);
    }

    /* renamed from: l */
    public ByteBuffer mo19442l(int i) {
        if (C5953m0.f29110a >= 21) {
            return this.f27611a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) C5953m0.m35138j(this.f27612b))[i];
    }

    /* renamed from: m */
    public void mo19443m(Surface surface) {
        this.f27611a.setOutputSurface(surface);
    }

    /* renamed from: n */
    public void mo19444n(int i, int i2, int i3, long j, int i4) {
        this.f27611a.queueInputBuffer(i, i2, i3, j, i4);
    }

    /* renamed from: o */
    public ByteBuffer mo19445o(int i) {
        if (C5953m0.f29110a >= 21) {
            return this.f27611a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) C5953m0.m35138j(this.f27613c))[i];
    }

    private C5394x(MediaCodec mediaCodec) {
        this.f27611a = mediaCodec;
        if (C5953m0.f29110a < 21) {
            this.f27612b = mediaCodec.getInputBuffers();
            this.f27613c = mediaCodec.getOutputBuffers();
        }
    }
}
