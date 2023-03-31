package com.startapp;

import android.content.Context;
import android.content.Intent;
import com.startapp.C9219p7;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9400b;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.v0 */
/* compiled from: Sta */
public abstract class C9592v0 extends C9400b {

    /* renamed from: g */
    public int f39269g = 0;

    /* renamed from: h */
    public Set<String> f39270h = new HashSet();

    /* renamed from: com.startapp.v0$a */
    /* compiled from: Sta */
    public class C9593a implements C8842b3<Throwable, Void> {
        public C9593a() {
        }

        /* renamed from: a */
        public Object mo29129a(Object obj) {
            Throwable th = (Throwable) obj;
            C9592v0.this.f38774f = th != null ? th.getMessage() : null;
            return null;
        }
    }

    public C9592v0(Context context, C9381Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement);
    }

    /* renamed from: a */
    public abstract void mo29446a(C9381Ad ad);

    /* renamed from: a */
    public boolean mo30339a(Object obj) {
        int i;
        GetAdResponse getAdResponse = (GetAdResponse) obj;
        boolean z = false;
        if (obj == null) {
            this.f38774f = "Empty Response";
            return false;
        } else if (!getAdResponse.mo30488b()) {
            this.f38774f = getAdResponse.mo30487a();
            return false;
        } else {
            JsonAd jsonAd = (JsonAd) this.f38770b;
            List<AdDetails> a = C8959g0.m48602a(this.f38769a, getAdResponse.mo30906d(), this.f39269g, this.f39270h, true);
            jsonAd.mo30511a(a);
            jsonAd.setAdInfoOverride(getAdResponse.mo30905c());
            if (getAdResponse.mo30906d() != null && getAdResponse.mo30906d().size() > 0) {
                z = true;
            }
            if (!z) {
                this.f38774f = "Empty Response";
            } else if (((ArrayList) a).size() == 0 && (i = this.f39269g) == 0) {
                this.f39269g = i + 1;
                return mo30658b();
            }
            return z;
        }
    }

    /* renamed from: e */
    public Object mo30660e() {
        C9219p7.C9220a aVar;
        GetAdRequest d = mo29447d();
        if (d == null) {
            return null;
        }
        if (this.f39270h.size() == 0) {
            this.f39270h.add(this.f38769a.getPackageName());
        }
        int i = this.f39269g;
        boolean z = false;
        if (i > 0) {
            d.f38898H0 = false;
        }
        d.f38894D0 = this.f39270h;
        if (i == 0) {
            z = true;
        }
        d.f38898H0 = z;
        C9654y3 l = ComponentLocator.m50248a(this.f38769a).mo31176l();
        Class cls = GetAdResponse.class;
        try {
            aVar = l.mo31383a(AdsConstants.m49678a(AdsConstants.AdApiType.JSON, this.f38773e), d, new C9593a());
        } catch (Throwable th) {
            if (l.mo31386a(1)) {
                C9023i4.m48681a(th);
            }
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        try {
            return C9065k5.m48755a(aVar.f38066b, cls);
        } catch (Throwable th2) {
            C9023i4.m48681a(th2);
            return null;
        }
    }

    /* renamed from: a */
    public void mo29470a(boolean z) {
        super.mo29470a(z);
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f38770b.hashCode());
        intent.putExtra("adResult", z);
        C8846b6.m48400a(this.f38769a).mo29213a(intent);
        if (z) {
            mo29446a((C9381Ad) (JsonAd) this.f38770b);
            C9055k.m48717b(this.f38769a, mo30656a(), this.f38770b, false);
        }
    }
}
