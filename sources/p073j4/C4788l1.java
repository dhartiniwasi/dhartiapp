package p073j4;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.qn0;
import p053g4.C4409t;

/* renamed from: j4.l1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4788l1 {

    /* renamed from: a */
    private final View f25461a;

    /* renamed from: b */
    private Activity f25462b;

    /* renamed from: c */
    private boolean f25463c;

    /* renamed from: d */
    private boolean f25464d;

    /* renamed from: e */
    private boolean f25465e;

    /* renamed from: f */
    private final ViewTreeObserver.OnGlobalLayoutListener f25466f;

    public C4788l1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f25462b = activity;
        this.f25461a = view;
        this.f25466f = onGlobalLayoutListener;
    }

    /* renamed from: f */
    private static ViewTreeObserver m30683f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m30684g() {
        if (!this.f25463c) {
            Activity activity = this.f25462b;
            if (activity != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25466f;
                ViewTreeObserver f = m30683f(activity);
                if (f != null) {
                    f.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
            C4409t.m29334z();
            qn0.m19299a(this.f25461a, this.f25466f);
            this.f25463c = true;
        }
    }

    /* renamed from: h */
    private final void m30685h() {
        Activity activity = this.f25462b;
        if (activity != null && this.f25463c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f25466f;
            ViewTreeObserver f = m30683f(activity);
            if (f != null) {
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f25463c = false;
        }
    }

    /* renamed from: a */
    public final void mo18471a() {
        this.f25465e = false;
        m30685h();
    }

    /* renamed from: b */
    public final void mo18472b() {
        this.f25465e = true;
        if (this.f25464d) {
            m30684g();
        }
    }

    /* renamed from: c */
    public final void mo18473c() {
        this.f25464d = true;
        if (this.f25465e) {
            m30684g();
        }
    }

    /* renamed from: d */
    public final void mo18474d() {
        this.f25464d = false;
        m30685h();
    }

    /* renamed from: e */
    public final void mo18475e(Activity activity) {
        this.f25462b = activity;
    }
}
