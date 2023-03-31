package p269ja;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.jvm.internal.C11669k;
import p249ha.C10488b;

/* renamed from: ja.k */
/* compiled from: OSOutcomeTableProvider.kt */
public final class C11515k {
    /* renamed from: a */
    public final void mo35536a(SQLiteDatabase sQLiteDatabase) {
        C11669k.m56787e(sQLiteDatabase, "db");
        String str = "_id,name" + "," + "notification_id";
        String str2 = "_id,name" + "," + "channel_influence_id";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + str2 + ")" + " SELECT " + str + " FROM " + "cached_unique_outcome_notification" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE cached_unique_outcome SET channel_type = '");
            sb.append(C10488b.NOTIFICATION.toString());
            sb.append("';");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE " + "cached_unique_outcome_notification" + ';');
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    /* renamed from: b */
    public final void mo35537b(SQLiteDatabase sQLiteDatabase) {
        C11669k.m56787e(sQLiteDatabase, "db");
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(" + "_id,session,notification_ids,name,timestamp" + ");");
            sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT " + "_id,session,notification_ids,name,timestamp" + " FROM outcome;");
            sQLiteDatabase.execSQL("DROP TABLE outcome;");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome (" + "_id,session,notification_ids,name,timestamp" + ", weight) SELECT " + "_id,session,notification_ids,name,timestamp" + ", 0 FROM outcome_backup;");
            sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }

    /* renamed from: c */
    public final void mo35538c(SQLiteDatabase sQLiteDatabase) {
        C11669k.m56787e(sQLiteDatabase, "db");
        String str = "_id,name,timestamp,notification_ids,weight" + "," + "session";
        String str2 = "_id,name,timestamp,notification_ids,weight" + "," + "notification_influence_type";
        try {
            sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
            sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO " + "outcome_aux" + ";");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("INSERT INTO outcome(" + str2 + ")" + " SELECT " + str + " FROM " + "outcome_aux" + ";");
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE ");
            sb.append("outcome_aux");
            sb.append(';');
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLiteException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sQLiteDatabase.execSQL("COMMIT;");
            throw th;
        }
        sQLiteDatabase.execSQL("COMMIT;");
    }
}
