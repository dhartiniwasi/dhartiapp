package p146u0;

import android.os.IBinder;

/* renamed from: u0.k0 */
/* compiled from: WindowIdApi14 */
class C5663k0 implements C5673m0 {

    /* renamed from: a */
    private final IBinder f28361a;

    C5663k0(IBinder iBinder) {
        this.f28361a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5663k0) && ((C5663k0) obj).f28361a.equals(this.f28361a);
    }

    public int hashCode() {
        return this.f28361a.hashCode();
    }
}
