package p140t1;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p084l1.C4908h;
import p098n1.C5085i;
import p098n1.C5095o;
import p098n1.C5100t;
import p105o1.C5154e;
import p105o1.C5165m;
import p147u1.C5708y;
import p153v1.C5761d;
import p159w1.C5889b;

/* renamed from: t1.c */
/* compiled from: DefaultScheduler */
public class C5500c implements C5502e {

    /* renamed from: f */
    private static final Logger f27961f = Logger.getLogger(C5100t.class.getName());

    /* renamed from: a */
    private final C5708y f27962a;

    /* renamed from: b */
    private final Executor f27963b;

    /* renamed from: c */
    private final C5154e f27964c;

    /* renamed from: d */
    private final C5761d f27965d;

    /* renamed from: e */
    private final C5889b f27966e;

    public C5500c(Executor executor, C5154e eVar, C5708y yVar, C5761d dVar, C5889b bVar) {
        this.f27963b = executor;
        this.f27964c = eVar;
        this.f27962a = yVar;
        this.f27965d = dVar;
        this.f27966e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m33459d(C5095o oVar, C5085i iVar) {
        this.f27965d.mo20268p0(oVar, iVar);
        this.f27962a.mo20074b(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m33460e(C5095o oVar, C4908h hVar, C5085i iVar) {
        try {
            C5165m mVar = this.f27964c.get(oVar.mo19024b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.mo19024b()});
                f27961f.warning(format);
                hVar.mo18734a(new IllegalArgumentException(format));
                return;
            }
            this.f27966e.mo20278f(new C12532b(this, oVar, mVar.mo7717a(iVar)));
            hVar.mo18734a((Exception) null);
        } catch (Exception e) {
            Logger logger = f27961f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo18734a(e);
        }
    }

    /* renamed from: a */
    public void mo19777a(C5095o oVar, C5085i iVar, C4908h hVar) {
        this.f27963b.execute(new C12531a(this, oVar, hVar, iVar));
    }
}
