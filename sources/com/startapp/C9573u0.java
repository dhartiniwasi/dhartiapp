package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.C9219p7;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9400b;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.u0 */
/* compiled from: Sta */
public abstract class C9573u0 extends C9400b {

    /* renamed from: g */
    public Set<String> f39231g = new HashSet();

    /* renamed from: h */
    public Set<String> f39232h = new HashSet();

    /* renamed from: i */
    public GetAdRequest f39233i;

    /* renamed from: j */
    public int f39234j = 0;

    /* renamed from: k */
    public final boolean f39235k;

    /* renamed from: l */
    public C9141n f39236l;

    /* renamed from: com.startapp.u0$a */
    /* compiled from: Sta */
    public class C9574a implements C8842b3<Throwable, Void> {
        public C9574a() {
        }

        /* renamed from: a */
        public Object mo29129a(Object obj) {
            Throwable th = (Throwable) obj;
            C9573u0.this.f38774f = th != null ? th.getMessage() : null;
            return null;
        }
    }

    public C9573u0(Context context, C9381Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean z) {
        super(context, ad, adPreferences, adEventListener, placement);
        this.f39235k = z;
    }

    /* renamed from: a */
    public boolean mo30339a(Object obj) {
        if (obj == null) {
            if (this.f38774f == null) {
                this.f38774f = "No response";
            }
            return false;
        } else if (!(obj instanceof C9219p7.C9220a)) {
            if (this.f38774f == null) {
                this.f38774f = "Unknown error";
            }
            return false;
        } else {
            C9219p7.C9220a aVar = (C9219p7.C9220a) obj;
            String str = aVar.f38066b;
            try {
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(str)) {
                    if (this.f38774f == null) {
                        GetAdRequest getAdRequest = this.f39233i;
                        if (getAdRequest == null || !getAdRequest.mo30903b()) {
                            this.f38774f = "Empty Ad";
                        } else {
                            this.f38774f = "Video isn't available";
                        }
                    }
                    return false;
                }
                boolean H = AdsCommonMetaData.f38625h.mo30446H();
                String a = C9605vb.m50452a(str, "@adId@", "@adId@");
                if (a != null && a.length() > 0) {
                    this.f39236l = new C9141n(a, aVar, this.f39235k, H);
                }
                List<AppPresenceDetails> a2 = C8959g0.m48603a(str, this.f39234j);
                boolean z = H && C8959g0.m48601a(this.f38769a, a2, this.f39234j, this.f39231g, (List<AppPresenceDetails>) arrayList).booleanValue();
                C9141n nVar = this.f39236l;
                if (nVar != null) {
                    nVar.f37320f = z;
                }
                if (z) {
                    new C8939f0(this.f38769a, arrayList).mo29345a();
                } else {
                    HtmlAd htmlAd = (HtmlAd) this.f38770b;
                    htmlAd.mo30492a(a2);
                    htmlAd.setRequestUrl(aVar.f38065a);
                    htmlAd.mo30294c(str);
                }
                C9141n nVar2 = this.f39236l;
                if (nVar2 != null) {
                    nVar2.f37321g = C9605vb.m50443a();
                }
                if (!z) {
                    return true;
                }
                mo31303f();
                this.f39234j++;
                return mo30658b();
            } catch (Throwable th) {
                C9023i4.m48681a(th);
                return false;
            }
        }
    }

    /* renamed from: b */
    public void mo30341b(boolean z) {
        this.f38770b.setState(z ? C9381Ad.AdState.READY : C9381Ad.AdState.UN_INITIALIZED);
    }

    /* renamed from: b */
    public boolean mo30342b(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    /* renamed from: c */
    public void mo31302c(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f38770b.hashCode());
        intent.putExtra("adResult", z);
        C8846b6.m48400a(this.f38769a).mo29213a(intent);
        if (!z) {
            C9055k.m48716a(this.f38769a, mo30656a(), this.f38770b, false);
            mo31303f();
        } else if (this.f39235k) {
            C9141n nVar = this.f39236l;
            if (nVar != null) {
                nVar.f37322h = C9605vb.m50443a();
            }
            ComponentLocator.m50248a(this.f38769a).f39034b.mo29904a().mo29624a(((HtmlAd) this.f38770b).mo30499j(), new C9575b());
        } else {
            C9055k.m48717b(this.f38769a, mo30656a(), this.f38770b, false);
            mo31303f();
        }
    }

    /* renamed from: e */
    public Object mo30660e() {
        GetAdRequest d = mo29447d();
        this.f39233i = d;
        if (!mo30342b(d)) {
            return null;
        }
        if (this.f39231g.size() == 0) {
            this.f39231g.add(this.f38769a.getPackageName());
        }
        GetAdRequest getAdRequest = this.f39233i;
        getAdRequest.f38894D0 = this.f39231g;
        getAdRequest.f38896F0 = this.f39232h;
        if (this.f39234j > 0) {
            getAdRequest.f38898H0 = false;
            if (MetaData.f38952k.mo30994J().mo31128a(this.f38769a)) {
                SimpleTokenUtils.m49714e(this.f38769a);
            }
        }
        C9654y3 l = ComponentLocator.m50248a(this.f38769a).mo31176l();
        try {
            return l.mo31383a(AdsConstants.m49678a(AdsConstants.AdApiType.HTML, this.f38773e), this.f39233i, new C9574a());
        } catch (Throwable th) {
            if (!l.mo31386a(1)) {
                return null;
            }
            C9023i4.m48681a(th);
            return null;
        }
    }

    /* renamed from: f */
    public final void mo31303f() {
        C9141n nVar = this.f39236l;
        if (nVar != null) {
            try {
                ComponentLocator.m50248a(this.f38769a).f39027G.mo29904a().mo29678a(nVar);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            this.f39236l = null;
        }
    }

    /* renamed from: com.startapp.u0$b */
    /* compiled from: Sta */
    public class C9575b implements C9605vb.C9606a {
        public C9575b() {
        }

        /* renamed from: a */
        public void mo29864a(boolean z, long j, long j2, boolean z2) {
            C9573u0 u0Var = C9573u0.this;
            C9055k.m48717b(u0Var.f38769a, u0Var.mo30656a(), C9573u0.this.f38770b, false);
            C9573u0 u0Var2 = C9573u0.this;
            C9141n nVar = u0Var2.f39236l;
            if (nVar != null) {
                nVar.f37319e = z;
                nVar.f37323i = j;
                nVar.f37324j = j2;
                nVar.f37326l = z2;
                u0Var2.mo31303f();
            }
        }

        /* renamed from: a */
        public void mo29863a(int i, String str) {
            C9573u0.this.f38770b.setErrorMessage(str);
            C9573u0 u0Var = C9573u0.this;
            C9055k.m48716a(u0Var.f38769a, u0Var.mo30656a(), C9573u0.this.f38770b, false);
            C9573u0 u0Var2 = C9573u0.this;
            C9141n nVar = u0Var2.f39236l;
            if (nVar != null) {
                nVar.f37325k = i;
                u0Var2.mo31303f();
            }
        }
    }
}
