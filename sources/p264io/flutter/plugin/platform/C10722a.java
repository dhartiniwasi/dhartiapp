package p264io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p264io.flutter.view.C11069c;

/* renamed from: io.flutter.plugin.platform.a */
/* compiled from: AccessibilityEventsDelegate */
class C10722a {

    /* renamed from: a */
    private C11069c f42018a;

    C10722a() {
    }

    /* renamed from: a */
    public boolean mo34236a(MotionEvent motionEvent, boolean z) {
        C11069c cVar = this.f42018a;
        if (cVar == null) {
            return false;
        }
        return cVar.mo34842K(motionEvent, z);
    }

    /* renamed from: b */
    public boolean mo34237b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        C11069c cVar = this.f42018a;
        if (cVar == null) {
            return false;
        }
        return cVar.mo34850x(view, view2, accessibilityEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34238c(C11069c cVar) {
        this.f42018a = cVar;
    }
}
