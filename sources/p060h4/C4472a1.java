package p060h4;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2921uh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.a30;
import com.google.android.gms.internal.ads.a70;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.fl0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.pb0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.v20;
import com.google.android.gms.internal.ads.z60;
import p088l5.C4954a;

/* renamed from: h4.a1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4472a1 extends C2921uh implements C4478b1 {
    public C4472a1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: H6 */
    public final boolean mo8320H6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                qb0 I6 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4567q0 a3 = mo7833a3(C4954a.C4955a.m31383B0(parcel.readStrongBinder()), (C4571q4) C2958vh.m22232a(parcel, C4571q4.CREATOR), readString, I6, readInt);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, a3);
                return true;
            case 2:
                String readString2 = parcel.readString();
                qb0 I62 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4567q0 D3 = mo7825D3(C4954a.C4955a.m31383B0(parcel.readStrongBinder()), (C4571q4) C2958vh.m22232a(parcel, C4571q4.CREATOR), readString2, I62, readInt2);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, D3);
                return true;
            case 3:
                C4954a B0 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                qb0 I63 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4543m0 X1 = mo7832X1(B0, readString3, I63, readInt3);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, X1);
                return true;
            case 4:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 5:
                C4954a B02 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a B03 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                v20 j1 = mo7834j1(B02, B03);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, j1);
                return true;
            case 6:
                C4954a B04 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qb0 I64 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                C2958vh.m22234c(parcel);
                rh0 R5 = mo7830R5(B04, I64, readInt4);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, R5);
                return true;
            case 7:
                C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, (IInterface) null);
                return true;
            case 8:
                C4954a B05 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                bf0 s0 = mo7836s0(B05);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, s0);
                return true;
            case 9:
                C4954a B06 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4538l1 L0 = mo7828L0(B06, readInt5);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, L0);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4567q0 V5 = mo7831V5(C4954a.C4955a.m31383B0(parcel.readStrongBinder()), (C4571q4) C2958vh.m22232a(parcel, C4571q4.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, V5);
                return true;
            case 11:
                C4954a B07 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a B08 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C4954a B09 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                a30 r3 = mo7835r3(B07, B08, B09);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, r3);
                return true;
            case 12:
                C4954a B010 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                qb0 I65 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                C2958vh.m22234c(parcel);
                ii0 I4 = mo7827I4(B010, readString5, I65, readInt7);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, I4);
                return true;
            case 13:
                String readString6 = parcel.readString();
                qb0 I66 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                C2958vh.m22234c(parcel);
                C4567q0 F1 = mo7826F1(C4954a.C4955a.m31383B0(parcel.readStrongBinder()), (C4571q4) C2958vh.m22232a(parcel, C4571q4.CREATOR), readString6, I66, readInt8);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, F1);
                return true;
            case 14:
                C4954a B011 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qb0 I67 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                C2958vh.m22234c(parcel);
                fl0 y1 = mo7838y1(B011, I67, readInt9);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, y1);
                return true;
            case 15:
                C4954a B012 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qb0 I68 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                C2958vh.m22234c(parcel);
                te0 M3 = mo7829M3(B012, I68, readInt10);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, M3);
                return true;
            case 16:
                C4954a B013 = C4954a.C4955a.m31383B0(parcel.readStrongBinder());
                qb0 I69 = pb0.m18446I6(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                a70 I610 = z60.m24391I6(parcel.readStrongBinder());
                C2958vh.m22234c(parcel);
                c70 w5 = mo7837w5(B013, I69, readInt11, I610);
                parcel2.writeNoException();
                C2958vh.m22238g(parcel2, w5);
                return true;
            default:
                return false;
        }
    }
}
