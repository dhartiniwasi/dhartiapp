package p025c8;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.protobuf.C8135e0;
import com.google.protobuf.C8153i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p025c8.C6831x2;
import p211d8.C9888l;
import p220e8.C10009f;
import p220e8.C10010g;
import p229f8.C10158e;
import p238g8.C10294w0;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10456n;
import p247h8.C10472x;
import p404y7.C13073j;

/* renamed from: c8.q2 */
/* compiled from: SQLiteMutationQueue */
final class C6818q2 implements C6837z0 {

    /* renamed from: a */
    private final C6831x2 f31418a;

    /* renamed from: b */
    private final C6810o f31419b;

    /* renamed from: c */
    private final C6805l f31420c;

    /* renamed from: d */
    private final String f31421d;

    /* renamed from: e */
    private int f31422e;

    /* renamed from: f */
    private C8153i f31423f;

    /* renamed from: c8.q2$a */
    /* compiled from: SQLiteMutationQueue */
    private static class C6819a implements C10456n<Cursor> {

        /* renamed from: a */
        private final ArrayList<C8153i> f31424a = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f31425b = true;

        C6819a(byte[] bArr) {
            m39139c(bArr);
        }

        /* renamed from: c */
        private void m39139c(byte[] bArr) {
            this.f31424a.add(C8153i.m44777q(bArr));
        }

        /* renamed from: a */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            m39139c(blob);
            if (blob.length < 1000000) {
                this.f31425b = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22896d() {
            return this.f31424a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C8153i mo22897e() {
            return C8153i.m44776o(this.f31424a);
        }
    }

    C6818q2(C6831x2 x2Var, C6810o oVar, C13073j jVar, C6805l lVar) {
        this.f31418a = x2Var;
        this.f31419b = oVar;
        this.f31421d = jVar.mo38099b() ? jVar.mo38098a() : "";
        this.f31423f = C10294w0.f40882v;
        this.f31420c = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ C10010g m39104B(Cursor cursor) {
        return m39122v(cursor.getInt(0), cursor.getBlob(1));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m39106D(Cursor cursor) {
        this.f31422e = Math.max(this.f31422e, cursor.getInt(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ C10010g m39107E(int i, Cursor cursor) {
        return m39122v(i, cursor.getBlob(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m39109G(Cursor cursor) {
        this.f31423f = C8153i.m44777q(cursor.getBlob(0));
    }

    /* renamed from: H */
    private void m39110H() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f31418a.mo22912E("SELECT uid FROM mutation_queues").mo22932e(new C1916l2(arrayList));
        this.f31422e = 0;
        for (String str : arrayList) {
            this.f31418a.mo22912E("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").mo22929b(str).mo22932e(new C1899g2(this));
        }
        this.f31422e++;
    }

    /* renamed from: I */
    private void m39111I() {
        this.f31418a.mo22914v("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f31421d, -1, this.f31423f.mo26932K());
    }

    /* renamed from: v */
    private C10010g m39122v(int i, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f31419b.mo22865f(C10158e.m51568r0(bArr));
            }
            C6819a aVar = new C6819a(bArr);
            while (aVar.f31425b) {
                this.f31418a.mo22912E("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").mo22929b(Integer.valueOf((aVar.mo22896d() * 1000000) + 1), 1000000, this.f31421d, Integer.valueOf(i)).mo22930c(aVar);
            }
            return this.f31419b.mo22865f(C10158e.m51567q0(aVar.mo22897e()));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("MutationBatch failed to parse: %s", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m39123x(List list, Cursor cursor) {
        list.add(m39122v(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m39124y(Set set, List list, Cursor cursor) {
        int i = cursor.getInt(0);
        if (!set.contains(Integer.valueOf(i))) {
            set.add(Integer.valueOf(i));
            list.add(m39122v(i, cursor.getBlob(1)));
        }
    }

    /* renamed from: a */
    public void mo22882a(C10010g gVar, C8153i iVar) {
        this.f31423f = (C8153i) C10472x.m52785b(iVar);
        m39111I();
    }

    /* renamed from: b */
    public void mo22883b() {
        if (mo22894w()) {
            ArrayList arrayList = new ArrayList();
            this.f31418a.mo22912E("SELECT path FROM document_mutations WHERE uid = ?").mo22929b(this.f31421d).mo22932e(new C1913k2(arrayList));
            C10432b.m52648d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    /* renamed from: c */
    public void mo22884c(C10010g gVar) {
        SQLiteStatement D = this.f31418a.mo22911D("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement D2 = this.f31418a.mo22911D("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int e = gVar.mo32610e();
        C10432b.m52648d(this.f31418a.mo22913u(D, this.f31421d, Integer.valueOf(e)) != 0, "Mutation batch (%s, %d) did not exist", this.f31421d, Integer.valueOf(gVar.mo32610e()));
        for (C10009f g : gVar.mo32614h()) {
            C9888l g2 = g.mo32598g();
            this.f31418a.mo22913u(D2, this.f31421d, C6789f.m38862c(g2.mo32390s()), Integer.valueOf(e));
            this.f31418a.mo22745f().mo22796n(g2);
        }
    }

    /* renamed from: d */
    public List<C10010g> mo22885d(Iterable<C9888l> iterable) {
        ArrayList arrayList = new ArrayList();
        for (C9888l s : iterable) {
            arrayList.add(C6789f.m38862c(s.mo32390s()));
        }
        C6831x2.C6833b bVar = new C6831x2.C6833b(this.f31418a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(new Object[]{1000000, this.f31421d}), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (bVar.mo22922d()) {
            bVar.mo22923e().mo22932e(new C1910j2(this, hashSet, arrayList2));
        }
        if (bVar.mo22921c() > 1) {
            Collections.sort(arrayList2, C1932p2.f5597a);
        }
        return arrayList2;
    }

    /* renamed from: e */
    public C10010g mo22886e(C10428q qVar, List<C10009f> list, List<C10009f> list2) {
        int i = this.f31422e;
        this.f31422e = i + 1;
        C10010g gVar = new C10010g(i, qVar, list, list2);
        C10158e o = this.f31419b.mo22871o(gVar);
        this.f31418a.mo22914v("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f31421d, Integer.valueOf(i), o.mo26773h());
        HashSet hashSet = new HashSet();
        SQLiteStatement D = this.f31418a.mo22911D("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        for (C10009f g : list2) {
            C9888l g2 = g.mo32598g();
            if (hashSet.add(g2)) {
                String c = C6789f.m38862c(g2.mo32390s());
                this.f31418a.mo22913u(D, this.f31421d, c, Integer.valueOf(i));
                this.f31420c.mo22735i(g2.mo32388q());
            }
        }
        return gVar;
    }

    /* renamed from: f */
    public void mo22887f(C8153i iVar) {
        this.f31423f = (C8153i) C10472x.m52785b(iVar);
        m39111I();
    }

    /* renamed from: g */
    public C10010g mo22888g(int i) {
        return (C10010g) this.f31418a.mo22912E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").mo22929b(1000000, this.f31421d, Integer.valueOf(i + 1)).mo22931d(new C1920m2(this));
    }

    /* renamed from: h */
    public int mo22889h() {
        return ((Integer) this.f31418a.mo22912E("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").mo22929b(-1, this.f31421d).mo22931d(C1927o2.f5587a)).intValue();
    }

    /* renamed from: i */
    public C10010g mo22890i(int i) {
        return (C10010g) this.f31418a.mo22912E("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").mo22929b(1000000, this.f31421d, Integer.valueOf(i)).mo22931d(new C1924n2(this, i));
    }

    /* renamed from: j */
    public C8153i mo22891j() {
        return this.f31423f;
    }

    /* renamed from: k */
    public List<C10010g> mo22892k() {
        ArrayList arrayList = new ArrayList();
        this.f31418a.mo22912E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").mo22929b(1000000, this.f31421d).mo22932e(new C1906i2(this, arrayList));
        return arrayList;
    }

    public void start() {
        m39110H();
        if (this.f31418a.mo22912E("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").mo22929b(this.f31421d).mo22930c(new C1903h2(this)) == 0) {
            m39111I();
        }
    }

    /* renamed from: w */
    public boolean mo22894w() {
        return this.f31418a.mo22912E("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").mo22929b(this.f31421d).mo22933f();
    }
}
