package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.C8837b0;
import com.startapp.C8944f3;
import com.startapp.C9605vb;
import com.startapp.C9641x9;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Sta */
public class OverlayActivity extends Activity {

    /* renamed from: a */
    public C8944f3 f38315a;

    /* renamed from: b */
    public boolean f38316b;

    /* renamed from: c */
    public int f38317c;

    /* renamed from: d */
    public boolean f38318d;

    /* renamed from: e */
    public Bundle f38319e;

    /* renamed from: f */
    public int f38320f = -1;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30093a() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "placement"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            android.content.Intent r1 = r8.getIntent()
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r0 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.m50026a(r0)
            int r3 = r0.ordinal()
            if (r3 == 0) goto L_0x0063
            r4 = 2
            if (r3 == r4) goto L_0x005b
            r4 = 3
            if (r3 == r4) goto L_0x0053
            r4 = 4
            if (r3 == r4) goto L_0x002f
            r4 = 7
            if (r3 == r4) goto L_0x002f
            r4 = 8
            if (r3 == r4) goto L_0x0063
            com.startapp.g5 r3 = new com.startapp.g5
            r3.<init>()
            goto L_0x0078
        L_0x002f:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C9605vb.f39316a
            java.lang.String r3 = "videoAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x003f
            com.startapp.sdk.ads.video.VideoMode r3 = new com.startapp.sdk.ads.video.VideoMode
            r3.<init>()
            goto L_0x0078
        L_0x003f:
            java.lang.String r3 = "mraidAd"
            boolean r3 = r1.getBooleanExtra(r3, r2)
            if (r3 == 0) goto L_0x004d
            com.startapp.p6 r3 = new com.startapp.p6
            r3.<init>()
            goto L_0x0078
        L_0x004d:
            com.startapp.y7 r3 = new com.startapp.y7
            r3.<init>()
            goto L_0x0078
        L_0x0053:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C9605vb.f39316a
            com.startapp.sdk.ads.splash.b r3 = new com.startapp.sdk.ads.splash.b
            r3.<init>()
            goto L_0x0078
        L_0x005b:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C9605vb.f39316a
            com.startapp.t7 r3 = new com.startapp.t7
            r3.<init>()
            goto L_0x0078
        L_0x0063:
            java.util.Map<android.app.Activity, java.lang.Integer> r3 = com.startapp.C9605vb.f39316a
            android.net.Uri r3 = r1.getData()
            if (r3 != 0) goto L_0x006e
            r0 = 0
            goto L_0x015a
        L_0x006e:
            java.lang.String r3 = r3.toString()
            com.startapp.a4 r4 = new com.startapp.a4
            r4.<init>(r3)
            r3 = r4
        L_0x0078:
            r3.f36754a = r1
            r3.f36755b = r8
            java.lang.String r4 = "position"
            java.lang.String r4 = r1.getStringExtra(r4)
            r3.f36761h = r4
            java.lang.String r4 = "tracking"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f36762i = r4
            java.lang.String r4 = "trackingClickUrl"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f36763j = r4
            java.lang.String r4 = "packageNames"
            java.lang.String[] r4 = r1.getStringArrayExtra(r4)
            r3.f36764k = r4
            java.lang.String r4 = "closingUrl"
            java.lang.String[] r5 = r1.getStringArrayExtra(r4)
            r3.f36758e = r5
            java.lang.String r5 = "smartRedirect"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f36759f = r5
            java.lang.String r5 = "browserEnabled"
            boolean[] r5 = r1.getBooleanArrayExtra(r5)
            r3.f36760g = r5
            java.lang.String r5 = "adTag"
            java.lang.String r5 = r1.getStringExtra(r5)
            r3.f36769p = r5
            java.lang.String r5 = "htmlUuid"
            java.lang.String r5 = r1.getStringExtra(r5)
            if (r5 == 0) goto L_0x00e7
            java.lang.Boolean r6 = com.startapp.sdk.adsbase.AdsConstants.f38631f
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x00da
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f38790b
            java.lang.Object r5 = r6.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo29349a((java.lang.String) r5)
            goto L_0x00e7
        L_0x00da:
            com.startapp.sdk.adsbase.cache.d r6 = com.startapp.sdk.adsbase.cache.C9410d.f38788h
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f38790b
            java.lang.Object r5 = r6.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            r3.mo29349a((java.lang.String) r5)
        L_0x00e7:
            java.lang.String r5 = "isSplash"
            r1.getBooleanExtra(r5, r2)
            java.lang.String r5 = "adInfoOverride"
            java.io.Serializable r5 = r1.getSerializableExtra(r5)
            com.startapp.sdk.adsbase.adinformation.AdInformationOverrides r5 = (com.startapp.sdk.adsbase.adinformation.AdInformationOverrides) r5
            r3.f36768o = r5
            r3.f36767n = r0
            java.lang.String[] r0 = r1.getStringArrayExtra(r4)
            r3.f36758e = r0
            java.lang.String r0 = "rewardDuration"
            int r0 = r1.getIntExtra(r0, r2)
            r3.f36772s = r0
            java.lang.String r0 = "rewardedHideTimer"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r3.f36773t = r0
            boolean[] r0 = r3.f36759f
            r4 = 1
            if (r0 != 0) goto L_0x0119
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f36759f = r0
        L_0x0119:
            boolean[] r0 = r3.f36760g
            if (r0 != 0) goto L_0x0123
            boolean[] r0 = new boolean[r4]
            r0[r2] = r4
            r3.f36760g = r0
        L_0x0123:
            java.lang.String r0 = "ad"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            com.startapp.sdk.adsbase.Ad r0 = (com.startapp.sdk.adsbase.C9381Ad) r0
            r3.f36765l = r0
            java.lang.String r0 = "delayCloseInterval"
            r4 = -1
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f36753G = r0
        L_0x013f:
            java.lang.String r0 = "delayImpressionSeconds"
            long r6 = r1.getLongExtra(r0, r4)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x014f
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r3.f36770q = r0
        L_0x014f:
            java.lang.String r0 = "sendRedirectHops"
            java.io.Serializable r0 = r1.getSerializableExtra(r0)
            java.lang.Boolean[] r0 = (java.lang.Boolean[]) r0
            r3.f36771r = r0
            r0 = r3
        L_0x015a:
            r8.f38315a = r0
            if (r0 != 0) goto L_0x0161
            r8.finish()
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.interstitials.OverlayActivity.mo30093a():void");
    }

    /* renamed from: b */
    public final boolean mo30094b() {
        return this.f38316b && Build.VERSION.SDK_INT != 26;
    }

    public void finish() {
        C8944f3 f3Var = this.f38315a;
        if (f3Var != null) {
            f3Var.mo29355h();
        }
        super.finish();
    }

    public void onBackPressed() {
        C8944f3 f3Var = this.f38315a;
        if (f3Var == null || !f3Var.mo29352c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (mo30094b()) {
            mo30093a();
            C8944f3 f3Var = this.f38315a;
            if (f3Var != null) {
                f3Var.mo29070a(this.f38319e);
                this.f38315a.mo29074f();
            }
            this.f38316b = false;
        }
        C8944f3 f3Var2 = this.f38315a;
        if (f3Var2 != null) {
            f3Var2.mo29348a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        Serializable serializableExtra = getIntent().getSerializableExtra("ad");
        if (intExtra >= 0 && (serializableExtra instanceof C9381Ad)) {
            C9641x9 t = ComponentLocator.m50248a(getApplicationContext()).mo31184t();
            AdPreferences.Placement a = AdPreferences.Placement.m50026a(intExtra);
            String adId = ((C9381Ad) serializableExtra).getAdId();
            if (adId != null) {
                t.f39385a.put(new C9641x9.C9642a(a, -1), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        this.f38318d = getIntent().getBooleanExtra("activityShouldLockOrientation", true);
        if (bundle != null) {
            this.f38320f = bundle.getInt("activityLockedOrientation", -1);
            this.f38318d = bundle.getBoolean("activityShouldLockOrientation", true);
        }
        this.f38317c = getIntent().getIntExtra(AdUnitActivity.EXTRA_ORIENTATION, getResources().getConfiguration().orientation);
        if (getResources().getConfiguration().orientation != this.f38317c) {
            z = true;
        }
        this.f38316b = z;
        if (mo30094b()) {
            this.f38319e = bundle;
            return;
        }
        mo30093a();
        C8944f3 f3Var = this.f38315a;
        if (f3Var != null) {
            f3Var.mo29070a(bundle);
        }
    }

    public void onDestroy() {
        if (!mo30094b()) {
            C8944f3 f3Var = this.f38315a;
            if (f3Var != null) {
                f3Var.mo29353d();
                this.f38315a = null;
            }
            Map<Activity, Integer> map = C9605vb.f39316a;
            C9605vb.m50442a((Activity) this, getResources().getConfiguration().orientation, false);
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C8944f3 f3Var = this.f38315a;
        if (f3Var == null || f3Var.mo29071a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (!mo30094b()) {
            C8944f3 f3Var = this.f38315a;
            if (f3Var != null) {
                f3Var.mo29073e();
            }
            C9396a.m49793b((Context) this);
        }
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        C8944f3 f3Var;
        super.onResume();
        int i = this.f38320f;
        if (i == -1) {
            this.f38320f = C9605vb.m50442a((Activity) this, this.f38317c, this.f38318d);
        } else {
            int i2 = C8837b0.f36438a;
            try {
                setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        }
        if (!mo30094b() && (f3Var = this.f38315a) != null) {
            f3Var.mo29074f();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!mo30094b()) {
            C8944f3 f3Var = this.f38315a;
            if (f3Var != null) {
                f3Var.mo29072b(bundle);
            }
            bundle.putInt("activityLockedOrientation", this.f38320f);
            bundle.putBoolean("activityShouldLockOrientation", this.f38318d);
        }
    }

    public void onStop() {
        C8944f3 f3Var;
        super.onStop();
        if (!mo30094b() && (f3Var = this.f38315a) != null) {
            f3Var.mo29354g();
        }
    }
}
