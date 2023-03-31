package androidx.window.layout;

import kotlin.jvm.internal.C11669k;

/* compiled from: WindowInfoTracker.kt */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        C11669k.m56787e(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
