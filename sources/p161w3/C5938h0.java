package p161w3;

import java.util.Arrays;

/* renamed from: w3.h0 */
/* compiled from: TimedValueQueue */
public final class C5938h0<V> {

    /* renamed from: a */
    private long[] f29082a;

    /* renamed from: b */
    private V[] f29083b;

    /* renamed from: c */
    private int f29084c;

    /* renamed from: d */
    private int f29085d;

    public C5938h0() {
        this(10);
    }

    /* renamed from: b */
    private void m35009b(long j, V v) {
        int i = this.f29084c;
        int i2 = this.f29085d;
        V[] vArr = this.f29083b;
        int length = (i + i2) % vArr.length;
        this.f29082a[length] = j;
        vArr[length] = v;
        this.f29085d = i2 + 1;
    }

    /* renamed from: d */
    private void m35010d(long j) {
        int i = this.f29085d;
        if (i > 0) {
            if (j <= this.f29082a[((this.f29084c + i) - 1) % this.f29083b.length]) {
                mo20612c();
            }
        }
    }

    /* renamed from: e */
    private void m35011e() {
        int length = this.f29083b.length;
        if (this.f29085d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] f = m35012f(i);
            int i2 = this.f29084c;
            int i3 = length - i2;
            System.arraycopy(this.f29082a, i2, jArr, 0, i3);
            System.arraycopy(this.f29083b, this.f29084c, f, 0, i3);
            int i4 = this.f29084c;
            if (i4 > 0) {
                System.arraycopy(this.f29082a, 0, jArr, i3, i4);
                System.arraycopy(this.f29083b, 0, f, i3, this.f29084c);
            }
            this.f29082a = jArr;
            this.f29083b = f;
            this.f29084c = 0;
        }
    }

    /* renamed from: f */
    private static <V> V[] m35012f(int i) {
        return new Object[i];
    }

    /* renamed from: g */
    private V m35013g(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f29085d > 0) {
            long j3 = j - this.f29082a[this.f29084c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m35014j();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: j */
    private V m35014j() {
        C5917a.m34873f(this.f29085d > 0);
        V[] vArr = this.f29083b;
        int i = this.f29084c;
        V v = vArr[i];
        vArr[i] = null;
        this.f29084c = (i + 1) % vArr.length;
        this.f29085d--;
        return v;
    }

    /* renamed from: a */
    public synchronized void mo20611a(long j, V v) {
        m35010d(j);
        m35011e();
        m35009b(j, v);
    }

    /* renamed from: c */
    public synchronized void mo20612c() {
        this.f29084c = 0;
        this.f29085d = 0;
        Arrays.fill(this.f29083b, (Object) null);
    }

    /* renamed from: h */
    public synchronized V mo20613h() {
        return this.f29085d == 0 ? null : m35014j();
    }

    /* renamed from: i */
    public synchronized V mo20614i(long j) {
        return m35013g(j, true);
    }

    /* renamed from: k */
    public synchronized int mo20615k() {
        return this.f29085d;
    }

    public C5938h0(int i) {
        this.f29082a = new long[i];
        this.f29083b = m35012f(i);
    }
}
