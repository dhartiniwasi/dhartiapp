package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C1146w;
import androidx.lifecycle.C1208j;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b */
/* compiled from: BackStackState */
final class C1059b implements Parcelable {
    public static final Parcelable.Creator<C1059b> CREATOR = new C1060a();

    /* renamed from: a */
    final int[] f2897a;

    /* renamed from: b */
    final ArrayList<String> f2898b;

    /* renamed from: c */
    final int[] f2899c;

    /* renamed from: d */
    final int[] f2900d;

    /* renamed from: e */
    final int f2901e;

    /* renamed from: f */
    final String f2902f;

    /* renamed from: g */
    final int f2903g;

    /* renamed from: h */
    final int f2904h;

    /* renamed from: i */
    final CharSequence f2905i;

    /* renamed from: r */
    final int f2906r;

    /* renamed from: s */
    final CharSequence f2907s;

    /* renamed from: t */
    final ArrayList<String> f2908t;

    /* renamed from: u */
    final ArrayList<String> f2909u;

    /* renamed from: v */
    final boolean f2910v;

    /* renamed from: androidx.fragment.app.b$a */
    /* compiled from: BackStackState */
    class C1060a implements Parcelable.Creator<C1059b> {
        C1060a() {
        }

        /* renamed from: a */
        public C1059b createFromParcel(Parcel parcel) {
            return new C1059b(parcel);
        }

        /* renamed from: b */
        public C1059b[] newArray(int i) {
            return new C1059b[i];
        }
    }

    public C1059b(C1057a aVar) {
        int size = aVar.f3152c.size();
        this.f2897a = new int[(size * 5)];
        if (aVar.f3158i) {
            this.f2898b = new ArrayList<>(size);
            this.f2899c = new int[size];
            this.f2900d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C1146w.C1147a aVar2 = aVar.f3152c.get(i);
                int i3 = i2 + 1;
                this.f2897a[i2] = aVar2.f3169a;
                ArrayList<String> arrayList = this.f2898b;
                Fragment fragment = aVar2.f3170b;
                arrayList.add(fragment != null ? fragment.f2832f : null);
                int[] iArr = this.f2897a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3171c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3172d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3173e;
                iArr[i6] = aVar2.f3174f;
                this.f2899c[i] = aVar2.f3175g.ordinal();
                this.f2900d[i] = aVar2.f3176h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f2901e = aVar.f3157h;
            this.f2902f = aVar.f3160k;
            this.f2903g = aVar.f2892v;
            this.f2904h = aVar.f3161l;
            this.f2905i = aVar.f3162m;
            this.f2906r = aVar.f3163n;
            this.f2907s = aVar.f3164o;
            this.f2908t = aVar.f3165p;
            this.f2909u = aVar.f3166q;
            this.f2910v = aVar.f3167r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1057a mo3906a(C1114n nVar) {
        C1057a aVar = new C1057a(nVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2897a.length) {
            C1146w.C1147a aVar2 = new C1146w.C1147a();
            int i3 = i + 1;
            aVar2.f3169a = this.f2897a[i];
            if (C1114n.m4999F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f2897a[i3]);
            }
            String str = this.f2898b.get(i2);
            if (str != null) {
                aVar2.f3170b = nVar.mo4142g0(str);
            } else {
                aVar2.f3170b = null;
            }
            aVar2.f3175g = C1208j.C1211c.values()[this.f2899c[i2]];
            aVar2.f3176h = C1208j.C1211c.values()[this.f2900d[i2]];
            int[] iArr = this.f2897a;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f3171c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f3172d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f3173e = i9;
            int i10 = iArr[i8];
            aVar2.f3174f = i10;
            aVar.f3153d = i5;
            aVar.f3154e = i7;
            aVar.f3155f = i9;
            aVar.f3156g = i10;
            aVar.mo4291e(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f3157h = this.f2901e;
        aVar.f3160k = this.f2902f;
        aVar.f2892v = this.f2903g;
        aVar.f3158i = true;
        aVar.f3161l = this.f2904h;
        aVar.f3162m = this.f2905i;
        aVar.f3163n = this.f2906r;
        aVar.f3164o = this.f2907s;
        aVar.f3165p = this.f2908t;
        aVar.f3166q = this.f2909u;
        aVar.f3167r = this.f2910v;
        aVar.mo3889p(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2897a);
        parcel.writeStringList(this.f2898b);
        parcel.writeIntArray(this.f2899c);
        parcel.writeIntArray(this.f2900d);
        parcel.writeInt(this.f2901e);
        parcel.writeString(this.f2902f);
        parcel.writeInt(this.f2903g);
        parcel.writeInt(this.f2904h);
        TextUtils.writeToParcel(this.f2905i, parcel, 0);
        parcel.writeInt(this.f2906r);
        TextUtils.writeToParcel(this.f2907s, parcel, 0);
        parcel.writeStringList(this.f2908t);
        parcel.writeStringList(this.f2909u);
        parcel.writeInt(this.f2910v ? 1 : 0);
    }

    public C1059b(Parcel parcel) {
        this.f2897a = parcel.createIntArray();
        this.f2898b = parcel.createStringArrayList();
        this.f2899c = parcel.createIntArray();
        this.f2900d = parcel.createIntArray();
        this.f2901e = parcel.readInt();
        this.f2902f = parcel.readString();
        this.f2903g = parcel.readInt();
        this.f2904h = parcel.readInt();
        this.f2905i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2906r = parcel.readInt();
        this.f2907s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2908t = parcel.createStringArrayList();
        this.f2909u = parcel.createStringArrayList();
        this.f2910v = parcel.readInt() != 0;
    }
}
