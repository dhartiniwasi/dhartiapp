package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eb4 {

    /* renamed from: e */
    public static final eb4 f8726e = new eb4(-1, -1, -1);

    /* renamed from: a */
    public final int f8727a;

    /* renamed from: b */
    public final int f8728b;

    /* renamed from: c */
    public final int f8729c;

    /* renamed from: d */
    public final int f8730d;

    public eb4(int i, int i2, int i3) {
        this.f8727a = i;
        this.f8728b = i2;
        this.f8729c = i3;
        this.f8730d = gb2.m13188v(i3) ? gb2.m13155Y(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.f8727a;
        int i2 = this.f8728b;
        int i3 = this.f8729c;
        return "AudioFormat[sampleRate=" + i + ", channelCount=" + i2 + ", encoding=" + i3 + "]";
    }
}
