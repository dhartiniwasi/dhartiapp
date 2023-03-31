package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0388p;
import androidx.core.view.C0835a0;
import androidx.core.widget.C0983i;
import com.facebook.ads.AdError;
import java.lang.reflect.Method;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.n0 */
/* compiled from: ListPopupWindow */
public class C0522n0 implements C0388p {

    /* renamed from: O */
    private static Method f1725O;

    /* renamed from: P */
    private static Method f1726P;

    /* renamed from: Q */
    private static Method f1727Q;

    /* renamed from: A */
    private View f1728A;

    /* renamed from: B */
    private Drawable f1729B;

    /* renamed from: C */
    private AdapterView.OnItemClickListener f1730C;

    /* renamed from: D */
    private AdapterView.OnItemSelectedListener f1731D;

    /* renamed from: E */
    final C0531i f1732E;

    /* renamed from: F */
    private final C0530h f1733F;

    /* renamed from: G */
    private final C0529g f1734G;

    /* renamed from: H */
    private final C0527e f1735H;

    /* renamed from: I */
    private Runnable f1736I;

    /* renamed from: J */
    final Handler f1737J;

    /* renamed from: K */
    private final Rect f1738K;

    /* renamed from: L */
    private Rect f1739L;

    /* renamed from: M */
    private boolean f1740M;

    /* renamed from: N */
    PopupWindow f1741N;

    /* renamed from: a */
    private Context f1742a;

    /* renamed from: b */
    private ListAdapter f1743b;

    /* renamed from: c */
    C0503j0 f1744c;

    /* renamed from: d */
    private int f1745d;

    /* renamed from: e */
    private int f1746e;

    /* renamed from: f */
    private int f1747f;

    /* renamed from: g */
    private int f1748g;

    /* renamed from: h */
    private int f1749h;

    /* renamed from: i */
    private boolean f1750i;

    /* renamed from: r */
    private boolean f1751r;

    /* renamed from: s */
    private boolean f1752s;

    /* renamed from: t */
    private int f1753t;

    /* renamed from: u */
    private boolean f1754u;

    /* renamed from: v */
    private boolean f1755v;

    /* renamed from: w */
    int f1756w;

    /* renamed from: x */
    private View f1757x;

    /* renamed from: y */
    private int f1758y;

    /* renamed from: z */
    private DataSetObserver f1759z;

    /* renamed from: androidx.appcompat.widget.n0$a */
    /* compiled from: ListPopupWindow */
    class C0523a implements Runnable {
        C0523a() {
        }

        public void run() {
            View s = C0522n0.this.mo2503s();
            if (s != null && s.getWindowToken() != null) {
                C0522n0.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$b */
    /* compiled from: ListPopupWindow */
    class C0524b implements AdapterView.OnItemSelectedListener {
        C0524b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0503j0 j0Var;
            if (i != -1 && (j0Var = C0522n0.this.f1744c) != null) {
                j0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$c */
    /* compiled from: ListPopupWindow */
    static class C0525c {
        /* renamed from: a */
        static int m2596a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$d */
    /* compiled from: ListPopupWindow */
    static class C0526d {
        /* renamed from: a */
        static void m2597a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m2598b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$e */
    /* compiled from: ListPopupWindow */
    private class C0527e implements Runnable {
        C0527e() {
        }

        public void run() {
            C0522n0.this.mo2501q();
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$f */
    /* compiled from: ListPopupWindow */
    private class C0528f extends DataSetObserver {
        C0528f() {
        }

        public void onChanged() {
            if (C0522n0.this.mo1292b()) {
                C0522n0.this.show();
            }
        }

        public void onInvalidated() {
            C0522n0.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$g */
    /* compiled from: ListPopupWindow */
    private class C0529g implements AbsListView.OnScrollListener {
        C0529g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0522n0.this.mo2505v() && C0522n0.this.f1741N.getContentView() != null) {
                C0522n0 n0Var = C0522n0.this;
                n0Var.f1737J.removeCallbacks(n0Var.f1732E);
                C0522n0.this.f1732E.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$h */
    /* compiled from: ListPopupWindow */
    private class C0530h implements View.OnTouchListener {
        C0530h() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0522n0.this.f1741N) != null && popupWindow.isShowing() && x >= 0 && x < C0522n0.this.f1741N.getWidth() && y >= 0 && y < C0522n0.this.f1741N.getHeight()) {
                C0522n0 n0Var = C0522n0.this;
                n0Var.f1737J.postDelayed(n0Var.f1732E, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0522n0 n0Var2 = C0522n0.this;
                n0Var2.f1737J.removeCallbacks(n0Var2.f1732E);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$i */
    /* compiled from: ListPopupWindow */
    private class C0531i implements Runnable {
        C0531i() {
        }

        public void run() {
            C0503j0 j0Var = C0522n0.this.f1744c;
            if (j0Var != null && C0835a0.m3704Q(j0Var) && C0522n0.this.f1744c.getCount() > C0522n0.this.f1744c.getChildCount()) {
                int childCount = C0522n0.this.f1744c.getChildCount();
                C0522n0 n0Var = C0522n0.this;
                if (childCount <= n0Var.f1756w) {
                    n0Var.f1741N.setInputMethodMode(2);
                    C0522n0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1725O = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1727Q = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1726P = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0522n0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: I */
    private void m2564I(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1725O;
            if (method != null) {
                try {
                    method.invoke(this.f1741N, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            C0526d.m2598b(this.f1741N, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2565p() {
        /*
            r12 = this;
            androidx.appcompat.widget.j0 r0 = r12.f1744c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00bf
            android.content.Context r0 = r12.f1742a
            androidx.appcompat.widget.n0$a r5 = new androidx.appcompat.widget.n0$a
            r5.<init>()
            r12.f1736I = r5
            boolean r5 = r12.f1740M
            r5 = r5 ^ r3
            androidx.appcompat.widget.j0 r5 = r12.mo2502r(r0, r5)
            r12.f1744c = r5
            android.graphics.drawable.Drawable r6 = r12.f1729B
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            android.widget.ListAdapter r6 = r12.f1743b
            r5.setAdapter(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1730C
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            r5.setFocusable(r3)
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            androidx.appcompat.widget.n0$b r6 = new androidx.appcompat.widget.n0$b
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            androidx.appcompat.widget.n0$g r6 = r12.f1734G
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1731D
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.j0 r6 = r12.f1744c
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.j0 r5 = r12.f1744c
            android.view.View r6 = r12.f1757x
            if (r6 == 0) goto L_0x00b8
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1758y
            if (r8 == 0) goto L_0x008f
            if (r8 == r3) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1758y
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L_0x0095
        L_0x0088:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0095
        L_0x008f:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0095:
            int r0 = r12.f1746e
            if (r0 < 0) goto L_0x009c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x009e
        L_0x009c:
            r0 = 0
            r5 = 0
        L_0x009e:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            android.widget.PopupWindow r6 = r12.f1741N
            r6.setContentView(r5)
            goto L_0x00dd
        L_0x00bf:
            android.widget.PopupWindow r0 = r12.f1741N
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1757x
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            android.widget.PopupWindow r5 = r12.f1741N
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00f9
            android.graphics.Rect r6 = r12.f1738K
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1738K
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.f1750i
            if (r7 != 0) goto L_0x00ff
            int r6 = -r6
            r12.f1748g = r6
            goto L_0x00ff
        L_0x00f9:
            android.graphics.Rect r5 = r12.f1738K
            r5.setEmpty()
            r5 = 0
        L_0x00ff:
            android.widget.PopupWindow r6 = r12.f1741N
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r3 = 0
        L_0x010a:
            android.view.View r4 = r12.mo2503s()
            int r6 = r12.f1748g
            int r3 = r12.m2566t(r4, r6, r3)
            boolean r4 = r12.f1754u
            if (r4 != 0) goto L_0x017b
            int r4 = r12.f1745d
            if (r4 != r2) goto L_0x011d
            goto L_0x017b
        L_0x011d:
            int r4 = r12.f1746e
            r6 = -2
            if (r4 == r6) goto L_0x0144
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x012b
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x015c
        L_0x012b:
            android.content.Context r2 = r12.f1742a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1738K
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L_0x015c
        L_0x0144:
            android.content.Context r2 = r12.f1742a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1738K
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x015c:
            r7 = r1
            androidx.appcompat.widget.j0 r6 = r12.f1744c
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.mo2377d(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0179
            androidx.appcompat.widget.j0 r2 = r12.f1744c
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.j0 r3 = r12.f1744c
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0179:
            int r1 = r1 + r0
            return r1
        L_0x017b:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0522n0.m2565p():int");
    }

    /* renamed from: t */
    private int m2566t(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return C0525c.m2596a(this.f1741N, view, i, z);
        }
        Method method = f1726P;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1741N, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1741N.getMaxAvailableHeight(view, i);
    }

    /* renamed from: x */
    private void m2567x() {
        View view = this.f1757x;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1757x);
            }
        }
    }

    /* renamed from: A */
    public void mo2484A(int i) {
        Drawable background = this.f1741N.getBackground();
        if (background != null) {
            background.getPadding(this.f1738K);
            Rect rect = this.f1738K;
            this.f1746e = rect.left + rect.right + i;
            return;
        }
        mo2494L(i);
    }

    /* renamed from: B */
    public void mo2485B(int i) {
        this.f1753t = i;
    }

    /* renamed from: C */
    public void mo2486C(Rect rect) {
        this.f1739L = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: D */
    public void mo2487D(int i) {
        this.f1741N.setInputMethodMode(i);
    }

    /* renamed from: E */
    public void mo2488E(boolean z) {
        this.f1740M = z;
        this.f1741N.setFocusable(z);
    }

    /* renamed from: F */
    public void mo2489F(PopupWindow.OnDismissListener onDismissListener) {
        this.f1741N.setOnDismissListener(onDismissListener);
    }

    /* renamed from: G */
    public void mo2490G(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1730C = onItemClickListener;
    }

    /* renamed from: H */
    public void mo2491H(boolean z) {
        this.f1752s = true;
        this.f1751r = z;
    }

    /* renamed from: J */
    public void mo2492J(int i) {
        this.f1758y = i;
    }

    /* renamed from: K */
    public void mo2493K(int i) {
        C0503j0 j0Var = this.f1744c;
        if (mo1292b() && j0Var != null) {
            j0Var.setListSelectionHidden(false);
            j0Var.setSelection(i);
            if (j0Var.getChoiceMode() != 0) {
                j0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: L */
    public void mo2494L(int i) {
        this.f1746e = i;
    }

    /* renamed from: a */
    public void mo2495a(Drawable drawable) {
        this.f1741N.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public boolean mo1292b() {
        return this.f1741N.isShowing();
    }

    /* renamed from: c */
    public int mo2496c() {
        return this.f1747f;
    }

    public void dismiss() {
        this.f1741N.dismiss();
        m2567x();
        this.f1741N.setContentView((View) null);
        this.f1744c = null;
        this.f1737J.removeCallbacks(this.f1732E);
    }

    /* renamed from: e */
    public void mo2497e(int i) {
        this.f1747f = i;
    }

    /* renamed from: h */
    public Drawable mo2498h() {
        return this.f1741N.getBackground();
    }

    /* renamed from: i */
    public ListView mo1295i() {
        return this.f1744c;
    }

    /* renamed from: k */
    public void mo2499k(int i) {
        this.f1748g = i;
        this.f1750i = true;
    }

    /* renamed from: n */
    public int mo2500n() {
        if (!this.f1750i) {
            return 0;
        }
        return this.f1748g;
    }

    /* renamed from: o */
    public void mo2016o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1759z;
        if (dataSetObserver == null) {
            this.f1759z = new C0528f();
        } else {
            ListAdapter listAdapter2 = this.f1743b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1743b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1759z);
        }
        C0503j0 j0Var = this.f1744c;
        if (j0Var != null) {
            j0Var.setAdapter(this.f1743b);
        }
    }

    /* renamed from: q */
    public void mo2501q() {
        C0503j0 j0Var = this.f1744c;
        if (j0Var != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0503j0 mo2502r(Context context, boolean z) {
        return new C0503j0(context, z);
    }

    /* renamed from: s */
    public View mo2503s() {
        return this.f1728A;
    }

    public void show() {
        int p = m2565p();
        boolean v = mo2505v();
        C0983i.m4445b(this.f1741N, this.f1749h);
        boolean z = true;
        if (!this.f1741N.isShowing()) {
            int i = this.f1746e;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo2503s().getWidth();
            }
            int i2 = this.f1745d;
            if (i2 == -1) {
                p = -1;
            } else if (i2 != -2) {
                p = i2;
            }
            this.f1741N.setWidth(i);
            this.f1741N.setHeight(p);
            m2564I(true);
            this.f1741N.setOutsideTouchable(!this.f1755v && !this.f1754u);
            this.f1741N.setTouchInterceptor(this.f1733F);
            if (this.f1752s) {
                C0983i.m4444a(this.f1741N, this.f1751r);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1727Q;
                if (method != null) {
                    try {
                        method.invoke(this.f1741N, new Object[]{this.f1739L});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0526d.m2597a(this.f1741N, this.f1739L);
            }
            C0983i.m4446c(this.f1741N, mo2503s(), this.f1747f, this.f1748g, this.f1753t);
            this.f1744c.setSelection(-1);
            if (!this.f1740M || this.f1744c.isInTouchMode()) {
                mo2501q();
            }
            if (!this.f1740M) {
                this.f1737J.post(this.f1735H);
            }
        } else if (C0835a0.m3704Q(mo2503s())) {
            int i3 = this.f1746e;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo2503s().getWidth();
            }
            int i4 = this.f1745d;
            if (i4 == -1) {
                if (!v) {
                    p = -1;
                }
                if (v) {
                    this.f1741N.setWidth(this.f1746e == -1 ? -1 : 0);
                    this.f1741N.setHeight(0);
                } else {
                    this.f1741N.setWidth(this.f1746e == -1 ? -1 : 0);
                    this.f1741N.setHeight(-1);
                }
            } else if (i4 != -2) {
                p = i4;
            }
            PopupWindow popupWindow = this.f1741N;
            if (this.f1755v || this.f1754u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1741N.update(mo2503s(), this.f1747f, this.f1748g, i3 < 0 ? -1 : i3, p < 0 ? -1 : p);
        }
    }

    /* renamed from: u */
    public int mo2504u() {
        return this.f1746e;
    }

    /* renamed from: v */
    public boolean mo2505v() {
        return this.f1741N.getInputMethodMode() == 2;
    }

    /* renamed from: w */
    public boolean mo2506w() {
        return this.f1740M;
    }

    /* renamed from: y */
    public void mo2507y(View view) {
        this.f1728A = view;
    }

    /* renamed from: z */
    public void mo2508z(int i) {
        this.f1741N.setAnimationStyle(i);
    }

    public C0522n0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1745d = -2;
        this.f1746e = -2;
        this.f1749h = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f1753t = 0;
        this.f1754u = false;
        this.f1755v = false;
        this.f1756w = Integer.MAX_VALUE;
        this.f1758y = 0;
        this.f1732E = new C0531i();
        this.f1733F = new C0530h();
        this.f1734G = new C0529g();
        this.f1735H = new C0527e();
        this.f1738K = new Rect();
        this.f1742a = context;
        this.f1737J = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24102l1, i, i2);
        this.f1747f = obtainStyledAttributes.getDimensionPixelOffset(C4297j.f24107m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C4297j.f24112n1, 0);
        this.f1748g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1750i = true;
        }
        obtainStyledAttributes.recycle();
        C0553t tVar = new C0553t(context, attributeSet, i, i2);
        this.f1741N = tVar;
        tVar.setInputMethodMode(1);
    }
}
