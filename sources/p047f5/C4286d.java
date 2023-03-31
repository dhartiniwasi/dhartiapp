package p047f5;

import android.content.Context;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2063c;
import com.google.android.gms.common.api.internal.C2089g;
import p033d5.C4153v;
import p033d5.C4159x;
import p033d5.C4162y;
import p123q5.C5406d;
import p218e6.C9975i;

/* renamed from: f5.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4286d extends C2063c<C4162y> implements C4159x {

    /* renamed from: k */
    private static final C2051a.C2061g<C4287e> f23743k;

    /* renamed from: l */
    private static final C2051a.C2052a<C4287e, C4162y> f23744l;

    /* renamed from: m */
    private static final C2051a<C4162y> f23745m;

    /* renamed from: n */
    public static final /* synthetic */ int f23746n = 0;

    static {
        C2051a.C2061g<C4287e> gVar = new C2051a.C2061g<>();
        f23743k = gVar;
        C4285c cVar = new C4285c();
        f23744l = cVar;
        f23745m = new C2051a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C4286d(Context context, C4162y yVar) {
        super(context, f23745m, yVar, C2063c.C2064a.f6061c);
    }

    /* renamed from: b */
    public final C9975i<Void> mo17487b(C4153v vVar) {
        C2089g.C2090a a = C2089g.m9277a();
        a.mo8064d(C5406d.f27630a);
        a.mo8063c(false);
        a.mo8062b(new C4284b(vVar));
        return mo7972e(a.mo8061a());
    }
}
