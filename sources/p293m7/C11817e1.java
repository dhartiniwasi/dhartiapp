package p293m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7802g;
import java.util.Map;
import p033d5.C4141r;
import p040e5.C4243c;

/* renamed from: m7.e1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11817e1 implements C7802g {
    public static final Parcelable.Creator<C11817e1> CREATOR = new C11820f1();

    /* renamed from: a */
    private final String f44490a;

    /* renamed from: b */
    private final String f44491b;

    /* renamed from: c */
    private final Map f44492c;

    /* renamed from: d */
    private final boolean f44493d;

    public C11817e1(String str, String str2, boolean z) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        this.f44490a = str;
        this.f44491b = str2;
        this.f44492c = C11810c0.m57202c(str2);
        this.f44493d = z;
    }

    public C11817e1(boolean z) {
        this.f44493d = z;
        this.f44491b = null;
        this.f44490a = null;
        this.f44492c = null;
    }

    /* renamed from: D */
    public final String mo26095D() {
        return this.f44490a;
    }

    /* renamed from: I0 */
    public final Map<String, Object> mo26096I0() {
        return this.f44492c;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: k0 */
    public final String mo26097k0() {
        if ("github.com".equals(this.f44490a)) {
            return (String) this.f44492c.get("login");
        }
        if ("twitter.com".equals(this.f44490a)) {
            return (String) this.f44492c.get("screen_name");
        }
        return null;
    }

    /* renamed from: p1 */
    public final boolean mo26098p1() {
        return this.f44493d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f44490a, false);
        C4243c.m28620q(parcel, 2, this.f44491b, false);
        C4243c.m28606c(parcel, 3, this.f44493d);
        C4243c.m28605b(parcel, a);
    }
}
