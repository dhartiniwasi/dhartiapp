package p033d5;

import android.os.IBinder;
import android.os.IInterface;
import p137s5.C5486b;

/* renamed from: d5.z0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4167z0 extends C5486b implements C4083a1 {
    /* renamed from: B0 */
    public static C4083a1 m28278B0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C4083a1 ? (C4083a1) queryLocalInterface : new C4164y0(iBinder);
    }
}
