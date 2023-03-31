package p169y;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y.a */
/* compiled from: AbsSavedState */
public abstract class C6079a implements Parcelable {
    public static final Parcelable.Creator<C6079a> CREATOR = new C6081b();

    /* renamed from: b */
    public static final C6079a f29449b = new C6080a();

    /* renamed from: a */
    private final Parcelable f29450a;

    /* renamed from: y.a$a */
    /* compiled from: AbsSavedState */
    static class C6080a extends C6079a {
        C6080a() {
            super((C6080a) null);
        }
    }

    /* renamed from: y.a$b */
    /* compiled from: AbsSavedState */
    static class C6081b implements Parcelable.ClassLoaderCreator<C6079a> {
        C6081b() {
        }

        /* renamed from: a */
        public C6079a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public C6079a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return C6079a.f29449b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public C6079a[] newArray(int i) {
            return new C6079a[i];
        }
    }

    /* synthetic */ C6079a(C6080a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable mo20873a() {
        return this.f29450a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f29450a, i);
    }

    private C6079a() {
        this.f29450a = null;
    }

    protected C6079a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f29450a = parcelable == f29449b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected C6079a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f29450a = readParcelable == null ? f29449b : readParcelable;
    }
}
