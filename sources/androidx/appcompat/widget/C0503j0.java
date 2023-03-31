package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0909g0;
import androidx.core.widget.C0980g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p048g.C4288a;
import p062i.C4640c;

/* renamed from: androidx.appcompat.widget.j0 */
/* compiled from: DropDownListView */
class C0503j0 extends ListView {

    /* renamed from: a */
    private final Rect f1660a = new Rect();

    /* renamed from: b */
    private int f1661b = 0;

    /* renamed from: c */
    private int f1662c = 0;

    /* renamed from: d */
    private int f1663d = 0;

    /* renamed from: e */
    private int f1664e = 0;

    /* renamed from: f */
    private int f1665f;

    /* renamed from: g */
    private Field f1666g;

    /* renamed from: h */
    private C0506c f1667h;

    /* renamed from: i */
    private boolean f1668i;

    /* renamed from: r */
    private boolean f1669r;

    /* renamed from: s */
    private boolean f1670s;

    /* renamed from: t */
    private C0909g0 f1671t;

    /* renamed from: u */
    private C0980g f1672u;

    /* renamed from: v */
    C0507d f1673v;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* compiled from: DropDownListView */
    static class C0504a {
        /* renamed from: a */
        static void m2489a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    /* compiled from: DropDownListView */
    static class C0505b {

        /* renamed from: a */
        private static Method f1674a;

        /* renamed from: b */
        private static Method f1675b;

        /* renamed from: c */
        private static Method f1676c;

        /* renamed from: d */
        private static boolean f1677d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1674a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1675b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1676c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        static boolean m2490a() {
            return f1677d;
        }

        /* renamed from: b */
        static void m2491b(C0503j0 j0Var, int i, View view) {
            try {
                f1674a.invoke(j0Var, new Object[]{Integer.valueOf(i), view, Boolean.FALSE, -1, -1});
                f1675b.invoke(j0Var, new Object[]{Integer.valueOf(i)});
                f1676c.invoke(j0Var, new Object[]{Integer.valueOf(i)});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$c */
    /* compiled from: DropDownListView */
    private static class C0506c extends C4640c {

        /* renamed from: b */
        private boolean f1678b = true;

        C0506c(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2390c(boolean z) {
            this.f1678b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1678b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1678b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1678b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1678b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1678b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$d */
    /* compiled from: DropDownListView */
    private class C0507d implements Runnable {
        C0507d() {
        }

        /* renamed from: a */
        public void mo2396a() {
            C0503j0 j0Var = C0503j0.this;
            j0Var.f1673v = null;
            j0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2397b() {
            C0503j0.this.post(this);
        }

        public void run() {
            C0503j0 j0Var = C0503j0.this;
            j0Var.f1673v = null;
            j0Var.drawableStateChanged();
        }
    }

    C0503j0(Context context, boolean z) {
        super(context, (AttributeSet) null, C4288a.f23748A);
        this.f1669r = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1666g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2478a() {
        this.f1670s = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1665f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0909g0 g0Var = this.f1671t;
        if (g0Var != null) {
            g0Var.mo3386c();
            this.f1671t = null;
        }
    }

    /* renamed from: b */
    private void m2479b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    private void m2480c(Canvas canvas) {
        Drawable selector;
        if (!this.f1660a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1660a);
            selector.draw(canvas);
        }
    }

    /* renamed from: f */
    private void m2481f(int i, View view) {
        Rect rect = this.f1660a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1661b;
        rect.top -= this.f1662c;
        rect.right += this.f1663d;
        rect.bottom += this.f1664e;
        try {
            boolean z = this.f1666g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1666g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m2482g(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2481f(i, view);
        if (z2) {
            Rect rect = this.f1660a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0732a.m3373k(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    private void m2483h(int i, View view, float f, float f2) {
        m2482g(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0732a.m3373k(selector, f, f2);
        }
    }

    /* renamed from: i */
    private void m2484i(View view, int i, float f, float f2) {
        View childAt;
        this.f1670s = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C0504a.m2489a(this, f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f1665f;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f1665f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (i2 >= 21) {
            C0504a.m2489a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2483h(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m2485j() {
        return this.f1670s;
    }

    /* renamed from: k */
    private void m2486k() {
        Drawable selector = getSelector();
        if (selector != null && m2485j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0506c cVar = this.f1667h;
        if (cVar != null) {
            cVar.mo2390c(z);
        }
    }

    /* renamed from: d */
    public int mo2377d(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            if (i11 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2480c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1673v == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2486k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2380e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2484i(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2479b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.m2478a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.g r9 = r7.f1672u
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.f1672u = r9
        L_0x005a:
            androidx.core.widget.g r9 = r7.f1672u
            r9.mo3577m(r2)
            androidx.core.widget.g r9 = r7.f1672u
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.g r8 = r7.f1672u
            if (r8 == 0) goto L_0x006c
            r8.mo3577m(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0503j0.mo2380e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f1669r || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1669r || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1669r || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1669r && this.f1668i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1673v = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1673v == null) {
            C0507d dVar = new C0507d();
            this.f1673v = dVar;
            dVar.mo2397b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0505b.m2490a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0505b.m2491b(this, pointToPosition, childAt);
                    }
                }
                m2486k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1665f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0507d dVar = this.f1673v;
        if (dVar != null) {
            dVar.mo2396a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f1668i = z;
    }

    public void setSelector(Drawable drawable) {
        C0506c cVar = drawable != null ? new C0506c(drawable) : null;
        this.f1667h = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1661b = rect.left;
        this.f1662c = rect.top;
        this.f1663d = rect.right;
        this.f1664e = rect.bottom;
    }
}
