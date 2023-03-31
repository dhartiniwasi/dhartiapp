package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4562p1;
import p060h4.C4580s1;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xn1 implements fm1 {

    /* renamed from: a */
    private final fc0 f20260a;

    /* renamed from: b */
    private final oa1 f20261b;

    /* renamed from: c */
    private final t91 f20262c;

    /* renamed from: d */
    private final oh1 f20263d;

    /* renamed from: e */
    private final Context f20264e;

    /* renamed from: f */
    private final is2 f20265f;

    /* renamed from: g */
    private final vm0 f20266g;

    /* renamed from: h */
    private final et2 f20267h;

    /* renamed from: i */
    private boolean f20268i = false;

    /* renamed from: j */
    private boolean f20269j = false;

    /* renamed from: k */
    private boolean f20270k = true;

    /* renamed from: l */
    private final bc0 f20271l;

    /* renamed from: m */
    private final cc0 f20272m;

    public xn1(bc0 bc0, cc0 cc0, fc0 fc0, oa1 oa1, t91 t91, oh1 oh1, Context context, is2 is2, vm0 vm0, et2 et2, byte[] bArr) {
        this.f20271l = bc0;
        this.f20272m = cc0;
        this.f20260a = fc0;
        this.f20261b = oa1;
        this.f20262c = t91;
        this.f20263d = oh1;
        this.f20264e = context;
        this.f20265f = is2;
        this.f20266g = vm0;
        this.f20267h = et2;
    }

    /* renamed from: s */
    private final void m23433s(View view) {
        try {
            fc0 fc0 = this.f20260a;
            if (fc0 == null || fc0.mo9530h0()) {
                bc0 bc0 = this.f20271l;
                if (bc0 == null || bc0.mo8724N6()) {
                    cc0 cc0 = this.f20272m;
                    if (cc0 != null && !cc0.mo9115O6()) {
                        this.f20272m.mo9111K6(C4956b.m31385o3(view));
                        this.f20262c.onAdClicked();
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
                            this.f20263d.mo9272h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f20271l.mo8721K6(C4956b.m31385o3(view));
                this.f20262c.onAdClicked();
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
                    this.f20263d.mo9272h();
                    return;
                }
                return;
            }
            this.f20260a.mo9513U1(C4956b.m31385o3(view));
            this.f20262c.onAdClicked();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14726w8)).booleanValue()) {
                this.f20263d.mo9272h();
            }
        } catch (RemoteException e) {
            pm0.m18668h("Failed to call handleClick", e);
        }
    }

    /* renamed from: t */
    private static final HashMap m23434t(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: T */
    public final void mo10191T() {
        throw null;
    }

    /* renamed from: U */
    public final void mo10192U() {
    }

    /* renamed from: Y */
    public final void mo10193Y() {
    }

    /* renamed from: a */
    public final void mo10194a(j40 j40) {
    }

    /* renamed from: b */
    public final JSONObject mo10195b(View view, Map map, Map map2) {
        return null;
    }

    /* renamed from: c */
    public final void mo10196c() {
    }

    /* renamed from: d */
    public final void mo10197d(View view, MotionEvent motionEvent, View view2) {
    }

    /* renamed from: e */
    public final void mo10198e(String str) {
    }

    /* renamed from: f */
    public final void mo10199f(View view, View view2, Map map, Map map2, boolean z) {
        if (!this.f20269j || !this.f20265f.f10954M) {
            m23433s(view);
        }
    }

    /* renamed from: g */
    public final void mo10200g(View view) {
    }

    /* renamed from: h */
    public final void mo10201h() {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10202i(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            l5.a r9 = p088l5.C4956b.m31385o3(r9)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.is2 r12 = r8.f20265f     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONObject r12 = r12.f10991l0     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.ez r13 = com.google.android.gms.internal.ads.C2679nz.f14659q1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r13 = r0.mo12227b(r13)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x0124 }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x00e0
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x0124 }
            if (r13 != 0) goto L_0x0024
            goto L_0x00e0
        L_0x0024:
            if (r10 != 0) goto L_0x002c
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r13.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x002d
        L_0x002c:
            r13 = r10
        L_0x002d:
            if (r11 != 0) goto L_0x0035
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0124 }
            goto L_0x0036
        L_0x0035:
            r2 = r11
        L_0x0036:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ RemoteException -> 0x0124 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r13)     // Catch:{ RemoteException -> 0x0124 }
            r3.putAll(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x0124 }
        L_0x0045:
            boolean r2 = r13.hasNext()     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00e0
            java.lang.Object r2 = r13.next()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ RemoteException -> 0x0124 }
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch:{ RemoteException -> 0x0124 }
            if (r4 == 0) goto L_0x0045
            java.lang.Object r5 = r3.get(r2)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0062
        L_0x005f:
            r0 = 0
            goto L_0x00e0
        L_0x0062:
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x0124 }
            if (r5 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.ez r6 = com.google.android.gms.internal.ads.C2679nz.f14669r1     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.lz r7 = p060h4.C4596v.m30088c()     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Object r6 = r7.mo12227b(r6)     // Catch:{ RemoteException -> 0x0124 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x0124 }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x0124 }
            if (r6 == 0) goto L_0x00b3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.fc0 r2 = r8.f20260a     // Catch:{ RemoteException -> 0x0124 }
            r5 = 0
            if (r2 == 0) goto L_0x0093
            l5.a r2 = r2.mo9521a0()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x0091:
            goto L_0x00ac
        L_0x0093:
            com.google.android.gms.internal.ads.bc0 r2 = r8.f20271l     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x009c
            l5.a r2 = r2.mo8719I6()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x009c:
            com.google.android.gms.internal.ads.cc0 r2 = r8.f20272m     // Catch:{ RemoteException -> 0x0124 }
            if (r2 == 0) goto L_0x00a5
            l5.a r2 = r2.mo9108H6()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r5
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            java.lang.Object r5 = p088l5.C4956b.m31384P0(r2)     // Catch:{  }
        L_0x00ac:
            if (r5 != 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            java.lang.Class r5 = r5.getClass()     // Catch:{ RemoteException -> 0x0124 }
        L_0x00b3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0045 }
            r2.<init>()     // Catch:{ JSONException -> 0x0045 }
            p073j4.C4820w0.m30813c(r4, r2)     // Catch:{ JSONException -> 0x0045 }
            p053g4.C4409t.m29326r()     // Catch:{ JSONException -> 0x0045 }
            android.content.Context r4 = r8.f20264e     // Catch:{ JSONException -> 0x0045 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ JSONException -> 0x0045 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0045 }
        L_0x00c8:
            boolean r6 = r2.hasNext()     // Catch:{ JSONException -> 0x0045 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r2.next()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0045 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch:{ all -> 0x00c8 }
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ all -> 0x00c8 }
            if (r6 == 0) goto L_0x00c8
            goto L_0x0045
        L_0x00e0:
            r8.f20270k = r0     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r10 = m23434t(r10)     // Catch:{ RemoteException -> 0x0124 }
            java.util.HashMap r11 = m23434t(r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.fc0 r12 = r8.f20260a     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x00fa
            l5.a r10 = p088l5.C4956b.m31385o3(r10)     // Catch:{ RemoteException -> 0x0124 }
            l5.a r11 = p088l5.C4956b.m31385o3(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo9533n1(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x00fa:
            com.google.android.gms.internal.ads.bc0 r12 = r8.f20271l     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x010f
            l5.a r10 = p088l5.C4956b.m31385o3(r10)     // Catch:{ RemoteException -> 0x0124 }
            l5.a r11 = p088l5.C4956b.m31385o3(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo8723M6(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.bc0 r10 = r8.f20271l     // Catch:{ RemoteException -> 0x0124 }
            r10.mo8722L6(r9)     // Catch:{ RemoteException -> 0x0124 }
            return
        L_0x010f:
            com.google.android.gms.internal.ads.cc0 r12 = r8.f20272m     // Catch:{ RemoteException -> 0x0124 }
            if (r12 == 0) goto L_0x0123
            l5.a r10 = p088l5.C4956b.m31385o3(r10)     // Catch:{ RemoteException -> 0x0124 }
            l5.a r11 = p088l5.C4956b.m31385o3(r11)     // Catch:{ RemoteException -> 0x0124 }
            r12.mo9113M6(r9, r10, r11)     // Catch:{ RemoteException -> 0x0124 }
            com.google.android.gms.internal.ads.cc0 r10 = r8.f20272m     // Catch:{ RemoteException -> 0x0124 }
            r10.mo9112L6(r9)     // Catch:{ RemoteException -> 0x0124 }
        L_0x0123:
            return
        L_0x0124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.internal.ads.pm0.m18668h(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xn1.mo10202i(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    /* renamed from: j */
    public final void mo10203j() {
        this.f20269j = true;
    }

    /* renamed from: j0 */
    public final boolean mo10204j0() {
        return this.f20265f.f10954M;
    }

    /* renamed from: k */
    public final boolean mo10205k(Bundle bundle) {
        return false;
    }

    /* renamed from: l */
    public final void mo10206l(Bundle bundle) {
    }

    /* renamed from: m */
    public final void mo10207m(View view, Map map, Map map2) {
        try {
            if (!this.f20268i) {
                this.f20268i = C4409t.m29329u().mo18567n(this.f20264e, this.f20266g.f19150a, this.f20265f.f10945D.toString(), this.f20267h.f8935f);
            }
            if (this.f20270k) {
                fc0 fc0 = this.f20260a;
                if (fc0 != null) {
                    if (!fc0.mo9532l0()) {
                        this.f20260a.mo9534q();
                        this.f20261b.zza();
                        return;
                    }
                }
                bc0 bc0 = this.f20271l;
                if (bc0 != null) {
                    if (!bc0.mo8725O6()) {
                        this.f20271l.mo8735g();
                        this.f20261b.zza();
                        return;
                    }
                }
                cc0 cc0 = this.f20272m;
                if (cc0 != null && !cc0.mo9116P6()) {
                    this.f20272m.mo9124e0();
                    this.f20261b.zza();
                }
            }
        } catch (RemoteException e) {
            pm0.m18668h("Failed to call recordImpression", e);
        }
    }

    /* renamed from: n */
    public final void mo10208n(C4562p1 p1Var) {
        pm0.m18667g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: o */
    public final void mo10209o(View view, Map map) {
        try {
            C4954a o3 = C4956b.m31385o3(view);
            fc0 fc0 = this.f20260a;
            if (fc0 != null) {
                fc0.mo9514U3(o3);
                return;
            }
            bc0 bc0 = this.f20271l;
            if (bc0 != null) {
                bc0.mo8728U1(o3);
                return;
            }
            cc0 cc0 = this.f20272m;
            if (cc0 != null) {
                cc0.mo9114N6(o3);
            }
        } catch (RemoteException e) {
            pm0.m18668h("Failed to call untrackView", e);
        }
    }

    /* renamed from: p */
    public final void mo10210p(C4580s1 s1Var) {
        pm0.m18667g("Mute This Ad is not supported for 3rd party ads");
    }

    /* renamed from: q */
    public final void mo10211q(View view, Map map, Map map2, boolean z) {
        if (!this.f20269j) {
            pm0.m18667g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.f20265f.f10954M) {
            pm0.m18667g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            m23433s(view);
        }
    }

    /* renamed from: r */
    public final JSONObject mo10212r(View view, Map map, Map map2) {
        return null;
    }

    /* renamed from: z0 */
    public final void mo10213z0(Bundle bundle) {
    }
}
