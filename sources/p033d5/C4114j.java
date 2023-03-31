package p033d5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p137s5.C5486b;

/* renamed from: d5.j */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C4114j extends IInterface {

    /* renamed from: d5.j$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C4115a extends C5486b implements C4114j {
        /* renamed from: B0 */
        public static C4114j m28166B0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C4114j ? (C4114j) queryLocalInterface : new C4158w1(iBinder);
        }
    }

    /* renamed from: d */
    Account mo17409d() throws RemoteException;
}
