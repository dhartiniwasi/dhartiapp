package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.a */
/* compiled from: ActivityResult */
public final class C0254a implements Parcelable {
    public static final Parcelable.Creator<C0254a> CREATOR = new C0255a();

    /* renamed from: a */
    private final int f606a;

    /* renamed from: b */
    private final Intent f607b;

    /* renamed from: androidx.activity.result.a$a */
    /* compiled from: ActivityResult */
    class C0255a implements Parcelable.Creator<C0254a> {
        C0255a() {
        }

        /* renamed from: a */
        public C0254a createFromParcel(Parcel parcel) {
            return new C0254a(parcel);
        }

        /* renamed from: b */
        public C0254a[] newArray(int i) {
            return new C0254a[i];
        }
    }

    public C0254a(int i, Intent intent) {
        this.f606a = i;
        this.f607b = intent;
    }

    /* renamed from: c */
    public static String m1248c(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    /* renamed from: a */
    public Intent mo786a() {
        return this.f607b;
    }

    /* renamed from: b */
    public int mo787b() {
        return this.f606a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m1248c(this.f606a) + ", data=" + this.f607b + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f606a);
        parcel.writeInt(this.f607b == null ? 0 : 1);
        Intent intent = this.f607b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    C0254a(Parcel parcel) {
        this.f606a = parcel.readInt();
        this.f607b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
