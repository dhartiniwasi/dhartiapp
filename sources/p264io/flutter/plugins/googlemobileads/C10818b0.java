package p264io.flutter.plugins.googlemobileads;

import android.view.View;
import p264io.flutter.plugin.platform.C10730e;
import p264io.flutter.plugin.platform.C10731f;

/* renamed from: io.flutter.plugins.googlemobileads.b0 */
/* compiled from: FlutterPlatformView */
class C10818b0 implements C10731f {

    /* renamed from: a */
    private View f42260a;

    C10818b0(View view) {
        this.f42260a = view;
    }

    public void dispose() {
        this.f42260a = null;
    }

    public View getView() {
        return this.f42260a;
    }

    public /* synthetic */ void onFlutterViewAttached(View view) {
        C10730e.m53693a(this, view);
    }

    public /* synthetic */ void onFlutterViewDetached() {
        C10730e.m53694b(this);
    }

    public /* synthetic */ void onInputConnectionLocked() {
        C10730e.m53695c(this);
    }

    public /* synthetic */ void onInputConnectionUnlocked() {
        C10730e.m53696d(this);
    }
}
