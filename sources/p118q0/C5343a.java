package p118q0;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p111p0.C5248a;
import p111p0.C5249b;
import p111p0.C5256e;
import p111p0.C5257f;

/* renamed from: q0.a */
/* compiled from: FrameworkSQLiteDatabase */
class C5343a implements C5249b {

    /* renamed from: b */
    private static final String[] f27395b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c */
    private static final String[] f27396c = new String[0];

    /* renamed from: a */
    private final SQLiteDatabase f27397a;

    /* renamed from: q0.a$a */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5344a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5256e f27398a;

        C5344a(C5256e eVar) {
            this.f27398a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f27398a.mo18712b(new C5350d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* renamed from: q0.a$b */
    /* compiled from: FrameworkSQLiteDatabase */
    class C5345b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        final /* synthetic */ C5256e f27400a;

        C5345b(C5256e eVar) {
            this.f27400a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f27400a.mo18712b(new C5350d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C5343a(SQLiteDatabase sQLiteDatabase) {
        this.f27397a = sQLiteDatabase;
    }

    /* renamed from: A */
    public List<Pair<String, String>> mo19229A() {
        return this.f27397a.getAttachedDbs();
    }

    /* renamed from: A1 */
    public Cursor mo19230A1(C5256e eVar, CancellationSignal cancellationSignal) {
        return this.f27397a.rawQueryWithFactory(new C5345b(eVar), eVar.mo18711a(), f27396c, (String) null, cancellationSignal);
    }

    /* renamed from: C */
    public void mo19231C(String str) throws SQLException {
        this.f27397a.execSQL(str);
    }

    /* renamed from: D0 */
    public void mo19232D0() {
        this.f27397a.endTransaction();
    }

    /* renamed from: N */
    public C5257f mo19233N(String str) {
        return new C5351e(this.f27397a.compileStatement(str));
    }

    /* renamed from: Y0 */
    public String mo19234Y0() {
        return this.f27397a.getPath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo19382a(SQLiteDatabase sQLiteDatabase) {
        return this.f27397a == sQLiteDatabase;
    }

    /* renamed from: a1 */
    public boolean mo19235a1() {
        return this.f27397a.inTransaction();
    }

    public void close() throws IOException {
        this.f27397a.close();
    }

    public boolean isOpen() {
        return this.f27397a.isOpen();
    }

    /* renamed from: n0 */
    public void mo19237n0() {
        this.f27397a.setTransactionSuccessful();
    }

    /* renamed from: o0 */
    public void mo19238o0(String str, Object[] objArr) throws SQLException {
        this.f27397a.execSQL(str, objArr);
    }

    /* renamed from: o1 */
    public Cursor mo19239o1(C5256e eVar) {
        return this.f27397a.rawQueryWithFactory(new C5344a(eVar), eVar.mo18711a(), f27396c, (String) null);
    }

    /* renamed from: u */
    public void mo19240u() {
        this.f27397a.beginTransaction();
    }

    /* renamed from: z0 */
    public Cursor mo19241z0(String str) {
        return mo19239o1(new C5248a(str));
    }
}
