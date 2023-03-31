package p033d5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p137s5.C5486b;
import p137s5.C5487c;

/* renamed from: d5.w0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C4157w0 extends C5486b implements C4121l {
    public C4157w0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo17486p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C5487c.m33439b(parcel);
            mo17395F3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C5487c.m33438a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            C5487c.m33439b(parcel);
            mo17394B2(parcel.readInt(), (Bundle) C5487c.m33438a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            C5487c.m33439b(parcel);
            mo17396z2(parcel.readInt(), parcel.readStrongBinder(), (C4120k1) C5487c.m33438a(parcel, C4120k1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
