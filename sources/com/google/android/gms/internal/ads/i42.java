package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class i42 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SQLiteDatabase f10610a;

    /* renamed from: b */
    public final /* synthetic */ String f10611b;

    /* renamed from: c */
    public final /* synthetic */ um0 f10612c;

    public /* synthetic */ i42(SQLiteDatabase sQLiteDatabase, String str, um0 um0) {
        this.f10610a = sQLiteDatabase;
        this.f10611b = str;
        this.f10612c = um0;
    }

    public final void run() {
        o42.m17493m(this.f10610a, this.f10611b, this.f10612c);
    }
}
