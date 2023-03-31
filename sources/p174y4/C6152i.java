package p174y4;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p174y4.C6142c;

/* renamed from: y4.i */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C6152i implements Parcelable {
    public static final Parcelable.Creator<C6152i> CREATOR = new C6150g();

    /* renamed from: a */
    Messenger f29594a;

    /* renamed from: b */
    C6142c f29595b;

    public C6152i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f29594a = new Messenger(iBinder);
        } else {
            this.f29595b = new C6142c.C6143a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder mo21016a() {
        Messenger messenger = this.f29594a;
        return messenger != null ? messenger.getBinder() : this.f29595b.asBinder();
    }

    /* renamed from: b */
    public final void mo21017b(Message message) throws RemoteException {
        Messenger messenger = this.f29594a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f29595b.mo21002K1(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo21016a().equals(((C6152i) obj).mo21016a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo21016a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f29594a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f29595b.asBinder());
        }
    }
}
