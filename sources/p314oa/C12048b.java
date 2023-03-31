package p314oa;

import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import java.util.HashMap;
import p186ac.C6556k;

/* renamed from: oa.b */
/* compiled from: BannerAdListener */
class C12048b implements BannerView.IListener {

    /* renamed from: a */
    private final C6556k f45049a;

    /* renamed from: oa.b$a */
    /* compiled from: BannerAdListener */
    static /* synthetic */ class C12049a {

        /* renamed from: a */
        static final /* synthetic */ int[] f45050a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.unity3d.services.banners.BannerErrorCode[] r0 = com.unity3d.services.banners.BannerErrorCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45050a = r0
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45050a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NATIVE_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f45050a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.WEBVIEW_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f45050a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.services.banners.BannerErrorCode r1 = com.unity3d.services.banners.BannerErrorCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p314oa.C12048b.C12049a.<clinit>():void");
        }
    }

    public C12048b(C6556k kVar) {
        this.f45049a = kVar;
    }

    /* renamed from: a */
    private String m58005a(BannerErrorInfo bannerErrorInfo) {
        int i = C12049a.f45050a[bannerErrorInfo.errorCode.ordinal()];
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "native";
        }
        if (i != 3) {
            return i != 4 ? "" : "noFill";
        }
        return "webView";
    }

    public void onBannerClick(BannerView bannerView) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        this.f45049a.mo22159c("banner_clicked", hashMap);
    }

    public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        hashMap.put("errorCode", m58005a(bannerErrorInfo));
        hashMap.put("errorMessage", bannerErrorInfo.errorMessage);
        this.f45049a.mo22159c("banner_error", hashMap);
    }

    public void onBannerLeftApplication(BannerView bannerView) {
    }

    public void onBannerLoaded(BannerView bannerView) {
        HashMap hashMap = new HashMap();
        hashMap.put("placementId", bannerView.getPlacementId());
        this.f45049a.mo22159c("banner_loaded", hashMap);
    }
}
