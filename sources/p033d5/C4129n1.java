package p033d5;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p040e5.C4241b;
import p040e5.C4243c;
import p180z4.C6366d;

/* renamed from: d5.n1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4129n1 implements Parcelable.Creator {
    /* renamed from: a */
    static void m28187a(C4102f fVar, Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, fVar.f23299a);
        C4243c.m28614k(parcel, 2, fVar.f23300b);
        C4243c.m28614k(parcel, 3, fVar.f23301c);
        C4243c.m28620q(parcel, 4, fVar.f23302d, false);
        C4243c.m28613j(parcel, 5, fVar.f23303e, false);
        C4243c.m28623t(parcel, 6, fVar.f23304f, i, false);
        C4243c.m28608e(parcel, 7, fVar.f23305g, false);
        C4243c.m28619p(parcel, 8, fVar.f23306h, i, false);
        C4243c.m28623t(parcel, 10, fVar.f23307i, i, false);
        C4243c.m28623t(parcel, 11, fVar.f23308r, i, false);
        C4243c.m28606c(parcel, 12, fVar.f23309s);
        C4243c.m28614k(parcel, 13, fVar.f23310t);
        C4243c.m28606c(parcel, 14, fVar.f23311u);
        C4243c.m28620q(parcel, 15, fVar.zza(), false);
        C4243c.m28605b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C4241b.m28602y(parcel);
        Scope[] scopeArr = C4102f.f23297w;
        Bundle bundle = new Bundle();
        C6366d[] dVarArr = C4102f.f23298x;
        C6366d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            switch (C4241b.m28589l(r)) {
                case 1:
                    i = C4241b.m28597t(parcel2, r);
                    break;
                case 2:
                    i2 = C4241b.m28597t(parcel2, r);
                    break;
                case 3:
                    i3 = C4241b.m28597t(parcel2, r);
                    break;
                case 4:
                    str = C4241b.m28583f(parcel2, r);
                    break;
                case 5:
                    iBinder = C4241b.m28596s(parcel2, r);
                    break;
                case 6:
                    scopeArr = (Scope[]) C4241b.m28586i(parcel2, r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C4241b.m28578a(parcel2, r);
                    break;
                case 8:
                    account = (Account) C4241b.m28582e(parcel2, r, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C6366d[]) C4241b.m28586i(parcel2, r, C6366d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C6366d[]) C4241b.m28586i(parcel2, r, C6366d.CREATOR);
                    break;
                case 12:
                    z = C4241b.m28590m(parcel2, r);
                    break;
                case 13:
                    i4 = C4241b.m28597t(parcel2, r);
                    break;
                case 14:
                    z2 = C4241b.m28590m(parcel2, r);
                    break;
                case 15:
                    str2 = C4241b.m28583f(parcel2, r);
                    break;
                default:
                    C4241b.m28601x(parcel2, r);
                    break;
            }
        }
        C4241b.m28588k(parcel2, y);
        return new C4102f(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C4102f[i];
    }
}
