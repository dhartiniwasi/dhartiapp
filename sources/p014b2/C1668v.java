package p014b2;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: b2.v */
/* compiled from: AudioTrackPositionTracker */
final class C1668v {

    /* renamed from: A */
    private long f4809A;

    /* renamed from: B */
    private long f4810B;

    /* renamed from: C */
    private long f4811C;

    /* renamed from: D */
    private boolean f4812D;

    /* renamed from: E */
    private long f4813E;

    /* renamed from: F */
    private long f4814F;

    /* renamed from: a */
    private final C1669a f4815a;

    /* renamed from: b */
    private final long[] f4816b;

    /* renamed from: c */
    private AudioTrack f4817c;

    /* renamed from: d */
    private int f4818d;

    /* renamed from: e */
    private int f4819e;

    /* renamed from: f */
    private C1666u f4820f;

    /* renamed from: g */
    private int f4821g;

    /* renamed from: h */
    private boolean f4822h;

    /* renamed from: i */
    private long f4823i;

    /* renamed from: j */
    private float f4824j;

    /* renamed from: k */
    private boolean f4825k;

    /* renamed from: l */
    private long f4826l;

    /* renamed from: m */
    private long f4827m;

    /* renamed from: n */
    private Method f4828n;

    /* renamed from: o */
    private long f4829o;

    /* renamed from: p */
    private boolean f4830p;

    /* renamed from: q */
    private boolean f4831q;

    /* renamed from: r */
    private long f4832r;

    /* renamed from: s */
    private long f4833s;

    /* renamed from: t */
    private long f4834t;

    /* renamed from: u */
    private long f4835u;

    /* renamed from: v */
    private int f4836v;

    /* renamed from: w */
    private int f4837w;

    /* renamed from: x */
    private long f4838x;

    /* renamed from: y */
    private long f4839y;

    /* renamed from: z */
    private long f4840z;

    /* renamed from: b2.v$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface C1669a {
        /* renamed from: a */
        void mo6615a(long j);

        /* renamed from: b */
        void mo6616b(int i, long j);

        /* renamed from: c */
        void mo6617c(long j);

        /* renamed from: d */
        void mo6618d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo6619e(long j, long j2, long j3, long j4);
    }

    public C1668v(C1669a aVar) {
        this.f4815a = (C1669a) C5917a.m34872e(aVar);
        if (C5953m0.f29110a >= 18) {
            try {
                this.f4828n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f4816b = new long[10];
    }

    /* renamed from: a */
    private boolean m7684a() {
        return this.f4822h && ((AudioTrack) C5917a.m34872e(this.f4817c)).getPlayState() == 2 && m7686e() == 0;
    }

    /* renamed from: b */
    private long m7685b(long j) {
        return (j * 1000000) / ((long) this.f4821g);
    }

    /* renamed from: e */
    private long m7686e() {
        AudioTrack audioTrack = (AudioTrack) C5917a.m34872e(this.f4817c);
        if (this.f4838x != -9223372036854775807L) {
            return Math.min(this.f4809A, this.f4840z + ((((SystemClock.elapsedRealtime() * 1000) - this.f4838x) * ((long) this.f4821g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f4822h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f4835u = this.f4833s;
            }
            playbackHeadPosition += this.f4835u;
        }
        if (C5953m0.f29110a <= 29) {
            if (playbackHeadPosition == 0 && this.f4833s > 0 && playState == 3) {
                if (this.f4839y == -9223372036854775807L) {
                    this.f4839y = SystemClock.elapsedRealtime();
                }
                return this.f4833s;
            }
            this.f4839y = -9223372036854775807L;
        }
        if (this.f4833s > playbackHeadPosition) {
            this.f4834t++;
        }
        this.f4833s = playbackHeadPosition;
        return playbackHeadPosition + (this.f4834t << 32);
    }

    /* renamed from: f */
    private long m7687f() {
        return m7685b(m7686e());
    }

    /* renamed from: l */
    private void m7688l(long j, long j2) {
        C1666u uVar = (C1666u) C5917a.m34872e(this.f4820f);
        if (uVar.mo6597e(j)) {
            long c = uVar.mo6595c();
            long b = uVar.mo6594b();
            if (Math.abs(c - j) > 5000000) {
                this.f4815a.mo6619e(b, c, j, j2);
                uVar.mo6598f();
            } else if (Math.abs(m7685b(b) - j2) > 5000000) {
                this.f4815a.mo6618d(b, c, j, j2);
                uVar.mo6598f();
            } else {
                uVar.mo6593a();
            }
        }
    }

    /* renamed from: m */
    private void m7689m() {
        long f = m7687f();
        if (f != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f4827m >= 30000) {
                long[] jArr = this.f4816b;
                int i = this.f4836v;
                jArr[i] = f - nanoTime;
                this.f4836v = (i + 1) % 10;
                int i2 = this.f4837w;
                if (i2 < 10) {
                    this.f4837w = i2 + 1;
                }
                this.f4827m = nanoTime;
                this.f4826l = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f4837w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f4826l += this.f4816b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f4822h) {
                m7688l(nanoTime, f);
                m7690n(nanoTime);
            }
        }
    }

    /* renamed from: n */
    private void m7690n(long j) {
        Method method;
        if (this.f4831q && (method = this.f4828n) != null && j - this.f4832r >= 500000) {
            try {
                long intValue = (((long) ((Integer) C5953m0.m35138j((Integer) method.invoke(C5917a.m34872e(this.f4817c), new Object[0]))).intValue()) * 1000) - this.f4823i;
                this.f4829o = intValue;
                long max = Math.max(intValue, 0);
                this.f4829o = max;
                if (max > 5000000) {
                    this.f4815a.mo6617c(max);
                    this.f4829o = 0;
                }
            } catch (Exception unused) {
                this.f4828n = null;
            }
            this.f4832r = j;
        }
    }

    /* renamed from: o */
    private static boolean m7691o(int i) {
        return C5953m0.f29110a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: r */
    private void m7692r() {
        this.f4826l = 0;
        this.f4837w = 0;
        this.f4836v = 0;
        this.f4827m = 0;
        this.f4811C = 0;
        this.f4814F = 0;
        this.f4825k = false;
    }

    /* renamed from: c */
    public int mo6603c(long j) {
        return this.f4819e - ((int) (j - (m7686e() * ((long) this.f4818d))));
    }

    /* renamed from: d */
    public long mo6604d(boolean z) {
        long j;
        if (((AudioTrack) C5917a.m34872e(this.f4817c)).getPlayState() == 3) {
            m7689m();
        }
        long nanoTime = System.nanoTime() / 1000;
        C1666u uVar = (C1666u) C5917a.m34872e(this.f4820f);
        boolean d = uVar.mo6596d();
        if (d) {
            j = m7685b(uVar.mo6594b()) + C5953m0.m35118Z(nanoTime - uVar.mo6595c(), this.f4824j);
        } else {
            if (this.f4837w == 0) {
                j = m7687f();
            } else {
                j = this.f4826l + nanoTime;
            }
            if (!z) {
                j = Math.max(0, j - this.f4829o);
            }
        }
        if (this.f4812D != d) {
            this.f4814F = this.f4811C;
            this.f4813E = this.f4810B;
        }
        long j2 = nanoTime - this.f4814F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f4813E + C5953m0.m35118Z(j2, this.f4824j)))) / 1000;
        }
        if (!this.f4825k) {
            long j4 = this.f4810B;
            if (j > j4) {
                this.f4825k = true;
                this.f4815a.mo6615a(System.currentTimeMillis() - C5953m0.m35117Y0(C5953m0.m35129e0(C5953m0.m35117Y0(j - j4), this.f4824j)));
            }
        }
        this.f4811C = nanoTime;
        this.f4810B = j;
        this.f4812D = d;
        return j;
    }

    /* renamed from: g */
    public void mo6605g(long j) {
        this.f4840z = m7686e();
        this.f4838x = SystemClock.elapsedRealtime() * 1000;
        this.f4809A = j;
    }

    /* renamed from: h */
    public boolean mo6606h(long j) {
        return j > m7686e() || m7684a();
    }

    /* renamed from: i */
    public boolean mo6607i() {
        return ((AudioTrack) C5917a.m34872e(this.f4817c)).getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean mo6608j(long j) {
        return this.f4839y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f4839y >= 200;
    }

    /* renamed from: k */
    public boolean mo6609k(long j) {
        int playState = ((AudioTrack) C5917a.m34872e(this.f4817c)).getPlayState();
        if (this.f4822h) {
            if (playState == 2) {
                this.f4830p = false;
                return false;
            } else if (playState == 1 && m7686e() == 0) {
                return false;
            }
        }
        boolean z = this.f4830p;
        boolean h = mo6606h(j);
        this.f4830p = h;
        if (z && !h && playState != 1) {
            this.f4815a.mo6616b(this.f4819e, C5953m0.m35117Y0(this.f4823i));
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo6610p() {
        m7692r();
        if (this.f4838x != -9223372036854775807L) {
            return false;
        }
        ((C1666u) C5917a.m34872e(this.f4820f)).mo6599g();
        return true;
    }

    /* renamed from: q */
    public void mo6611q() {
        m7692r();
        this.f4817c = null;
        this.f4820f = null;
    }

    /* renamed from: s */
    public void mo6612s(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f4817c = audioTrack;
        this.f4818d = i2;
        this.f4819e = i3;
        this.f4820f = new C1666u(audioTrack);
        this.f4821g = audioTrack.getSampleRate();
        this.f4822h = z && m7691o(i);
        boolean t0 = C5953m0.m35159t0(i);
        this.f4831q = t0;
        this.f4823i = t0 ? m7685b((long) (i3 / i2)) : -9223372036854775807L;
        this.f4833s = 0;
        this.f4834t = 0;
        this.f4835u = 0;
        this.f4830p = false;
        this.f4838x = -9223372036854775807L;
        this.f4839y = -9223372036854775807L;
        this.f4832r = 0;
        this.f4829o = 0;
        this.f4824j = 1.0f;
    }

    /* renamed from: t */
    public void mo6613t(float f) {
        this.f4824j = f;
        C1666u uVar = this.f4820f;
        if (uVar != null) {
            uVar.mo6599g();
        }
    }

    /* renamed from: u */
    public void mo6614u() {
        ((C1666u) C5917a.m34872e(this.f4820f)).mo6599g();
    }
}
