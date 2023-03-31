package p142t3;

import java.util.ArrayList;
import java.util.Collections;
import p079k3.C4864b;
import p079k3.C4872g;
import p079k3.C4874h;
import p079k3.C4876j;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: t3.a */
/* compiled from: Mp4WebvttDecoder */
public final class C5511a extends C4872g {

    /* renamed from: o */
    private final C5918a0 f27987o = new C5918a0();

    public C5511a() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: C */
    private static C4864b m33483C(C5918a0 a0Var, int i) throws C4876j {
        CharSequence charSequence = null;
        C4864b.C4866b bVar = null;
        while (i > 0) {
            if (i >= 8) {
                int m = a0Var.mo20560m();
                int m2 = a0Var.mo20560m();
                int i2 = m - 8;
                String E = C5953m0.m35076E(a0Var.mo20551d(), a0Var.mo20552e(), i2);
                a0Var.mo20547P(i2);
                i = (i - 8) - i2;
                if (m2 == 1937011815) {
                    bVar = C5516f.m33545o(E);
                } else if (m2 == 1885436268) {
                    charSequence = C5516f.m33547q((String) null, E.trim(), Collections.emptyList());
                }
            } else {
                throw new C4876j("Incomplete vtt cue box header found.");
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (bVar != null) {
            return bVar.mo18638o(charSequence).mo18624a();
        }
        return C5516f.m33542l(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) throws C4876j {
        this.f27987o.mo20544M(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.f27987o.mo20548a() > 0) {
            if (this.f27987o.mo20548a() >= 8) {
                int m = this.f27987o.mo20560m();
                if (this.f27987o.mo20560m() == 1987343459) {
                    arrayList.add(m33483C(this.f27987o, m - 8));
                } else {
                    this.f27987o.mo20547P(m - 8);
                }
            } else {
                throw new C4876j("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C5512b(arrayList);
    }
}
