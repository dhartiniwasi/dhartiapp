package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wt0 {

    /* renamed from: a */
    private final xt0 f19778a;

    /* renamed from: b */
    private final vt0 f19779b;

    public wt0(xt0 xt0, vt0 vt0, byte[] bArr) {
        this.f19779b = vt0;
        this.f19778a = xt0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14992a(String str) {
        vt0 vt0 = this.f19779b;
        Uri parse = Uri.parse(str);
        ct0 w0 = ((pt0) vt0.f19235a).mo13378w0();
        if (w0 == null) {
            pm0.m18664d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            w0.mo9310j0(parse);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.xt0] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            C4794n1.m30693k("Click string is empty, not proceeding.");
            return "";
        }
        ? r0 = this.f19778a;
        C2955ve r = r0.mo10015r();
        if (r == null) {
            C4794n1.m30693k("Signal utils is empty, ignoring.");
            return "";
        }
        C2807re c = r.mo14737c();
        if (c == null) {
            C4794n1.m30693k("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            C4794n1.m30693k("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f19778a.getContext();
            xt0 xt0 = this.f19778a;
            return c.mo12593d(context, str, (View) xt0, xt0.mo8461X());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.xt0] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r0 = this.f19778a;
        C2955ve r = r0.mo10015r();
        if (r == null) {
            C4794n1.m30693k("Signal utils is empty, ignoring.");
            return "";
        }
        C2807re c = r.mo14737c();
        if (c == null) {
            C4794n1.m30693k("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            C4794n1.m30693k("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.f19778a.getContext();
            xt0 xt0 = this.f19778a;
            return c.mo12595f(context, (View) xt0, xt0.mo8461X());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            pm0.m18667g("URL is empty, ignoring message");
        } else {
            C4751b2.f25403i.post(new ut0(this, str));
        }
    }
}
