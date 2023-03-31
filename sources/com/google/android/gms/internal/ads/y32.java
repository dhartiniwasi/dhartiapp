package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y32 {
    /* renamed from: a */
    public static int m23743a(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = 0;
        if (i == 2) {
            return 0;
        }
        Cursor h = m23750h(sQLiteDatabase, i);
        if (h.getCount() > 0) {
            h.moveToNext();
            i2 = h.getInt(h.getColumnIndexOrThrow("value"));
        }
        h.close();
        return i2;
    }

    /* renamed from: b */
    public static long m23744b(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor h = m23750h(sQLiteDatabase, 2);
        if (h.getCount() > 0) {
            h.moveToNext();
            j = h.getLong(h.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        h.close();
        return j;
    }

    /* renamed from: c */
    public static ArrayList m23745c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                arrayList.add(C2417gx.m13569Q(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (ey3 e) {
                pm0.m18664d("Unable to deserialize proto from offline signals database:");
                pm0.m18664d(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public static void m23746d(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", (String) null, contentValues);
        }
    }

    /* renamed from: e */
    public static void m23747e(SQLiteDatabase sQLiteDatabase) {
        m23751i(sQLiteDatabase, "failed_requests", 0);
        m23751i(sQLiteDatabase, "total_requests", 0);
        m23751i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", 0L);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues);
    }

    /* renamed from: f */
    public static void m23748f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", (String) null, (String[]) null);
        m23752j(sQLiteDatabase, "failed_requests", 0);
        m23752j(sQLiteDatabase, "total_requests", 0);
        m23752j(sQLiteDatabase, "completed_requests", 0);
    }

    /* renamed from: g */
    public static void m23749g(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        if (!z2) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"total_requests"}));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"completed_requests"}));
        if (!z) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", new Object[]{"failed_requests"}));
        }
    }

    /* renamed from: h */
    private static Cursor m23750h(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i == 1) {
            strArr2[0] = "total_requests";
        } else if (i != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, (String) null, (String) null, (String) null);
    }

    /* renamed from: i */
    private static void m23751i(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", 0);
        sQLiteDatabase.insert("offline_signal_statistics", (String) null, contentValues);
    }

    /* renamed from: j */
    private static void m23752j(SQLiteDatabase sQLiteDatabase, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
