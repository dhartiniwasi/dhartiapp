package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public abstract class JsonAd extends C9381Ad {
    private static final long serialVersionUID = 1;
    private List<AdDetails> adsDetails = null;

    public JsonAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* renamed from: a */
    public void mo30511a(List<AdDetails> list) {
        this.adsDetails = list;
        Long l = null;
        for (AdDetails next : list) {
            if (!(next == null || next.mo30853x() == null)) {
                if (l == null || next.mo30853x().longValue() < l.longValue()) {
                    l = next.mo30853x();
                }
            }
        }
        if (l != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l.longValue()));
        }
        boolean z = true;
        Iterator<AdDetails> it = this.adsDetails.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().mo30841n()) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        this.belowMinCPM = z;
    }

    /* renamed from: g */
    public List<AdDetails> mo30512g() {
        return this.adsDetails;
    }

    public String getAdId() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).mo30827a();
    }

    public String getBidToken() {
        List<AdDetails> list = this.adsDetails;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.adsDetails.get(0).mo30830d();
    }

    public String getDParam() {
        List<AdDetails> list = this.adsDetails;
        if (list == null) {
            return null;
        }
        try {
            String str = null;
            for (AdDetails next : list) {
                try {
                    if (next != null) {
                        String g = next.mo30834g();
                        String[] u = next.mo30849u();
                        str = C9396a.m49774a(g, (u == null || u.length <= 0) ? null : u[0]);
                        if (str != null) {
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return str;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
