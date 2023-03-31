package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2218bk implements C2403gj {

    /* renamed from: b */
    private int f7322b = -1;

    /* renamed from: c */
    private int f7323c = -1;

    /* renamed from: d */
    private int[] f7324d;

    /* renamed from: e */
    private boolean f7325e;

    /* renamed from: f */
    private int[] f7326f;

    /* renamed from: g */
    private ByteBuffer f7327g;

    /* renamed from: h */
    private ByteBuffer f7328h;

    /* renamed from: i */
    private boolean f7329i;

    public C2218bk() {
        ByteBuffer byteBuffer = C2403gj.f9915a;
        this.f7327g = byteBuffer;
        this.f7328h = byteBuffer;
    }

    /* renamed from: V */
    public final boolean mo8838V() {
        return this.f7325e;
    }

    /* renamed from: W */
    public final boolean mo8839W() {
        return this.f7329i && this.f7328h == C2403gj.f9915a;
    }

    /* renamed from: a */
    public final void mo8840a() {
        this.f7329i = true;
    }

    /* renamed from: b */
    public final void mo8841b() {
        this.f7328h = C2403gj.f9915a;
        this.f7329i = false;
    }

    /* renamed from: c */
    public final void mo8842c() {
        mo8841b();
        this.f7327g = C2403gj.f9915a;
        this.f7322b = -1;
        this.f7323c = -1;
        this.f7326f = null;
        this.f7325e = false;
    }

    /* renamed from: d */
    public final int mo8843d() {
        return 2;
    }

    /* renamed from: e */
    public final ByteBuffer mo8844e() {
        ByteBuffer byteBuffer = this.f7328h;
        this.f7328h = C2403gj.f9915a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final void mo8845f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f7322b;
        int length = ((limit - position) / (i + i)) * this.f7326f.length;
        int i2 = length + length;
        if (this.f7327g.capacity() < i2) {
            this.f7327g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f7327g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f7326f) {
                this.f7327g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f7322b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f7327g.flip();
        this.f7328h = this.f7327g;
    }

    /* renamed from: g */
    public final boolean mo8846g(int i, int i2, int i3) throws C2366fj {
        boolean z = !Arrays.equals(this.f7324d, this.f7326f);
        int[] iArr = this.f7324d;
        this.f7326f = iArr;
        if (iArr == null) {
            this.f7325e = false;
            return z;
        } else if (i3 != 2) {
            throw new C2366fj(i, i2, i3);
        } else if (!z && this.f7323c == i && this.f7322b == i2) {
            return false;
        } else {
            this.f7323c = i;
            this.f7322b = i2;
            this.f7325e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f7326f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f7325e = (i5 != i4) | this.f7325e;
                    i4++;
                } else {
                    throw new C2366fj(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo8847h(int[] iArr) {
        this.f7324d = iArr;
    }

    public final int zza() {
        int[] iArr = this.f7326f;
        return iArr == null ? this.f7322b : iArr.length;
    }
}
