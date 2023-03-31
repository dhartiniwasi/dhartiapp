package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dj2 implements tj2 {

    /* renamed from: a */
    private final sk0 f8293a;

    /* renamed from: b */
    private final mf3 f8294b;

    /* renamed from: c */
    private final Context f8295c;

    public dj2(sk0 sk0, mf3 mf3, Context context) {
        this.f8293a = sk0;
        this.f8294b = mf3;
        this.f8295c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ej2 mo9606a() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.f8293a.mo14043z(this.f8295c)) {
            return new ej2((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String j = this.f8293a.mo14027j(this.f8295c);
        String str4 = j == null ? "" : j;
        String h = this.f8293a.mo14025h(this.f8295c);
        if (h == null) {
            str = "";
        } else {
            str = h;
        }
        String f = this.f8293a.mo14023f(this.f8295c);
        if (f == null) {
            str2 = "";
        } else {
            str2 = f;
        }
        String g = this.f8293a.mo14024g(this.f8295c);
        if (g == null) {
            str3 = "";
        } else {
            str3 = g;
        }
        return new ej2(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) C4596v.m30088c().mo12227b(C2679nz.f14528d0) : null);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f8294b.mo12324a(new cj2(this));
    }

    public final int zza() {
        return 34;
    }
}
