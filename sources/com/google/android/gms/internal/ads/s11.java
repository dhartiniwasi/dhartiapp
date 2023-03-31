package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s11 {

    /* renamed from: a */
    private final String f17186a;

    /* renamed from: b */
    private final ya0 f17187b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f17188c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public x11 f17189d;

    /* renamed from: e */
    private final e60 f17190e = new p11(this);

    /* renamed from: f */
    private final e60 f17191f = new r11(this);

    public s11(String str, ya0 ya0, Executor executor) {
        this.f17186a = str;
        this.f17187b = ya0;
        this.f17188c = executor;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ boolean m20109g(s11 s11, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(s11.f17186a);
    }

    /* renamed from: c */
    public final void mo13928c(x11 x11) {
        this.f17187b.mo15353b("/updateActiveView", this.f17190e);
        this.f17187b.mo15353b("/untrackActiveViewUnit", this.f17191f);
        this.f17189d = x11;
    }

    /* renamed from: d */
    public final void mo13929d(vs0 vs0) {
        vs0.mo12105d1("/updateActiveView", this.f17190e);
        vs0.mo12105d1("/untrackActiveViewUnit", this.f17191f);
    }

    /* renamed from: e */
    public final void mo13930e() {
        this.f17187b.mo15354c("/updateActiveView", this.f17190e);
        this.f17187b.mo15354c("/untrackActiveViewUnit", this.f17191f);
    }

    /* renamed from: f */
    public final void mo13931f(vs0 vs0) {
        vs0.mo12103c1("/updateActiveView", this.f17190e);
        vs0.mo12103c1("/untrackActiveViewUnit", this.f17191f);
    }
}
