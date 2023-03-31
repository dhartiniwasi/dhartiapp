package p120q2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import p021c2.C1842c;
import p120q2.C5376l;
import p161w3.C5945j0;
import p182a7.C6444t;

/* renamed from: q2.b */
/* compiled from: AsynchronousMediaCodecAdapter */
final class C5365b implements C5376l {

    /* renamed from: a */
    private final MediaCodec f27457a;

    /* renamed from: b */
    private final C5371g f27458b;

    /* renamed from: c */
    private final C5368e f27459c;

    /* renamed from: d */
    private final boolean f27460d;

    /* renamed from: e */
    private boolean f27461e;

    /* renamed from: f */
    private int f27462f;

    /* renamed from: q2.b$b */
    /* compiled from: AsynchronousMediaCodecAdapter */
    public static final class C5367b implements C5376l.C5378b {

        /* renamed from: a */
        private final C6444t<HandlerThread> f27463a;

        /* renamed from: b */
        private final C6444t<HandlerThread> f27464b;

        /* renamed from: c */
        private final boolean f27465c;

        public C5367b(int i, boolean z) {
            this(new C12181c(i), new C12182d(i), z);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ HandlerThread m32855e(int i) {
            return new HandlerThread(C5365b.m32832t(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ HandlerThread m32856f(int i) {
            return new HandlerThread(C5365b.m32833u(i));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p120q2.C5365b mo19446a(p120q2.C5376l.C5377a r10) throws java.io.IOException {
            /*
                r9 = this;
                q2.n r0 = r10.f27507a
                java.lang.String r0 = r0.f27515a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
                r2.<init>()     // Catch:{ Exception -> 0x004d }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x004d }
                r2.append(r0)     // Catch:{ Exception -> 0x004d }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004d }
                p161w3.C5945j0.m35044a(r2)     // Catch:{ Exception -> 0x004d }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x004d }
                q2.b r2 = new q2.b     // Catch:{ Exception -> 0x004b }
                a7.t<android.os.HandlerThread> r3 = r9.f27463a     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x004b }
                a7.t<android.os.HandlerThread> r3 = r9.f27464b     // Catch:{ Exception -> 0x004b }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x004b }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x004b }
                boolean r7 = r9.f27465c     // Catch:{ Exception -> 0x004b }
                r8 = 0
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x004b }
                p161w3.C5945j0.m35046c()     // Catch:{ Exception -> 0x0048 }
                android.media.MediaFormat r1 = r10.f27508b     // Catch:{ Exception -> 0x0048 }
                android.view.Surface r3 = r10.f27510d     // Catch:{ Exception -> 0x0048 }
                android.media.MediaCrypto r4 = r10.f27511e     // Catch:{ Exception -> 0x0048 }
                int r10 = r10.f27512f     // Catch:{ Exception -> 0x0048 }
                r2.m32835w(r1, r3, r4, r10)     // Catch:{ Exception -> 0x0048 }
                return r2
            L_0x0048:
                r10 = move-exception
                r1 = r2
                goto L_0x004f
            L_0x004b:
                r10 = move-exception
                goto L_0x004f
            L_0x004d:
                r10 = move-exception
                r0 = r1
            L_0x004f:
                if (r1 != 0) goto L_0x0057
                if (r0 == 0) goto L_0x005a
                r0.release()
                goto L_0x005a
            L_0x0057:
                r1.mo19430a()
            L_0x005a:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q2.C5365b.C5367b.mo19446a(q2.l$a):q2.b");
        }

        C5367b(C6444t<HandlerThread> tVar, C6444t<HandlerThread> tVar2, boolean z) {
            this.f27463a = tVar;
            this.f27464b = tVar2;
            this.f27465c = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static String m32832t(int i) {
        return m32834v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static String m32833u(int i) {
        return m32834v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: v */
    private static String m32834v(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m32835w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f27458b.mo19460h(this.f27457a);
        C5945j0.m35044a("configureCodec");
        this.f27457a.configure(mediaFormat, surface, mediaCrypto, i);
        C5945j0.m35046c();
        this.f27459c.mo19452q();
        C5945j0.m35044a("startCodec");
        this.f27457a.start();
        C5945j0.m35046c();
        this.f27462f = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m32836x(C5376l.C5379c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo19479a(this, j, j2);
    }

    /* renamed from: y */
    private void m32837y() {
        if (this.f27460d) {
            try {
                this.f27459c.mo19453r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public void mo19430a() {
        try {
            if (this.f27462f == 1) {
                this.f27459c.mo19451p();
                this.f27458b.mo19461o();
            }
            this.f27462f = 2;
        } finally {
            if (!this.f27461e) {
                this.f27457a.release();
                this.f27461e = true;
            }
        }
    }

    /* renamed from: b */
    public boolean mo19431b() {
        return false;
    }

    /* renamed from: c */
    public void mo19432c(int i, int i2, C1842c cVar, long j, int i3) {
        this.f27459c.mo19450n(i, i2, cVar, j, i3);
    }

    /* renamed from: d */
    public void mo19433d(C5376l.C5379c cVar, Handler handler) {
        m32837y();
        this.f27457a.setOnFrameRenderedListener(new C12180a(this, cVar), handler);
    }

    /* renamed from: e */
    public MediaFormat mo19434e() {
        return this.f27458b.mo19459g();
    }

    /* renamed from: f */
    public void mo19435f(Bundle bundle) {
        m32837y();
        this.f27457a.setParameters(bundle);
    }

    public void flush() {
        this.f27459c.mo19448i();
        this.f27457a.flush();
        this.f27458b.mo19458e();
        this.f27457a.start();
    }

    /* renamed from: g */
    public void mo19437g(int i, long j) {
        this.f27457a.releaseOutputBuffer(i, j);
    }

    /* renamed from: h */
    public int mo19438h() {
        return this.f27458b.mo19456c();
    }

    /* renamed from: i */
    public int mo19439i(MediaCodec.BufferInfo bufferInfo) {
        return this.f27458b.mo19457d(bufferInfo);
    }

    /* renamed from: j */
    public void mo19440j(int i, boolean z) {
        this.f27457a.releaseOutputBuffer(i, z);
    }

    /* renamed from: k */
    public void mo19441k(int i) {
        m32837y();
        this.f27457a.setVideoScalingMode(i);
    }

    /* renamed from: l */
    public ByteBuffer mo19442l(int i) {
        return this.f27457a.getInputBuffer(i);
    }

    /* renamed from: m */
    public void mo19443m(Surface surface) {
        m32837y();
        this.f27457a.setOutputSurface(surface);
    }

    /* renamed from: n */
    public void mo19444n(int i, int i2, int i3, long j, int i4) {
        this.f27459c.mo19449m(i, i2, i3, j, i4);
    }

    /* renamed from: o */
    public ByteBuffer mo19445o(int i) {
        return this.f27457a.getOutputBuffer(i);
    }

    private C5365b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f27457a = mediaCodec;
        this.f27458b = new C5371g(handlerThread);
        this.f27459c = new C5368e(mediaCodec, handlerThread2);
        this.f27460d = z;
        this.f27462f = 0;
    }
}
