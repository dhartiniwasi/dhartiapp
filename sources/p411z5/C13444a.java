package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z5.a */
public class C13444a extends C4240a {
    public static final Parcelable.Creator<C13444a> CREATOR = new C13453h();

    /* renamed from: a */
    public final String f47786a;

    /* renamed from: b */
    public final byte[] f47787b;

    /* renamed from: c */
    public final int f47788c;

    public C13444a(String str, byte[] bArr, int i) {
        this.f47786a = str;
        this.f47787b = bArr;
        this.f47788c = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 2, this.f47786a, false);
        C4243c.m28609f(parcel, 3, this.f47787b, false);
        C4243c.m28614k(parcel, 4, this.f47788c);
        C4243c.m28605b(parcel, a);
    }
}
