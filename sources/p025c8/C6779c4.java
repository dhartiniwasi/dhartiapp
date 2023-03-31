package p025c8;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.google.protobuf.C8135e0;
import java.util.Iterator;
import p008a8.C6469g1;
import p211d8.C9888l;
import p211d8.C9905w;
import p229f8.C10151c;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10456n;
import p320p7.C12130e;

/* renamed from: c8.c4 */
/* compiled from: SQLiteTargetCache */
final class C6779c4 implements C6788e4 {

    /* renamed from: a */
    private final C6831x2 f31311a;

    /* renamed from: b */
    private final C6810o f31312b;

    /* renamed from: c */
    private int f31313c;

    /* renamed from: d */
    private long f31314d;

    /* renamed from: e */
    private C9905w f31315e = C9905w.f39751b;

    /* renamed from: f */
    private long f31316f;

    /* renamed from: c8.c4$b */
    /* compiled from: SQLiteTargetCache */
    private static class C6781b {
        /* access modifiers changed from: package-private */

        /* renamed from: a */
        public C12130e<C9888l> f31317a;

        private C6781b() {
            this.f31317a = C9888l.m50695j();
        }
    }

    /* renamed from: c8.c4$c */
    /* compiled from: SQLiteTargetCache */
    private static class C6782c {

        /* renamed from: a */
        C6792f4 f31318a;

        private C6782c() {
        }
    }

    C6779c4(C6831x2 x2Var, C6810o oVar) {
        this.f31311a = x2Var;
        this.f31312b = oVar;
    }

    /* renamed from: A */
    private void m38789A(C6792f4 f4Var) {
        int g = f4Var.mo22807g();
        String c = f4Var.mo22806f().mo21933c();
        C10428q b = f4Var.mo22804e().mo32439b();
        C10151c q = this.f31312b.mo22872q(f4Var);
        this.f31311a.mo22914v("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(g), c, Long.valueOf(b.mo33499c()), Integer.valueOf(b.mo33498b()), f4Var.mo22802c().mo26932K(), Long.valueOf(f4Var.mo22803d()), q.mo26773h());
    }

    /* renamed from: C */
    private boolean m38790C(C6792f4 f4Var) {
        boolean z;
        if (f4Var.mo22807g() > this.f31313c) {
            this.f31313c = f4Var.mo22807g();
            z = true;
        } else {
            z = false;
        }
        if (f4Var.mo22803d() <= this.f31314d) {
            return z;
        }
        this.f31314d = f4Var.mo22803d();
        return true;
    }

    /* renamed from: D */
    private void m38791D() {
        this.f31311a.mo22914v("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f31313c), Long.valueOf(this.f31314d), Long.valueOf(this.f31315e.mo32439b().mo33499c()), Integer.valueOf(this.f31315e.mo32439b().mo33498b()), Long.valueOf(this.f31316f));
    }

    /* renamed from: p */
    private C6792f4 m38797p(byte[] bArr) {
        try {
            return this.f31312b.mo22866h(C10151c.m51520t0(bArr));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("TargetData failed to parse: %s", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m38798t(C10456n nVar, Cursor cursor) {
        nVar.accept(m38797p(cursor.getBlob(0)));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m38800v(C6469g1 g1Var, C6782c cVar, Cursor cursor) {
        C6792f4 p = m38797p(cursor.getBlob(0));
        if (g1Var.equals(p.mo22806f())) {
            cVar.f31318a = p;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m38801w(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i = cursor.getInt(0);
        if (sparseArray.get(i) == null) {
            m38803z(i);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m38802x(Cursor cursor) {
        this.f31313c = cursor.getInt(0);
        this.f31314d = (long) cursor.getInt(1);
        this.f31315e = new C9905w(new C10428q(cursor.getLong(2), cursor.getInt(3)));
        this.f31316f = cursor.getLong(4);
    }

    /* renamed from: z */
    private void m38803z(int i) {
        mo22760g(i);
        this.f31311a.mo22914v("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i));
        this.f31316f--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo22753B() {
        boolean z = true;
        if (this.f31311a.mo22912E("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").mo22930c(new C1964y3(this)) != 1) {
            z = false;
        }
        C10432b.m52648d(z, "Missing target_globals entry", new Object[0]);
    }

    /* renamed from: a */
    public void mo22754a(C6792f4 f4Var) {
        m38789A(f4Var);
        if (m38790C(f4Var)) {
            m38791D();
        }
    }

    /* renamed from: b */
    public void mo22755b(C12130e<C9888l> eVar, int i) {
        SQLiteStatement D = this.f31311a.mo22911D("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        C6791f2 z = this.f31311a.mo22745f();
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            C9888l next = it.next();
            String c = C6789f.m38862c(next.mo32390s());
            this.f31311a.mo22913u(D, Integer.valueOf(i), c);
            z.mo22795m(next);
        }
    }

    /* renamed from: c */
    public int mo22756c() {
        return this.f31313c;
    }

    /* renamed from: d */
    public void mo22757d(C6792f4 f4Var) {
        m38789A(f4Var);
        m38790C(f4Var);
        this.f31316f++;
        m38791D();
    }

    /* renamed from: e */
    public C12130e<C9888l> mo22758e(int i) {
        C6781b bVar = new C6781b();
        this.f31311a.mo22912E("SELECT path FROM target_documents WHERE target_id = ?").mo22929b(Integer.valueOf(i)).mo22932e(new C1960x3(bVar));
        return bVar.f31317a;
    }

    /* renamed from: f */
    public C9905w mo22759f() {
        return this.f31315e;
    }

    /* renamed from: g */
    public void mo22760g(int i) {
        this.f31311a.mo22914v("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i));
    }

    /* renamed from: h */
    public C6792f4 mo22761h(C6469g1 g1Var) {
        String c = g1Var.mo21933c();
        C6782c cVar = new C6782c();
        this.f31311a.mo22912E("SELECT target_proto FROM targets WHERE canonical_id = ?").mo22929b(c).mo22932e(new C1968z3(this, g1Var, cVar));
        return cVar.f31318a;
    }

    /* renamed from: i */
    public void mo22762i(C9905w wVar) {
        this.f31315e = wVar;
        m38791D();
    }

    /* renamed from: j */
    public void mo22763j(C12130e<C9888l> eVar, int i) {
        SQLiteStatement D = this.f31311a.mo22911D("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        C6791f2 z = this.f31311a.mo22745f();
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            C9888l next = it.next();
            String c = C6789f.m38862c(next.mo32390s());
            this.f31311a.mo22913u(D, Integer.valueOf(i), c);
            z.mo22794l(next);
        }
    }

    /* renamed from: q */
    public void mo22764q(C10456n<C6792f4> nVar) {
        this.f31311a.mo22912E("SELECT target_proto FROM targets").mo22932e(new C1884b4(this, nVar));
    }

    /* renamed from: r */
    public long mo22765r() {
        return this.f31314d;
    }

    /* renamed from: s */
    public long mo22766s() {
        return this.f31316f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo22767y(long j, SparseArray<?> sparseArray) {
        int[] iArr = new int[1];
        this.f31311a.mo22912E("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").mo22929b(Long.valueOf(j)).mo22932e(new C1881a4(this, sparseArray, iArr));
        m38791D();
        return iArr[0];
    }
}
