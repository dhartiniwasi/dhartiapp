package p198c6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p007a5.C0111g;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: c6.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6753b extends C4240a implements C0111g {
    public static final Parcelable.Creator<C6753b> CREATOR = new C6754c();

    /* renamed from: a */
    final int f31268a;

    /* renamed from: b */
    private int f31269b;

    /* renamed from: c */
    private Intent f31270c;

    public C6753b() {
        this(2, 0, (Intent) null);
    }

    /* renamed from: d1 */
    public final Status mo259d1() {
        if (this.f31269b == 0) {
            return Status.f6034g;
        }
        return Status.f6038s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f31268a);
        C4243c.m28614k(parcel, 2, this.f31269b);
        C4243c.m28619p(parcel, 3, this.f31270c, i, false);
        C4243c.m28605b(parcel, a);
    }

    C6753b(int i, int i2, Intent intent) {
        this.f31268a = i;
        this.f31269b = i2;
        this.f31270c = intent;
    }
}
