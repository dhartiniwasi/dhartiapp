package p031d3;

import java.util.NoSuchElementException;

/* renamed from: d3.b */
/* compiled from: BaseMediaChunkIterator */
public abstract class C4056b implements C4073o {

    /* renamed from: b */
    private final long f23139b;

    /* renamed from: c */
    private final long f23140c;

    /* renamed from: d */
    private long f23141d;

    public C4056b(long j, long j2) {
        this.f23139b = j;
        this.f23140c = j2;
        mo17267f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo17264c() {
        long j = this.f23141d;
        if (j < this.f23139b || j > this.f23140c) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final long mo17265d() {
        return this.f23141d;
    }

    /* renamed from: e */
    public boolean mo17266e() {
        return this.f23141d > this.f23140c;
    }

    /* renamed from: f */
    public void mo17267f() {
        this.f23141d = this.f23139b - 1;
    }

    public boolean next() {
        this.f23141d++;
        return !mo17266e();
    }
}
