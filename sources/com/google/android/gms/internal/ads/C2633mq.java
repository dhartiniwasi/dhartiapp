package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2633mq {

    /* renamed from: a */
    public byte[] f13448a;

    /* renamed from: b */
    private int f13449b;

    /* renamed from: c */
    private int f13450c;

    public C2633mq() {
    }

    public C2633mq(int i) {
        this.f13448a = new byte[i];
        this.f13450c = i;
    }

    /* renamed from: a */
    public final int mo12390a() {
        return this.f13450c - this.f13449b;
    }

    /* renamed from: b */
    public final int mo12391b() {
        byte[] bArr = this.f13448a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int mo12392c() {
        return this.f13449b;
    }

    /* renamed from: d */
    public final int mo12393d() {
        return this.f13450c;
    }

    /* renamed from: e */
    public final int mo12394e() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13449b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13449b = i4;
        byte b3 = bArr[i3];
        this.f13449b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int mo12395f() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        this.f13449b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int mo12396g() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        this.f13449b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo12397h() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13449b = i3;
        byte b2 = bArr[i2];
        this.f13449b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int mo12398i() {
        int e = mo12394e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    /* renamed from: j */
    public final int mo12399j() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        this.f13449b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo12400k() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13449b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13449b = i4;
        byte b3 = bArr[i3];
        this.f13449b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public final long mo12401l() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13449b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13449b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f13449b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f13449b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f13449b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f13449b = i8;
        byte b7 = bArr[i7];
        this.f13449b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final long mo12402m() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13449b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13449b = i4;
        byte b3 = bArr[i3];
        this.f13449b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public final long mo12403n() {
        long l = mo12401l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    /* renamed from: o */
    public final String mo12404o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13449b;
        int i3 = i2 + i;
        int i4 = i3 - 1;
        if (i4 < this.f13450c && this.f13448a[i4] == 0) {
            i--;
        }
        String str = new String(this.f13448a, i2, i);
        this.f13449b = i3;
        return str;
    }

    /* renamed from: p */
    public final short mo12405p() {
        byte[] bArr = this.f13448a;
        int i = this.f13449b;
        int i2 = i + 1;
        this.f13449b = i2;
        byte b = bArr[i];
        this.f13449b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void mo12406q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13448a, this.f13449b, bArr, i, i2);
        this.f13449b += i2;
    }

    /* renamed from: r */
    public final void mo12407r() {
        this.f13449b = 0;
        this.f13450c = 0;
    }

    /* renamed from: s */
    public final void mo12408s(int i) {
        mo12409t(mo12391b() < i ? new byte[i] : this.f13448a, i);
    }

    /* renamed from: t */
    public final void mo12409t(byte[] bArr, int i) {
        this.f13448a = bArr;
        this.f13450c = i;
        this.f13449b = 0;
    }

    /* renamed from: u */
    public final void mo12410u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13448a.length) {
            z = true;
        }
        C2335eq.m12243c(z);
        this.f13450c = i;
    }

    /* renamed from: v */
    public final void mo12411v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13450c) {
            z = true;
        }
        C2335eq.m12243c(z);
        this.f13449b = i;
    }

    /* renamed from: w */
    public final void mo12412w(int i) {
        mo12411v(this.f13449b + i);
    }

    public C2633mq(byte[] bArr) {
        this.f13448a = bArr;
        this.f13450c = bArr.length;
    }
}
