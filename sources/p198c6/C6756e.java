package p198c6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p123q5.C5404b;
import p123q5.C5405c;
import p180z4.C6362b;

/* renamed from: c6.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C6756e extends C5404b implements C6757f {
    public C6756e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i5 */
    public final boolean mo19532i5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                C6362b bVar = (C6362b) C5405c.m33154a(parcel, C6362b.CREATOR);
                C6753b bVar2 = (C6753b) C5405c.m33154a(parcel, C6753b.CREATOR);
                break;
            case 4:
                Status status = (Status) C5405c.m33154a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C5405c.m33154a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C5405c.m33154a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C5405c.m33154a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo6957q4((C6763l) C5405c.m33154a(parcel, C6763l.CREATOR));
                break;
            case 9:
                C6759h hVar = (C6759h) C5405c.m33154a(parcel, C6759h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
