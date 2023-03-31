package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class i32 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ mw2 f10601a;

    i32(j32 j32, mw2 mw2) {
        this.f10601a = mw2;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        pm0.m18664d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        try {
            this.f10601a.mo9017b((SQLiteDatabase) obj);
        } catch (Exception e) {
            pm0.m18664d("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
