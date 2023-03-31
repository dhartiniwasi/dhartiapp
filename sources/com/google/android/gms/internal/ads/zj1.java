package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zj1 implements w91, zg1 {

    /* renamed from: a */
    private final ak0 f21113a;

    /* renamed from: b */
    private final Context f21114b;

    /* renamed from: c */
    private final sk0 f21115c;

    /* renamed from: d */
    private final View f21116d;

    /* renamed from: e */
    private String f21117e;

    /* renamed from: f */
    private final C2378fv f21118f;

    public zj1(ak0 ak0, Context context, sk0 sk0, View view, C2378fv fvVar) {
        this.f21113a = ak0;
        this.f21114b = context;
        this.f21115c = sk0;
        this.f21116d = view;
        this.f21118f = fvVar;
    }

    /* renamed from: T */
    public final void mo11823T() {
    }

    /* renamed from: W */
    public final void mo8333W() {
        this.f21113a.mo8418b(false);
    }

    /* renamed from: Y */
    public final void mo8334Y() {
        View view = this.f21116d;
        if (!(view == null || this.f21117e == null)) {
            this.f21115c.mo14041x(view.getContext(), this.f21117e);
        }
        this.f21113a.mo8418b(true);
    }

    /* renamed from: c */
    public final void mo11824c() {
        if (this.f21118f != C2378fv.APP_OPEN) {
            String i = this.f21115c.mo14026i(this.f21114b);
            this.f21117e = i;
            this.f21117e = String.valueOf(i).concat(this.f21118f == C2378fv.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    /* renamed from: c0 */
    public final void mo8335c0() {
    }

    /* renamed from: e0 */
    public final void mo8336e0() {
    }

    /* renamed from: j */
    public final void mo8337j(oh0 oh0, String str, String str2) {
        if (this.f21115c.mo14043z(this.f21114b)) {
            try {
                sk0 sk0 = this.f21115c;
                Context context = this.f21114b;
                sk0.mo14037t(context, sk0.mo14023f(context), this.f21113a.mo8417a(), oh0.mo12017e(), oh0.mo12016d());
            } catch (RemoteException e) {
                pm0.m18668h("Remote Exception to get reward item.", e);
            }
        }
    }

    /* renamed from: x */
    public final void mo8338x() {
    }
}
