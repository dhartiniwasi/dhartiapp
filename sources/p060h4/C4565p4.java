package p060h4;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.im0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import p122q4.C5399a;
import p122q4.C5400b;
import p179z3.C6351u;

/* renamed from: h4.p4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4565p4 {

    /* renamed from: a */
    public static final C4565p4 f24948a = new C4565p4();

    protected C4565p4() {
    }

    /* renamed from: a */
    public final C4541l4 mo18106a(Context context, C4569q2 q2Var) {
        List list;
        Context context2;
        C4615y0 y0Var;
        String str;
        C4569q2 q2Var2 = q2Var;
        Date m = q2Var.mo18119m();
        long time = m != null ? m.getTime() : -1;
        String j = q2Var.mo18116j();
        int a = q2Var.mo18107a();
        Set p = q2Var.mo18122p();
        if (!p.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(p));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean r = q2Var2.mo18124r(context2);
        Bundle e = q2Var2.mo18111e(AdMobAdapter.class);
        C5399a g = q2Var.mo18113g();
        if (g != null) {
            C5400b b = g.mo19523b();
            y0Var = new C4615y0(q2Var.mo18113g().mo19522a(), b != null ? b.mo19525c().mo18058b() : "");
        } else {
            y0Var = null;
        }
        String k = q2Var.mo18117k();
        q2Var.mo18114h();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            C4584t.m30036b();
            str = im0.m14411r(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean q = q2Var.mo18123q();
        C6351u b2 = C4492d3.m29601e().mo18027b();
        return new C4541l4(8, time, e, a, list, r, Math.max(q2Var.mo18109c(), b2.mo21717b()), false, k, (C4481b4) null, (Location) null, j, q2Var.mo18112f(), q2Var.mo18110d(), Collections.unmodifiableList(new ArrayList(q2Var.mo18121o())), q2Var.mo18118l(), str, q, y0Var, Math.max(-1, b2.mo21718c()), (String) Collections.max(Arrays.asList(new String[]{null, b2.mo21716a()}), C4559o4.f24925a), q2Var.mo18120n(), q2Var.mo18108b(), q2Var.mo18115i());
    }
}
