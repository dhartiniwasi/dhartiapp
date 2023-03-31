package p093m3;

import java.util.List;
import p079k3.C4872g;
import p079k3.C4874h;
import p161w3.C5918a0;

/* renamed from: m3.a */
/* compiled from: DvbDecoder */
public final class C5032a extends C4872g {

    /* renamed from: o */
    private final C5033b f26381o;

    public C5032a(List<byte[]> list) {
        super("DvbDecoder");
        C5918a0 a0Var = new C5918a0(list.get(0));
        this.f26381o = new C5033b(a0Var.mo20540I(), a0Var.mo20540I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public C4874h mo18652A(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f26381o.mo18965r();
        }
        return new C5042c(this.f26381o.mo18964b(bArr, i));
    }
}
