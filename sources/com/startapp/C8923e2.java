package com.startapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.ads.AdSDKNotificationListener;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.e2 */
/* compiled from: Sta */
public final class C8923e2 implements C9450c {

    /* renamed from: a */
    public final Context f36716a;

    /* renamed from: b */
    public final C9441e f36717b;

    /* renamed from: c */
    public Intent f36718c;

    /* renamed from: d */
    public boolean f36719d = false;

    /* renamed from: e */
    public boolean f36720e = true;

    public C8923e2(Context context, C9441e eVar) {
        this.f36716a = context;
        this.f36717b = eVar;
    }

    /* renamed from: a */
    public void mo29321a(Integer num, Long l, Boolean bool, boolean z, boolean z2) {
        if (mo29325d()) {
            long j = this.f36717b.getLong("consentTimestamp", 0);
            int i = this.f36717b.getInt("consentType", -1);
            boolean contains = this.f36717b.contains("consentApc");
            boolean z3 = true;
            boolean z4 = (num == null || i == num.intValue()) ? false : true;
            boolean z5 = bool != null && (!contains || this.f36717b.getBoolean("consentApc", false) != bool.booleanValue());
            if (l == null || l.longValue() <= j) {
                z3 = false;
            }
            if (!z && !z3) {
                return;
            }
            if (z4 || z5) {
                C9441e.C9442a a = this.f36717b.edit();
                if (z4) {
                    int intValue = num.intValue();
                    a.mo30812a("consentType", Integer.valueOf(intValue));
                    a.f38873a.putInt("consentType", intValue);
                }
                if (z5) {
                    boolean booleanValue = bool.booleanValue();
                    a.mo30812a("consentApc", Boolean.valueOf(booleanValue));
                    a.f38873a.putBoolean("consentApc", booleanValue);
                }
                if (z3) {
                    long longValue = l.longValue();
                    a.mo30812a("consentTimestamp", Long.valueOf(longValue));
                    a.f38873a.putLong("consentTimestamp", longValue);
                }
                a.apply();
                if (z2) {
                    MetaData.f38952k.mo31015a(this.f36716a, new AdPreferences(), MetaDataRequest.RequestReason.CONSENT, false, (C9450c) null, true);
                }
            }
        }
    }

    /* renamed from: b */
    public Integer mo29323b() {
        if (mo29325d()) {
            int hashCode = ComponentLocator.m50248a(this.f36716a).mo31165a().mo31157a().f39228a.hashCode();
            if (!this.f36717b.contains("advIdHash") || this.f36717b.getInt("advIdHash", 0) != hashCode) {
                C9441e.C9442a a = this.f36717b.edit().remove("consentType").remove("consentTimestamp");
                a.mo30812a("advIdHash", Integer.valueOf(hashCode));
                a.f38873a.putInt("advIdHash", hashCode);
                a.apply();
            }
        }
        if (!mo29325d() || !this.f36717b.contains("consentType")) {
            return null;
        }
        return Integer.valueOf(this.f36717b.getInt("consentType", -1));
    }

    /* renamed from: c */
    public boolean mo29324c() {
        Boolean a = mo29318a();
        return a != null && a.booleanValue();
    }

    /* renamed from: d */
    public final boolean mo29325d() {
        ConsentConfig n = MetaData.f38952k.mo31033n();
        return this.f36720e && n != null && n.mo30744k();
    }

    /* renamed from: a */
    public Boolean mo29318a() {
        if (!mo29325d() || !this.f36717b.contains("consentApc")) {
            return null;
        }
        return Boolean.valueOf(this.f36717b.getBoolean("consentApc", false));
    }

    /* renamed from: a */
    public final void mo29322a(boolean z, String str, String str2, String str3) {
        ConsentConfig n;
        String str4;
        int i;
        int i2;
        Integer b;
        if ((!z && !StartAppSDKInternal.m49731c()) || (n = MetaData.f38952k.mo31033n()) == null) {
            return;
        }
        if ((!mo29325d() && !z) || this.f36719d || !C9605vb.m50482g(this.f36716a) || !C9605vb.m50479e(this.f36716a)) {
            return;
        }
        if (z || !(n.mo30740h() == null || n.mo30739g() == null || this.f36717b.contains("consentApc"))) {
            if (z) {
                str4 = AdInformationMetaData.f38717a.mo30603a().mo30596c();
            } else {
                str4 = n.mo30738f();
            }
            if (str4 != null) {
                Intent intent = new Intent(this.f36716a, ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(str4));
                intent.putExtra("allowCT", n.mo30744k());
                intent.putExtra("timestamp", n.mo30742i());
                if (z) {
                    i = 4;
                } else {
                    i = n.mo30740h().intValue();
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    intent.putExtra("templateName", valueOf);
                }
                if (z) {
                    i2 = 7;
                } else {
                    i2 = n.mo30739g().intValue();
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (valueOf2 != null) {
                    intent.putExtra("templateId", valueOf2);
                }
                if (!z) {
                    str = n.mo30735d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z) {
                    str2 = n.mo30736e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z) {
                    str3 = n.mo30732a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z) {
                    intent.putExtra("advertisingId", ComponentLocator.m50248a(this.f36716a).mo31165a().mo31157a().f39228a);
                    if (this.f36717b.contains("consentType")) {
                        intent.putExtra("consentType", this.f36717b.getInt("consentType", -1));
                    }
                }
                ConsentTypeInfoConfig c = n.mo30734c();
                if (c != null) {
                    if (c.mo30758b() != null) {
                        intent.putExtra(AdSDKNotificationListener.IMPRESSION_EVENT, c.mo30758b());
                    }
                    if (c.mo30757a() != null) {
                        intent.putExtra("falseClick", c.mo30757a());
                    }
                    if (c.mo30759c() != null) {
                        intent.putExtra("trueClick", c.mo30759c());
                    }
                }
                if (z && (b = AdInformationMetaData.f38717a.mo30603a().mo30594b()) != null) {
                    intent.putExtra("trueClick", b);
                }
                try {
                    this.f36716a.startActivity(intent);
                    this.f36719d = true;
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29319a(MetaDataRequest.RequestReason requestReason) {
        MetaData.f38952k.mo31016a((C9450c) this);
    }

    /* renamed from: a */
    public void mo29320a(MetaDataRequest.RequestReason requestReason, boolean z) {
        MetaData.f38952k.mo31016a((C9450c) this);
        ConsentConfig n = MetaData.f38952k.mo31033n();
        if (n != null && mo29325d()) {
            Integer b = n.mo30733b();
            if (b != null) {
                mo29321a(b, Long.valueOf(n.mo30742i()), (Boolean) null, false, false);
            }
            if (requestReason == MetaDataRequest.RequestReason.CONSENT) {
                C9441e.C9442a a = this.f36717b.edit();
                long i = n.mo30742i();
                a.mo30812a("consentTimestamp", Long.valueOf(i));
                a.f38873a.putLong("consentTimestamp", i);
                a.apply();
            } else if (requestReason == MetaDataRequest.RequestReason.LAUNCH) {
                mo29322a(false, (String) null, (String) null, (String) null);
            }
        }
    }
}
