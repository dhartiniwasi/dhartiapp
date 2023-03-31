package p015b3;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4221r;
import p085l2.C4912f;
import p161w3.C5917a;

/* renamed from: b3.c */
/* compiled from: BundledExtractorsAdapter */
public final class C1692c implements C1704f0 {

    /* renamed from: a */
    private final C4221r f4959a;

    /* renamed from: b */
    private C4215l f4960b;

    /* renamed from: c */
    private C4216m f4961c;

    public C1692c(C4221r rVar) {
        this.f4959a = rVar;
    }

    /* renamed from: a */
    public void mo6673a() {
        C4215l lVar = this.f4960b;
        if (lVar != null) {
            lVar.mo17579a();
            this.f4960b = null;
        }
        this.f4961c = null;
    }

    /* renamed from: c */
    public void mo6674c(long j, long j2) {
        ((C4215l) C5917a.m34872e(this.f4960b)).mo17580c(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.mo17554c() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r0.mo17554c() != r11) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6675d(p155v3.C5819i r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p037e2.C4217n r15) throws java.io.IOException {
        /*
            r7 = this;
            e2.f r6 = new e2.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f4961c = r6
            e2.l r8 = r7.f4960b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            e2.r r8 = r7.f4959a
            e2.l[] r8 = r8.mo17575b(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f4960b = r8
            goto L_0x0075
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x0071
            r1 = r8[r0]
            boolean r2 = r1.mo17583h(r6)     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            if (r2 == 0) goto L_0x0035
            r7.f4960b = r1     // Catch:{ EOFException -> 0x0057, all -> 0x0042 }
            p161w3.C5917a.m34873f(r14)
            r6.mo17560j()
            goto L_0x0071
        L_0x0035:
            e2.l r1 = r7.f4960b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.mo17554c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0042:
            r8 = move-exception
            e2.l r9 = r7.f4960b
            if (r9 != 0) goto L_0x004f
            long r9 = r6.mo17554c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0050
        L_0x004f:
            r13 = 1
        L_0x0050:
            p161w3.C5917a.m34873f(r13)
            r6.mo17560j()
            throw r8
        L_0x0057:
            e2.l r1 = r7.f4960b
            if (r1 != 0) goto L_0x0067
            long r1 = r6.mo17554c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = 1
        L_0x0068:
            p161w3.C5917a.m34873f(r1)
            r6.mo17560j()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0071:
            e2.l r10 = r7.f4960b
            if (r10 == 0) goto L_0x007b
        L_0x0075:
            e2.l r8 = r7.f4960b
            r8.mo17581d(r15)
            return
        L_0x007b:
            b3.a1 r10 = new b3.a1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p161w3.C5953m0.m35092M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p161w3.C5917a.m34872e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1692c.mo6675d(v3.i, android.net.Uri, java.util.Map, long, long, e2.n):void");
    }

    /* renamed from: e */
    public long mo6676e() {
        C4216m mVar = this.f4961c;
        if (mVar != null) {
            return mVar.mo17554c();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo6677f() {
        C4215l lVar = this.f4960b;
        if (lVar instanceof C4912f) {
            ((C4912f) lVar).mo18740k();
        }
    }

    /* renamed from: g */
    public int mo6678g(C4190a0 a0Var) throws IOException {
        return ((C4215l) C5917a.m34872e(this.f4960b)).mo17582e((C4216m) C5917a.m34872e(this.f4961c), a0Var);
    }
}
