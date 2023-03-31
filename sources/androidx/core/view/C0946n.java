package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.n */
/* compiled from: MotionEventCompat */
public final class C0946n {
    /* renamed from: a */
    public static boolean m4289a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
