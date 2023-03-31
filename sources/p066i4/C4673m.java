package p066i4;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import p073j4.C4810t;

/* renamed from: i4.m */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4673m extends RelativeLayout {

    /* renamed from: a */
    final C4810t f25211a;

    /* renamed from: b */
    boolean f25212b;

    public C4673m(Context context, String str, String str2, String str3) {
        super(context);
        C4810t tVar = new C4810t(context, str);
        this.f25211a = tVar;
        tVar.mo18545o(str2);
        tVar.mo18544n(str3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25212b) {
            return false;
        }
        this.f25211a.mo18543m(motionEvent);
        return false;
    }
}
