package p129r4;

import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.ri0;
import p006a4.C0095a;

/* renamed from: r4.f */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class C5460f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f27780a;

    /* renamed from: b */
    public final /* synthetic */ String f27781b;

    /* renamed from: c */
    public final /* synthetic */ C0095a f27782c;

    /* renamed from: d */
    public final /* synthetic */ C5457d f27783d;

    public /* synthetic */ C5460f(Context context, String str, C0095a aVar, C5457d dVar) {
        this.f27780a = context;
        this.f27781b = str;
        this.f27782c = aVar;
        this.f27783d = dVar;
    }

    public final void run() {
        Context context = this.f27780a;
        String str = this.f27781b;
        C0095a aVar = this.f27782c;
        try {
            new ri0(context, str).mo13811j(aVar.mo229a(), this.f27783d);
        } catch (IllegalStateException e) {
            ag0.m9704c(context).mo8326b(e, "RewardedAd.loadAdManager");
        }
    }
}
