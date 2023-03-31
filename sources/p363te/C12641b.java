package p363te;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerListener;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;
import p360tb.C12588a;
import p360tb.C12590c;

/* renamed from: te.b */
/* compiled from: FlutterBannerView */
public class C12641b implements C10731f, C6556k.C6560c, C12588a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FrameLayout f46386a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f46387b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6556k f46388c;

    /* renamed from: te.b$a */
    /* compiled from: FlutterBannerView */
    class C12642a implements BannerListener {
        C12642a() {
        }

        public void onClick(View view) {
            if (C12643c.m60158e(C12641b.this.f46387b)) {
                C12641b.this.m60153e(view);
                return;
            }
            C12641b.this.f46386a.setVisibility(8);
            C12641b.this.f46386a.removeAllViews();
        }

        public void onFailedToReceiveAd(View view) {
            C12641b.this.f46386a.setVisibility(8);
            Log.e("start.io", "banner onFailedToReceiveAd");
            C12641b.this.f46388c.mo22159c("onFailedToReceiveAd", (Object) null);
        }

        public void onImpression(View view) {
        }

        public void onReceiveAd(View view) {
            C12641b.this.m60153e(view);
        }
    }

    C12641b(Context context, C6539c cVar, int i) {
        this.f46387b = context;
        this.f46386a = new FrameLayout(context);
        C6556k kVar = new C6556k(cVar, "vn.momo.plugin.startapp.StartAppBannerPlugin_" + i);
        this.f46388c = kVar;
        kVar.mo22161e(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m60153e(View view) {
        this.f46386a.removeAllViews();
        this.f46386a.addView(view);
    }

    public void dispose() {
        this.f46386a.removeAllViews();
    }

    public View getView() {
        return this.f46386a;
    }

    public void onAttachedToActivity(C12590c cVar) {
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
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

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        if (!"loadAd".equals(jVar.f30999a)) {
            dVar.notImplemented();
        } else if (C12643c.m60159f(this.f46387b)) {
            Log.e("start.io", "banner blocked for 24hrs");
            this.f46386a.setVisibility(8);
            this.f46386a.removeAllViews();
        } else {
            try {
                new Banner((Context) C12646f.m60165f(), (BannerListener) new C12642a()).loadAd();
            } catch (Exception e) {
                Log.e("start.io", "banner onFailedToReceiveAd with e : " + e.getMessage());
                this.f46388c.mo22159c("onFailedToReceiveAd", (Object) null);
            }
        }
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
    }
}
