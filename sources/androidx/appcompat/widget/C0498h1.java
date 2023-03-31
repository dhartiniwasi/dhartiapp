package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import p048g.C4291d;
import p048g.C4293f;
import p048g.C4294g;
import p048g.C4296i;

/* renamed from: androidx.appcompat.widget.h1 */
/* compiled from: TooltipPopup */
class C0498h1 {

    /* renamed from: a */
    private final Context f1636a;

    /* renamed from: b */
    private final View f1637b;

    /* renamed from: c */
    private final TextView f1638c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1639d;

    /* renamed from: e */
    private final Rect f1640e = new Rect();

    /* renamed from: f */
    private final int[] f1641f = new int[2];

    /* renamed from: g */
    private final int[] f1642g = new int[2];

    C0498h1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1639d = layoutParams;
        this.f1636a = context;
        View inflate = LayoutInflater.from(context).inflate(C4294g.f23916s, (ViewGroup) null);
        this.f1637b = inflate;
        this.f1638c = (TextView) inflate.findViewById(C4293f.f23890s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C4296i.f23930a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m2452a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1636a.getResources().getDimensionPixelOffset(C4291d.f23808m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1636a.getResources().getDimensionPixelOffset(C4291d.f23807l);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1636a.getResources().getDimensionPixelOffset(z ? C4291d.f23810o : C4291d.f23809n);
        View b = m2453b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f1640e);
        Rect rect = this.f1640e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1636a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1640e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f1642g);
        view.getLocationOnScreen(this.f1641f);
        int[] iArr = this.f1641f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1642g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1637b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1637b.getMeasuredHeight();
        int[] iArr3 = this.f1641f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1640e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m2453b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2315c() {
        if (mo2316d()) {
            ((WindowManager) this.f1636a.getSystemService("window")).removeView(this.f1637b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2316d() {
        return this.f1637b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2317e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2316d()) {
            mo2315c();
        }
        this.f1638c.setText(charSequence);
        m2452a(view, i, i2, z, this.f1639d);
        ((WindowManager) this.f1636a.getSystemService("window")).addView(this.f1637b, this.f1639d);
    }
}
