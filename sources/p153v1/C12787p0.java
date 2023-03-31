package p153v1;

import android.database.sqlite.SQLiteDatabase;
import p153v1.C5779t0;

/* renamed from: v1.p0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12787p0 implements C5779t0.C5780a {

    /* renamed from: a */
    public static final /* synthetic */ C12787p0 f46793a = new C12787p0();

    private /* synthetic */ C12787p0() {
    }

    /* renamed from: a */
    public final void mo20289a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
