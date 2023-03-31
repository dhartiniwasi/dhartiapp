package p349s9;

import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: s9.e */
/* compiled from: AI013x0x1xDecoder */
final class C12474e extends C12478i {

    /* renamed from: c */
    private final String f45875c;

    /* renamed from: d */
    private final String f45876d;

    C12474e(C10475a aVar, String str, String str2) {
        super(aVar);
        this.f45875c = str2;
        this.f45876d = str;
    }

    /* renamed from: k */
    private void m59487k(StringBuilder sb, int i) {
        int f = mo37252b().mo37276f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f45875c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* renamed from: d */
    public String mo37248d() throws C9918j {
        if (mo37253c().mo33560g() == 84) {
            StringBuilder sb = new StringBuilder();
            mo37249f(sb, 8);
            mo37251j(sb, 48, 20);
            m59487k(sb, 68);
            return sb.toString();
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo37246h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f45876d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo37247i(int i) {
        return i % 100000;
    }
}
