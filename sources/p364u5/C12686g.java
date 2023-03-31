package p364u5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p411z5.C13445b;
import p411z5.C13451f;
import p411z5.C13454i;
import p411z5.C13456k;
import p411z5.C13458m;

/* renamed from: u5.g */
public abstract class C12686g extends C12681b implements C12685f {
    public C12686g() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo37555p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo37564z6((Status) C12682c.m60190a(parcel, Status.CREATOR), (C13451f) C12682c.m60190a(parcel, C13451f.CREATOR));
        } else if (i == 2) {
            mo37560f(parcel.readString());
        } else if (i == 3) {
            mo37558a5((Status) C12682c.m60190a(parcel, Status.CREATOR), (C13445b) C12682c.m60190a(parcel, C13445b.CREATOR));
        } else if (i == 4) {
            mo37559e6((Status) C12682c.m60190a(parcel, Status.CREATOR), C12682c.m60192c(parcel));
        } else if (i == 6) {
            mo37561k4((Status) C12682c.m60190a(parcel, Status.CREATOR), (C13456k) C12682c.m60190a(parcel, C13456k.CREATOR));
        } else if (i == 8) {
            mo37557M2((Status) C12682c.m60190a(parcel, Status.CREATOR), (C13454i) C12682c.m60190a(parcel, C13454i.CREATOR));
        } else if (i == 15) {
            mo37563u5((Status) C12682c.m60190a(parcel, Status.CREATOR), (C13458m) C12682c.m60190a(parcel, C13458m.CREATOR));
        } else if (i == 10) {
            mo37562n5((Status) C12682c.m60190a(parcel, Status.CREATOR), C12682c.m60192c(parcel));
        } else if (i != 11) {
            return false;
        } else {
            mo37556A0((Status) C12682c.m60190a(parcel, Status.CREATOR));
        }
        return true;
    }
}
