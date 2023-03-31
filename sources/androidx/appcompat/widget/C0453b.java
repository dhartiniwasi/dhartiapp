package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* compiled from: ActionBarBackgroundDrawable */
class C0453b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1502a;

    /* renamed from: androidx.appcompat.widget.b$a */
    /* compiled from: ActionBarBackgroundDrawable */
    private static class C0454a {
        /* renamed from: a */
        public static void m2231a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0453b(ActionBarContainer actionBarContainer) {
        this.f1502a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1502a;
        if (actionBarContainer.f1241h) {
            Drawable drawable = actionBarContainer.f1240g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1238e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1502a;
        Drawable drawable3 = actionBarContainer2.f1239f;
        if (drawable3 != null && actionBarContainer2.f1242i) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1502a;
        if (!actionBarContainer.f1241h) {
            Drawable drawable = actionBarContainer.f1238e;
            if (drawable != null) {
                C0454a.m2231a(drawable, outline);
            }
        } else if (actionBarContainer.f1240g != null) {
            C0454a.m2231a(actionBarContainer.f1238e, outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
