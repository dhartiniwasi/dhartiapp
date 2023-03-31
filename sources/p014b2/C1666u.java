package p014b2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p161w3.C5953m0;

/* renamed from: b2.u */
/* compiled from: AudioTimestampPoller */
final class C1666u {

    /* renamed from: a */
    private final C1667a f4798a;

    /* renamed from: b */
    private int f4799b;

    /* renamed from: c */
    private long f4800c;

    /* renamed from: d */
    private long f4801d;

    /* renamed from: e */
    private long f4802e;

    /* renamed from: f */
    private long f4803f;

    /* renamed from: b2.u$a */
    /* compiled from: AudioTimestampPoller */
    private static final class C1667a {

        /* renamed from: a */
        private final AudioTrack f4804a;

        /* renamed from: b */
        private final AudioTimestamp f4805b = new AudioTimestamp();

        /* renamed from: c */
        private long f4806c;

        /* renamed from: d */
        private long f4807d;

        /* renamed from: e */
        private long f4808e;

        public C1667a(AudioTrack audioTrack) {
            this.f4804a = audioTrack;
        }

        /* renamed from: a */
        public long mo6600a() {
            return this.f4808e;
        }

        /* renamed from: b */
        public long mo6601b() {
            return this.f4805b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo6602c() {
            boolean timestamp = this.f4804a.getTimestamp(this.f4805b);
            if (timestamp) {
                long j = this.f4805b.framePosition;
                if (this.f4807d > j) {
                    this.f4806c++;
                }
                this.f4807d = j;
                this.f4808e = j + (this.f4806c << 32);
            }
            return timestamp;
        }
    }

    public C1666u(AudioTrack audioTrack) {
        if (C5953m0.f29110a >= 19) {
            this.f4798a = new C1667a(audioTrack);
            mo6599g();
            return;
        }
        this.f4798a = null;
        m7673h(3);
    }

    /* renamed from: h */
    private void m7673h(int i) {
        this.f4799b = i;
        if (i == 0) {
            this.f4802e = 0;
            this.f4803f = -1;
            this.f4800c = System.nanoTime() / 1000;
            this.f4801d = 10000;
        } else if (i == 1) {
            this.f4801d = 10000;
        } else if (i == 2 || i == 3) {
            this.f4801d = 10000000;
        } else if (i == 4) {
            this.f4801d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo6593a() {
        if (this.f4799b == 4) {
            mo6599g();
        }
    }

    /* renamed from: b */
    public long mo6594b() {
        C1667a aVar = this.f4798a;
        if (aVar != null) {
            return aVar.mo6600a();
        }
        return -1;
    }

    /* renamed from: c */
    public long mo6595c() {
        C1667a aVar = this.f4798a;
        if (aVar != null) {
            return aVar.mo6601b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean mo6596d() {
        return this.f4799b == 2;
    }

    /* renamed from: e */
    public boolean mo6597e(long j) {
        C1667a aVar = this.f4798a;
        if (aVar == null || j - this.f4802e < this.f4801d) {
            return false;
        }
        this.f4802e = j;
        boolean c = aVar.mo6602c();
        int i = this.f4799b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo6599g();
                    }
                } else if (!c) {
                    mo6599g();
                }
            } else if (!c) {
                mo6599g();
            } else if (this.f4798a.mo6600a() > this.f4803f) {
                m7673h(2);
            }
        } else if (c) {
            if (this.f4798a.mo6601b() < this.f4800c) {
                return false;
            }
            this.f4803f = this.f4798a.mo6600a();
            m7673h(1);
        } else if (j - this.f4800c > 500000) {
            m7673h(3);
        }
        return c;
    }

    /* renamed from: f */
    public void mo6598f() {
        m7673h(4);
    }

    /* renamed from: g */
    public void mo6599g() {
        if (this.f4798a != null) {
            m7673h(0);
        }
    }
}
