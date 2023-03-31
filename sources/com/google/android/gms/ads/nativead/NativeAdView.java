package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.o20;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.v20;
import p060h4.C4528j3;
import p060h4.C4584t;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;
import p108o4.C5219a;
import p108o4.C5223d;
import p108o4.C5224e;
import p179z3.C6345o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f5994a;

    /* renamed from: b */
    private final v20 f5995b = m9015f();

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5994a = m9014e(context);
    }

    /* renamed from: e */
    private final FrameLayout m9014e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    /* renamed from: f */
    private final v20 m9015f() {
        if (isInEditMode()) {
            return null;
        }
        return C4584t.m30035a().mo18129g(this.f5994a.getContext(), this, this.f5994a);
    }

    /* renamed from: g */
    private final void m9016g(String str, View view) {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                v20.mo14196v4(str, C4956b.m31385o3(view));
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call setAssetView on delegate", e);
            }
        }
    }

    /* renamed from: a */
    public void mo7871a() {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                v20.mo14192e();
            } catch (RemoteException e) {
                pm0.m18665e("Unable to destroy native ad view", e);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f5994a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final View mo7873b(String str) {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                C4954a i = v20.mo14194i(str);
                if (i != null) {
                    return (View) C4956b.m31384P0(i);
                }
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f5994a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo7875c(C6345o oVar) {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                if (oVar instanceof C4528j3) {
                    v20.mo14189L3(((C4528j3) oVar).mo18064a());
                } else if (oVar == null) {
                    v20.mo14189L3((o20) null);
                } else {
                    pm0.m18662b("Use MediaContent provided by NativeAd.getMediaContent");
                }
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call setMediaContent on delegate", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo7876d(ImageView.ScaleType scaleType) {
        v20 v20 = this.f5995b;
        if (v20 != null && scaleType != null) {
            try {
                v20.mo14193g6(C4956b.m31385o3(scaleType));
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        v20 v20;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14305G2)).booleanValue() && (v20 = this.f5995b) != null) {
            try {
                v20.mo14188D(C4956b.m31385o3(motionEvent));
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C5219a getAdChoicesView() {
        View b = mo7873b("3011");
        if (b instanceof C5219a) {
            return (C5219a) b;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return mo7873b("3005");
    }

    public final View getBodyView() {
        return mo7873b("3004");
    }

    public final View getCallToActionView() {
        return mo7873b("3002");
    }

    public final View getHeadlineView() {
        return mo7873b("3001");
    }

    public final View getIconView() {
        return mo7873b("3003");
    }

    public final View getImageView() {
        return mo7873b("3008");
    }

    public final MediaView getMediaView() {
        View b = mo7873b("3010");
        if (b instanceof MediaView) {
            return (MediaView) b;
        }
        if (b == null) {
            return null;
        }
        pm0.m18662b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return mo7873b("3007");
    }

    public final View getStarRatingView() {
        return mo7873b("3009");
    }

    public final View getStoreView() {
        return mo7873b("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                v20.mo14191a6(C4956b.m31385o3(view), i);
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f5994a);
    }

    public final void removeView(View view) {
        if (this.f5994a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(C5219a aVar) {
        m9016g("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        m9016g("3005", view);
    }

    public final void setBodyView(View view) {
        m9016g("3004", view);
    }

    public final void setCallToActionView(View view) {
        m9016g("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                v20.mo14195i2(C4956b.m31385o3(view));
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        m9016g("3001", view);
    }

    public final void setIconView(View view) {
        m9016g("3003", view);
    }

    public final void setImageView(View view) {
        m9016g("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m9016g("3010", mediaView);
        if (mediaView != null) {
            mediaView.mo7866a(new C5223d(this));
            mediaView.mo7867b(new C5224e(this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, l5.a] */
    public void setNativeAd(C2043a aVar) {
        v20 v20 = this.f5995b;
        if (v20 != null) {
            try {
                v20.mo14190W4(aVar.mo7916l());
            } catch (RemoteException e) {
                pm0.m18665e("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        m9016g("3007", view);
    }

    public final void setStarRatingView(View view) {
        m9016g("3009", view);
    }

    public final void setStoreView(View view) {
        m9016g("3006", view);
    }
}
