package p305na;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.PlayerMetaData;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p314oa.C12047a;
import p323pa.C12163a;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: na.d */
/* compiled from: UnityAdsPlugin */
public class C11989d implements C12502a, C6556k.C6560c, C12588a {

    /* renamed from: g */
    private static final String f44927g = "na.d";

    /* renamed from: a */
    private C6556k f44928a;

    /* renamed from: b */
    private Context f44929b;

    /* renamed from: c */
    private Activity f44930c;

    /* renamed from: d */
    private C11984a f44931d;

    /* renamed from: e */
    private C12047a f44932e;

    /* renamed from: f */
    private C12163a f44933f;

    /* renamed from: a */
    private boolean m57829a(Map<?, ?> map) {
        boolean z;
        String str = (String) map.get("gameId");
        boolean z2 = false;
        if (m57830b()) {
            String str2 = (String) map.get("firebaseTestLabMode");
            if ("disableAds".equalsIgnoreCase(str2)) {
                return false;
            }
            z = "showAdsInTestMode".equalsIgnoreCase(str2);
        } else {
            z = false;
        }
        Boolean bool = (Boolean) map.get("testMode");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        Context context = this.f44929b;
        if (bool.booleanValue() || z) {
            z2 = true;
        }
        UnityAds.initialize(context, str, z2, new C11985b(this.f44928a));
        return true;
    }

    /* renamed from: b */
    private boolean m57830b() {
        return "true".equalsIgnoreCase(Settings.System.getString(this.f44929b.getContentResolver(), "firebase.test.lab"));
    }

    /* renamed from: c */
    private boolean m57831c(Map<?, ?> map) {
        String str = (String) map.get("placementId");
        try {
            UnityAds.load(str, new C11987c(this.f44931d));
            return true;
        } catch (Exception e) {
            String str2 = f44927g;
            Log.e(str2, "Exception occurs during loading ad: " + str, e);
            this.f44931d.mo36347b("loadFailed", str, "unknown", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    private boolean m57832d(Map<?, ?> map) {
        String str = (String) map.get("placementId");
        String str2 = (String) map.get("serverId");
        if (str2 != null) {
            PlayerMetaData playerMetaData = new PlayerMetaData(this.f44929b);
            playerMetaData.setServerId(str2);
            playerMetaData.commit();
        }
        try {
            UnityAds.show(this.f44930c, str, (IUnityAdsShowListener) new C11990e(this.f44931d));
            return true;
        } catch (Exception e) {
            String str3 = f44927g;
            Log.e(str3, "Exception occurs during loading ad: " + str, e);
            this.f44931d.mo36347b("showFailed", str, "unknown", e.getMessage());
            return false;
        }
    }

    public void onAttachedToActivity(C12590c cVar) {
        Activity activity = cVar.getActivity();
        this.f44930c = activity;
        this.f44932e.mo36418a(activity);
        this.f44933f.mo36683c(this.f44930c);
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        C6556k kVar = new C6556k(bVar.mo37293b(), "com.rebeloid.unity_ads");
        this.f44928a = kVar;
        kVar.mo22161e(this);
        this.f44929b = bVar.mo37292a();
        C6539c b = bVar.mo37293b();
        this.f44931d = new C11984a(b);
        this.f44933f = new C12163a();
        this.f44932e = new C12047a(b);
        bVar.mo37296e().mo34259a("com.rebeloid.unity_ads/bannerAd", this.f44932e);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        this.f44928a.mo22161e((C6556k.C6560c) null);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        Map map = (Map) jVar.f31000b;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1911971970:
                if (str.equals("showVideo")) {
                    c = 0;
                    break;
                }
                break;
            case -176012470:
                if (str.equals("isInitialized")) {
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
            case 3327206:
                if (str.equals("load")) {
                    c = 3;
                    break;
                }
                break;
            case 880184853:
                if (str.equals("privacyConsent_set")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                dVar.success(Boolean.valueOf(m57832d(map)));
                return;
            case 1:
                dVar.success(Boolean.valueOf(UnityAds.isInitialized()));
                return;
            case 2:
                dVar.success(Boolean.valueOf(m57829a(map)));
                return;
            case 3:
                dVar.success(Boolean.valueOf(m57831c(map)));
                return;
            case 4:
                dVar.success(Boolean.valueOf(this.f44933f.mo36682b(map)));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
    }
}
