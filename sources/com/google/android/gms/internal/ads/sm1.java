package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p053g4.C4409t;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sm1 extends z20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, un1 {

    /* renamed from: a */
    private final WeakReference f17585a;

    /* renamed from: b */
    private final Map f17586b = new HashMap();

    /* renamed from: c */
    private final Map f17587c = new HashMap();

    /* renamed from: d */
    private final Map f17588d = new HashMap();

    /* renamed from: e */
    private sl1 f17589e;

    /* renamed from: f */
    private C2931ur f17590f;

    public sm1(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        C4409t.m29334z();
        qn0.m19299a(view, this);
        C4409t.m29334z();
        qn0.m19300b(view, this);
        this.f17585a = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f17586b.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f17588d.putAll(this.f17586b);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f17587c.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f17588d.putAll(this.f17587c);
        this.f17590f = new C2931ur(view.getContext(), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14084B0(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r4 = r1.f17588d     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map r4 = r1.f17586b     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sm1.mo14084B0(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: O */
    public final synchronized View mo14085O(String str) {
        WeakReference weakReference = (WeakReference) this.f17588d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: T */
    public final View mo14086T() {
        return (View) this.f17585a.get();
    }

    /* renamed from: U */
    public final FrameLayout mo14087U() {
        return null;
    }

    /* renamed from: V */
    public final C2931ur mo14088V() {
        return this.f17590f;
    }

    /* renamed from: W */
    public final synchronized C4954a mo14089W() {
        return null;
    }

    /* renamed from: X */
    public final synchronized String mo14090X() {
        return "1007";
    }

    /* renamed from: Y */
    public final synchronized JSONObject mo14091Y() {
        return null;
    }

    /* renamed from: Z */
    public final synchronized Map mo14092Z() {
        return this.f17588d;
    }

    /* renamed from: a0 */
    public final synchronized Map mo14093a0() {
        return this.f17587c;
    }

    /* renamed from: b */
    public final synchronized void mo8188b() {
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14072s(this);
            this.f17589e = null;
        }
    }

    /* renamed from: b0 */
    public final synchronized JSONObject mo14094b0() {
        sl1 sl1 = this.f17589e;
        if (sl1 == null) {
            return null;
        }
        return sl1.mo14048H(mo14086T(), mo14092Z(), mo14095c0());
    }

    /* renamed from: c0 */
    public final synchronized Map mo14095c0() {
        return this.f17586b;
    }

    public final synchronized void onClick(View view) {
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14058S(view, mo14086T(), mo14092Z(), mo14095c0(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14056Q(mo14086T(), mo14092Z(), mo14095c0(), sl1.m20448w(mo14086T()));
        }
    }

    public final synchronized void onScrollChanged() {
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14056Q(mo14086T(), mo14092Z(), mo14095c0(), sl1.m20448w(mo14086T()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14064k(view, motionEvent, mo14086T());
        }
        return false;
    }

    /* renamed from: p0 */
    public final synchronized void mo8189p0(C4954a aVar) {
        if (this.f17589e != null) {
            Object P0 = C4956b.m31384P0(aVar);
            if (!(P0 instanceof View)) {
                pm0.m18667g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f17589e.mo14066m((View) P0);
        }
    }

    /* renamed from: v3 */
    public final synchronized void mo8190v3(C4954a aVar) {
        Object P0 = C4956b.m31384P0(aVar);
        if (!(P0 instanceof sl1)) {
            pm0.m18667g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        sl1 sl1 = this.f17589e;
        if (sl1 != null) {
            sl1.mo14072s(this);
        }
        sl1 sl12 = (sl1) P0;
        if (sl12.mo14073t()) {
            this.f17589e = sl12;
            sl12.mo14071r(this);
            this.f17589e.mo14063j(mo14086T());
            return;
        }
        pm0.m18664d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }
}
