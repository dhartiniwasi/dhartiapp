package p025c8;

import android.database.Cursor;
import java.util.Set;
import p247h8.C10456n;

/* renamed from: c8.r2 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1939r2 implements C10456n {

    /* renamed from: a */
    public final /* synthetic */ Set f5608a;

    public /* synthetic */ C1939r2(Set set) {
        this.f5608a = set;
    }

    public final void accept(Object obj) {
        this.f5608a.add(((Cursor) obj).getString(0));
    }
}
