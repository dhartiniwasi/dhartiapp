package p030d2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6227i;

/* renamed from: d2.m */
/* compiled from: DrmInitData */
public final class C4035m implements Comparator<C4037b>, Parcelable {
    public static final Parcelable.Creator<C4035m> CREATOR = new C4036a();

    /* renamed from: a */
    private final C4037b[] f23112a;

    /* renamed from: b */
    private int f23113b;

    /* renamed from: c */
    public final String f23114c;

    /* renamed from: d */
    public final int f23115d;

    /* renamed from: d2.m$a */
    /* compiled from: DrmInitData */
    class C4036a implements Parcelable.Creator<C4035m> {
        C4036a() {
        }

        /* renamed from: a */
        public C4035m createFromParcel(Parcel parcel) {
            return new C4035m(parcel);
        }

        /* renamed from: b */
        public C4035m[] newArray(int i) {
            return new C4035m[i];
        }
    }

    /* renamed from: d2.m$b */
    /* compiled from: DrmInitData */
    public static final class C4037b implements Parcelable {
        public static final Parcelable.Creator<C4037b> CREATOR = new C4038a();

        /* renamed from: a */
        private int f23116a;

        /* renamed from: b */
        public final UUID f23117b;

        /* renamed from: c */
        public final String f23118c;

        /* renamed from: d */
        public final String f23119d;

        /* renamed from: e */
        public final byte[] f23120e;

        /* renamed from: d2.m$b$a */
        /* compiled from: DrmInitData */
        class C4038a implements Parcelable.Creator<C4037b> {
            C4038a() {
            }

            /* renamed from: a */
            public C4037b createFromParcel(Parcel parcel) {
                return new C4037b(parcel);
            }

            /* renamed from: b */
            public C4037b[] newArray(int i) {
                return new C4037b[i];
            }
        }

        public C4037b(UUID uuid, String str, byte[] bArr) {
            this(uuid, (String) null, str, bArr);
        }

        /* renamed from: a */
        public boolean mo17240a(C4037b bVar) {
            return mo17242c() && !bVar.mo17242c() && mo17243d(bVar.f23117b);
        }

        /* renamed from: b */
        public C4037b mo17241b(byte[] bArr) {
            return new C4037b(this.f23117b, this.f23118c, this.f23119d, bArr);
        }

        /* renamed from: c */
        public boolean mo17242c() {
            return this.f23120e != null;
        }

        /* renamed from: d */
        public boolean mo17243d(UUID uuid) {
            return C6227i.f29960a.equals(this.f23117b) || uuid.equals(this.f23117b);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4037b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C4037b bVar = (C4037b) obj;
            if (!C5953m0.m35124c(this.f23118c, bVar.f23118c) || !C5953m0.m35124c(this.f23119d, bVar.f23119d) || !C5953m0.m35124c(this.f23117b, bVar.f23117b) || !Arrays.equals(this.f23120e, bVar.f23120e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f23116a == 0) {
                int hashCode = this.f23117b.hashCode() * 31;
                String str = this.f23118c;
                this.f23116a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f23119d.hashCode()) * 31) + Arrays.hashCode(this.f23120e);
            }
            return this.f23116a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f23117b.getMostSignificantBits());
            parcel.writeLong(this.f23117b.getLeastSignificantBits());
            parcel.writeString(this.f23118c);
            parcel.writeString(this.f23119d);
            parcel.writeByteArray(this.f23120e);
        }

        public C4037b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f23117b = (UUID) C5917a.m34872e(uuid);
            this.f23118c = str;
            this.f23119d = (String) C5917a.m34872e(str2);
            this.f23120e = bArr;
        }

        C4037b(Parcel parcel) {
            this.f23117b = new UUID(parcel.readLong(), parcel.readLong());
            this.f23118c = parcel.readString();
            this.f23119d = (String) C5953m0.m35138j(parcel.readString());
            this.f23120e = parcel.createByteArray();
        }
    }

    public C4035m(List<C4037b> list) {
        this((String) null, false, (C4037b[]) list.toArray(new C4037b[0]));
    }

    /* renamed from: b */
    private static boolean m27824b(ArrayList<C4037b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f23117b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static C4035m m27825d(C4035m mVar, C4035m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.f23114c;
            for (C4037b bVar : mVar.f23112a) {
                if (bVar.mo17242c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.f23114c;
            }
            int size = arrayList.size();
            for (C4037b bVar2 : mVar2.f23112a) {
                if (bVar2.mo17242c() && !m27824b(arrayList, size, bVar2.f23117b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4035m(str, (List<C4037b>) arrayList);
    }

    /* renamed from: a */
    public int compare(C4037b bVar, C4037b bVar2) {
        UUID uuid = C6227i.f29960a;
        if (uuid.equals(bVar.f23117b)) {
            return uuid.equals(bVar2.f23117b) ? 0 : 1;
        }
        return bVar.f23117b.compareTo(bVar2.f23117b);
    }

    /* renamed from: c */
    public C4035m mo17228c(String str) {
        if (C5953m0.m35124c(this.f23114c, str)) {
            return this;
        }
        return new C4035m(str, false, this.f23112a);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C4037b mo17231e(int i) {
        return this.f23112a[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4035m.class != obj.getClass()) {
            return false;
        }
        C4035m mVar = (C4035m) obj;
        if (!C5953m0.m35124c(this.f23114c, mVar.f23114c) || !Arrays.equals(this.f23112a, mVar.f23112a)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f23114c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p030d2.C4035m mo17233f(p030d2.C4035m r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.f23114c
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.f23114c
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            p161w3.C5917a.m34873f(r0)
            java.lang.String r0 = r2.f23114c
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.f23114c
        L_0x001c:
            d2.m$b[] r1 = r2.f23112a
            d2.m$b[] r3 = r3.f23112a
            java.lang.Object[] r3 = p161w3.C5953m0.m35079F0(r1, r3)
            d2.m$b[] r3 = (p030d2.C4035m.C4037b[]) r3
            d2.m r1 = new d2.m
            r1.<init>((java.lang.String) r0, (p030d2.C4035m.C4037b[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p030d2.C4035m.mo17233f(d2.m):d2.m");
    }

    public int hashCode() {
        if (this.f23113b == 0) {
            String str = this.f23114c;
            this.f23113b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f23112a);
        }
        return this.f23113b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23114c);
        parcel.writeTypedArray(this.f23112a, 0);
    }

    public C4035m(String str, List<C4037b> list) {
        this(str, false, (C4037b[]) list.toArray(new C4037b[0]));
    }

    public C4035m(C4037b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C4035m(String str, C4037b... bVarArr) {
        this(str, true, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: d2.m$b[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4035m(java.lang.String r1, boolean r2, p030d2.C4035m.C4037b... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f23114c = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            d2.m$b[] r3 = (p030d2.C4035m.C4037b[]) r3
        L_0x000e:
            r0.f23112a = r3
            int r1 = r3.length
            r0.f23115d = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030d2.C4035m.<init>(java.lang.String, boolean, d2.m$b[]):void");
    }

    C4035m(Parcel parcel) {
        this.f23114c = parcel.readString();
        C4037b[] bVarArr = (C4037b[]) C5953m0.m35138j((C4037b[]) parcel.createTypedArray(C4037b.CREATOR));
        this.f23112a = bVarArr;
        this.f23115d = bVarArr.length;
    }
}
