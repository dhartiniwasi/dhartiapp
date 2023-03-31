package p292m6;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: m6.a */
/* compiled from: InsetDialogOnTouchListener */
public class C11802a implements View.OnTouchListener {

    /* renamed from: a */
    private final Dialog f44465a;

    /* renamed from: b */
    private final int f44466b;

    /* renamed from: c */
    private final int f44467c;

    /* renamed from: d */
    private final int f44468d;

    public C11802a(Dialog dialog, Rect rect) {
        this.f44465a = dialog;
        this.f44466b = rect.left;
        this.f44467c = rect.top;
        this.f44468d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f44466b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f44467c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f44468d;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f44465a.onTouchEvent(obtain);
    }
}
