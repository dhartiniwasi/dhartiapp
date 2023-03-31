package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class t32 implements mw2 {

    /* renamed from: a */
    public final /* synthetic */ u32 f17821a;

    /* renamed from: b */
    public final /* synthetic */ boolean f17822b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f17823c;

    /* renamed from: d */
    public final /* synthetic */ C2231bx f17824d;

    /* renamed from: e */
    public final /* synthetic */ C2603lx f17825e;

    public /* synthetic */ t32(u32 u32, boolean z, ArrayList arrayList, C2231bx bxVar, C2603lx lxVar) {
        this.f17821a = u32;
        this.f17822b = z;
        this.f17823c = arrayList;
        this.f17824d = bxVar;
        this.f17825e = lxVar;
    }

    /* renamed from: b */
    public final Object mo9017b(Object obj) {
        u32 u32 = this.f17821a;
        boolean z = this.f17822b;
        ArrayList arrayList = this.f17823c;
        C2231bx bxVar = this.f17824d;
        C2603lx lxVar = this.f17825e;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (u32.f18348b.mo14866a()) {
            return null;
        }
        byte[] f = v32.m21960f(u32.f18348b, z, arrayList, bxVar, lxVar);
        y32.m23749g(sQLiteDatabase, z, true);
        y32.m23746d(sQLiteDatabase, u32.f18348b.f18907f.mo12515d(), f);
        return null;
    }
}
