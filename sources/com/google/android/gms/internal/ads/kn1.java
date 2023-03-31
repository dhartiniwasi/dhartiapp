package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kn1 {

    /* renamed from: a */
    private final ls1 f12176a;

    /* renamed from: b */
    private final zq1 f12177b;

    /* renamed from: c */
    private final h21 f12178c;

    /* renamed from: d */
    private final fm1 f12179d;

    public kn1(ls1 ls1, zq1 zq1, h21 h21, fm1 fm1) {
        this.f12176a = ls1;
        this.f12177b = zq1;
        this.f12178c = h21;
        this.f12179d = fm1;
    }

    /* renamed from: a */
    public final View mo11729a() throws ht0 {
        vs0 a = this.f12176a.mo12076a(C4571q4.m29983K1(), (is2) null, (ls2) null);
        ((View) a).setVisibility(8);
        a.mo12105d1("/sendMessageToSdk", new dn1(this));
        a.mo12105d1("/adMuted", new en1(this));
        this.f12177b.mo15648j(new WeakReference(a), "/loadHtml", new fn1(this));
        this.f12177b.mo15648j(new WeakReference(a), "/showOverlay", new gn1(this));
        this.f12177b.mo15648j(new WeakReference(a), "/hideOverlay", new hn1(this));
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo11730b(vs0 vs0, Map map) {
        this.f12177b.mo15645g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo11731c(vs0 vs0, Map map) {
        this.f12179d.mo10191T();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo11732d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f12177b.mo15645g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11733e(vs0 vs0, Map map) {
        pm0.m18666f("Showing native ads overlay.");
        vs0.mo10647w().setVisibility(0);
        this.f12178c.mo10719d(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11734f(vs0 vs0, Map map) {
        pm0.m18666f("Hiding native ads overlay.");
        vs0.mo10647w().setVisibility(8);
        this.f12178c.mo10719d(false);
    }
}
