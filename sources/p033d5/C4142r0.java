package p033d5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: d5.r0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4142r0 extends C4240a {
    public static final Parcelable.Creator<C4142r0> CREATOR = new C4145s0();

    /* renamed from: a */
    final int f23385a;

    /* renamed from: b */
    private final Account f23386b;

    /* renamed from: c */
    private final int f23387c;

    /* renamed from: d */
    private final GoogleSignInAccount f23388d;

    C4142r0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f23385a = i;
        this.f23386b = account;
        this.f23387c = i2;
        this.f23388d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f23385a);
        C4243c.m28619p(parcel, 2, this.f23386b, i, false);
        C4243c.m28614k(parcel, 3, this.f23387c);
        C4243c.m28619p(parcel, 4, this.f23388d, i, false);
        C4243c.m28605b(parcel, a);
    }

    public C4142r0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
