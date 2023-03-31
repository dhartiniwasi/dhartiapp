package p305na;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.HashMap;
import p186ac.C6556k;

/* renamed from: na.b */
/* compiled from: UnityAdsInitializationListener */
public class C11985b implements IUnityAdsInitializationListener {

    /* renamed from: a */
    private final C6556k f44923a;

    /* renamed from: na.b$a */
    /* compiled from: UnityAdsInitializationListener */
    static /* synthetic */ class C11986a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsInitializationError[] r0 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44924a = r0
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsInitializationError r1 = com.unity3d.ads.UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p305na.C11985b.C11986a.<clinit>():void");
        }
    }

    public C11985b(C6556k kVar) {
        this.f44923a = kVar;
    }

    /* renamed from: a */
    private String m57827a(UnityAds.UnityAdsInitializationError unityAdsInitializationError) {
        int i = C11986a.f44924a[unityAdsInitializationError.ordinal()];
        if (i == 1) {
            return "internalError";
        }
        if (i != 2) {
            return i != 3 ? "" : "adBlockerDetected";
        }
        return "invalidArgument";
    }

    public void onInitializationComplete() {
        this.f44923a.mo22159c("initComplete", new HashMap());
    }

    public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", m57827a(unityAdsInitializationError));
        hashMap.put("errorMessage", str);
        this.f44923a.mo22159c("initFailed", hashMap);
    }
}
