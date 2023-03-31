package p172y2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p161w3.C5918a0;
import p161w3.C5940i0;

/* renamed from: y2.d */
/* compiled from: SpliceInsertCommand */
public final class C6121d extends C6119b {
    public static final Parcelable.Creator<C6121d> CREATOR = new C6122a();

    /* renamed from: a */
    public final long f29524a;

    /* renamed from: b */
    public final boolean f29525b;

    /* renamed from: c */
    public final boolean f29526c;

    /* renamed from: d */
    public final boolean f29527d;

    /* renamed from: e */
    public final boolean f29528e;

    /* renamed from: f */
    public final long f29529f;

    /* renamed from: g */
    public final long f29530g;

    /* renamed from: h */
    public final List<C6123b> f29531h;

    /* renamed from: i */
    public final boolean f29532i;

    /* renamed from: r */
    public final long f29533r;

    /* renamed from: s */
    public final int f29534s;

    /* renamed from: t */
    public final int f29535t;

    /* renamed from: u */
    public final int f29536u;

    /* renamed from: y2.d$a */
    /* compiled from: SpliceInsertCommand */
    class C6122a implements Parcelable.Creator<C6121d> {
        C6122a() {
        }

        /* renamed from: a */
        public C6121d createFromParcel(Parcel parcel) {
            return new C6121d(parcel, (C6122a) null);
        }

        /* renamed from: b */
        public C6121d[] newArray(int i) {
            return new C6121d[i];
        }
    }

    /* renamed from: y2.d$b */
    /* compiled from: SpliceInsertCommand */
    public static final class C6123b {

        /* renamed from: a */
        public final int f29537a;

        /* renamed from: b */
        public final long f29538b;

        /* renamed from: c */
        public final long f29539c;

        /* synthetic */ C6123b(int i, long j, long j2, C6122a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C6123b m35776a(Parcel parcel) {
            return new C6123b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void mo20967b(Parcel parcel) {
            parcel.writeInt(this.f29537a);
            parcel.writeLong(this.f29538b);
            parcel.writeLong(this.f29539c);
        }

        private C6123b(int i, long j, long j2) {
            this.f29537a = i;
            this.f29538b = j;
            this.f29539c = j2;
        }
    }

    /* synthetic */ C6121d(Parcel parcel, C6122a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    static C6121d m35773a(C5918a0 a0Var, long j, C5940i0 i0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        C5940i0 i0Var2 = i0Var;
        long E = a0Var.mo20536E();
        boolean z6 = (a0Var.mo20534C() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int C = a0Var.mo20534C();
            boolean z7 = (C & 128) != 0;
            boolean z8 = (C & 64) != 0;
            boolean z9 = (C & 32) != 0;
            boolean z10 = (C & 16) != 0;
            long b = (!z8 || z10) ? -9223372036854775807L : C6130g.m35794b(a0Var, j);
            if (!z8) {
                int C2 = a0Var.mo20534C();
                ArrayList arrayList = new ArrayList(C2);
                for (int i4 = 0; i4 < C2; i4++) {
                    int C3 = a0Var.mo20534C();
                    long b2 = !z10 ? C6130g.m35794b(a0Var, j) : -9223372036854775807L;
                    arrayList.add(new C6123b(C3, b2, i0Var2.mo20622b(b2), (C6122a) null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long C4 = (long) a0Var.mo20534C();
                boolean z11 = (128 & C4) != 0;
                j4 = ((((C4 & 1) << 32) | a0Var.mo20536E()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = a0Var.mo20540I();
            z = z8;
            i2 = a0Var.mo20534C();
            i = a0Var.mo20534C();
            list = emptyList;
            long j5 = b;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new C6121d(E, z6, z4, z, z3, j3, i0Var2.mo20622b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29524a);
        parcel.writeByte(this.f29525b ? (byte) 1 : 0);
        parcel.writeByte(this.f29526c ? (byte) 1 : 0);
        parcel.writeByte(this.f29527d ? (byte) 1 : 0);
        parcel.writeByte(this.f29528e ? (byte) 1 : 0);
        parcel.writeLong(this.f29529f);
        parcel.writeLong(this.f29530g);
        int size = this.f29531h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f29531h.get(i2).mo20967b(parcel);
        }
        parcel.writeByte(this.f29532i ? (byte) 1 : 0);
        parcel.writeLong(this.f29533r);
        parcel.writeInt(this.f29534s);
        parcel.writeInt(this.f29535t);
        parcel.writeInt(this.f29536u);
    }

    private C6121d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C6123b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f29524a = j;
        this.f29525b = z;
        this.f29526c = z2;
        this.f29527d = z3;
        this.f29528e = z4;
        this.f29529f = j2;
        this.f29530g = j3;
        this.f29531h = Collections.unmodifiableList(list);
        this.f29532i = z5;
        this.f29533r = j4;
        this.f29534s = i;
        this.f29535t = i2;
        this.f29536u = i3;
    }

    private C6121d(Parcel parcel) {
        this.f29524a = parcel.readLong();
        boolean z = false;
        this.f29525b = parcel.readByte() == 1;
        this.f29526c = parcel.readByte() == 1;
        this.f29527d = parcel.readByte() == 1;
        this.f29528e = parcel.readByte() == 1;
        this.f29529f = parcel.readLong();
        this.f29530g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C6123b.m35776a(parcel));
        }
        this.f29531h = Collections.unmodifiableList(arrayList);
        this.f29532i = parcel.readByte() == 1 ? true : z;
        this.f29533r = parcel.readLong();
        this.f29534s = parcel.readInt();
        this.f29535t = parcel.readInt();
        this.f29536u = parcel.readInt();
    }
}
