package p160w2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p161w3.C5953m0;

/* renamed from: w2.k */
/* compiled from: MlltFrame */
public final class C5909k extends C5906i {
    public static final Parcelable.Creator<C5909k> CREATOR = new C5910a();

    /* renamed from: b */
    public final int f29036b;

    /* renamed from: c */
    public final int f29037c;

    /* renamed from: d */
    public final int f29038d;

    /* renamed from: e */
    public final int[] f29039e;

    /* renamed from: f */
    public final int[] f29040f;

    /* renamed from: w2.k$a */
    /* compiled from: MlltFrame */
    class C5910a implements Parcelable.Creator<C5909k> {
        C5910a() {
        }

        /* renamed from: a */
        public C5909k createFromParcel(Parcel parcel) {
            return new C5909k(parcel);
        }

        /* renamed from: b */
        public C5909k[] newArray(int i) {
            return new C5909k[i];
        }
    }

    public C5909k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f29036b = i;
        this.f29037c = i2;
        this.f29038d = i3;
        this.f29039e = iArr;
        this.f29040f = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5909k.class != obj.getClass()) {
            return false;
        }
        C5909k kVar = (C5909k) obj;
        if (this.f29036b == kVar.f29036b && this.f29037c == kVar.f29037c && this.f29038d == kVar.f29038d && Arrays.equals(this.f29039e, kVar.f29039e) && Arrays.equals(this.f29040f, kVar.f29040f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f29036b) * 31) + this.f29037c) * 31) + this.f29038d) * 31) + Arrays.hashCode(this.f29039e)) * 31) + Arrays.hashCode(this.f29040f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29036b);
        parcel.writeInt(this.f29037c);
        parcel.writeInt(this.f29038d);
        parcel.writeIntArray(this.f29039e);
        parcel.writeIntArray(this.f29040f);
    }

    C5909k(Parcel parcel) {
        super("MLLT");
        this.f29036b = parcel.readInt();
        this.f29037c = parcel.readInt();
        this.f29038d = parcel.readInt();
        this.f29039e = (int[]) C5953m0.m35138j(parcel.createIntArray());
        this.f29040f = (int[]) C5953m0.m35138j(parcel.createIntArray());
    }
}
