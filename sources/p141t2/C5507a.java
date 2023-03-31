package p141t2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: t2.a */
/* compiled from: EventMessage */
public final class C5507a implements C5432a.C5434b {
    public static final Parcelable.Creator<C5507a> CREATOR = new C5508a();

    /* renamed from: g */
    private static final C6272r1 f27977g = new C6272r1.C6274b().mo21517e0("application/id3").mo21491E();

    /* renamed from: h */
    private static final C6272r1 f27978h = new C6272r1.C6274b().mo21517e0("application/x-scte35").mo21491E();

    /* renamed from: a */
    public final String f27979a;

    /* renamed from: b */
    public final String f27980b;

    /* renamed from: c */
    public final long f27981c;

    /* renamed from: d */
    public final long f27982d;

    /* renamed from: e */
    public final byte[] f27983e;

    /* renamed from: f */
    private int f27984f;

    /* renamed from: t2.a$a */
    /* compiled from: EventMessage */
    class C5508a implements Parcelable.Creator<C5507a> {
        C5508a() {
        }

        /* renamed from: a */
        public C5507a createFromParcel(Parcel parcel) {
            return new C5507a(parcel);
        }

        /* renamed from: b */
        public C5507a[] newArray(int i) {
            return new C5507a[i];
        }
    }

    public C5507a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f27979a = str;
        this.f27980b = str2;
        this.f27981c = j;
        this.f27982d = j2;
        this.f27983e = bArr;
    }

    /* renamed from: J0 */
    public /* synthetic */ void mo17874J0(C6214e2.C6216b bVar) {
        C5435b.m33284c(this, bVar);
    }

    /* renamed from: c0 */
    public C6272r1 mo17875c0() {
        String str = this.f27979a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f27978h;
            case 1:
            case 2:
                return f27977g;
            default:
                return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5507a.class != obj.getClass()) {
            return false;
        }
        C5507a aVar = (C5507a) obj;
        if (this.f27981c != aVar.f27981c || this.f27982d != aVar.f27982d || !C5953m0.m35124c(this.f27979a, aVar.f27979a) || !C5953m0.m35124c(this.f27980b, aVar.f27980b) || !Arrays.equals(this.f27983e, aVar.f27983e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f27984f == 0) {
            String str = this.f27979a;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f27980b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f27981c;
            long j2 = this.f27982d;
            this.f27984f = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f27983e);
        }
        return this.f27984f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f27979a + ", id=" + this.f27982d + ", durationMs=" + this.f27981c + ", value=" + this.f27980b;
    }

    /* renamed from: u1 */
    public byte[] mo17880u1() {
        if (mo17875c0() != null) {
            return this.f27983e;
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27979a);
        parcel.writeString(this.f27980b);
        parcel.writeLong(this.f27981c);
        parcel.writeLong(this.f27982d);
        parcel.writeByteArray(this.f27983e);
    }

    C5507a(Parcel parcel) {
        this.f27979a = (String) C5953m0.m35138j(parcel.readString());
        this.f27980b = (String) C5953m0.m35138j(parcel.readString());
        this.f27981c = parcel.readLong();
        this.f27982d = parcel.readLong();
        this.f27983e = (byte[]) C5953m0.m35138j(parcel.createByteArray());
    }
}
