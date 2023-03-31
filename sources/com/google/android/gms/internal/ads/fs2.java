package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.regex.Pattern;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4509g2;
import p060h4.C4591u0;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fs2 extends qh0 {

    /* renamed from: a */
    private final ur2 f9441a;

    /* renamed from: b */
    private final kr2 f9442b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final vs2 f9443c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public pr1 f9444d;

    /* renamed from: e */
    private boolean f9445e = false;

    public fs2(ur2 ur2, kr2 kr2, vs2 vs2) {
        this.f9441a = ur2;
        this.f9442b = kr2;
        this.f9443c = vs2;
    }

    /* renamed from: L6 */
    private final synchronized boolean m12816L6() {
        pr1 pr1;
        pr1 = this.f9444d;
        return pr1 != null && !pr1.mo13346k();
    }

    /* renamed from: A */
    public final synchronized void mo10272A(String str) throws RemoteException {
        C4141r.m28216f("setUserId must be called on the main UI thread.");
        this.f9443c.f19233a = str;
    }

    /* renamed from: E3 */
    public final synchronized void mo10273E3(String str) throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.: setCustomData");
        this.f9443c.f19234b = str;
    }

    /* renamed from: G6 */
    public final void mo10274G6(C4591u0 u0Var) {
        C4141r.m28216f("setAdMetadataListener can only be called from the UI thread.");
        if (u0Var == null) {
            this.f9442b.mo11782k((y13) null);
        } else {
            this.f9442b.mo11782k(new es2(this, u0Var));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10275I0(p088l5.C4954a r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "destroy must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.kr2 r0 = r2.f9442b     // Catch:{ all -> 0x0027 }
            r1 = 0
            r0.mo11782k(r1)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.pr1 r0 = r2.f9444d     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            if (r3 != 0) goto L_0x0013
            goto L_0x001a
        L_0x0013:
            java.lang.Object r3 = p088l5.C4956b.m31384P0(r3)     // Catch:{ all -> 0x0027 }
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x0027 }
        L_0x001a:
            com.google.android.gms.internal.ads.pr1 r3 = r2.f9444d     // Catch:{ all -> 0x0027 }
            com.google.android.gms.internal.ads.va1 r3 = r3.mo14680d()     // Catch:{ all -> 0x0027 }
            r3.mo14701p0(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fs2.mo10275I0(l5.a):void");
    }

    /* renamed from: I5 */
    public final synchronized void mo10276I5(vh0 vh0) throws RemoteException {
        C4141r.m28216f("loadAd must be called on the main UI thread.");
        String str = vh0.f19094b;
        String str2 = (String) C4596v.m30088c().mo12227b(C2679nz.f14742y4);
        if (!(str2 == null || str == null)) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                C4409t.m29325q().mo15126t(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m12816L6()) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14247A4)).booleanValue()) {
                return;
            }
        }
        mr2 mr2 = new mr2((String) null);
        this.f9444d = null;
        this.f9441a.mo14600i(1);
        this.f9441a.mo9556a(vh0.f19093a, vh0.f19094b, mr2, new ds2(this));
    }

    /* renamed from: L */
    public final synchronized void mo10277L(C4954a aVar) {
        Context context;
        C4141r.m28216f("pause must be called on the main UI thread.");
        if (this.f9444d != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C4956b.m31384P0(aVar);
            }
            this.f9444d.mo14680d().mo14702q0(context);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10278P(p088l5.C4954a r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            p033d5.C4141r.m28216f(r0)     // Catch:{ all -> 0x0024 }
            com.google.android.gms.internal.ads.pr1 r0 = r2.f9444d     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0022
            r0 = 0
            if (r3 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            java.lang.Object r3 = p088l5.C4956b.m31384P0(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof android.app.Activity     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x0024 }
        L_0x0019:
            com.google.android.gms.internal.ads.pr1 r3 = r2.f9444d     // Catch:{ all -> 0x0024 }
            boolean r1 = r2.f9445e     // Catch:{ all -> 0x0024 }
            r3.mo13349n(r1, r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0022:
            monitor-exit(r2)
            return
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fs2.mo10278P(l5.a):void");
    }

    /* renamed from: U */
    public final void mo10279U() {
        mo10277L((C4954a) null);
    }

    /* renamed from: W */
    public final void mo10280W() {
        mo10291y2((C4954a) null);
    }

    /* renamed from: a */
    public final void mo10281a() throws RemoteException {
        mo10275I0((C4954a) null);
    }

    /* renamed from: b */
    public final synchronized String mo10282b() throws RemoteException {
        pr1 pr1 = this.f9444d;
        if (pr1 == null || pr1.mo14679c() == null) {
            return null;
        }
        return pr1.mo14679c().mo12867c();
    }

    /* renamed from: d */
    public final Bundle mo10283d() {
        C4141r.m28216f("getAdMetadata can only be called from the UI thread.");
        pr1 pr1 = this.f9444d;
        return pr1 != null ? pr1.mo13343h() : new Bundle();
    }

    /* renamed from: d0 */
    public final boolean mo10284d0() throws RemoteException {
        C4141r.m28216f("isLoaded must be called on the main UI thread.");
        return m12816L6();
    }

    /* renamed from: e */
    public final synchronized C4509g2 mo10285e() throws RemoteException {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue()) {
            return null;
        }
        pr1 pr1 = this.f9444d;
        if (pr1 == null) {
            return null;
        }
        return pr1.mo14679c();
    }

    /* renamed from: e2 */
    public final synchronized void mo10286e2(boolean z) {
        C4141r.m28216f("setImmersiveMode must be called on the main UI thread.");
        this.f9445e = z;
    }

    /* renamed from: g */
    public final boolean mo10287g() {
        pr1 pr1 = this.f9444d;
        return pr1 != null && pr1.mo13348m();
    }

    /* renamed from: h */
    public final synchronized void mo10288h() throws RemoteException {
        mo10278P((C4954a) null);
    }

    /* renamed from: h6 */
    public final void mo10289h6(uh0 uh0) throws RemoteException {
        C4141r.m28216f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f9442b.mo11778F(uh0);
    }

    /* renamed from: p5 */
    public final void mo10290p5(ph0 ph0) {
        C4141r.m28216f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f9442b.mo11779L(ph0);
    }

    /* renamed from: y2 */
    public final synchronized void mo10291y2(C4954a aVar) {
        Context context;
        C4141r.m28216f("resume must be called on the main UI thread.");
        if (this.f9444d != null) {
            if (aVar == null) {
                context = null;
            } else {
                context = (Context) C4956b.m31384P0(aVar);
            }
            this.f9444d.mo14680d().mo14703s0(context);
        }
    }
}
