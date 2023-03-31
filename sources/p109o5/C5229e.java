package p109o5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p150u4.C5750f;

/* renamed from: o5.e */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public abstract class C5229e extends C5226b implements C5230f {
    public C5229e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo19221p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo19222V2((Status) C5227c.m32406a(parcel, Status.CREATOR), (C5750f) C5227c.m32406a(parcel, C5750f.CREATOR));
        return true;
    }
}
