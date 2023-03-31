package p111p0;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: p0.b */
/* compiled from: SupportSQLiteDatabase */
public interface C5249b extends Closeable {
    /* renamed from: A */
    List<Pair<String, String>> mo19229A();

    /* renamed from: A1 */
    Cursor mo19230A1(C5256e eVar, CancellationSignal cancellationSignal);

    /* renamed from: C */
    void mo19231C(String str) throws SQLException;

    /* renamed from: D0 */
    void mo19232D0();

    /* renamed from: N */
    C5257f mo19233N(String str);

    /* renamed from: Y0 */
    String mo19234Y0();

    /* renamed from: a1 */
    boolean mo19235a1();

    boolean isOpen();

    /* renamed from: n0 */
    void mo19237n0();

    /* renamed from: o0 */
    void mo19238o0(String str, Object[] objArr) throws SQLException;

    /* renamed from: o1 */
    Cursor mo19239o1(C5256e eVar);

    /* renamed from: u */
    void mo19240u();

    /* renamed from: z0 */
    Cursor mo19241z0(String str);
}
