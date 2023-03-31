package p385w6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p124r.C5426g;
import p169y.C6079a;

/* renamed from: w6.a */
/* compiled from: ExtendableSavedState */
public class C12908a extends C6079a {
    public static final Parcelable.Creator<C12908a> CREATOR = new C12909a();

    /* renamed from: c */
    public final C5426g<String, Bundle> f47116c;

    /* renamed from: w6.a$a */
    /* compiled from: ExtendableSavedState */
    static class C12909a implements Parcelable.ClassLoaderCreator<C12908a> {
        C12909a() {
        }

        /* renamed from: a */
        public C12908a createFromParcel(Parcel parcel) {
            return new C12908a(parcel, (ClassLoader) null, (C12909a) null);
        }

        /* renamed from: b */
        public C12908a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C12908a(parcel, classLoader, (C12909a) null);
        }

        /* renamed from: c */
        public C12908a[] newArray(int i) {
            return new C12908a[i];
        }
    }

    /* synthetic */ C12908a(Parcel parcel, ClassLoader classLoader, C12909a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f47116c + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f47116c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f47116c.mo19668j(i2);
            bundleArr[i2] = this.f47116c.mo19672n(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public C12908a(Parcelable parcelable) {
        super(parcelable);
        this.f47116c = new C5426g<>();
    }

    private C12908a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f47116c = new C5426g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f47116c.put(strArr[i], bundleArr[i]);
        }
    }
}
