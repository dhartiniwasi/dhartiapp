package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p023c4.C1863e;
import p060h4.C4499e4;
import p087l4.C4947s;
import p108o4.C5220b;
import p179z3.C6357y;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class tc0 implements C4947s {

    /* renamed from: a */
    private final Date f17940a;

    /* renamed from: b */
    private final int f17941b;

    /* renamed from: c */
    private final Set f17942c;

    /* renamed from: d */
    private final boolean f17943d;

    /* renamed from: e */
    private final Location f17944e;

    /* renamed from: f */
    private final int f17945f;

    /* renamed from: g */
    private final f20 f17946g;

    /* renamed from: h */
    private final List f17947h = new ArrayList();

    /* renamed from: i */
    private final boolean f17948i;

    /* renamed from: j */
    private final Map f17949j = new HashMap();

    /* renamed from: k */
    private final String f17950k;

    public tc0(Date date, int i, Set set, Location location, boolean z, int i2, f20 f20, List list, boolean z2, int i3, String str) {
        this.f17940a = date;
        this.f17941b = i;
        this.f17942c = set;
        this.f17944e = location;
        this.f17943d = z;
        this.f17945f = i2;
        this.f17946g = f20;
        this.f17948i = z2;
        this.f17950k = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.startsWith("custom:")) {
                    String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f17949j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f17949j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f17947h.add(str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final C5220b mo14277a() {
        return f20.m12400I1(this.f17946g);
    }

    /* renamed from: b */
    public final int mo11075b() {
        return this.f17945f;
    }

    /* renamed from: c */
    public final boolean mo14278c() {
        return this.f17947h.contains("6");
    }

    /* renamed from: d */
    public final boolean mo14279d() {
        return this.f17947h.contains("3");
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo11076e() {
        return this.f17948i;
    }

    @Deprecated
    /* renamed from: f */
    public final Date mo11077f() {
        return this.f17940a;
    }

    /* renamed from: g */
    public final boolean mo11078g() {
        return this.f17943d;
    }

    /* renamed from: h */
    public final Set<String> mo11079h() {
        return this.f17942c;
    }

    /* renamed from: i */
    public final C1863e mo14280i() {
        f20 f20 = this.f17946g;
        C1863e.C1864a aVar = new C1863e.C1864a();
        if (f20 == null) {
            return aVar.mo7097a();
        }
        int i = f20.f9087a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.mo7101e(f20.f9093g);
                    aVar.mo7100d(f20.f9094h);
                }
                aVar.mo7103g(f20.f9088b);
                aVar.mo7099c(f20.f9089c);
                aVar.mo7102f(f20.f9090d);
                return aVar.mo7097a();
            }
            C4499e4 e4Var = f20.f9092f;
            if (e4Var != null) {
                aVar.mo7104h(new C6357y(e4Var));
            }
        }
        aVar.mo7098b(f20.f9091e);
        aVar.mo7103g(f20.f9088b);
        aVar.mo7099c(f20.f9089c);
        aVar.mo7102f(f20.f9090d);
        return aVar.mo7097a();
    }

    @Deprecated
    /* renamed from: j */
    public final int mo11080j() {
        return this.f17941b;
    }

    public final Map zza() {
        return this.f17949j;
    }
}
