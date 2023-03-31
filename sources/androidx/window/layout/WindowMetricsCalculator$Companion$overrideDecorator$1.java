package androidx.window.layout;

import kotlin.jvm.internal.C11668j;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* compiled from: WindowMetricsCalculator.kt */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends C11668j implements C12439l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        C11669k.m56787e(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
