package com.startapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.startapp.m2 */
/* compiled from: Sta */
public abstract class C9126m2 extends SQLiteOpenHelper {

    /* renamed from: a */
    public volatile SQLiteDatabase f37285a;

    /* renamed from: b */
    public final Object f37286b = new Object();

    public C9126m2(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    /* renamed from: a */
    public SQLiteDatabase mo29679a() {
        SQLiteDatabase sQLiteDatabase = this.f37285a;
        if (sQLiteDatabase == null) {
            synchronized (this.f37286b) {
                sQLiteDatabase = this.f37285a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f37285a = sQLiteDatabase;
                }
            }
        }
        return sQLiteDatabase;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
