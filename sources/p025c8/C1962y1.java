package p025c8;

import android.database.Cursor;
import java.util.Map;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9905w;
import p246h7.C10428q;
import p247h8.C10456n;

/* renamed from: c8.y1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1962y1 implements C10456n {

    /* renamed from: a */
    public final /* synthetic */ Map f5648a;

    public /* synthetic */ C1962y1(Map map) {
        this.f5648a = map;
    }

    public final void accept(Object obj) {
        this.f5648a.put(Integer.valueOf(((Cursor) obj).getInt(0)), C9893q.C9895b.m50734b(((Cursor) obj).getLong(1), new C9905w(new C10428q(((Cursor) obj).getLong(2), ((Cursor) obj).getInt(3))), C9888l.m50697n(C6789f.m38861b(((Cursor) obj).getString(4))), ((Cursor) obj).getInt(5)));
    }
}
