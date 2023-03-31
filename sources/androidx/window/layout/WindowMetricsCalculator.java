package androidx.window.layout;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* compiled from: WindowMetricsCalculator.kt */
public interface WindowMetricsCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowMetricsCalculator.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static C12439l<? super WindowMetricsCalculator, ? extends WindowMetricsCalculator> decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final WindowMetricsCalculator getOrCreate() {
            return (WindowMetricsCalculator) decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
        }

        @ExperimentalWindowApi
        public final void overrideDecorator(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
            C11669k.m56787e(windowMetricsCalculatorDecorator, "overridingDecorator");
            decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(windowMetricsCalculatorDecorator);
        }

        @ExperimentalWindowApi
        public final void reset() {
            decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
        }
    }

    WindowMetrics computeCurrentWindowMetrics(Activity activity);

    WindowMetrics computeMaximumWindowMetrics(Activity activity);
}
