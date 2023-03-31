package com.startapp.sdk.adsbase.model;

import android.app.Activity;
import android.content.Context;
import com.startapp.C8811a;
import com.startapp.C8923e2;
import com.startapp.C8938f;
import com.startapp.C9152n8;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.C9641x9;
import com.startapp.C9667ye;
import com.startapp.C9671z0;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class GetAdRequest extends C9671z0 {

    /* renamed from: A0 */
    public int f38891A0 = 0;

    /* renamed from: B0 */
    public Set<String> f38892B0 = null;

    /* renamed from: C0 */
    public Set<String> f38893C0 = null;

    /* renamed from: D0 */
    public Set<String> f38894D0 = null;

    /* renamed from: E0 */
    public Set<String> f38895E0 = null;

    /* renamed from: F0 */
    public Set<String> f38896F0 = null;

    /* renamed from: G0 */
    public Pair<String, String> f38897G0;

    /* renamed from: H0 */
    public boolean f38898H0 = true;

    /* renamed from: I0 */
    public long f38899I0 = (System.currentTimeMillis() - C9584u9.f39253d.mo31310b());

    /* renamed from: J0 */
    public int f38900J0;

    /* renamed from: K0 */
    public String f38901K0;

    /* renamed from: L0 */
    public String f38902L0;

    /* renamed from: M0 */
    public String f38903M0;

    /* renamed from: N0 */
    public boolean f38904N0;

    /* renamed from: O0 */
    public Boolean f38905O0;

    /* renamed from: P0 */
    public Boolean f38906P0;

    /* renamed from: Q0 */
    public String f38907Q0;

    /* renamed from: S0 */
    public String f38908S0;

    /* renamed from: T0 */
    public C9381Ad.AdType f38909T0 = null;

    /* renamed from: h0 */
    public AdPreferences.Placement f38910h0;

    /* renamed from: i0 */
    public boolean f38911i0;

    /* renamed from: j0 */
    public boolean f38912j0;

    /* renamed from: k0 */
    public Integer f38913k0;

    /* renamed from: l0 */
    public Long f38914l0;

    /* renamed from: m0 */
    public Boolean f38915m0;

    /* renamed from: n0 */
    public SDKAdPreferences.Gender f38916n0;

    /* renamed from: o0 */
    public String f38917o0;

    /* renamed from: q0 */
    public int f38918q0 = 1;

    /* renamed from: r0 */
    public boolean f38919r0 = true;

    /* renamed from: s0 */
    public Boolean f38920s0;

    /* renamed from: t0 */
    public boolean f38921t0 = AdsCommonMetaData.m49636k().mo30451M();

    /* renamed from: u0 */
    public Double f38922u0;

    /* renamed from: v0 */
    public String f38923v0;

    /* renamed from: w0 */
    public String f38924w0;

    /* renamed from: x0 */
    public Integer f38925x0;

    /* renamed from: y0 */
    public boolean f38926y0 = true;

    /* renamed from: z0 */
    public boolean f38927z0;

    /* compiled from: Sta */
    public enum VideoRequestMode {
        INTERSTITIAL,
        REWARDED
    }

    /* compiled from: Sta */
    public enum VideoRequestType {
        ENABLED,
        DISABLED,
        FORCED,
        FORCED_NONVAST
    }

    public GetAdRequest() {
        super(4);
        Map<Activity, Integer> map = C9605vb.f39316a;
        this.f38900J0 = C8938f.m48556a().mo29343b();
        this.f38901K0 = MetaData.m50090v().mo30989E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb A[Catch:{ all -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc A[Catch:{ all -> 0x00ff }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30338a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.model.AdPreferences.Placement r6, com.startapp.sdk.common.utils.Pair<java.lang.String, java.lang.String> r7) {
        /*
            r3 = this;
            r3.f38910h0 = r6
            java.lang.String r6 = r5.getPlacementId()
            r3.f38908S0 = r6
            r3.f38897G0 = r7
            java.lang.Boolean r6 = r5.getAi()
            r3.f38905O0 = r6
            java.lang.Boolean r6 = r5.getAs()
            r3.f38906P0 = r6
            com.startapp.sdk.adsbase.SDKAdPreferences$Gender r6 = r5.getGender(r4)
            r3.f38916n0 = r6
            java.lang.String r6 = r5.getKeywords()
            r3.f38917o0 = r6
            boolean r6 = r5.isTestMode()
            r3.f38911i0 = r6
            java.util.Set r6 = r5.getCategories()
            r3.f38892B0 = r6
            java.util.Set r6 = r5.getCategoriesExclude()
            r3.f38893C0 = r6
            boolean r6 = r5.mo30861b()
            r3.f38919r0 = r6
            java.lang.Integer r6 = r5.mo30858a()
            r3.f38925x0 = r6
            int r6 = com.startapp.C8837b0.f36438a
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = "auto_time"
            r0 = 1
            r1 = 0
            r2 = 17
            if (r6 < r2) goto L_0x0057
            android.content.ContentResolver r6 = r4.getContentResolver()
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r1)
            if (r6 <= 0) goto L_0x0063
            goto L_0x0061
        L_0x0057:
            android.content.ContentResolver r6 = r4.getContentResolver()
            int r6 = android.provider.Settings.System.getInt(r6, r7, r1)
            if (r6 <= 0) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3.f38920s0 = r6
            java.lang.Double r6 = r5.getMinCpm()
            r3.f38922u0 = r6
            java.lang.String r6 = r5.getAdTag()
            r3.f38923v0 = r6
            java.lang.Object r6 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38945d
            java.lang.String r6 = "StartappMetadata"
            java.io.File r6 = r4.getFileStreamPath(r6)
            boolean r6 = r6.exists()
            r6 = r6 ^ r0
            r3.f38926y0 = r6
            com.startapp.sdk.adsbase.Ad$AdType r6 = r5.type
            r3.f38909T0 = r6
            java.lang.String r6 = r5.getCustomProductId()
            r3.f39512b = r6
            com.startapp.sdk.adsbase.AdsCommonMetaData r6 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            com.startapp.sdk.adsbase.VideoConfig r6 = r6.mo30445G()
            if (r6 == 0) goto L_0x00a8
            java.lang.String r7 = r6.mo30585l()
            if (r7 == 0) goto L_0x00a8
            java.lang.String r6 = r6.mo30585l()
            java.lang.String r7 = "muted"
            boolean r6 = r6.equals(r7)
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            if (r6 != 0) goto L_0x00c9
            java.lang.String r6 = "audio"
            java.lang.Object r6 = r4.getSystemService(r6)     // Catch:{ all -> 0x00c4 }
            boolean r7 = r6 instanceof android.media.AudioManager     // Catch:{ all -> 0x00c4 }
            if (r7 == 0) goto L_0x00cb
            android.media.AudioManager r6 = (android.media.AudioManager) r6     // Catch:{ all -> 0x00c4 }
            r7 = 3
            int r6 = r6.getStreamVolume(r7)     // Catch:{ all -> 0x00c4 }
            if (r6 <= 0) goto L_0x00c0
            r6 = 1
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            r3.f38927z0 = r6     // Catch:{ all -> 0x00c4 }
            goto L_0x00cb
        L_0x00c4:
            r6 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r6)
            goto L_0x00cb
        L_0x00c9:
            r3.f38927z0 = r1
        L_0x00cb:
            java.lang.Object r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.f38662D     // Catch:{ all -> 0x00ff }
            com.startapp.sdk.adsbase.StartAppSDKInternal r6 = com.startapp.sdk.adsbase.StartAppSDKInternal.C9395d.f38707a     // Catch:{ all -> 0x00ff }
            boolean r6 = r6.f38666C     // Catch:{ all -> 0x00ff }
            if (r6 != 0) goto L_0x00fd
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r4)     // Catch:{ all -> 0x00ff }
            com.startapp.s5<com.startapp.d> r4 = r4.f39031K     // Catch:{ all -> 0x00ff }
            java.lang.Object r4 = r4.mo29904a()     // Catch:{ all -> 0x00ff }
            com.startapp.d r4 = (com.startapp.C8897d) r4     // Catch:{ all -> 0x00ff }
            com.startapp.d3<com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata> r6 = r4.f36661c     // Catch:{ all -> 0x00ff }
            java.lang.Object r6 = r6.call()     // Catch:{ all -> 0x00ff }
            com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata r6 = (com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata) r6     // Catch:{ all -> 0x00ff }
            if (r6 != 0) goto L_0x00ea
            goto L_0x00f8
        L_0x00ea:
            boolean r4 = r4.mo29286a()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00f8
            boolean r4 = r6.mo30914c()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00f8
            r4 = 1
            goto L_0x00f9
        L_0x00f8:
            r4 = 0
        L_0x00f9:
            if (r4 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            r3.f38912j0 = r0     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            java.util.Set<java.lang.String> r4 = r5.packageInclude
            r3.f38895E0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.model.GetAdRequest.mo30338a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.model.AdPreferences$Placement, com.startapp.sdk.common.utils.Pair):void");
    }

    /* renamed from: a */
    public boolean mo30902a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo30903b() {
        C9381Ad.AdType adType = this.f38909T0;
        return adType == C9381Ad.AdType.VIDEO || adType == C9381Ad.AdType.REWARDED_VIDEO;
    }

    /* renamed from: f */
    public void mo29776f(Context context) {
        String str;
        C9641x9 t = ComponentLocator.m50248a(context).mo31184t();
        AdPreferences.Placement placement = this.f38910h0;
        if (placement == null) {
            str = null;
        } else {
            str = t.f39385a.get(new C9641x9.C9642a(placement, -1));
        }
        this.f38924w0 = str;
    }

    /* renamed from: g */
    public void mo30904g(Context context) {
        C8923e2 f = ComponentLocator.m50248a(context).mo31170f();
        this.f38913k0 = f.mo29323b();
        this.f38914l0 = (!f.mo29325d() || !f.f36717b.contains("consentTimestamp")) ? null : Long.valueOf(f.f36717b.getLong("consentTimestamp", 0));
        this.f38915m0 = f.mo29318a();
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        n8Var.mo29310a("placement", (Object) this.f38910h0.name(), true, true);
        n8Var.mo29310a("placementId", (Object) this.f38908S0, false, true);
        n8Var.mo29310a("testMode", (Object) Boolean.toString(this.f38911i0), false, true);
        n8Var.mo29310a("gender", (Object) this.f38916n0, false, true);
        n8Var.mo29310a("keywords", (Object) this.f38917o0, false, true);
        n8Var.mo29310a("adsNumber", (Object) Integer.toString(this.f38918q0), false, true);
        n8Var.mo29311a("category", this.f38892B0, false, true);
        n8Var.mo29311a("categoryExclude", this.f38893C0, false, true);
        n8Var.mo29311a("packageExclude", this.f38894D0, false, true);
        n8Var.mo29311a("campaignExclude", this.f38896F0, false, true);
        n8Var.mo29310a("offset", (Object) Integer.toString(this.f38891A0), false, true);
        n8Var.mo29310a("ai", (Object) this.f38905O0, false, true);
        n8Var.mo29310a("as", (Object) this.f38906P0, false, true);
        Double d = this.f38922u0;
        Map<Activity, Integer> map = C9605vb.f39316a;
        n8Var.mo29310a("minCPM", (Object) d != null ? String.format(Locale.US, "%.2f", new Object[]{d}) : null, false, true);
        n8Var.mo29310a("adTag", (Object) this.f38923v0, false, true);
        n8Var.mo29310a("previousAdId", (Object) this.f38924w0, false, true);
        n8Var.mo29310a("twoClicks", (Object) Boolean.valueOf(!this.f38921t0), false, true);
        n8Var.mo29310a("engInclude", (Object) Boolean.toString(this.f38898H0), false, true);
        C9381Ad.AdType adType = this.f38909T0;
        if (adType == C9381Ad.AdType.INTERSTITIAL || adType == C9381Ad.AdType.RICH_TEXT) {
            n8Var.mo29310a("type", (Object) adType, false, true);
        }
        n8Var.mo29310a("timeSinceSessionStart", (Object) Long.valueOf(this.f38899I0), true, true);
        n8Var.mo29310a("adsDisplayed", (Object) Integer.valueOf(this.f38900J0), true, true);
        n8Var.mo29310a("profileId", (Object) this.f38901K0, false, true);
        n8Var.mo29310a("hardwareAccelerated", (Object) Boolean.valueOf(this.f38919r0), false, true);
        n8Var.mo29310a("autoLoadAmount", (Object) this.f38925x0, false, true);
        n8Var.mo29310a("dts", (Object) this.f38920s0, false, true);
        n8Var.mo29310a("downloadingMode", (Object) "CACHE", false, true);
        n8Var.mo29310a("primaryImg", (Object) this.f38902L0, false, true);
        n8Var.mo29310a("moreImg", (Object) this.f38903M0, false, true);
        n8Var.mo29310a("contentAd", (Object) Boolean.toString(this.f38904N0), false, true);
        n8Var.mo29310a("ct", (Object) this.f38913k0, false, true);
        n8Var.mo29310a("tsc", (Object) this.f38914l0, false, true);
        n8Var.mo29310a("apc", (Object) this.f38915m0, false, true);
        if (this.f38912j0) {
            n8Var.mo29310a("testAdsEnabled", (Object) Boolean.TRUE, false, true);
        }
        String a = C8811a.m48222a();
        n8Var.mo29310a(C8811a.f36366b, (Object) a, true, true);
        String str = C8811a.f36368d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39512b);
        sb.append(this.f38910h0.name());
        String str2 = this.f39499Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f39514c);
        sb.append(a);
        n8Var.mo29310a(str, (Object) C8811a.m48223a(sb.toString()), true, false);
        n8Var.mo29310a("sound", (Object) Boolean.valueOf(this.f38927z0), false, true);
        Set<String> set = this.f38895E0;
        if (set != null) {
            n8Var.mo29311a("packageInclude", set, false, true);
        }
        n8Var.mo29310a("defaultMetaData", (Object) Boolean.valueOf(this.f38926y0), true, true);
        Pair<String, String> pair = this.f38897G0;
        n8Var.mo29310a((String) pair.first, (Object) pair.second, false, true);
        String str3 = this.f38907Q0;
        if (str3 != null) {
            n8Var.mo29310a("trv", (Object) str3, false, false);
        }
        C9667ye yeVar = this.f39501R0;
        if (yeVar != null) {
            Integer num = yeVar.f39455c.get(this.f38910h0);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue > 0) {
                n8Var.mo29310a("adsDisplayed", (Object) Integer.valueOf(intValue), false, false);
            }
        }
    }
}
