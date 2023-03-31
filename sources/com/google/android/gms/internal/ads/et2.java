package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p023c4.C1859a;
import p023c4.C1863e;
import p023c4.C1868g;
import p060h4.C4484c1;
import p060h4.C4499e4;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class et2 {

    /* renamed from: a */
    public final C4499e4 f8930a;

    /* renamed from: b */
    public final f80 f8931b;

    /* renamed from: c */
    public final nc2 f8932c;

    /* renamed from: d */
    public final C4541l4 f8933d;

    /* renamed from: e */
    public final C4571q4 f8934e;

    /* renamed from: f */
    public final String f8935f;

    /* renamed from: g */
    public final ArrayList f8936g;

    /* renamed from: h */
    public final ArrayList f8937h;

    /* renamed from: i */
    public final f20 f8938i;

    /* renamed from: j */
    public final C4607w4 f8939j;

    /* renamed from: k */
    public final int f8940k;

    /* renamed from: l */
    public final C1859a f8941l;

    /* renamed from: m */
    public final C1868g f8942m;

    /* renamed from: n */
    public final C4609x0 f8943n;

    /* renamed from: o */
    public final qs2 f8944o;

    /* renamed from: p */
    public final boolean f8945p;

    /* renamed from: q */
    public final boolean f8946q;

    /* renamed from: r */
    public final C4484c1 f8947r;

    /* synthetic */ et2(ct2 ct2, dt2 dt2) {
        C4499e4 e4Var;
        f20 f20;
        this.f8934e = ct2.f7926b;
        this.f8935f = ct2.f7927c;
        this.f8947r = ct2.f7943s;
        int i = ct2.f7925a.f24889a;
        long j = ct2.f7925a.f24890b;
        Bundle bundle = ct2.f7925a.f24891c;
        int i2 = ct2.f7925a.f24892d;
        List list = ct2.f7925a.f24893e;
        boolean z = ct2.f7925a.f24894f;
        int i3 = ct2.f7925a.f24895g;
        boolean z2 = true;
        if (!ct2.f7925a.f24896h && !ct2.f7929e) {
            z2 = false;
        }
        this.f8933d = new C4541l4(i, j, bundle, i2, list, z, i3, z2, ct2.f7925a.f24897i, ct2.f7925a.f24898r, ct2.f7925a.f24899s, ct2.f7925a.f24900t, ct2.f7925a.f24901u, ct2.f7925a.f24902v, ct2.f7925a.f24903w, ct2.f7925a.f24904x, ct2.f7925a.f24905y, ct2.f7925a.f24906z, ct2.f7925a.f24883A, ct2.f7925a.f24884B, ct2.f7925a.f24885C, ct2.f7925a.f24886D, C4751b2.m30629x(ct2.f7925a.f24887E), ct2.f7925a.f24888F);
        if (ct2.f7928d != null) {
            e4Var = ct2.f7928d;
        } else {
            e4Var = ct2.f7932h != null ? ct2.f7932h.f9092f : null;
        }
        this.f8930a = e4Var;
        this.f8936g = ct2.f7930f;
        this.f8937h = ct2.f7931g;
        if (ct2.f7930f == null) {
            f20 = null;
        } else {
            f20 = ct2.f7932h == null ? new f20(new C1863e.C1864a().mo7097a()) : ct2.f7932h;
        }
        this.f8938i = f20;
        this.f8939j = ct2.f7933i;
        this.f8940k = ct2.f7937m;
        this.f8941l = ct2.f7934j;
        this.f8942m = ct2.f7935k;
        this.f8943n = ct2.f7936l;
        this.f8931b = ct2.f7938n;
        this.f8944o = new qs2(ct2.f7939o, (ps2) null);
        this.f8945p = ct2.f7940p;
        this.f8932c = ct2.f7941q;
        this.f8946q = ct2.f7942r;
    }

    /* renamed from: a */
    public final h40 mo10012a() {
        C1868g gVar = this.f8942m;
        if (gVar == null && this.f8941l == null) {
            return null;
        }
        if (gVar != null) {
            return gVar.mo7109J1();
        }
        return this.f8941l.mo7081J1();
    }
}
