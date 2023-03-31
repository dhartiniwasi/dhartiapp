package p073j4;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C2971vu;
import com.google.android.gms.internal.ads.au0;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.vs0;
import java.io.InputStream;
import java.util.Map;
import p053g4.C4409t;

/* renamed from: j4.c2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4755c2 extends C4748b {
    public C4755c2() {
        super((C4779i2) null);
    }

    /* renamed from: a */
    public final int mo18419a() {
        return 16974374;
    }

    /* renamed from: b */
    public final CookieManager mo18420b(Context context) {
        C4409t.m29326r();
        if (C4751b2.m30607b()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            pm0.m18665e("Failed to obtain CookieManager.", th);
            C4409t.m29325q().mo15126t(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public final WebResourceResponse mo18421c(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    /* renamed from: d */
    public final ct0 mo18422d(vs0 vs0, C2971vu vuVar, boolean z) {
        return new au0(vs0, vuVar, z);
    }
}
