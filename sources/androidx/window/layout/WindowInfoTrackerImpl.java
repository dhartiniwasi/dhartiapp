package androidx.window.layout;

import android.app.Activity;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p197be.C6746b;
import p197be.C6748d;
import p272jd.C11565d;

/* compiled from: WindowInfoTrackerImpl.kt */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion((C11665g) null);
    /* access modifiers changed from: private */
    public final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: WindowInfoTrackerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C11665g gVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator2, WindowBackend windowBackend2) {
        C11669k.m56787e(windowMetricsCalculator2, "windowMetricsCalculator");
        C11669k.m56787e(windowBackend2, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator2;
        this.windowBackend = windowBackend2;
    }

    public C6746b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        C11669k.m56787e(activity, "activity");
        return C6748d.m38657a(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, (C11565d<? super WindowInfoTrackerImpl$windowLayoutInfo$1>) null));
    }
}
