package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0280c;
import androidx.appcompat.view.menu.C0388p;
import androidx.core.view.C0835a0;
import androidx.core.view.C0957y;
import p048g.C4288a;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.a0 */
/* compiled from: AppCompatSpinner */
public class C0437a0 extends Spinner implements C0957y {

    /* renamed from: i */
    private static final int[] f1470i = {16843505};

    /* renamed from: a */
    private final C0481e f1471a;

    /* renamed from: b */
    private final Context f1472b;

    /* renamed from: c */
    private C0515l0 f1473c;

    /* renamed from: d */
    private SpinnerAdapter f1474d;

    /* renamed from: e */
    private final boolean f1475e;

    /* renamed from: f */
    private C0451j f1476f;

    /* renamed from: g */
    int f1477g;

    /* renamed from: h */
    final Rect f1478h;

    /* renamed from: androidx.appcompat.widget.a0$a */
    /* compiled from: AppCompatSpinner */
    class C0438a extends C0515l0 {

        /* renamed from: r */
        final /* synthetic */ C0445h f1479r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0438a(View view, C0445h hVar) {
            super(view);
            this.f1479r = hVar;
        }

        /* renamed from: b */
        public C0388p mo1194b() {
            return this.f1479r;
        }

        /* renamed from: c */
        public boolean mo1195c() {
            if (C0437a0.this.getInternalPopup().mo2005b()) {
                return true;
            }
            C0437a0.this.mo1974b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    /* compiled from: AppCompatSpinner */
    class C0439b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0439b() {
        }

        public void onGlobalLayout() {
            if (!C0437a0.this.getInternalPopup().mo2005b()) {
                C0437a0.this.mo1974b();
            }
            ViewTreeObserver viewTreeObserver = C0437a0.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                C0440c.m2167a(viewTreeObserver, this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$c */
    /* compiled from: AppCompatSpinner */
    private static final class C0440c {
        /* renamed from: a */
        static void m2167a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$d */
    /* compiled from: AppCompatSpinner */
    private static final class C0441d {
        /* renamed from: a */
        static int m2168a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m2169b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m2170c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        static void m2171d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$e */
    /* compiled from: AppCompatSpinner */
    private static final class C0442e {
        /* renamed from: a */
        static void m2172a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$f */
    /* compiled from: AppCompatSpinner */
    class C0443f implements C0451j, DialogInterface.OnClickListener {

        /* renamed from: a */
        C0280c f1482a;

        /* renamed from: b */
        private ListAdapter f1483b;

        /* renamed from: c */
        private CharSequence f1484c;

        C0443f() {
        }

        /* renamed from: a */
        public void mo2004a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: b */
        public boolean mo2005b() {
            C0280c cVar = this.f1482a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public int mo2006c() {
            return 0;
        }

        public void dismiss() {
            C0280c cVar = this.f1482a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1482a = null;
            }
        }

        /* renamed from: e */
        public void mo2008e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: f */
        public CharSequence mo2009f() {
            return this.f1484c;
        }

        /* renamed from: h */
        public Drawable mo2010h() {
            return null;
        }

        /* renamed from: j */
        public void mo2011j(CharSequence charSequence) {
            this.f1484c = charSequence;
        }

        /* renamed from: k */
        public void mo2012k(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: l */
        public void mo2013l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo2014m(int i, int i2) {
            if (this.f1483b != null) {
                C0280c.C0281a aVar = new C0280c.C0281a(C0437a0.this.getPopupContext());
                CharSequence charSequence = this.f1484c;
                if (charSequence != null) {
                    aVar.mo886n(charSequence);
                }
                C0280c a = aVar.mo885m(this.f1483b, C0437a0.this.getSelectedItemPosition(), this).mo873a();
                this.f1482a = a;
                ListView h = a.mo868h();
                if (Build.VERSION.SDK_INT >= 17) {
                    C0441d.m2171d(h, i);
                    C0441d.m2170c(h, i2);
                }
                this.f1482a.show();
            }
        }

        /* renamed from: n */
        public int mo2015n() {
            return 0;
        }

        /* renamed from: o */
        public void mo2016o(ListAdapter listAdapter) {
            this.f1483b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0437a0.this.setSelection(i);
            if (C0437a0.this.getOnItemClickListener() != null) {
                C0437a0.this.performItemClick((View) null, i, this.f1483b.getItemId(i));
            }
            dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$g */
    /* compiled from: AppCompatSpinner */
    private static class C0444g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1486a;

        /* renamed from: b */
        private ListAdapter f1487b;

        public C0444g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1486a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1487b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0442e.m2172a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof C0566w0) {
                C0566w0 w0Var = (C0566w0) spinnerAdapter;
                if (w0Var.getDropDownViewTheme() == null) {
                    w0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1487b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1487b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1486a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$h */
    /* compiled from: AppCompatSpinner */
    class C0445h extends C0522n0 implements C0451j {

        /* renamed from: R */
        private CharSequence f1488R;

        /* renamed from: S */
        ListAdapter f1489S;

        /* renamed from: a0 */
        private final Rect f1490a0 = new Rect();

        /* renamed from: b0 */
        private int f1491b0;

        /* renamed from: androidx.appcompat.widget.a0$h$a */
        /* compiled from: AppCompatSpinner */
        class C0446a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C0437a0 f1493a;

            C0446a(C0437a0 a0Var) {
                this.f1493a = a0Var;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0437a0.this.setSelection(i);
                if (C0437a0.this.getOnItemClickListener() != null) {
                    C0445h hVar = C0445h.this;
                    C0437a0.this.performItemClick(view, i, hVar.f1489S.getItemId(i));
                }
                C0445h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$h$b */
        /* compiled from: AppCompatSpinner */
        class C0447b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0447b() {
            }

            public void onGlobalLayout() {
                C0445h hVar = C0445h.this;
                if (!hVar.mo2033P(C0437a0.this)) {
                    C0445h.this.dismiss();
                    return;
                }
                C0445h.this.mo2031N();
                C0445h.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.a0$h$c */
        /* compiled from: AppCompatSpinner */
        class C0448c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1496a;

            C0448c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1496a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0437a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1496a);
                }
            }
        }

        public C0445h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2507y(C0437a0.this);
            mo2488E(true);
            mo2492J(0);
            mo2490G(new C0446a(C0437a0.this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N */
        public void mo2031N() {
            int i;
            int i2;
            Drawable h = mo2498h();
            int i3 = 0;
            if (h != null) {
                h.getPadding(C0437a0.this.f1478h);
                if (C0508j1.m2496b(C0437a0.this)) {
                    i2 = C0437a0.this.f1478h.right;
                } else {
                    i2 = -C0437a0.this.f1478h.left;
                }
                i3 = i2;
            } else {
                Rect rect = C0437a0.this.f1478h;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = C0437a0.this.getPaddingLeft();
            int paddingRight = C0437a0.this.getPaddingRight();
            int width = C0437a0.this.getWidth();
            C0437a0 a0Var = C0437a0.this;
            int i4 = a0Var.f1477g;
            if (i4 == -2) {
                int a = a0Var.mo1973a((SpinnerAdapter) this.f1489S, mo2498h());
                int i5 = C0437a0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0437a0.this.f1478h;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo2484A(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo2484A((width - paddingLeft) - paddingRight);
            } else {
                mo2484A(i4);
            }
            if (C0508j1.m2496b(C0437a0.this)) {
                i = i3 + (((width - paddingRight) - mo2504u()) - mo2032O());
            } else {
                i = i3 + paddingLeft + mo2032O();
            }
            mo2497e(i);
        }

        /* renamed from: O */
        public int mo2032O() {
            return this.f1491b0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public boolean mo2033P(View view) {
            return C0835a0.m3704Q(view) && view.getGlobalVisibleRect(this.f1490a0);
        }

        /* renamed from: f */
        public CharSequence mo2009f() {
            return this.f1488R;
        }

        /* renamed from: j */
        public void mo2011j(CharSequence charSequence) {
            this.f1488R = charSequence;
        }

        /* renamed from: l */
        public void mo2013l(int i) {
            this.f1491b0 = i;
        }

        /* renamed from: m */
        public void mo2014m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b = mo1292b();
            mo2031N();
            mo2487D(2);
            super.show();
            ListView i3 = mo1295i();
            i3.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                C0441d.m2171d(i3, i);
                C0441d.m2170c(i3, i2);
            }
            mo2493K(C0437a0.this.getSelectedItemPosition());
            if (!b && (viewTreeObserver = C0437a0.this.getViewTreeObserver()) != null) {
                C0447b bVar = new C0447b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2489F(new C0448c(bVar));
            }
        }

        /* renamed from: o */
        public void mo2016o(ListAdapter listAdapter) {
            super.mo2016o(listAdapter);
            this.f1489S = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$i */
    /* compiled from: AppCompatSpinner */
    static class C0449i extends View.BaseSavedState {
        public static final Parcelable.Creator<C0449i> CREATOR = new C0450a();

        /* renamed from: a */
        boolean f1498a;

        /* renamed from: androidx.appcompat.widget.a0$i$a */
        /* compiled from: AppCompatSpinner */
        class C0450a implements Parcelable.Creator<C0449i> {
            C0450a() {
            }

            /* renamed from: a */
            public C0449i createFromParcel(Parcel parcel) {
                return new C0449i(parcel);
            }

            /* renamed from: b */
            public C0449i[] newArray(int i) {
                return new C0449i[i];
            }
        }

        C0449i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1498a ? (byte) 1 : 0);
        }

        C0449i(Parcel parcel) {
            super(parcel);
            this.f1498a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$j */
    /* compiled from: AppCompatSpinner */
    interface C0451j {
        /* renamed from: a */
        void mo2004a(Drawable drawable);

        /* renamed from: b */
        boolean mo2005b();

        /* renamed from: c */
        int mo2006c();

        void dismiss();

        /* renamed from: e */
        void mo2008e(int i);

        /* renamed from: f */
        CharSequence mo2009f();

        /* renamed from: h */
        Drawable mo2010h();

        /* renamed from: j */
        void mo2011j(CharSequence charSequence);

        /* renamed from: k */
        void mo2012k(int i);

        /* renamed from: l */
        void mo2013l(int i);

        /* renamed from: m */
        void mo2014m(int i, int i2);

        /* renamed from: n */
        int mo2015n();

        /* renamed from: o */
        void mo2016o(ListAdapter listAdapter);
    }

    public C0437a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23757J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1973a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1478h);
        Rect rect = this.f1478h;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1974b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1476f.mo2014m(C0441d.m2169b(this), C0441d.m2168a(this));
        } else {
            this.f1476f.mo2014m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            eVar.mo2211b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            return jVar.mo2006c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            return jVar.mo2015n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1476f != null) {
            return this.f1477g;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final C0451j getInternalPopup() {
        return this.f1476f;
    }

    public Drawable getPopupBackground() {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            return jVar.mo2010h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1472b;
    }

    public CharSequence getPrompt() {
        C0451j jVar = this.f1476f;
        return jVar != null ? jVar.mo2009f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0451j jVar = this.f1476f;
        if (jVar != null && jVar.mo2005b()) {
            this.f1476f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1476f != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1973a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0449i iVar = (C0449i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f1498a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0439b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0449i iVar = new C0449i(super.onSaveInstanceState());
        C0451j jVar = this.f1476f;
        iVar.f1498a = jVar != null && jVar.mo2005b();
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0515l0 l0Var = this.f1473c;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0451j jVar = this.f1476f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo2005b()) {
            return true;
        }
        mo1974b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            jVar.mo2013l(i);
            this.f1476f.mo2008e(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            jVar.mo2012k(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1476f != null) {
            this.f1477g = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            jVar.mo2004a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C4411a.m29346b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0451j jVar = this.f1476f;
        if (jVar != null) {
            jVar.mo2011j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1471a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public C0437a0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1475e) {
            this.f1474d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1476f != null) {
            Context context = this.f1472b;
            if (context == null) {
                context = getContext();
            }
            this.f1476f.mo2016o(new C0444g(spinnerAdapter, context.getTheme()));
        }
    }

    public C0437a0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0437a0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1478h = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0564v0.m2713a(r6, r0)
            int[] r0 = p048g.C4297j.f24163x2
            r1 = 0
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0452a1.m2210v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1471a = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1472b = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p048g.C4297j.f23948C2
            int r11 = r0.mo2055n(r11, r1)
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f1472b = r2
            goto L_0x003b
        L_0x0039:
            r6.f1472b = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1470i     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.a0$h r10 = new androidx.appcompat.widget.a0$h
            android.content.Context r3 = r6.f1472b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1472b
            int[] r4 = p048g.C4297j.f24163x2
            androidx.appcompat.widget.a1 r1 = androidx.appcompat.widget.C0452a1.m2210v(r3, r8, r4, r9, r1)
            int r3 = p048g.C4297j.f23943B2
            r4 = -2
            int r3 = r1.mo2054m(r3, r4)
            r6.f1477g = r3
            int r3 = p048g.C4297j.f24173z2
            android.graphics.drawable.Drawable r3 = r1.mo2048g(r3)
            r10.mo2495a(r3)
            int r3 = p048g.C4297j.f23938A2
            java.lang.String r3 = r0.mo2056o(r3)
            r10.mo2011j(r3)
            r1.mo2061w()
            r6.f1476f = r10
            androidx.appcompat.widget.a0$a r1 = new androidx.appcompat.widget.a0$a
            r1.<init>(r6, r10)
            r6.f1473c = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.a0$f r10 = new androidx.appcompat.widget.a0$f
            r10.<init>()
            r6.f1476f = r10
            int r1 = p048g.C4297j.f23938A2
            java.lang.String r1 = r0.mo2056o(r1)
            r10.mo2011j(r1)
        L_0x00b8:
            int r10 = p048g.C4297j.f24168y2
            java.lang.CharSequence[] r10 = r0.mo2058q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p048g.C4294g.f23917t
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.mo2061w()
            r6.f1475e = r11
            android.widget.SpinnerAdapter r7 = r6.f1474d
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1474d = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f1471a
            r7.mo2214e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0437a0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
