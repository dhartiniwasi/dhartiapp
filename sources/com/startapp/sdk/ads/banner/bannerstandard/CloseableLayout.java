package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.C8993h1;
import com.startapp.C9265rb;

/* compiled from: Sta */
public class CloseableLayout extends FrameLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f38291o = 0;

    /* renamed from: a */
    public final int f38292a;

    /* renamed from: b */
    public C9311a f38293b;

    /* renamed from: c */
    public final Drawable f38294c;

    /* renamed from: d */
    public ClosePosition f38295d;

    /* renamed from: e */
    public final int f38296e;

    /* renamed from: f */
    public final int f38297f;

    /* renamed from: g */
    public final int f38298g;

    /* renamed from: h */
    public boolean f38299h;

    /* renamed from: i */
    public final Rect f38300i;

    /* renamed from: j */
    public final Rect f38301j;

    /* renamed from: k */
    public final Rect f38302k;

    /* renamed from: l */
    public final Rect f38303l;

    /* renamed from: m */
    public boolean f38304m;

    /* renamed from: n */
    public C9312b f38305n;

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout$a */
    /* compiled from: Sta */
    public interface C9311a {
        void onClose();
    }

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout$b */
    /* compiled from: Sta */
    public final class C9312b implements Runnable {
        public C9312b() {
        }

        public void run() {
            CloseableLayout closeableLayout = CloseableLayout.this;
            int i = CloseableLayout.f38291o;
            closeableLayout.mo30072a(false);
        }
    }

    public CloseableLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public final void mo30072a(boolean z) {
        int[] state = this.f38294c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z != (state == iArr)) {
            Drawable drawable = this.f38294c;
            if (!z) {
                iArr = FrameLayout.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
            invalidate(this.f38301j);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f38299h) {
            this.f38299h = false;
            this.f38300i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f38295d;
            Rect rect = this.f38300i;
            Rect rect2 = this.f38301j;
            int i = this.f38296e;
            Gravity.apply(closePosition.mo30084a(), i, i, rect, rect2);
            this.f38303l.set(this.f38301j);
            Rect rect3 = this.f38303l;
            int i2 = this.f38298g;
            rect3.inset(i2, i2);
            ClosePosition closePosition2 = this.f38295d;
            Rect rect4 = this.f38303l;
            Rect rect5 = this.f38302k;
            int i3 = this.f38297f;
            Gravity.apply(closePosition2.mo30084a(), i3, i3, rect4, rect5);
            this.f38294c.setBounds(this.f38302k);
        }
        if (this.f38294c.isVisible()) {
            this.f38294c.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return mo30073a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f38299h = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo30073a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f38292a)) {
            if (this.f38304m || this.f38294c.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    mo30072a(true);
                } else if (action == 1) {
                    if (this.f38294c.getState() == FrameLayout.SELECTED_STATE_SET) {
                        if (this.f38305n == null) {
                            this.f38305n = new C9312b();
                        }
                        postDelayed(this.f38305n, (long) ViewConfiguration.getPressedStateDuration());
                        playSoundEffect(0);
                        C9311a aVar = this.f38293b;
                        if (aVar != null) {
                            aVar.onClose();
                        }
                    }
                } else if (action == 3) {
                    mo30072a(false);
                }
                return true;
            }
        }
        mo30072a(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.f38304m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.f38299h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.f38301j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f38295d = closePosition;
        this.f38299h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.f38294c.setVisible(z, false)) {
            invalidate(this.f38301j);
        }
    }

    public void setOnCloseListener(C9311a aVar) {
        this.f38293b = aVar;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38300i = new Rect();
        this.f38301j = new Rect();
        this.f38302k = new Rect();
        this.f38303l = new Rect();
        Drawable a = C8993h1.m48654a(context.getResources(), "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC");
        this.f38294c = a;
        this.f38295d = ClosePosition.TOP_RIGHT;
        a.setState(FrameLayout.EMPTY_STATE_SET);
        a.setCallback(this);
        this.f38292a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f38296e = C9265rb.m49233a(context, 50);
        this.f38297f = C9265rb.m49233a(context, 30);
        this.f38298g = C9265rb.m49233a(context, 8);
        setWillNotDraw(false);
        this.f38304m = true;
    }

    /* renamed from: a */
    public boolean mo30073a(int i, int i2, int i3) {
        Rect rect = this.f38301j;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    /* compiled from: Sta */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        /* access modifiers changed from: public */
        ClosePosition(int i) {
            this.mGravity = i;
        }

        /* renamed from: a */
        public static ClosePosition m49371a(String str, ClosePosition closePosition) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return closePosition;
            }
            if (str.equals("top-left")) {
                return TOP_LEFT;
            }
            if (str.equals("top-right")) {
                return TOP_RIGHT;
            }
            if (str.equals("center")) {
                return CENTER;
            }
            if (str.equals("bottom-left")) {
                return BOTTOM_LEFT;
            }
            if (str.equals("bottom-right")) {
                return BOTTOM_RIGHT;
            }
            if (str.equals("top-center")) {
                return TOP_CENTER;
            }
            if (str.equals("bottom-center")) {
                return BOTTOM_CENTER;
            }
            throw new IllegalArgumentException(str);
        }

        /* renamed from: a */
        public int mo30084a() {
            return this.mGravity;
        }
    }
}
