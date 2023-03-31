package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4584t;
import p087l4.C4936h;
import p087l4.C4940l;
import p087l4.C4941m;
import p087l4.C4943o;
import p087l4.C4945q;
import p087l4.C4946r;
import p087l4.C4953y;
import p088l5.C4954a;
import p088l5.C4956b;
import p179z3.C6322a0;
import p179z3.C6337h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class vd0 extends jd0 {

    /* renamed from: a */
    private final RtbAdapter f19066a;

    /* renamed from: b */
    private C4940l f19067b;

    /* renamed from: c */
    private C4945q f19068c;

    /* renamed from: d */
    private String f19069d = "";

    public vd0(RtbAdapter rtbAdapter) {
        this.f19066a = rtbAdapter;
    }

    /* renamed from: J6 */
    private final Bundle m22161J6(C4541l4 l4Var) {
        Bundle bundle;
        Bundle bundle2 = l4Var.f24901u;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f19066a.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: K6 */
    private static final Bundle m22162K6(String str) throws RemoteException {
        pm0.m18667g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            pm0.m18665e("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: L6 */
    private static final boolean m22163L6(C4541l4 l4Var) {
        if (l4Var.f24894f) {
            return true;
        }
        C4584t.m30036b();
        return im0.m14412s();
    }

    /* renamed from: M6 */
    private static final String m22164M6(String str, C4541l4 l4Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return l4Var.f24885C;
        }
    }

    /* renamed from: A */
    public final void mo11083A(String str) {
        this.f19069d = str;
    }

    /* renamed from: O3 */
    public final void mo11084O3(String str, String str2, C4541l4 l4Var, C4954a aVar, hd0 hd0, wb0 wb0) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        try {
            this.f19066a.loadRtbRewardedAd(new C4946r((Context) C4956b.m31384P0(aVar), str, m22162K6(str2), m22161J6(l4Var2), m22163L6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m22164M6(str2, l4Var), this.f19069d), new ud0(this, hd0, wb0));
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: P */
    public final boolean mo11085P(C4954a aVar) throws RemoteException {
        C4945q qVar = this.f19068c;
        if (qVar == null) {
            return false;
        }
        try {
            qVar.mo18788a((Context) C4956b.m31384P0(aVar));
            return true;
        } catch (Throwable th) {
            pm0.m18665e("", th);
            return true;
        }
    }

    /* renamed from: T */
    public final wd0 mo11086T() throws RemoteException {
        return wd0.m22704I1(this.f19066a.getVersionInfo());
    }

    /* renamed from: Z1 */
    public final void mo11087Z1(String str, String str2, C4541l4 l4Var, C4954a aVar, dd0 dd0, wb0 wb0) throws RemoteException {
        mo11094i3(str, str2, l4Var, aVar, dd0, wb0, (f20) null);
    }

    /* renamed from: a */
    public final C4527j2 mo11088a() {
        RtbAdapter rtbAdapter = this.f19066a;
        if (rtbAdapter instanceof C4953y) {
            try {
                return ((C4953y) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                pm0.m18665e("", th);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final wd0 mo11089c() throws RemoteException {
        return wd0.m22704I1(this.f19066a.getSDKVersionInfo());
    }

    /* renamed from: f1 */
    public final void mo11090f1(String str, String str2, C4541l4 l4Var, C4954a aVar, ad0 ad0, wb0 wb0) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        try {
            this.f19066a.loadRtbInterstitialAd(new C4941m((Context) C4956b.m31384P0(aVar), str, m22162K6(str2), m22161J6(l4Var2), m22163L6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m22164M6(str2, l4Var), this.f19069d), new rd0(this, ad0, wb0));
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: f6 */
    public final void mo11091f6(String str, String str2, C4541l4 l4Var, C4954a aVar, hd0 hd0, wb0 wb0) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        try {
            this.f19066a.loadRtbRewardedInterstitialAd(new C4946r((Context) C4956b.m31384P0(aVar), str, m22162K6(str2), m22161J6(l4Var2), m22163L6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m22164M6(str2, l4Var), this.f19069d), new ud0(this, hd0, wb0));
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: g5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11092g5(p088l5.C4954a r8, java.lang.String r9, android.os.Bundle r10, android.os.Bundle r11, p060h4.C4571q4 r12, com.google.android.gms.internal.ads.nd0 r13) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.td0 r0 = new com.google.android.gms.internal.ads.td0     // Catch:{ all -> 0x008c }
            r0.<init>(r7, r13)     // Catch:{ all -> 0x008c }
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r13 = r7.f19066a     // Catch:{ all -> 0x008c }
            l4.j r1 = new l4.j     // Catch:{ all -> 0x008c }
            int r2 = r9.hashCode()     // Catch:{ all -> 0x008c }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1396342996: goto L_0x003d;
                case -1052618729: goto L_0x0033;
                case -239580146: goto L_0x0029;
                case 604727084: goto L_0x001f;
                case 1911491517: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0047
        L_0x0015:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 3
            goto L_0x0048
        L_0x001f:
            java.lang.String r2 = "interstitial"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0029:
            java.lang.String r2 = "rewarded"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r2 = "native"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 4
            goto L_0x0048
        L_0x003d:
            java.lang.String r2 = "banner"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0047
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = -1
        L_0x0048:
            if (r9 == 0) goto L_0x0066
            if (r9 == r6) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            if (r9 != r3) goto L_0x0055
            z3.b r9 = p179z3.C6323b.NATIVE     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0055:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008c }
            java.lang.String r9 = "Internal Error"
            r8.<init>(r9)     // Catch:{ all -> 0x008c }
            throw r8     // Catch:{ all -> 0x008c }
        L_0x005d:
            z3.b r9 = p179z3.C6323b.REWARDED_INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0060:
            z3.b r9 = p179z3.C6323b.REWARDED     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0063:
            z3.b r9 = p179z3.C6323b.INTERSTITIAL     // Catch:{ all -> 0x008c }
            goto L_0x0068
        L_0x0066:
            z3.b r9 = p179z3.C6323b.BANNER     // Catch:{ all -> 0x008c }
        L_0x0068:
            r1.<init>(r9, r11)     // Catch:{ all -> 0x008c }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x008c }
            r9.<init>()     // Catch:{ all -> 0x008c }
            r9.add(r1)     // Catch:{ all -> 0x008c }
            n4.a r11 = new n4.a     // Catch:{ all -> 0x008c }
            java.lang.Object r8 = p088l5.C4956b.m31384P0(r8)     // Catch:{ all -> 0x008c }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x008c }
            int r1 = r12.f24976e     // Catch:{ all -> 0x008c }
            int r2 = r12.f24973b     // Catch:{ all -> 0x008c }
            java.lang.String r12 = r12.f24972a     // Catch:{ all -> 0x008c }
            z3.h r12 = p179z3.C6322a0.m37262c(r1, r2, r12)     // Catch:{ all -> 0x008c }
            r11.<init>(r8, r9, r10, r12)     // Catch:{ all -> 0x008c }
            r13.collectSignals(r11, r0)     // Catch:{ all -> 0x008c }
            return
        L_0x008c:
            r8 = move-exception
            java.lang.String r9 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.pm0.m18665e(r9, r8)
            android.os.RemoteException r8 = new android.os.RemoteException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vd0.mo11092g5(l5.a, java.lang.String, android.os.Bundle, android.os.Bundle, h4.q4, com.google.android.gms.internal.ads.nd0):void");
    }

    /* renamed from: h1 */
    public final void mo11093h1(String str, String str2, C4541l4 l4Var, C4954a aVar, xc0 xc0, wb0 wb0, C4571q4 q4Var) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        C4571q4 q4Var2 = q4Var;
        try {
            qd0 qd0 = new qd0(this, xc0, wb0);
            RtbAdapter rtbAdapter = this.f19066a;
            Bundle K6 = m22162K6(str2);
            Bundle J6 = m22161J6(l4Var2);
            boolean L6 = m22163L6(l4Var);
            Location location = l4Var2.f24899s;
            int i = l4Var2.f24895g;
            int i2 = l4Var2.f24884B;
            String M6 = m22164M6(str2, l4Var);
            C6337h c = C6322a0.m37262c(q4Var2.f24976e, q4Var2.f24973b, q4Var2.f24972a);
            String str3 = this.f19069d;
            C4936h hVar = r5;
            C4936h hVar2 = new C4936h((Context) C4956b.m31384P0(aVar), str, K6, J6, L6, location, i, i2, M6, c, str3);
            rtbAdapter.loadRtbInterscrollerAd(hVar, qd0);
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: i3 */
    public final void mo11094i3(String str, String str2, C4541l4 l4Var, C4954a aVar, dd0 dd0, wb0 wb0, f20 f20) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        try {
            sd0 sd0 = new sd0(this, dd0, wb0);
            RtbAdapter rtbAdapter = this.f19066a;
            C4943o oVar = r4;
            C4943o oVar2 = new C4943o((Context) C4956b.m31384P0(aVar), str, m22162K6(str2), m22161J6(l4Var2), m22163L6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m22164M6(str2, l4Var), this.f19069d, f20);
            rtbAdapter.loadRtbNativeAd(oVar, sd0);
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: k1 */
    public final void mo11095k1(String str, String str2, C4541l4 l4Var, C4954a aVar, xc0 xc0, wb0 wb0, C4571q4 q4Var) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        C4571q4 q4Var2 = q4Var;
        try {
            pd0 pd0 = new pd0(this, xc0, wb0);
            RtbAdapter rtbAdapter = this.f19066a;
            Bundle K6 = m22162K6(str2);
            Bundle J6 = m22161J6(l4Var2);
            boolean L6 = m22163L6(l4Var);
            Location location = l4Var2.f24899s;
            int i = l4Var2.f24895g;
            int i2 = l4Var2.f24884B;
            String M6 = m22164M6(str2, l4Var);
            C6337h c = C6322a0.m37262c(q4Var2.f24976e, q4Var2.f24973b, q4Var2.f24972a);
            String str3 = this.f19069d;
            C4936h hVar = r5;
            C4936h hVar2 = new C4936h((Context) C4956b.m31384P0(aVar), str, K6, J6, L6, location, i, i2, M6, c, str3);
            rtbAdapter.loadRtbBannerAd(hVar, pd0);
        } catch (Throwable th) {
            pm0.m18665e("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: r4 */
    public final boolean mo11096r4(C4954a aVar) throws RemoteException {
        C4940l lVar = this.f19067b;
        if (lVar == null) {
            return false;
        }
        try {
            lVar.mo18787a((Context) C4956b.m31384P0(aVar));
            return true;
        } catch (Throwable th) {
            pm0.m18665e("", th);
            return true;
        }
    }
}
