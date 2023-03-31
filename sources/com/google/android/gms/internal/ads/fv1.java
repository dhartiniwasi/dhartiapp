package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fv1 {

    /* renamed from: a */
    private final Map f9470a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ gv1 f9471b;

    fv1(gv1 gv1) {
        this.f9471b = gv1;
    }

    /* renamed from: b */
    public final fv1 mo10303b(String str, String str2) {
        this.f9470a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final fv1 mo10304c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f9470a.put(str, str2);
        }
        return this;
    }

    /* renamed from: d */
    public final fv1 mo10305d(is2 is2) {
        this.f9470a.put("aai", is2.f11007x);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14534d6)).booleanValue()) {
            mo10304c("rid", is2.f10999p0);
        }
        return this;
    }

    /* renamed from: e */
    public final fv1 mo10306e(ls2 ls2) {
        this.f9470a.put("gqi", ls2.f12930b);
        return this;
    }

    /* renamed from: f */
    public final String mo10307f() {
        return this.f9471b.f10068a.mo12714b(this.f9470a);
    }

    /* renamed from: g */
    public final void mo10308g() {
        this.f9471b.f10069b.execute(new ev1(this));
    }

    /* renamed from: h */
    public final void mo10309h() {
        this.f9471b.f10069b.execute(new dv1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo10310i() {
        this.f9471b.f10068a.mo12717e(this.f9470a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo10311j() {
        this.f9471b.f10068a.mo12716d(this.f9470a);
    }
}
