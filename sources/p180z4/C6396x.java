package p180z4;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p033d5.C4141r;
import p033d5.C4165y1;
import p033d5.C4168z1;
import p088l5.C4954a;
import p088l5.C4956b;

/* renamed from: z4.x */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class C6396x extends C4165y1 {

    /* renamed from: a */
    private final int f30641a;

    protected C6396x(byte[] bArr) {
        C4141r.m28211a(bArr.length == 25);
        this.f30641a = Arrays.hashCode(bArr);
    }

    /* renamed from: P0 */
    protected static byte[] m37488P0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final C4954a mo17489b() {
        return C4956b.m31385o3(mo21820o3());
    }

    /* renamed from: e */
    public final int mo17490e() {
        return this.f30641a;
    }

    public final boolean equals(Object obj) {
        C4954a b;
        if (obj != null && (obj instanceof C4168z1)) {
            try {
                C4168z1 z1Var = (C4168z1) obj;
                if (z1Var.mo17490e() != this.f30641a || (b = z1Var.mo17489b()) == null) {
                    return false;
                }
                return Arrays.equals(mo21820o3(), (byte[]) C4956b.m31384P0(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30641a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o3 */
    public abstract byte[] mo21820o3();
}
