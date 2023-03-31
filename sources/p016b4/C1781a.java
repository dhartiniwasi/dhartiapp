package p016b4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.C3007wt;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import p006a4.C0095a;
import p033d5.C4141r;
import p060h4.C4596v;
import p179z3.C6329e;
import p179z3.C6334g;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6353v;

/* renamed from: b4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C1781a {

    /* renamed from: b4.a$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class C1782a extends C6329e<C1781a> {
    }

    /* renamed from: b */
    public static void m8412b(Context context, String str, C0095a aVar, int i, C1782a aVar2) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "adUnitId cannot be null.");
        C4141r.m28222l(aVar, "AdManagerAdRequest cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7558d.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C1783b(context, str, aVar, i, aVar2));
                return;
            }
        }
        new C3007wt(context, str, aVar.mo229a(), i, aVar2).mo14991a();
    }

    /* renamed from: c */
    public static void m8413c(Context context, String str, C6334g gVar, int i, C1782a aVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "adUnitId cannot be null.");
        C4141r.m28222l(gVar, "AdRequest cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7558d.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C1784c(context, str, gVar, i, aVar));
                return;
            }
        }
        new C3007wt(context, str, gVar.mo229a(), i, aVar).mo14991a();
    }

    /* renamed from: a */
    public abstract C6353v mo6907a();

    /* renamed from: d */
    public abstract void mo6908d(C6343m mVar);

    /* renamed from: e */
    public abstract void mo6909e(boolean z);

    /* renamed from: f */
    public abstract void mo6910f(C6348r rVar);

    /* renamed from: g */
    public abstract void mo6911g(Activity activity);
}
