package p025c8;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import p220e8.C10010g;
import p247h8.C10432b;
import p404y7.C13073j;

/* renamed from: c8.u2 */
/* compiled from: SQLiteOverlayMigrationManager */
public class C6826u2 implements C6774a1 {

    /* renamed from: a */
    private final C6831x2 f31442a;

    public C6826u2(C6831x2 x2Var) {
        this.f31442a = x2Var;
    }

    /* renamed from: d */
    private void m39216d() {
        this.f31442a.mo22750k("build overlays", new C1946t2(this));
    }

    /* renamed from: e */
    private Set<String> m39217e() {
        HashSet hashSet = new HashSet();
        this.f31442a.mo22912E("SELECT DISTINCT uid FROM mutation_queues").mo22932e(new C1939r2(hashSet));
        return hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m39218g() {
        if (mo22902f()) {
            Set<String> e = m39217e();
            C6799i1 g = this.f31442a.mo22746g();
            for (String jVar : e) {
                C13073j jVar2 = new C13073j(jVar);
                C6831x2 x2Var = this.f31442a;
                C6837z0 d = x2Var.mo22743d(jVar2, x2Var.mo22742c(jVar2));
                HashSet hashSet = new HashSet();
                for (C10010g f : d.mo22892k()) {
                    hashSet.addAll(f.mo32612f());
                }
                new C6809n(g, d, this.f31442a.mo22741b(jVar2), this.f31442a.mo22742c(jVar2)).mo22860n(hashSet);
            }
            m39221j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m39220i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (C6778c1.f31310b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e) {
            throw C10432b.m52645a("SQLitePersistence.DataMigration failed to parse: %s", e);
        }
    }

    /* renamed from: j */
    private void m39221j() {
        this.f31442a.mo22914v("DELETE FROM data_migrations WHERE migration_name = ?", C6778c1.f31310b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo22902f() {
        Boolean[] boolArr = {Boolean.FALSE};
        this.f31442a.mo22912E("SELECT migration_name FROM data_migrations").mo22932e(new C1942s2(boolArr));
        return boolArr[0].booleanValue();
    }

    public void run() {
        m39216d();
    }
}
