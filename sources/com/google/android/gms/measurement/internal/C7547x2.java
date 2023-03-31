package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.measurement.internal.x2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7547x2 extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ C7567z2 f33174a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7547x2(C7567z2 z2Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f33174a = z2Var;
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f33174a.f32389a.mo24135l().mo24256q().mo24208a("Opening the local database failed, dropping and recreating it");
            this.f33174a.f32389a.mo24443z();
            if (!this.f33174a.f32389a.mo24121d().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f33174a.f32389a.mo24135l().mo24256q().mo24209b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f33174a.f32389a.mo24135l().mo24256q().mo24209b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C7425m.m41766b(this.f33174a.f32389a.mo24135l(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C7425m.m41765a(this.f33174a.f32389a.mo24135l(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
