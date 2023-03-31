package com.startapp;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.List;

/* renamed from: com.startapp.f7 */
/* compiled from: Sta */
public class C8950f7 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ NativeAdDetails f36779a;

    public C8950f7(NativeAdDetails nativeAdDetails) {
        this.f36779a = nativeAdDetails;
    }

    public void onViewAttachedToWindow(View view) {
        View view2;
        AdDetails adDetails;
        List<VerificationDetails> b;
        NativeAdDetails nativeAdDetails = this.f36779a;
        nativeAdDetails.getClass();
        if (!(!MetaData.f38952k.mo31005U() || (view2 = (View) nativeAdDetails.f38366h.get()) == null || (adDetails = nativeAdDetails.f38359a) == null || (b = adDetails.mo30828b()) == null)) {
            C9260r7 r7Var = new C9260r7(view2.getContext(), b, false);
            nativeAdDetails.f38369k = r7Var;
            if (r7Var.mo29873c()) {
                nativeAdDetails.f38369k.mo29870a(view2);
                nativeAdDetails.f38369k.mo29875e();
                nativeAdDetails.f38369k.mo29874d();
                nativeAdDetails.f38369k.mo29872b();
            }
        }
        this.f36779a.mo30145a();
    }

    public void onViewDetachedFromWindow(View view) {
        NativeAdDetails nativeAdDetails = this.f36779a;
        C8988gd gdVar = nativeAdDetails.f38365g;
        if (gdVar != null) {
            gdVar.mo29438a();
            nativeAdDetails.f38365g = null;
        }
        NativeAdDetails nativeAdDetails2 = this.f36779a;
        C9260r7 r7Var = nativeAdDetails2.f38369k;
        if (r7Var != null) {
            r7Var.mo29869a();
            nativeAdDetails2.f38369k = null;
        }
        view.removeOnAttachStateChangeListener(this.f36779a.f38367i);
    }
}
