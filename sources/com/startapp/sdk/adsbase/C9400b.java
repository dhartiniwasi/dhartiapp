package com.startapp.sdk.adsbase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C8813a1;
import com.startapp.C9023i4;
import com.startapp.C9055k;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.sdk.adsbase.b */
/* compiled from: Sta */
public abstract class C9400b {

    /* renamed from: a */
    public final Context f38769a;

    /* renamed from: b */
    public final C9381Ad f38770b;

    /* renamed from: c */
    public final AdPreferences f38771c;

    /* renamed from: d */
    public AdEventListener f38772d;

    /* renamed from: e */
    public AdPreferences.Placement f38773e;

    /* renamed from: f */
    public String f38774f = null;

    /* renamed from: com.startapp.sdk.adsbase.b$a */
    /* compiled from: Sta */
    public class C9401a implements Runnable {
        public C9401a() {
        }

        public void run() {
            C9400b bVar = C9400b.this;
            try {
                new Handler(Looper.getMainLooper()).post(new C8813a1(bVar, bVar.mo30658b()));
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    public C9400b(Context context, C9381Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        this.f38769a = context;
        this.f38770b = ad;
        this.f38771c = adPreferences;
        this.f38772d = adEventListener;
        this.f38773e = placement;
    }

    /* renamed from: a */
    public AdEventListener mo30656a() {
        AdEventListener adEventListener = this.f38772d;
        this.f38772d = null;
        return adEventListener;
    }

    /* renamed from: a */
    public abstract boolean mo30339a(Object obj);

    /* renamed from: b */
    public boolean mo30658b() {
        try {
            return mo30339a(mo30660e());
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    /* renamed from: c */
    public void mo30659c() {
        try {
            ComponentLocator.m50248a(this.f38769a).mo31181q().execute(new C9401a());
            return;
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        C9023i4.m48681a(th);
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        GetAdRequest a = mo30657a(new GetAdRequest());
        if (a != null) {
            a.mo29776f(this.f38769a);
        }
        return a;
    }

    /* renamed from: e */
    public abstract Object mo30660e();

    /* renamed from: a */
    public void mo29470a(boolean z) {
        mo30341b(z);
        if (!z) {
            this.f38770b.setErrorMessage(this.f38774f);
            C9055k.m48716a(this.f38769a, mo30656a(), this.f38770b, false);
        }
    }

    /* renamed from: b */
    public void mo30341b(boolean z) {
        this.f38770b.setState(z ? C9381Ad.AdState.READY : C9381Ad.AdState.UN_INITIALIZED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r0.equals(r6.second) == false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ all -> 0x0078 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f A[Catch:{ all -> 0x0078 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.startapp.sdk.adsbase.model.GetAdRequest mo30657a(com.startapp.sdk.adsbase.model.GetAdRequest r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f38769a
            com.startapp.sdk.adsbase.remoteconfig.MetaData r1 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            com.startapp.sdk.adsbase.remoteconfig.SimpleTokenConfig r1 = r1.mo30994J()
            boolean r1 = r1.mo31128a(r0)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            boolean r2 = r2.mo31002R()
            com.startapp.sdk.adsbase.remoteconfig.MetaData r3 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k
            boolean r3 = r3.mo31010Z()
            java.lang.Class<com.startapp.sdk.adsbase.SimpleTokenUtils> r4 = com.startapp.sdk.adsbase.SimpleTokenUtils.class
            monitor-enter(r4)
            com.startapp.sdk.common.utils.Pair r5 = new com.startapp.sdk.common.utils.Pair     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.T1     // Catch:{ all -> 0x00fe }
            java.lang.String r7 = ""
            r5.<init>(r6, r7)     // Catch:{ all -> 0x00fe }
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x007c
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f38646h     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r9 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.UNDEFINED     // Catch:{ all -> 0x0078 }
            if (r1 != r9) goto L_0x006b
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f38644f     // Catch:{ all -> 0x0078 }
            boolean r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.f38645g     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            com.startapp.sdk.common.utils.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.m49709b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0040
        L_0x003c:
            com.startapp.sdk.common.utils.Pair r6 = com.startapp.sdk.adsbase.SimpleTokenUtils.m49706a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            boolean r1 = com.startapp.sdk.adsbase.SimpleTokenUtils.f38645g     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            com.startapp.sdk.adsbase.SimpleTokenUtils.f38645g = r1     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x004f
            goto L_0x0069
        L_0x004f:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            com.startapp.sdk.adsbase.e r0 = r0.mo31168d()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "shared_prefs_simple_token"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x007c
            S r1 = r6.second     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x007c
        L_0x0069:
            r5 = r6
            goto L_0x007c
        L_0x006b:
            if (r1 != r6) goto L_0x0072
            com.startapp.sdk.common.utils.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.m49706a((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x0072:
            com.startapp.sdk.common.utils.Pair r0 = com.startapp.sdk.adsbase.SimpleTokenUtils.m49709b((android.content.Context) r0)     // Catch:{ all -> 0x0078 }
        L_0x0076:
            r5 = r0
            goto L_0x007c
        L_0x0078:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00fe }
        L_0x007c:
            com.startapp.sdk.common.utils.Pair r0 = new com.startapp.sdk.common.utils.Pair     // Catch:{ all -> 0x00fe }
            F r1 = r5.first     // Catch:{ all -> 0x00fe }
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r1 = (com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType) r1     // Catch:{ all -> 0x00fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fe }
            S r2 = r5.second     // Catch:{ all -> 0x00fe }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)
            android.content.Context r1 = r10.f38769a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences r2 = r10.f38771c     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r3 = r10.f38773e     // Catch:{ all -> 0x00ee }
            r11.mo30338a(r1, r2, r3, r0)     // Catch:{ all -> 0x00ee }
            android.content.Context r1 = r10.f38769a     // Catch:{ all -> 0x00ee }
            r11.mo30904g(r1)     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x00ee }
            boolean r1 = r1.mo30451M()     // Catch:{ all -> 0x00ee }
            if (r1 != 0) goto L_0x00ae
            android.content.Context r1 = r10.f38769a     // Catch:{ all -> 0x00ee }
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r10.f38773e     // Catch:{ all -> 0x00ee }
            boolean r1 = com.startapp.sdk.adsbase.C9396a.m49790a((android.content.Context) r1, (com.startapp.sdk.adsbase.model.AdPreferences.Placement) r2)     // Catch:{ all -> 0x00ee }
            if (r1 == 0) goto L_0x00ae
            r11.f38921t0 = r8     // Catch:{ all -> 0x00ee }
        L_0x00ae:
            android.content.Context r0 = r10.f38769a     // Catch:{ all -> 0x00b6 }
            com.startapp.sdk.adsbase.model.AdPreferences r1 = r10.f38771c     // Catch:{ all -> 0x00b6 }
            r11.mo31505a(r0, r1)     // Catch:{ all -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x00ba:
            android.content.Context r0 = r10.f38769a     // Catch:{ all -> 0x00e9 }
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r0)     // Catch:{ all -> 0x00e9 }
            com.startapp.j6 r0 = r0.mo31180p()     // Catch:{ all -> 0x00e9 }
            double r0 = r0.mo29513b()     // Catch:{ all -> 0x00e9 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00ed
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "%d"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r5
            long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00e9 }
            r4[r7] = r0     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = java.lang.String.format(r2, r3, r4)     // Catch:{ all -> 0x00e9 }
            r11.f38907Q0 = r0     // Catch:{ all -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x00ed:
            return r11
        L_0x00ee:
            r11 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r11)
            F r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
            com.startapp.sdk.adsbase.SimpleTokenUtils$TokenType r11 = com.startapp.sdk.adsbase.SimpleTokenUtils.TokenType.m49716a(r11)
            com.startapp.sdk.adsbase.SimpleTokenUtils.f38646h = r11
            r11 = 0
            return r11
        L_0x00fe:
            r11 = move-exception
            monitor-exit(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C9400b.mo30657a(com.startapp.sdk.adsbase.model.GetAdRequest):com.startapp.sdk.adsbase.model.GetAdRequest");
    }
}
