package p411z5;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z5.i */
public final class C13454i extends C4240a {
    public static final Parcelable.Creator<C13454i> CREATOR = new C13455j();

    /* renamed from: a */
    public final long f47803a;

    /* renamed from: b */
    public final C13444a[] f47804b;

    /* renamed from: c */
    public final int f47805c;

    /* renamed from: d */
    private final boolean f47806d;

    public C13454i(long j, C13444a[] aVarArr, int i, boolean z) {
        this.f47803a = j;
        this.f47804b = aVarArr;
        this.f47806d = z;
        if (z) {
            this.f47805c = i;
        } else {
            this.f47805c = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28617n(parcel, 2, this.f47803a);
        C4243c.m28623t(parcel, 3, this.f47804b, i, false);
        C4243c.m28614k(parcel, 4, this.f47805c);
        C4243c.m28606c(parcel, 5, this.f47806d);
        C4243c.m28605b(parcel, a);
    }
}
