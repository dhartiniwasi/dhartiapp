package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11677s;
import p197be.C6746b;

/* compiled from: WindowInfoTracker.kt */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WindowInfoTracker.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final boolean DEBUG = false;
        private static final String TAG = C11677s.m56801b(WindowInfoTracker.class).mo35838a();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            C11669k.m56787e(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final void overrideDecorator(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
            C11669k.m56787e(windowInfoTrackerDecorator, "overridingDecorator");
            decorator = windowInfoTrackerDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        public final WindowBackend windowBackend$window_release(Context context) {
            C11669k.m56787e(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.Companion.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }

    C6746b<WindowLayoutInfo> windowLayoutInfo(Activity activity);
}
