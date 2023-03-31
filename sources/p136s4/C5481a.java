package p136s4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.cj0;
import com.google.android.gms.internal.ads.em0;
import p006a4.C0095a;
import p033d5.C4141r;
import p060h4.C4596v;
import p129r4.C5454a;
import p129r4.C5458e;
import p179z3.C6334g;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6349s;
import p179z3.C6353v;

/* renamed from: s4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C5481a {
    /* renamed from: b */
    public static void m33426b(Context context, String str, C0095a aVar, C5482b bVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(aVar, "AdManagerAdRequest cannot be null.");
        C4141r.m28222l(bVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7566l.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C5484d(context, str, aVar, bVar));
                return;
            }
        }
        new cj0(context, str).mo9196j(aVar.mo229a(), bVar);
    }

    /* renamed from: c */
    public static void m33427c(Context context, String str, C6334g gVar, C5482b bVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(gVar, "AdRequest cannot be null.");
        C4141r.m28222l(bVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7566l.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C5483c(context, str, gVar, bVar));
                return;
            }
        }
        new cj0(context, str).mo9196j(gVar.mo229a(), bVar);
    }

    /* renamed from: a */
    public abstract C6353v mo9189a();

    /* renamed from: d */
    public abstract void mo9190d(C6343m mVar);

    /* renamed from: e */
    public abstract void mo9191e(boolean z);

    /* renamed from: f */
    public abstract void mo9192f(C5454a aVar);

    /* renamed from: g */
    public abstract void mo9193g(C6348r rVar);

    /* renamed from: h */
    public abstract void mo9194h(C5458e eVar);

    /* renamed from: i */
    public abstract void mo9195i(Activity activity, C6349s sVar);
}
