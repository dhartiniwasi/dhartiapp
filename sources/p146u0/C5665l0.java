package p146u0;

import android.view.View;
import android.view.WindowId;

/* renamed from: u0.l0 */
/* compiled from: WindowIdApi18 */
class C5665l0 implements C5673m0 {

    /* renamed from: a */
    private final WindowId f28364a;

    C5665l0(View view) {
        this.f28364a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5665l0) && ((C5665l0) obj).f28364a.equals(this.f28364a);
    }

    public int hashCode() {
        return this.f28364a.hashCode();
    }
}
