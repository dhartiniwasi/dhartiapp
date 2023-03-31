package p172y2;

import android.os.Parcel;
import android.os.Parcelable;
import p161w3.C5918a0;
import p161w3.C5940i0;

/* renamed from: y2.g */
/* compiled from: TimeSignalCommand */
public final class C6130g extends C6119b {
    public static final Parcelable.Creator<C6130g> CREATOR = new C6131a();

    /* renamed from: a */
    public final long f29554a;

    /* renamed from: b */
    public final long f29555b;

    /* renamed from: y2.g$a */
    /* compiled from: TimeSignalCommand */
    class C6131a implements Parcelable.Creator<C6130g> {
        C6131a() {
        }

        /* renamed from: a */
        public C6130g createFromParcel(Parcel parcel) {
            return new C6130g(parcel.readLong(), parcel.readLong(), (C6131a) null);
        }

        /* renamed from: b */
        public C6130g[] newArray(int i) {
            return new C6130g[i];
        }
    }

    /* synthetic */ C6130g(long j, long j2, C6131a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    static C6130g m35793a(C5918a0 a0Var, long j, C5940i0 i0Var) {
        long b = m35794b(a0Var, j);
        return new C6130g(b, i0Var.mo20622b(b));
    }

    /* renamed from: b */
    static long m35794b(C5918a0 a0Var, long j) {
        long C = (long) a0Var.mo20534C();
        if ((128 & C) != 0) {
            return 8589934591L & ((((C & 1) << 32) | a0Var.mo20536E()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f29554a);
        parcel.writeLong(this.f29555b);
    }

    private C6130g(long j, long j2) {
        this.f29554a = j;
        this.f29555b = j2;
    }
}
