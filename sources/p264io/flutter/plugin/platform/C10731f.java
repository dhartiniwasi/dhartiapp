package p264io.flutter.plugin.platform;

import android.view.View;

/* renamed from: io.flutter.plugin.platform.f */
/* compiled from: PlatformView */
public interface C10731f {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
