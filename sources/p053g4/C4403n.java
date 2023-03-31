package p053g4;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: g4.n */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4403n implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C4408s f24527a;

    C4403n(C4408s sVar) {
        this.f24527a = sVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C4408s sVar = this.f24527a;
        if (sVar.f24543h == null) {
            return false;
        }
        sVar.f24543h.mo14738d(motionEvent);
        return false;
    }
}
