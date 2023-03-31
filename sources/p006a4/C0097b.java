package p006a4;

import android.content.Context;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.c10;
import com.google.android.gms.internal.ads.em0;
import p033d5.C4141r;
import p060h4.C4596v;
import p179z3.C6337h;
import p179z3.C6342l;
import p179z3.C6355x;
import p179z3.C6357y;

/* renamed from: a4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C0097b extends C6342l {
    public C0097b(Context context) {
        super(context, 0);
        C4141r.m28222l(context, "Context cannot be null");
    }

    /* renamed from: e */
    public void mo237e(C0095a aVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C2679nz.m17343c(getContext());
        if (((Boolean) c10.f7560f.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                em0.f8846b.execute(new C0102g(this, aVar));
                return;
            }
        }
        this.f30542a.mo18157p(aVar.mo229a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo238f(C0095a aVar) {
        try {
            this.f30542a.mo18157p(aVar.mo229a());
        } catch (IllegalStateException e) {
            ag0.m9704c(getContext()).mo8326b(e, "AdManagerAdView.loadAd");
        }
    }

    public C6337h[] getAdSizes() {
        return this.f30542a.mo18145a();
    }

    public C0100e getAppEventListener() {
        return this.f30542a.mo18152k();
    }

    public C6355x getVideoController() {
        return this.f30542a.mo18150i();
    }

    public C6357y getVideoOptions() {
        return this.f30542a.mo18151j();
    }

    public void setAdSizes(C6337h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f30542a.mo18163v(hVarArr);
    }

    public void setAppEventListener(C0100e eVar) {
        this.f30542a.mo18165x(eVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f30542a.mo18166y(z);
    }

    public void setVideoOptions(C6357y yVar) {
        this.f30542a.mo18144A(yVar);
    }
}
