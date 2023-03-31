package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p048g.C4288a;

/* renamed from: androidx.appcompat.widget.y */
/* compiled from: AppCompatSeekBar */
public class C0570y extends SeekBar {

    /* renamed from: a */
    private final C0572z f1870a;

    public C0570y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23756I);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1870a.mo2659h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1870a.mo2660i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1870a.mo2658g(canvas);
    }

    public C0570y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0572z zVar = new C0572z(this);
        this.f1870a = zVar;
        zVar.mo2617c(attributeSet, i);
    }
}
