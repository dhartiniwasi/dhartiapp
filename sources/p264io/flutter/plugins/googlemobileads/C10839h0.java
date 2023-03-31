package p264io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.nativead.C2043a;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p046f4.C4281b;
import p046f4.C4282c;
import p179z3.C6325c;
import p179z3.C6337h;
import p179z3.C6346p;
import p179z3.C6347q;
import p179z3.C6351u;
import p186ac.C6555j;
import p186ac.C6556k;
import p186ac.C6570s;
import p264io.flutter.embedding.engine.C10685a;
import p264io.flutter.plugins.googlemobileads.C10826e;
import p264io.flutter.plugins.googlemobileads.C10855m;
import p264io.flutter.plugins.googlemobileads.C10874w;
import p271jc.C11555d;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: io.flutter.plugins.googlemobileads.h0 */
/* compiled from: GoogleMobileAdsPlugin */
public class C10839h0 implements C12502a, C12588a, C6556k.C6560c {

    /* renamed from: a */
    private C12502a.C12504b f42313a;

    /* renamed from: b */
    private C10813a f42314b;

    /* renamed from: c */
    private C10816b f42315c;

    /* renamed from: d */
    private AppStateNotifier f42316d;

    /* renamed from: e */
    private C11555d f42317e;

    /* renamed from: f */
    private final Map<String, C10842c> f42318f = new HashMap();

    /* renamed from: g */
    private C10850j0 f42319g;

    /* renamed from: h */
    private final C10873v f42320h = new C10873v();

    /* renamed from: io.flutter.plugins.googlemobileads.h0$a */
    /* compiled from: GoogleMobileAdsPlugin */
    class C10840a implements C6347q {

        /* renamed from: a */
        final /* synthetic */ C6556k.C6561d f42321a;

        C10840a(C6556k.C6561d dVar) {
            this.f42321a = dVar;
        }

        /* renamed from: a */
        public void mo21714a(C6325c cVar) {
            if (cVar != null) {
                this.f42321a.error(Integer.toString(cVar.mo21633a()), cVar.mo21635c(), cVar.mo21634b());
                return;
            }
            this.f42321a.success((Object) null);
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.h0$b */
    /* compiled from: GoogleMobileAdsPlugin */
    private static final class C10841b implements C4282c {

        /* renamed from: a */
        private final C6556k.C6561d f42323a;

        /* renamed from: b */
        private boolean f42324b;

        /* synthetic */ C10841b(C6556k.C6561d dVar, C10840a aVar) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo17708a(C4281b bVar) {
            if (!this.f42324b) {
                this.f42323a.success(new C10870t(bVar));
                this.f42324b = true;
            }
        }

        private C10841b(C6556k.C6561d dVar) {
            this.f42323a = dVar;
            this.f42324b = false;
        }
    }

    /* renamed from: io.flutter.plugins.googlemobileads.h0$c */
    /* compiled from: GoogleMobileAdsPlugin */
    public interface C10842c {
        /* renamed from: a */
        NativeAdView mo27481a(C2043a aVar, Map<String, Object> map);
    }

    /* renamed from: a */
    private boolean m54152a(String str, C10842c cVar) {
        if (this.f42318f.containsKey(str)) {
            Log.e(C10839h0.class.getSimpleName(), String.format("A NativeAdFactory with the following factoryId already exists: %s", new Object[]{str}));
            return false;
        }
        this.f42318f.put(str, cVar);
        return true;
    }

    /* renamed from: c */
    public static boolean m54153c(C10685a aVar, String str, C10842c cVar) {
        return m54154d((C10839h0) aVar.mo34079p().mo34091a(C10839h0.class), str, cVar);
    }

    /* renamed from: d */
    private static boolean m54154d(C10839h0 h0Var, String str, C10842c cVar) {
        if (h0Var != null) {
            return h0Var.m54152a(str, cVar);
        }
        throw new IllegalStateException(String.format("Could not find a %s instance. The plugin may have not been registered.", new Object[]{C10839h0.class.getSimpleName()}));
    }

    /* renamed from: e */
    private C10842c m54155e(String str) {
        return this.f42318f.remove(str);
    }

    /* renamed from: f */
    private static <T> T m54156f(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static C10842c m54157g(C10685a aVar, String str) {
        C12502a a = aVar.mo34079p().mo34091a(C10839h0.class);
        if (a != null) {
            return ((C10839h0) a).m54155e(str);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10819c mo34538b(Context context) {
        return new C10819c(context);
    }

    public void onAttachedToActivity(C12590c cVar) {
        C10813a aVar = this.f42314b;
        if (aVar != null) {
            aVar.mo34467v(cVar.getActivity());
        }
        C10816b bVar = this.f42315c;
        if (bVar != null) {
            bVar.mo34471r(cVar.getActivity());
        }
        C11555d dVar = this.f42317e;
        if (dVar != null) {
            dVar.mo35658c(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        this.f42313a = bVar;
        C10816b bVar2 = new C10816b(bVar.mo37292a(), new C10820c0(bVar.mo37292a()));
        this.f42315c = bVar2;
        C10850j0 j0Var = this.f42319g;
        if (j0Var != null) {
            bVar2.mo34472s(j0Var);
        }
        C6556k kVar = new C6556k(bVar.mo37293b(), "plugins.flutter.io/google_mobile_ads", new C6570s(this.f42315c));
        kVar.mo22161e(this);
        this.f42314b = new C10813a(kVar);
        bVar.mo37296e().mo34259a("plugins.flutter.io/google_mobile_ads/ad_widget", new C10846i0(this.f42314b));
        this.f42316d = new AppStateNotifier(bVar.mo37293b());
        this.f42317e = new C11555d(bVar.mo37293b(), bVar.mo37292a());
    }

    public void onDetachedFromActivity() {
        C12502a.C12504b bVar;
        C10816b bVar2 = this.f42315c;
        if (!(bVar2 == null || (bVar = this.f42313a) == null)) {
            bVar2.mo34471r(bVar.mo37292a());
        }
        C10813a aVar = this.f42314b;
        if (aVar != null) {
            aVar.mo34467v((Activity) null);
        }
        C11555d dVar = this.f42317e;
        if (dVar != null) {
            dVar.mo35658c((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        C12502a.C12504b bVar;
        C10816b bVar2 = this.f42315c;
        if (!(bVar2 == null || (bVar = this.f42313a) == null)) {
            bVar2.mo34471r(bVar.mo37292a());
        }
        C10813a aVar = this.f42314b;
        if (aVar != null) {
            aVar.mo34467v((Activity) null);
        }
        C11555d dVar = this.f42317e;
        if (dVar != null) {
            dVar.mo35658c((Activity) null);
        }
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        AppStateNotifier appStateNotifier = this.f42316d;
        if (appStateNotifier != null) {
            appStateNotifier.mo34447k();
            this.f42316d = null;
        }
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        Context context;
        C10823d0 d0Var;
        C10832e0 e0Var;
        C6555j jVar2 = jVar;
        C6556k.C6561d dVar2 = dVar;
        C10813a aVar = this.f42314b;
        if (aVar == null || this.f42313a == null) {
            Log.e("GoogleMobileAdsPlugin", "method call received before instanceManager initialized: " + jVar2.f30999a);
            return;
        }
        if (aVar.mo34452f() != null) {
            context = this.f42314b.mo34452f();
        } else {
            context = this.f42313a.mo37292a();
        }
        String str = jVar2.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1959534605:
                if (str.equals("MobileAds#openDebugMenu")) {
                    c = 0;
                    break;
                }
                break;
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c = 1;
                    break;
                }
                break;
            case -1826439721:
                if (str.equals("MobileAds#setAppMuted")) {
                    c = 2;
                    break;
                }
                break;
            case -1771320504:
                if (str.equals("loadAppOpenAd")) {
                    c = 3;
                    break;
                }
                break;
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c = 4;
                    break;
                }
                break;
            case -1395015128:
                if (str.equals("MobileAds#getRequestConfiguration")) {
                    c = 5;
                    break;
                }
                break;
            case -1273455673:
                if (str.equals("loadFluidAd")) {
                    c = 6;
                    break;
                }
                break;
            case -965504608:
                if (str.equals("loadNativeAd")) {
                    c = 7;
                    break;
                }
                break;
            case -918684377:
                if (str.equals("setServerSideVerificationOptions")) {
                    c = 8;
                    break;
                }
                break;
            case -768079951:
                if (str.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c = 9;
                    break;
                }
                break;
            case -676596397:
                if (str.equals("loadAdManagerInterstitialAd")) {
                    c = 10;
                    break;
                }
                break;
            case -572043403:
                if (str.equals("loadBannerAd")) {
                    c = 11;
                    break;
                }
                break;
            case -533157842:
                if (str.equals("MobileAds#setAppVolume")) {
                    c = 12;
                    break;
                }
                break;
            case -436783448:
                if (str.equals("MobileAds#getVersionString")) {
                    c = 13;
                    break;
                }
                break;
            case -172783533:
                if (str.equals("loadAdManagerBannerAd")) {
                    c = 14;
                    break;
                }
                break;
            case 90971631:
                if (str.equals("_init")) {
                    c = 15;
                    break;
                }
                break;
            case 250880674:
                if (str.equals("disposeAd")) {
                    c = 16;
                    break;
                }
                break;
            case 273004986:
                if (str.equals("getAdSize")) {
                    c = 17;
                    break;
                }
                break;
            case 288452133:
                if (str.equals("MobileAds#updateRequestConfiguration")) {
                    c = 18;
                    break;
                }
                break;
            case 316173893:
                if (str.equals("MobileAds#disableMediationInitialization")) {
                    c = 19;
                    break;
                }
                break;
            case 1064076149:
                if (str.equals("MobileAds#openAdInspector")) {
                    c = 20;
                    break;
                }
                break;
            case 1355848557:
                if (str.equals("showAdWithoutView")) {
                    c = 21;
                    break;
                }
                break;
            case 1403601573:
                if (str.equals("MobileAds#initialize")) {
                    c = 22;
                    break;
                }
                break;
            case 1661969852:
                if (str.equals("setImmersiveMode")) {
                    c = 23;
                    break;
                }
                break;
            case 1882741923:
                if (str.equals("loadRewardedInterstitialAd")) {
                    c = 24;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f42320h.mo34610f(context, (String) jVar2.mo22156a("adUnitId"));
                dVar2.success((Object) null);
                return;
            case 1:
                C10871u uVar = new C10871u(((Integer) jVar2.mo22156a("adId")).intValue(), this.f42314b, (String) jVar2.mo22156a("adUnitId"), (C10853l) jVar2.mo22156a("request"), new C10838h(context));
                this.f42314b.mo34469x(uVar, ((Integer) jVar2.mo22156a("adId")).intValue());
                uVar.mo34601e();
                dVar2.success((Object) null);
                return;
            case 2:
                this.f42320h.mo34611g(((Boolean) jVar2.mo22156a("muted")).booleanValue());
                dVar2.success((Object) null);
                return;
            case 3:
                C10865p pVar = new C10865p(((Integer) jVar2.mo22156a("adId")).intValue(), ((Integer) jVar2.mo22156a(AdUnitActivity.EXTRA_ORIENTATION)).intValue(), (C10813a) m54156f(this.f42314b), (String) m54156f((String) jVar2.mo22156a("adUnitId")), (C10853l) jVar2.mo22156a("request"), (C10843i) jVar2.mo22156a("adManagerRequest"), new C10838h(context));
                this.f42314b.mo34469x(pVar, ((Integer) jVar2.mo22156a("adId")).intValue());
                pVar.mo34597h();
                dVar2.success((Object) null);
                return;
            case 4:
                String str2 = (String) m54156f((String) jVar2.mo22156a("adUnitId"));
                C10853l lVar = (C10853l) jVar2.mo22156a("request");
                C10843i iVar = (C10843i) jVar2.mo22156a("adManagerRequest");
                if (lVar != null) {
                    d0Var = new C10823d0(((Integer) jVar2.mo22156a("adId")).intValue(), (C10813a) m54156f(this.f42314b), str2, lVar, new C10838h(context));
                } else if (iVar != null) {
                    d0Var = new C10823d0(((Integer) jVar2.mo22156a("adId")).intValue(), (C10813a) m54156f(this.f42314b), str2, iVar, new C10838h(context));
                } else {
                    dVar2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.f42314b.mo34469x(d0Var, ((Integer) m54156f((Integer) jVar2.mo22156a("adId"))).intValue());
                d0Var.mo34484e();
                dVar2.success((Object) null);
                return;
            case 5:
                dVar2.success(this.f42320h.mo34606b());
                return;
            case 6:
                C10821d dVar3 = new C10821d(((Integer) jVar2.mo22156a("adId")).intValue(), this.f42314b, (String) jVar2.mo22156a("adUnitId"), (C10843i) jVar2.mo22156a("request"), mo34538b(context));
                this.f42314b.mo34469x(dVar3, ((Integer) jVar2.mo22156a("adId")).intValue());
                dVar3.mo34551d();
                dVar2.success((Object) null);
                return;
            case 7:
                String str3 = (String) jVar2.mo22156a("factoryId");
                C10842c cVar = this.f42318f.get(str3);
                if (cVar == null) {
                    dVar2.error("NativeAdError", String.format("Can't find NativeAdFactory with id: %s", new Object[]{str3}), (Object) null);
                    return;
                }
                C10874w a = new C10874w.C10875a().mo34622h(this.f42314b).mo34618d((String) jVar2.mo22156a("adUnitId")).mo34616b(cVar).mo34624j((C10853l) jVar2.mo22156a("request")).mo34617c((C10843i) jVar2.mo22156a("adManagerRequest")).mo34619e((Map) jVar2.mo22156a("customOptions")).mo34621g(((Integer) jVar2.mo22156a("adId")).intValue()).mo34623i((C10878z) jVar2.mo22156a("nativeAdOptions")).mo34620f(new C10838h(context)).mo34615a();
                this.f42314b.mo34469x(a, ((Integer) jVar2.mo22156a("adId")).intValue());
                a.mo34613c();
                dVar2.success((Object) null);
                return;
            case 8:
                C10826e b = this.f42314b.mo34448b(((Integer) jVar2.mo22156a("adId")).intValue());
                C10835f0 f0Var = (C10835f0) jVar2.mo22156a("serverSideVerificationOptions");
                if (b == null) {
                    Log.w("GoogleMobileAdsPlugin", "Error - null ad in setServerSideVerificationOptions");
                } else if (b instanceof C10823d0) {
                    ((C10823d0) b).mo34489j(f0Var);
                } else if (b instanceof C10832e0) {
                    ((C10832e0) b).mo34520j(f0Var);
                } else {
                    Log.w("GoogleMobileAdsPlugin", "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                dVar2.success((Object) null);
                return;
            case 9:
                C10855m.C10857b bVar = new C10855m.C10857b(context, new C10855m.C10856a(), (String) jVar2.mo22156a(AdUnitActivity.EXTRA_ORIENTATION), ((Integer) jVar2.mo22156a("width")).intValue());
                if (C6337h.f30526q.equals(bVar.f42364a)) {
                    dVar2.success((Object) null);
                    return;
                } else {
                    dVar2.success(Integer.valueOf(bVar.f42366c));
                    return;
                }
            case 10:
                C10851k kVar = new C10851k(((Integer) jVar2.mo22156a("adId")).intValue(), (C10813a) m54156f(this.f42314b), (String) m54156f((String) jVar2.mo22156a("adUnitId")), (C10843i) jVar2.mo22156a("request"), new C10838h(context));
                this.f42314b.mo34469x(kVar, ((Integer) m54156f((Integer) jVar2.mo22156a("adId"))).intValue());
                kVar.mo34553e();
                dVar2.success((Object) null);
                return;
            case 11:
                C10867q qVar = new C10867q(((Integer) jVar2.mo22156a("adId")).intValue(), this.f42314b, (String) jVar2.mo22156a("adUnitId"), (C10853l) jVar2.mo22156a("request"), (C10855m) jVar2.mo22156a("size"), mo34538b(context));
                this.f42314b.mo34469x(qVar, ((Integer) jVar2.mo22156a("adId")).intValue());
                qVar.mo34600d();
                dVar2.success((Object) null);
                return;
            case 12:
                this.f42320h.mo34612h(((Double) jVar2.mo22156a("volume")).doubleValue());
                dVar2.success((Object) null);
                return;
            case 13:
                dVar2.success(this.f42320h.mo34607c());
                return;
            case 14:
                C10848j jVar3 = new C10848j(((Integer) jVar2.mo22156a("adId")).intValue(), this.f42314b, (String) jVar2.mo22156a("adUnitId"), (List) jVar2.mo22156a("sizes"), (C10843i) jVar2.mo22156a("request"), mo34538b(context));
                this.f42314b.mo34469x(jVar3, ((Integer) jVar2.mo22156a("adId")).intValue());
                jVar3.mo34551d();
                dVar2.success((Object) null);
                return;
            case 15:
                this.f42314b.mo34451e();
                dVar2.success((Object) null);
                return;
            case 16:
                this.f42314b.mo34450d(((Integer) jVar2.mo22156a("adId")).intValue());
                dVar2.success((Object) null);
                return;
            case 17:
                C10826e b2 = this.f42314b.mo34448b(((Integer) jVar2.mo22156a("adId")).intValue());
                if (b2 == null) {
                    dVar2.success((Object) null);
                    return;
                } else if (b2 instanceof C10867q) {
                    dVar2.success(((C10867q) b2).mo34599c());
                    return;
                } else if (b2 instanceof C10848j) {
                    dVar2.success(((C10848j) b2).mo34550c());
                    return;
                } else {
                    dVar2.error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + b2, (Object) null);
                    return;
                }
            case 18:
                C6351u.C6352a e = C6346p.m37349b().mo21720e();
                String str4 = (String) jVar2.mo22156a("maxAdContentRating");
                Integer num = (Integer) jVar2.mo22156a("tagForChildDirectedTreatment");
                Integer num2 = (Integer) jVar2.mo22156a("tagForUnderAgeOfConsent");
                List list = (List) jVar2.mo22156a("testDeviceIds");
                if (str4 != null) {
                    e.mo21722b(str4);
                }
                if (num != null) {
                    e.mo21723c(num.intValue());
                }
                if (num2 != null) {
                    e.mo21724d(num2.intValue());
                }
                if (list != null) {
                    e.mo21725e(list);
                }
                C6346p.m37356i(e.mo21721a());
                dVar2.success((Object) null);
                return;
            case 19:
                this.f42320h.mo34605a(context);
                dVar2.success((Object) null);
                return;
            case 20:
                this.f42320h.mo34609e(context, new C10840a(dVar2));
                return;
            case 21:
                if (!this.f42314b.mo34468w(((Integer) jVar2.mo22156a("adId")).intValue())) {
                    dVar2.error("AdShowError", "Ad failed to show.", (Object) null);
                    return;
                } else {
                    dVar2.success((Object) null);
                    return;
                }
            case 22:
                this.f42320h.mo34608d(context, new C10841b(dVar2, (C10840a) null));
                return;
            case 23:
                ((C10826e.C10830d) this.f42314b.mo34448b(((Integer) jVar2.mo22156a("adId")).intValue())).mo34482c(((Boolean) jVar2.mo22156a("immersiveModeEnabled")).booleanValue());
                dVar2.success((Object) null);
                return;
            case 24:
                String str5 = (String) m54156f((String) jVar2.mo22156a("adUnitId"));
                C10853l lVar2 = (C10853l) jVar2.mo22156a("request");
                C10843i iVar2 = (C10843i) jVar2.mo22156a("adManagerRequest");
                if (lVar2 != null) {
                    e0Var = new C10832e0(((Integer) jVar2.mo22156a("adId")).intValue(), (C10813a) m54156f(this.f42314b), str5, lVar2, new C10838h(context));
                } else if (iVar2 != null) {
                    e0Var = new C10832e0(((Integer) jVar2.mo22156a("adId")).intValue(), (C10813a) m54156f(this.f42314b), str5, iVar2, new C10838h(context));
                } else {
                    dVar2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.f42314b.mo34469x(e0Var, ((Integer) m54156f((Integer) jVar2.mo22156a("adId"))).intValue());
                e0Var.mo34515e();
                dVar2.success((Object) null);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        C10813a aVar = this.f42314b;
        if (aVar != null) {
            aVar.mo34467v(cVar.getActivity());
        }
        C10816b bVar = this.f42315c;
        if (bVar != null) {
            bVar.mo34471r(cVar.getActivity());
        }
        C11555d dVar = this.f42317e;
        if (dVar != null) {
            dVar.mo35658c(cVar.getActivity());
        }
    }
}
