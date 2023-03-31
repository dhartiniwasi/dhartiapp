package p116p5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: p5.g */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class C5325g extends C5319a implements C5326h {
    public C5325g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo19293p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo19298A0((Status) C5322d.m32651a(parcel, Status.CREATOR));
        return true;
    }
}
