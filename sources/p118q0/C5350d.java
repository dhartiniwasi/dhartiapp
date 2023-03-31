package p118q0;

import android.database.sqlite.SQLiteProgram;
import p111p0.C5255d;

/* renamed from: q0.d */
/* compiled from: FrameworkSQLiteProgram */
class C5350d implements C5255d {

    /* renamed from: a */
    private final SQLiteProgram f27414a;

    C5350d(SQLiteProgram sQLiteProgram) {
        this.f27414a = sQLiteProgram;
    }

    /* renamed from: E */
    public void mo18708E(int i, String str) {
        this.f27414a.bindString(i, str);
    }

    /* renamed from: T */
    public void mo18709T(int i, double d) {
        this.f27414a.bindDouble(i, d);
    }

    /* renamed from: T0 */
    public void mo18710T0(int i) {
        this.f27414a.bindNull(i);
    }

    public void close() {
        this.f27414a.close();
    }

    /* renamed from: m0 */
    public void mo18716m0(int i, long j) {
        this.f27414a.bindLong(i, j);
    }

    /* renamed from: s0 */
    public void mo18717s0(int i, byte[] bArr) {
        this.f27414a.bindBlob(i, bArr);
    }
}
