package p033d5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p137s5.C5485a;
import p137s5.C5487c;

/* renamed from: d5.w1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4158w1 extends C5485a implements C4114j {
    C4158w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    /* renamed from: d */
    public final Account mo17409d() throws RemoteException {
        Parcel p = mo19774p(2, mo19772B0());
        Account account = (Account) C5487c.m33438a(p, Account.CREATOR);
        p.recycle();
        return account;
    }
}
