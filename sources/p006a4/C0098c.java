package p006a4;

import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.p80;
import p033d5.C4141r;
import p060h4.C4596v;
import p080k4.C4883a;

/* renamed from: a4.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C0098c extends C4883a {
    /* renamed from: g */
    public static void m582g(Context context, String str, C0095a aVar, C0099d dVar) {
        C4141r.m28222l(context, "Context cannot be null.");
        C4141r.m28222l(str, "AdUnitId cannot be null.");
        C4141r.m28222l(aVar, "AdManagerAdRequest cannot be null.");
        C4141r.m28222l(dVar, "LoadCallback cannot be null.");
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(context);
        if (((Boolean) c10.f7563i.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C0103h(context, str, aVar, dVar));
                return;
            }
        }
        new p80(context, str).mo13166i(aVar.mo229a(), dVar);
    }

    /* renamed from: h */
    public abstract void mo247h(C0100e eVar);
}
