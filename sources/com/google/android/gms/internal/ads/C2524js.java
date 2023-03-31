package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p053g4.C4409t;

/* renamed from: com.google.android.gms.internal.ads.js */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2524js {

    /* renamed from: a */
    private final int f11765a;

    /* renamed from: b */
    private final int f11766b;

    /* renamed from: c */
    private final int f11767c;

    /* renamed from: d */
    private final boolean f11768d;

    /* renamed from: e */
    private final C3080ys f11769e;

    /* renamed from: f */
    private final C2450ht f11770f;

    /* renamed from: g */
    private final Object f11771g = new Object();

    /* renamed from: h */
    private final ArrayList f11772h = new ArrayList();

    /* renamed from: i */
    private final ArrayList f11773i = new ArrayList();

    /* renamed from: j */
    private final ArrayList f11774j = new ArrayList();

    /* renamed from: k */
    private int f11775k = 0;

    /* renamed from: l */
    private int f11776l = 0;

    /* renamed from: m */
    private int f11777m = 0;

    /* renamed from: n */
    private int f11778n;

    /* renamed from: o */
    private String f11779o = "";

    /* renamed from: p */
    private String f11780p = "";

    /* renamed from: q */
    private String f11781q = "";

    public C2524js(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f11765a = i;
        this.f11766b = i2;
        this.f11767c = i3;
        this.f11768d = z;
        this.f11769e = new C3080ys(i4);
        this.f11770f = new C2450ht(i5, i6, i7);
    }

    /* renamed from: p */
    private final void m15037p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f11767c) {
            synchronized (this.f11771g) {
                this.f11772h.add(str);
                this.f11775k += str.length();
                if (z) {
                    this.f11773i.add(str);
                    this.f11774j.add(new C2932us(f, f2, f3, f4, this.f11773i.size() - 1));
                }
            }
        }
    }

    /* renamed from: q */
    private static final String m15038q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        if (sb2.length() < 100) {
            return sb2;
        }
        return sb2.substring(0, 100);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo11488a(int i, int i2) {
        return this.f11768d ? this.f11766b : (i * this.f11765a) + (i2 * this.f11766b);
    }

    /* renamed from: b */
    public final int mo11489b() {
        return this.f11778n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo11490c() {
        return this.f11775k;
    }

    /* renamed from: d */
    public final String mo11491d() {
        return this.f11779o;
    }

    /* renamed from: e */
    public final String mo11492e() {
        return this.f11780p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2524js)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C2524js) obj).f11779o;
        return str != null && str.equals(this.f11779o);
    }

    /* renamed from: f */
    public final String mo11494f() {
        return this.f11781q;
    }

    /* renamed from: g */
    public final void mo11495g() {
        synchronized (this.f11771g) {
            this.f11777m--;
        }
    }

    /* renamed from: h */
    public final void mo11496h() {
        synchronized (this.f11771g) {
            this.f11777m++;
        }
    }

    public final int hashCode() {
        return this.f11779o.hashCode();
    }

    /* renamed from: i */
    public final void mo11498i() {
        synchronized (this.f11771g) {
            this.f11778n -= 100;
        }
    }

    /* renamed from: j */
    public final void mo11499j(int i) {
        this.f11776l = i;
    }

    /* renamed from: k */
    public final void mo11500k(String str, boolean z, float f, float f2, float f3, float f4) {
        m15037p(str, z, f, f2, f3, f4);
    }

    /* renamed from: l */
    public final void mo11501l(String str, boolean z, float f, float f2, float f3, float f4) {
        m15037p(str, z, f, f2, f3, f4);
        synchronized (this.f11771g) {
            if (this.f11777m < 0) {
                pm0.m18662b("ActivityContent: negative number of WebViews.");
            }
            mo11502m();
        }
    }

    /* renamed from: m */
    public final void mo11502m() {
        synchronized (this.f11771g) {
            int a = mo11488a(this.f11775k, this.f11776l);
            if (a > this.f11778n) {
                this.f11778n = a;
                if (!C4409t.m29325q().mo15117h().mo18520y()) {
                    this.f11779o = this.f11769e.mo15504a(this.f11772h);
                    this.f11780p = this.f11769e.mo15504a(this.f11773i);
                }
                if (!C4409t.m29325q().mo15117h().mo18508m()) {
                    this.f11781q = this.f11770f.mo10945a(this.f11773i, this.f11774j);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo11503n() {
        synchronized (this.f11771g) {
            int a = mo11488a(this.f11775k, this.f11776l);
            if (a > this.f11778n) {
                this.f11778n = a;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo11504o() {
        boolean z;
        synchronized (this.f11771g) {
            z = this.f11777m == 0;
        }
        return z;
    }

    public final String toString() {
        int i = this.f11776l;
        int i2 = this.f11778n;
        int i3 = this.f11775k;
        String q = m15038q(this.f11772h, 100);
        String q2 = m15038q(this.f11773i, 100);
        String str = this.f11779o;
        String str2 = this.f11780p;
        String str3 = this.f11781q;
        return "ActivityContent fetchId: " + i + " score:" + i2 + " total_length:" + i3 + "\n text: " + q + "\n viewableText" + q2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }
}
