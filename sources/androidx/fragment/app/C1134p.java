package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1114n;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentManagerState */
final class C1134p implements Parcelable {
    public static final Parcelable.Creator<C1134p> CREATOR = new C1135a();

    /* renamed from: a */
    ArrayList<C1140t> f3110a;

    /* renamed from: b */
    ArrayList<String> f3111b;

    /* renamed from: c */
    C1059b[] f3112c;

    /* renamed from: d */
    int f3113d;

    /* renamed from: e */
    String f3114e = null;

    /* renamed from: f */
    ArrayList<String> f3115f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<Bundle> f3116g = new ArrayList<>();

    /* renamed from: h */
    ArrayList<C1114n.C1127m> f3117h;

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentManagerState */
    class C1135a implements Parcelable.Creator<C1134p> {
        C1135a() {
        }

        /* renamed from: a */
        public C1134p createFromParcel(Parcel parcel) {
            return new C1134p(parcel);
        }

        /* renamed from: b */
        public C1134p[] newArray(int i) {
            return new C1134p[i];
        }
    }

    public C1134p() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3110a);
        parcel.writeStringList(this.f3111b);
        parcel.writeTypedArray(this.f3112c, i);
        parcel.writeInt(this.f3113d);
        parcel.writeString(this.f3114e);
        parcel.writeStringList(this.f3115f);
        parcel.writeTypedList(this.f3116g);
        parcel.writeTypedList(this.f3117h);
    }

    public C1134p(Parcel parcel) {
        this.f3110a = parcel.createTypedArrayList(C1140t.CREATOR);
        this.f3111b = parcel.createStringArrayList();
        this.f3112c = (C1059b[]) parcel.createTypedArray(C1059b.CREATOR);
        this.f3113d = parcel.readInt();
        this.f3114e = parcel.readString();
        this.f3115f = parcel.createStringArrayList();
        this.f3116g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3117h = parcel.createTypedArrayList(C1114n.C1127m.CREATOR);
    }
}
