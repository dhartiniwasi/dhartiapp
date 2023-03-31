package p118q0;

import android.database.sqlite.SQLiteStatement;
import p111p0.C5257f;

/* renamed from: q0.e */
/* compiled from: FrameworkSQLiteStatement */
class C5351e extends C5350d implements C5257f {

    /* renamed from: b */
    private final SQLiteStatement f27415b;

    C5351e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f27415b = sQLiteStatement;
    }

    /* renamed from: C1 */
    public long mo19247C1() {
        return this.f27415b.executeInsert();
    }

    /* renamed from: M */
    public int mo19248M() {
        return this.f27415b.executeUpdateDelete();
    }
}
