package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kg2 implements tj2 {

    /* renamed from: a */
    private final Context f12079a;

    /* renamed from: b */
    private final mf3 f12080b;

    kg2(Context context, mf3 mf3) {
        this.f12079a = context;
        this.f12080b = mf3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ jg2 mo11698a() throws Exception {
        String str;
        Bundle bundle;
        C4409t.m29326r();
        Context context = this.f12079a;
        String str2 = "";
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14553f5)).booleanValue()) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14573h5)).booleanValue()) {
            str2 = this.f12079a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        C4409t.m29326r();
        Context context2 = this.f12079a;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14563g5)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new jg2(str, str2, bundle, (ig2) null);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f12080b.mo12324a(new hg2(this));
    }

    public final int zza() {
        return 18;
    }
}
