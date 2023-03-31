package p176z0;

import androidx.lifecycle.C1228t;
import androidx.work.impl.utils.futures.C1580c;
import p170y0.C6099m;

/* renamed from: z0.c */
/* compiled from: OperationImpl */
public class C6184c implements C6099m {

    /* renamed from: c */
    private final C1228t<C6099m.C6101b> f29674c = new C1228t<>();

    /* renamed from: d */
    private final C1580c<C6099m.C6101b.C6104c> f29675d = C1580c.m7309u();

    public C6184c() {
        mo21102a(C6099m.f29494b);
    }

    /* renamed from: a */
    public void mo21102a(C6099m.C6101b bVar) {
        this.f29674c.mo4352h(bVar);
        if (bVar instanceof C6099m.C6101b.C6104c) {
            this.f29675d.mo6380q((C6099m.C6101b.C6104c) bVar);
        } else if (bVar instanceof C6099m.C6101b.C6102a) {
            this.f29675d.mo6381r(((C6099m.C6101b.C6102a) bVar).mo20930a());
        }
    }
}
