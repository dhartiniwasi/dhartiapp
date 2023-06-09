package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7567z2 extends C7538w3 {

    /* renamed from: c */
    private final C7547x2 f33217c;

    /* renamed from: d */
    private boolean f33218d;

    C7567z2(C7397j4 j4Var) {
        super(j4Var);
        Context d = this.f32389a.mo24121d();
        this.f32389a.mo24443z();
        this.f33217c = new C7547x2(this, d, "google_app_measurement_local.db");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[SYNTHETIC, Splitter:B:47:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m42039x(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo24189f()
            boolean r0 = r1.f33218d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            r0.mo24443z()
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0028:
            if (r5 >= r4) goto L_0x012d
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.mo24768n()     // Catch:{ SQLiteFullException -> 0x00fb, SQLiteDatabaseLockedException -> 0x00e9, SQLiteException -> 0x00c2, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f33218d = r7     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00b7 }
            r11 = 0
            if (r10 == 0) goto L_0x0054
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r0 == 0) goto L_0x0054
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            goto L_0x0054
        L_0x004d:
            r0 = move-exception
            goto L_0x0121
        L_0x0050:
            r0 = move-exception
            goto L_0x00b9
        L_0x0052:
            r0 = move-exception
            goto L_0x00bd
        L_0x0054:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009f
            com.google.android.gms.measurement.internal.j4 r15 = r1.f32389a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.f3 r15 = r15.mo24135l()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.d3 r15 = r15.mo24256q()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r15.mo24208a(r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009f
            com.google.android.gms.measurement.internal.j4 r4 = r1.f32389a     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r4.mo24211d(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
        L_0x009f:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0052, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x0050, all -> 0x004d }
            if (r10 == 0) goto L_0x00ad
            r10.close()
        L_0x00ad:
            r9.close()
            r2 = 1
            return r2
        L_0x00b2:
            r8 = r10
            goto L_0x00ea
        L_0x00b4:
            r0 = move-exception
            goto L_0x0122
        L_0x00b7:
            r0 = move-exception
            r10 = r8
        L_0x00b9:
            r8 = r9
            goto L_0x00c4
        L_0x00bb:
            r0 = move-exception
            r10 = r8
        L_0x00bd:
            r8 = r9
            goto L_0x00fd
        L_0x00bf:
            r0 = move-exception
            r9 = r8
            goto L_0x0122
        L_0x00c2:
            r0 = move-exception
            r10 = r8
        L_0x00c4:
            if (r8 == 0) goto L_0x00cf
            boolean r2 = r8.inTransaction()     // Catch:{ all -> 0x011f }
            if (r2 == 0) goto L_0x00cf
            r8.endTransaction()     // Catch:{ all -> 0x011f }
        L_0x00cf:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo24209b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f33218d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x00e6
            r10.close()
        L_0x00e6:
            if (r8 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e9:
            r9 = r8
        L_0x00ea:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b4 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fb:
            r0 = move-exception
            r10 = r8
        L_0x00fd:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ all -> 0x011f }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24256q()     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo24209b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f33218d = r2     // Catch:{ all -> 0x011f }
            if (r10 == 0) goto L_0x0114
            r10.close()
        L_0x0114:
            if (r8 == 0) goto L_0x0119
        L_0x0116:
            r8.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r9 = r8
        L_0x0121:
            r8 = r10
        L_0x0122:
            if (r8 == 0) goto L_0x0127
            r8.close()
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()
        L_0x012c:
            throw r0
        L_0x012d:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24260v()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo24208a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7567z2.m42039x(int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final SQLiteDatabase mo24768n() throws SQLiteException {
        if (this.f33218d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f33217c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f33218d = true;
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:59|60|61|62) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:46|47|48|49|197) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24208a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24208a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r1.f32389a.mo24135l().mo24256q().mo24208a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r12.recycle();
        r0 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x012c */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01d6 A[SYNTHETIC, Splitter:B:123:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01fb A[SYNTHETIC, Splitter:B:151:0x01fb] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x01d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0248 A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo24769o(int r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "Error reading entries from local database"
            r22.mo24189f()
            boolean r0 = r1.f33218d
            r4 = 0
            if (r0 == 0) goto L_0x000f
            return r4
        L_0x000f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r22.mo24772r()
            if (r0 == 0) goto L_0x0269
            r6 = 5
            r7 = 0
            r8 = 0
            r9 = 5
        L_0x001e:
            if (r8 >= r6) goto L_0x0259
            r10 = 1
            android.database.sqlite.SQLiteDatabase r15 = r22.mo24768n()     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x021b, SQLiteException -> 0x01f6, all -> 0x01f3 }
            if (r15 != 0) goto L_0x002a
            r1.f33218d = r10     // Catch:{ SQLiteFullException -> 0x01ee, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e5, all -> 0x01e0 }
            return r4
        L_0x002a:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01ee, SQLiteDatabaseLockedException -> 0x01ea, SQLiteException -> 0x01e5, all -> 0x01e0 }
            java.lang.String r0 = "3"
            java.lang.String r12 = "messages"
            java.lang.String[] r13 = new java.lang.String[]{r2}     // Catch:{ all -> 0x01d1 }
            java.lang.String r14 = "type=?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x01d1 }
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid desc"
            java.lang.String r19 = "1"
            r11 = r15
            r23 = r15
            r15 = r0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01cd }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x01c9 }
            r20 = -1
            if (r0 == 0) goto L_0x005b
            long r12 = r11.getLong(r7)     // Catch:{ all -> 0x01c9 }
            r11.close()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            goto L_0x0060
        L_0x005b:
            r11.close()     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            r12 = r20
        L_0x0060:
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            r11[r7] = r12     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            r14 = r0
            r15 = r11
            goto L_0x0073
        L_0x0071:
            r14 = r4
            r15 = r14
        L_0x0073:
            java.lang.String r0 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r13 = new java.lang.String[]{r2, r0, r11}     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            java.lang.String r12 = "messages"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid asc"
            r0 = 100
            java.lang.String r19 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
            r11 = r23
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteFullException -> 0x01c5, SQLiteDatabaseLockedException -> 0x01c2, SQLiteException -> 0x01be, all -> 0x01ba }
        L_0x008f:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            if (r0 == 0) goto L_0x016f
            long r20 = r11.getLong(r7)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            int r0 = r11.getInt(r10)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            r12 = 2
            byte[] r13 = r11.getBlob(r12)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            if (r0 != 0) goto L_0x00d9
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ a -> 0x00c2 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ a -> 0x00c2 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x00c2 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.v> r0 = com.google.android.gms.measurement.internal.C7524v.CREATOR     // Catch:{ a -> 0x00c2 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ a -> 0x00c2 }
            com.google.android.gms.measurement.internal.v r0 = (com.google.android.gms.measurement.internal.C7524v) r0     // Catch:{ a -> 0x00c2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x00c0:
            r0 = move-exception
            goto L_0x00d5
        L_0x00c2:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x00c0 }
            java.lang.String r13 = "Failed to load event from local database"
            r0.mo24208a(r13)     // Catch:{ all -> 0x00c0 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x00d5:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
        L_0x00d9:
            if (r0 != r10) goto L_0x0111
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ a -> 0x00f4 }
            r12.unmarshall(r13, r7, r0)     // Catch:{ a -> 0x00f4 }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x00f4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.d9> r0 = com.google.android.gms.measurement.internal.C7336d9.CREATOR     // Catch:{ a -> 0x00f4 }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ a -> 0x00f4 }
            com.google.android.gms.measurement.internal.d9 r0 = (com.google.android.gms.measurement.internal.C7336d9) r0     // Catch:{ a -> 0x00f4 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x0107
        L_0x00f2:
            r0 = move-exception
            goto L_0x010d
        L_0x00f4:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x00f2 }
            java.lang.String r13 = "Failed to load user property from local database"
            r0.mo24208a(r13)     // Catch:{ all -> 0x00f2 }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            r0 = r4
        L_0x0107:
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x010d:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
        L_0x0111:
            if (r0 != r12) goto L_0x014a
            android.os.Parcel r12 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            int r0 = r13.length     // Catch:{ a -> 0x012c }
            r12.unmarshall(r13, r7, r0)     // Catch:{ a -> 0x012c }
            r12.setDataPosition(r7)     // Catch:{ a -> 0x012c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.d> r0 = com.google.android.gms.measurement.internal.C7326d.CREATOR     // Catch:{ a -> 0x012c }
            java.lang.Object r0 = r0.createFromParcel(r12)     // Catch:{ a -> 0x012c }
            com.google.android.gms.measurement.internal.d r0 = (com.google.android.gms.measurement.internal.C7326d) r0     // Catch:{ a -> 0x012c }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x013f
        L_0x012a:
            r0 = move-exception
            goto L_0x0146
        L_0x012c:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ all -> 0x012a }
            java.lang.String r13 = "Failed to load conditional user property from local database"
            r0.mo24208a(r13)     // Catch:{ all -> 0x012a }
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            r0 = r4
        L_0x013f:
            if (r0 == 0) goto L_0x008f
            r5.add(r0)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x0146:
            r12.recycle()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            throw r0     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
        L_0x014a:
            r12 = 3
            if (r0 != r12) goto L_0x015e
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            java.lang.String r12 = "Skipping app launch break"
            r0.mo24208a(r12)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x015e:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            java.lang.String r12 = "Unknown record type in local database"
            r0.mo24208a(r12)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            goto L_0x008f
        L_0x016f:
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            r0[r7] = r12     // Catch:{ SQLiteFullException -> 0x01b6, SQLiteDatabaseLockedException -> 0x01b3, SQLiteException -> 0x01af, all -> 0x01aa }
            java.lang.String r12 = "messages"
            java.lang.String r13 = "rowid <= ?"
            r14 = r23
            int r0 = r14.delete(r12, r13, r0)     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            int r12 = r5.size()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            if (r0 >= r12) goto L_0x0196
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            java.lang.String r12 = "Fewer entries removed from local database than expected"
            r0.mo24208a(r12)     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
        L_0x0196:
            r14.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            r14.endTransaction()     // Catch:{ SQLiteFullException -> 0x01a7, SQLiteDatabaseLockedException -> 0x01ec, SQLiteException -> 0x01a5, all -> 0x01a3 }
            r11.close()
            r14.close()
            return r5
        L_0x01a3:
            r0 = move-exception
            goto L_0x01ad
        L_0x01a5:
            r0 = move-exception
            goto L_0x01e8
        L_0x01a7:
            r0 = move-exception
            goto L_0x01f1
        L_0x01aa:
            r0 = move-exception
            r14 = r23
        L_0x01ad:
            r4 = r11
            goto L_0x01e2
        L_0x01af:
            r0 = move-exception
            r14 = r23
            goto L_0x01e8
        L_0x01b3:
            r14 = r23
            goto L_0x01ec
        L_0x01b6:
            r0 = move-exception
            r14 = r23
            goto L_0x01f1
        L_0x01ba:
            r0 = move-exception
            r14 = r23
            goto L_0x01e2
        L_0x01be:
            r0 = move-exception
            r14 = r23
            goto L_0x01e7
        L_0x01c2:
            r14 = r23
            goto L_0x01eb
        L_0x01c5:
            r0 = move-exception
            r14 = r23
            goto L_0x01f0
        L_0x01c9:
            r0 = move-exception
            r14 = r23
            goto L_0x01d4
        L_0x01cd:
            r0 = move-exception
            r14 = r23
            goto L_0x01d3
        L_0x01d1:
            r0 = move-exception
            r14 = r15
        L_0x01d3:
            r11 = r4
        L_0x01d4:
            if (r11 == 0) goto L_0x01d9
            r11.close()     // Catch:{ SQLiteFullException -> 0x01de, SQLiteDatabaseLockedException -> 0x01eb, SQLiteException -> 0x01dc, all -> 0x01da }
        L_0x01d9:
            throw r0     // Catch:{ SQLiteFullException -> 0x01de, SQLiteDatabaseLockedException -> 0x01eb, SQLiteException -> 0x01dc, all -> 0x01da }
        L_0x01da:
            r0 = move-exception
            goto L_0x01e2
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e7
        L_0x01de:
            r0 = move-exception
            goto L_0x01f0
        L_0x01e0:
            r0 = move-exception
            r14 = r15
        L_0x01e2:
            r15 = r14
            goto L_0x024e
        L_0x01e5:
            r0 = move-exception
            r14 = r15
        L_0x01e7:
            r11 = r4
        L_0x01e8:
            r15 = r14
            goto L_0x01f9
        L_0x01ea:
            r14 = r15
        L_0x01eb:
            r11 = r4
        L_0x01ec:
            r15 = r14
            goto L_0x021d
        L_0x01ee:
            r0 = move-exception
            r14 = r15
        L_0x01f0:
            r11 = r4
        L_0x01f1:
            r15 = r14
            goto L_0x0231
        L_0x01f3:
            r0 = move-exception
            r15 = r4
            goto L_0x024e
        L_0x01f6:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x01f9:
            if (r15 == 0) goto L_0x0204
            boolean r12 = r15.inTransaction()     // Catch:{ all -> 0x024c }
            if (r12 == 0) goto L_0x0204
            r15.endTransaction()     // Catch:{ all -> 0x024c }
        L_0x0204:
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32389a     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.f3 r12 = r12.mo24135l()     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo24256q()     // Catch:{ all -> 0x024c }
            r12.mo24209b(r3, r0)     // Catch:{ all -> 0x024c }
            r1.f33218d = r10     // Catch:{ all -> 0x024c }
            if (r11 == 0) goto L_0x0218
            r11.close()
        L_0x0218:
            if (r15 == 0) goto L_0x0248
            goto L_0x022a
        L_0x021b:
            r11 = r4
            r15 = r11
        L_0x021d:
            long r12 = (long) r9
            android.os.SystemClock.sleep(r12)     // Catch:{ all -> 0x024c }
            int r9 = r9 + 20
            if (r11 == 0) goto L_0x0228
            r11.close()
        L_0x0228:
            if (r15 == 0) goto L_0x0248
        L_0x022a:
            r15.close()
            goto L_0x0248
        L_0x022e:
            r0 = move-exception
            r11 = r4
            r15 = r11
        L_0x0231:
            com.google.android.gms.measurement.internal.j4 r12 = r1.f32389a     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.f3 r12 = r12.mo24135l()     // Catch:{ all -> 0x024c }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo24256q()     // Catch:{ all -> 0x024c }
            r12.mo24209b(r3, r0)     // Catch:{ all -> 0x024c }
            r1.f33218d = r10     // Catch:{ all -> 0x024c }
            if (r11 == 0) goto L_0x0245
            r11.close()
        L_0x0245:
            if (r15 == 0) goto L_0x0248
            goto L_0x022a
        L_0x0248:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x024c:
            r0 = move-exception
            r4 = r11
        L_0x024e:
            if (r4 == 0) goto L_0x0253
            r4.close()
        L_0x0253:
            if (r15 == 0) goto L_0x0258
            r15.close()
        L_0x0258:
            throw r0
        L_0x0259:
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo24208a(r2)
            return r4
        L_0x0269:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7567z2.mo24769o(int):java.util.List");
    }

    /* renamed from: p */
    public final void mo24770p() {
        int delete;
        mo24189f();
        try {
            SQLiteDatabase n = mo24768n();
            if (n != null && (delete = n.delete("messages", (String) null, (String[]) null)) > 0) {
                this.f32389a.mo24135l().mo24260v().mo24209b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.f32389a.mo24135l().mo24256q().mo24209b("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: q */
    public final boolean mo24771q() {
        return m42039x(3, new byte[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo24772r() {
        Context d = this.f32389a.mo24121d();
        this.f32389a.mo24443z();
        return d.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean mo24773t() {
        mo24189f();
        if (!this.f33218d && mo24772r()) {
            int i = 0;
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase n = mo24768n();
                    if (n == null) {
                        this.f33218d = true;
                        return false;
                    }
                    n.beginTransaction();
                    n.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    n.setTransactionSuccessful();
                    n.endTransaction();
                    n.close();
                    return true;
                } catch (SQLiteFullException e) {
                    this.f32389a.mo24135l().mo24256q().mo24209b("Error deleting app launch break from local database", e);
                    this.f33218d = true;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i2);
                    i2 += 20;
                    if (sQLiteDatabase == null) {
                        i++;
                    }
                    sQLiteDatabase.close();
                    i++;
                } catch (SQLiteException e2) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f32389a.mo24135l().mo24256q().mo24209b("Error deleting app launch break from local database", e2);
                    this.f33218d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i++;
                    } else {
                        i++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f32389a.mo24135l().mo24261w().mo24208a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean mo24774u(C7326d dVar) {
        byte[] c0 = this.f32389a.mo24423N().mo24387c0(dVar);
        if (c0.length <= 131072) {
            return m42039x(2, c0);
        }
        this.f32389a.mo24135l().mo24258t().mo24208a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: v */
    public final boolean mo24775v(C7524v vVar) {
        Parcel obtain = Parcel.obtain();
        C7534w.m42012a(vVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m42039x(0, marshall);
        }
        this.f32389a.mo24135l().mo24258t().mo24208a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: w */
    public final boolean mo24776w(C7336d9 d9Var) {
        Parcel obtain = Parcel.obtain();
        C7347e9.m41466a(d9Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m42039x(1, marshall);
        }
        this.f32389a.mo24135l().mo24258t().mo24208a("User property too long for local database. Sending directly to service");
        return false;
    }
}
