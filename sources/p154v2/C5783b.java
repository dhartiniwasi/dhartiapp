package p154v2;

import android.os.Parcel;
import android.os.Parcelable;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;

/* renamed from: v2.b */
/* compiled from: IcyHeaders */
public final class C5783b implements C5432a.C5434b {
    public static final Parcelable.Creator<C5783b> CREATOR = new C5784a();

    /* renamed from: a */
    public final int f28770a;

    /* renamed from: b */
    public final String f28771b;

    /* renamed from: c */
    public final String f28772c;

    /* renamed from: d */
    public final String f28773d;

    /* renamed from: e */
    public final boolean f28774e;

    /* renamed from: f */
    public final int f28775f;

    /* renamed from: v2.b$a */
    /* compiled from: IcyHeaders */
    class C5784a implements Parcelable.Creator<C5783b> {
        C5784a() {
        }

        /* renamed from: a */
        public C5783b createFromParcel(Parcel parcel) {
            return new C5783b(parcel);
        }

        /* renamed from: b */
        public C5783b[] newArray(int i) {
            return new C5783b[i];
        }
    }

    public C5783b(int i, String str, String str2, String str3, boolean z, int i2) {
        C5917a.m34868a(i2 == -1 || i2 > 0);
        this.f28770a = i;
        this.f28771b = str;
        this.f28772c = str2;
        this.f28773d = str3;
        this.f28774e = z;
        this.f28775f = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p154v2.C5783b m34509a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0039 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = 1
            goto L_0x0037
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x003a }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x003a }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x003a }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x003a }
            p161w3.C5961r.m35215i(r2, r7)     // Catch:{ NumberFormatException -> 0x003a }
            r1 = 0
            r6 = -1
        L_0x0037:
            r7 = r6
            goto L_0x0053
        L_0x0039:
            r6 = -1
        L_0x003a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            p161w3.C5961r.m35215i(r2, r1)
            r7 = r6
            r1 = 0
            goto L_0x0053
        L_0x0051:
            r1 = 0
            r7 = -1
        L_0x0053:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0067
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r9 = r8
        L_0x0068:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x007b
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r10 = r8
        L_0x007c:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008f
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x0090
        L_0x008f:
            r11 = r8
        L_0x0090:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d8 }
            if (r5 <= 0) goto L_0x00c2
            r3 = r5
            goto L_0x00d5
        L_0x00c2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d7 }
            p161w3.C5961r.m35215i(r2, r4)     // Catch:{ NumberFormatException -> 0x00d7 }
            r4 = r1
        L_0x00d5:
            r1 = r4
            goto L_0x00ea
        L_0x00d7:
            r3 = r5
        L_0x00d8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            p161w3.C5961r.m35215i(r2, r13)
        L_0x00ea:
            if (r1 == 0) goto L_0x00f8
            v2.b r13 = new v2.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p154v2.C5783b.m34509a(java.util.Map):v2.b");
    }

    /* renamed from: J0 */
    public void mo17874J0(C6214e2.C6216b bVar) {
        String str = this.f28772c;
        if (str != null) {
            bVar.mo21280g0(str);
        }
        String str2 = this.f28771b;
        if (str2 != null) {
            bVar.mo21271X(str2);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ C6272r1 mo17875c0() {
        return C5435b.m33283b(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5783b.class != obj.getClass()) {
            return false;
        }
        C5783b bVar = (C5783b) obj;
        if (this.f28770a != bVar.f28770a || !C5953m0.m35124c(this.f28771b, bVar.f28771b) || !C5953m0.m35124c(this.f28772c, bVar.f28772c) || !C5953m0.m35124c(this.f28773d, bVar.f28773d) || this.f28774e != bVar.f28774e || this.f28775f != bVar.f28775f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (527 + this.f28770a) * 31;
        String str = this.f28771b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f28772c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f28773d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f28774e ? 1 : 0)) * 31) + this.f28775f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f28772c + "\", genre=\"" + this.f28771b + "\", bitrate=" + this.f28770a + ", metadataInterval=" + this.f28775f;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28770a);
        parcel.writeString(this.f28771b);
        parcel.writeString(this.f28772c);
        parcel.writeString(this.f28773d);
        C5953m0.m35119Z0(parcel, this.f28774e);
        parcel.writeInt(this.f28775f);
    }

    C5783b(Parcel parcel) {
        this.f28770a = parcel.readInt();
        this.f28771b = parcel.readString();
        this.f28772c = parcel.readString();
        this.f28773d = parcel.readString();
        this.f28774e = C5953m0.m35091L0(parcel);
        this.f28775f = parcel.readInt();
    }
}
