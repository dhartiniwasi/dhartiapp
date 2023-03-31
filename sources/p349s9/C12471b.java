package p349s9;

import p248h9.C10475a;

/* renamed from: s9.b */
/* compiled from: AI01320xDecoder */
final class C12471b extends C12475f {
    C12471b(C10475a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo37246h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo37247i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
