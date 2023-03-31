package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0511k0;

public class FitWindowsFrameLayout extends FrameLayout implements C0511k0 {

    /* renamed from: a */
    private C0511k0.C0512a f1324a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0511k0.C0512a aVar = this.f1324a;
        if (aVar != null) {
            aVar.mo988a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0511k0.C0512a aVar) {
        this.f1324a = aVar;
    }
}
