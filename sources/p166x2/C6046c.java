package p166x2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p127r2.C5432a;
import p127r2.C5435b;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6214e2;
import p177z1.C6272r1;
import p182a7.C6425j;

/* renamed from: x2.c */
/* compiled from: SlowMotionData */
public final class C6046c implements C5432a.C5434b {
    public static final Parcelable.Creator<C6046c> CREATOR = new C6047a();

    /* renamed from: a */
    public final List<C6048b> f29318a;

    /* renamed from: x2.c$a */
    /* compiled from: SlowMotionData */
    class C6047a implements Parcelable.Creator<C6046c> {
        C6047a() {
        }

        /* renamed from: a */
        public C6046c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C6048b.class.getClassLoader());
            return new C6046c(arrayList);
        }

        /* renamed from: b */
        public C6046c[] newArray(int i) {
            return new C6046c[i];
        }
    }

    /* renamed from: x2.c$b */
    /* compiled from: SlowMotionData */
    public static final class C6048b implements Parcelable {
        public static final Parcelable.Creator<C6048b> CREATOR = new C6049a();

        /* renamed from: d */
        public static final Comparator<C6048b> f29319d = C12960d.f47205a;

        /* renamed from: a */
        public final long f29320a;

        /* renamed from: b */
        public final long f29321b;

        /* renamed from: c */
        public final int f29322c;

        /* renamed from: x2.c$b$a */
        /* compiled from: SlowMotionData */
        class C6049a implements Parcelable.Creator<C6048b> {
            C6049a() {
            }

            /* renamed from: a */
            public C6048b createFromParcel(Parcel parcel) {
                return new C6048b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b */
            public C6048b[] newArray(int i) {
                return new C6048b[i];
            }
        }

        public C6048b(long j, long j2, int i) {
            C5917a.m34868a(j < j2);
            this.f29320a = j;
            this.f29321b = j2;
            this.f29322c = i;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6048b.class != obj.getClass()) {
                return false;
            }
            C6048b bVar = (C6048b) obj;
            if (this.f29320a == bVar.f29320a && this.f29321b == bVar.f29321b && this.f29322c == bVar.f29322c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6425j.m37542b(Long.valueOf(this.f29320a), Long.valueOf(this.f29321b), Integer.valueOf(this.f29322c));
        }

        public String toString() {
            return C5953m0.m35072C("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f29320a), Long.valueOf(this.f29321b), Integer.valueOf(this.f29322c));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f29320a);
            parcel.writeLong(this.f29321b);
            parcel.writeInt(this.f29322c);
        }
    }

    public C6046c(List<C6048b> list) {
        this.f29318a = list;
        C5917a.m34868a(!m35480a(list));
    }

    /* renamed from: a */
    private static boolean m35480a(List<C6048b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f29321b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f29320a < j) {
                return true;
            }
            j = list.get(i).f29321b;
        }
        return false;
    }

    /* renamed from: J0 */
    public /* synthetic */ void mo17874J0(C6214e2.C6216b bVar) {
        C5435b.m33284c(this, bVar);
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
        if (obj == null || C6046c.class != obj.getClass()) {
            return false;
        }
        return this.f29318a.equals(((C6046c) obj).f29318a);
    }

    public int hashCode() {
        return this.f29318a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f29318a;
    }

    /* renamed from: u1 */
    public /* synthetic */ byte[] mo17880u1() {
        return C5435b.m33282a(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f29318a);
    }
}
