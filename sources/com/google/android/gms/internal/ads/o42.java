package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;
import p073j4.C4811t0;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o42 extends SQLiteOpenHelper {

    /* renamed from: a */
    private final Context f14890a;

    /* renamed from: b */
    private final mf3 f14891b;

    public o42(Context context, mf3 mf3) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14595j7)).intValue());
        this.f14890a = context;
        this.f14891b = mf3;
    }

    /* renamed from: m */
    static /* synthetic */ void m17493m(SQLiteDatabase sQLiteDatabase, String str, um0 um0) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m17495t(sQLiteDatabase, um0);
    }

    /* renamed from: q */
    static final void m17494q(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static void m17495t(SQLiteDatabase sQLiteDatabase, um0 um0) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = " + 1, (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                um0.mo9501f(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo12820a(q42 q42, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(q42.f16176a));
        contentValues.put("gws_query_id", q42.f16177b);
        contentValues.put("url", q42.f16178c);
        contentValues.put("event_state", Integer.valueOf(q42.f16179d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        C4409t.m29326r();
        C4811t0 T = C4751b2.m30602T(this.f14890a);
        if (T != null) {
            try {
                T.zze(C4956b.m31385o3(this.f14890a));
            } catch (RemoteException e) {
                C4794n1.m30694l("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo12821f(String str) {
        mo12823h(new l42(this, str));
    }

    /* renamed from: g */
    public final void mo12822g(q42 q42) {
        mo12823h(new j42(this, q42));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12823h(mw2 mw2) {
        cf3.m10920r(this.f14891b.mo12324a(new h42(this)), new n42(this, mw2), this.f14891b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12824n(SQLiteDatabase sQLiteDatabase, um0 um0, String str) {
        this.f14891b.execute(new i42(sQLiteDatabase, str, um0));
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* renamed from: p */
    public final void mo12828p(um0 um0, String str) {
        mo12823h(new m42(this, um0, str));
    }
}
