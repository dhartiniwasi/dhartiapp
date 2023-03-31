package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.ads.pm0;
import p088l5.C4956b;
import p108o4.C5223d;
import p108o4.C5224e;
import p179z3.C6345o;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MediaView extends FrameLayout {

    /* renamed from: a */
    private C6345o f5988a;

    /* renamed from: b */
    private boolean f5989b;

    /* renamed from: c */
    private ImageView.ScaleType f5990c;

    /* renamed from: d */
    private boolean f5991d;

    /* renamed from: e */
    private C5223d f5992e;

    /* renamed from: f */
    private C5224e f5993f;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo7866a(C5223d dVar) {
        this.f5992e = dVar;
        if (this.f5989b) {
            dVar.f27078a.mo7875c(this.f5988a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo7867b(C5224e eVar) {
        this.f5993f = eVar;
        if (this.f5991d) {
            eVar.f27079a.mo7876d(this.f5990c);
        }
    }

    public C6345o getMediaContent() {
        return this.f5988a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f5991d = true;
        this.f5990c = scaleType;
        C5224e eVar = this.f5993f;
        if (eVar != null) {
            eVar.f27079a.mo7876d(scaleType);
        }
    }

    public void setMediaContent(C6345o oVar) {
        this.f5989b = true;
        this.f5988a = oVar;
        C5223d dVar = this.f5992e;
        if (dVar != null) {
            dVar.f27078a.mo7875c(oVar);
        }
        if (oVar != null) {
            try {
                j30 zza = oVar.zza();
                if (zza != null && !zza.mo10250P(C4956b.m31385o3(this))) {
                    removeAllViews();
                }
            } catch (RemoteException e) {
                removeAllViews();
                pm0.m18665e("", e);
            }
        }
    }
}
