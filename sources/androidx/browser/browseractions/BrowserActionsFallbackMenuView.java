package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p096n.C5051a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f1882a = getResources().getDimensionPixelOffset(C5051a.f26442b);

    /* renamed from: b */
    private final int f1883b = getResources().getDimensionPixelOffset(C5051a.f26441a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1882a * 2), this.f1883b), 1073741824), i2);
    }
}
