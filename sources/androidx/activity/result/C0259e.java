package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.e */
/* compiled from: IntentSenderRequest */
public final class C0259e implements Parcelable {
    public static final Parcelable.Creator<C0259e> CREATOR = new C0260a();

    /* renamed from: a */
    private final IntentSender f608a;

    /* renamed from: b */
    private final Intent f609b;

    /* renamed from: c */
    private final int f610c;

    /* renamed from: d */
    private final int f611d;

    /* renamed from: androidx.activity.result.e$a */
    /* compiled from: IntentSenderRequest */
    class C0260a implements Parcelable.Creator<C0259e> {
        C0260a() {
        }

        /* renamed from: a */
        public C0259e createFromParcel(Parcel parcel) {
            return new C0259e(parcel);
        }

        /* renamed from: b */
        public C0259e[] newArray(int i) {
            return new C0259e[i];
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    /* compiled from: IntentSenderRequest */
    public static final class C0261b {

        /* renamed from: a */
        private IntentSender f612a;

        /* renamed from: b */
        private Intent f613b;

        /* renamed from: c */
        private int f614c;

        /* renamed from: d */
        private int f615d;

        public C0261b(IntentSender intentSender) {
            this.f612a = intentSender;
        }

        /* renamed from: a */
        public C0259e mo807a() {
            return new C0259e(this.f612a, this.f613b, this.f614c, this.f615d);
        }

        /* renamed from: b */
        public C0261b mo808b(Intent intent) {
            this.f613b = intent;
            return this;
        }

        /* renamed from: c */
        public C0261b mo809c(int i, int i2) {
            this.f615d = i;
            this.f614c = i2;
            return this;
        }
    }

    C0259e(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f608a = intentSender;
        this.f609b = intent;
        this.f610c = i;
        this.f611d = i2;
    }

    /* renamed from: a */
    public Intent mo797a() {
        return this.f609b;
    }

    /* renamed from: b */
    public int mo798b() {
        return this.f610c;
    }

    /* renamed from: c */
    public int mo799c() {
        return this.f611d;
    }

    /* renamed from: d */
    public IntentSender mo800d() {
        return this.f608a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f608a, i);
        parcel.writeParcelable(this.f609b, i);
        parcel.writeInt(this.f610c);
        parcel.writeInt(this.f611d);
    }

    C0259e(Parcel parcel) {
        this.f608a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f609b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f610c = parcel.readInt();
        this.f611d = parcel.readInt();
    }
}
