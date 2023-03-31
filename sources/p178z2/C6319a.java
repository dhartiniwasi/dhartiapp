package p178z2;

import android.os.Parcel;
import android.os.Parcelable;
import p148u2.C5711b;

/* renamed from: z2.a */
/* compiled from: VorbisComment */
public final class C6319a extends C5711b {
    public static final Parcelable.Creator<C6319a> CREATOR = new C6320a();

    /* renamed from: z2.a$a */
    /* compiled from: VorbisComment */
    class C6320a implements Parcelable.Creator<C6319a> {
        C6320a() {
        }

        /* renamed from: a */
        public C6319a createFromParcel(Parcel parcel) {
            return new C6319a(parcel);
        }

        /* renamed from: b */
        public C6319a[] newArray(int i) {
            return new C6319a[i];
        }
    }

    public C6319a(String str, String str2) {
        super(str, str2);
    }

    C6319a(Parcel parcel) {
        super(parcel);
    }
}
