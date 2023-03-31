package p136s4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.cj0;
import p179z3.C6334g;

/* renamed from: s4.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C5483c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f27827a;

    /* renamed from: b */
    public final /* synthetic */ String f27828b;

    /* renamed from: c */
    public final /* synthetic */ C6334g f27829c;

    /* renamed from: d */
    public final /* synthetic */ C5482b f27830d;

    public /* synthetic */ C5483c(Context context, String str, C6334g gVar, C5482b bVar) {
        this.f27827a = context;
        this.f27828b = str;
        this.f27829c = gVar;
        this.f27830d = bVar;
    }

    public final void run() {
        Context context = this.f27827a;
        String str = this.f27828b;
        C6334g gVar = this.f27829c;
        try {
            new cj0(context, str).mo9196j(gVar.mo229a(), this.f27830d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "RewardedInterstitialAd.load");
        }
    }
}
