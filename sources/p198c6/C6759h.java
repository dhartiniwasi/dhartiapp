package p198c6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p007a5.C0111g;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: c6.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6759h extends C4240a implements C0111g {
    public static final Parcelable.Creator<C6759h> CREATOR = new C6760i();

    /* renamed from: a */
    private final List<String> f31271a;

    /* renamed from: b */
    private final String f31272b;

    public C6759h(List<String> list, String str) {
        this.f31271a = list;
        this.f31272b = str;
    }

    /* renamed from: d1 */
    public final Status mo259d1() {
        if (this.f31272b != null) {
            return Status.f6034g;
        }
        return Status.f6038s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28622s(parcel, 1, this.f31271a, false);
        C4243c.m28620q(parcel, 2, this.f31272b, false);
        C4243c.m28605b(parcel, a);
    }
}
