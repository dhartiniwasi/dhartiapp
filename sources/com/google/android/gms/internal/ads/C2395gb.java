package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.gb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2395gb extends j34 {

    /* renamed from: A */
    private long f9803A;

    /* renamed from: t */
    private Date f9804t;

    /* renamed from: u */
    private Date f9805u;

    /* renamed from: v */
    private long f9806v;

    /* renamed from: w */
    private long f9807w;

    /* renamed from: x */
    private double f9808x = 1.0d;

    /* renamed from: y */
    private float f9809y = 1.0f;

    /* renamed from: z */
    private u34 f9810z = u34.f18353j;

    public C2395gb() {
        super("mvhd");
    }

    /* renamed from: c */
    public final void mo10451c(ByteBuffer byteBuffer) {
        mo11312g(byteBuffer);
        if (mo11311e() == 1) {
            this.f9804t = o34.m17473a(C2246cb.m10818f(byteBuffer));
            this.f9805u = o34.m17473a(C2246cb.m10818f(byteBuffer));
            this.f9806v = C2246cb.m10817e(byteBuffer);
            this.f9807w = C2246cb.m10818f(byteBuffer);
        } else {
            this.f9804t = o34.m17473a(C2246cb.m10817e(byteBuffer));
            this.f9805u = o34.m17473a(C2246cb.m10817e(byteBuffer));
            this.f9806v = C2246cb.m10817e(byteBuffer);
            this.f9807w = C2246cb.m10817e(byteBuffer);
        }
        this.f9808x = C2246cb.m10814b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f9809y = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280))))) / 256.0f;
        C2246cb.m10816d(byteBuffer);
        C2246cb.m10817e(byteBuffer);
        C2246cb.m10817e(byteBuffer);
        double b = C2246cb.m10814b(byteBuffer);
        double b2 = C2246cb.m10814b(byteBuffer);
        double a = C2246cb.m10813a(byteBuffer);
        this.f9810z = new u34(b, b2, C2246cb.m10814b(byteBuffer), C2246cb.m10814b(byteBuffer), a, C2246cb.m10813a(byteBuffer), C2246cb.m10813a(byteBuffer), C2246cb.m10814b(byteBuffer), C2246cb.m10814b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f9803A = C2246cb.m10817e(byteBuffer);
    }

    /* renamed from: h */
    public final long mo10452h() {
        return this.f9807w;
    }

    /* renamed from: i */
    public final long mo10453i() {
        return this.f9806v;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f9804t + ";modificationTime=" + this.f9805u + ";timescale=" + this.f9806v + ";duration=" + this.f9807w + ";rate=" + this.f9808x + ";volume=" + this.f9809y + ";matrix=" + this.f9810z + ";nextTrackId=" + this.f9803A + "]";
    }
}
