package androidx.window.layout;

import android.view.DisplayCutout;
import kotlin.jvm.internal.C11669k;

/* compiled from: DisplayCompatHelper.kt */
public final class DisplayCompatHelperApi28 {
    public static final DisplayCompatHelperApi28 INSTANCE = new DisplayCompatHelperApi28();

    private DisplayCompatHelperApi28() {
    }

    public final int safeInsetBottom(DisplayCutout displayCutout) {
        C11669k.m56787e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int safeInsetLeft(DisplayCutout displayCutout) {
        C11669k.m56787e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int safeInsetRight(DisplayCutout displayCutout) {
        C11669k.m56787e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int safeInsetTop(DisplayCutout displayCutout) {
        C11669k.m56787e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
