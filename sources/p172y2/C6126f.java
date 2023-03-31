package p172y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p161w3.C5918a0;

/* renamed from: y2.f */
/* compiled from: SpliceScheduleCommand */
public final class C6126f extends C6119b {
    public static final Parcelable.Creator<C6126f> CREATOR = new C6127a();

    /* renamed from: a */
    public final List<C6129c> f29540a;

    /* renamed from: y2.f$a */
    /* compiled from: SpliceScheduleCommand */
    class C6127a implements Parcelable.Creator<C6126f> {
        C6127a() {
        }

        /* renamed from: a */
        public C6126f createFromParcel(Parcel parcel) {
            return new C6126f(parcel, (C6127a) null);
        }

        /* renamed from: b */
        public C6126f[] newArray(int i) {
            return new C6126f[i];
        }
    }

    /* renamed from: y2.f$b */
    /* compiled from: SpliceScheduleCommand */
    public static final class C6128b {

        /* renamed from: a */
        public final int f29541a;

        /* renamed from: b */
        public final long f29542b;

        /* synthetic */ C6128b(int i, long j, C6127a aVar) {
            this(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C6128b m35785c(Parcel parcel) {
            return new C6128b(parcel.readInt(), parcel.readLong());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m35786d(Parcel parcel) {
            parcel.writeInt(this.f29541a);
            parcel.writeLong(this.f29542b);
        }

        private C6128b(int i, long j) {
            this.f29541a = i;
            this.f29542b = j;
        }
    }

    /* synthetic */ C6126f(Parcel parcel, C6127a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C6126f m35780a(C5918a0 a0Var) {
        int C = a0Var.mo20534C();
        ArrayList arrayList = new ArrayList(C);
        for (int i = 0; i < C; i++) {
            arrayList.add(C6129c.m35791e(a0Var));
        }
        return new C6126f((List<C6129c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f29540a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f29540a.get(i2).m35792f(parcel);
        }
    }

    private C6126f(List<C6129c> list) {
        this.f29540a = Collections.unmodifiableList(list);
    }

    private C6126f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C6129c.m35790d(parcel));
        }
        this.f29540a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: y2.f$c */
    /* compiled from: SpliceScheduleCommand */
    public static final class C6129c {

        /* renamed from: a */
        public final long f29543a;

        /* renamed from: b */
        public final boolean f29544b;

        /* renamed from: c */
        public final boolean f29545c;

        /* renamed from: d */
        public final boolean f29546d;

        /* renamed from: e */
        public final long f29547e;

        /* renamed from: f */
        public final List<C6128b> f29548f;

        /* renamed from: g */
        public final boolean f29549g;

        /* renamed from: h */
        public final long f29550h;

        /* renamed from: i */
        public final int f29551i;

        /* renamed from: j */
        public final int f29552j;

        /* renamed from: k */
        public final int f29553k;

        private C6129c(long j, boolean z, boolean z2, boolean z3, List<C6128b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f29543a = j;
            this.f29544b = z;
            this.f29545c = z2;
            this.f29546d = z3;
            this.f29548f = Collections.unmodifiableList(list);
            this.f29547e = j2;
            this.f29549g = z4;
            this.f29550h = j3;
            this.f29551i = i;
            this.f29552j = i2;
            this.f29553k = i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static C6129c m35790d(Parcel parcel) {
            return new C6129c(parcel);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static C6129c m35791e(C5918a0 a0Var) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long E = a0Var.mo20536E();
            boolean z5 = (a0Var.mo20534C() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int C = a0Var.mo20534C();
                boolean z6 = (C & 128) != 0;
                boolean z7 = (C & 64) != 0;
                boolean z8 = (C & 32) != 0;
                long E2 = z7 ? a0Var.mo20536E() : -9223372036854775807L;
                if (!z7) {
                    int C2 = a0Var.mo20534C();
                    ArrayList arrayList3 = new ArrayList(C2);
                    for (int i4 = 0; i4 < C2; i4++) {
                        arrayList3.add(new C6128b(a0Var.mo20534C(), a0Var.mo20536E(), (C6127a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long C3 = (long) a0Var.mo20534C();
                    boolean z9 = (128 & C3) != 0;
                    j3 = ((((C3 & 1) << 32) | a0Var.mo20536E()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int I = a0Var.mo20540I();
                int C4 = a0Var.mo20534C();
                z = z7;
                i = a0Var.mo20534C();
                j = j3;
                arrayList = arrayList2;
                long j4 = E2;
                i3 = I;
                i2 = C4;
                j2 = j4;
                boolean z10 = z6;
                z2 = z4;
                z3 = z10;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C6129c(E, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m35792f(Parcel parcel) {
            parcel.writeLong(this.f29543a);
            parcel.writeByte(this.f29544b ? (byte) 1 : 0);
            parcel.writeByte(this.f29545c ? (byte) 1 : 0);
            parcel.writeByte(this.f29546d ? (byte) 1 : 0);
            int size = this.f29548f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f29548f.get(i).m35786d(parcel);
            }
            parcel.writeLong(this.f29547e);
            parcel.writeByte(this.f29549g ? (byte) 1 : 0);
            parcel.writeLong(this.f29550h);
            parcel.writeInt(this.f29551i);
            parcel.writeInt(this.f29552j);
            parcel.writeInt(this.f29553k);
        }

        private C6129c(Parcel parcel) {
            this.f29543a = parcel.readLong();
            boolean z = false;
            this.f29544b = parcel.readByte() == 1;
            this.f29545c = parcel.readByte() == 1;
            this.f29546d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C6128b.m35785c(parcel));
            }
            this.f29548f = Collections.unmodifiableList(arrayList);
            this.f29547e = parcel.readLong();
            this.f29549g = parcel.readByte() == 1 ? true : z;
            this.f29550h = parcel.readLong();
            this.f29551i = parcel.readInt();
            this.f29552j = parcel.readInt();
            this.f29553k = parcel.readInt();
        }
    }
}
