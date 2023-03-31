package p065i2;

import java.util.Collections;
import p014b2.C1609a;
import p037e2.C4200e0;
import p065i2.C4653e;
import p161w3.C5918a0;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: i2.a */
/* compiled from: AudioTagPayloadReader */
final class C4650a extends C4653e {

    /* renamed from: e */
    private static final int[] f25157e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f25158b;

    /* renamed from: c */
    private boolean f25159c;

    /* renamed from: d */
    private int f25160d;

    public C4650a(C4200e0 e0Var) {
        super(e0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18326b(C5918a0 a0Var) throws C4653e.C4654a {
        if (!this.f25158b) {
            int C = a0Var.mo20534C();
            int i = (C >> 4) & 15;
            this.f25160d = i;
            if (i == 2) {
                this.f25181a.mo6845e(new C6272r1.C6274b().mo21517e0("audio/mpeg").mo21494H(1).mo21518f0(f25157e[(C >> 2) & 3]).mo21491E());
                this.f25159c = true;
            } else if (i == 7 || i == 8) {
                this.f25181a.mo6845e(new C6272r1.C6274b().mo21517e0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").mo21494H(1).mo21518f0(8000).mo21491E());
                this.f25159c = true;
            } else if (i != 10) {
                throw new C4653e.C4654a("Audio format not supported: " + this.f25160d);
            }
            this.f25158b = true;
        } else {
            a0Var.mo20547P(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo18327c(C5918a0 a0Var, long j) throws C6249m2 {
        if (this.f25160d == 2) {
            int a = a0Var.mo20548a();
            this.f25181a.mo6843d(a0Var, a);
            this.f25181a.mo6838a(j, 1, a, 0, (C4200e0.C4201a) null);
            return true;
        }
        int C = a0Var.mo20534C();
        if (C == 0 && !this.f25159c) {
            int a2 = a0Var.mo20548a();
            byte[] bArr = new byte[a2];
            a0Var.mo20557j(bArr, 0, a2);
            C1609a.C1611b f = C1609a.m7406f(bArr);
            this.f25181a.mo6845e(new C6272r1.C6274b().mo21517e0("audio/mp4a-latm").mo21495I(f.f4616c).mo21494H(f.f4615b).mo21518f0(f.f4614a).mo21506T(Collections.singletonList(bArr)).mo21491E());
            this.f25159c = true;
            return false;
        } else if (this.f25160d == 10 && C != 1) {
            return false;
        } else {
            int a3 = a0Var.mo20548a();
            this.f25181a.mo6843d(a0Var, a3);
            this.f25181a.mo6838a(j, 1, a3, 0, (C4200e0.C4201a) null);
            return true;
        }
    }
}
