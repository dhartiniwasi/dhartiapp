package p349s9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p212d9.C9914f;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: s9.s */
/* compiled from: GeneralAppIdDecoder */
final class C12489s {

    /* renamed from: a */
    private final C10475a f45899a;

    /* renamed from: b */
    private final C12482m f45900b = new C12482m();

    /* renamed from: c */
    private final StringBuilder f45901c = new StringBuilder();

    C12489s(C10475a aVar) {
        this.f45899a = aVar;
    }

    /* renamed from: b */
    private C12484n m59527b(int i) {
        char c;
        int f = mo37276f(i, 5);
        if (f == 15) {
            return new C12484n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C12484n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo37276f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C12484n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark:
                c = '*';
                break;
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal:
                c = ',';
                break;
            case C8710R.styleable.AppCompatTheme_controlBackground:
                c = '-';
                break;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius:
                c = '.';
                break;
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f2);
        }
        return new C12484n(i + 6, c);
    }

    /* renamed from: d */
    private C12484n m59528d(int i) throws C9914f {
        char c;
        int f = mo37276f(i, 5);
        if (f == 15) {
            return new C12484n(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C12484n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo37276f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C12484n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C12484n(i + 7, (char) (f2 + 7));
        }
        switch (mo37276f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C9914f.m50845a();
        }
        return new C12484n(i + 8, c);
    }

    /* renamed from: e */
    private C12486p m59529e(int i) throws C9914f {
        int i2 = i + 7;
        if (i2 > this.f45899a.mo33560g()) {
            int f = mo37276f(i, 4);
            if (f == 0) {
                return new C12486p(this.f45899a.mo33560g(), 10, 10);
            }
            return new C12486p(this.f45899a.mo33560g(), f - 1, 10);
        }
        int f2 = mo37276f(i, 7) - 8;
        return new C12486p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: g */
    static int m59530g(C10475a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo33554c(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m59531h(int i) {
        int i2 = i + 3;
        if (i2 > this.f45899a.mo33560g()) {
            return false;
        }
        while (i < i2) {
            if (this.f45899a.mo33554c(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m59532i(int i) {
        int i2;
        if (i + 1 > this.f45899a.mo33560g()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f45899a.mo33560g()) {
            if (i3 == 2) {
                if (!this.f45899a.mo33554c(i + 2)) {
                    return false;
                }
            } else if (this.f45899a.mo33554c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m59533j(int i) {
        int i2;
        if (i + 1 > this.f45899a.mo33560g()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f45899a.mo33560g()) {
            if (this.f45899a.mo33554c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m59534k(int i) {
        int f;
        if (i + 5 > this.f45899a.mo33560g()) {
            return false;
        }
        int f2 = mo37276f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.f45899a.mo33560g() && (f = mo37276f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m59535l(int i) {
        int f;
        if (i + 5 > this.f45899a.mo33560g()) {
            return false;
        }
        int f2 = mo37276f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f45899a.mo33560g()) {
            return false;
        }
        int f3 = mo37276f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.f45899a.mo33560g() && (f = mo37276f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m59536m(int i) {
        if (i + 7 <= this.f45899a.mo33560g()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f45899a.mo33554c(i3);
                }
                if (this.f45899a.mo33554c(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f45899a.mo33560g()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    private C12481l m59537n() {
        while (m59534k(this.f45900b.mo37256a())) {
            C12484n b = m59527b(this.f45900b.mo37256a());
            this.f45900b.mo37263h(b.mo37273a());
            if (b.mo37265c()) {
                return new C12481l(new C12485o(this.f45900b.mo37256a(), this.f45901c.toString()), true);
            }
            this.f45901c.append(b.mo37264b());
        }
        if (m59531h(this.f45900b.mo37256a())) {
            this.f45900b.mo37257b(3);
            this.f45900b.mo37262g();
        } else if (m59532i(this.f45900b.mo37256a())) {
            if (this.f45900b.mo37256a() + 5 < this.f45899a.mo33560g()) {
                this.f45900b.mo37257b(5);
            } else {
                this.f45900b.mo37263h(this.f45899a.mo33560g());
            }
            this.f45900b.mo37261f();
        }
        return new C12481l(false);
    }

    /* renamed from: o */
    private C12485o m59538o() throws C9914f {
        boolean z;
        C12481l lVar;
        do {
            int a = this.f45900b.mo37256a();
            if (this.f45900b.mo37258c()) {
                lVar = m59537n();
                z = lVar.mo37255b();
            } else if (this.f45900b.mo37259d()) {
                lVar = m59539p();
                z = lVar.mo37255b();
            } else {
                lVar = m59540q();
                z = lVar.mo37255b();
            }
            if (!(a != this.f45900b.mo37256a()) && !z) {
                break;
            }
        } while (!z);
        return lVar.mo37254a();
    }

    /* renamed from: p */
    private C12481l m59539p() throws C9914f {
        while (m59535l(this.f45900b.mo37256a())) {
            C12484n d = m59528d(this.f45900b.mo37256a());
            this.f45900b.mo37263h(d.mo37273a());
            if (d.mo37265c()) {
                return new C12481l(new C12485o(this.f45900b.mo37256a(), this.f45901c.toString()), true);
            }
            this.f45901c.append(d.mo37264b());
        }
        if (m59531h(this.f45900b.mo37256a())) {
            this.f45900b.mo37257b(3);
            this.f45900b.mo37262g();
        } else if (m59532i(this.f45900b.mo37256a())) {
            if (this.f45900b.mo37256a() + 5 < this.f45899a.mo33560g()) {
                this.f45900b.mo37257b(5);
            } else {
                this.f45900b.mo37263h(this.f45899a.mo33560g());
            }
            this.f45900b.mo37260e();
        }
        return new C12481l(false);
    }

    /* renamed from: q */
    private C12481l m59540q() throws C9914f {
        C12485o oVar;
        while (m59536m(this.f45900b.mo37256a())) {
            C12486p e = m59529e(this.f45900b.mo37256a());
            this.f45900b.mo37263h(e.mo37273a());
            if (e.mo37271d()) {
                if (e.mo37272e()) {
                    oVar = new C12485o(this.f45900b.mo37256a(), this.f45901c.toString());
                } else {
                    oVar = new C12485o(this.f45900b.mo37256a(), this.f45901c.toString(), e.mo37270c());
                }
                return new C12481l(oVar, true);
            }
            this.f45901c.append(e.mo37269b());
            if (e.mo37272e()) {
                return new C12481l(new C12485o(this.f45900b.mo37256a(), this.f45901c.toString()), true);
            }
            this.f45901c.append(e.mo37270c());
        }
        if (m59533j(this.f45900b.mo37256a())) {
            this.f45900b.mo37260e();
            this.f45900b.mo37257b(4);
        }
        return new C12481l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo37274a(StringBuilder sb, int i) throws C9918j, C9914f {
        String str = null;
        while (true) {
            C12485o c = mo37275c(i, str);
            String a = C12488r.m59524a(c.mo37266b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo37268d() ? String.valueOf(c.mo37267c()) : null;
            if (i == c.mo37273a()) {
                return sb.toString();
            }
            i = c.mo37273a();
            str = valueOf;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12485o mo37275c(int i, String str) throws C9914f {
        this.f45901c.setLength(0);
        if (str != null) {
            this.f45901c.append(str);
        }
        this.f45900b.mo37263h(i);
        C12485o o = m59538o();
        if (o == null || !o.mo37268d()) {
            return new C12485o(this.f45900b.mo37256a(), this.f45901c.toString());
        }
        return new C12485o(this.f45900b.mo37256a(), this.f45901c.toString(), o.mo37267c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo37276f(int i, int i2) {
        return m59530g(this.f45899a, i, i2);
    }
}
