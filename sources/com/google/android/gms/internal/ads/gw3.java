package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gw3 extends OutputStream {

    /* renamed from: f */
    private static final byte[] f10077f = new byte[0];

    /* renamed from: a */
    private final int f10078a = 128;

    /* renamed from: b */
    private final ArrayList f10079b = new ArrayList();

    /* renamed from: c */
    private int f10080c;

    /* renamed from: d */
    private byte[] f10081d = new byte[128];

    /* renamed from: e */
    private int f10082e;

    gw3(int i) {
    }

    /* renamed from: g */
    private final void m13560g(int i) {
        this.f10079b.add(new fw3(this.f10081d));
        int length = this.f10080c + this.f10081d.length;
        this.f10080c = length;
        this.f10081d = new byte[Math.max(this.f10078a, Math.max(i, length >>> 1))];
        this.f10082e = 0;
    }

    /* renamed from: a */
    public final synchronized int mo10657a() {
        return this.f10080c + this.f10082e;
    }

    /* renamed from: b */
    public final synchronized jw3 mo10658b() {
        int i = this.f10082e;
        byte[] bArr = this.f10081d;
        if (i >= bArr.length) {
            this.f10079b.add(new fw3(this.f10081d));
            this.f10081d = f10077f;
        } else if (i > 0) {
            this.f10079b.add(new fw3(Arrays.copyOf(bArr, i)));
        }
        this.f10080c += this.f10082e;
        this.f10082e = 0;
        return jw3.m15085J(this.f10079b);
    }

    /* renamed from: f */
    public final synchronized void mo10659f() {
        this.f10079b.clear();
        this.f10080c = 0;
        this.f10082e = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo10657a())});
    }

    public final synchronized void write(int i) {
        if (this.f10082e == this.f10081d.length) {
            m13560g(1);
        }
        byte[] bArr = this.f10081d;
        int i2 = this.f10082e;
        this.f10082e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f10081d;
        int length = bArr2.length;
        int i3 = this.f10082e;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f10082e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        m13560g(i5);
        System.arraycopy(bArr, i + i4, this.f10081d, 0, i5);
        this.f10082e = i5;
    }
}
