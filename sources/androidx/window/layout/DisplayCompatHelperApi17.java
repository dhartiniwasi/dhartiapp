package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import kotlin.jvm.internal.C11669k;

/* compiled from: DisplayCompatHelper.kt */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        C11669k.m56787e(display, "display");
        C11669k.m56787e(point, "point");
        display.getRealSize(point);
    }
}
