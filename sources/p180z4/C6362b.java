package p180z4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p033d5.C4133p;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: z4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6362b extends C4240a {
    public static final Parcelable.Creator<C6362b> CREATOR = new C6388p();

    /* renamed from: e */
    public static final C6362b f30577e = new C6362b(0);

    /* renamed from: a */
    final int f30578a;

    /* renamed from: b */
    private final int f30579b;

    /* renamed from: c */
    private final PendingIntent f30580c;

    /* renamed from: d */
    private final String f30581d;

    public C6362b(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    C6362b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f30578a = i;
        this.f30579b = i2;
        this.f30580c = pendingIntent;
        this.f30581d = str;
    }

    /* renamed from: N1 */
    static String m37398N1(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    /* renamed from: I1 */
    public int mo21751I1() {
        return this.f30579b;
    }

    /* renamed from: J1 */
    public String mo21752J1() {
        return this.f30581d;
    }

    /* renamed from: K1 */
    public PendingIntent mo21753K1() {
        return this.f30580c;
    }

    /* renamed from: L1 */
    public boolean mo21754L1() {
        return (this.f30579b == 0 || this.f30580c == null) ? false : true;
    }

    /* renamed from: M1 */
    public boolean mo21755M1() {
        return this.f30579b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6362b)) {
            return false;
        }
        C6362b bVar = (C6362b) obj;
        return this.f30579b == bVar.f30579b && C4133p.m28193a(this.f30580c, bVar.f30580c) && C4133p.m28193a(this.f30581d, bVar.f30581d);
    }

    public int hashCode() {
        return C4133p.m28194b(Integer.valueOf(this.f30579b), this.f30580c, this.f30581d);
    }

    public String toString() {
        C4133p.C4134a c = C4133p.m28195c(this);
        c.mo17442a("statusCode", m37398N1(this.f30579b));
        c.mo17442a("resolution", this.f30580c);
        c.mo17442a("message", this.f30581d);
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f30578a);
        C4243c.m28614k(parcel, 2, mo21751I1());
        C4243c.m28619p(parcel, 3, mo21753K1(), i, false);
        C4243c.m28620q(parcel, 4, mo21752J1(), false);
        C4243c.m28605b(parcel, a);
    }

    public C6362b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C6362b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
