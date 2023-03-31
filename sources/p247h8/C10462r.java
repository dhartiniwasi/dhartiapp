package p247h8;

import java.util.Date;
import p247h8.C10442g;

/* renamed from: h8.r */
/* compiled from: ExponentialBackoff */
public class C10462r {

    /* renamed from: a */
    private final C10442g f41442a;

    /* renamed from: b */
    private final C10442g.C10448d f41443b;

    /* renamed from: c */
    private final long f41444c;

    /* renamed from: d */
    private final double f41445d;

    /* renamed from: e */
    private final long f41446e;

    /* renamed from: f */
    private long f41447f;

    /* renamed from: g */
    private long f41448g;

    /* renamed from: h */
    private long f41449h;

    /* renamed from: i */
    private C10442g.C10444b f41450i;

    public C10462r(C10442g gVar, C10442g.C10448d dVar, long j, double d, long j2) {
        this.f41442a = gVar;
        this.f41443b = dVar;
        this.f41444c = j;
        this.f41445d = d;
        this.f41446e = j2;
        this.f41447f = j2;
        this.f41449h = new Date().getTime();
        mo33548f();
    }

    /* renamed from: d */
    private long m52756d() {
        return (long) ((Math.random() - 0.5d) * ((double) this.f41448g));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m52757e(Runnable runnable) {
        this.f41449h = new Date().getTime();
        runnable.run();
    }

    /* renamed from: b */
    public void mo33546b(Runnable runnable) {
        mo33547c();
        long d = this.f41448g + m52756d();
        long max = Math.max(0, new Date().getTime() - this.f41449h);
        long max2 = Math.max(0, d - max);
        if (this.f41448g > 0) {
            C10468v.m52767a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f41448g), Long.valueOf(d), Long.valueOf(max));
        }
        this.f41450i = this.f41442a.mo33520k(this.f41443b, max2, new C10461q(this, runnable));
        long j = (long) (((double) this.f41448g) * this.f41445d);
        this.f41448g = j;
        long j2 = this.f41444c;
        if (j < j2) {
            this.f41448g = j2;
        } else {
            long j3 = this.f41447f;
            if (j > j3) {
                this.f41448g = j3;
            }
        }
        this.f41447f = this.f41446e;
    }

    /* renamed from: c */
    public void mo33547c() {
        C10442g.C10444b bVar = this.f41450i;
        if (bVar != null) {
            bVar.mo33528c();
            this.f41450i = null;
        }
    }

    /* renamed from: f */
    public void mo33548f() {
        this.f41448g = 0;
    }

    /* renamed from: g */
    public void mo33549g() {
        this.f41448g = this.f41447f;
    }

    /* renamed from: h */
    public void mo33550h(long j) {
        this.f41447f = j;
    }

    public C10462r(C10442g gVar, C10442g.C10448d dVar) {
        this(gVar, dVar, 1000, 1.5d, 60000);
    }
}
