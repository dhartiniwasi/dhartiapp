package p099n2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import p037e2.C4205h0;
import p099n2.C5114i;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: n2.j */
/* compiled from: VorbisReader */
final class C5118j extends C5114i {

    /* renamed from: n */
    private C5119a f26617n;

    /* renamed from: o */
    private int f26618o;

    /* renamed from: p */
    private boolean f26619p;

    /* renamed from: q */
    private C4205h0.C4209d f26620q;

    /* renamed from: r */
    private C4205h0.C4207b f26621r;

    /* renamed from: n2.j$a */
    /* compiled from: VorbisReader */
    static final class C5119a {

        /* renamed from: a */
        public final C4205h0.C4209d f26622a;

        /* renamed from: b */
        public final C4205h0.C4207b f26623b;

        /* renamed from: c */
        public final byte[] f26624c;

        /* renamed from: d */
        public final C4205h0.C4208c[] f26625d;

        /* renamed from: e */
        public final int f26626e;

        public C5119a(C4205h0.C4209d dVar, C4205h0.C4207b bVar, byte[] bArr, C4205h0.C4208c[] cVarArr, int i) {
            this.f26622a = dVar;
            this.f26623b = bVar;
            this.f26624c = bArr;
            this.f26625d = cVarArr;
            this.f26626e = i;
        }
    }

    C5118j() {
    }

    /* renamed from: n */
    static void m31986n(C5918a0 a0Var, long j) {
        if (a0Var.mo20549b() < a0Var.mo20553f() + 4) {
            a0Var.mo20543L(Arrays.copyOf(a0Var.mo20551d(), a0Var.mo20553f() + 4));
        } else {
            a0Var.mo20545N(a0Var.mo20553f() + 4);
        }
        byte[] d = a0Var.mo20551d();
        d[a0Var.mo20553f() - 4] = (byte) ((int) (j & 255));
        d[a0Var.mo20553f() - 3] = (byte) ((int) ((j >>> 8) & 255));
        d[a0Var.mo20553f() - 2] = (byte) ((int) ((j >>> 16) & 255));
        d[a0Var.mo20553f() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: o */
    private static int m31987o(byte b, C5119a aVar) {
        if (!aVar.f26625d[m31988p(b, aVar.f26626e, 1)].f23530a) {
            return aVar.f26622a.f23540g;
        }
        return aVar.f26622a.f23541h;
    }

    /* renamed from: p */
    static int m31988p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: r */
    public static boolean m31989r(C5918a0 a0Var) {
        try {
            return C4205h0.m28436m(1, a0Var, true);
        } catch (C6249m2 unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19087e(long j) {
        super.mo19087e(j);
        int i = 0;
        this.f26619p = j != 0;
        C4205h0.C4209d dVar = this.f26620q;
        if (dVar != null) {
            i = dVar.f23540g;
        }
        this.f26618o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo19071f(C5918a0 a0Var) {
        int i = 0;
        if ((a0Var.mo20551d()[0] & 1) == 1) {
            return -1;
        }
        int o = m31987o(a0Var.mo20551d()[0], (C5119a) C5917a.m34875h(this.f26617n));
        if (this.f26619p) {
            i = (this.f26618o + o) / 4;
        }
        long j = (long) i;
        m31986n(a0Var, j);
        this.f26619p = true;
        this.f26618o = o;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo19072i(C5918a0 a0Var, long j, C5114i.C5116b bVar) throws IOException {
        if (this.f26617n != null) {
            C5917a.m34872e(bVar.f26615a);
            return false;
        }
        C5119a q = mo19090q(a0Var);
        this.f26617n = q;
        if (q == null) {
            return true;
        }
        C4205h0.C4209d dVar = q.f26622a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f23543j);
        arrayList.add(q.f26624c);
        bVar.f26615a = new C6272r1.C6274b().mo21517e0("audio/vorbis").mo21493G(dVar.f23538e).mo21512Z(dVar.f23537d).mo21494H(dVar.f23535b).mo21518f0(dVar.f23536c).mo21506T(arrayList).mo21510X(C4205h0.m28426c(C6685q.m38444u(q.f26623b.f23528b))).mo21491E();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo19073l(boolean z) {
        super.mo19073l(z);
        if (z) {
            this.f26617n = null;
            this.f26620q = null;
            this.f26621r = null;
        }
        this.f26618o = 0;
        this.f26619p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C5119a mo19090q(C5918a0 a0Var) throws IOException {
        C4205h0.C4209d dVar = this.f26620q;
        if (dVar == null) {
            this.f26620q = C4205h0.m28434k(a0Var);
            return null;
        }
        C4205h0.C4207b bVar = this.f26621r;
        if (bVar == null) {
            this.f26621r = C4205h0.m28432i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.mo20553f()];
        System.arraycopy(a0Var.mo20551d(), 0, bArr, 0, a0Var.mo20553f());
        C4205h0.C4208c[] l = C4205h0.m28435l(a0Var, dVar.f23535b);
        return new C5119a(dVar, bVar, bArr, l, C4205h0.m28424a(l.length - 1));
    }
}
