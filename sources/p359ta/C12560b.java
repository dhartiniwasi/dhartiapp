package p359ta;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: ta.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12560b implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ C12561b0 f46082a;

    public /* synthetic */ C12560b(C12561b0 b0Var) {
        this.f46082a = b0Var;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return this.f46082a.mo37384a(sQLiteQuery);
    }
}
