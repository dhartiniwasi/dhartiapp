package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4527j2;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yp1 extends h80 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, c20 {

    /* renamed from: a */
    private View f20775a;

    /* renamed from: b */
    private C4527j2 f20776b;

    /* renamed from: c */
    private sl1 f20777c;

    /* renamed from: d */
    private boolean f20778d = false;

    /* renamed from: e */
    private boolean f20779e = false;

    public yp1(sl1 sl1, xl1 xl1) {
        this.f20775a = xl1.mo15135N();
        this.f20776b = xl1.mo15139R();
        this.f20777c = sl1;
        if (xl1.mo15147Z() != null) {
            xl1.mo15147Z().mo12130p1(this);
        }
    }

    /* renamed from: I6 */
    private static final void m24144I6(l80 l80, int i) {
        try {
            l80.mo11339n(i);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: U */
    private final void m24145U() {
        View view = this.f20775a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f20775a);
            }
        }
    }

    /* renamed from: c */
    private final void m24146c() {
        View view;
        sl1 sl1 = this.f20777c;
        if (sl1 != null && (view = this.f20775a) != null) {
            sl1.mo14056Q(view, Collections.emptyMap(), Collections.emptyMap(), sl1.m20448w(this.f20775a));
        }
    }

    /* renamed from: X2 */
    public final void mo11050X2(C4954a aVar, l80 l80) throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        if (this.f20778d) {
            pm0.m18664d("Instream ad can not be shown after destroy().");
            m24144I6(l80, 2);
            return;
        }
        View view = this.f20775a;
        if (view == null || this.f20776b == null) {
            pm0.m18664d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            m24144I6(l80, 0);
        } else if (this.f20779e) {
            pm0.m18664d("Instream ad should not be used again.");
            m24144I6(l80, 1);
        } else {
            this.f20779e = true;
            m24145U();
            ((ViewGroup) C4956b.m31384P0(aVar)).addView(this.f20775a, new ViewGroup.LayoutParams(-1, -1));
            C4409t.m29334z();
            qn0.m19299a(this.f20775a, this);
            C4409t.m29334z();
            qn0.m19300b(this.f20775a, this);
            m24146c();
            try {
                l80.mo11338T();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo11051b() throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        m24145U();
        sl1 sl1 = this.f20777c;
        if (sl1 != null) {
            sl1.mo11305a();
        }
        this.f20777c = null;
        this.f20775a = null;
        this.f20776b = null;
        this.f20778d = true;
    }

    /* renamed from: d */
    public final C4527j2 mo11052d() throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        if (!this.f20778d) {
            return this.f20776b;
        }
        pm0.m18664d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    /* renamed from: e */
    public final o20 mo11053e() {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        if (this.f20778d) {
            pm0.m18664d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        sl1 sl1 = this.f20777c;
        if (sl1 == null || sl1.mo14045C() == null) {
            return null;
        }
        return sl1.mo14045C().mo14533a();
    }

    public final void onGlobalLayout() {
        m24146c();
    }

    public final void onScrollChanged() {
        m24146c();
    }

    public final void zze(C4954a aVar) throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        mo11050X2(aVar, new xp1(this));
    }
}
