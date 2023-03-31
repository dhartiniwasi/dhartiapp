package p031d3;

import android.util.SparseArray;
import java.io.IOException;
import p031d3.C4061g;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4197d;
import p037e2.C4198d0;
import p037e2.C4200e0;
import p037e2.C4214k;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p155v3.C5819i;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: d3.e */
/* compiled from: BundledChunkExtractor */
public final class C4058e implements C4217n, C4061g {

    /* renamed from: r */
    public static final C4061g.C4062a f23144r = C9864d.f39655a;

    /* renamed from: s */
    private static final C4190a0 f23145s = new C4190a0();

    /* renamed from: a */
    private final C4215l f23146a;

    /* renamed from: b */
    private final int f23147b;

    /* renamed from: c */
    private final C6272r1 f23148c;

    /* renamed from: d */
    private final SparseArray<C4059a> f23149d = new SparseArray<>();

    /* renamed from: e */
    private boolean f23150e;

    /* renamed from: f */
    private C4061g.C4063b f23151f;

    /* renamed from: g */
    private long f23152g;

    /* renamed from: h */
    private C4192b0 f23153h;

    /* renamed from: i */
    private C6272r1[] f23154i;

    /* renamed from: d3.e$a */
    /* compiled from: BundledChunkExtractor */
    private static final class C4059a implements C4200e0 {

        /* renamed from: a */
        private final int f23155a;

        /* renamed from: b */
        private final int f23156b;

        /* renamed from: c */
        private final C6272r1 f23157c;

        /* renamed from: d */
        private final C4214k f23158d = new C4214k();

        /* renamed from: e */
        public C6272r1 f23159e;

        /* renamed from: f */
        private C4200e0 f23160f;

        /* renamed from: g */
        private long f23161g;

        public C4059a(int i, int i2, C6272r1 r1Var) {
            this.f23155a = i;
            this.f23156b = i2;
            this.f23157c = r1Var;
        }

        /* renamed from: a */
        public void mo6838a(long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
            long j2 = this.f23161g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f23160f = this.f23158d;
            }
            ((C4200e0) C5953m0.m35138j(this.f23160f)).mo6838a(j, i, i2, i3, aVar);
        }

        /* renamed from: b */
        public /* synthetic */ int mo6840b(C5819i iVar, int i, boolean z) {
            return C4198d0.m28382a(this, iVar, i, z);
        }

        /* renamed from: c */
        public int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException {
            return ((C4200e0) C5953m0.m35138j(this.f23160f)).mo6840b(iVar, i, z);
        }

        /* renamed from: d */
        public /* synthetic */ void mo6843d(C5918a0 a0Var, int i) {
            C4198d0.m28383b(this, a0Var, i);
        }

        /* renamed from: e */
        public void mo6845e(C6272r1 r1Var) {
            C6272r1 r1Var2 = this.f23157c;
            if (r1Var2 != null) {
                r1Var = r1Var.mo21489j(r1Var2);
            }
            this.f23159e = r1Var;
            ((C4200e0) C5953m0.m35138j(this.f23160f)).mo6845e(this.f23159e);
        }

        /* renamed from: f */
        public void mo6847f(C5918a0 a0Var, int i, int i2) {
            ((C4200e0) C5953m0.m35138j(this.f23160f)).mo6843d(a0Var, i);
        }

        /* renamed from: g */
        public void mo17277g(C4061g.C4063b bVar, long j) {
            if (bVar == null) {
                this.f23160f = this.f23158d;
                return;
            }
            this.f23161g = j;
            C4200e0 f = bVar.mo17271f(this.f23155a, this.f23156b);
            this.f23160f = f;
            C6272r1 r1Var = this.f23159e;
            if (r1Var != null) {
                f.mo6845e(r1Var);
            }
        }
    }

    public C4058e(C4215l lVar, int i, C6272r1 r1Var) {
        this.f23146a = lVar;
        this.f23147b = i;
        this.f23148c = r1Var;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [k2.e] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ p031d3.C4061g m27907h(int r6, p177z1.C6272r1 r7, boolean r8, java.util.List r9, p037e2.C4200e0 r10, p004a2.C0079u1 r11) {
        /*
            java.lang.String r11 = r7.f30242s
            boolean r0 = p161w3.C5967v.m35254r(r11)
            if (r0 == 0) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            boolean r11 = p161w3.C5967v.m35253q(r11)
            if (r11 == 0) goto L_0x0017
            k2.e r8 = new k2.e
            r9 = 1
            r8.<init>(r9)
            goto L_0x0028
        L_0x0017:
            r11 = 0
            if (r8 == 0) goto L_0x001d
            r11 = 4
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            m2.g r8 = new m2.g
            r2 = 0
            r3 = 0
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0028:
            d3.e r9 = new d3.e
            r9.<init>(r8, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p031d3.C4058e.m27907h(int, z1.r1, boolean, java.util.List, e2.e0, a2.u1):d3.g");
    }

    /* renamed from: a */
    public void mo17272a() {
        this.f23146a.mo17579a();
    }

    /* renamed from: b */
    public boolean mo17273b(C4216m mVar) throws IOException {
        int e = this.f23146a.mo17582e(mVar, f23145s);
        C5917a.m34873f(e != 1);
        if (e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo17274c(C4061g.C4063b bVar, long j, long j2) {
        this.f23151f = bVar;
        this.f23152g = j2;
        if (!this.f23150e) {
            this.f23146a.mo17581d(this);
            if (j != -9223372036854775807L) {
                this.f23146a.mo17580c(0, j);
            }
            this.f23150e = true;
            return;
        }
        C4215l lVar = this.f23146a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        lVar.mo17580c(0, j);
        for (int i = 0; i < this.f23149d.size(); i++) {
            this.f23149d.valueAt(i).mo17277g(bVar, j2);
        }
    }

    /* renamed from: d */
    public C6272r1[] mo17275d() {
        return this.f23154i;
    }

    /* renamed from: e */
    public C4197d mo17276e() {
        C4192b0 b0Var = this.f23153h;
        if (b0Var instanceof C4197d) {
            return (C4197d) b0Var;
        }
        return null;
    }

    /* renamed from: f */
    public C4200e0 mo6778f(int i, int i2) {
        C4059a aVar = this.f23149d.get(i);
        if (aVar == null) {
            C5917a.m34873f(this.f23154i == null);
            aVar = new C4059a(i, i2, i2 == this.f23147b ? this.f23148c : null);
            aVar.mo17277g(this.f23151f, this.f23152g);
            this.f23149d.put(i, aVar);
        }
        return aVar;
    }

    /* renamed from: l */
    public void mo6781l(C4192b0 b0Var) {
        this.f23153h = b0Var;
    }

    /* renamed from: n */
    public void mo6782n() {
        C6272r1[] r1VarArr = new C6272r1[this.f23149d.size()];
        for (int i = 0; i < this.f23149d.size(); i++) {
            r1VarArr[i] = (C6272r1) C5917a.m34875h(this.f23149d.valueAt(i).f23159e);
        }
        this.f23154i = r1VarArr;
    }
}
