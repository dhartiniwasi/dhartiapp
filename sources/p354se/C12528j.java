package p354se;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: se.j */
/* compiled from: TaskDao.kt */
public final class C12528j {

    /* renamed from: a */
    private final C12529k f46018a;

    /* renamed from: b */
    private final String[] f46019b = {"_id", "task_id", "progress", "status", "url", "file_name", "saved_dir", "headers", "mime_type", "resumable", "open_file_from_notification", "show_notification", "time_created", "save_in_public_storage", "allow_cellular"};

    public C12528j(C12529k kVar) {
        C12529k kVar2 = kVar;
        C11669k.m56787e(kVar2, "dbHelper");
        this.f46018a = kVar2;
    }

    /* renamed from: f */
    private final C12520c m59712f(Cursor cursor) {
        Cursor cursor2 = cursor;
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("_id"));
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("task_id"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("status"));
        int i3 = cursor2.getInt(cursor2.getColumnIndexOrThrow("progress"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("url"));
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("file_name"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("saved_dir"));
        String string5 = cursor2.getString(cursor2.getColumnIndexOrThrow("headers"));
        String string6 = cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type"));
        short s = cursor2.getShort(cursor2.getColumnIndexOrThrow("resumable"));
        short s2 = cursor2.getShort(cursor2.getColumnIndexOrThrow("show_notification"));
        short s3 = cursor2.getShort(cursor2.getColumnIndexOrThrow("open_file_from_notification"));
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("time_created"));
        short s4 = cursor2.getShort(cursor2.getColumnIndexOrThrow("save_in_public_storage"));
        String str = string3;
        short s5 = cursor2.getShort(cursor2.getColumnIndexOrThrow("allow_cellular"));
        C11669k.m56786d(string, "taskId");
        C12518a aVar = C12518a.values()[i2];
        C11669k.m56786d(string2, "url");
        C11669k.m56786d(string4, "savedDir");
        C11669k.m56786d(string5, "headers");
        C11669k.m56786d(string6, "mimeType");
        return new C12520c(i, string, aVar, i3, string2, str, string4, string5, string6, s == 1, s2 == 1, s3 == 1, j, s4 == 1, s5 == 1);
    }

    /* renamed from: a */
    public final void mo37330a(String str) {
        C11669k.m56787e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("task", "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* renamed from: b */
    public final void mo37331b(String str, String str2, C12518a aVar, int i, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        C11669k.m56787e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str);
        contentValues.put("url", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i));
        contentValues.put("file_name", str3);
        contentValues.put("saved_dir", str4);
        contentValues.put("headers", str5);
        contentValues.put("mime_type", "unknown");
        contentValues.put("show_notification", Integer.valueOf(z ? 1 : 0));
        contentValues.put("open_file_from_notification", Integer.valueOf(z2 ? 1 : 0));
        contentValues.put("resumable", 0);
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("save_in_public_storage", Integer.valueOf(z3 ? 1 : 0));
        contentValues.put("allow_cellular", Integer.valueOf(z4 ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.insertWithOnConflict("task", (String) null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* renamed from: c */
    public final List<C12520c> mo37332c() {
        Cursor query = this.f46018a.getReadableDatabase().query("task", this.f46019b, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            C11669k.m56786d(query, "cursor");
            arrayList.add(m59712f(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public final C12520c mo37333d(String str) {
        C11669k.m56787e(str, "taskId");
        Cursor query = this.f46018a.getReadableDatabase().query("task", this.f46019b, "task_id = ?", new String[]{str}, (String) null, (String) null, "_id DESC", "1");
        C12520c cVar = null;
        while (query.moveToNext()) {
            C11669k.m56786d(query, "cursor");
            cVar = m59712f(query);
        }
        query.close();
        return cVar;
    }

    /* renamed from: e */
    public final List<C12520c> mo37334e(String str) {
        Cursor rawQuery = this.f46018a.getReadableDatabase().rawQuery(str, (String[]) null);
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C11669k.m56786d(rawQuery, "cursor");
            arrayList.add(m59712f(rawQuery));
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: g */
    public final void mo37335g(String str, String str2, String str3) {
        C11669k.m56787e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("file_name", str2);
        contentValues.put("mime_type", str3);
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* renamed from: h */
    public final void mo37336h(String str, String str2, C12518a aVar, int i, boolean z) {
        C11669k.m56787e(str, "currentTaskId");
        C11669k.m56787e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("task_id", str2);
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i));
        contentValues.put("resumable", Integer.valueOf(z ? 1 : 0));
        contentValues.put("time_created", Long.valueOf(System.currentTimeMillis()));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* renamed from: i */
    public final void mo37337i(String str, C12518a aVar, int i) {
        C11669k.m56787e(str, "taskId");
        C11669k.m56787e(aVar, "status");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(aVar.ordinal()));
        contentValues.put("progress", Integer.valueOf(i));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }

    /* renamed from: j */
    public final void mo37338j(String str, boolean z) {
        C11669k.m56787e(str, "taskId");
        SQLiteDatabase writableDatabase = this.f46018a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("resumable", Integer.valueOf(z ? 1 : 0));
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("task", contentValues, "task_id = ?", new String[]{str});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
        writableDatabase.endTransaction();
    }
}
