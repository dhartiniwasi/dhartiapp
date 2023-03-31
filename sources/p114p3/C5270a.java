package p114p3;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079k3.C4864b;
import p079k3.C4872g;
import p079k3.C4874h;
import p114p3.C5272c;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p182a7.C6408b;

/* renamed from: p3.a */
/* compiled from: SsaDecoder */
public final class C5270a extends C4872g {

    /* renamed from: t */
    private static final Pattern f27175t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    private final boolean f27176o;

    /* renamed from: p */
    private final C5271b f27177p;

    /* renamed from: q */
    private Map<String, C5272c> f27178q;

    /* renamed from: r */
    private float f27179r = -3.4028235E38f;

    /* renamed from: s */
    private float f27180s = -3.4028235E38f;

    public C5270a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f27176o = false;
            this.f27177p = null;
            return;
        }
        this.f27176o = true;
        String D = C5953m0.m35074D(list.get(0));
        C5917a.m34868a(D.startsWith("Format:"));
        this.f27177p = (C5271b) C5917a.m34872e(C5271b.m32530a(D));
        m32522H(new C5918a0(list.get(1)));
    }

    /* renamed from: C */
    private static int m32517C(long j, List<Long> list, List<List<C4864b>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    /* renamed from: D */
    private static float m32518D(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: E */
    private static C4864b m32519E(String str, C5272c cVar, C5272c.C5274b bVar, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        C4864b.C4866b o = new C4864b.C4866b().mo18638o(spannableString);
        if (cVar != null) {
            if (cVar.f27188c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f27188c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.f27195j == 3 && cVar.f27189d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.f27189d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.f27190e;
            if (!(f3 == -3.4028235E38f || f2 == -3.4028235E38f)) {
                o.mo18640q(f3 / f2, 1);
            }
            boolean z = cVar.f27191f;
            if (z && cVar.f27192g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.f27192g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.f27193h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f27194i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.f27211a;
        if (i == -1) {
            i = cVar != null ? cVar.f27187b : -1;
        }
        o.mo18639p(m32528N(i)).mo18635l(m32527M(i)).mo18632i(m32526L(i));
        PointF pointF = bVar.f27212b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            o.mo18634k(m32518D(o.mo18627d()));
            o.mo18631h(m32518D(o.mo18626c()), 0);
        } else {
            o.mo18634k(pointF.x / f);
            o.mo18631h(bVar.f27212b.y / f2, 0);
        }
        return o.mo18624a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        r3 = r12.f27183c;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32520F(java.lang.String r11, p114p3.C5271b r12, java.util.List<java.util.List<p079k3.C4864b>> r13, java.util.List<java.lang.Long> r14) {
        /*
            r10 = this;
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r11.startsWith(r0)
            p161w3.C5917a.m34868a(r0)
            r0 = 9
            java.lang.String r0 = r11.substring(r0)
            int r1 = r12.f27185e
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2, r1)
            int r1 = r0.length
            int r2 = r12.f27185e
            java.lang.String r3 = "SsaDecoder"
            if (r1 == r2) goto L_0x0033
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Skipping dialogue line with fewer columns than format: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p161w3.C5961r.m35215i(r3, r11)
            return
        L_0x0033:
            int r1 = r12.f27181a
            r1 = r0[r1]
            long r1 = m32525K(r1)
            java.lang.String r4 = "Skipping invalid timing: "
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0059
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p161w3.C5961r.m35215i(r3, r11)
            return
        L_0x0059:
            int r7 = r12.f27182b
            r7 = r0[r7]
            long r7 = m32525K(r7)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0078
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            p161w3.C5961r.m35215i(r3, r11)
            return
        L_0x0078:
            java.util.Map<java.lang.String, p3.c> r11 = r10.f27178q
            if (r11 == 0) goto L_0x008e
            int r3 = r12.f27183c
            r4 = -1
            if (r3 == r4) goto L_0x008e
            r3 = r0[r3]
            java.lang.String r3 = r3.trim()
            java.lang.Object r11 = r11.get(r3)
            p3.c r11 = (p114p3.C5272c) r11
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            int r12 = r12.f27184d
            r12 = r0[r12]
            p3.c$b r0 = p114p3.C5272c.C5274b.m32542b(r12)
            java.lang.String r12 = p114p3.C5272c.C5274b.m32544d(r12)
            java.lang.String r3 = "\\N"
            java.lang.String r4 = "\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\n"
            java.lang.String r12 = r12.replace(r3, r4)
            java.lang.String r3 = "\\h"
            java.lang.String r4 = " "
            java.lang.String r12 = r12.replace(r3, r4)
            float r3 = r10.f27179r
            float r4 = r10.f27180s
            k3.b r11 = m32519E(r12, r11, r0, r3, r4)
            int r12 = m32517C(r1, r14, r13)
            int r14 = m32517C(r7, r14, r13)
        L_0x00c1:
            if (r12 >= r14) goto L_0x00cf
            java.lang.Object r0 = r13.get(r12)
            java.util.List r0 = (java.util.List) r0
            r0.add(r11)
            int r12 = r12 + 1
            goto L_0x00c1
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p114p3.C5270a.m32520F(java.lang.String, p3.b, java.util.List, java.util.List):void");
    }

    /* renamed from: G */
    private void m32521G(C5918a0 a0Var, List<List<C4864b>> list, List<Long> list2) {
        C5271b bVar = this.f27176o ? this.f27177p : null;
        while (true) {
            String o = a0Var.mo20562o();
            if (o == null) {
                return;
            }
            if (o.startsWith("Format:")) {
                bVar = C5271b.m32530a(o);
            } else if (o.startsWith("Dialogue:")) {
                if (bVar == null) {
                    C5961r.m35215i("SsaDecoder", "Skipping dialogue line before complete format: " + o);
                } else {
                    m32520F(o, bVar, list, list2);
                }
            }
        }
    }

    /* renamed from: H */
    private void m32522H(C5918a0 a0Var) {
        while (true) {
            String o = a0Var.mo20562o();
            if (o == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(o)) {
                m32523I(a0Var);
            } else if ("[V4+ Styles]".equalsIgnoreCase(o)) {
                this.f27178q = m32524J(a0Var);
            } else if ("[V4 Styles]".equalsIgnoreCase(o)) {
                C5961r.m35212f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(o)) {
                return;
            }
        }
    }

    /* renamed from: I */
    private void m32523I(C5918a0 a0Var) {
        while (true) {
            String o = a0Var.mo20562o();
            if (o == null) {
                return;
            }
            if (a0Var.mo20548a() == 0 || a0Var.mo20555h() != 91) {
                String[] split = o.split(":");
                if (split.length == 2) {
                    String e = C6408b.m37506e(split[0].trim());
                    e.hashCode();
                    if (e.equals("playresx")) {
                        this.f27179r = Float.parseFloat(split[1].trim());
                    } else if (e.equals("playresy")) {
                        try {
                            this.f27180s = Float.parseFloat(split[1].trim());
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: J */
    private static Map<String, C5272c> m32524J(C5918a0 a0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C5272c.C5273a aVar = null;
        while (true) {
            String o = a0Var.mo20562o();
            if (o == null || (a0Var.mo20548a() != 0 && a0Var.mo20555h() == 91)) {
                return linkedHashMap;
            }
            if (o.startsWith("Format:")) {
                aVar = C5272c.C5273a.m32540a(o);
            } else if (o.startsWith("Style:")) {
                if (aVar == null) {
                    C5961r.m35215i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + o);
                } else {
                    C5272c b = C5272c.m32532b(o, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.f27186a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: K */
    private static long m32525K(String str) {
        Matcher matcher = f27175t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) C5953m0.m35138j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C5953m0.m35138j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C5953m0.m35138j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C5953m0.m35138j(matcher.group(4))) * 10000);
    }

    /* renamed from: L */
    private static int m32526L(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                C5961r.m35215i("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: M */
    private static int m32527M(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                C5961r.m35215i("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: N */
    private static Layout.Alignment m32528N(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                C5961r.m35215i("SsaDecoder", "Unknown alignment: " + i);
                return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C5918a0 a0Var = new C5918a0(bArr, i);
        if (!this.f27176o) {
            m32522H(a0Var);
        }
        m32521G(a0Var, arrayList, arrayList2);
        return new C5275d(arrayList, arrayList2);
    }
}
