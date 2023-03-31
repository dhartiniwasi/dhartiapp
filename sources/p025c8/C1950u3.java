package p025c8;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import p247h8.C10456n;

/* renamed from: c8.u3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1950u3 implements C10456n {

    /* renamed from: a */
    public final /* synthetic */ boolean[] f5626a;

    /* renamed from: b */
    public final /* synthetic */ SQLiteStatement f5627b;

    /* renamed from: c */
    public final /* synthetic */ long f5628c;

    public /* synthetic */ C1950u3(boolean[] zArr, SQLiteStatement sQLiteStatement, long j) {
        this.f5626a = zArr;
        this.f5627b = sQLiteStatement;
        this.f5628c = j;
    }

    public final void accept(Object obj) {
        C6829w3.m39272c0(this.f5626a, this.f5627b, this.f5628c, (Cursor) obj);
    }
}
