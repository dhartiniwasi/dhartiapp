package p314oa;

import android.app.Activity;
import android.view.View;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6556k;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: oa.c */
/* compiled from: BannerAdView */
public class C12050c implements C10731f {

    /* renamed from: b */
    private static final UnityBannerSize f45051b = new UnityBannerSize(320, 50);

    /* renamed from: a */
    private final BannerView f45052a;

    public C12050c(Activity activity, int i, Map<?, ?> map, C6539c cVar) {
        C6556k kVar = new C6556k(cVar, "com.rebeloid.unity_ads/bannerAd_" + i);
        Integer num = (Integer) map.get("width");
        Integer num2 = (Integer) map.get("height");
        BannerView bannerView = new BannerView(activity, (String) map.get("placementId"), (num == null || num2 == null) ? f45051b : new UnityBannerSize(num.intValue(), num2.intValue()));
        this.f45052a = bannerView;
        bannerView.setListener(new C12048b(kVar));
        bannerView.load();
    }

    public void dispose() {
    }

    public View getView() {
        return this.f45052a;
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        C10730e.m53693a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        C10730e.m53694b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        C10730e.m53695c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        C10730e.m53696d(this);
    }
}
