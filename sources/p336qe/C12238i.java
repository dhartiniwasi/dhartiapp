package p336qe;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: qe.i */
/* compiled from: ForwardingTimeout */
public class C12238i extends C12253u {

    /* renamed from: e */
    private C12253u f45387e;

    public C12238i(C12253u uVar) {
        if (uVar != null) {
            this.f45387e = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public C12253u mo36853a() {
        return this.f45387e.mo36853a();
    }

    /* renamed from: b */
    public C12253u mo36854b() {
        return this.f45387e.mo36854b();
    }

    /* renamed from: c */
    public long mo36855c() {
        return this.f45387e.mo36855c();
    }

    /* renamed from: d */
    public C12253u mo36856d(long j) {
        return this.f45387e.mo36856d(j);
    }

    /* renamed from: e */
    public boolean mo36857e() {
        return this.f45387e.mo36857e();
    }

    /* renamed from: f */
    public void mo36858f() throws IOException {
        this.f45387e.mo36858f();
    }

    /* renamed from: g */
    public C12253u mo36859g(long j, TimeUnit timeUnit) {
        return this.f45387e.mo36859g(j, timeUnit);
    }

    /* renamed from: i */
    public final C12253u mo36860i() {
        return this.f45387e;
    }

    /* renamed from: j */
    public final C12238i mo36861j(C12253u uVar) {
        if (uVar != null) {
            this.f45387e = uVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
