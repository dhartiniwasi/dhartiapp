package p109o5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o5.c */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5227c {

    /* renamed from: a */
    private static final ClassLoader f27082a = C5227c.class.getClassLoader();

    private C5227c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m32406a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m32407b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32408c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p109o5.C5227c.m32408c(android.os.Parcel, android.os.IInterface):void");
    }
}
