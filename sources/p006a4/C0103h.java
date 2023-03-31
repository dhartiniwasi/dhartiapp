package p006a4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.p80;

/* renamed from: a4.h */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C0103h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f261a;

    /* renamed from: b */
    public final /* synthetic */ String f262b;

    /* renamed from: c */
    public final /* synthetic */ C0095a f263c;

    /* renamed from: d */
    public final /* synthetic */ C0099d f264d;

    public /* synthetic */ C0103h(Context context, String str, C0095a aVar, C0099d dVar) {
        this.f261a = context;
        this.f262b = str;
        this.f263c = aVar;
        this.f264d = dVar;
    }

    public final void run() {
        Context context = this.f261a;
        String str = this.f262b;
        C0095a aVar = this.f263c;
        try {
            new p80(context, str).mo13166i(aVar.mo229a(), this.f264d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "AdManagerInterstitialAd.load");
        }
    }
}
