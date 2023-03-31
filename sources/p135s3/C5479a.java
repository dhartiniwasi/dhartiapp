package p135s3;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4872g;
import p079k3.C4874h;
import p079k3.C4876j;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p182a7.C6415d;

/* renamed from: s3.a */
/* compiled from: Tx3gDecoder */
public final class C5479a extends C4872g {

    /* renamed from: o */
    private final C5918a0 f27818o = new C5918a0();

    /* renamed from: p */
    private final boolean f27819p;

    /* renamed from: q */
    private final int f27820q;

    /* renamed from: r */
    private final int f27821r;

    /* renamed from: s */
    private final String f27822s;

    /* renamed from: t */
    private final float f27823t;

    /* renamed from: u */
    private final int f27824u;

    public C5479a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f27820q = bArr[24];
            this.f27821r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f27822s = "Serif".equals(C5953m0.m35076E(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f27824u = i;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f27819p = z;
            if (z) {
                this.f27823t = C5953m0.m35150p(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.f27823t = 0.85f;
            }
        } else {
            this.f27820q = 0;
            this.f27821r = -1;
            this.f27822s = str;
            this.f27819p = false;
            this.f27823t = 0.85f;
            this.f27824u = -1;
        }
    }

    /* renamed from: C */
    private void m33415C(C5918a0 a0Var, SpannableStringBuilder spannableStringBuilder) throws C4876j {
        int i;
        m33416D(a0Var.mo20548a() >= 12);
        int I = a0Var.mo20540I();
        int I2 = a0Var.mo20540I();
        a0Var.mo20547P(2);
        int C = a0Var.mo20534C();
        a0Var.mo20547P(1);
        int m = a0Var.mo20560m();
        if (I2 > spannableStringBuilder.length()) {
            C5961r.m35215i("Tx3gDecoder", "Truncating styl end (" + I2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i = spannableStringBuilder.length();
        } else {
            i = I2;
        }
        if (I >= i) {
            C5961r.m35215i("Tx3gDecoder", "Ignoring styl with start (" + I + ") >= end (" + i + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i2 = I;
        int i3 = i;
        m33418F(spannableStringBuilder2, C, this.f27820q, i2, i3, 0);
        m33417E(spannableStringBuilder2, m, this.f27821r, i2, i3, 0);
    }

    /* renamed from: D */
    private static void m33416D(boolean z) throws C4876j {
        if (!z) {
            throw new C4876j("Unexpected subtitle format.");
        }
    }

    /* renamed from: E */
    private static void m33417E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: F */
    private static void m33418F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = true;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: G */
    private static void m33419G(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: H */
    private static String m33420H(C5918a0 a0Var) throws C4876j {
        char g;
        m33416D(a0Var.mo20548a() >= 2);
        int I = a0Var.mo20540I();
        if (I == 0) {
            return "";
        }
        if (a0Var.mo20548a() < 2 || ((g = a0Var.mo20554g()) != 65279 && g != 65534)) {
            return a0Var.mo20532A(I, C6415d.f30664c);
        }
        return a0Var.mo20532A(I, C6415d.f30667f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) throws C4876j {
        this.f27818o.mo20544M(bArr, i);
        String H = m33420H(this.f27818o);
        if (H.isEmpty()) {
            return C5480b.f27825b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(H);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m33418F(spannableStringBuilder2, this.f27820q, 0, 0, spannableStringBuilder.length(), 16711680);
        m33417E(spannableStringBuilder2, this.f27821r, -1, 0, spannableStringBuilder.length(), 16711680);
        m33419G(spannableStringBuilder, this.f27822s, 0, spannableStringBuilder.length());
        float f = this.f27823t;
        while (this.f27818o.mo20548a() >= 8) {
            int e = this.f27818o.mo20552e();
            int m = this.f27818o.mo20560m();
            int m2 = this.f27818o.mo20560m();
            boolean z2 = true;
            if (m2 == 1937013100) {
                if (this.f27818o.mo20548a() < 2) {
                    z2 = false;
                }
                m33416D(z2);
                int I = this.f27818o.mo20540I();
                for (int i2 = 0; i2 < I; i2++) {
                    m33415C(this.f27818o, spannableStringBuilder);
                }
            } else if (m2 == 1952608120 && this.f27819p) {
                if (this.f27818o.mo20548a() < 2) {
                    z2 = false;
                }
                m33416D(z2);
                f = C5953m0.m35150p(((float) this.f27818o.mo20540I()) / ((float) this.f27824u), 0.0f, 0.95f);
            }
            this.f27818o.mo20546O(e + m);
        }
        return new C5480b(new C4864b.C4866b().mo18638o(spannableStringBuilder).mo18631h(f, 0).mo18632i(0).mo18624a());
    }
}
