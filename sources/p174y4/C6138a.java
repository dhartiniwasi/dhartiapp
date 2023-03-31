package p174y4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: y4.a */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C6138a extends C4240a {
    public static final Parcelable.Creator<C6138a> CREATOR = new C6147e();

    /* renamed from: a */
    Intent f29572a;

    public C6138a(Intent intent) {
        this.f29572a = intent;
    }

    /* renamed from: I1 */
    public Intent mo20995I1() {
        return this.f29572a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f29572a, i, false);
        C4243c.m28605b(parcel, a);
    }
}
