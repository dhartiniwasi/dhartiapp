package p025c8;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p008a8.C6504v0;
import p025c8.C6812o0;
import p211d8.C9888l;
import p247h8.C10432b;
import p247h8.C10456n;

/* renamed from: c8.f2 */
/* compiled from: SQLiteLruReferenceDelegate */
class C6791f2 implements C6793g1, C6804k0 {

    /* renamed from: a */
    private final C6831x2 f31335a;

    /* renamed from: b */
    private C6504v0 f31336b;

    /* renamed from: c */
    private long f31337c = -1;

    /* renamed from: d */
    private final C6812o0 f31338d;

    /* renamed from: e */
    private C6794h1 f31339e;

    C6791f2(C6831x2 x2Var, C6812o0.C6814b bVar) {
        this.f31335a = x2Var;
        this.f31338d = new C6812o0(this, bVar);
    }

    /* renamed from: A */
    private void m38868A(C9888l lVar) {
        String c = C6789f.m38862c(lVar.mo32390s());
        this.f31335a.mo22914v("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", c, Long.valueOf(mo22787e()));
    }

    /* renamed from: t */
    private boolean m38872t(C9888l lVar) {
        if (this.f31339e.mo22815c(lVar)) {
            return true;
        }
        return m38876x(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m38875w(int[] iArr, List list, Cursor cursor) {
        C9888l n = C9888l.m50697n(C6789f.m38861b(cursor.getString(0)));
        if (!m38872t(n)) {
            iArr[0] = iArr[0] + 1;
            list.add(n);
            m38877y(n);
        }
    }

    /* renamed from: x */
    private boolean m38876x(C9888l lVar) {
        return !this.f31335a.mo22912E("SELECT 1 FROM document_mutations WHERE path = ?").mo22929b(C6789f.m38862c(lVar.mo32390s())).mo22933f();
    }

    /* renamed from: y */
    private void m38877y(C9888l lVar) {
        this.f31335a.mo22914v("DELETE FROM target_documents WHERE path = ? AND target_id = 0", C6789f.m38862c(lVar.mo32390s()));
    }

    /* renamed from: a */
    public int mo22783a(long j, SparseArray<?> sparseArray) {
        return this.f31335a.mo22747h().mo22767y(j, sparseArray);
    }

    /* renamed from: b */
    public void mo22784b() {
        C10432b.m52648d(this.f31337c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f31337c = -1;
    }

    /* renamed from: c */
    public C6812o0 mo22785c() {
        return this.f31338d;
    }

    /* renamed from: d */
    public void mo22786d() {
        C10432b.m52648d(this.f31337c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f31337c = this.f31336b.mo22070a();
    }

    /* renamed from: e */
    public long mo22787e() {
        C10432b.m52648d(this.f31337c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f31337c;
    }

    /* renamed from: f */
    public void mo22788f(C6794h1 h1Var) {
        this.f31339e = h1Var;
    }

    /* renamed from: g */
    public long mo22789g() {
        return this.f31335a.mo22747h().mo22766s() + ((Long) this.f31335a.mo22912E("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").mo22931d(C1893e2.f5535a)).longValue();
    }

    /* renamed from: h */
    public void mo22790h(C10456n<Long> nVar) {
        this.f31335a.mo22912E("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").mo22932e(new C1891d2(nVar));
    }

    /* renamed from: i */
    public int mo22791i(long j) {
        int[] iArr = new int[1];
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z = true;
            while (true) {
                if (z) {
                    if (this.f31335a.mo22912E("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").mo22929b(Long.valueOf(j), 100).mo22932e(new C1887c2(this, iArr, arrayList)) != 100) {
                        z = false;
                    }
                } else {
                    this.f31335a.mo22746g().removeAll(arrayList);
                    return iArr[0];
                }
            }
        }
    }

    /* renamed from: j */
    public void mo22792j(C9888l lVar) {
        m38868A(lVar);
    }

    /* renamed from: k */
    public long mo22793k() {
        return this.f31335a.mo22915w();
    }

    /* renamed from: l */
    public void mo22794l(C9888l lVar) {
        m38868A(lVar);
    }

    /* renamed from: m */
    public void mo22795m(C9888l lVar) {
        m38868A(lVar);
    }

    /* renamed from: n */
    public void mo22796n(C9888l lVar) {
        m38868A(lVar);
    }

    /* renamed from: o */
    public void mo22797o(C10456n<C6792f4> nVar) {
        this.f31335a.mo22747h().mo22764q(nVar);
    }

    /* renamed from: p */
    public void mo22798p(C6792f4 f4Var) {
        this.f31335a.mo22747h().mo22754a(f4Var.mo22811j(mo22787e()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo22799z(long j) {
        this.f31336b = new C6504v0(j);
    }
}
