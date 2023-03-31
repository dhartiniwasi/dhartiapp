package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p124r.C5426g;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jm1 {

    /* renamed from: h */
    public static final jm1 f11705h = new jm1(new gm1());

    /* renamed from: a */
    private final r30 f11706a;

    /* renamed from: b */
    private final o30 f11707b;

    /* renamed from: c */
    private final e40 f11708c;

    /* renamed from: d */
    private final b40 f11709d;

    /* renamed from: e */
    private final o80 f11710e;

    /* renamed from: f */
    private final C5426g f11711f;

    /* renamed from: g */
    private final C5426g f11712g;

    private jm1(gm1 gm1) {
        this.f11706a = gm1.f9995a;
        this.f11707b = gm1.f9996b;
        this.f11708c = gm1.f9997c;
        this.f11711f = new C5426g(gm1.f10000f);
        this.f11712g = new C5426g(gm1.f10001g);
        this.f11709d = gm1.f9998d;
        this.f11710e = gm1.f9999e;
    }

    /* renamed from: a */
    public final o30 mo11439a() {
        return this.f11707b;
    }

    /* renamed from: b */
    public final r30 mo11440b() {
        return this.f11706a;
    }

    /* renamed from: c */
    public final u30 mo11441c(String str) {
        return (u30) this.f11712g.get(str);
    }

    /* renamed from: d */
    public final x30 mo11442d(String str) {
        return (x30) this.f11711f.get(str);
    }

    /* renamed from: e */
    public final b40 mo11443e() {
        return this.f11709d;
    }

    /* renamed from: f */
    public final e40 mo11444f() {
        return this.f11708c;
    }

    /* renamed from: g */
    public final o80 mo11445g() {
        return this.f11710e;
    }

    /* renamed from: h */
    public final ArrayList mo11446h() {
        ArrayList arrayList = new ArrayList(this.f11711f.size());
        for (int i = 0; i < this.f11711f.size(); i++) {
            arrayList.add((String) this.f11711f.mo19668j(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    public final ArrayList mo11447i() {
        ArrayList arrayList = new ArrayList();
        if (this.f11708c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f11706a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f11707b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f11711f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f11710e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
