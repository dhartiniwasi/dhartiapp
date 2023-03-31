package p264io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import p264io.flutter.embedding.android.C10635g;

/* renamed from: io.flutter.plugin.platform.b */
/* compiled from: PlatformOverlayView */
public class C10723b extends C10635g {

    /* renamed from: g */
    private C10722a f42019g;

    public C10723b(Context context, int i, int i2, C10722a aVar) {
        super(context, i, i2, C10635g.C10637b.overlay);
        this.f42019g = aVar;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        C10722a aVar = this.f42019g;
        if (aVar == null || !aVar.mo34236a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
