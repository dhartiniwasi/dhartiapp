package p364u5;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u5.c */
public class C12682c {

    /* renamed from: a */
    private static final ClassLoader f46451a = C12682c.class.getClassLoader();

    private C12682c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m60190a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m60191b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static boolean m60192c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
