package p226ee;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: ee.f */
/* compiled from: DisplayUtils */
public class C10119f {
    /* renamed from: a */
    public static int m51455a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay.getWidth() == defaultDisplay.getHeight()) {
            return 3;
        }
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }
}
