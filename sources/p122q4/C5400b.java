package p122q4;

import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.sf0;
import p060h4.C4510g3;
import p060h4.C4569q2;
import p060h4.C4596v;
import p179z3.C6323b;
import p179z3.C6334g;

/* renamed from: q4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C5400b {

    /* renamed from: a */
    private final C4510g3 f27622a;

    public C5400b(C4510g3 g3Var) {
        this.f27622a = g3Var;
    }

    /* renamed from: a */
    public static void m33145a(Context context, C6323b bVar, C6334g gVar, C5401c cVar) {
        C4569q2 q2Var;
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7565k.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C5402d(context, bVar, gVar, cVar));
                return;
            }
        }
        if (gVar == null) {
            q2Var = null;
        } else {
            q2Var = gVar.mo229a();
        }
        new sf0(context, bVar, q2Var).mo13993b(cVar);
    }

    /* renamed from: b */
    public String mo19524b() {
        return this.f27622a.mo18057a();
    }

    /* renamed from: c */
    public final C4510g3 mo19525c() {
        return this.f27622a;
    }
}
