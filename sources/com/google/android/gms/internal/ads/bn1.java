package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p067i5.C4691e;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bn1 implements View.OnClickListener {

    /* renamed from: a */
    private final zq1 f7372a;

    /* renamed from: b */
    private final C4691e f7373b;

    /* renamed from: c */
    private j40 f7374c;

    /* renamed from: d */
    private e60 f7375d;

    /* renamed from: e */
    String f7376e;

    /* renamed from: f */
    Long f7377f;

    /* renamed from: g */
    WeakReference f7378g;

    public bn1(zq1 zq1, C4691e eVar) {
        this.f7372a = zq1;
        this.f7373b = eVar;
    }

    /* renamed from: d */
    private final void m10497d() {
        View view;
        this.f7376e = null;
        this.f7377f = null;
        WeakReference weakReference = this.f7378g;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f7378g = null;
        }
    }

    /* renamed from: a */
    public final j40 mo8887a() {
        return this.f7374c;
    }

    /* renamed from: b */
    public final void mo8888b() {
        if (this.f7374c != null && this.f7377f != null) {
            m10497d();
            try {
                this.f7374c.mo11015a();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo8889c(j40 j40) {
        this.f7374c = j40;
        e60 e60 = this.f7375d;
        if (e60 != null) {
            this.f7372a.mo15649k("/unconfirmedClick", e60);
        }
        an1 an1 = new an1(this, j40);
        this.f7375d = an1;
        this.f7372a.mo15647i("/unconfirmedClick", an1);
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.f7378g;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f7376e == null || this.f7377f == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f7376e);
                hashMap.put("time_interval", String.valueOf(this.f7373b.mo18370a() - this.f7377f.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f7372a.mo15645g("sendMessageToNativeJs", hashMap);
            }
            m10497d();
        }
    }
}
