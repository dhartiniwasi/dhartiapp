package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new C1315b();

    /* renamed from: a */
    final List<ParcelImpl> f3555a;

    /* renamed from: androidx.media2.common.ParcelImplListSlice$a */
    class C1314a extends Binder {

        /* renamed from: a */
        final /* synthetic */ int f3556a;

        C1314a(int i) {
            this.f3556a = i;
        }

        /* access modifiers changed from: protected */
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            while (readInt < this.f3556a && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f3555a.get(readInt), i2);
                readInt++;
            }
            if (readInt < this.f3556a) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    /* renamed from: androidx.media2.common.ParcelImplListSlice$b */
    class C1315b implements Parcelable.Creator<ParcelImplListSlice> {
        C1315b() {
        }

        /* renamed from: a */
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        /* renamed from: b */
        public ParcelImplListSlice[] newArray(int i) {
            return new ParcelImplListSlice[i];
        }
    }

    public ParcelImplListSlice(List<ParcelImpl> list) {
        Objects.requireNonNull(list, "list shouldn't be null");
        this.f3555a = list;
    }

    /* renamed from: a */
    public List<ParcelImpl> mo4647a() {
        return this.f3555a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f3555a.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i2 = 0;
            while (i2 < size && i2 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f3555a.get(i2), i);
                i2++;
            }
            if (i2 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new C1314a(size));
            }
        }
    }

    ParcelImplListSlice(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f3555a = new ArrayList(readInt);
        if (readInt > 0) {
            int i = 0;
            while (i < readInt && parcel.readInt() != 0) {
                this.f3555a.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
                i++;
            }
            if (i < readInt) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                while (i < readInt) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInt(i);
                        readStrongBinder.transact(1, obtain, obtain2, 0);
                        while (i < readInt) {
                            if (obtain2.readInt() == 0) {
                                break;
                            }
                            this.f3555a.add((ParcelImpl) obtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                            i++;
                        }
                    } catch (RemoteException e) {
                        Log.w("ParcelImplListSlice", "Failure retrieving array; only received " + i + " of " + readInt, e);
                        return;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }
        }
    }
}
