package p057h1;

import androidx.work.impl.WorkDatabase;
import p050g1.C4332q;
import p170y0.C6094j;
import p170y0.C6110s;
import p176z0.C6185d;
import p176z0.C6191i;

/* renamed from: h1.i */
/* compiled from: StopWorkRunnable */
public class C4425i implements Runnable {

    /* renamed from: d */
    private static final String f24603d = C6094j.m35719f("StopWorkRunnable");

    /* renamed from: a */
    private final C6191i f24604a;

    /* renamed from: b */
    private final String f24605b;

    /* renamed from: c */
    private final boolean f24606c;

    public C4425i(C6191i iVar, String str, boolean z) {
        this.f24604a = iVar;
        this.f24605b = str;
        this.f24606c = z;
    }

    public void run() {
        boolean z;
        WorkDatabase q = this.f24604a.mo21130q();
        C6185d o = this.f24604a.mo21128o();
        C4332q B = q.mo6318B();
        q.mo5592c();
        try {
            boolean h = o.mo21106h(this.f24605b);
            if (this.f24606c) {
                z = this.f24604a.mo21128o().mo21111n(this.f24605b);
            } else {
                if (!h && B.mo17765m(this.f24605b) == C6110s.RUNNING) {
                    B.mo17754b(C6110s.ENQUEUED, this.f24605b);
                }
                z = this.f24604a.mo21128o().mo21112o(this.f24605b);
            }
            C6094j.m35717c().mo20921a(f24603d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f24605b, Boolean.valueOf(z)}), new Throwable[0]);
            q.mo5606r();
        } finally {
            q.mo5596g();
        }
    }
}
