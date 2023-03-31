package p260ib;

import kotlin.jvm.internal.C11669k;
import p186ac.C6544d;
import p186ac.C6566p;

/* renamed from: ib.i */
/* compiled from: RequestCameraPermissionHandler.kt */
public final class C10589i implements C6566p {

    /* renamed from: a */
    private final C6544d.C6546b f41645a;

    public C10589i(C6544d.C6546b bVar) {
        this.f41645a = bVar;
    }

    /* renamed from: a */
    private final boolean m53189a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669k.m56787e(strArr, "permissions");
        C11669k.m56787e(iArr, "grantResults");
        if (i != 200) {
            return false;
        }
        if (m53189a(iArr)) {
            C6544d.C6546b bVar = this.f41645a;
            if (bVar == null) {
                return true;
            }
            bVar.success("PERMISSION_GRANTED");
            return true;
        }
        C6544d.C6546b bVar2 = this.f41645a;
        if (bVar2 == null) {
            return true;
        }
        bVar2.success("PERMISSION_NOT_GRANTED");
        return true;
    }
}
