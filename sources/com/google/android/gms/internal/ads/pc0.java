package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p023c4.C1865f;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4584t;
import p087l4.C4929a;
import p087l4.C4934f;
import p087l4.C4936h;
import p087l4.C4939k;
import p087l4.C4940l;
import p087l4.C4941m;
import p087l4.C4943o;
import p087l4.C4945q;
import p087l4.C4946r;
import p087l4.C4948t;
import p087l4.C4949u;
import p087l4.C4950v;
import p087l4.C4953y;
import p088l5.C4954a;
import p088l5.C4956b;
import p179z3.C6322a0;
import p179z3.C6337h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class pc0 extends sb0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f15789a;

    /* renamed from: b */
    private rc0 f15790b;

    /* renamed from: c */
    private ai0 f15791c;

    /* renamed from: d */
    private C4954a f15792d;

    /* renamed from: e */
    private View f15793e;

    /* renamed from: f */
    private C4940l f15794f;

    /* renamed from: g */
    private C4950v f15795g;

    /* renamed from: h */
    private C4945q f15796h;

    /* renamed from: i */
    private C4939k f15797i;

    /* renamed from: r */
    private final String f15798r = "";

    public pc0(C4929a aVar) {
        this.f15789a = aVar;
    }

    /* renamed from: I6 */
    private final Bundle m18522I6(C4541l4 l4Var) {
        Bundle bundle;
        Bundle bundle2 = l4Var.f24901u;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f15789a.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: J6 */
    private final Bundle m18523J6(String str, C4541l4 l4Var, String str2) throws RemoteException {
        pm0.m18662b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f15789a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (l4Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", l4Var.f24895g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            pm0.m18665e("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: K6 */
    private static final boolean m18524K6(C4541l4 l4Var) {
        if (l4Var.f24894f) {
            return true;
        }
        C4584t.m30036b();
        return im0.m14412s();
    }

    /* renamed from: L6 */
    private static final String m18525L6(String str, C4541l4 l4Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return l4Var.f24885C;
        }
    }

    /* renamed from: A2 */
    public final void mo13218A2(C4954a aVar) throws RemoteException {
        if (this.f15789a instanceof C4929a) {
            pm0.m18662b("Show rewarded ad from adapter.");
            C4945q qVar = this.f15796h;
            if (qVar != null) {
                qVar.mo18788a((Context) C4956b.m31384P0(aVar));
            } else {
                pm0.m18664d("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C4929a.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: A3 */
    public final void mo13219A3(C4954a aVar, C4571q4 q4Var, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        C6337h hVar;
        Date date;
        C4571q4 q4Var2 = q4Var;
        C4541l4 l4Var2 = l4Var;
        String str3 = str;
        String str4 = str2;
        wb0 wb02 = wb0;
        Object obj = this.f15789a;
        if ((obj instanceof MediationBannerAdapter) || (obj instanceof C4929a)) {
            pm0.m18662b("Requesting banner ad from adapter.");
            if (q4Var2.f24985v) {
                hVar = C6322a0.m37263d(q4Var2.f24976e, q4Var2.f24973b);
            } else {
                hVar = C6322a0.m37262c(q4Var2.f24976e, q4Var2.f24973b, q4Var2.f24972a);
            }
            C6337h hVar2 = hVar;
            Object obj2 = this.f15789a;
            if (obj2 instanceof MediationBannerAdapter) {
                try {
                    MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                    List list = l4Var2.f24893e;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = l4Var2.f24890b;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    ic0 ic0 = new ic0(date, l4Var2.f24892d, hashSet, l4Var2.f24899s, m18524K6(l4Var), l4Var2.f24895g, l4Var2.f24906z, l4Var2.f24884B, m18525L6(str3, l4Var2));
                    Bundle bundle = l4Var2.f24901u;
                    mediationBannerAdapter.requestBannerAd((Context) C4956b.m31384P0(aVar), new rc0(wb02), m18523J6(str3, l4Var2, str4), hVar2, ic0, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    pm0.m18665e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C4929a) {
                try {
                    lc0 lc0 = new lc0(this, wb02);
                    Bundle J6 = m18523J6(str3, l4Var2, str4);
                    Bundle I6 = m18522I6(l4Var2);
                    boolean K6 = m18524K6(l4Var);
                    Location location = l4Var2.f24899s;
                    int i = l4Var2.f24895g;
                    int i2 = l4Var2.f24884B;
                    String L6 = m18525L6(str3, l4Var2);
                    String str5 = this.f15798r;
                    C4936h hVar3 = r2;
                    C4936h hVar4 = new C4936h((Context) C4956b.m31384P0(aVar), "", J6, I6, K6, location, i, i2, L6, hVar2, str5);
                    ((C4929a) obj2).loadBannerAd(hVar3, lc0);
                } catch (Throwable th2) {
                    pm0.m18665e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            pm0.m18667g(MediationBannerAdapter.class.getCanonicalName() + " or " + C4929a.class.getCanonicalName() + " #009 Class mismatch: " + this.f15789a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    /* renamed from: I */
    public final boolean mo13220I() throws RemoteException {
        if (this.f15789a instanceof C4929a) {
            return this.f15791c != null;
        }
        String canonicalName = C4929a.class.getCanonicalName();
        String canonicalName2 = this.f15789a.getClass().getCanonicalName();
        pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: K */
    public final void mo13221K() throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4934f) {
            try {
                ((C4934f) obj).onPause();
            } catch (Throwable th) {
                pm0.m18665e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: K4 */
    public final void mo13222K4(C4954a aVar) throws RemoteException {
        Object obj = this.f15789a;
        if (!(obj instanceof C4929a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C4929a.class.getCanonicalName();
            String canonicalName3 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        } else if (obj instanceof MediationInterstitialAdapter) {
            mo13245o();
        } else {
            pm0.m18662b("Show interstitial ad from adapter.");
            C4940l lVar = this.f15794f;
            if (lVar != null) {
                lVar.mo18787a((Context) C4956b.m31384P0(aVar));
            } else {
                pm0.m18664d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
    }

    /* renamed from: N4 */
    public final void mo13223N4(C4954a aVar, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        String str2 = str;
        if (this.f15789a instanceof C4929a) {
            pm0.m18662b("Requesting rewarded interstitial ad from adapter.");
            try {
                oc0 oc0 = new oc0(this, wb0);
                Bundle J6 = m18523J6(str2, l4Var2, (String) null);
                Bundle I6 = m18522I6(l4Var2);
                boolean K6 = m18524K6(l4Var);
                Location location = l4Var2.f24899s;
                int i = l4Var2.f24895g;
                int i2 = l4Var2.f24884B;
                String L6 = m18525L6(str2, l4Var2);
                C4946r rVar = r5;
                C4946r rVar2 = new C4946r((Context) C4956b.m31384P0(aVar), "", J6, I6, K6, location, i, i2, L6, "");
                ((C4929a) this.f15789a).loadRewardedInterstitialAd(rVar, oc0);
            } catch (Exception e) {
                pm0.m18665e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C4929a.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: P3 */
    public final void mo13224P3(C4954a aVar, C4541l4 l4Var, String str, ai0 ai0, String str2) throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4929a) {
            this.f15792d = aVar;
            this.f15791c = ai0;
            ai0.mo8252s0(C4956b.m31385o3(obj));
            return;
        }
        String canonicalName = C4929a.class.getCanonicalName();
        String canonicalName2 = this.f15789a.getClass().getCanonicalName();
        pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: S3 */
    public final void mo13225S3(C4541l4 l4Var, String str, String str2) throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4929a) {
            mo13241k2(this.f15792d, l4Var, str, new sc0((C4929a) obj, this.f15791c));
            return;
        }
        String canonicalName = C4929a.class.getCanonicalName();
        String canonicalName2 = this.f15789a.getClass().getCanonicalName();
        pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        throw new RemoteException();
    }

    /* renamed from: T */
    public final Bundle mo13226T() {
        Object obj = this.f15789a;
        if (obj instanceof zzcol) {
            return ((zzcol) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzcol.class.getCanonicalName();
        String canonicalName2 = this.f15789a.getClass().getCanonicalName();
        pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        return new Bundle();
    }

    /* renamed from: U */
    public final C4527j2 mo13227U() {
        Object obj = this.f15789a;
        if (obj instanceof C4953y) {
            try {
                return ((C4953y) obj).getVideoController();
            } catch (Throwable th) {
                pm0.m18665e("", th);
            }
        }
        return null;
    }

    /* renamed from: V */
    public final j30 mo13228V() {
        rc0 rc0 = this.f15790b;
        if (rc0 == null) {
            return null;
        }
        C1865f t = rc0.mo13776t();
        if (t instanceof k30) {
            return ((k30) t).mo11558b();
        }
        return null;
    }

    /* renamed from: W */
    public final zb0 mo13229W() {
        C4939k kVar = this.f15797i;
        if (kVar != null) {
            return new qc0(kVar);
        }
        return null;
    }

    /* renamed from: W0 */
    public final void mo13230W0(C4954a aVar, C4571q4 q4Var, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        C4571q4 q4Var2 = q4Var;
        C4541l4 l4Var2 = l4Var;
        String str3 = str;
        if (this.f15789a instanceof C4929a) {
            pm0.m18662b("Requesting interscroller ad from adapter.");
            try {
                C4929a aVar2 = (C4929a) this.f15789a;
                jc0 jc0 = new jc0(this, wb0, aVar2);
                Bundle J6 = m18523J6(str3, l4Var2, str2);
                Bundle I6 = m18522I6(l4Var2);
                boolean K6 = m18524K6(l4Var);
                Location location = l4Var2.f24899s;
                int i = l4Var2.f24895g;
                int i2 = l4Var2.f24884B;
                String L6 = m18525L6(str3, l4Var2);
                C6337h e = C6322a0.m37264e(q4Var2.f24976e, q4Var2.f24973b);
                C4936h hVar = r6;
                C4936h hVar2 = new C4936h((Context) C4956b.m31384P0(aVar), "", J6, I6, K6, location, i, i2, L6, e, "");
                aVar2.loadInterscrollerAd(hVar, jc0);
            } catch (Exception e2) {
                pm0.m18665e("", e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C4929a.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: X */
    public final fc0 mo13231X() {
        C4950v vVar;
        C4950v u;
        Object obj = this.f15789a;
        if (obj instanceof MediationNativeAdapter) {
            rc0 rc0 = this.f15790b;
            if (rc0 == null || (u = rc0.mo13777u()) == null) {
                return null;
            }
            return new uc0(u);
        } else if (!(obj instanceof C4929a) || (vVar = this.f15795g) == null) {
            return null;
        } else {
            return new uc0(vVar);
        }
    }

    /* renamed from: Y */
    public final void mo13232Y() throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4934f) {
            try {
                ((C4934f) obj).onDestroy();
            } catch (Throwable th) {
                pm0.m18665e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: Z */
    public final wd0 mo13233Z() {
        Object obj = this.f15789a;
        if (!(obj instanceof C4929a)) {
            return null;
        }
        return wd0.m22704I1(((C4929a) obj).getVersionInfo());
    }

    /* renamed from: a */
    public final Bundle mo13234a() {
        Object obj = this.f15789a;
        if (obj instanceof zzcok) {
            return ((zzcok) obj).zza();
        }
        String canonicalName = zzcok.class.getCanonicalName();
        String canonicalName2 = this.f15789a.getClass().getCanonicalName();
        pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
        return new Bundle();
    }

    /* renamed from: a0 */
    public final C4954a mo13235a0() throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return C4956b.m31385o3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                pm0.m18665e("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof C4929a) {
            return C4956b.m31385o3(this.f15793e);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = C4929a.class.getCanonicalName();
            String canonicalName3 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    /* renamed from: c */
    public final Bundle mo13236c() {
        return new Bundle();
    }

    /* renamed from: c0 */
    public final wd0 mo13237c0() {
        Object obj = this.f15789a;
        if (!(obj instanceof C4929a)) {
            return null;
        }
        return wd0.m22704I1(((C4929a) obj).getSDKVersionInfo());
    }

    /* renamed from: c2 */
    public final void mo13238c2(C4954a aVar) throws RemoteException {
        Context context = (Context) C4956b.m31384P0(aVar);
        Object obj = this.f15789a;
        if (obj instanceof C4948t) {
            ((C4948t) obj).mo18789a(context);
        }
    }

    /* renamed from: f4 */
    public final void mo13239f4(boolean z) throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4949u) {
            try {
                ((C4949u) obj).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                pm0.m18665e("", th);
            }
        } else {
            String canonicalName = C4949u.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18662b(canonicalName + " #009 Class mismatch: " + canonicalName2);
        }
    }

    /* renamed from: k0 */
    public final void mo13240k0() throws RemoteException {
        Object obj = this.f15789a;
        if (obj instanceof C4934f) {
            try {
                ((C4934f) obj).onResume();
            } catch (Throwable th) {
                pm0.m18665e("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: k2 */
    public final void mo13241k2(C4954a aVar, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        C4541l4 l4Var2 = l4Var;
        String str2 = str;
        if (this.f15789a instanceof C4929a) {
            pm0.m18662b("Requesting rewarded ad from adapter.");
            try {
                oc0 oc0 = new oc0(this, wb0);
                Bundle J6 = m18523J6(str2, l4Var2, (String) null);
                Bundle I6 = m18522I6(l4Var2);
                boolean K6 = m18524K6(l4Var);
                Location location = l4Var2.f24899s;
                int i = l4Var2.f24895g;
                int i2 = l4Var2.f24884B;
                String L6 = m18525L6(str2, l4Var2);
                C4946r rVar = r5;
                C4946r rVar2 = new C4946r((Context) C4956b.m31384P0(aVar), "", J6, I6, K6, location, i, i2, L6, "");
                ((C4929a) this.f15789a).loadRewardedAd(rVar, oc0);
            } catch (Exception e) {
                pm0.m18665e("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = C4929a.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: m */
    public final cc0 mo13242m() {
        return null;
    }

    /* renamed from: m4 */
    public final void mo13243m4(C4954a aVar, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        mo13251v1(aVar, l4Var, str, (String) null, wb0);
    }

    /* renamed from: n3 */
    public final void mo13244n3(C4541l4 l4Var, String str) throws RemoteException {
        mo13225S3(l4Var, str, (String) null);
    }

    /* renamed from: o */
    public final void mo13245o() throws RemoteException {
        if (this.f15789a instanceof MediationInterstitialAdapter) {
            pm0.m18662b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f15789a).showInterstitial();
            } catch (Throwable th) {
                pm0.m18665e("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: q2 */
    public final void mo13246q2(C4954a aVar, C4571q4 q4Var, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        mo13219A3(aVar, q4Var, l4Var, str, (String) null, wb0);
    }

    /* renamed from: r */
    public final boolean mo13247r() {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: r5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13248r5(p088l5.C4954a r9, com.google.android.gms.internal.ads.w70 r10, java.util.List r11) throws android.os.RemoteException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f15789a
            boolean r0 = r0 instanceof p087l4.C4929a
            if (r0 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.kc0 r0 = new com.google.android.gms.internal.ads.kc0
            r0.<init>(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0014:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r11.next()
            com.google.android.gms.internal.ads.d80 r1 = (com.google.android.gms.internal.ads.d80) r1
            java.lang.String r2 = r1.f8131a
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L_0x0056;
                case -1052618729: goto L_0x004c;
                case -239580146: goto L_0x0042;
                case 604727084: goto L_0x0038;
                case 1911491517: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0060
        L_0x002e:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 3
            goto L_0x0061
        L_0x0038:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0042:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 4
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0060
            r2 = 0
            goto L_0x0061
        L_0x0060:
            r2 = -1
        L_0x0061:
            if (r2 == 0) goto L_0x0079
            if (r2 == r7) goto L_0x0076
            if (r2 == r6) goto L_0x0073
            if (r2 == r5) goto L_0x0070
            if (r2 == r4) goto L_0x006d
            r2 = 0
            goto L_0x007b
        L_0x006d:
            z3.b r2 = p179z3.C6323b.NATIVE
            goto L_0x007b
        L_0x0070:
            z3.b r2 = p179z3.C6323b.REWARDED_INTERSTITIAL
            goto L_0x007b
        L_0x0073:
            z3.b r2 = p179z3.C6323b.REWARDED
            goto L_0x007b
        L_0x0076:
            z3.b r2 = p179z3.C6323b.INTERSTITIAL
            goto L_0x007b
        L_0x0079:
            z3.b r2 = p179z3.C6323b.BANNER
        L_0x007b:
            if (r2 == 0) goto L_0x0014
            l4.j r3 = new l4.j
            android.os.Bundle r1 = r1.f8132b
            r3.<init>(r2, r1)
            r10.add(r3)
            goto L_0x0014
        L_0x0088:
            java.lang.Object r11 = r8.f15789a
            l4.a r11 = (p087l4.C4929a) r11
            java.lang.Object r9 = p088l5.C4956b.m31384P0(r9)
            android.content.Context r9 = (android.content.Context) r9
            r11.initialize(r9, r0, r10)
            return
        L_0x0096:
            android.os.RemoteException r9 = new android.os.RemoteException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pc0.mo13248r5(l5.a, com.google.android.gms.internal.ads.w70, java.util.List):void");
    }

    /* renamed from: s2 */
    public final void mo13249s2(C4954a aVar, ai0 ai0, List list) throws RemoteException {
        pm0.m18667g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    /* renamed from: u */
    public final void mo13250u() throws RemoteException {
        if (this.f15789a instanceof C4929a) {
            C4945q qVar = this.f15796h;
            if (qVar != null) {
                qVar.mo18788a((Context) C4956b.m31384P0(this.f15792d));
            } else {
                pm0.m18664d("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = C4929a.class.getCanonicalName();
            String canonicalName2 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " #009 Class mismatch: " + canonicalName2);
            throw new RemoteException();
        }
    }

    /* renamed from: v1 */
    public final void mo13251v1(C4954a aVar, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        Date date;
        C4541l4 l4Var2 = l4Var;
        String str3 = str;
        String str4 = str2;
        wb0 wb02 = wb0;
        Object obj = this.f15789a;
        if ((obj instanceof MediationInterstitialAdapter) || (obj instanceof C4929a)) {
            pm0.m18662b("Requesting interstitial ad from adapter.");
            Object obj2 = this.f15789a;
            if (obj2 instanceof MediationInterstitialAdapter) {
                try {
                    MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                    List list = l4Var2.f24893e;
                    HashSet hashSet = list != null ? new HashSet(list) : null;
                    long j = l4Var2.f24890b;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    ic0 ic0 = new ic0(date, l4Var2.f24892d, hashSet, l4Var2.f24899s, m18524K6(l4Var), l4Var2.f24895g, l4Var2.f24906z, l4Var2.f24884B, m18525L6(str3, l4Var2));
                    Bundle bundle = l4Var2.f24901u;
                    mediationInterstitialAdapter.requestInterstitialAd((Context) C4956b.m31384P0(aVar), new rc0(wb02), m18523J6(str3, l4Var2, str4), ic0, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                } catch (Throwable th) {
                    pm0.m18665e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C4929a) {
                try {
                    ((C4929a) obj2).loadInterstitialAd(new C4941m((Context) C4956b.m31384P0(aVar), "", m18523J6(str3, l4Var2, str4), m18522I6(l4Var2), m18524K6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m18525L6(str3, l4Var2), this.f15798r), new mc0(this, wb02));
                } catch (Throwable th2) {
                    pm0.m18665e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = C4929a.class.getCanonicalName();
            String canonicalName3 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    /* renamed from: y */
    public final bc0 mo13252y() {
        return null;
    }

    /* renamed from: z1 */
    public final void mo13253z1(C4954a aVar, C4541l4 l4Var, String str, String str2, wb0 wb0, f20 f20, List list) throws RemoteException {
        Date date;
        C4541l4 l4Var2 = l4Var;
        String str3 = str;
        String str4 = str2;
        wb0 wb02 = wb0;
        Object obj = this.f15789a;
        if ((obj instanceof MediationNativeAdapter) || (obj instanceof C4929a)) {
            pm0.m18662b("Requesting native ad from adapter.");
            Object obj2 = this.f15789a;
            if (obj2 instanceof MediationNativeAdapter) {
                try {
                    MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                    List list2 = l4Var2.f24893e;
                    HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                    long j = l4Var2.f24890b;
                    if (j == -1) {
                        date = null;
                    } else {
                        date = new Date(j);
                    }
                    tc0 tc0 = new tc0(date, l4Var2.f24892d, hashSet, l4Var2.f24899s, m18524K6(l4Var), l4Var2.f24895g, f20, list, l4Var2.f24906z, l4Var2.f24884B, m18525L6(str3, l4Var2));
                    Bundle bundle = l4Var2.f24901u;
                    Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                    this.f15790b = new rc0(wb02);
                    mediationNativeAdapter.requestNativeAd((Context) C4956b.m31384P0(aVar), this.f15790b, m18523J6(str3, l4Var2, str4), tc0, bundle2);
                } catch (Throwable th) {
                    pm0.m18665e("", th);
                    throw new RemoteException();
                }
            } else if (obj2 instanceof C4929a) {
                try {
                    ((C4929a) obj2).loadNativeAd(new C4943o((Context) C4956b.m31384P0(aVar), "", m18523J6(str3, l4Var2, str4), m18522I6(l4Var2), m18524K6(l4Var), l4Var2.f24899s, l4Var2.f24895g, l4Var2.f24884B, m18525L6(str3, l4Var2), this.f15798r, f20), new nc0(this, wb02));
                } catch (Throwable th2) {
                    pm0.m18665e("", th2);
                    throw new RemoteException();
                }
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = C4929a.class.getCanonicalName();
            String canonicalName3 = this.f15789a.getClass().getCanonicalName();
            pm0.m18667g(canonicalName + " or " + canonicalName2 + " #009 Class mismatch: " + canonicalName3);
            throw new RemoteException();
        }
    }

    public pc0(C4934f fVar) {
        this.f15789a = fVar;
    }
}
