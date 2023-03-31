package p014b2;

import java.nio.ByteBuffer;
import p004a2.C0079u1;
import p177z1.C6272r1;
import p177z1.C6280t2;

/* renamed from: b2.t */
/* compiled from: AudioSink */
public interface C1660t {

    /* renamed from: b2.t$b */
    /* compiled from: AudioSink */
    public static final class C1662b extends Exception {

        /* renamed from: a */
        public final int f4790a;

        /* renamed from: b */
        public final boolean f4791b;

        /* renamed from: c */
        public final C6272r1 f4792c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C1662b(int r3, int r4, int r5, int r6, p177z1.C6272r1 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x0032
                java.lang.String r4 = " (recoverable)"
                goto L_0x0034
            L_0x0032:
                java.lang.String r4 = ""
            L_0x0034:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f4790a = r3
                r2.f4791b = r8
                r2.f4792c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p014b2.C1660t.C1662b.<init>(int, int, int, int, z1.r1, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: b2.t$c */
    /* compiled from: AudioSink */
    public interface C1663c {
        /* renamed from: a */
        void mo6498a(long j);

        /* renamed from: b */
        void mo6499b(boolean z);

        /* renamed from: c */
        void mo6500c(Exception exc);

        /* renamed from: d */
        void mo6501d();

        /* renamed from: e */
        void mo6502e(int i, long j, long j2);

        /* renamed from: f */
        void mo6503f();

        /* renamed from: g */
        void mo6504g();
    }

    /* renamed from: b2.t$d */
    /* compiled from: AudioSink */
    public static final class C1664d extends Exception {

        /* renamed from: a */
        public final long f4793a;

        /* renamed from: b */
        public final long f4794b;

        public C1664d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f4793a = j;
            this.f4794b = j2;
        }
    }

    /* renamed from: b2.t$e */
    /* compiled from: AudioSink */
    public static final class C1665e extends Exception {

        /* renamed from: a */
        public final int f4795a;

        /* renamed from: b */
        public final boolean f4796b;

        /* renamed from: c */
        public final C6272r1 f4797c;

        public C1665e(int i, C6272r1 r1Var, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f4796b = z;
            this.f4795a = i;
            this.f4797c = r1Var;
        }
    }

    /* renamed from: E0 */
    void mo6568E0();

    /* renamed from: a */
    boolean mo6569a(C6272r1 r1Var);

    /* renamed from: c */
    void mo6570c(C6280t2 t2Var);

    /* renamed from: d */
    boolean mo6571d();

    /* renamed from: e */
    C6280t2 mo6572e();

    /* renamed from: f */
    void mo6573f(boolean z);

    void flush();

    /* renamed from: g */
    void mo6575g(C1670w wVar);

    /* renamed from: h */
    void mo6576h() throws C1665e;

    /* renamed from: i */
    boolean mo6577i();

    /* renamed from: j */
    void mo6578j(C0079u1 u1Var);

    /* renamed from: k */
    void mo6579k(int i);

    /* renamed from: l */
    long mo6580l(boolean z);

    /* renamed from: m */
    void mo6581m();

    /* renamed from: n */
    int mo6582n(C6272r1 r1Var);

    /* renamed from: o */
    void mo6583o(C1663c cVar);

    /* renamed from: p */
    void mo6584p();

    void pause();

    /* renamed from: q */
    void mo6586q();

    /* renamed from: r */
    void mo6587r(C6272r1 r1Var, int i, int[] iArr) throws C1661a;

    void reset();

    /* renamed from: s */
    void mo6589s(C1624e eVar);

    void setVolume(float f);

    /* renamed from: t */
    boolean mo6591t(ByteBuffer byteBuffer, long j, int i) throws C1662b, C1665e;

    /* renamed from: u */
    void mo6592u();

    /* renamed from: b2.t$a */
    /* compiled from: AudioSink */
    public static final class C1661a extends Exception {

        /* renamed from: a */
        public final C6272r1 f4789a;

        public C1661a(Throwable th, C6272r1 r1Var) {
            super(th);
            this.f4789a = r1Var;
        }

        public C1661a(String str, C6272r1 r1Var) {
            super(str);
            this.f4789a = r1Var;
        }
    }
}
