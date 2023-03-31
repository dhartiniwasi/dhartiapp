package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class c63 extends o63 {

    /* renamed from: a */
    private final i63 f7620a;

    /* renamed from: b */
    final /* synthetic */ d63 f7621b;

    c63(d63 d63, i63 i63) {
        this.f7621b = d63;
        this.f7620a = i63;
    }

    /* renamed from: C4 */
    public final void mo9028C4(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        g63 c = h63.m13733c();
        c.mo10400b(i);
        if (string != null) {
            c.mo10399a(string);
        }
        this.f7620a.mo11027a(c.mo10401c());
        if (i == 8157) {
            this.f7621b.mo9439c();
        }
    }
}
