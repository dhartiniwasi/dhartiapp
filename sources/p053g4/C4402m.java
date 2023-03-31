package p053g4;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.eu2;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4623z2;

/* renamed from: g4.m */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4402m extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C4408s f24526a;

    C4402m(C4408s sVar) {
        this.f24526a = sVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C4408s sVar = this.f24526a;
        if (sVar.f24542g != null) {
            try {
                sVar.f24542g.mo14156l(eu2.m12271d(1, (String) null, (C4623z2) null));
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
        C4408s sVar2 = this.f24526a;
        if (sVar2.f24542g != null) {
            try {
                sVar2.f24542g.mo14157n(0);
            } catch (RemoteException e2) {
                pm0.m18669i("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f24526a.mo17926h())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            C4408s sVar = this.f24526a;
            if (sVar.f24542g != null) {
                try {
                    sVar.f24542g.mo14156l(eu2.m12271d(3, (String) null, (C4623z2) null));
                } catch (RemoteException e) {
                    pm0.m18669i("#007 Could not call remote method.", e);
                }
            }
            C4408s sVar2 = this.f24526a;
            if (sVar2.f24542g != null) {
                try {
                    sVar2.f24542g.mo14157n(3);
                } catch (RemoteException e2) {
                    pm0.m18669i("#007 Could not call remote method.", e2);
                }
            }
            this.f24526a.mo17924I6(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            C4408s sVar3 = this.f24526a;
            if (sVar3.f24542g != null) {
                try {
                    sVar3.f24542g.mo14156l(eu2.m12271d(1, (String) null, (C4623z2) null));
                } catch (RemoteException e3) {
                    pm0.m18669i("#007 Could not call remote method.", e3);
                }
            }
            C4408s sVar4 = this.f24526a;
            if (sVar4.f24542g != null) {
                try {
                    sVar4.f24542g.mo14157n(0);
                } catch (RemoteException e4) {
                    pm0.m18669i("#007 Could not call remote method.", e4);
                }
            }
            this.f24526a.mo17924I6(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            C4408s sVar5 = this.f24526a;
            if (sVar5.f24542g != null) {
                try {
                    sVar5.f24542g.mo14151V();
                } catch (RemoteException e5) {
                    pm0.m18669i("#007 Could not call remote method.", e5);
                }
            }
            this.f24526a.mo17924I6(this.f24526a.mo17927i(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            C4408s sVar6 = this.f24526a;
            if (sVar6.f24542g != null) {
                try {
                    sVar6.f24542g.mo14155e();
                    this.f24526a.f24542g.mo14150U();
                } catch (RemoteException e6) {
                    pm0.m18669i("#007 Could not call remote method.", e6);
                }
            }
            C4408s.m29262R6(this.f24526a, C4408s.m29259O6(this.f24526a, str));
            return true;
        }
    }
}
