package p179z3;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C2043a;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.nb0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.v40;
import com.google.android.gms.internal.ads.w40;
import p006a4.C0095a;
import p023c4.C1863e;
import p023c4.C1865f;
import p023c4.C1869h;
import p033d5.C4141r;
import p060h4.C4499e4;
import p060h4.C4511g4;
import p060h4.C4525j0;
import p060h4.C4543m0;
import p060h4.C4558o3;
import p060h4.C4565p4;
import p060h4.C4569q2;
import p060h4.C4584t;
import p060h4.C4596v;
import p108o4.C5220b;

/* renamed from: z3.f */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C6331f {

    /* renamed from: a */
    private final C4565p4 f30509a;

    /* renamed from: b */
    private final Context f30510b;

    /* renamed from: c */
    private final C4525j0 f30511c;

    /* renamed from: z3.f$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static class C6332a {

        /* renamed from: a */
        private final Context f30512a;

        /* renamed from: b */
        private final C4543m0 f30513b;

        public C6332a(Context context, String str) {
            C4543m0 c = C4584t.m30035a().mo18126c(context, str, new nb0());
            this.f30512a = (Context) C4141r.m28222l(context, "context cannot be null");
            this.f30513b = c;
        }

        /* renamed from: a */
        public C6331f mo21646a() {
            try {
                return new C6331f(this.f30512a, this.f30513b.mo13516a(), C4565p4.f24948a);
            } catch (RemoteException e) {
                pm0.m18665e("Failed to build AdLoader.", e);
                return new C6331f(this.f30512a, new C4558o3().mo18088J6(), C4565p4.f24948a);
            }
        }

        @Deprecated
        /* renamed from: b */
        public C6332a mo21647b(String str, C1865f.C1867b bVar, C1865f.C1866a aVar) {
            v40 v40 = new v40(bVar, aVar);
            try {
                this.f30513b.mo13513R4(str, v40.mo14671e(), v40.mo14670d());
            } catch (RemoteException e) {
                pm0.m18668h("Failed to add custom template ad listener", e);
            }
            return this;
        }

        /* renamed from: c */
        public C6332a mo21648c(C2043a.C2046c cVar) {
            try {
                this.f30513b.mo13511H1(new qe0(cVar));
            } catch (RemoteException e) {
                pm0.m18668h("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C6332a mo21649d(C1869h.C1870a aVar) {
            try {
                this.f30513b.mo13511H1(new w40(aVar));
            } catch (RemoteException e) {
                pm0.m18668h("Failed to add google native ad listener", e);
            }
            return this;
        }

        /* renamed from: e */
        public C6332a mo21650e(C6327d dVar) {
            try {
                this.f30513b.mo13510D6(new C4511g4(dVar));
            } catch (RemoteException e) {
                pm0.m18668h("Failed to set AdListener.", e);
            }
            return this;
        }

        @Deprecated
        /* renamed from: f */
        public C6332a mo21651f(C1863e eVar) {
            try {
                this.f30513b.mo13520q1(new f20(eVar));
            } catch (RemoteException e) {
                pm0.m18668h("Failed to specify native ad options", e);
            }
            return this;
        }

        /* renamed from: g */
        public C6332a mo21652g(C5220b bVar) {
            try {
                this.f30513b.mo13520q1(new f20(4, bVar.mo19207e(), -1, bVar.mo19206d(), bVar.mo19203a(), bVar.mo19205c() != null ? new C4499e4(bVar.mo19205c()) : null, bVar.mo19208f(), bVar.mo19204b()));
            } catch (RemoteException e) {
                pm0.m18668h("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    C6331f(Context context, C4525j0 j0Var, C4565p4 p4Var) {
        this.f30510b = context;
        this.f30511c = j0Var;
        this.f30509a = p4Var;
    }

    /* renamed from: d */
    private final void m37276d(C4569q2 q2Var) {
        C2679nz.m17343c(this.f30510b);
        if (((Boolean) c10.f7557c.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C6359z(this, q2Var));
                return;
            }
        }
        try {
            this.f30511c.mo13731H3(this.f30509a.mo18106a(this.f30510b, q2Var));
        } catch (RemoteException e) {
            pm0.m18665e("Failed to load ad.", e);
        }
    }

    /* renamed from: a */
    public void mo21643a(C0095a aVar) {
        m37276d(aVar.f30516a);
    }

    /* renamed from: b */
    public void mo21644b(C6334g gVar) {
        m37276d(gVar.mo229a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21645c(C4569q2 q2Var) {
        try {
            this.f30511c.mo13731H3(this.f30509a.mo18106a(this.f30510b, q2Var));
        } catch (RemoteException e) {
            pm0.m18665e("Failed to load ad.", e);
        }
    }
}
