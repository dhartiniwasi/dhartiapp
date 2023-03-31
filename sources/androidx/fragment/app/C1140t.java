package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.t */
/* compiled from: FragmentState */
final class C1140t implements Parcelable {
    public static final Parcelable.Creator<C1140t> CREATOR = new C1141a();

    /* renamed from: a */
    final String f3126a;

    /* renamed from: b */
    final String f3127b;

    /* renamed from: c */
    final boolean f3128c;

    /* renamed from: d */
    final int f3129d;

    /* renamed from: e */
    final int f3130e;

    /* renamed from: f */
    final String f3131f;

    /* renamed from: g */
    final boolean f3132g;

    /* renamed from: h */
    final boolean f3133h;

    /* renamed from: i */
    final boolean f3134i;

    /* renamed from: r */
    final Bundle f3135r;

    /* renamed from: s */
    final boolean f3136s;

    /* renamed from: t */
    final int f3137t;

    /* renamed from: u */
    Bundle f3138u;

    /* renamed from: androidx.fragment.app.t$a */
    /* compiled from: FragmentState */
    class C1141a implements Parcelable.Creator<C1140t> {
        C1141a() {
        }

        /* renamed from: a */
        public C1140t createFromParcel(Parcel parcel) {
            return new C1140t(parcel);
        }

        /* renamed from: b */
        public C1140t[] newArray(int i) {
            return new C1140t[i];
        }
    }

    C1140t(Fragment fragment) {
        this.f3126a = fragment.getClass().getName();
        this.f3127b = fragment.f2832f;
        this.f3128c = fragment.f2850v;
        this.f3129d = fragment.f2807E;
        this.f3130e = fragment.f2808F;
        this.f3131f = fragment.f2809G;
        this.f3132g = fragment.f2812J;
        this.f3133h = fragment.f2849u;
        this.f3134i = fragment.f2811I;
        this.f3135r = fragment.f2834g;
        this.f3136s = fragment.f2810H;
        this.f3137t = fragment.f2835g0.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3126a);
        sb.append(" (");
        sb.append(this.f3127b);
        sb.append(")}:");
        if (this.f3128c) {
            sb.append(" fromLayout");
        }
        if (this.f3130e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3130e));
        }
        String str = this.f3131f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3131f);
        }
        if (this.f3132g) {
            sb.append(" retainInstance");
        }
        if (this.f3133h) {
            sb.append(" removing");
        }
        if (this.f3134i) {
            sb.append(" detached");
        }
        if (this.f3136s) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3126a);
        parcel.writeString(this.f3127b);
        parcel.writeInt(this.f3128c ? 1 : 0);
        parcel.writeInt(this.f3129d);
        parcel.writeInt(this.f3130e);
        parcel.writeString(this.f3131f);
        parcel.writeInt(this.f3132g ? 1 : 0);
        parcel.writeInt(this.f3133h ? 1 : 0);
        parcel.writeInt(this.f3134i ? 1 : 0);
        parcel.writeBundle(this.f3135r);
        parcel.writeInt(this.f3136s ? 1 : 0);
        parcel.writeBundle(this.f3138u);
        parcel.writeInt(this.f3137t);
    }

    C1140t(Parcel parcel) {
        this.f3126a = parcel.readString();
        this.f3127b = parcel.readString();
        boolean z = true;
        this.f3128c = parcel.readInt() != 0;
        this.f3129d = parcel.readInt();
        this.f3130e = parcel.readInt();
        this.f3131f = parcel.readString();
        this.f3132g = parcel.readInt() != 0;
        this.f3133h = parcel.readInt() != 0;
        this.f3134i = parcel.readInt() != 0;
        this.f3135r = parcel.readBundle();
        this.f3136s = parcel.readInt() == 0 ? false : z;
        this.f3138u = parcel.readBundle();
        this.f3137t = parcel.readInt();
    }
}
