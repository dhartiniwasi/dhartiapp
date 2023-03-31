package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9055k;
import com.startapp.C9219p7;
import com.startapp.C9573u0;
import com.startapp.sdk.ads.video.C9358d;
import com.startapp.sdk.ads.video.C9366j;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.ads.video.vast.C9378c;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C9410d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.List;

/* renamed from: com.startapp.sdk.ads.video.b */
/* compiled from: Sta */
public class C9352b extends C9573u0 {

    /* renamed from: m */
    public final long f38506m = System.currentTimeMillis();

    /* renamed from: n */
    public volatile CacheKey f38507n;

    /* renamed from: o */
    public int f38508o = 0;

    /* renamed from: com.startapp.sdk.ads.video.b$a */
    /* compiled from: Sta */
    public class C9353a implements C9378c.C9379a {
        public C9353a() {
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$b */
    /* compiled from: Sta */
    public class C9354b implements C9366j.C9368b {

        /* renamed from: a */
        public final /* synthetic */ boolean f38510a;

        public C9354b(boolean z) {
            this.f38510a = z;
        }

        /* renamed from: a */
        public void mo30345a(String str) {
            if (str != null) {
                if (!str.equals("downloadInterrupted")) {
                    C9352b.this.f38770b.setState(this.f38510a ? C9381Ad.AdState.READY : C9381Ad.AdState.UN_INITIALIZED);
                    C9352b.this.mo30344g().mo30274a(str);
                }
                C9352b.this.mo31302c(this.f38510a);
                return;
            }
            C9352b.this.mo31302c(false);
            C9352b bVar = C9352b.this;
            C9055k.m48716a(bVar.f38769a, bVar.mo30656a(), C9352b.this.f38770b, false);
            C9352b.m49541a(C9352b.this, VASTErrorCodes.FileNotFound, (List) null);
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$c */
    /* compiled from: Sta */
    public class C9355c implements C9358d.C9359a {
        public C9355c() {
        }

        /* renamed from: a */
        public void mo30346a(String str) {
            C9352b.this.mo30344g().mo30274a(str);
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$d */
    /* compiled from: Sta */
    public class C9356d implements C9410d.C9414d {

        /* renamed from: a */
        public final /* synthetic */ boolean f38513a;

        public C9356d(boolean z) {
            this.f38513a = z;
        }

        /* renamed from: a */
        public void mo30269a(C9381Ad ad, CacheKey cacheKey, boolean z) {
            if (this.f38513a && z) {
                C9352b.this.f38507n = cacheKey;
            }
        }
    }

    public C9352b(Context context, C9381Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ all -> 0x001e, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49541a(com.startapp.sdk.ads.video.C9352b r5, com.startapp.sdk.ads.video.vast.VASTErrorCodes r6, java.util.List<java.lang.String> r7) {
        /*
            r5.getClass()
            if (r7 == 0) goto L_0x0023
            int r0 = r7.size()     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x0023
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r0 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess     // Catch:{ all -> 0x001e }
            if (r6 != r0) goto L_0x0013
            java.util.List r7 = com.startapp.C9605vb.m50454a((java.util.List<java.lang.String>) r7)     // Catch:{ all -> 0x001e }
        L_0x0013:
            int r0 = r7.size()     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0040
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = com.startapp.sdk.ads.video.tracking.VideoTrackingDetails.m49570b(r7)     // Catch:{ all -> 0x001e }
            goto L_0x0041
        L_0x001e:
            r7 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0077 }
            goto L_0x0040
        L_0x0023:
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo30344g()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo30344g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.mo30283h()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo30344g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.mo30283h()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = r7.mo30373e()     // Catch:{ all -> 0x0077 }
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r7 == 0) goto L_0x007b
            int r0 = r7.length     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x007b
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r5.mo30344g()     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0059
            java.lang.String r2 = r0.mo30284i()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r0.mo30284i()     // Catch:{ all -> 0x0077 }
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r2 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "1"
            r4 = 0
            r2.<init>(r1, r4, r4, r3)     // Catch:{ all -> 0x0077 }
            com.startapp.qc r1 = new com.startapp.qc     // Catch:{ all -> 0x0077 }
            r1.<init>(r7, r2, r0, r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "error"
            r1.f38129e = r7     // Catch:{ all -> 0x0077 }
            r1.f38130f = r6     // Catch:{ all -> 0x0077 }
            com.startapp.pc r6 = r1.mo29860a()     // Catch:{ all -> 0x0077 }
            android.content.Context r5 = r5.f38769a     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.VideoUtil.m49536a((android.content.Context) r5, (com.startapp.C9227pc) r6)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r5 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.C9352b.m49541a(com.startapp.sdk.ads.video.b, com.startapp.sdk.ads.video.vast.VASTErrorCodes, java.util.List):void");
    }

    /* renamed from: b */
    public boolean mo30342b(GetAdRequest getAdRequest) {
        VideoUtil.VideoEligibility a;
        if (!(getAdRequest != null)) {
            return false;
        }
        if (!getAdRequest.mo30903b() || (a = VideoUtil.m49533a(this.f38769a)) == VideoUtil.VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f38774f = a.mo30337a();
        return false;
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        GetAdRequest a = mo30657a((GetAdRequest) new C9351a());
        if (a != null) {
            a.mo29776f(this.f38769a);
        }
        return a;
    }

    /* renamed from: g */
    public VideoAdDetails mo30344g() {
        return ((VideoEnabledAd) this.f38770b).mo30296w();
    }

    /* renamed from: d */
    public final void mo30343d(boolean z) {
        AdPreferences adPreferences;
        C9381Ad.AdType type = this.f38770b.getType();
        C9381Ad.AdType adType = C9381Ad.AdType.REWARDED_VIDEO;
        if ((type != adType && this.f38770b.getType() != C9381Ad.AdType.VIDEO) || z) {
            AdPreferences adPreferences2 = this.f38771c;
            if (adPreferences2 == null) {
                adPreferences = new AdPreferences();
            } else {
                adPreferences = new AdPreferences(adPreferences2);
            }
            adPreferences.setType((this.f38770b.getType() == adType || this.f38770b.getType() == C9381Ad.AdType.VIDEO) ? C9381Ad.AdType.VIDEO_NO_VAST : C9381Ad.AdType.NON_VIDEO);
            C9410d.f38788h.mo30697a(this.f38769a, (StartAppAd) null, this.f38773e, adPreferences, (C9410d.C9414d) new C9356d(z));
        }
    }

    /* renamed from: b */
    public void mo30341b(boolean z) {
        if (!(mo30344g() != null)) {
            this.f38770b.setState(z ? C9381Ad.AdState.READY : C9381Ad.AdState.UN_INITIALIZED);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.startapp.bf} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo30339a(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = r15
            com.startapp.p7$a r0 = (com.startapp.C9219p7.C9220a) r0
            r1 = 0
            if (r0 == 0) goto L_0x0009
            java.lang.String r2 = r0.f38067c
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0192
            java.lang.String r2 = r2.toLowerCase()
            java.lang.String r5 = "json"
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x0192
            com.startapp.sdk.adsbase.AdsCommonMetaData r15 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            com.startapp.sdk.adsbase.VideoConfig r15 = r15.mo30445G()
            boolean r2 = r15.mo30590q()
            if (r2 == 0) goto L_0x003a
            com.startapp.sdk.adsbase.model.GetAdRequest r2 = r14.f39233i
            java.util.Set<java.lang.String> r2 = r2.f38896F0
            if (r2 == 0) goto L_0x0034
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0034
            r2 = 1
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            if (r2 != 0) goto L_0x003a
            r14.mo30343d(r4)
        L_0x003a:
            java.lang.String r2 = r0.f38066b     // Catch:{ Exception -> 0x018a }
            java.lang.Class<com.startapp.zb> r5 = com.startapp.C9684zb.class
            java.lang.Object r2 = com.startapp.C9065k5.m48755a(r2, r5)     // Catch:{ Exception -> 0x018a }
            com.startapp.zb r2 = (com.startapp.C9684zb) r2     // Catch:{ Exception -> 0x018a }
            if (r2 == 0) goto L_0x0183
            java.lang.String r5 = r2.getVastTag()
            if (r5 == 0) goto L_0x0183
            com.startapp.sdk.adsbase.remoteconfig.MetaData r5 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            java.lang.String r8 = r5.mo31000P()
            boolean r5 = r2.isRecordHops()
            if (r5 == 0) goto L_0x0073
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x0073
            com.startapp.sdk.ads.video.vast.b r5 = new com.startapp.sdk.ads.video.vast.b
            android.content.Context r7 = r14.f38769a
            java.lang.String r9 = r2.getPartnerResponse()
            java.lang.String r10 = r2.getPartnerName()
            boolean r11 = r2.isSkipFailed()
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0074
        L_0x0073:
            r5 = r1
        L_0x0074:
            android.content.Context r6 = r14.f38769a
            com.startapp.sdk.components.ComponentLocator r6 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r6)
            com.startapp.md r6 = r6.mo31187w()
            java.lang.String r6 = r6.mo29702a()
            com.startapp.sdk.ads.video.vast.c r7 = new com.startapp.sdk.ads.video.vast.c
            android.content.Context r8 = r14.f38769a
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r7.<init>(r8, r6)
            int r6 = r15.mo30576e()
            r7.f38608f = r6
            com.startapp.sdk.ads.video.b$a r6 = new com.startapp.sdk.ads.video.b$a
            r6.<init>()
            r7.f38605c = r6
            java.lang.String r6 = r2.getVastTag()
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r8 = r7.f38609g
            r8.clear()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.startapp.xb r6 = r7.mo30408a(r6, r8, r5)
            if (r6 == 0) goto L_0x00f4
            int r8 = r7.f38603a
            float r8 = (float) r8
            float r9 = r7.f38604b
            float r8 = r8 / r9
            int r8 = (int) r8
            java.util.Set<com.startapp.sdk.ads.video.vast.a> r9 = r7.f38609g
            java.util.Iterator r9 = r9.iterator()
            r10 = r1
        L_0x00c0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00e0
            java.lang.Object r11 = r9.next()
            com.startapp.sdk.ads.video.vast.a r11 = (com.startapp.sdk.ads.video.vast.C9376a) r11
            if (r10 == 0) goto L_0x00de
            int r12 = r7.f38603a
            float r12 = r11.mo30401a(r12, r8)
            int r13 = r7.f38603a
            float r13 = r10.mo30401a(r13, r8)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c0
        L_0x00de:
            r10 = r11
            goto L_0x00c0
        L_0x00e0:
            r6.f39404o = r10
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.List<java.lang.String> r9 = r6.f39390a
            r8.<init>(r9)
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r9 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess
            r7.mo30412a((java.util.List<java.lang.String>) r8, (com.startapp.sdk.ads.video.vast.VASTErrorCodes) r9)
            if (r5 == 0) goto L_0x00fd
            r5.mo30406a(r9)
            goto L_0x00fd
        L_0x00f4:
            if (r5 == 0) goto L_0x00fd
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r7 = r7.f38606d
            if (r7 == 0) goto L_0x00fd
            r5.mo30406a(r7)
        L_0x00fd:
            if (r6 == 0) goto L_0x013d
            com.startapp.sdk.adsbase.Ad r3 = r14.f38770b
            com.startapp.sdk.adsbase.Ad$AdType r3 = r3.getType()
            com.startapp.sdk.adsbase.Ad$AdType r4 = com.startapp.sdk.adsbase.C9381Ad.AdType.REWARDED_VIDEO
            if (r3 == r4) goto L_0x0116
            com.startapp.bf r1 = new com.startapp.bf
            java.lang.Long r3 = r2.getSkipafter()
            java.lang.Long r4 = r2.getSkipmin()
            r1.<init>(r3, r4)
        L_0x0116:
            com.startapp.sdk.adsbase.Ad r3 = r14.f38770b
            com.startapp.sdk.ads.video.VideoEnabledAd r3 = (com.startapp.sdk.ads.video.VideoEnabledAd) r3
            r3.mo30293a(r6, r15, r1)
            java.lang.String r15 = r2.getTtlSec()
            if (r15 == 0) goto L_0x012e
            com.startapp.sdk.adsbase.Ad r15 = r14.f38770b
            com.startapp.sdk.ads.video.VideoEnabledAd r15 = (com.startapp.sdk.ads.video.VideoEnabledAd) r15
            java.lang.String r1 = r2.getTtlSec()
            r15.mo30495b((java.lang.String) r1)
        L_0x012e:
            java.lang.String r15 = r2.getAdmTag()
            r0.f38066b = r15
            java.lang.String r15 = "text/html"
            r0.f38067c = r15
            boolean r15 = super.mo30339a(r0)
            goto L_0x0189
        L_0x013d:
            java.lang.String r0 = r2.getCampaignId()
            if (r0 == 0) goto L_0x014c
            java.util.Set<java.lang.String> r0 = r14.f39232h
            java.lang.String r2 = r2.getCampaignId()
            r0.add(r2)
        L_0x014c:
            int r0 = r14.f38508o
            int r0 = r0 + r4
            r14.f38508o = r0
            com.startapp.sdk.adsbase.Ad r0 = r14.f38770b
            com.startapp.sdk.ads.video.VideoEnabledAd r0 = (com.startapp.sdk.ads.video.VideoEnabledAd) r0
            r0.mo30295v()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r14.f38506m
            long r4 = r4 - r6
            int r0 = r15.mo30587n()
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x016f
            java.lang.String r15 = "VAST retry timeout"
            boolean r15 = r14.mo30340a((java.lang.String) r15, (java.lang.Throwable) r1, (boolean) r3)
            goto L_0x0189
        L_0x016f:
            int r0 = r14.f38508o
            int r15 = r15.mo30575d()
            if (r0 <= r15) goto L_0x017e
            java.lang.String r15 = "VAST too many excludes"
            boolean r15 = r14.mo30340a((java.lang.String) r15, (java.lang.Throwable) r1, (boolean) r3)
            goto L_0x0189
        L_0x017e:
            boolean r15 = r14.mo30658b()
            goto L_0x0189
        L_0x0183:
            java.lang.String r15 = "no VAST wrapper in json"
            boolean r15 = r14.mo30340a((java.lang.String) r15, (java.lang.Throwable) r1, (boolean) r4)
        L_0x0189:
            return r15
        L_0x018a:
            r15 = move-exception
            java.lang.String r0 = "VAST json parsing"
            boolean r15 = r14.mo30340a((java.lang.String) r0, (java.lang.Throwable) r15, (boolean) r4)
            return r15
        L_0x0192:
            if (r0 == 0) goto L_0x0196
            java.lang.String r1 = r0.f38066b
        L_0x0196:
            com.startapp.sdk.adsbase.AdsCommonMetaData r0 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            com.startapp.sdk.adsbase.VideoConfig r0 = r0.mo30445G()
            boolean r0 = r0.mo30590q()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = "@videoJson@"
            java.lang.String r0 = com.startapp.C9605vb.m50452a((java.lang.String) r1, (java.lang.String) r0, (java.lang.String) r0)
            if (r0 == 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r4 = 0
        L_0x01ac:
            if (r4 == 0) goto L_0x01b1
            r14.mo30343d(r3)
        L_0x01b1:
            boolean r15 = super.mo30339a(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.C9352b.mo30339a(java.lang.Object):boolean");
    }

    /* renamed from: a */
    public void mo29470a(boolean z) {
        super.mo29470a(z);
        if (z) {
            if (mo30344g() != null) {
                if (AdsCommonMetaData.f38625h.mo30445G().mo30589p()) {
                    this.f38770b.setState(z ? C9381Ad.AdState.READY : C9381Ad.AdState.UN_INITIALIZED);
                }
                mo30344g().mo30276a(this.f38771c.isVideoMuted());
                C9354b bVar = new C9354b(z);
                C9355c cVar = new C9355c();
                C9364h a = ComponentLocator.m50248a(this.f38769a).f39029I.mo29904a();
                a.f38532c.execute(new C9361e(a, mo30344g().mo30284i(), bVar, cVar));
                return;
            }
        }
        mo31302c(z);
    }

    /* renamed from: a */
    public final boolean mo30340a(String str, Throwable th, boolean z) {
        if (th != null) {
            C9023i4.m48681a(th);
        } else if (z) {
            C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
            i4Var.f36952d = str;
            i4Var.mo29471a();
        }
        C9440d c = C9410d.f38788h.mo30704c(this.f38507n);
        if (c instanceof HtmlAd) {
            C9219p7.C9220a aVar = new C9219p7.C9220a();
            aVar.f38067c = "text/html";
            aVar.f38066b = ((HtmlAd) c).mo30499j();
            return super.mo30339a(aVar);
        }
        this.f38770b.setErrorMessage(this.f38774f);
        return false;
    }
}
