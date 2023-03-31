package p060h4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: h4.h3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4516h3 extends C4240a {
    public static final Parcelable.Creator<C4516h3> CREATOR = new C4522i3();

    /* renamed from: a */
    private final int f24858a;

    /* renamed from: b */
    private final int f24859b;

    /* renamed from: c */
    private final String f24860c;

    public C4516h3() {
        this(ModuleDescriptor.MODULE_VERSION, 223104000, "21.3.0");
    }

    /* renamed from: I1 */
    public final int mo18059I1() {
        return this.f24859b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f24858a);
        C4243c.m28614k(parcel, 2, this.f24859b);
        C4243c.m28620q(parcel, 3, this.f24860c, false);
        C4243c.m28605b(parcel, a);
    }

    public C4516h3(int i, int i2, String str) {
        this.f24858a = i;
        this.f24859b = i2;
        this.f24860c = str;
    }
}
