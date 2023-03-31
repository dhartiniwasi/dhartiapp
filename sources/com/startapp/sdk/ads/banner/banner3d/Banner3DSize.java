package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.startapp.C9023i4;
import com.startapp.C9265rb;
import com.startapp.C9270s0;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerOptions;

/* compiled from: Sta */
public class Banner3DSize {

    /* compiled from: Sta */
    public enum Size {
        XXSMALL(new C9270s0(280, 50)),
        XSMALL(new C9270s0(300, 50)),
        SMALL(new C9270s0(320, 50)),
        MEDIUM(new C9270s0(468, 60)),
        LARGE(new C9270s0(728, 90)),
        XLARGE(new C9270s0(1024, 90));
        
        private C9270s0 size;

        private Size(C9270s0 s0Var) {
            this.size = s0Var;
        }

        public C9270s0 getSize() {
            return this.size;
        }
    }

    /* renamed from: a */
    public static boolean m49331a(Context context, ViewParent viewParent, BannerOptions bannerOptions, Banner3D banner3D, C9270s0 s0Var) {
        Point point = new Point();
        point.x = bannerOptions.mo29978o();
        point.y = bannerOptions.mo29965d();
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().width > 0) {
            point.x = Math.round(((float) (banner3D.getLayoutParams().width + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() != null && banner3D.getLayoutParams().height > 0) {
            point.y = Math.round(((float) (banner3D.getLayoutParams().height + 1)) / context.getResources().getDisplayMetrics().density);
        }
        if (banner3D.getLayoutParams() == null || banner3D.getLayoutParams().width <= 0 || banner3D.getLayoutParams().height <= 0) {
            if (context instanceof Activity) {
                View decorView = ((Activity) context).getWindow().getDecorView();
                try {
                    View view = (View) viewParent;
                    if (view instanceof Banner) {
                        view = (View) view.getParent();
                    }
                    boolean z = false;
                    boolean z2 = false;
                    while (view != null && (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0)) {
                        if (view.getMeasuredWidth() > 0 && !z) {
                            m49333c(context, point, view);
                            z = true;
                        }
                        if (view.getMeasuredHeight() > 0 && !z2) {
                            m49332b(context, point, view);
                            z2 = true;
                        }
                        view = (View) view.getParent();
                    }
                    if (view == null) {
                        m49330a(context, point, decorView);
                    } else {
                        if (!z) {
                            m49333c(context, point, view);
                        }
                        if (!z2) {
                            m49332b(context, point, view);
                        }
                    }
                } catch (Throwable th) {
                    m49330a(context, point, decorView);
                    C9023i4.m48681a(th);
                }
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        C9265rb.m49237a(context, windowManager, point);
                    }
                } catch (Throwable th2) {
                    C9023i4.m48681a(th2);
                }
            }
        }
        C9270s0 s0Var2 = new C9270s0(point.x, point.y);
        Point point2 = s0Var2.f38176a;
        s0Var.mo29891a(point2.x, point2.y);
        boolean z3 = false;
        for (Size size : Size.values()) {
            if (size.getSize().f38176a.x <= s0Var2.f38176a.x && size.getSize().f38176a.y <= s0Var2.f38176a.y) {
                bannerOptions.mo29962a(size.getSize().f38176a.x, size.getSize().f38176a.y);
                z3 = true;
            }
        }
        if (!z3) {
            bannerOptions.mo29962a(0, 0);
        }
        return z3;
    }

    /* renamed from: b */
    public static void m49332b(Context context, Point point, View view) {
        point.y = Math.round(((float) ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop())) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static void m49333c(Context context, Point point, View view) {
        point.x = Math.round(((float) ((view.getMeasuredWidth() - view.getPaddingLeft()) - view.getPaddingRight())) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static void m49330a(Context context, Point point, View view) {
        point.x = Math.round(((float) view.getMeasuredWidth()) / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(((float) view.getMeasuredHeight()) / context.getResources().getDisplayMetrics().density);
    }
}
