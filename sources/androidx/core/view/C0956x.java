package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: androidx.core.view.x */
/* compiled from: OneShotPreDrawListener */
public final class C0956x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f2626a;

    /* renamed from: b */
    private ViewTreeObserver f2627b;

    /* renamed from: c */
    private final Runnable f2628c;

    private C0956x(View view, Runnable runnable) {
        this.f2626a = view;
        this.f2627b = view.getViewTreeObserver();
        this.f2628c = runnable;
    }

    /* renamed from: a */
    public static C0956x m4317a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        C0956x xVar = new C0956x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    /* renamed from: b */
    public void mo3497b() {
        if (this.f2627b.isAlive()) {
            this.f2627b.removeOnPreDrawListener(this);
        } else {
            this.f2626a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2626a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo3497b();
        this.f2628c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f2627b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo3497b();
    }
}
