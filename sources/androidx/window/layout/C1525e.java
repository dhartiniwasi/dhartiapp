package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetricsCalculator;

/* renamed from: androidx.window.layout.e */
/* compiled from: WindowMetricsCalculator.kt */
public final /* synthetic */ class C1525e {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    /* renamed from: a */
    public static WindowMetricsCalculator m7075a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    /* renamed from: b */
    public static void m7076b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    /* renamed from: c */
    public static void m7077c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
