package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4390a;
import p053g4.C4401l;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class et0 implements he3 {

    /* renamed from: a */
    public final /* synthetic */ Context f8920a;

    /* renamed from: b */
    public final /* synthetic */ C2955ve f8921b;

    /* renamed from: c */
    public final /* synthetic */ vm0 f8922c;

    /* renamed from: d */
    public final /* synthetic */ C4390a f8923d;

    /* renamed from: e */
    public final /* synthetic */ String f8924e;

    public /* synthetic */ et0(Context context, C2955ve veVar, vm0 vm0, C4390a aVar, String str) {
        this.f8920a = context;
        this.f8921b = veVar;
        this.f8922c = vm0;
        this.f8923d = aVar;
        this.f8924e = str;
    }

    public final lf3 zza() {
        Context context = this.f8920a;
        C2955ve veVar = this.f8921b;
        vm0 vm0 = this.f8922c;
        C4390a aVar = this.f8923d;
        String str = this.f8924e;
        C4409t.m29308B();
        vs0 a = it0.m14546a(context, mu0.m16708a(), "", false, false, veVar, (n00) null, vm0, (c00) null, (C4401l) null, aVar, C2971vu.m22435a(), (is2) null, (ls2) null);
        hn0 f = hn0.m13926f(a);
        a.mo12108f0().mo9283G(new ft0(f));
        a.loadUrl(str);
        return f;
    }
}
