package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7130q0 {

    /* renamed from: a */
    private static final ClassLoader f31960a = C7130q0.class.getClassLoader();

    private C7130q0() {
    }

    /* renamed from: a */
    public static Parcelable m40612a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m40613b(Parcel parcel) {
        return parcel.readHashMap(f31960a);
    }

    /* renamed from: c */
    public static void m40614c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m40615d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m40616e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m40617f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: g */
    public static boolean m40618g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
