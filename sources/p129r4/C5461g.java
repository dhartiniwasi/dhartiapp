package p129r4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.ri0;
import p179z3.C6334g;

/* renamed from: r4.g */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C5461g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f27784a;

    /* renamed from: b */
    public final /* synthetic */ String f27785b;

    /* renamed from: c */
    public final /* synthetic */ C6334g f27786c;

    /* renamed from: d */
    public final /* synthetic */ C5457d f27787d;

    public /* synthetic */ C5461g(Context context, String str, C6334g gVar, C5457d dVar) {
        this.f27784a = context;
        this.f27785b = str;
        this.f27786c = gVar;
        this.f27787d = dVar;
    }

    public final void run() {
        Context context = this.f27784a;
        String str = this.f27785b;
        C6334g gVar = this.f27786c;
        try {
            new ri0(context, str).mo13811j(gVar.mo229a(), this.f27787d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "RewardedAd.load");
        }
    }
}
