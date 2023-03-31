package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.onesignal.C8338d3;
import java.util.ArrayList;
import p269ja.C11515k;

/* renamed from: com.onesignal.k3 */
/* compiled from: OneSignalDbHelper */
class C8475k3 extends SQLiteOpenHelper implements C8469j3 {

    /* renamed from: a */
    private static final Object f35671a = new Object();

    /* renamed from: b */
    protected static final String[] f35672b = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: c */
    private static C8547p1 f35673c = new C8522o1();

    /* renamed from: d */
    private static C8475k3 f35674d;

    /* renamed from: e */
    private static C11515k f35675e = new C11515k();

    C8475k3(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, m46962m());
    }

    /* renamed from: D */
    private static void m46954D(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: F */
    private static void m46955F(SQLiteDatabase sQLiteDatabase) {
        f35675e.mo35537b(sQLiteDatabase);
    }

    /* renamed from: G */
    private static void m46956G(SQLiteDatabase sQLiteDatabase) {
        m46954D(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        m46954D(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    /* renamed from: H */
    private static void m46957H(SQLiteDatabase sQLiteDatabase) {
        m46954D(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        m46954D(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        m46954D(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    /* renamed from: I */
    private static void m46958I(SQLiteDatabase sQLiteDatabase) {
        m46954D(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    /* renamed from: K */
    private static void m46959K(SQLiteDatabase sQLiteDatabase) {
        m46954D(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        m46955F(sQLiteDatabase);
    }

    /* renamed from: L */
    private static void m46960L(SQLiteDatabase sQLiteDatabase) {
        m46954D(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
    }

    /* renamed from: Q */
    private void m46961Q(SQLiteDatabase sQLiteDatabase) {
        f35675e.mo35538c(sQLiteDatabase);
        f35675e.mo35536a(sQLiteDatabase);
    }

    /* renamed from: m */
    private static int m46962m() {
        return 8;
    }

    /* renamed from: n */
    public static C8475k3 m46963n(Context context) {
        if (f35674d == null) {
            synchronized (f35671a) {
                if (f35674d == null) {
                    f35674d = new C8475k3(context.getApplicationContext());
                }
            }
        }
        return f35674d;
    }

    /* renamed from: p */
    private SQLiteDatabase m46964p() {
        SQLiteDatabase writableDatabase;
        synchronized (f35671a) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (SQLiteCantOpenDatabaseException e) {
                e = e;
                throw e;
            } catch (SQLiteDatabaseLockedException e2) {
                e = e2;
                throw e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0012 A[Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d, all -> 0x000b }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0018 A[Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d, all -> 0x000b }, LOOP:0: B:3:0x0005->B:17:0x0018, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001f A[SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.database.sqlite.SQLiteDatabase m46965q() {
        /*
            r5 = this;
            java.lang.Object r0 = f35671a
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L_0x0005:
            android.database.sqlite.SQLiteDatabase r1 = r5.m46964p()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x000f, SQLiteDatabaseLockedException -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return r1
        L_0x000b:
            r1 = move-exception
            goto L_0x0020
        L_0x000d:
            r3 = move-exception
            goto L_0x0010
        L_0x000f:
            r3 = move-exception
        L_0x0010:
            if (r1 != 0) goto L_0x0013
            r1 = r3
        L_0x0013:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L_0x001f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch:{ all -> 0x000b }
            android.os.SystemClock.sleep(r3)     // Catch:{ all -> 0x000b }
            goto L_0x0005
        L_0x001f:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8475k3.m46965q():android.database.sqlite.SQLiteDatabase");
    }

    /* renamed from: w */
    private void m46966w(SQLiteDatabase sQLiteDatabase, int i) {
        if (i < 2) {
            m46956G(sQLiteDatabase);
        }
        if (i < 3) {
            m46957H(sQLiteDatabase);
        }
        if (i < 4) {
            m46958I(sQLiteDatabase);
        }
        if (i < 5) {
            m46959K(sQLiteDatabase);
        }
        if (i == 5) {
            m46955F(sQLiteDatabase);
        }
        if (i < 7) {
            m46960L(sQLiteDatabase);
        }
        if (i < 8) {
            m46961Q(sQLiteDatabase);
        }
    }

    /* renamed from: x */
    static StringBuilder m46967x() {
        long b = C8338d3.m46448M0().mo28281b() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (b - 604800) + " AND " + "dismissed" + " = 0 AND " + "opened" + " = 0 AND " + "is_summary" + " = 0");
        if (C8338d3.m46593z0().mo27854m()) {
            sb.append(" AND expire_time > " + b);
        }
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r2 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0020, B:21:0x003d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo27883a(java.lang.String r7, android.content.ContentValues r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x00cb
            java.lang.String r1 = r8.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x00cb
        L_0x000f:
            java.lang.Object r1 = f35671a
            monitor-enter(r1)
            android.database.sqlite.SQLiteDatabase r2 = r6.m46965q()     // Catch:{ all -> 0x00c8 }
            r2.beginTransaction()     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            int r0 = r2.update(r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            r2.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0075, IllegalStateException -> 0x003c }
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x002f, SQLiteException -> 0x0025 }
            goto L_0x00ae
        L_0x0025:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x002a:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ae
        L_0x002f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0034:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00c8 }
            goto L_0x00ae
        L_0x0039:
            r7 = move-exception
            goto L_0x00b0
        L_0x003c:
            r8 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "Error under update transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0039 }
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r9)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r10)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0039 }
            r3.mo28015c(r7, r8)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x00ae
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x006f, SQLiteException -> 0x0069 }
            goto L_0x00ae
        L_0x0069:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x002a
        L_0x006f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0034
        L_0x0075:
            r8 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r4.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "Error updating on table: "
            r4.append(r5)     // Catch:{ all -> 0x0039 }
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r9)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0039 }
            r4.append(r10)     // Catch:{ all -> 0x0039 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0039 }
            r3.mo28015c(r7, r8)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x00ae
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x00a8, SQLiteException -> 0x00a2 }
            goto L_0x00ae
        L_0x00a2:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x002a
        L_0x00a8:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0034
        L_0x00ae:
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x00b0:
            if (r2 == 0) goto L_0x00c7
            r2.endTransaction()     // Catch:{ IllegalStateException -> 0x00bf, SQLiteException -> 0x00b6 }
            goto L_0x00c7
        L_0x00b6:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r10 = "Error closing transaction! "
            r9.mo28015c(r10, r8)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c7
        L_0x00bf:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00c8 }
            java.lang.String r10 = "Error closing transaction! "
            r9.mo28015c(r10, r8)     // Catch:{ all -> 0x00c8 }
        L_0x00c7:
            throw r7     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            throw r7
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8475k3.mo27883a(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    /* renamed from: b */
    public Cursor mo27884b(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor query;
        synchronized (f35671a) {
            query = m46965q().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return query;
    }

    /* renamed from: f */
    public Cursor mo27885f(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor query;
        synchronized (f35671a) {
            query = m46965q().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return query;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27886g(java.lang.String r7, java.lang.String r8, java.lang.String[] r9) {
        /*
            r6 = this;
            java.lang.Object r0 = f35671a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.m46965q()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.delete(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under delete transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error deleting on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with whereClause: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and whereArgs: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8475k3.mo27886g(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27887h(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9) {
        /*
            r6 = this;
            java.lang.Object r0 = f35671a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.m46965q()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.insert(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under inserting transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error inserting on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8475k3.mo27887h(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f35671a) {
            sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
            for (String execSQL : f35672b) {
                sQLiteDatabase.execSQL(execSQL);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8338d3.m46492a(C8338d3.C8384r0.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (f35671a) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", (String[]) null);
            try {
                ArrayList<String> arrayList = new ArrayList<>(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList.add(rawQuery.getString(0));
                }
                for (String str : arrayList) {
                    if (!str.startsWith("sqlite_")) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
                rawQuery.close();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OneSignal Database onUpgrade from: " + i + " to: " + i2);
        synchronized (f35671a) {
            try {
                m46966w(sQLiteDatabase, i);
            } catch (SQLiteException e) {
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error in upgrade, migration may have already run! Skipping!", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r8 = f35673c;
        r9 = "Error closing transaction! ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (r1 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b0, code lost:
        f35673c.mo28015c("Error closing transaction! ", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r7 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0010, B:17:0x002d] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27904t(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9) throws android.database.SQLException {
        /*
            r6 = this;
            java.lang.Object r0 = f35671a
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r6.m46965q()     // Catch:{ all -> 0x00b8 }
            r1.beginTransaction()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.insertOrThrow(r7, r8, r9)     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x0065, IllegalStateException -> 0x002c }
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x001f, SQLiteException -> 0x0015 }
            goto L_0x009e
        L_0x0015:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x001a:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x001f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
        L_0x0024:
            r8.mo28015c(r9, r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009e
        L_0x0029:
            r7 = move-exception
            goto L_0x00a0
        L_0x002c:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error under inserting or throw transaction under table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x005f, SQLiteException -> 0x0059 }
            goto L_0x009e
        L_0x0059:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x005f:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x0065:
            r2 = move-exception
            com.onesignal.p1 r3 = f35673c     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r4.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "Error inserting or throw on table: "
            r4.append(r5)     // Catch:{ all -> 0x0029 }
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " with nullColumnHack: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r8)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = " and values: "
            r4.append(r7)     // Catch:{ all -> 0x0029 }
            r4.append(r9)     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0029 }
            r3.mo28015c(r7, r2)     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x009e
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x0098, SQLiteException -> 0x0092 }
            goto L_0x009e
        L_0x0092:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x001a
        L_0x0098:
            r7 = move-exception
            com.onesignal.p1 r8 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r9 = "Error closing transaction! "
            goto L_0x0024
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            return
        L_0x00a0:
            if (r1 == 0) goto L_0x00b7
            r1.endTransaction()     // Catch:{ IllegalStateException -> 0x00af, SQLiteException -> 0x00a6 }
            goto L_0x00b7
        L_0x00a6:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
            goto L_0x00b7
        L_0x00af:
            r8 = move-exception
            com.onesignal.p1 r9 = f35673c     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "Error closing transaction! "
            r9.mo28015c(r1, r8)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r7     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8475k3.mo27904t(java.lang.String, java.lang.String, android.content.ContentValues):void");
    }
}
