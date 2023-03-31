package p073j4;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.C2971vu;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.yt0;
import java.io.InputStream;
import java.util.Map;
import p053g4.C4409t;

/* renamed from: j4.b */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4748b {
    private C4748b() {
    }

    /* synthetic */ C4748b(C4779i2 i2Var) {
    }

    /* renamed from: k */
    public static C4748b m30573k(int i) {
        return i >= 30 ? new C4775h2() : i >= 28 ? new C4771g2() : i >= 26 ? new C4763e2() : i >= 24 ? new C4759d2() : i >= 21 ? new C4755c2() : new C4748b();
    }

    /* renamed from: a */
    public int mo18419a() {
        return 1;
    }

    /* renamed from: b */
    public CookieManager mo18420b(Context context) {
        C4409t.m29326r();
        if (C4751b2.m30607b()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            pm0.m18665e("Failed to obtain CookieManager.", th);
            C4409t.m29325q().mo15126t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public WebResourceResponse mo18421c(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: d */
    public ct0 mo18422d(vs0 vs0, C2971vu vuVar, boolean z) {
        return new yt0(vs0, vuVar, z);
    }

    /* renamed from: e */
    public boolean mo18423e(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: f */
    public void mo18424f(Context context) {
    }

    /* renamed from: g */
    public int mo18425g(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    /* renamed from: h */
    public int mo18426h(AudioManager audioManager) {
        return 0;
    }

    /* renamed from: i */
    public void mo18427i(Activity activity) {
    }

    /* renamed from: j */
    public int mo18428j(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
