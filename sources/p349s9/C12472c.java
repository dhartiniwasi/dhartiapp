package p349s9;

import p212d9.C9914f;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: s9.c */
/* compiled from: AI01392xDecoder */
final class C12472c extends C12477h {
    C12472c(C10475a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo37248d() throws C9918j, C9914f {
        if (mo37253c().mo33560g() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo37249f(sb, 8);
            int f = mo37252b().mo37276f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(mo37252b().mo37275c(50, (String) null).mo37266b());
            return sb.toString();
        }
        throw C9918j.m50862a();
    }
}
