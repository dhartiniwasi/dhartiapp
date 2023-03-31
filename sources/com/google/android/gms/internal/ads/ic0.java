package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;
import p087l4.C4933e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ic0 implements C4933e {

    /* renamed from: a */
    private final Date f10727a;

    /* renamed from: b */
    private final int f10728b;

    /* renamed from: c */
    private final Set f10729c;

    /* renamed from: d */
    private final boolean f10730d;

    /* renamed from: e */
    private final Location f10731e;

    /* renamed from: f */
    private final int f10732f;

    /* renamed from: g */
    private final boolean f10733g;

    /* renamed from: h */
    private final String f10734h;

    public ic0(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f10727a = date;
        this.f10728b = i;
        this.f10729c = set;
        this.f10731e = location;
        this.f10730d = z;
        this.f10732f = i2;
        this.f10733g = z2;
        this.f10734h = str;
    }

    /* renamed from: b */
    public final int mo11075b() {
        return this.f10732f;
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo11076e() {
        return this.f10733g;
    }

    @Deprecated
    /* renamed from: f */
    public final Date mo11077f() {
        return this.f10727a;
    }

    /* renamed from: g */
    public final boolean mo11078g() {
        return this.f10730d;
    }

    /* renamed from: h */
    public final Set<String> mo11079h() {
        return this.f10729c;
    }

    @Deprecated
    /* renamed from: j */
    public final int mo11080j() {
        return this.f10728b;
    }
}
