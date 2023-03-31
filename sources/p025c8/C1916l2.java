package p025c8;

import android.database.Cursor;
import java.util.List;
import p247h8.C10456n;

/* renamed from: c8.l2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1916l2 implements C10456n {

    /* renamed from: a */
    public final /* synthetic */ List f5569a;

    public /* synthetic */ C1916l2(List list) {
        this.f5569a = list;
    }

    public final void accept(Object obj) {
        this.f5569a.add(((Cursor) obj).getString(0));
    }
}
