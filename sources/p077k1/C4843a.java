package p077k1;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import java.util.HashMap;
import p186ac.C6555j;
import p186ac.C6556k;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: k1.a */
/* compiled from: FacebookAudienceNetworkPlugin */
public class C4843a implements C12502a, C6556k.C6560c, C12588a {

    /* renamed from: a */
    private C6556k f25602a;

    /* renamed from: b */
    private C6556k f25603b;

    /* renamed from: c */
    private C6556k f25604c;

    /* renamed from: d */
    private Activity f25605d;

    /* renamed from: e */
    private Context f25606e;

    /* renamed from: a */
    private boolean m30871a(HashMap hashMap) {
        String str = (String) hashMap.get("testingId");
        AudienceNetworkAds.initialize(this.f25605d.getApplicationContext());
        if (str == null) {
            return true;
        }
        AdSettings.addTestDevice(str);
        return true;
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.f25605d = cVar.getActivity();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C6556k kVar = new C6556k(bVar.mo37293b(), "fb.audience.network.io");
        this.f25602a = kVar;
        kVar.mo22161e(this);
        this.f25606e = bVar.mo37292a();
        C6556k kVar2 = new C6556k(bVar.mo37293b(), "fb.audience.network.io/interstitialAd");
        this.f25603b = kVar2;
        kVar2.mo22161e(new C4846d(this.f25606e, kVar2));
        C6556k kVar3 = new C6556k(bVar.mo37293b(), "fb.audience.network.io/rewardedAd");
        this.f25604c = kVar3;
        kVar3.mo22161e(new C4851g(this.f25606e, kVar3));
        bVar.mo37296e().mo34259a("fb.audience.network.io/bannerAd", new C4844b(bVar.mo37293b()));
        bVar.mo37296e().mo34259a("fb.audience.network.io/nativeAd", new C4848e(bVar.mo37293b()));
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f25602a.mo22161e((C6556k.C6560c) null);
        this.f25603b.mo22161e((C6556k.C6560c) null);
        this.f25604c.mo22161e((C6556k.C6560c) null);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (jVar.f30999a.equals("init")) {
            dVar.success(Boolean.valueOf(m30871a((HashMap) jVar.f31000b)));
        } else {
            dVar.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        onAttachedToActivity(cVar);
    }
}
