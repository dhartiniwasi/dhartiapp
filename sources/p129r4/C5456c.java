package p129r4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.ri0;
import p006a4.C0095a;
import p033d5.C4141r;
import p060h4.C4596v;
import p179z3.C6334g;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6349s;
import p179z3.C6353v;

/* renamed from: r4.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C5456c {
    /* renamed from: b */
    public static void m33388b(Context context, String str, C0095a aVar, C5457d dVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(aVar, "AdManagerAdRequest cannot be null.");
        C4141r.m28222l(dVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7566l.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                pm0.m18662b("Loading on background thread");
                em0.f8846b.execute(new C5460f(context, str, aVar, dVar));
                return;
            }
        }
        pm0.m18662b("Loading on UI thread");
        new ri0(context, str).mo13811j(aVar.mo229a(), dVar);
    }

    /* renamed from: c */
    public static void m33389c(Context context, String str, C6334g gVar, C5457d dVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(gVar, "AdRequest cannot be null.");
        C4141r.m28222l(dVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7566l.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C5461g(context, str, gVar, dVar));
                return;
            }
        }
        pm0.m18662b("Loading on UI thread");
        new ri0(context, str).mo13811j(gVar.mo229a(), dVar);
    }

    /* renamed from: a */
    public abstract C6353v mo13804a();

    /* renamed from: d */
    public abstract void mo13805d(C6343m mVar);

    /* renamed from: e */
    public abstract void mo13806e(boolean z);

    /* renamed from: f */
    public abstract void mo13807f(C5454a aVar);

    /* renamed from: g */
    public abstract void mo13808g(C6348r rVar);

    /* renamed from: h */
    public abstract void mo13809h(C5458e eVar);

    /* renamed from: i */
    public abstract void mo13810i(Activity activity, C6349s sVar);
}
