package p146u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0835a0;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: u0.z */
/* compiled from: ViewOverlayApi14 */
class C5691z implements C5623b0 {

    /* renamed from: a */
    protected C5692a f28441a;

    /* renamed from: u0.z$a */
    /* compiled from: ViewOverlayApi14 */
    static class C5692a extends ViewGroup {

        /* renamed from: f */
        static Method f28442f;

        /* renamed from: a */
        ViewGroup f28443a;

        /* renamed from: b */
        View f28444b;

        /* renamed from: c */
        ArrayList<Drawable> f28445c = null;

        /* renamed from: d */
        C5691z f28446d;

        /* renamed from: e */
        private boolean f28447e;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                f28442f = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C5692a(Context context, ViewGroup viewGroup, View view, C5691z zVar) {
            super(context);
            this.f28443a = viewGroup;
            this.f28444b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f28446d = zVar;
        }

        /* renamed from: c */
        private void m33963c() {
            if (this.f28447e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m33964d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f28445c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f28447e = true;
                    this.f28443a.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m33965e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f28443a.getLocationOnScreen(iArr2);
            this.f28444b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void mo20063a(Drawable drawable) {
            m33963c();
            if (this.f28445c == null) {
                this.f28445c = new ArrayList<>();
            }
            if (!this.f28445c.contains(drawable)) {
                this.f28445c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo20064b(View view) {
            m33963c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f28443a || viewGroup.getParent() == null || !C0835a0.m3704Q(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f28443a.getLocationOnScreen(iArr2);
                    C0835a0.m3711X(view, iArr[0] - iArr2[0]);
                    C0835a0.m3712Y(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f28443a.getLocationOnScreen(iArr);
            this.f28444b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f28444b.getWidth(), this.f28444b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f28445c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f28445c.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void mo20067f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f28445c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m33964d();
            }
        }

        /* renamed from: g */
        public void mo20068g(View view) {
            super.removeView(view);
            m33964d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f28443a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f28443a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m33965e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f28445c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f28445c
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p146u0.C5691z.C5692a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    C5691z(Context context, ViewGroup viewGroup, View view) {
        this.f28441a = new C5692a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    static C5691z m33959e(View view) {
        ViewGroup f = m33960f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof C5692a) {
                return ((C5692a) childAt).f28446d;
            }
        }
        return new C5685u(f.getContext(), f, view);
    }

    /* renamed from: f */
    static ViewGroup m33960f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo19920a(Drawable drawable) {
        this.f28441a.mo20063a(drawable);
    }

    /* renamed from: b */
    public void mo19921b(Drawable drawable) {
        this.f28441a.mo20067f(drawable);
    }
}
