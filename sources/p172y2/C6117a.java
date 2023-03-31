package p172y2;

import android.os.Parcel;
import android.os.Parcelable;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: y2.a */
/* compiled from: PrivateCommand */
public final class C6117a extends C6119b {
    public static final Parcelable.Creator<C6117a> CREATOR = new C6118a();

    /* renamed from: a */
    public final long f29518a;

    /* renamed from: b */
    public final long f29519b;

    /* renamed from: c */
    public final byte[] f29520c;

    /* renamed from: y2.a$a */
    /* compiled from: PrivateCommand */
    class C6118a implements Parcelable.Creator<C6117a> {
        C6118a() {
        }

        /* renamed from: a */
        public C6117a createFromParcel(Parcel parcel) {
            return new C6117a(parcel, (C6118a) null);
        }

        /* renamed from: b */
        public C6117a[] newArray(int i) {
            return new C6117a[i];
        }
    }

    /* synthetic */ C6117a(Parcel parcel, C6118a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C6117a m35766a(C5918a0 a0Var, int i, long j) {
        long E = a0Var.mo20536E();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        a0Var.mo20557j(bArr, 0, i2);
        return new C6117a(E, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29518a);
        parcel.writeLong(this.f29519b);
        parcel.writeByteArray(this.f29520c);
    }

    private C6117a(long j, byte[] bArr, long j2) {
        this.f29518a = j2;
        this.f29519b = j;
        this.f29520c = bArr;
    }

    private C6117a(Parcel parcel) {
        this.f29518a = parcel.readLong();
        this.f29519b = parcel.readLong();
        this.f29520c = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
