package com.onesignal;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.onesignal.C8289a;
import java.lang.ref.WeakReference;

/* renamed from: com.onesignal.b3 */
/* compiled from: OSViewUtils */
class C8313b3 {

    /* renamed from: a */
    private static final int f35357a = m46320b(24);

    /* renamed from: com.onesignal.b3$a */
    /* compiled from: OSViewUtils */
    class C8314a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f35358a;

        /* renamed from: b */
        final /* synthetic */ Runnable f35359b;

        /* renamed from: com.onesignal.b3$a$a */
        /* compiled from: OSViewUtils */
        class C8315a extends C8289a.C8291b {

            /* renamed from: a */
            final /* synthetic */ C8289a f35360a;

            C8315a(C8289a aVar) {
                this.f35360a = aVar;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo27565a(Activity activity) {
                this.f35360a.mo27584q(C8314a.this.f35358a);
                if (C8313b3.m46329k(activity)) {
                    C8314a.this.f35359b.run();
                } else {
                    C8313b3.m46319a(activity, C8314a.this.f35359b);
                }
            }
        }

        C8314a(String str, Runnable runnable) {
            this.f35358a = str;
            this.f35359b = runnable;
        }

        public void run() {
            C8289a b = C8301b.m46281b();
            if (b != null) {
                b.mo27574b(this.f35358a, new C8315a(b));
            }
        }
    }

    /* renamed from: a */
    static void m46319a(Activity activity, Runnable runnable) {
        activity.getWindow().getDecorView().post(new C8314a("decorViewReady:" + runnable, runnable));
    }

    /* renamed from: b */
    static int m46320b(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: c */
    static int[] m46321c(Activity activity) {
        float f;
        DisplayCutout cutout;
        Rect i = m46327i(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = ((float) (i.top - findViewById.getTop())) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = ((float) (findViewById.getBottom() - i.bottom)) / Resources.getSystem().getDisplayMetrics().density;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT != 29 || (cutout = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f = 0.0f;
        } else {
            f2 = ((float) cutout.getSafeInsetRight()) / Resources.getSystem().getDisplayMetrics().density;
            f = ((float) cutout.getSafeInsetLeft()) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{Math.round(top), Math.round(bottom), Math.round(f2), Math.round(f)};
    }

    /* renamed from: d */
    private static int m46322d(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    /* renamed from: e */
    static int m46323e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.getWindow().getDecorView().getWidth();
        }
        return m46328j(activity);
    }

    /* renamed from: f */
    static int m46324f(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return m46325g(activity);
        }
        if (i >= 21) {
            return m46326h(activity);
        }
        return m46322d(activity);
    }

    /* renamed from: g */
    private static int m46325g(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return decorView.getHeight();
        }
        return (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    /* renamed from: h */
    private static int m46326h(Activity activity) {
        if (activity.getResources().getConfiguration().orientation == 2) {
            return m46327i(activity).height();
        }
        return m46322d(activity);
    }

    /* renamed from: i */
    private static Rect m46327i(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: j */
    static int m46328j(Activity activity) {
        return m46327i(activity).width();
    }

    /* renamed from: k */
    static boolean m46329k(Activity activity) {
        boolean z = activity.getWindow().getDecorView().getApplicationWindowToken() != null;
        if (Build.VERSION.SDK_INT < 23) {
            return z;
        }
        boolean z2 = activity.getWindow().getDecorView().getRootWindowInsets() != null;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    static boolean m46330l(WeakReference<Activity> weakReference) {
        View view;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Window window = ((Activity) weakReference.get()).getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null || displayMetrics.heightPixels - rect.bottom <= f35357a) {
            return false;
        }
        return true;
    }
}
