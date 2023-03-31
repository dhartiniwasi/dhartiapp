package p116p5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p5.d */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public class C5322d {

    /* renamed from: a */
    private static final ClassLoader f27349a = C5322d.class.getClassLoader();

    private C5322d() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m32651a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m32652b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
