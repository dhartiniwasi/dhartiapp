package p305na;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;

/* renamed from: na.c */
/* compiled from: UnityAdsLoadListener */
public class C11987c implements IUnityAdsLoadListener {

    /* renamed from: a */
    private final C11984a f44925a;

    /* renamed from: na.c$a */
    /* compiled from: UnityAdsLoadListener */
    static /* synthetic */ class C11988a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44926a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.unity3d.ads.UnityAds$UnityAdsLoadError[] r0 = com.unity3d.ads.UnityAds.UnityAdsLoadError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44926a = r0
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44926a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44926a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44926a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44926a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p305na.C11987c.C11988a.<clinit>():void");
        }
    }

    public C11987c(C11984a aVar) {
        this.f44925a = aVar;
    }

    /* renamed from: a */
    private String m57828a(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = C11988a.f44926a[unityAdsLoadError.ordinal()];
        if (i == 1) {
            return "initializeFailed";
        }
        if (i == 2) {
            return "internalError";
        }
        if (i == 3) {
            return "invalidArgument";
        }
        if (i != 4) {
            return i != 5 ? "" : "timeout";
        }
        return "noFill";
    }

    public void onUnityAdsAdLoaded(String str) {
        this.f44925a.mo36346a("loadComplete", str);
    }

    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f44925a.mo36347b("loadFailed", str, m57828a(unityAdsLoadError), str2);
    }
}
