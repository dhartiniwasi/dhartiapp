package p073j4;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.im0;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;

/* renamed from: j4.d2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4759d2 extends C4755c2 {
    /* renamed from: l */
    static final boolean m30651l(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    /* renamed from: e */
    public final boolean mo18423e(Activity activity, Configuration configuration) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14465W3)).booleanValue()) {
            return false;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14483Y3)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C4584t.m30036b();
        int y = im0.m14418y(activity, configuration.screenHeightDp);
        int y2 = im0.m14418y(activity, configuration.screenWidthDp);
        C4409t.m29326r();
        DisplayMetrics O = C4751b2.m30597O((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = O.heightPixels;
        int i2 = O.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14446U3)).intValue();
        if (!m30651l(i, y + dimensionPixelSize, round) || !m30651l(i2, y2, round)) {
            return true;
        }
        return false;
    }
}
