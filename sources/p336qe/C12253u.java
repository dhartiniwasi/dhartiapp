package p336qe;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: qe.u */
/* compiled from: Timeout */
public class C12253u {

    /* renamed from: d */
    public static final C12253u f45422d = new C12254a();

    /* renamed from: a */
    private boolean f45423a;

    /* renamed from: b */
    private long f45424b;

    /* renamed from: c */
    private long f45425c;

    /* renamed from: qe.u$a */
    /* compiled from: Timeout */
    class C12254a extends C12253u {
        C12254a() {
        }

        /* renamed from: d */
        public C12253u mo36856d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo36858f() throws IOException {
        }

        /* renamed from: g */
        public C12253u mo36859g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C12253u mo36853a() {
        this.f45423a = false;
        return this;
    }

    /* renamed from: b */
    public C12253u mo36854b() {
        this.f45425c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo36855c() {
        if (this.f45423a) {
            return this.f45424b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C12253u mo36856d(long j) {
        this.f45423a = true;
        this.f45424b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo36857e() {
        return this.f45423a;
    }

    /* renamed from: f */
    public void mo36858f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f45423a && this.f45424b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C12253u mo36859g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f45425c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: h */
    public long mo36882h() {
        return this.f45425c;
    }
}
