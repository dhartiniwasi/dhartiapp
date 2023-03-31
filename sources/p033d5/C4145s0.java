package p033d5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p040e5.C4241b;

/* renamed from: d5.s0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4145s0 implements Parcelable.Creator<C4142r0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                i = C4241b.m28597t(parcel, r);
            } else if (l == 2) {
                account = (Account) C4241b.m28582e(parcel, r, Account.CREATOR);
            } else if (l == 3) {
                i2 = C4241b.m28597t(parcel, r);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C4241b.m28582e(parcel, r, GoogleSignInAccount.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new C4142r0(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4142r0[i];
    }
}
