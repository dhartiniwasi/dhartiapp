package p080k4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.p80;
import p033d5.C4141r;
import p060h4.C4596v;
import p179z3.C6334g;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6353v;

/* renamed from: k4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4883a {
    /* renamed from: b */
    public static void m31060b(Context context, String str, C6334g gVar, C4884b bVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(gVar, "AdRequest cannot be null.");
        C4141r.m28222l(bVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7563i.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C4885c(context, str, gVar, bVar));
                return;
            }
        }
        new p80(context, str).mo13166i(gVar.mo229a(), bVar);
    }

    /* renamed from: a */
    public abstract C6353v mo13161a();

    /* renamed from: c */
    public abstract void mo13162c(C6343m mVar);

    /* renamed from: d */
    public abstract void mo13163d(boolean z);

    /* renamed from: e */
    public abstract void mo13164e(C6348r rVar);

    /* renamed from: f */
    public abstract void mo13165f(Activity activity);
}
