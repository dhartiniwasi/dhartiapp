package p177z1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p161w3.C5917a;
import p161w3.C5953m0;
import p190b7.C6685q;

/* renamed from: z1.g */
/* compiled from: BundleListRetriever */
public final class C6221g extends Binder {

    /* renamed from: a */
    private static final int f29948a = (C5953m0.f29110a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536);

    /* renamed from: a */
    public static C6685q<Bundle> m36498a(IBinder iBinder) {
        int readInt;
        C6685q.C6686a r = C6685q.m38441r();
        int i = 1;
        int i2 = 0;
        while (i != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i2);
                iBinder.transact(1, obtain, obtain2, 0);
                while (true) {
                    readInt = obtain2.readInt();
                    if (readInt != 1) {
                        break;
                    }
                    r.mo22506a((Bundle) C5917a.m34872e(obtain2.readBundle()));
                    i2++;
                }
                obtain2.recycle();
                obtain.recycle();
                i = readInt;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return r.mo22547h();
    }
}
