package p053g4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C2822rt;
import com.google.android.gms.internal.ads.C2955ve;
import com.google.android.gms.internal.ads.C2992we;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.i00;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.kf0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.uh0;
import com.google.android.gms.internal.ads.vm0;
import java.util.Map;
import java.util.concurrent.Future;
import p033d5.C4141r;
import p060h4.C4471a0;
import p060h4.C4484c1;
import p060h4.C4489d0;
import p060h4.C4491d2;
import p060h4.C4499e4;
import p060h4.C4502f1;
import p060h4.C4507g0;
import p060h4.C4509g2;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4551n2;
import p060h4.C4561p0;
import p060h4.C4571q4;
import p060h4.C4584t;
import p060h4.C4591u0;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: g4.s */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4408s extends C4561p0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final vm0 f24536a;

    /* renamed from: b */
    private final C4571q4 f24537b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Future f24538c = dn0.f8325a.mo12324a(new C4404o(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f24539d;

    /* renamed from: e */
    private final C4407r f24540e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f24541f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4489d0 f24542g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2955ve f24543h;

    /* renamed from: i */
    private AsyncTask f24544i;

    public C4408s(Context context, C4571q4 q4Var, String str, vm0 vm0) {
        this.f24539d = context;
        this.f24536a = vm0;
        this.f24537b = q4Var;
        this.f24541f = new WebView(context);
        this.f24540e = new C4407r(context, str);
        mo17924I6(0);
        this.f24541f.setVerticalScrollBarEnabled(false);
        this.f24541f.getSettings().setJavaScriptEnabled(true);
        this.f24541f.setWebViewClient(new C4402m(this));
        this.f24541f.setOnTouchListener(new C4403n(this));
    }

    /* renamed from: O6 */
    static /* bridge */ /* synthetic */ String m29259O6(C4408s sVar, String str) {
        if (sVar.f24543h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = sVar.f24543h.mo14735a(parse, sVar.f24539d, (View) null, (Activity) null);
        } catch (C2992we e) {
            pm0.m18668h("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* renamed from: R6 */
    static /* bridge */ /* synthetic */ void m29262R6(C4408s sVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        sVar.f24539d.startActivity(intent);
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: H5 */
    public final boolean mo10845H5() throws RemoteException {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I6 */
    public final void mo17924I6(int i) {
        if (this.f24541f != null) {
            this.f24541f.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
        }
    }

    /* renamed from: J2 */
    public final void mo10846J2(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: M5 */
    public final void mo10847M5(C4571q4 q4Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: O0 */
    public final boolean mo10848O0() throws RemoteException {
        return false;
    }

    /* renamed from: R0 */
    public final void mo10849R0(C4541l4 l4Var, C4507g0 g0Var) {
    }

    /* renamed from: R2 */
    public final void mo10850R2(C4484c1 c1Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: S */
    public final void mo10851S() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: V */
    public final C4489d0 mo10853V() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) throws RemoteException {
        this.f24542g = d0Var;
    }

    /* renamed from: W */
    public final C4609x0 mo10855W() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    /* renamed from: X */
    public final C4509g2 mo10856X() {
        return null;
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: Z */
    public final C4527j2 mo10859Z() {
        return null;
    }

    /* renamed from: Z2 */
    public final boolean mo10860Z2(C4541l4 l4Var) throws RemoteException {
        C4141r.m28222l(this.f24541f, "This Search Ad has already been torn down");
        this.f24540e.mo17923f(l4Var, this.f24536a);
        this.f24544i = new C4406q(this, (C4405p) null).execute(new Void[0]);
        return true;
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() throws RemoteException {
        C4141r.m28216f("getAdFrame must be called on the main UI thread.");
        return C4956b.m31385o3(this.f24541f);
    }

    /* renamed from: b */
    public final Bundle mo10862b() {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final String mo17925b0() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) s00.f17167d.mo13438e());
        builder.appendQueryParameter("query", this.f24540e.mo17921d());
        builder.appendQueryParameter("pubId", this.f24540e.mo17920c());
        builder.appendQueryParameter("mappver", this.f24540e.mo17918a());
        Map e = this.f24540e.mo17922e();
        for (String str : e.keySet()) {
            builder.appendQueryParameter(str, (String) e.get(str));
        }
        Uri build = builder.build();
        C2955ve veVar = this.f24543h;
        if (veVar != null) {
            try {
                build = veVar.mo14736b(build, this.f24539d);
            } catch (C2992we e2) {
                pm0.m18668h("Unable to process ad data", e2);
            }
        }
        String h = mo17926h();
        String encodedQuery = build.getEncodedQuery();
        return h + "#" + encodedQuery;
    }

    /* renamed from: c */
    public final C4571q4 mo10863c() throws RemoteException {
        return this.f24537b;
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: d0 */
    public final String mo10866d0() throws RemoteException {
        return null;
    }

    /* renamed from: d1 */
    public final void mo10867d1(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: e0 */
    public final String mo10868e0() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    /* renamed from: e3 */
    public final void mo10869e3(i00 i00) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: g */
    public final String mo10870g() throws RemoteException {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo17926h() {
        String b = this.f24540e.mo17919b();
        if (true == TextUtils.isEmpty(b)) {
            b = "www.google.com";
        }
        return "https://" + b + ((String) s00.f17167d.mo13438e());
    }

    /* renamed from: h0 */
    public final void mo10871h0() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo17927i(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            C4584t.m30036b();
            return im0.m14418y(this.f24539d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: j0 */
    public final void mo10872j0() throws RemoteException {
        C4141r.m28216f("pause must be called on the main UI thread.");
    }

    /* renamed from: l0 */
    public final void mo10873l0() throws RemoteException {
        C4141r.m28216f("resume must be called on the main UI thread.");
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) {
    }

    /* renamed from: p4 */
    public final void mo10877p4(C4499e4 e4Var) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: q */
    public final void mo10878q() throws RemoteException {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        this.f24544i.cancel(true);
        this.f24538c.cancel(true);
        this.f24541f.destroy();
        this.f24541f = null;
    }

    /* renamed from: t3 */
    public final void mo10879t3(C4551n2 n2Var) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: w1 */
    public final void mo10880w1(nf0 nf0, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: x4 */
    public final void mo10881x4(C4491d2 d2Var) {
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: y6 */
    public final void mo10884y6(boolean z) throws RemoteException {
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
    }
}
