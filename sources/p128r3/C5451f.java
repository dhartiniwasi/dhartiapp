package p128r3;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import p107o3.C5215a;
import p107o3.C5216b;
import p107o3.C5217c;
import p107o3.C5218d;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: r3.f */
/* compiled from: TtmlRenderUtil */
final class C5451f {
    /* renamed from: a */
    public static void m33339a(Spannable spannable, int i, int i2, C5452g gVar, C5449d dVar, Map<String, C5452g> map, int i3) {
        C5449d e;
        C5452g f;
        int i4;
        if (gVar.mo19741l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.mo19741l()), i, i2, 33);
        }
        if (gVar.mo19747s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.mo19748t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.mo19746q()) {
            C5217c.m32383a(spannable, new ForegroundColorSpan(gVar.mo19732c()), i, i2, 33);
        }
        if (gVar.mo19745p()) {
            C5217c.m32383a(spannable, new BackgroundColorSpan(gVar.mo19731b()), i, i2, 33);
        }
        if (gVar.mo19733d() != null) {
            C5217c.m32383a(spannable, new TypefaceSpan(gVar.mo19733d()), i, i2, 33);
        }
        if (gVar.mo19744o() != null) {
            C5444b bVar = (C5444b) C5917a.m34872e(gVar.mo19744o());
            int i5 = bVar.f27709a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = bVar.f27710b;
            }
            int i6 = bVar.f27711c;
            if (i6 == -2) {
                i6 = 1;
            }
            C5217c.m32383a(spannable, new C5218d(i5, i4, i6), i, i2, 33);
        }
        int j = gVar.mo19739j();
        if (j == 2) {
            C5449d d = m33342d(dVar, map);
            if (!(d == null || (e = m33343e(d, map)) == null)) {
                if (e.mo19714g() != 1 || e.mo19713f(0).f27730b == null) {
                    C5961r.m35212f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) C5953m0.m35138j(e.mo19713f(0).f27730b);
                    C5452g f2 = m33344f(e.f27734f, e.mo19717l(), map);
                    int i7 = f2 != null ? f2.mo19738i() : -1;
                    if (i7 == -1 && (f = m33344f(d.f27734f, d.mo19717l(), map)) != null) {
                        i7 = f.mo19738i();
                    }
                    spannable.setSpan(new C5216b(str, i7), i, i2, 33);
                }
            }
        } else if (j == 3 || j == 4) {
            spannable.setSpan(new C5443a(), i, i2, 33);
        }
        if (gVar.mo19743n()) {
            C5217c.m32383a(spannable, new C5215a(), i, i2, 33);
        }
        int f3 = gVar.mo19735f();
        if (f3 == 1) {
            C5217c.m32383a(spannable, new AbsoluteSizeSpan((int) gVar.mo19734e(), true), i, i2, 33);
        } else if (f3 == 2) {
            C5217c.m32383a(spannable, new RelativeSizeSpan(gVar.mo19734e()), i, i2, 33);
        } else if (f3 == 3) {
            C5217c.m32383a(spannable, new RelativeSizeSpan(gVar.mo19734e() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: b */
    static String m33340b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    static void m33341c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: d */
    private static C5449d m33342d(C5449d dVar, Map<String, C5452g> map) {
        while (dVar != null) {
            C5452g f = m33344f(dVar.f27734f, dVar.mo19717l(), map);
            if (f != null && f.mo19739j() == 1) {
                return dVar;
            }
            dVar = dVar.f27738j;
        }
        return null;
    }

    /* renamed from: e */
    private static C5449d m33343e(C5449d dVar, Map<String, C5452g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            C5449d dVar2 = (C5449d) arrayDeque.pop();
            C5452g f = m33344f(dVar2.f27734f, dVar2.mo19717l(), map);
            if (f != null && f.mo19739j() == 3) {
                return dVar2;
            }
            for (int g = dVar2.mo19714g() - 1; g >= 0; g--) {
                arrayDeque.push(dVar2.mo19713f(g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C5452g m33344f(C5452g gVar, String[] strArr, Map<String, C5452g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5452g gVar2 = new C5452g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.mo19730a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.mo19730a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.mo19730a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
