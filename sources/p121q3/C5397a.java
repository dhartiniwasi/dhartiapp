package p121q3;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079k3.C4864b;
import p079k3.C4872g;
import p079k3.C4874h;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5961r;
import p161w3.C5964s;

/* renamed from: q3.a */
/* compiled from: SubripDecoder */
public final class C5397a extends C4872g {

    /* renamed from: q */
    private static final Pattern f27614q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f27615r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f27616o = new StringBuilder();

    /* renamed from: p */
    private final ArrayList<String> f27617p = new ArrayList<>();

    public C5397a() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p079k3.C4864b m33134C(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            k3.b$b r1 = new k3.b$b
            r1.<init>()
            r2 = r17
            k3.b$b r1 = r1.mo18638o(r2)
            if (r0 != 0) goto L_0x0014
            k3.b r0 = r1.mo18624a()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.mo18635l(r3)
            goto L_0x0095
        L_0x008d:
            r1.mo18635l(r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.mo18635l(r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.mo18632i(r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.mo18632i(r0)
            goto L_0x0101
        L_0x00fe:
            r1.mo18632i(r15)
        L_0x0101:
            int r0 = r1.mo18627d()
            float r0 = m33135D(r0)
            k3.b$b r0 = r1.mo18634k(r0)
            int r1 = r1.mo18626c()
            float r1 = m33135D(r1)
            r2 = 0
            k3.b$b r0 = r0.mo18631h(r1, r2)
            k3.b r0 = r0.mo18624a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p121q3.C5397a.m33134C(android.text.Spanned, java.lang.String):k3.b");
    }

    /* renamed from: D */
    static float m33135D(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: E */
    private static long m33136E(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong((String) C5917a.m34872e(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) C5917a.m34872e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: F */
    private String m33137F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f27615r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C5964s sVar = new C5964s();
        C5918a0 a0Var = new C5918a0(bArr, i);
        while (true) {
            String o = a0Var.mo20562o();
            int i2 = 0;
            if (o == null) {
                break;
            } else if (o.length() != 0) {
                try {
                    Integer.parseInt(o);
                    String o2 = a0Var.mo20562o();
                    if (o2 == null) {
                        C5961r.m35215i("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f27614q.matcher(o2);
                    if (matcher.matches()) {
                        sVar.mo20660a(m33136E(matcher, 1));
                        sVar.mo20660a(m33136E(matcher, 6));
                        this.f27616o.setLength(0);
                        this.f27617p.clear();
                        for (String o3 = a0Var.mo20562o(); !TextUtils.isEmpty(o3); o3 = a0Var.mo20562o()) {
                            if (this.f27616o.length() > 0) {
                                this.f27616o.append("<br>");
                            }
                            this.f27616o.append(m33137F(o3, this.f27617p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f27616o.toString());
                        String str = null;
                        while (true) {
                            if (i2 >= this.f27617p.size()) {
                                break;
                            }
                            String str2 = this.f27617p.get(i2);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                str = str2;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m33134C(fromHtml, str));
                        arrayList.add(C4864b.f25757z);
                    } else {
                        C5961r.m35215i("SubripDecoder", "Skipping invalid timing: " + o2);
                    }
                } catch (NumberFormatException unused) {
                    C5961r.m35215i("SubripDecoder", "Skipping invalid index: " + o);
                }
            }
        }
        return new C5398b((C4864b[]) arrayList.toArray(new C4864b[0]), sVar.mo20663d());
    }
}
