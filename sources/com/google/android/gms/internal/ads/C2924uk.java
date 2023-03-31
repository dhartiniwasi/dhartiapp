package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.uk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2924uk {

    /* renamed from: g */
    private static final byte[] f18580g = new byte[4096];

    /* renamed from: a */
    private final C2669np f18581a;

    /* renamed from: b */
    private final long f18582b;

    /* renamed from: c */
    private long f18583c;

    /* renamed from: d */
    private byte[] f18584d = new byte[65536];

    /* renamed from: e */
    private int f18585e;

    /* renamed from: f */
    private int f18586f;

    public C2924uk(C2669np npVar, long j, long j2) {
        this.f18581a = npVar;
        this.f18583c = j;
        this.f18582b = j2;
    }

    /* renamed from: j */
    private final int m21669j(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int c = this.f18581a.mo12052c(bArr, i + i3, i2 - i3);
            if (c != -1) {
                return i3 + c;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: k */
    private final int m21670k(byte[] bArr, int i, int i2) {
        int i3 = this.f18586f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f18584d, 0, bArr, i, min);
        m21673n(min);
        return min;
    }

    /* renamed from: l */
    private final int m21671l(int i) {
        int min = Math.min(this.f18586f, i);
        m21673n(min);
        return min;
    }

    /* renamed from: m */
    private final void m21672m(int i) {
        if (i != -1) {
            this.f18583c += (long) i;
        }
    }

    /* renamed from: n */
    private final void m21673n(int i) {
        int i2 = this.f18586f - i;
        this.f18586f = i2;
        this.f18585e = 0;
        byte[] bArr = this.f18584d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f18584d = bArr2;
    }

    /* renamed from: a */
    public final int mo14521a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int k = m21670k(bArr, i, i2);
        if (k == 0) {
            k = m21669j(bArr, i, i2, 0, true);
        }
        m21672m(k);
        return k;
    }

    /* renamed from: b */
    public final int mo14522b(int i) throws IOException, InterruptedException {
        int l = m21671l(i);
        if (l == 0) {
            l = m21669j(f18580g, 0, Math.min(i, 4096), 0, true);
        }
        m21672m(l);
        return l;
    }

    /* renamed from: c */
    public final long mo14523c() {
        return this.f18582b;
    }

    /* renamed from: d */
    public final long mo14524d() {
        return this.f18583c;
    }

    /* renamed from: e */
    public final void mo14525e() {
        this.f18585e = 0;
    }

    /* renamed from: f */
    public final boolean mo14526f(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f18585e + i;
        int length = this.f18584d.length;
        if (i2 > length) {
            this.f18584d = Arrays.copyOf(this.f18584d, C2893tq.m21174e(length + length, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f18586f - this.f18585e, i);
        while (min < i) {
            min = m21669j(this.f18584d, this.f18585e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f18585e + i;
        this.f18585e = i3;
        this.f18586f = Math.max(this.f18586f, i3);
        return true;
    }

    /* renamed from: g */
    public final boolean mo14527g(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo14526f(i2, false)) {
            return false;
        }
        System.arraycopy(this.f18584d, this.f18585e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: h */
    public final boolean mo14528h(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int k = m21670k(bArr, i, i2);
        while (k < i2 && k != -1) {
            k = m21669j(bArr, i, i2, k, z);
        }
        m21672m(k);
        return k != -1;
    }

    /* renamed from: i */
    public final boolean mo14529i(int i, boolean z) throws IOException, InterruptedException {
        int l = m21671l(i);
        while (l < i && l != -1) {
            l = m21669j(f18580g, -l, Math.min(i, l + 4096), l, false);
        }
        m21672m(l);
        return l != -1;
    }
}
