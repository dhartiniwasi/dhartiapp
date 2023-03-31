package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;
import p023c4.C1871i;
import p060h4.C4596v;
import p073j4.C4794n1;
import p073j4.C4800p1;
import p073j4.C4829z0;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ym1 {

    /* renamed from: a */
    private final C4800p1 f20687a;

    /* renamed from: b */
    private final et2 f20688b;

    /* renamed from: c */
    private final cm1 f20689c;

    /* renamed from: d */
    private final xl1 f20690d;

    /* renamed from: e */
    private final kn1 f20691e;

    /* renamed from: f */
    private final sn1 f20692f;

    /* renamed from: g */
    private final Executor f20693g;

    /* renamed from: h */
    private final Executor f20694h;

    /* renamed from: i */
    private final f20 f20695i;

    /* renamed from: j */
    private final ul1 f20696j;

    public ym1(C4800p1 p1Var, et2 et2, cm1 cm1, xl1 xl1, kn1 kn1, sn1 sn1, Executor executor, Executor executor2, ul1 ul1) {
        this.f20687a = p1Var;
        this.f20688b = et2;
        this.f20695i = et2.f8938i;
        this.f20689c = cm1;
        this.f20690d = xl1;
        this.f20691e = kn1;
        this.f20692f = sn1;
        this.f20693g = executor;
        this.f20694h = executor2;
        this.f20696j = ul1;
    }

    /* renamed from: g */
    private static void m24039g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: h */
    private final boolean m24040h(ViewGroup viewGroup, boolean z) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            view = this.f20690d.mo15135N();
        } else {
            view = this.f20690d.mo15136O();
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14473X2)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo15456a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        xl1 xl1 = this.f20690d;
        if (xl1.mo15135N() == null) {
            return;
        }
        if (xl1.mo15132K() == 2 || xl1.mo15132K() == 1) {
            this.f20687a.mo18481A(this.f20688b.f8935f, String.valueOf(xl1.mo15132K()), z);
        } else if (xl1.mo15132K() == 6) {
            this.f20687a.mo18481A(this.f20688b.f8935f, "2", z);
            this.f20687a.mo18481A(this.f20688b.f8935f, "1", z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo15457b(un1 un1) {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        o20 a;
        Drawable drawable;
        Context context = null;
        if (this.f20689c.mo8875f() || this.f20689c.mo8874e()) {
            String[] strArr = {"1098", "3011"};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                View O = un1.mo14085O(strArr[i]);
                if (O != null && (O instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) O;
                    break;
                }
                i++;
            }
        }
        viewGroup = null;
        Context context2 = un1.mo14086T().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        xl1 xl1 = this.f20690d;
        if (xl1.mo15134M() != null) {
            view = xl1.mo15134M();
            f20 f20 = this.f20695i;
            if (f20 != null && viewGroup == null) {
                m24039g(layoutParams, f20.f9091e);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(xl1.mo15141T() instanceof a20)) {
            view = null;
        } else {
            a20 a20 = (a20) xl1.mo15141T();
            if (viewGroup == null) {
                m24039g(layoutParams, a20.mo8186e());
            }
            b20 b20 = new b20(context2, a20, layoutParams);
            b20.setContentDescription((CharSequence) C4596v.m30088c().mo12227b(C2679nz.f14455V2));
            view = b20;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                C1871i iVar = new C1871i(un1.mo14086T().getContext());
                iVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                iVar.addView(view);
                FrameLayout U = un1.mo14087U();
                if (U != null) {
                    U.addView(iVar);
                }
            }
            un1.mo14084B0(un1.mo14090X(), view, true);
        }
        ua3 ua3 = um1.f18613v;
        int size = ua3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View O2 = un1.mo14085O((String) ua3.get(i2));
            i2++;
            if (O2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) O2;
                break;
            }
        }
        this.f20694h.execute(new vm1(this, viewGroup2));
        if (viewGroup2 != null) {
            if (m24040h(viewGroup2, true)) {
                xl1 xl12 = this.f20690d;
                if (xl12.mo15147Z() != null) {
                    xl12.mo15147Z().mo12095U0(new xm1(un1, viewGroup2));
                    return;
                }
                return;
            }
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14606k8)).booleanValue() || !m24040h(viewGroup2, false)) {
                viewGroup2.removeAllViews();
                View T = un1.mo14086T();
                if (T != null) {
                    context = T.getContext();
                }
                if (context != null && (a = this.f20696j.mo14533a()) != null) {
                    try {
                        C4954a V = a.mo11427V();
                        if (V != null && (drawable = (Drawable) C4956b.m31384P0(V)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            C4954a W = un1.mo14089W();
                            if (W != null) {
                                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14613l5)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) C4956b.m31384P0(W));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        pm0.m18667g("Could not get main image drawable");
                    }
                }
            } else {
                xl1 xl13 = this.f20690d;
                if (xl13.mo15145X() != null) {
                    xl13.mo15145X().mo12095U0(new xm1(un1, viewGroup2));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo15458c(un1 un1) {
        if (un1 != null && this.f20691e != null && un1.mo14087U() != null && this.f20689c.mo8876g()) {
            try {
                un1.mo14087U().addView(this.f20691e.mo11729a());
            } catch (ht0 e) {
                C4794n1.m30694l("web view can not be obtained", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo15459d(un1 un1) {
        if (un1 != null) {
            Context context = un1.mo14086T().getContext();
            if (C4829z0.m30854h(context, this.f20689c.f7834a)) {
                if (!(context instanceof Activity)) {
                    pm0.m18662b("Activity context is needed for policy validator.");
                } else if (this.f20692f != null && un1.mo14087U() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.f20692f.mo14102a(un1.mo14087U(), windowManager), C4829z0.m30848b());
                    } catch (ht0 e) {
                        C4794n1.m30694l("web view can not be obtained", e);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo15460e(un1 un1) {
        this.f20693g.execute(new wm1(this, un1));
    }

    /* renamed from: f */
    public final boolean mo15461f(ViewGroup viewGroup) {
        return m24040h(viewGroup, true);
    }
}
