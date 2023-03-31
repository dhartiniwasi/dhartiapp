package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a03 extends wz2 {

    /* renamed from: i */
    private static final Pattern f6354i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final yz2 f6355a;

    /* renamed from: b */
    private final xz2 f6356b;

    /* renamed from: c */
    private final List f6357c = new ArrayList();

    /* renamed from: d */
    private w13 f6358d;

    /* renamed from: e */
    private y03 f6359e;

    /* renamed from: f */
    private boolean f6360f = false;

    /* renamed from: g */
    private boolean f6361g = false;

    /* renamed from: h */
    private final String f6362h;

    a03(xz2 xz2, yz2 yz2) {
        this.f6356b = xz2;
        this.f6355a = yz2;
        this.f6362h = UUID.randomUUID().toString();
        m9524k((View) null);
        if (yz2.mo15525d() == zz2.HTML || yz2.mo15525d() == zz2.JAVASCRIPT) {
            this.f6359e = new z03(yz2.mo15524a());
        } else {
            this.f6359e = new b13(yz2.mo15530i(), (String) null);
        }
        this.f6359e.mo8646j();
        m03.m16344a().mo12246d(this);
        r03.m19513a().mo13636d(this.f6359e.mo15262a(), xz2.mo15260b());
    }

    /* renamed from: k */
    private final void m9524k(View view) {
        this.f6358d = new w13(view);
    }

    /* renamed from: b */
    public final void mo8157b(View view, c03 c03, String str) {
        o03 o03;
        if (this.f6361g) {
            return;
        }
        if (f6354i.matcher("Ad overlay").matches()) {
            Iterator it = this.f6357c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    o03 = null;
                    break;
                }
                o03 = (o03) it.next();
                if (o03.mo12777b().get() == view) {
                    break;
                }
            }
            if (o03 == null) {
                this.f6357c.add(new o03(view, c03, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    /* renamed from: c */
    public final void mo8158c() {
        if (!this.f6361g) {
            this.f6358d.clear();
            if (!this.f6361g) {
                this.f6357c.clear();
            }
            this.f6361g = true;
            r03.m19513a().mo13635c(this.f6359e.mo15262a());
            m03.m16344a().mo12247e(this);
            this.f6359e.mo8644c();
            this.f6359e = null;
        }
    }

    /* renamed from: d */
    public final void mo8159d(View view) {
        if (!this.f6361g && mo8161f() != view) {
            m9524k(view);
            this.f6359e.mo15263b();
            Collection<a03> c = m03.m16344a().mo12245c();
            if (c != null && !c.isEmpty()) {
                for (a03 a03 : c) {
                    if (a03 != this && a03.mo8161f() == view) {
                        a03.f6358d.clear();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo8160e() {
        if (!this.f6360f) {
            this.f6360f = true;
            m03.m16344a().mo12248f(this);
            this.f6359e.mo15267h(s03.m20100b().mo13917a());
            this.f6359e.mo8645f(this, this.f6355a);
        }
    }

    /* renamed from: f */
    public final View mo8161f() {
        return (View) this.f6358d.get();
    }

    /* renamed from: g */
    public final y03 mo8162g() {
        return this.f6359e;
    }

    /* renamed from: h */
    public final String mo8163h() {
        return this.f6362h;
    }

    /* renamed from: i */
    public final List mo8164i() {
        return this.f6357c;
    }

    /* renamed from: j */
    public final boolean mo8165j() {
        return this.f6360f && !this.f6361g;
    }
}
