package p027d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p027d.C3978a;

/* renamed from: d.b */
/* compiled from: ResultReceiver */
public class C3982b implements Parcelable {
    public static final Parcelable.Creator<C3982b> CREATOR = new C3983a();

    /* renamed from: a */
    final boolean f22998a = false;

    /* renamed from: b */
    final Handler f22999b = null;

    /* renamed from: c */
    C3978a f23000c;

    /* renamed from: d.b$a */
    /* compiled from: ResultReceiver */
    class C3983a implements Parcelable.Creator<C3982b> {
        C3983a() {
        }

        /* renamed from: a */
        public C3982b createFromParcel(Parcel parcel) {
            return new C3982b(parcel);
        }

        /* renamed from: b */
        public C3982b[] newArray(int i) {
            return new C3982b[i];
        }
    }

    /* renamed from: d.b$b */
    /* compiled from: ResultReceiver */
    class C3984b extends C3978a.C3979a {
        C3984b() {
        }

        /* renamed from: C6 */
        public void mo17136C6(int i, Bundle bundle) {
            C3982b bVar = C3982b.this;
            Handler handler = bVar.f22999b;
            if (handler != null) {
                handler.post(new C3985c(i, bundle));
            } else {
                bVar.mo299a(i, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* compiled from: ResultReceiver */
    class C3985c implements Runnable {

        /* renamed from: a */
        final int f23002a;

        /* renamed from: b */
        final Bundle f23003b;

        C3985c(int i, Bundle bundle) {
            this.f23002a = i;
            this.f23003b = bundle;
        }

        public void run() {
            C3982b.this.mo299a(this.f23002a, this.f23003b);
        }
    }

    C3982b(Parcel parcel) {
        this.f23000c = C3978a.C3979a.m27594p(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo299a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo17140b(int i, Bundle bundle) {
        if (this.f22998a) {
            Handler handler = this.f22999b;
            if (handler != null) {
                handler.post(new C3985c(i, bundle));
            } else {
                mo299a(i, bundle);
            }
        } else {
            C3978a aVar = this.f23000c;
            if (aVar != null) {
                try {
                    aVar.mo17136C6(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f23000c == null) {
                this.f23000c = new C3984b();
            }
            parcel.writeStrongBinder(this.f23000c.asBinder());
        }
    }
}
