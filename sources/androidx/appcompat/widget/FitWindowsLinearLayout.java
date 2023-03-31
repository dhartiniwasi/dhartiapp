package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0511k0;

public class FitWindowsLinearLayout extends LinearLayout implements C0511k0 {

    /* renamed from: a */
    private C0511k0.C0512a f1325a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0511k0.C0512a aVar = this.f1325a;
        if (aVar != null) {
            aVar.mo988a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0511k0.C0512a aVar) {
        this.f1325a = aVar;
    }
}
