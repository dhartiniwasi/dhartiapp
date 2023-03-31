package p136s4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.cj0;
import p006a4.C0095a;

/* renamed from: s4.d */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C5484d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f27831a;

    /* renamed from: b */
    public final /* synthetic */ String f27832b;

    /* renamed from: c */
    public final /* synthetic */ C0095a f27833c;

    /* renamed from: d */
    public final /* synthetic */ C5482b f27834d;

    public /* synthetic */ C5484d(Context context, String str, C0095a aVar, C5482b bVar) {
        this.f27831a = context;
        this.f27832b = str;
        this.f27833c = aVar;
        this.f27834d = bVar;
    }

    public final void run() {
        Context context = this.f27831a;
        String str = this.f27832b;
        C0095a aVar = this.f27833c;
        try {
            new cj0(context, str).mo9196j(aVar.mo229a(), this.f27834d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "RewardedInterstitialAdManager.load");
        }
    }
}
