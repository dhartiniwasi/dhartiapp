package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p048g.C4288a;

/* renamed from: androidx.appcompat.widget.w */
/* compiled from: AppCompatRatingBar */
public class C0565w extends RatingBar {

    /* renamed from: a */
    private final C0559u f1865a;

    public C0565w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23754G);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1865a.mo2616b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0565w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0559u uVar = new C0559u(this);
        this.f1865a = uVar;
        uVar.mo2617c(attributeSet, i);
    }
}
