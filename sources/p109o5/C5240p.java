package p109o5;

import android.content.Context;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2063c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2089g;
import p007a5.C0104a;
import p150u4.C5746b;
import p150u4.C5747c;
import p150u4.C5752h;
import p180z4.C6370f;
import p218e6.C9975i;
import p218e6.C9980l;

/* renamed from: o5.p */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5240p extends C2063c<C2051a.C2055d.C2058c> implements C5746b {

    /* renamed from: m */
    private static final C2051a.C2061g<C5228d> f27093m;

    /* renamed from: n */
    private static final C2051a.C2052a<C5228d, C2051a.C2055d.C2058c> f27094n;

    /* renamed from: o */
    private static final C2051a<C2051a.C2055d.C2058c> f27095o;

    /* renamed from: k */
    private final Context f27096k;

    /* renamed from: l */
    private final C6370f f27097l;

    static {
        C2051a.C2061g<C5228d> gVar = new C2051a.C2061g<>();
        f27093m = gVar;
        C5238n nVar = new C5238n();
        f27094n = nVar;
        f27095o = new C2051a<>("AppSet.API", nVar, gVar);
    }

    C5240p(Context context, C6370f fVar) {
        super(context, f27095o, C2051a.C2055d.f6049a, C2063c.C2064a.f6061c);
        this.f27096k = context;
        this.f27097l = fVar;
    }

    /* renamed from: a */
    public final C9975i<C5747c> mo19226a() {
        if (this.f27097l.mo21777j(this.f27096k, 212800000) != 0) {
            return C9980l.m51030d(new C0104a(new Status(17)));
        }
        return mo7974g(C2089g.m9277a().mo8064d(C5752h.f28721a).mo8062b(new C5237m(this)).mo8063c(false).mo8065e(27601).mo8061a());
    }
}
