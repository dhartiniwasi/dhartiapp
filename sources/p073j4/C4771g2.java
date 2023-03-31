package p073j4;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.C2679nz;
import java.util.Locale;
import p053g4.C4409t;
import p060h4.C4596v;

/* renamed from: j4.g2 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class C4771g2 extends C4763e2 {
    /* renamed from: m */
    static final /* synthetic */ WindowInsets m30661m(Activity activity, View view, WindowInsets windowInsets) {
        if (C4409t.m29325q().mo15117h().mo18496c0() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                C4800p1 h = C4409t.m29325q().mo15117h();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                h.mo18510o(str);
            } else {
                C4409t.m29325q().mo15117h().mo18510o(str);
            }
        }
        m30662n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: n */
    private static final void m30662n(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: h */
    public final int mo18426h(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    /* renamed from: i */
    public final void mo18427i(Activity activity) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14489Z0)).booleanValue() && C4409t.m29325q().mo15117h().mo18496c0() == null && !activity.isInMultiWindowMode()) {
            m30662n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C4767f2(this, activity));
        }
    }
}
