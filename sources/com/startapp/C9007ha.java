package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.StaleDcConfig;

/* renamed from: com.startapp.ha */
/* compiled from: Sta */
public class C9007ha extends C9021i2<C8985ga> {

    /* renamed from: e */
    public final C9441e f36915e;

    /* renamed from: f */
    public final C8908d3<StaleDcConfig> f36916f;

    public C9007ha(Context context, C9441e eVar, C8908d3<StaleDcConfig> d3Var) {
        super(context, 86400000);
        this.f36915e = eVar;
        this.f36916f = d3Var;
    }

    /* renamed from: a */
    public Object mo29457a(boolean z) {
        C8985ga gaVar = new C8985ga();
        String str = null;
        if (!z) {
            str = this.f36915e.getString("a83b59c2138cbf65", (String) null);
        }
        if (str == null) {
            Context context = this.f36944a;
            context.getPackageName();
            str = C9605vb.m50468b(context);
            C9441e.C9442a a = this.f36915e.edit();
            a.mo30812a("a83b59c2138cbf65", str);
            a.f38873a.putString("a83b59c2138cbf65", str);
            a.apply();
        }
        gaVar.f36859a = str;
        return gaVar;
    }

    /* renamed from: c */
    public Object mo29309c() {
        return new C8985ga();
    }
}
