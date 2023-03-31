package p402y5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C7114p0;
import com.google.android.gms.internal.measurement.C7130q0;
import com.google.android.gms.measurement.internal.C7326d;
import com.google.android.gms.measurement.internal.C7336d9;
import com.google.android.gms.measurement.internal.C7446n9;
import com.google.android.gms.measurement.internal.C7524v;
import java.util.List;

/* renamed from: y5.e */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C13026e extends C7114p0 implements C13028f {
    public C13026e() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo23343p(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C7130q0.m40614c(parcel);
                mo24171q3((C7524v) C7130q0.m40612a(parcel, C7524v.CREATOR), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C7130q0.m40614c(parcel);
                mo24166e4((C7336d9) C7130q0.m40612a(parcel, C7336d9.CREATOR), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                C7130q0.m40614c(parcel);
                mo24154B3((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C7130q0.m40614c(parcel);
                mo24165Z3((C7524v) C7130q0.m40612a(parcel, C7524v.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C7130q0.m40614c(parcel);
                mo24167g1((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean g = C7130q0.m40618g(parcel);
                C7130q0.m40614c(parcel);
                List I1 = mo24158I1((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR), g);
                parcel2.writeNoException();
                parcel2.writeTypedList(I1);
                return true;
            case 9:
                String readString3 = parcel.readString();
                C7130q0.m40614c(parcel);
                byte[] L1 = mo24159L1((C7524v) C7130q0.m40612a(parcel, C7524v.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(L1);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                C7130q0.m40614c(parcel);
                mo24162T3(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C7130q0.m40614c(parcel);
                String W1 = mo24164W1((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(W1);
                return true;
            case 12:
                C7130q0.m40614c(parcel);
                mo24156C5((C7326d) C7130q0.m40612a(parcel, C7326d.CREATOR), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C7130q0.m40614c(parcel);
                mo24153B1((C7326d) C7130q0.m40612a(parcel, C7326d.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                C7130q0.m40614c(parcel);
                List M4 = mo24160M4(parcel.readString(), parcel.readString(), C7130q0.m40618g(parcel), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(M4);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean g2 = C7130q0.m40618g(parcel);
                C7130q0.m40614c(parcel);
                List x1 = mo24174x1(readString7, readString8, readString9, g2);
                parcel2.writeNoException();
                parcel2.writeTypedList(x1);
                return true;
            case 16:
                C7130q0.m40614c(parcel);
                List C3 = mo24155C3(parcel.readString(), parcel.readString(), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(C3);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C7130q0.m40614c(parcel);
                List m2 = mo24170m2(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(m2);
                return true;
            case 18:
                C7130q0.m40614c(parcel);
                mo24169j5((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                C7130q0.m40614c(parcel);
                mo24173s1((Bundle) C7130q0.m40612a(parcel, Bundle.CREATOR), (C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                C7130q0.m40614c(parcel);
                mo24157F4((C7446n9) C7130q0.m40612a(parcel, C7446n9.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
