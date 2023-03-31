package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p073j4.C4810t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ps1 extends FrameLayout {

    /* renamed from: a */
    private final C4810t f15985a;

    public ps1(Context context, View view, C4810t tVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f15985a = tVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15985a.mo18543m(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof vs0)) {
                arrayList.add((vs0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((vs0) arrayList.get(i2)).destroy();
        }
    }
}
