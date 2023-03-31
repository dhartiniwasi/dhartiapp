package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.startapp.C8811a;
import com.startapp.C8837b0;
import com.startapp.C8923e2;
import com.startapp.C9023i4;
import com.startapp.C9152n8;
import com.startapp.C9605vb;
import com.startapp.C9671z0;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;

/* compiled from: Sta */
public class MetaDataRequest extends C9671z0 {

    /* renamed from: h0 */
    public final C9441e f38959h0;

    /* renamed from: i0 */
    public int f38960i0;

    /* renamed from: j0 */
    public int f38961j0 = mo31045c();

    /* renamed from: k0 */
    public boolean f38962k0;

    /* renamed from: l0 */
    public float f38963l0;

    /* renamed from: m0 */
    public RequestReason f38964m0;

    /* renamed from: n0 */
    public String f38965n0;

    /* renamed from: o0 */
    public String f38966o0;

    /* renamed from: p0 */
    public Integer f38967p0;

    /* renamed from: q0 */
    public Pair<String, String> f38968q0;

    /* renamed from: r0 */
    public Integer f38969r0;

    /* renamed from: s0 */
    public Boolean f38970s0;

    /* renamed from: t0 */
    public long f38971t0;

    /* compiled from: Sta */
    public enum RequestReason {
        LAUNCH(1),
        APP_IDLE(2),
        IN_APP_PURCHASE(3),
        CUSTOM(4),
        PERIODIC(5),
        PAS(6),
        CONSENT(7),
        IMPLICIT_LAUNCH(8),
        EXTRAS(9);
        
        private int index;

        /* access modifiers changed from: public */
        RequestReason(int i) {
            this.index = i;
        }
    }

    public MetaDataRequest(Context context, C9441e eVar, RequestReason requestReason) {
        super(2);
        this.f38959h0 = eVar;
        this.f38960i0 = eVar.getInt("totalSessions", 0);
        this.f38963l0 = eVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f38962k0 = eVar.getBoolean("payingUser", false);
        this.f38965n0 = MetaData.m50090v().mo30989E();
        this.f38964m0 = requestReason;
        this.f38966o0 = m50150a(context, eVar, StartAppSDKInternal.m49727a().mo30562b());
        mo31046f(context);
        this.f38968q0 = SimpleTokenUtils.m49705a();
        this.f38971t0 = SimpleTokenUtils.m49711c();
        C8923e2 f = ComponentLocator.m50248a(context).mo31170f();
        this.f38969r0 = f.mo29323b();
        this.f38970s0 = f.mo29318a();
        mo31506a(ComponentLocator.m50248a(context).mo31166b().mo31378a());
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        n8Var.mo29310a(C8811a.f36366b, (Object) C8811a.m48222a(), true, true);
        n8Var.mo29310a("totalSessions", (Object) Integer.valueOf(this.f38960i0), true, true);
        n8Var.mo29310a("daysSinceFirstSession", (Object) Integer.valueOf(this.f38961j0), true, true);
        n8Var.mo29310a("payingUser", (Object) Boolean.valueOf(this.f38962k0), true, true);
        n8Var.mo29310a("profileId", (Object) this.f38965n0, false, true);
        n8Var.mo29310a("paidAmount", (Object) Float.valueOf(this.f38963l0), true, true);
        n8Var.mo29310a("reason", (Object) this.f38964m0, true, true);
        n8Var.mo29310a("ct", (Object) this.f38969r0, false, true);
        n8Var.mo29310a("apc", (Object) this.f38970s0, false, true);
        Object obj = StartAppSDKInternal.f38662D;
        n8Var.mo29310a("testAdsEnabled", (Object) StartAppSDKInternal.C9395d.f38707a.f38666C ? Boolean.TRUE : null, false, true);
        n8Var.mo29310a("apkHash", (Object) this.f38966o0, false, true);
        n8Var.mo29310a("ian", (Object) this.f38967p0, false, true);
        Pair<String, String> pair = this.f38968q0;
        n8Var.mo29310a((String) pair.first, (Object) pair.second, false, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j = this.f38971t0;
            if (j != 0) {
                n8Var.mo29310a("firstInstalledAppTS", (Object) Long.valueOf(j), false, true);
            }
        }
    }

    /* renamed from: c */
    public final int mo31045c() {
        return (int) ((System.currentTimeMillis() - this.f38959h0.getLong("firstSessionTime", System.currentTimeMillis())) / 86400000);
    }

    /* renamed from: f */
    public void mo31046f(Context context) {
        SimpleTokenConfig J = MetaData.f38952k.mo30994J();
        if (J != null && J.mo31128a(context)) {
            int i = C8837b0.f36438a;
            int i2 = 0;
            try {
                for (PackageInfo next : C8837b0.m48298a(context.getPackageManager())) {
                    if (!C8837b0.m48306a(next) || next.packageName.equals(Constants.f39008a)) {
                        i2++;
                    }
                }
            } catch (Throwable unused) {
            }
            if (i2 > 0) {
                this.f38967p0 = Integer.valueOf(i2);
            }
        }
    }

    /* renamed from: a */
    public static String m50150a(Context context, C9441e eVar, boolean z) {
        String str = null;
        String string = eVar.getString("shared_prefs_app_apk_hash", (String) null);
        if (!TextUtils.isEmpty(string) && !z) {
            return string;
        }
        Map<Activity, Integer> map = C9605vb.f39316a;
        try {
            str = C8837b0.m48297a("SHA-256", context);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        C9441e.C9442a a = eVar.edit();
        a.mo30812a("shared_prefs_app_apk_hash", str);
        a.f38873a.putString("shared_prefs_app_apk_hash", str);
        a.apply();
        return str;
    }
}
