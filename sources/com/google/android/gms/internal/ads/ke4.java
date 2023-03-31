package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ke4 {

    /* renamed from: a */
    private int f12061a = 0;

    /* renamed from: b */
    private int f12062b = -1;

    /* renamed from: c */
    private int f12063c = 0;

    /* renamed from: d */
    private int[] f12064d;

    /* renamed from: e */
    private int f12065e;

    public ke4() {
        int[] iArr = new int[16];
        this.f12064d = iArr;
        this.f12065e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo11664a() {
        int i = this.f12063c;
        if (i != 0) {
            int[] iArr = this.f12064d;
            int i2 = this.f12061a;
            int i3 = iArr[i2];
            this.f12061a = (i2 + 1) & this.f12065e;
            this.f12063c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo11665b(int i) {
        int i2 = this.f12063c;
        int[] iArr = this.f12064d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f12061a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f12064d, 0, iArr2, i5, i4);
                this.f12061a = 0;
                this.f12062b = this.f12063c - 1;
                this.f12064d = iArr2;
                this.f12065e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f12062b + 1) & this.f12065e;
        this.f12062b = i6;
        iArr[i6] = i;
        this.f12063c++;
    }

    /* renamed from: c */
    public final void mo11666c() {
        this.f12061a = 0;
        this.f12062b = -1;
        this.f12063c = 0;
    }

    /* renamed from: d */
    public final boolean mo11667d() {
        return this.f12063c == 0;
    }
}
