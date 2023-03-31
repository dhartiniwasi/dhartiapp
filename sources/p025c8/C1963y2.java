package p025c8;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: c8.y2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1963y2 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a */
    public final /* synthetic */ Object[] f5649a;

    public /* synthetic */ C1963y2(Object[] objArr) {
        this.f5649a = objArr;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return C6831x2.m39319r(sQLiteQuery, this.f5649a);
    }
}
