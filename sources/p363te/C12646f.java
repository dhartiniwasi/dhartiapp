package p363te;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p264io.flutter.plugin.platform.C10733h;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: te.f */
/* compiled from: StartAppBannerPlugin */
public class C12646f implements C12502a, C12588a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Activity f46394b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public StartAppAd f46395a;

    /* renamed from: te.f$a */
    /* compiled from: StartAppBannerPlugin */
    class C12647a implements AdDisplayListener {
        C12647a() {
        }

        public void adClicked(C9381Ad ad) {
            C12643c.m60158e(C12646f.f46394b);
        }

        public void adDisplayed(C9381Ad ad) {
        }

        public void adHidden(C9381Ad ad) {
        }

        public void adNotDisplayed(C9381Ad ad) {
        }
    }

    /* renamed from: te.f$b */
    /* compiled from: StartAppBannerPlugin */
    class C12648b implements AdEventListener {

        /* renamed from: a */
        final /* synthetic */ C6556k f46397a;

        C12648b(C6556k kVar) {
            this.f46397a = kVar;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            this.f46397a.mo22159c("onFailedToReceiveAd", ad.getErrorMessage());
            Log.e("StartAppPlugin", "Failed to load rewarded video with reason: " + ad.getErrorMessage());
        }

        public void onReceiveAd(C9381Ad ad) {
            C12646f.this.f46395a.showAd();
            this.f46397a.mo22159c("onReceiveAd", (Object) null);
        }
    }

    /* renamed from: e */
    private void m60164e(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        boolean z = true;
        try {
            z = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData.getBoolean("vn.momo.plugin.startapp.SPLASH_AD_ENABLED", true);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!z) {
            StartAppAd.disableSplash();
        }
        StartAppSDK.setTestAdsEnabled(false);
        f46394b = activity;
        this.f46395a = new StartAppAd(applicationContext);
        C12643c.m60156c(f46394b);
    }

    /* renamed from: f */
    public static Activity m60165f() {
        return f46394b;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m60166g(C6556k kVar) {
        kVar.mo22159c("onVideoCompleted", (Object) null);
        Log.d("onVideoCompleted", "Complete");
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m60167h(C6556k kVar, C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1009162322:
                if (str.equals("showRewardedAd")) {
                    c = 0;
                    break;
                }
                break;
            case -903145472:
                if (str.equals("showAd")) {
                    c = 1;
                    break;
                }
                break;
            case 3237136:
                if (str.equals("init")) {
                    c = 2;
                    break;
                }
                break;
            case 1143927581:
                if (str.equals("enableReturnAds")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f46395a.setVideoListener(new C12645e(kVar));
                this.f46395a.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, (AdEventListener) new C12648b(kVar));
                dVar.success((Object) null);
                return;
            case 1:
                if (C12643c.m60159f(f46394b)) {
                    dVar.error("User blocked for 24h", (String) null, (Object) null);
                    return;
                }
                this.f46395a.showAd((AdDisplayListener) new C12647a());
                dVar.success((Object) null);
                return;
            case 2:
                String str2 = (String) jVar.mo22156a("app_id");
                if (str2 == null) {
                    dVar.error("start.io init: app id must not be null", (String) null, (Object) null);
                    return;
                }
                StartAppSDK.setTestAdsEnabled(false);
                StartAppSDK.init((Context) f46394b, str2, true);
                Log.i("start_app", "init app_id start.io : " + str2);
                dVar.success((Object) null);
                return;
            case 3:
                Boolean bool = (Boolean) jVar.mo22156a("enableReturnAds");
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
                Log.e("start.io", "enableReturnAds: " + bool);
                StartAppSDK.enableReturnAds(bool.booleanValue());
                dVar.success((Object) null);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    /* renamed from: i */
    private void m60168i(C10733h hVar, C6539c cVar) {
        hVar.mo34259a("vn.momo.plugin.startapp.StartAppBannerPlugin", new C12640a(cVar));
        C6556k kVar = new C6556k(cVar, "flutter_startapp");
        kVar.mo22161e(new C12644d(this, kVar));
    }

    public void onAttachedToActivity(C12590c cVar) {
        m60164e(cVar.getActivity());
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        m60168i(bVar.mo37296e(), bVar.mo37293b());
    }

    public void onDetachedFromActivity() {
        f46394b = null;
        this.f46395a = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        m60164e(cVar.getActivity());
    }
}
