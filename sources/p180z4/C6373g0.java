package p180z4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p033d5.C4165y1;
import p040e5.C4240a;
import p040e5.C4243c;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: z4.g0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6373g0 extends C4240a {
    public static final Parcelable.Creator<C6373g0> CREATOR = new C6375h0();

    /* renamed from: a */
    private final String f30611a;

    /* renamed from: b */
    private final C6396x f30612b;

    /* renamed from: c */
    private final boolean f30613c;

    /* renamed from: d */
    private final boolean f30614d;

    C6373g0(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f30611a = str;
        C6397y yVar = null;
        if (iBinder != null) {
            try {
                C4954a b = C4165y1.m28276B0(iBinder).mo17489b();
                if (b == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C4956b.m31384P0(b);
                }
                if (bArr != null) {
                    yVar = new C6397y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f30612b = yVar;
        this.f30613c = z;
        this.f30614d = z2;
    }

    C6373g0(String str, C6396x xVar, boolean z, boolean z2) {
        this.f30611a = str;
        this.f30612b = xVar;
        this.f30613c = z;
        this.f30614d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f30611a, false);
        C6396x xVar = this.f30612b;
        if (xVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            xVar = null;
        }
        C4243c.m28613j(parcel, 2, xVar, false);
        C4243c.m28606c(parcel, 3, this.f30613c);
        C4243c.m28606c(parcel, 4, this.f30614d);
        C4243c.m28605b(parcel, a);
    }
}
