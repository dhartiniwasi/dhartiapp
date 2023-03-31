package p128r3;

import android.text.Layout;

/* renamed from: r3.g */
/* compiled from: TtmlStyle */
final class C5452g {

    /* renamed from: a */
    private String f27752a;

    /* renamed from: b */
    private int f27753b;

    /* renamed from: c */
    private boolean f27754c;

    /* renamed from: d */
    private int f27755d;

    /* renamed from: e */
    private boolean f27756e;

    /* renamed from: f */
    private int f27757f = -1;

    /* renamed from: g */
    private int f27758g = -1;

    /* renamed from: h */
    private int f27759h = -1;

    /* renamed from: i */
    private int f27760i = -1;

    /* renamed from: j */
    private int f27761j = -1;

    /* renamed from: k */
    private float f27762k;

    /* renamed from: l */
    private String f27763l;

    /* renamed from: m */
    private int f27764m = -1;

    /* renamed from: n */
    private int f27765n = -1;

    /* renamed from: o */
    private Layout.Alignment f27766o;

    /* renamed from: p */
    private Layout.Alignment f27767p;

    /* renamed from: q */
    private int f27768q = -1;

    /* renamed from: r */
    private C5444b f27769r;

    /* renamed from: s */
    private float f27770s = Float.MAX_VALUE;

    /* renamed from: r */
    private C5452g m33345r(C5452g gVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f27754c && gVar.f27754c) {
                mo19751w(gVar.f27753b);
            }
            if (this.f27759h == -1) {
                this.f27759h = gVar.f27759h;
            }
            if (this.f27760i == -1) {
                this.f27760i = gVar.f27760i;
            }
            if (this.f27752a == null && (str = gVar.f27752a) != null) {
                this.f27752a = str;
            }
            if (this.f27757f == -1) {
                this.f27757f = gVar.f27757f;
            }
            if (this.f27758g == -1) {
                this.f27758g = gVar.f27758g;
            }
            if (this.f27765n == -1) {
                this.f27765n = gVar.f27765n;
            }
            if (this.f27766o == null && (alignment2 = gVar.f27766o) != null) {
                this.f27766o = alignment2;
            }
            if (this.f27767p == null && (alignment = gVar.f27767p) != null) {
                this.f27767p = alignment;
            }
            if (this.f27768q == -1) {
                this.f27768q = gVar.f27768q;
            }
            if (this.f27761j == -1) {
                this.f27761j = gVar.f27761j;
                this.f27762k = gVar.f27762k;
            }
            if (this.f27769r == null) {
                this.f27769r = gVar.f27769r;
            }
            if (this.f27770s == Float.MAX_VALUE) {
                this.f27770s = gVar.f27770s;
            }
            if (z && !this.f27756e && gVar.f27756e) {
                mo19749u(gVar.f27755d);
            }
            if (z && this.f27764m == -1 && (i = gVar.f27764m) != -1) {
                this.f27764m = i;
            }
        }
        return this;
    }

    /* renamed from: A */
    public C5452g mo19719A(String str) {
        this.f27763l = str;
        return this;
    }

    /* renamed from: B */
    public C5452g mo19720B(boolean z) {
        this.f27760i = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public C5452g mo19721C(boolean z) {
        this.f27757f = z ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public C5452g mo19722D(Layout.Alignment alignment) {
        this.f27767p = alignment;
        return this;
    }

    /* renamed from: E */
    public C5452g mo19723E(int i) {
        this.f27765n = i;
        return this;
    }

    /* renamed from: F */
    public C5452g mo19724F(int i) {
        this.f27764m = i;
        return this;
    }

    /* renamed from: G */
    public C5452g mo19725G(float f) {
        this.f27770s = f;
        return this;
    }

    /* renamed from: H */
    public C5452g mo19726H(Layout.Alignment alignment) {
        this.f27766o = alignment;
        return this;
    }

    /* renamed from: I */
    public C5452g mo19727I(boolean z) {
        this.f27768q = z ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public C5452g mo19728J(C5444b bVar) {
        this.f27769r = bVar;
        return this;
    }

    /* renamed from: K */
    public C5452g mo19729K(boolean z) {
        this.f27758g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C5452g mo19730a(C5452g gVar) {
        return m33345r(gVar, true);
    }

    /* renamed from: b */
    public int mo19731b() {
        if (this.f27756e) {
            return this.f27755d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int mo19732c() {
        if (this.f27754c) {
            return this.f27753b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String mo19733d() {
        return this.f27752a;
    }

    /* renamed from: e */
    public float mo19734e() {
        return this.f27762k;
    }

    /* renamed from: f */
    public int mo19735f() {
        return this.f27761j;
    }

    /* renamed from: g */
    public String mo19736g() {
        return this.f27763l;
    }

    /* renamed from: h */
    public Layout.Alignment mo19737h() {
        return this.f27767p;
    }

    /* renamed from: i */
    public int mo19738i() {
        return this.f27765n;
    }

    /* renamed from: j */
    public int mo19739j() {
        return this.f27764m;
    }

    /* renamed from: k */
    public float mo19740k() {
        return this.f27770s;
    }

    /* renamed from: l */
    public int mo19741l() {
        int i = this.f27759h;
        if (i == -1 && this.f27760i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f27760i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: m */
    public Layout.Alignment mo19742m() {
        return this.f27766o;
    }

    /* renamed from: n */
    public boolean mo19743n() {
        return this.f27768q == 1;
    }

    /* renamed from: o */
    public C5444b mo19744o() {
        return this.f27769r;
    }

    /* renamed from: p */
    public boolean mo19745p() {
        return this.f27756e;
    }

    /* renamed from: q */
    public boolean mo19746q() {
        return this.f27754c;
    }

    /* renamed from: s */
    public boolean mo19747s() {
        return this.f27757f == 1;
    }

    /* renamed from: t */
    public boolean mo19748t() {
        return this.f27758g == 1;
    }

    /* renamed from: u */
    public C5452g mo19749u(int i) {
        this.f27755d = i;
        this.f27756e = true;
        return this;
    }

    /* renamed from: v */
    public C5452g mo19750v(boolean z) {
        this.f27759h = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public C5452g mo19751w(int i) {
        this.f27753b = i;
        this.f27754c = true;
        return this;
    }

    /* renamed from: x */
    public C5452g mo19752x(String str) {
        this.f27752a = str;
        return this;
    }

    /* renamed from: y */
    public C5452g mo19753y(float f) {
        this.f27762k = f;
        return this;
    }

    /* renamed from: z */
    public C5452g mo19754z(int i) {
        this.f27761j = i;
        return this;
    }
}
