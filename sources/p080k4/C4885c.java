package p080k4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.p80;
import p179z3.C6334g;

/* renamed from: k4.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C4885c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f25824a;

    /* renamed from: b */
    public final /* synthetic */ String f25825b;

    /* renamed from: c */
    public final /* synthetic */ C6334g f25826c;

    /* renamed from: d */
    public final /* synthetic */ C4884b f25827d;

    public /* synthetic */ C4885c(Context context, String str, C6334g gVar, C4884b bVar) {
        this.f25824a = context;
        this.f25825b = str;
        this.f25826c = gVar;
        this.f25827d = bVar;
    }

    public final void run() {
        Context context = this.f25824a;
        String str = this.f25825b;
        C6334g gVar = this.f25826c;
        try {
            new p80(context, str).mo13166i(gVar.mo229a(), this.f25827d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "InterstitialAd.load");
        }
    }
}
