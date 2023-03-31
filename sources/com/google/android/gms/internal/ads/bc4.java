package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bc4 {

    /* renamed from: a */
    private final zb4 f7204a;

    /* renamed from: b */
    private int f7205b;

    /* renamed from: c */
    private long f7206c;

    /* renamed from: d */
    private long f7207d;

    /* renamed from: e */
    private long f7208e;

    /* renamed from: f */
    private long f7209f;

    public bc4(AudioTrack audioTrack) {
        int i = gb2.f9812a;
        this.f7204a = new zb4(audioTrack);
        m10304h(0);
    }

    /* renamed from: h */
    private final void m10304h(int i) {
        this.f7205b = i;
        long j = 10000;
        if (i == 0) {
            this.f7208e = 0;
            this.f7209f = -1;
            this.f7206c = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.f7207d = 10000;
            return;
        }
        this.f7207d = j;
    }

    /* renamed from: a */
    public final long mo8739a() {
        return this.f7204a.mo15578a();
    }

    /* renamed from: b */
    public final long mo8740b() {
        return this.f7204a.mo15579b();
    }

    /* renamed from: c */
    public final void mo8741c() {
        if (this.f7205b == 4) {
            m10304h(0);
        }
    }

    /* renamed from: d */
    public final void mo8742d() {
        m10304h(4);
    }

    /* renamed from: e */
    public final void mo8743e() {
        m10304h(0);
    }

    /* renamed from: f */
    public final boolean mo8744f() {
        return this.f7205b == 2;
    }

    /* renamed from: g */
    public final boolean mo8745g(long j) {
        zb4 zb4 = this.f7204a;
        if (j - this.f7208e < this.f7207d) {
            return false;
        }
        this.f7208e = j;
        boolean c = zb4.mo15580c();
        int i = this.f7205b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!c) {
                            return false;
                        }
                        m10304h(0);
                        return true;
                    }
                } else if (c) {
                    return true;
                } else {
                    m10304h(0);
                    return false;
                }
            } else if (!c) {
                m10304h(0);
            } else if (this.f7204a.mo15578a() > this.f7209f) {
                m10304h(2);
                return true;
            }
        } else if (c) {
            if (this.f7204a.mo15579b() < this.f7206c) {
                return false;
            }
            this.f7209f = this.f7204a.mo15578a();
            m10304h(1);
            return true;
        } else if (j - this.f7206c > 500000) {
            m10304h(3);
            return false;
        }
        return c;
    }
}
