package p296ma;

import android.database.Cursor;

/* renamed from: ma.b */
/* compiled from: CloseHelper */
public class C11876b {
    /* renamed from: a */
    public static void m57375a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
