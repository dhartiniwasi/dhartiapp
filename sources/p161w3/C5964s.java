package p161w3;

import java.util.Arrays;

/* renamed from: w3.s */
/* compiled from: LongArray */
public final class C5964s {

    /* renamed from: a */
    private int f29141a;

    /* renamed from: b */
    private long[] f29142b;

    public C5964s() {
        this(32);
    }

    /* renamed from: a */
    public void mo20660a(long j) {
        int i = this.f29141a;
        long[] jArr = this.f29142b;
        if (i == jArr.length) {
            this.f29142b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f29142b;
        int i2 = this.f29141a;
        this.f29141a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long mo20661b(int i) {
        if (i >= 0 && i < this.f29141a) {
            return this.f29142b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f29141a);
    }

    /* renamed from: c */
    public int mo20662c() {
        return this.f29141a;
    }

    /* renamed from: d */
    public long[] mo20663d() {
        return Arrays.copyOf(this.f29142b, this.f29141a);
    }

    public C5964s(int i) {
        this.f29142b = new long[i];
    }
}
