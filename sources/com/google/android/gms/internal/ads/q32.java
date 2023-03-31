package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class q32 implements mw2 {

    /* renamed from: a */
    public final /* synthetic */ r32 f16166a;

    /* renamed from: b */
    public final /* synthetic */ long f16167b;

    public /* synthetic */ q32(r32 r32, long j) {
        this.f16166a = r32;
        this.f16167b = j;
    }

    /* renamed from: b */
    public final Object mo9017b(Object obj) {
        r32 r32 = this.f16166a;
        long j = this.f16167b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (r32.mo14866a()) {
            return null;
        }
        C2380fx O = C2417gx.m13567O();
        O.mo10339z(j);
        byte[] b = ((C2417gx) O.mo13423m()).mo9400b();
        y32.m23749g(sQLiteDatabase, false, false);
        y32.m23746d(sQLiteDatabase, j, b);
        return null;
    }
}
